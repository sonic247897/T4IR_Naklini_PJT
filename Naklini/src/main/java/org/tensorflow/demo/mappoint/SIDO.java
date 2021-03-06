package org.tensorflow.demo.mappoint;

import android.os.Parcel;
import android.os.Parcelable;

public class SIDO implements Parcelable {
    int _id;
    String SIDO;

    public SIDO(int _id, String SIDO) {
        this._id = _id;
        this.SIDO = SIDO;
    }

    protected SIDO(Parcel in) {
        _id = in.readInt();
        SIDO = in.readString();
    }


    public static final Creator<SIDO> CREATOR = new Creator<SIDO>() {
        @Override
        public SIDO createFromParcel(Parcel in) {
            return new SIDO(in);
        }

        @Override
        public SIDO[] newArray(int size) {
            return new SIDO[size];
        }
    };

    @Override
    public String toString() {
        return "SIDO{" +
                "_id=" + _id +
                ", SIDO='" + SIDO + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(_id);
        dest.writeString(SIDO);
    }
}

package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes16.dex */
public final class zzac implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        CameraPosition cameraPosition = null;
        Float floatObject = null;
        Float floatObject2 = null;
        LatLngBounds latLngBounds = null;
        Integer integerObject = null;
        String strCreateString = null;
        byte b4 = -1;
        byte b5 = -1;
        byte b7 = -1;
        byte b13 = -1;
        byte b15 = -1;
        byte b17 = -1;
        byte b40 = -1;
        byte b61 = -1;
        byte b64 = -1;
        byte b69 = -1;
        byte b76 = -1;
        byte b86 = -1;
        int i = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    b4 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 3:
                    b5 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 4:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.createParcelable(parcel, header, CameraPosition.CREATOR);
                    break;
                case 6:
                    b7 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 7:
                    b13 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 8:
                    b15 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 9:
                    b17 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 10:
                    b40 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 11:
                    b61 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 12:
                    b64 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 13:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 14:
                    b69 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 15:
                    b76 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 16:
                    floatObject = SafeParcelReader.readFloatObject(parcel, header);
                    break;
                case 17:
                    floatObject2 = SafeParcelReader.readFloatObject(parcel, header);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.createParcelable(parcel, header, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b86 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 20:
                    integerObject = SafeParcelReader.readIntegerObject(parcel, header);
                    break;
                case 21:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new GoogleMapOptions(b4, b5, i, cameraPosition, b7, b13, b15, b17, b40, b61, b64, b69, b76, floatObject, floatObject2, latLngBounds, b86, integerObject, strCreateString);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}

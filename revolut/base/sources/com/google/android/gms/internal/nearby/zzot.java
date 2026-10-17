package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes16.dex */
public final class zzot implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        byte[] bArrCreateByteArray = null;
        byte[] bArrCreateByteArray2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        int i6 = 0;
        int i21 = 0;
        long j2 = 0;
        long j3 = 0;
        long j5 = 0;
        long j16 = 0;
        float f = 0.0f;
        float f4 = 0.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    i6 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 7:
                    j3 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 8:
                    f = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 9:
                    f4 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 10:
                    j5 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 11:
                    j16 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    i21 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 14:
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzos(i, i2, i3, i5, i6, j2, j3, f, f4, j5, j16, i21, bArrCreateByteArray, bArrCreateByteArray2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzos[i];
    }
}

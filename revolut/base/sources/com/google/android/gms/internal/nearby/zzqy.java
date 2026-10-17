package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes16.dex */
public final class zzqy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        int i6 = 0;
        int i21 = 0;
        boolean z = false;
        byte[] bArrCreateByteArray = null;
        zzsc zzscVar = null;
        zztf[] zztfVarArr = null;
        byte[] bArrCreateByteArray2 = null;
        zztf zztfVar = null;
        zzql zzqlVar = null;
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
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 4:
                    zzscVar = (zzsc) SafeParcelReader.createParcelable(parcel, header, zzsc.CREATOR);
                    break;
                case 5:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    zztfVarArr = (zztf[]) SafeParcelReader.createTypedArray(parcel, header, zztf.CREATOR);
                    break;
                case 7:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 9:
                    zztfVar = (zztf) SafeParcelReader.createParcelable(parcel, header, zztf.CREATOR);
                    break;
                case 10:
                    zzqlVar = (zzql) SafeParcelReader.createParcelable(parcel, header, zzql.CREATOR);
                    break;
                case 11:
                    i6 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 12:
                    i21 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzqx(i, i2, bArrCreateByteArray, zzscVar, i3, zztfVarArr, i5, bArrCreateByteArray2, zztfVar, zzqlVar, i6, i21, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzqx[i];
    }
}

package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes16.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z6 = true;
        boolean z11 = true;
        boolean z12 = true;
        boolean z29 = true;
        boolean z31 = true;
        boolean z41 = true;
        boolean z49 = true;
        boolean z54 = true;
        boolean z74 = true;
        boolean z83 = true;
        boolean z89 = false;
        boolean z96 = false;
        boolean z100 = false;
        boolean z101 = false;
        int i = 0;
        int i2 = 0;
        boolean z102 = false;
        boolean z103 = false;
        int i3 = 0;
        int i5 = 0;
        boolean z104 = false;
        Strategy strategy = null;
        byte[] bArrCreateByteArray = null;
        ParcelUuid parcelUuid = null;
        byte[] bArrCreateByteArray2 = null;
        zzab[] zzabVarArr = null;
        int[] iArrCreateIntArray = null;
        int[] iArrCreateIntArray2 = null;
        byte[] bArrCreateByteArray3 = null;
        long j2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strategy = (Strategy) SafeParcelReader.createParcelable(parcel, header, Strategy.CREATOR);
                    break;
                case 2:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 7:
                    z89 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 8:
                    parcelUuid = (ParcelUuid) SafeParcelReader.createParcelable(parcel, header, ParcelUuid.CREATOR);
                    break;
                case 9:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    z29 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 12:
                    z96 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 13:
                    z100 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 14:
                    z101 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 15:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 16:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 17:
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 18:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 19:
                    zzabVarArr = (zzab[]) SafeParcelReader.createTypedArray(parcel, header, zzab.CREATOR);
                    break;
                case 20:
                    z102 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 21:
                    z31 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 22:
                    z103 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 23:
                    z41 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 24:
                    iArrCreateIntArray = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 25:
                    iArrCreateIntArray2 = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 26:
                    z49 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 27:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 28:
                    bArrCreateByteArray3 = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 29:
                    z54 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 30:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 31:
                    z104 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 32:
                    z74 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 33:
                    z83 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new AdvertisingOptions(strategy, z, z3, z4, z6, bArrCreateByteArray, z89, parcelUuid, z11, z12, z29, z96, z100, z101, i, i2, bArrCreateByteArray2, j2, zzabVarArr, z102, z31, z103, z41, iArrCreateIntArray, iArrCreateIntArray2, z49, i3, bArrCreateByteArray3, z54, i5, z104, z74, z83);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdvertisingOptions[i];
    }
}

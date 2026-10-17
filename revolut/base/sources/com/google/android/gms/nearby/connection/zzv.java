package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes16.dex */
public final class zzv implements Parcelable.Creator {
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
        boolean z41 = false;
        boolean z49 = false;
        boolean z54 = false;
        int i = 0;
        int i2 = 0;
        boolean z74 = false;
        Strategy strategy = null;
        ParcelUuid parcelUuid = null;
        byte[] bArrCreateByteArray = null;
        int[] iArrCreateIntArray = null;
        long j2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strategy = (Strategy) SafeParcelReader.createParcelable(parcel, header, Strategy.CREATOR);
                    break;
                case 2:
                    z41 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    z49 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    parcelUuid = (ParcelUuid) SafeParcelReader.createParcelable(parcel, header, ParcelUuid.CREATOR);
                    break;
                case 7:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 8:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    z54 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 12:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 14:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 15:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 16:
                    iArrCreateIntArray = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 17:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 18:
                    z74 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 19:
                    z29 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 20:
                    z31 = SafeParcelReader.readBoolean(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new DiscoveryOptions(strategy, z41, z, z3, z49, parcelUuid, z4, z6, z11, z54, i, i2, bArrCreateByteArray, j2, iArrCreateIntArray, z12, z74, z29, z31);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DiscoveryOptions[i];
    }
}

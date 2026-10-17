package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes16.dex */
public final class zzqo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        int i = 0;
        int i2 = 0;
        boolean z6 = false;
        boolean z11 = false;
        int[] iArrCreateIntArray = null;
        int[] iArrCreateIntArray2 = null;
        int[] iArrCreateIntArray3 = null;
        int[] iArrCreateIntArray4 = null;
        int[] iArrCreateIntArray5 = null;
        float f = 0.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 2:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    iArrCreateIntArray = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 7:
                    iArrCreateIntArray2 = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 8:
                    f = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 9:
                    iArrCreateIntArray3 = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 10:
                    iArrCreateIntArray4 = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 11:
                    iArrCreateIntArray5 = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 12:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 13:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzqn(z, z3, z4, i, i2, iArrCreateIntArray, iArrCreateIntArray2, f, iArrCreateIntArray3, iArrCreateIntArray4, iArrCreateIntArray5, z6, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzqn[i];
    }
}

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes16.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        boolean z = false;
        int i6 = 0;
        int i21 = 0;
        int i22 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1000) {
                switch (fieldId) {
                    case 1:
                        i2 = SafeParcelReader.readInt(parcel, header);
                        break;
                    case 2:
                        i3 = SafeParcelReader.readInt(parcel, header);
                        break;
                    case 3:
                        i5 = SafeParcelReader.readInt(parcel, header);
                        break;
                    case 4:
                        z = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 5:
                        i6 = SafeParcelReader.readInt(parcel, header);
                        break;
                    case 6:
                        i21 = SafeParcelReader.readInt(parcel, header);
                        break;
                    case 7:
                        i22 = SafeParcelReader.readInt(parcel, header);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, header);
                        break;
                }
            } else {
                i = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new Strategy(i, i2, i3, i5, z, i6, i21, i22);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Strategy[i];
    }
}

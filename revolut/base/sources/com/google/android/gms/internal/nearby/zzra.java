package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes16.dex */
public final class zzra implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzqt zzqtVar = null;
        zzqt zzqtVar2 = null;
        zzqt zzqtVar3 = null;
        zzos zzosVar = null;
        int i = -128;
        long j2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    zzqtVar = (zzqt) SafeParcelReader.createParcelable(parcel, header, zzqt.CREATOR);
                    break;
                case 2:
                    zzqtVar2 = (zzqt) SafeParcelReader.createParcelable(parcel, header, zzqt.CREATOR);
                    break;
                case 3:
                    zzqtVar3 = (zzqt) SafeParcelReader.createParcelable(parcel, header, zzqt.CREATOR);
                    break;
                case 4:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 5:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    zzosVar = (zzos) SafeParcelReader.createParcelable(parcel, header, zzos.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzqz(zzqtVar, zzqtVar2, zzqtVar3, j2, i, zzosVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzqz[i];
    }
}

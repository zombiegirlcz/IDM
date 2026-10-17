package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes16.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f32 = 0.0f;
        float f35 = 0.0f;
        float f36 = 0.0f;
        float f37 = Float.MAX_VALUE;
        float f41 = Float.MAX_VALUE;
        float f42 = Float.MAX_VALUE;
        zzn[] zznVarArr = null;
        zzd[] zzdVarArr = null;
        float f57 = -1.0f;
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
                    f = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 4:
                    f4 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 5:
                    f5 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 6:
                    f6 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    f37 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    f41 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 9:
                    zznVarArr = (zzn[]) SafeParcelReader.createTypedArray(parcel, header, zzn.CREATOR);
                    break;
                case 10:
                    f32 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 11:
                    f35 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 12:
                    f36 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 13:
                    zzdVarArr = (zzd[]) SafeParcelReader.createTypedArray(parcel, header, zzd.CREATOR);
                    break;
                case 14:
                    f42 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 15:
                    f57 = SafeParcelReader.readFloat(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzf(i, i2, f, f4, f5, f6, f37, f41, f42, zznVarArr, f32, f35, f36, zzdVarArr, f57);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzf[i];
    }
}

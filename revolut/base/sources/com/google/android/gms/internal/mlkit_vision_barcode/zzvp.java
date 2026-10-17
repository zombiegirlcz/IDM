package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes16.dex */
public final class zzvp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzve zzveVar = null;
        String strCreateString = null;
        String strCreateString2 = null;
        zzvf[] zzvfVarArr = null;
        zzvc[] zzvcVarArr = null;
        String[] strArrCreateStringArray = null;
        zzux[] zzuxVarArr = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    zzveVar = (zzve) SafeParcelReader.createParcelable(parcel, header, zzve.CREATOR);
                    break;
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    zzvfVarArr = (zzvf[]) SafeParcelReader.createTypedArray(parcel, header, zzvf.CREATOR);
                    break;
                case 5:
                    zzvcVarArr = (zzvc[]) SafeParcelReader.createTypedArray(parcel, header, zzvc.CREATOR);
                    break;
                case 6:
                    strArrCreateStringArray = SafeParcelReader.createStringArray(parcel, header);
                    break;
                case 7:
                    zzuxVarArr = (zzux[]) SafeParcelReader.createTypedArray(parcel, header, zzux.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzva(zzveVar, strCreateString, strCreateString2, zzvfVarArr, zzvcVarArr, strArrCreateStringArray, zzuxVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzva[i];
    }
}

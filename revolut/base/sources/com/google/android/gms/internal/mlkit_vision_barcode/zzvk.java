package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes16.dex */
public final class zzvk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        byte[] bArrCreateByteArray = null;
        Point[] pointArr = null;
        zzvc zzvcVar = null;
        zzvf zzvfVar = null;
        zzvg zzvgVar = null;
        zzvi zzviVar = null;
        zzvh zzvhVar = null;
        zzvd zzvdVar = null;
        zzuz zzuzVar = null;
        zzva zzvaVar = null;
        zzvb zzvbVar = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 5:
                    pointArr = (Point[]) SafeParcelReader.createTypedArray(parcel, header, Point.CREATOR);
                    break;
                case 6:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    zzvcVar = (zzvc) SafeParcelReader.createParcelable(parcel, header, zzvc.CREATOR);
                    break;
                case 8:
                    zzvfVar = (zzvf) SafeParcelReader.createParcelable(parcel, header, zzvf.CREATOR);
                    break;
                case 9:
                    zzvgVar = (zzvg) SafeParcelReader.createParcelable(parcel, header, zzvg.CREATOR);
                    break;
                case 10:
                    zzviVar = (zzvi) SafeParcelReader.createParcelable(parcel, header, zzvi.CREATOR);
                    break;
                case 11:
                    zzvhVar = (zzvh) SafeParcelReader.createParcelable(parcel, header, zzvh.CREATOR);
                    break;
                case 12:
                    zzvdVar = (zzvd) SafeParcelReader.createParcelable(parcel, header, zzvd.CREATOR);
                    break;
                case 13:
                    zzuzVar = (zzuz) SafeParcelReader.createParcelable(parcel, header, zzuz.CREATOR);
                    break;
                case 14:
                    zzvaVar = (zzva) SafeParcelReader.createParcelable(parcel, header, zzva.CREATOR);
                    break;
                case 15:
                    zzvbVar = (zzvb) SafeParcelReader.createParcelable(parcel, header, zzvb.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzvj(i, strCreateString, strCreateString2, bArrCreateByteArray, pointArr, i2, zzvcVar, zzvfVar, zzvgVar, zzviVar, zzvhVar, zzvdVar, zzuzVar, zzvaVar, zzvbVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzvj[i];
    }
}

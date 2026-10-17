package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class zzd implements Parcelable.Creator {
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
        boolean z3 = false;
        boolean z4 = false;
        boolean z6 = false;
        int i22 = 0;
        boolean z11 = false;
        int i32 = 0;
        boolean z12 = false;
        int i33 = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        byte[] bArrCreateByteArray = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        TokenStatus tokenStatus = null;
        String strCreateString5 = null;
        Uri uri2 = null;
        zzaj zzajVar = null;
        String strCreateString6 = null;
        zzaz zzazVar = null;
        String strCreateString7 = null;
        byte[] bArrCreateByteArray2 = null;
        zzah zzahVar = null;
        zzaf zzafVar = null;
        String strCreateString8 = null;
        zzan[] zzanVarArr = null;
        ArrayList arrayListCreateTypedList = null;
        String strCreateString9 = null;
        String strCreateString10 = null;
        zze zzeVar = null;
        String strCreateString11 = null;
        String strCreateString12 = null;
        long j2 = 0;
        long j3 = 0;
        long j5 = 0;
        long j16 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 4:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    tokenStatus = (TokenStatus) SafeParcelReader.createParcelable(parcel, header, TokenStatus.CREATOR);
                    break;
                case 8:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    uri2 = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
                    break;
                case 10:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 11:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 12:
                    zzajVar = (zzaj) SafeParcelReader.createParcelable(parcel, header, zzaj.CREATOR);
                    break;
                case 13:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 14:
                case 19:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 15:
                    zzazVar = (zzaz) SafeParcelReader.createParcelable(parcel, header, zzaz.CREATOR);
                    break;
                case 16:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 17:
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 18:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 20:
                    i6 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 21:
                    i21 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 22:
                    zzahVar = (zzah) SafeParcelReader.createParcelable(parcel, header, zzah.CREATOR);
                    break;
                case 23:
                    zzafVar = (zzaf) SafeParcelReader.createParcelable(parcel, header, zzaf.CREATOR);
                    break;
                case 24:
                    strCreateString8 = SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    zzanVarArr = (zzan[]) SafeParcelReader.createTypedArray(parcel, header, zzan.CREATOR);
                    break;
                case 26:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 27:
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, zzb.CREATOR);
                    break;
                case 28:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 29:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 30:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 31:
                    j3 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 32:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 33:
                    j5 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 34:
                    strCreateString9 = SafeParcelReader.createString(parcel, header);
                    break;
                case 35:
                    strCreateString10 = SafeParcelReader.createString(parcel, header);
                    break;
                case 36:
                    zzeVar = (zze) SafeParcelReader.createParcelable(parcel, header, zze.CREATOR);
                    break;
                case 37:
                    i22 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 38:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 39:
                    strCreateString11 = SafeParcelReader.createString(parcel, header);
                    break;
                case 40:
                    i32 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 41:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 42:
                    j16 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 43:
                    strCreateString12 = SafeParcelReader.createString(parcel, header);
                    break;
                case 44:
                    i33 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 45:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new CardInfo(strCreateString, strCreateString2, bArrCreateByteArray, strCreateString3, strCreateString4, i, tokenStatus, strCreateString5, uri2, i2, i3, zzajVar, strCreateString6, zzazVar, strCreateString7, bArrCreateByteArray2, i5, i6, i21, zzahVar, zzafVar, strCreateString8, zzanVarArr, z, arrayListCreateTypedList, z3, z4, j2, j3, z6, j5, strCreateString9, strCreateString10, zzeVar, i22, z11, strCreateString11, i32, z12, j16, strCreateString12, i33);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CardInfo[i];
    }
}

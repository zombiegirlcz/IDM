package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        int i = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i2 = 0;
        int i3 = 0;
        long j2 = 0;
        long j3 = 0;
        long j5 = 0;
        long j16 = 0;
        long j22 = 0;
        long j42 = 0;
        long j46 = 0;
        String strCreateString = "";
        String strCreateString2 = strCreateString;
        String strCreateString3 = strCreateString2;
        String strCreateString4 = strCreateString3;
        String strCreateString5 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        String strCreateString8 = null;
        String strCreateString9 = null;
        String strCreateString10 = null;
        String strCreateString11 = null;
        Boolean booleanObject = null;
        ArrayList<String> arrayListCreateStringList = null;
        String strCreateString12 = null;
        String strCreateString13 = null;
        String strCreateString14 = null;
        int i5 = 100;
        boolean z6 = true;
        boolean z11 = true;
        long j47 = -2147483648L;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString8 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 7:
                    j3 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 8:
                    strCreateString9 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    j47 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    strCreateString10 = SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                case 17:
                case 20:
                case 33:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 14:
                    j5 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 15:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 16:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 18:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 19:
                    strCreateString11 = SafeParcelReader.createString(parcel, header);
                    break;
                case 21:
                    booleanObject = SafeParcelReader.readBooleanObject(parcel, header);
                    break;
                case 22:
                    j16 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 23:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 24:
                    strCreateString12 = SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 26:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 27:
                    strCreateString13 = SafeParcelReader.createString(parcel, header);
                    break;
                case 28:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 29:
                    j22 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 30:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 31:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 32:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 34:
                    j42 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 35:
                    strCreateString14 = SafeParcelReader.createString(parcel, header);
                    break;
                case 36:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 37:
                    j46 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 38:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzr(strCreateString5, strCreateString6, strCreateString7, strCreateString8, j2, j3, strCreateString9, z6, z, j47, strCreateString10, j5, i, z11, z3, strCreateString11, booleanObject, j16, arrayListCreateStringList, strCreateString12, strCreateString, strCreateString2, strCreateString13, z4, j22, i5, strCreateString3, i2, j42, strCreateString14, strCreateString4, j46, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}

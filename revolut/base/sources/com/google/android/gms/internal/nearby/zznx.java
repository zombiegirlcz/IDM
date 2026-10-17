package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class zznx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzoe zzoeVar = null;
        zznu zznuVar = null;
        byte[] bArrCreateByteArray = null;
        ArrayList arrayListCreateTypedList = null;
        ArrayList arrayListCreateTypedList2 = null;
        ArrayList arrayListCreateTypedList3 = null;
        zzog zzogVar = null;
        zzny zznyVar = null;
        boolean z = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    zzoeVar = (zzoe) SafeParcelReader.createParcelable(parcel, header, zzoe.CREATOR);
                    break;
                case 2:
                    zznuVar = (zznu) SafeParcelReader.createParcelable(parcel, header, zznu.CREATOR);
                    break;
                case 3:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 4:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.nearby.connection.zzg.CREATOR);
                    break;
                case 6:
                    arrayListCreateTypedList2 = SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.nearby.connection.zzad.CREATOR);
                    break;
                case 7:
                    arrayListCreateTypedList3 = SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.nearby.connection.zzi.CREATOR);
                    break;
                case 8:
                    zzogVar = (zzog) SafeParcelReader.createParcelable(parcel, header, zzog.CREATOR);
                    break;
                case 9:
                    zznyVar = (zzny) SafeParcelReader.createParcelable(parcel, header, zzny.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zznw(zzoeVar, zznuVar, bArrCreateByteArray, z, arrayListCreateTypedList, arrayListCreateTypedList2, arrayListCreateTypedList3, zzogVar, zznyVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zznw[i];
    }
}

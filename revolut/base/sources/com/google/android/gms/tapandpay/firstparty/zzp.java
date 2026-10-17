package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "GetAllCardsResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final CardInfo[] f48567zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final AccountInfo f48568zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final String f48569zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    final String f48570zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    final SparseArray f48571zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    final byte[] f48572zzf;

    @SafeParcelable.Constructor
    public zzp(@SafeParcelable.Param(id = 2) CardInfo[] cardInfoArr, @SafeParcelable.Param(id = 3) AccountInfo accountInfo, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) SparseArray sparseArray, @SafeParcelable.Param(id = 7) byte[] bArr) {
        this.f48567zza = cardInfoArr;
        this.f48568zzb = accountInfo;
        this.f48569zzc = str;
        this.f48570zzd = str2;
        this.f48571zze = sparseArray;
        this.f48572zzf = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f48567zza, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48568zzb, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48569zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48570zzd, false);
        SafeParcelWriter.writeStringSparseArray(parcel, 6, this.f48571zze, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.f48572zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}

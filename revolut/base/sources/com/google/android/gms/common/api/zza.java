package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
final class zza implements Parcelable.Creator {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zza f37964zzb = new zza(new zzb());

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Parcelable.Creator f37965zza;

    private zza(Parcelable.Creator creator) {
        this.f37965zza = creator;
    }

    public static zza zza() {
        return f37964zzb;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return zzb.zza(parcel);
        }
        parcel.setDataPosition(iDataPosition - 4);
        return ApiMetadata.getEmptyInstance();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ApiMetadata[i];
    }
}

package com.google.android.gms.measurement.internal;

import a0.d;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    public final String f47046zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @NonNull
    public final String f47047zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public final long f47048zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @NonNull
    public final Bundle f47049zzd;

    public zzhf(@NonNull String str, @NonNull String str2, Bundle bundle, long j2) {
        this.f47046zza = str;
        this.f47047zzb = str2;
        this.f47049zzd = bundle;
        this.f47048zzc = j2;
    }

    public static zzhf zzb(zzbh zzbhVar) {
        return new zzhf(zzbhVar.f46951zza, zzbhVar.f46953zzc, zzbhVar.f46952zzb.zzc(), zzbhVar.f46954zzd);
    }

    public final String toString() {
        String string = this.f47049zzd.toString();
        StringBuilder sb6 = new StringBuilder("origin=");
        sb6.append(this.f47047zzb);
        sb6.append(",name=");
        return d.u(sb6, this.f47046zza, ",params=", string);
    }

    public final zzbh zza() {
        return new zzbh(this.f47046zza, new zzbf(new Bundle(this.f47049zzd)), this.f47047zzb, this.f47048zzc);
    }
}

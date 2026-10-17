package com.google.android.gms.internal.auth;

import android.net.Uri;

/* JADX INFO: loaded from: classes16.dex */
public final class zzcz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Uri f38964zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final String f38965zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final String f38966zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final boolean f38967zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final boolean f38968zze;

    private zzcz(String str, Uri uri2, String str2, String str3, boolean z, boolean z3, boolean z4, boolean z6, zzdg zzdgVar) {
        this.f38964zza = uri2;
        this.f38965zzb = "";
        this.f38966zzc = "";
        this.f38967zzd = z;
        this.f38968zze = z4;
    }

    public final zzcz zza() {
        return new zzcz(null, this.f38964zza, this.f38965zzb, this.f38966zzc, this.f38967zzd, false, true, false, null);
    }

    public final zzcz zzb() {
        if (this.f38965zzb.isEmpty()) {
            return new zzcz(null, this.f38964zza, this.f38965zzb, this.f38966zzc, true, false, this.f38968zze, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzdc zzc(String str, double d) {
        return new zzcx(this, str, Double.valueOf(0.0d), true);
    }

    public final zzdc zzd(String str, long j2) {
        return new zzcv(this, str, Long.valueOf(j2), true);
    }

    public final zzdc zze(String str, boolean z) {
        return new zzcw(this, str, Boolean.valueOf(z), true);
    }

    public final zzdc zzf(String str, Object obj2, zzhy zzhyVar) {
        return new zzcy(this, "getTokenRefactor__blocked_packages", obj2, true, zzhyVar);
    }

    public zzcz(Uri uri2) {
        this(null, uri2, "", "", false, false, false, false, null);
    }
}

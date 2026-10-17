package com.google.android.gms.common;

/* JADX INFO: loaded from: classes16.dex */
final class zzv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private String f38385zza = null;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private Boolean f38386zzb = null;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Boolean f38387zzc = null;

    private zzv() {
    }

    public final zzv zza(String str) {
        this.f38385zza = str;
        return this;
    }

    public final zzv zzb(boolean z) {
        this.f38386zzb = Boolean.valueOf(z);
        return this;
    }

    public final zzv zzc(boolean z) {
        this.f38387zzc = Boolean.valueOf(z);
        return this;
    }

    public final zzw zzd() {
        Boolean bool = this.f38386zzb;
        if (bool == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        }
        if (this.f38387zzc != null) {
            return new zzw(this.f38385zza, bool.booleanValue(), false, false, this.f38387zzc.booleanValue(), false, null);
        }
        throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
    }

    public /* synthetic */ zzv(byte[] bArr) {
    }
}

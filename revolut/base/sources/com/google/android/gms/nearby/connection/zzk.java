package com.google.android.gms.nearby.connection;

/* JADX INFO: loaded from: classes16.dex */
public final class zzk {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private String f47868zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private String f47869zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private byte[] f47870zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private boolean f47871zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private boolean f47872zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private byte[] f47873zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private int f47874zzg = 0;

    public final zzk zza(int i) {
        this.f47874zzg = i;
        return this;
    }

    @Deprecated
    public final zzk zzb(String str) {
        this.f47869zzb = str;
        return this;
    }

    public final zzk zzc(byte[] bArr) {
        this.f47873zzf = bArr;
        return this;
    }

    public final zzk zzd(String str) {
        this.f47868zza = str;
        return this;
    }

    @Deprecated
    public final zzk zze(boolean z) {
        this.f47872zze = z;
        return this;
    }

    public final zzk zzf(boolean z) {
        this.f47871zzd = z;
        return this;
    }

    public final zzk zzg(byte[] bArr) {
        this.f47870zzc = bArr;
        return this;
    }

    public final ConnectionInfo zzh() {
        return new ConnectionInfo(this.f47868zza, this.f47869zzb, this.f47870zzc, this.f47871zzd, this.f47872zze, this.f47873zzf, this.f47874zzg);
    }
}

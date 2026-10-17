package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes16.dex */
final class zzeh extends zzej {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final byte[] f39013zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f39014zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f39015zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f39016zze;

    public /* synthetic */ zzeh(byte[] bArr, int i, int i2, boolean z, zzeg zzegVar) {
        super(null);
        this.f39016zze = Integer.MAX_VALUE;
        this.f39013zzb = bArr;
        this.f39014zzc = 0;
    }

    public final int zza(int i) throws zzfb {
        int i2 = this.f39016zze;
        this.f39016zze = 0;
        int i3 = this.f39014zzc + this.f39015zzd;
        this.f39014zzc = i3;
        if (i3 <= 0) {
            this.f39015zzd = 0;
            return i2;
        }
        this.f39015zzd = i3;
        this.f39014zzc = 0;
        return i2;
    }
}

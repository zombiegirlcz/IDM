package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes16.dex */
final class zzgz extends zzhb {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final byte[] f39503zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f39504zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f39505zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f39506zze;

    public /* synthetic */ zzgz(byte[] bArr, int i, int i2, boolean z, zzgy zzgyVar) {
        super(null);
        this.f39506zze = Integer.MAX_VALUE;
        this.f39503zzb = bArr;
        this.f39504zzc = 0;
    }

    public final int zza(int i) throws zzhd {
        int i2 = this.f39506zze;
        this.f39506zze = 0;
        int i3 = this.f39504zzc + this.f39505zzd;
        this.f39504zzc = i3;
        if (i3 <= 0) {
            this.f39505zzd = 0;
            return i2;
        }
        this.f39505zzd = i3;
        this.f39504zzc = 0;
        return i2;
    }
}

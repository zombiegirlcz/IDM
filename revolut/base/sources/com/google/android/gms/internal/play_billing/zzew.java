package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
final class zzew extends zzey {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f45976zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f45977zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f45978zzd;

    public /* synthetic */ zzew(byte[] bArr, int i, int i2, boolean z, zzex zzexVar) {
        super(null);
        this.f45978zzd = Integer.MAX_VALUE;
        this.f45976zzb = 0;
    }

    public final int zza(int i) throws zzgc {
        int i2 = this.f45978zzd;
        this.f45978zzd = 0;
        int i3 = this.f45976zzb + this.f45977zzc;
        this.f45976zzb = i3;
        if (i3 <= 0) {
            this.f45977zzc = 0;
            return i2;
        }
        this.f45977zzc = i3;
        this.f45976zzb = 0;
        return i2;
    }
}

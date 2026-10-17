package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
final class zzle extends zzlg {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f40410zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f40411zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40412zzd;

    public /* synthetic */ zzle(byte[] bArr, int i, int i2, boolean z, zzlf zzlfVar) {
        super(null);
        this.f40412zzd = Integer.MAX_VALUE;
        this.f40410zzb = 0;
    }

    public final int zza(int i) throws zzmm {
        int i2 = this.f40412zzd;
        this.f40412zzd = 0;
        int i3 = this.f40410zzb + this.f40411zzc;
        this.f40410zzb = i3;
        if (i3 <= 0) {
            this.f40411zzc = 0;
            return i2;
        }
        this.f40411zzc = i3;
        this.f40410zzb = 0;
        return i2;
    }
}

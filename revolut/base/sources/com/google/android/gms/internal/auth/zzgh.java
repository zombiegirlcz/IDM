package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes16.dex */
final class zzgh implements zzfu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzfx f39093zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f39094zzb = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Object[] f39095zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final int f39096zzd;

    public zzgh(zzfx zzfxVar, String str, Object[] objArr) {
        this.f39093zza = zzfxVar;
        this.f39095zzc = objArr;
        char cCharAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (cCharAt < 55296) {
            this.f39096zzd = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i5 = i2 + 1;
            char cCharAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i2);
            if (cCharAt2 < 55296) {
                this.f39096zzd = (cCharAt2 << i3) | i;
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i5;
            }
        }
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final zzfx zza() {
        return this.f39093zza;
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final boolean zzb() {
        return (this.f39096zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final int zzc() {
        return (this.f39096zzd & 1) != 0 ? 1 : 2;
    }

    public final String zzd() {
        return this.f39094zzb;
    }

    public final Object[] zze() {
        return this.f39095zzc;
    }
}

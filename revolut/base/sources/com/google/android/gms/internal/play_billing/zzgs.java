package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
final class zzgs implements zzhm {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzgz f46055zza = new zzgq();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzgz f46056zzb;

    public zzgs() {
        zzfp zzfpVarZza = zzfp.zza();
        int i = zzei.f45956zza;
        zzgr zzgrVar = new zzgr(zzfpVarZza, f46055zza);
        byte[] bArr = zzga.f46030zzb;
        this.f46056zzb = zzgrVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhm
    public final zzhl zza(Class cls) {
        int i = zzhn.f46098zza;
        if (!zzfu.class.isAssignableFrom(cls)) {
            int i2 = zzei.f45956zza;
        }
        zzgy zzgyVarZzb = this.f46056zzb.zzb(cls);
        if (zzgyVarZzb.zzb()) {
            int i3 = zzei.f45956zza;
            return zzhf.zzc(zzhn.zzn(), zzfk.zza(), zzgyVarZzb.zza());
        }
        int i5 = zzei.f45956zza;
        return zzhe.zzl(cls, zzgyVarZzb, zzhh.zza(), zzgl.zza(), zzhn.zzn(), zzgyVarZzb.zzc() + (-1) != 1 ? zzfk.zza() : null, zzgx.zza());
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
final class zzmz implements zznt {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zznf f40490zza = new zzmx();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zznf f40491zzb;

    public zzmz() {
        zzly zzlyVarZza = zzly.zza();
        int i = zznp.f40513zza;
        zzmy zzmyVar = new zzmy(zzlyVarZza, f40490zza);
        byte[] bArr = zzmk.f40466zzb;
        this.f40491zzb = zzmyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zznt
    public final zzns zza(Class cls) {
        int i = zznu.f40525zza;
        if (!zzmd.class.isAssignableFrom(cls)) {
            int i2 = zznp.f40513zza;
        }
        zzne zzneVarZzb = this.f40491zzb.zzb(cls);
        if (zzneVarZzb.zzb()) {
            int i3 = zznp.f40513zza;
            return zznl.zzc(zznu.zzm(), zzls.zza(), zzneVarZzb.zza());
        }
        int i5 = zznp.f40513zza;
        return zznk.zzl(cls, zzneVarZzb, zznn.zza(), zzmv.zza(), zznu.zzm(), zzneVarZzb.zzc() + (-1) != 1 ? zzls.zza() : null, zznd.zza());
    }
}

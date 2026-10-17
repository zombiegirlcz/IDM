package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzac extends zzab {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzae f46846zza;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.zzfr f46847zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzae zzaeVar, String str, int i, com.google.android.gms.internal.measurement.zzfr zzfrVar) {
        super(str, i);
        this.f46846zza = zzaeVar;
        this.f46847zzh = zzfrVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final int zza() {
        return this.f46847zzh.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean zzc() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzd(Long l2, Long l3, com.google.android.gms.internal.measurement.zzio zzioVar, boolean z) {
        com.google.android.gms.internal.measurement.zzpq.zzb();
        zzio zzioVar2 = this.f46846zza.zzu;
        boolean zZzx = zzioVar2.zzf().zzx(this.f46840zzb, zzgi.zzaC);
        com.google.android.gms.internal.measurement.zzfr zzfrVar = this.f46847zzh;
        boolean zZzg = zzfrVar.zzg();
        boolean zZzh = zzfrVar.zzh();
        boolean zZzi = zzfrVar.zzi();
        Object[] objArr = zZzg || zZzh || zZzi;
        Boolean boolZzj = null;
        boolZzj = null;
        boolZzj = null;
        boolZzj = null;
        boolZzj = null;
        if (z && objArr != true) {
            zzioVar2.zzaW().zzj().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f46841zzc), zzfrVar.zzj() ? Integer.valueOf(zzfrVar.zza()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzfl zzflVarZzb = zzfrVar.zzb();
        boolean zZzg2 = zzflVarZzb.zzg();
        if (zzioVar.zzt()) {
            if (zzflVarZzb.zzi()) {
                boolZzj = zzab.zzj(zzab.zzh(zzioVar.zzc(), zzflVarZzb.zzc()), zZzg2);
            } else {
                zzioVar2.zzaW().zzk().zzb("No number filter for long property. property", zzioVar2.zzj().zzf(zzioVar.zzg()));
            }
        } else if (zzioVar.zzr()) {
            if (zzflVarZzb.zzi()) {
                boolZzj = zzab.zzj(zzab.zzg(zzioVar.zza(), zzflVarZzb.zzc()), zZzg2);
            } else {
                zzioVar2.zzaW().zzk().zzb("No number filter for double property. property", zzioVar2.zzj().zzf(zzioVar.zzg()));
            }
        } else if (!zzioVar.zzv()) {
            zzioVar2.zzaW().zzk().zzb("User property has no value, property", zzioVar2.zzj().zzf(zzioVar.zzg()));
        } else if (zzflVarZzb.zzk()) {
            boolZzj = zzab.zzj(zzab.zzf(zzioVar.zzh(), zzflVarZzb.zzd(), zzioVar2.zzaW()), zZzg2);
        } else if (!zzflVarZzb.zzi()) {
            zzioVar2.zzaW().zzk().zzb("No string or number filter defined. property", zzioVar2.zzj().zzf(zzioVar.zzg()));
        } else if (zzqa.zzA(zzioVar.zzh())) {
            boolZzj = zzab.zzj(zzab.zzi(zzioVar.zzh(), zzflVarZzb.zzc()), zZzg2);
        } else {
            zzioVar2.zzaW().zzk().zzc("Invalid user property value for Numeric number filter. property, value", zzioVar2.zzj().zzf(zzioVar.zzg()), zzioVar.zzh());
        }
        zzioVar2.zzaW().zzj().zzb("Property filter result", boolZzj == null ? "null" : boolZzj);
        if (boolZzj == null) {
            return false;
        }
        this.f46842zzd = Boolean.TRUE;
        if (zZzi && !boolZzj.booleanValue()) {
            return true;
        }
        if (!z || zzfrVar.zzg()) {
            this.f46843zze = boolZzj;
        }
        if (boolZzj.booleanValue() && objArr != false && zzioVar.zzu()) {
            long jZzd = zzioVar.zzd();
            if (l2 != null) {
                jZzd = l2.longValue();
            }
            if (zZzx && zzfrVar.zzg() && !zzfrVar.zzh() && l3 != null) {
                jZzd = l3.longValue();
            }
            if (zzfrVar.zzh()) {
                this.f46845zzg = Long.valueOf(jZzd);
            } else {
                this.f46844zzf = Long.valueOf(jZzd);
            }
        }
        return true;
    }
}

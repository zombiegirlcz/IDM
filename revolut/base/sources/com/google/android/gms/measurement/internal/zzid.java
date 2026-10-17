package com.google.android.gms.measurement.internal;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
final class zzid implements com.google.android.gms.internal.measurement.zzr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzif f47119zza;

    public zzid(zzif zzifVar) {
        this.f47119zza = zzifVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, String str, List list, boolean z, boolean z3) {
        int i2 = i - 1;
        zzhc zzhcVarZzi = i2 != 0 ? i2 != 1 ? i2 != 3 ? i2 != 4 ? this.f47119zza.zzu.zzaW().zzi() : z ? this.f47119zza.zzu.zzaW().zzm() : !z3 ? this.f47119zza.zzu.zzaW().zzl() : this.f47119zza.zzu.zzaW().zzk() : this.f47119zza.zzu.zzaW().zzj() : z ? this.f47119zza.zzu.zzaW().zzh() : !z3 ? this.f47119zza.zzu.zzaW().zzf() : this.f47119zza.zzu.zzaW().zze() : this.f47119zza.zzu.zzaW().zzd();
        int size = list.size();
        if (size == 1) {
            zzhcVarZzi.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzhcVarZzi.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzhcVarZzi.zza(str);
        } else {
            zzhcVarZzi.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}

package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzk extends zzai {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzab f40345zza;

    public zzk(zzab zzabVar) {
        super("internal.eventLogger");
        this.f40345zza = zzabVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzh.zzh(this.f39826zzd, 3, list);
        String strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
        long jZza = (long) zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
        zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(2));
        this.f40345zza.zze(strZzi, jZza, zzapVarZzb instanceof zzam ? zzh.zzg((zzam) zzapVarZzb) : new HashMap());
        return zzap.f39833zzf;
    }
}

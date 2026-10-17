package com.google.android.gms.internal.measurement;

import com.google.common.annotations.VisibleForTesting;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes16.dex */
public final class zzf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @VisibleForTesting
    final zzax f40021zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @VisibleForTesting
    final zzg f40022zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @VisibleForTesting
    final zzg f40023zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @VisibleForTesting
    final zzj f40024zzd;

    public zzf() {
        zzax zzaxVar = new zzax();
        this.f40021zza = zzaxVar;
        zzg zzgVar = new zzg(null, zzaxVar);
        this.f40023zzc = zzgVar;
        this.f40022zzb = zzgVar.zza();
        zzj zzjVar = new zzj();
        this.f40024zzd = zzjVar;
        zzgVar.zzg("require", new zzw(zzjVar));
        zzjVar.zza("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.zze
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzy();
            }
        });
        zzgVar.zzg("runtime.counter", new zzah(Double.valueOf(0.0d)));
    }

    public final zzap zza(zzg zzgVar, zziz... zzizVarArr) {
        zzap zzapVarZza = zzap.f39833zzf;
        for (zziz zzizVar : zzizVarArr) {
            zzapVarZza = zzi.zza(zzizVar);
            zzh.zzc(this.f40023zzc);
            if ((zzapVarZza instanceof zzaq) || (zzapVarZza instanceof zzao)) {
                zzapVarZza = this.f40021zza.zza(zzgVar, zzapVarZza);
            }
        }
        return zzapVarZza;
    }
}

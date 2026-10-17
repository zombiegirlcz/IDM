package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes16.dex */
final class zzpo implements Callable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47666zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzpv f47667zzb;

    public zzpo(zzpv zzpvVar, zzr zzrVar) {
        this.f47666zza = zzrVar;
        this.f47667zzb = zzpvVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzr zzrVar = this.f47666zza;
        String str = (String) Preconditions.checkNotNull(zzrVar.f47736zza);
        zzpv zzpvVar = this.f47667zzb;
        zzjx zzjxVarZzu = zzpvVar.zzu(str);
        zzjw zzjwVar = zzjw.ANALYTICS_STORAGE;
        if (zzjxVarZzu.zzr(zzjwVar) && zzjx.zzk(zzrVar.zzu, 100).zzr(zzjwVar)) {
            return zzpvVar.zzg(zzrVar).zzD();
        }
        zzpvVar.zzaW().zzj().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}

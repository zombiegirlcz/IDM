package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.RangingCapabilities;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzsr extends zzpl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45681zza;

    public zzsr(zztc zztcVar, TaskCompletionSource taskCompletionSource) {
        this.f45681zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzpm
    public final void zzd(zzqn zzqnVar) {
        this.f45681zza.setResult(new RangingCapabilities(zzqnVar.zze(), zzqnVar.zzc(), zzqnVar.zzf(), zzqnVar.zzb(), zzqnVar.zza(), zzua.zzj(zzuw.zzb(zzqnVar.zzg())), zzua.zzj(zzuw.zzb(zzqnVar.zzi())), zzua.zzj(zzuw.zzb(zzqnVar.zzh())), zzua.zzj(zzuw.zzb(zzqnVar.zzk())), zzua.zzj(zzuw.zzb(zzqnVar.zzj())), zzqnVar.zzd()));
    }
}

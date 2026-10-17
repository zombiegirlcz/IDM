package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
final class zzle implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ long f47351zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzlw f47352zzb;

    public zzle(zzlw zzlwVar, long j2) {
        this.f47351zza = j2;
        this.f47352zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlw zzlwVar = this.f47352zzb;
        zzlwVar.zzg();
        zzlwVar.zza();
        zzio zzioVar = zzlwVar.zzu;
        zzioVar.zzaW().zzd().zza("Resetting analytics data (FE)");
        zzio zzioVar2 = zzlwVar.zzu;
        zzop zzopVarZzv = zzioVar2.zzv();
        zzopVarZzv.zzg();
        zzopVarZzv.f47618zzb.zza();
        zzioVar2.zzh().zzq();
        boolean z = !zzlwVar.zzu.zzJ();
        zzht zzhtVarZzm = zzioVar.zzm();
        zzhtVarZzm.f47092zzc.zzb(this.f47351zza);
        zzio zzioVar3 = zzhtVarZzm.zzu;
        if (!TextUtils.isEmpty(zzioVar3.zzm().zzq.zza())) {
            zzhtVarZzm.zzq.zzb(null);
        }
        zzhtVarZzm.f47100zzk.zzb(0L);
        zzhtVarZzm.f47101zzl.zzb(0L);
        if (!zzioVar3.zzf().zzA()) {
            zzhtVarZzm.zzn(z);
        }
        zzhtVarZzm.zzr.zzb(null);
        zzhtVarZzm.zzs.zzb(0L);
        zzhtVarZzm.zzt.zzb(null);
        zzioVar2.zzu().zzO();
        zzioVar2.zzv().f47617zza.zza();
        zzlwVar.f47397zzc = z;
        zzioVar2.zzu().zzE(new AtomicReference());
    }
}

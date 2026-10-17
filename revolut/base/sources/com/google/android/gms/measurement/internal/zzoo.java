package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes16.dex */
final class zzoo {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzop f47616zza;

    public zzoo(zzop zzopVar) {
        this.f47616zza = zzopVar;
    }

    public final void zza() {
        zzop zzopVar = this.f47616zza;
        zzopVar.zzg();
        zzio zzioVar = zzopVar.zzu;
        if (zzioVar.zzm().zzp(zzioVar.zzaU().currentTimeMillis())) {
            zzioVar.zzm().f47096zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                zzioVar.zzaW().zzj().zza("Detected application was in foreground");
                zzc(zzioVar.zzaU().currentTimeMillis(), false);
            }
        }
    }

    public final void zzb(long j2, boolean z) {
        zzop zzopVar = this.f47616zza;
        zzopVar.zzg();
        zzopVar.zzq();
        zzio zzioVar = zzopVar.zzu;
        if (zzioVar.zzm().zzp(j2)) {
            zzioVar.zzm().f47096zzg.zza(true);
            zzopVar.zzu.zzh().zzq();
        }
        zzioVar.zzm().f47100zzk.zzb(j2);
        if (zzioVar.zzm().f47096zzg.zzb()) {
            zzc(j2, z);
        }
    }

    public final void zzc(long j2, boolean z) {
        zzop zzopVar = this.f47616zza;
        zzopVar.zzg();
        if (zzopVar.zzu.zzJ()) {
            zzio zzioVar = zzopVar.zzu;
            zzioVar.zzm().f47100zzk.zzb(j2);
            zzioVar.zzaW().zzj().zzb("Session started, time", Long.valueOf(zzioVar.zzaU().elapsedRealtime()));
            long j3 = j2 / 1000;
            zzio zzioVar2 = zzopVar.zzu;
            zzioVar2.zzq().zzan("auto", "_sid", Long.valueOf(j3), j2);
            zzioVar.zzm().f47101zzl.zzb(j3);
            zzioVar.zzm().f47096zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            zzioVar2.zzq().zzS("auto", "_s", j2, bundle);
            String strZza = zzioVar.zzm().zzq.zza();
            if (TextUtils.isEmpty(strZza)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strZza);
            zzioVar2.zzq().zzS("auto", "_ssr", j2, bundle2);
        }
    }
}

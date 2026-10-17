package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzlf implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Bundle f47353zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzlw f47354zzb;

    public zzlf(zzlw zzlwVar, Bundle bundle) {
        this.f47353zza = bundle;
        this.f47354zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlw zzlwVar = this.f47354zzb;
        zzlwVar.zzg();
        zzlwVar.zza();
        Bundle bundle = this.f47353zza;
        Preconditions.checkNotNull(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(bundle.get("value"));
        if (!zzlwVar.zzu.zzJ()) {
            zzlwVar.zzu.zzaW().zzj().zza("Conditional property not set since app measurement is disabled");
            return;
        }
        zzqb zzqbVar = new zzqb(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzio zzioVar = zzlwVar.zzu;
            zzbh zzbhVarZzC = zzioVar.zzw().zzC(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            zzlwVar.zzu.zzu().zzQ(new zzai(bundle.getString("app_id"), string2, zzqbVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), zzioVar.zzw().zzC(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), zzbhVarZzC, bundle.getLong("time_to_live"), zzioVar.zzw().zzC(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}

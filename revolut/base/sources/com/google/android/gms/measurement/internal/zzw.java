package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.util.a;
import com.google.android.gms.internal.measurement.zzqr;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class zzw extends BroadcastReceiver {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzio f47751zza;

    public zzw(zzio zzioVar) {
        this.f47751zza = zzioVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            a.C(this.f47751zza, "App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            a.C(this.f47751zza, "App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                zzio zzioVar = this.f47751zza;
                if (zzioVar.zzf().zzx(null, zzgi.zzaR)) {
                    zzioVar.zzaW().zzj().zza("[sgtm] App Receiver notified batches are available");
                    zzioVar.zzaX().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzv
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f47750zza.f47751zza.zzs().zzj(((Long) zzgi.zzC.zza(null)).longValue());
                        }
                    });
                    return;
                }
                return;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            final zzio zzioVar2 = this.f47751zza;
            zzqr.zzb();
            if (zzioVar2.zzf().zzx(null, zzgi.zzaW)) {
                zzioVar2.zzaW().zzj().zza("App receiver notified triggers are available");
                zzioVar2.zzaX().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzu
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzio zzioVar3 = zzioVar2;
                        if (!zzioVar3.zzw().zzan()) {
                            a.C(zzioVar3, "registerTrigger called but app not eligible");
                            return;
                        }
                        zzioVar3.zzq().zzI();
                        final zzlw zzlwVarZzq = zzioVar3.zzq();
                        Objects.requireNonNull(zzlwVarZzq);
                        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzt
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzlwVarZzq.zzL();
                            }
                        }).start();
                    }
                });
                return;
            }
            return;
        }
        a.C(this.f47751zza, "App receiver called with unknown action");
    }
}

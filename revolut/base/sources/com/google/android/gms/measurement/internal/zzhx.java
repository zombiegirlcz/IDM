package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhx {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zza f47108zza;

    public interface zza {
        void doStartService(Context context, Intent intent);
    }

    public zzhx(zza zzaVar) {
        Preconditions.checkNotNull(zzaVar);
        this.f47108zza = zzaVar;
    }

    public final void zza(Context context, Intent intent) {
        zzio zzioVarZzp = zzio.zzp(context, null, null);
        zzhe zzheVarZzaW = zzioVarZzp.zzaW();
        if (intent == null) {
            zzheVarZzaW.zzk().zza("Receiver called with null intent");
            return;
        }
        zzioVarZzp.zzaV();
        String action = intent.getAction();
        zzheVarZzaW.zzj().zzb("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                zzheVarZzaW.zzk().zza("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzheVarZzaW.zzj().zza("Starting wakeful intent.");
            this.f47108zza.doStartService(context, className);
        }
    }
}

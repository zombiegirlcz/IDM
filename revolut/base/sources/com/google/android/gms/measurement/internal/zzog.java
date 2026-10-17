package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class zzog {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Context f47600zza;

    public zzog(Context context) {
        Preconditions.checkNotNull(context);
        this.f47600zza = context;
    }

    public static /* synthetic */ void zzd(zzog zzogVar, zzhe zzheVar, JobParameters jobParameters) {
        zzheVar.zzj().zza("AppMeasurementJobService processed last upload request.");
        ((zzof) zzogVar.f47600zza).zzb(jobParameters, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void zze(zzog zzogVar, int i, zzhe zzheVar, Intent intent) {
        Context context = zzogVar.f47600zza;
        zzof zzofVar = (zzof) context;
        if (zzofVar.zzc(i)) {
            zzheVar.zzj().zzb("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            zzio.zzp(context, null, null).zzaW().zzj().zza("Completed wakeful intent.");
            zzofVar.zza(intent);
        }
    }

    public static final void zzi(Intent intent) {
        if (intent == null) {
            return;
        }
        "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
    }

    public static final boolean zzj(Intent intent) {
        if (intent == null) {
            return true;
        }
        "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction()));
        return true;
    }

    private final void zzk(zzpv zzpvVar, Runnable runnable) {
        zzpvVar.zzaX().zzq(new zzoe(this, zzpvVar, runnable));
    }

    public final int zza(final Intent intent, int i, final int i2) {
        if (intent == null) {
            return 2;
        }
        Context context = this.f47600zza;
        zzio zzioVarZzp = zzio.zzp(context, null, null);
        final zzhe zzheVarZzaW = zzioVarZzp.zzaW();
        String action = intent.getAction();
        zzioVarZzp.zzaV();
        zzheVarZzaW.zzj().zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzk(zzpv.zzz(context), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzoc
                @Override // java.lang.Runnable
                public final void run() {
                    zzog.zze(this.f47591zza, i2, zzheVarZzaW, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder zzb(Intent intent) {
        if (intent == null) {
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzjp(zzpv.zzz(this.f47600zza), null);
        }
        "onBind received unknown action: ".concat(String.valueOf(action));
        return null;
    }

    public final void zzf() {
        this.f47600zza.getClass().getSimpleName().concat(" is starting up.");
    }

    public final void zzg() {
        this.f47600zza.getClass().getSimpleName().concat(" is shutting down.");
    }

    public final boolean zzh(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        "onStartJob received action: ".concat(String.valueOf(string));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) Preconditions.checkNotNull(string);
            zzpv zzpvVarZzz = zzpv.zzz(this.f47600zza);
            final zzhe zzheVarZzaW = zzpvVarZzz.zzaW();
            zzpvVarZzz.zzaV();
            zzheVarZzaW.zzj().zzb("Local AppMeasurementJobService called. action", str);
            zzk(zzpvVarZzz, new Runnable() { // from class: com.google.android.gms.measurement.internal.zzod
                @Override // java.lang.Runnable
                public final void run() {
                    zzog.zzd(this.f47595zza, zzheVarZzaW, jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        com.google.android.gms.internal.measurement.zzff zzffVarZzg = com.google.android.gms.internal.measurement.zzff.zzg(this.f47600zza, null, null, null, null);
        if (!((Boolean) zzgi.zzaT.zza(null)).booleanValue()) {
            return true;
        }
        zzffVarZzg.zzE(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzob
            @Override // java.lang.Runnable
            public final void run() {
                ((zzof) this.f47589zza.f47600zza).zzb(jobParameters, false);
            }
        });
        return true;
    }
}

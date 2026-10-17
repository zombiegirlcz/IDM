package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes16.dex */
public final class zzoy extends zzpg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final AlarmManager f47636zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private zzaz f47637zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Integer f47638zzc;

    public zzoy(zzpv zzpvVar) {
        super(zzpvVar);
        this.f47636zza = (AlarmManager) this.zzu.zzaT().getSystemService("alarm");
    }

    private final int zzf() {
        if (this.f47638zzc == null) {
            this.f47638zzc = Integer.valueOf("measurement".concat(String.valueOf(this.zzu.zzaT().getPackageName())).hashCode());
        }
        return this.f47638zzc.intValue();
    }

    private final PendingIntent zzh() {
        Context contextZzaT = this.zzu.zzaT();
        return PendingIntent.getBroadcast(contextZzaT, 0, new Intent().setClassName(contextZzaT, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzcj.f39897zza);
    }

    private final zzaz zzi() {
        if (this.f47637zzb == null) {
            this.f47637zzb = new zzox(this, this.f47639zzg.zzt());
        }
        return this.f47637zzb;
    }

    private final void zzj() {
        JobScheduler jobScheduler = (JobScheduler) this.zzu.zzaT().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(zzf());
        }
    }

    public final void zza() {
        zzav();
        this.zzu.zzaW().zzj().zza("Unscheduling upload");
        AlarmManager alarmManager = this.f47636zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        zzi().zzb();
        zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    public final boolean zzb() {
        AlarmManager alarmManager = this.f47636zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        zzj();
        return false;
    }

    public final void zzd(long j2) {
        zzav();
        zzio zzioVar = this.zzu;
        zzioVar.zzaV();
        Context contextZzaT = zzioVar.zzaT();
        if (!zzqf.zzar(contextZzaT)) {
            zzioVar.zzaW().zzd().zza("Receiver not registered/enabled");
        }
        if (!zzqf.zzat(contextZzaT, false)) {
            zzioVar.zzaW().zzd().zza("Service not registered/enabled");
        }
        zza();
        zzioVar.zzaW().zzj().zzb("Scheduling upload, millis", Long.valueOf(j2));
        zzioVar.zzaU().elapsedRealtime();
        zzioVar.zzf();
        if (j2 < Math.max(0L, ((Long) zzgi.zzK.zza(null)).longValue()) && !zzi().zze()) {
            zzi().zzd(j2);
        }
        zzioVar.zzaV();
        Context contextZzaT2 = zzioVar.zzaT();
        ComponentName componentName = new ComponentName(contextZzaT2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iZzf = zzf();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzck.zza(contextZzaT2, new JobInfo.Builder(iZzf, componentName).setMinimumLatency(j2).setOverrideDeadline(j2 + j2).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}

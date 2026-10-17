package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import android.os.UserHandle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zzo implements ServiceConnection, zzr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzq f38167zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Map f38168zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f38169zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private boolean f38170zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private IBinder f38171zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final zzn f38172zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private ComponentName f38173zzg;

    public zzo(zzq zzqVar, zzn zznVar) {
        java.util.Objects.requireNonNull(zzqVar);
        this.f38167zza = zzqVar;
        this.f38172zzf = zznVar;
        this.f38168zzb = new HashMap();
        this.f38169zzc = 2;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzq zzqVar = this.f38167zza;
        synchronized (zzqVar.zzf()) {
            try {
                zzqVar.zzh().removeMessages(1, this.f38172zzf);
                this.f38171zze = iBinder;
                this.f38173zzg = componentName;
                Iterator it8 = this.f38168zzb.values().iterator();
                while (it8.hasNext()) {
                    ((ServiceConnection) it8.next()).onServiceConnected(componentName, iBinder);
                }
                this.f38169zzc = 1;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzq zzqVar = this.f38167zza;
        synchronized (zzqVar.zzf()) {
            try {
                zzqVar.zzh().removeMessages(1, this.f38172zzf);
                this.f38171zze = null;
                this.f38173zzg = componentName;
                Iterator it8 = this.f38168zzb.values().iterator();
                while (it8.hasNext()) {
                    ((ServiceConnection) it8.next()).onServiceDisconnected(componentName);
                }
                this.f38169zzc = 2;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void zza(String str) {
        zzn zznVar = this.f38172zzf;
        zzq zzqVar = this.f38167zza;
        zzqVar.zzh().removeMessages(1, zznVar);
        zzqVar.zzi().unbindService(zzqVar.zzg(), this);
        this.f38170zzd = false;
        this.f38169zzc = 2;
    }

    public final void zzb(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f38168zzb.put(serviceConnection, serviceConnection2);
    }

    public final void zzc(ServiceConnection serviceConnection, String str) {
        this.f38168zzb.remove(serviceConnection);
    }

    public final boolean zzd() {
        return this.f38170zzd;
    }

    public final int zze() {
        return this.f38169zzc;
    }

    public final boolean zzf(ServiceConnection serviceConnection) {
        return this.f38168zzb.containsKey(serviceConnection);
    }

    public final boolean zzg() {
        return this.f38168zzb.isEmpty();
    }

    public final IBinder zzh() {
        return this.f38171zze;
    }

    public final ComponentName zzi() {
        return this.f38173zzg;
    }

    public final /* synthetic */ ConnectionResult zzj(String str, Executor executor) throws Throwable {
        zzq zzqVar;
        ConnectionTracker connectionTrackerZzi;
        Context contextZzg;
        zzn zznVar;
        try {
            Intent intentZza = zzah.zza(this.f38167zza.zzg(), this.f38172zzf);
            this.f38169zzc = 3;
            StrictMode.VmPolicy vmPolicyZza = com.google.android.gms.common.util.zzd.zza();
            try {
                zzqVar = this.f38167zza;
                connectionTrackerZzi = zzqVar.zzi();
                contextZzg = zzqVar.zzg();
                zznVar = this.f38172zzf;
            } catch (Throwable th10) {
                th = th10;
            }
            try {
                boolean zZza = connectionTrackerZzi.zza(contextZzg, str, intentZza, this, 4225, executor);
                this.f38170zzd = zZza;
                if (zZza) {
                    zzqVar.zzh().sendMessageDelayed(zzqVar.zzh().obtainMessage(1, zznVar), zzqVar.zzj());
                    ConnectionResult connectionResult = ConnectionResult.RESULT_SUCCESS;
                    StrictMode.setVmPolicy(vmPolicyZza);
                    return connectionResult;
                }
                this.f38169zzc = 2;
                try {
                    zzqVar.zzi().unbindService(zzqVar.zzg(), this);
                } catch (IllegalArgumentException unused) {
                }
                ConnectionResult connectionResult2 = new ConnectionResult(16);
                StrictMode.setVmPolicy(vmPolicyZza);
                return connectionResult2;
            } catch (Throwable th11) {
                th = th11;
                Throwable th12 = th;
                StrictMode.setVmPolicy(vmPolicyZza);
                throw th12;
            }
        } catch (zzaf e) {
            return e.f38142zza;
        }
    }

    public final /* synthetic */ ConnectionResult zzk(String str, UserHandle userHandle) throws Throwable {
        try {
            Intent intentZza = zzah.zza(this.f38167zza.zzg(), this.f38172zzf);
            this.f38169zzc = 3;
            StrictMode.VmPolicy vmPolicyZza = com.google.android.gms.common.util.zzd.zza();
            try {
                zzq zzqVar = this.f38167zza;
                ConnectionTracker connectionTrackerZzi = zzqVar.zzi();
                Context contextZzg = zzqVar.zzg();
                zzn zznVar = this.f38172zzf;
                try {
                    boolean zZzb = connectionTrackerZzi.zzb(contextZzg, str, intentZza, this, 4225, userHandle);
                    this.f38170zzd = zZzb;
                    if (!zZzb) {
                        this.f38169zzc = 2;
                        ConnectionResult connectionResult = new ConnectionResult(16);
                        StrictMode.setVmPolicy(vmPolicyZza);
                        return connectionResult;
                    }
                    zzqVar.zzh().sendMessageDelayed(zzqVar.zzh().obtainMessage(1, zznVar), zzqVar.zzj());
                    ConnectionResult connectionResult2 = ConnectionResult.RESULT_SUCCESS;
                    StrictMode.setVmPolicy(vmPolicyZza);
                    return connectionResult2;
                } catch (Throwable th10) {
                    th = th10;
                    Throwable th11 = th;
                    StrictMode.setVmPolicy(vmPolicyZza);
                    throw th11;
                }
            } catch (Throwable th12) {
                th = th12;
            }
        } catch (zzaf e) {
            return e.f38142zza;
        }
    }
}

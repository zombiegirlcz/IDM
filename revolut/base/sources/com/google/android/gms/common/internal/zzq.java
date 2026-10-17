package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes16.dex */
final class zzq extends GmsClientSupervisor {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final HashMap f38175zzb = new HashMap();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Context f38176zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private volatile Handler f38177zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final zzp f38178zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final ConnectionTracker f38179zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final long f38180zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final long f38181zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private volatile Executor f38182zzi;

    public zzq(Context context, Looper looper, Executor executor) {
        zzp zzpVar = new zzp(this, null);
        this.f38178zze = zzpVar;
        this.f38176zzc = context.getApplicationContext();
        this.f38177zzd = new com.google.android.gms.internal.common.zzg(looper, zzpVar);
        this.f38179zzf = ConnectionTracker.getInstance();
        this.f38180zzg = 5000L;
        this.f38181zzh = 300000L;
        this.f38182zzi = executor;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final ConnectionResult zza(zzn zznVar, ServiceConnection serviceConnection, String str, Executor executor) {
        ConnectionResult connectionResultZzj;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f38175zzb;
        synchronized (map) {
            try {
                zzo zzoVar = (zzo) map.get(zznVar);
                if (executor == null) {
                    executor = this.f38182zzi;
                }
                if (zzoVar == null) {
                    zzoVar = new zzo(this, zznVar);
                    zzoVar.zzb(serviceConnection, serviceConnection, str);
                    UserHandle userHandleZze = zznVar.zze();
                    connectionResultZzj = (userHandleZze == null || Build.VERSION.SDK_INT < 33) ? zzoVar.zzj(str, executor) : zzoVar.zzk(str, userHandleZze);
                    map.put(zznVar, zzoVar);
                } else {
                    this.f38177zzd.removeMessages(0, zznVar);
                    if (zzoVar.zzf(serviceConnection)) {
                        String string = zznVar.toString();
                        StringBuilder sb6 = new StringBuilder(string.length() + 81);
                        sb6.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb6.append(string);
                        throw new IllegalStateException(sb6.toString());
                    }
                    zzoVar.zzb(serviceConnection, serviceConnection, str);
                    int iZze = zzoVar.zze();
                    if (iZze == 1) {
                        serviceConnection.onServiceConnected(zzoVar.zzi(), zzoVar.zzh());
                    } else if (iZze == 2) {
                        UserHandle userHandleZze2 = zznVar.zze();
                        connectionResultZzj = (userHandleZze2 == null || Build.VERSION.SDK_INT < 33) ? zzoVar.zzj(str, executor) : zzoVar.zzk(str, userHandleZze2);
                    }
                    connectionResultZzj = null;
                }
                if (zzoVar.zzd()) {
                    return ConnectionResult.RESULT_SUCCESS;
                }
                if (connectionResultZzj == null) {
                    connectionResultZzj = new ConnectionResult(-1);
                }
                return connectionResultZzj;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void zzc(zzn zznVar, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f38175zzb;
        synchronized (map) {
            try {
                zzo zzoVar = (zzo) map.get(zznVar);
                if (zzoVar == null) {
                    String string = zznVar.toString();
                    StringBuilder sb6 = new StringBuilder(string.length() + 50);
                    sb6.append("Nonexistent connection status for service config: ");
                    sb6.append(string);
                    throw new IllegalStateException(sb6.toString());
                }
                if (!zzoVar.zzf(serviceConnection)) {
                    String string2 = zznVar.toString();
                    StringBuilder sb9 = new StringBuilder(string2.length() + 76);
                    sb9.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb9.append(string2);
                    throw new IllegalStateException(sb9.toString());
                }
                zzoVar.zzc(serviceConnection, str);
                if (zzoVar.zzg()) {
                    this.f38177zzd.sendMessageDelayed(this.f38177zzd.obtainMessage(0, zznVar), this.f38180zzg);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void zzd(Looper looper) {
        synchronized (this.f38175zzb) {
            this.f38177zzd = new com.google.android.gms.internal.common.zzg(looper, this.f38178zze);
        }
    }

    public final void zze(Executor executor) {
        synchronized (this.f38175zzb) {
            this.f38182zzi = executor;
        }
    }

    public final /* synthetic */ HashMap zzf() {
        return this.f38175zzb;
    }

    public final /* synthetic */ Context zzg() {
        return this.f38176zzc;
    }

    public final /* synthetic */ Handler zzh() {
        return this.f38177zzd;
    }

    public final /* synthetic */ ConnectionTracker zzi() {
        return this.f38179zzf;
    }

    public final /* synthetic */ long zzj() {
        return this.f38181zzh;
    }
}

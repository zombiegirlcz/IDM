package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzv f37625zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Context f37626zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final ScheduledExecutorService f37627zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private zzp f37628zzd = new zzp(this, null);

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f37629zze = 1;

    public zzv(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f37627zzc = scheduledExecutorService;
        this.f37626zzb = context.getApplicationContext();
    }

    public static synchronized zzv zzb(Context context) {
        try {
            if (f37625zza == null) {
                com.google.android.gms.internal.cloudmessaging.zze.zza();
                f37625zza = new zzv(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f37625zza;
    }

    private final synchronized int zzf() {
        int i;
        i = this.f37629zze;
        this.f37629zze = i + 1;
        return i;
    }

    private final synchronized Task zzg(zzs zzsVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(zzsVar.toString());
            }
            if (!this.f37628zzd.zzg(zzsVar)) {
                zzp zzpVar = new zzp(this, null);
                this.f37628zzd = zzpVar;
                zzpVar.zzg(zzsVar);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return zzsVar.f37622zzb.getTask();
    }

    public final Task zzc(int i, Bundle bundle) {
        return zzg(new zzr(zzf(), i, bundle));
    }

    public final Task zzd(int i, Bundle bundle) {
        return zzg(new zzu(zzf(), i, bundle));
    }
}

package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public final class zzcx extends zzcz {
    public static zzdc zza(Object obj2) {
        return new zzda(obj2);
    }

    public static zzdc zzb(zzdc zzdcVar, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return zzdcVar.isDone() ? zzdcVar : zzdh.zzs(zzdcVar, 28500L, timeUnit, scheduledExecutorService);
    }

    public static void zzc(zzdc zzdcVar, zzcv zzcvVar, Executor executor) {
        zzdcVar.zzb(new zzcw(zzdcVar, zzcvVar), executor);
    }
}

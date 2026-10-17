package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzcm;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzdh extends zzct {

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private zzdc f45920zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private ScheduledFuture f45921zze;

    private zzdh(zzdc zzdcVar) {
        this.f45920zzd = zzdcVar;
    }

    public static zzdc zzs(zzdc zzdcVar, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzdh zzdhVar = new zzdh(zzdcVar);
        zzde zzdeVar = new zzde(zzdhVar);
        zzdhVar.f45921zze = scheduledExecutorService.schedule(zzdeVar, 28500L, timeUnit);
        zzdcVar.zzb(zzdeVar, zzcs.INSTANCE);
        return zzdhVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcm
    public final String zzd() {
        zzdc zzdcVar = this.f45920zzd;
        ScheduledFuture scheduledFuture = this.f45921zze;
        if (zzdcVar == null) {
            return null;
        }
        String strP = a.p("inputFuture=[", zzdcVar.toString(), "]");
        if (scheduledFuture == null) {
            return strP;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strP;
        }
        return strP + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.zzcm
    public final void zzg() {
        zzdc zzdcVar = this.f45920zzd;
        if ((this.valueField instanceof zzcm.zza) & (zzdcVar != null)) {
            Object obj2 = this.valueField;
            zzdcVar.cancel((obj2 instanceof zzcm.zza) && ((zzcm.zza) obj2).f45884zzc);
        }
        ScheduledFuture scheduledFuture = this.f45921zze;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f45920zzd = null;
        this.f45921zze = null;
    }
}

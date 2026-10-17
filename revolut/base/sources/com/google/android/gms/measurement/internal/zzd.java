package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import ch.qos.logback.core.util.a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzd extends zzf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Map f46957zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Map f46958zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private long f46959zzc;

    public zzd(zzio zzioVar) {
        super(zzioVar);
        this.f46958zzb = new ArrayMap();
        this.f46957zza = new ArrayMap();
    }

    public static /* synthetic */ void zza(zzd zzdVar, String str, long j2) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Map map = zzdVar.f46958zzb;
        if (map.isEmpty()) {
            zzdVar.f46959zzc = j2;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            a.C(zzdVar.zzu, "Too many ads visible");
        } else {
            map.put(str, 1);
            zzdVar.f46957zza.put(str, Long.valueOf(j2));
        }
    }

    public static /* synthetic */ void zzb(zzd zzdVar, String str, long j2) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Map map = zzdVar.f46958zzb;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            zzdVar.zzu.zzaW().zze().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzmh zzmhVarZzj = zzdVar.zzu.zzt().zzj(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            map.put(str, Integer.valueOf(iIntValue));
            return;
        }
        map.remove(str);
        Map map2 = zzdVar.f46957zza;
        Long l2 = (Long) map2.get(str);
        if (l2 == null) {
            a.w(zzdVar.zzu, "First ad unit exposure time was never set");
        } else {
            long jLongValue = j2 - l2.longValue();
            map2.remove(str);
            zzdVar.zzi(str, jLongValue, zzmhVarZzj);
        }
        if (map.isEmpty()) {
            long j3 = zzdVar.f46959zzc;
            if (j3 == 0) {
                a.w(zzdVar.zzu, "First ad exposure time was never set");
            } else {
                zzdVar.zzh(j2 - j3, zzmhVarZzj);
                zzdVar.f46959zzc = 0L;
            }
        }
    }

    private final void zzh(long j2, zzmh zzmhVar) {
        if (zzmhVar == null) {
            this.zzu.zzaW().zzj().zza("Not logging ad exposure. No active activity");
            return;
        }
        if (j2 < 1000) {
            this.zzu.zzaW().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j2);
        zzqf.zzN(zzmhVar, bundle, true);
        this.zzu.zzq().zzR("am", "_xa", bundle);
    }

    private final void zzi(String str, long j2, zzmh zzmhVar) {
        if (zzmhVar == null) {
            this.zzu.zzaW().zzj().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j2 < 1000) {
            this.zzu.zzaW().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j2);
        zzqf.zzN(zzmhVar, bundle, true);
        this.zzu.zzq().zzR("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(long j2) {
        Map map = this.f46957zza;
        Iterator it8 = map.keySet().iterator();
        while (it8.hasNext()) {
            map.put((String) it8.next(), Long.valueOf(j2));
        }
        if (map.isEmpty()) {
            return;
        }
        this.f46959zzc = j2;
    }

    public final void zzd(String str, long j2) {
        if (str == null || str.length() == 0) {
            a.w(this.zzu, "Ad unit id must be a non-empty string");
        } else {
            this.zzu.zzaX().zzq(new zza(this, str, j2));
        }
    }

    public final void zze(String str, long j2) {
        if (str == null || str.length() == 0) {
            a.w(this.zzu, "Ad unit id must be a non-empty string");
        } else {
            this.zzu.zzaX().zzq(new zzb(this, str, j2));
        }
    }

    public final void zzf(long j2) {
        zzmh zzmhVarZzj = this.zzu.zzt().zzj(false);
        Map map = this.f46957zza;
        for (String str : map.keySet()) {
            zzi(str, j2 - ((Long) map.get(str)).longValue(), zzmhVarZzj);
        }
        if (!map.isEmpty()) {
            zzh(j2 - this.f46959zzc, zzmhVarZzj);
        }
        zzj(j2);
    }
}

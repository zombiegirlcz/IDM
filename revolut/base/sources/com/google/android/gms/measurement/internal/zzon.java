package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes16.dex */
final class zzon {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected long f47612zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    protected long f47613zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzop f47614zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzaz f47615zzd;

    public zzon(zzop zzopVar) {
        this.f47614zzc = zzopVar;
        this.f47615zzd = new zzom(this, zzopVar.zzu);
        long jElapsedRealtime = zzopVar.zzu.zzaU().elapsedRealtime();
        this.f47612zza = jElapsedRealtime;
        this.f47613zzb = jElapsedRealtime;
    }

    public final void zza() {
        this.f47615zzd.zzb();
        zzio zzioVar = this.f47614zzc.zzu;
        long jElapsedRealtime = zzioVar.zzf().zzx(null, zzgi.zzbb) ? zzioVar.zzaU().elapsedRealtime() : 0L;
        this.f47612zza = jElapsedRealtime;
        this.f47613zzb = jElapsedRealtime;
    }

    public final void zzb(long j2) {
        this.f47615zzd.zzb();
    }

    public final void zzc(long j2) {
        this.f47614zzc.zzg();
        this.f47615zzd.zzb();
        this.f47612zza = j2;
        this.f47613zzb = j2;
    }

    public final boolean zzd(boolean z, boolean z3, long j2) {
        zzop zzopVar = this.f47614zzc;
        zzopVar.zzg();
        zzopVar.zza();
        if (zzopVar.zzu.zzJ()) {
            zzio zzioVar = zzopVar.zzu;
            zzioVar.zzm().f47100zzk.zzb(zzioVar.zzaU().currentTimeMillis());
        }
        long j3 = j2 - this.f47612zza;
        if (!z && j3 < 1000) {
            zzopVar.zzu.zzaW().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j3));
            return false;
        }
        if (!z3) {
            j3 = j2 - this.f47613zzb;
            this.f47613zzb = j2;
        }
        zzio zzioVar2 = zzopVar.zzu;
        zzioVar2.zzaW().zzj().zzb("Recording user engagement, ms", Long.valueOf(j3));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j3);
        boolean z4 = !zzioVar2.zzf().zzz();
        zzio zzioVar3 = zzopVar.zzu;
        zzqf.zzN(zzioVar3.zzt().zzj(z4), bundle, true);
        if (!z3) {
            zzioVar3.zzq().zzR("auto", "_e", bundle);
        }
        this.f47612zza = j2;
        zzaz zzazVar = this.f47615zzd;
        zzazVar.zzb();
        zzazVar.zzd(((Long) zzgi.zzap.zza(null)).longValue());
        return true;
    }
}

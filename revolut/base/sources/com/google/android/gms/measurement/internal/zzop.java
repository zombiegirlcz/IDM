package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes16.dex */
public final class zzop extends zzg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected final zzoo f47617zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    protected final zzon f47618zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    protected final zzol f47619zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Handler f47620zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private boolean f47621zze;

    public zzop(zzio zzioVar) {
        super(zzioVar);
        this.f47621zze = true;
        this.f47617zza = new zzoo(this);
        this.f47618zzb = new zzon(this);
        this.f47619zzc = new zzol(this);
    }

    public static /* bridge */ /* synthetic */ void zzj(zzop zzopVar, long j2) {
        zzopVar.zzg();
        zzopVar.zzq();
        zzio zzioVar = zzopVar.zzu;
        zzioVar.zzaW().zzj().zzb("Activity paused, time", Long.valueOf(j2));
        zzopVar.f47619zzc.zza(j2);
        if (zzioVar.zzf().zzz()) {
            zzopVar.f47618zzb.zzb(j2);
        }
    }

    public static /* bridge */ /* synthetic */ void zzl(zzop zzopVar, long j2) {
        zzopVar.zzg();
        zzopVar.zzq();
        zzio zzioVar = zzopVar.zzu;
        zzioVar.zzaW().zzj().zzb("Activity resumed, time", Long.valueOf(j2));
        if (zzioVar.zzf().zzx(null, zzgi.zzba)) {
            if (zzioVar.zzf().zzz() || zzopVar.f47621zze) {
                zzopVar.f47618zzb.zzc(j2);
            }
        } else if (zzioVar.zzf().zzz() || zzioVar.zzm().zzn.zzb()) {
            zzopVar.f47618zzb.zzc(j2);
        }
        zzopVar.f47619zzc.zzb();
        zzoo zzooVar = zzopVar.f47617zza;
        zzop zzopVar2 = zzooVar.f47616zza;
        zzopVar2.zzg();
        if (zzopVar2.zzu.zzJ()) {
            zzooVar.zzb(zzopVar2.zzu.zzaU().currentTimeMillis(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzq() {
        zzg();
        if (this.f47620zzd == null) {
            this.f47620zzd = new com.google.android.gms.internal.measurement.zzcr(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zzf() {
        return false;
    }

    public final void zzm(boolean z) {
        zzg();
        this.f47621zze = z;
    }

    public final boolean zzp() {
        zzg();
        return this.f47621zze;
    }
}

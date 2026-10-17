package com.google.android.gms.internal.measurement;

import com.google.common.annotations.VisibleForTesting;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes16.dex */
public final class zzc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @VisibleForTesting
    final zzf f39883zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @VisibleForTesting
    zzg f39884zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @VisibleForTesting
    final zzab f39885zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzz f39886zzd;

    public zzc() {
        zzf zzfVar = new zzf();
        this.f39883zza = zzfVar;
        this.f39884zzb = zzfVar.f40022zzb.zza();
        this.f39885zzc = new zzab();
        this.f39886zzd = new zzz();
        zzfVar.f40024zzd.zza("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.zza
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzc.zzb(this.f39808zza);
            }
        });
        zzfVar.f40024zzd.zza("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.zzb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzk(this.f39850zza.f39885zzc);
            }
        });
    }

    public static /* synthetic */ zzai zzb(zzc zzcVar) {
        return new zzv(zzcVar.f39886zzd);
    }

    public final zzab zza() {
        return this.f39885zzc;
    }

    public final void zzc(zziv zzivVar) throws zzd {
        zzai zzaiVar;
        try {
            zzf zzfVar = this.f39883zza;
            this.f39884zzb = zzfVar.f40022zzb.zza();
            if (zzfVar.zza(this.f39884zzb, (zziz[]) zzivVar.zzc().toArray(new zziz[0])) instanceof zzag) {
                throw new IllegalStateException("Program loading failed");
            }
            for (zzit zzitVar : zzivVar.zza().zzd()) {
                List listZzc = zzitVar.zzc();
                String strZzb = zzitVar.zzb();
                Iterator it8 = listZzc.iterator();
                while (it8.hasNext()) {
                    zzap zzapVarZza = zzfVar.zza(this.f39884zzb, (zziz) it8.next());
                    if (!(zzapVarZza instanceof zzam)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    zzg zzgVar = this.f39884zzb;
                    if (zzgVar.zzh(strZzb)) {
                        zzap zzapVarZzd = zzgVar.zzd(strZzb);
                        if (!(zzapVarZzd instanceof zzai)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strZzb)));
                        }
                        zzaiVar = (zzai) zzapVarZzd;
                    } else {
                        zzaiVar = null;
                    }
                    if (zzaiVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strZzb)));
                    }
                    zzaiVar.zza(this.f39884zzb, Collections.singletonList(zzapVarZza));
                }
            }
        } catch (Throwable th10) {
            throw new zzd(th10);
        }
    }

    public final void zzd(String str, Callable callable) {
        this.f39883zza.f40024zzd.zza(str, callable);
    }

    public final boolean zze(zzaa zzaaVar) throws zzd {
        try {
            zzab zzabVar = this.f39885zzc;
            zzabVar.zzd(zzaaVar);
            this.f39883zza.f40023zzc.zzg("runtime.counter", new zzah(Double.valueOf(0.0d)));
            this.f39886zzd.zzb(this.f39884zzb.zza(), zzabVar);
            if (zzg()) {
                return true;
            }
            return zzf();
        } catch (Throwable th10) {
            throw new zzd(th10);
        }
    }

    public final boolean zzf() {
        return !this.f39885zzc.zzc().isEmpty();
    }

    public final boolean zzg() {
        zzab zzabVar = this.f39885zzc;
        return !zzabVar.zzb().equals(zzabVar.zza());
    }
}

package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public final class zzbl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzbo f45841zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean f45842zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private long f45843zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private long f45844zzd;

    public zzbl() {
        this.f45841zza = zzbo.zzb();
    }

    public static zzbl zzb(zzbo zzboVar) {
        zzbl zzblVar = new zzbl(zzboVar);
        zzblVar.zze();
        return zzblVar;
    }

    public static zzbl zzc(zzbo zzboVar) {
        return new zzbl(zzboVar);
    }

    private final long zzh() {
        return this.f45842zzb ? (this.f45841zza.zza() - this.f45844zzd) + this.f45843zzc : this.f45843zzc;
    }

    public final String toString() {
        String str;
        long jZzh = zzh();
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(jZzh, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(jZzh, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(jZzh, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(jZzh, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(jZzh, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(jZzh, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jZzh / timeUnit2.convert(1L, timeUnit)));
        switch (zzbk.f45840zza[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return a.o(str2, " ", str);
    }

    public final long zza(TimeUnit timeUnit) {
        return timeUnit.convert(zzh(), TimeUnit.NANOSECONDS);
    }

    public final zzbl zzd() {
        this.f45843zzc = 0L;
        this.f45842zzb = false;
        return this;
    }

    public final zzbl zze() {
        zzbj.zze(!this.f45842zzb, "This stopwatch is already running.");
        this.f45842zzb = true;
        this.f45844zzd = this.f45841zza.zza();
        return this;
    }

    public final zzbl zzf() {
        long jZza = this.f45841zza.zza();
        zzbj.zze(this.f45842zzb, "This stopwatch is already stopped.");
        this.f45842zzb = false;
        this.f45843zzc = (jZza - this.f45844zzd) + this.f45843zzc;
        return this;
    }

    public final boolean zzg() {
        return this.f45842zzb;
    }

    public zzbl(zzbo zzboVar) {
        zzbj.zzc(zzboVar, "ticker");
        this.f45841zza = zzboVar;
    }
}

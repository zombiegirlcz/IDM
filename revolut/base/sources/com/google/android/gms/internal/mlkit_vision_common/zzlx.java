package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class zzlx implements Closeable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Map f43370zza = new HashMap();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f43371zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f43372zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private double f43373zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private long f43374zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private long f43375zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private long f43376zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private long f43377zzh;

    private zzlx(String str) {
        this.f43376zzg = 2147483647L;
        this.f43377zzh = -2147483648L;
        this.f43371zzb = str;
    }

    private final void zza() {
        this.f43372zzc = 0;
        this.f43373zzd = 0.0d;
        this.f43374zze = 0L;
        this.f43376zzg = 2147483647L;
        this.f43377zzh = -2147483648L;
    }

    public static zzlx zze(String str) {
        zzmw.zza();
        if (!zzmw.zzb()) {
            return zzlv.f43369zza;
        }
        Map map = f43370zza;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new zzlx("detectorTaskWithResource#run"));
        }
        return (zzlx) map.get("detectorTaskWithResource#run");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j2 = this.f43374zze;
        if (j2 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        zzd(j2);
    }

    public zzlx zzb() {
        this.f43374zze = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void zzc(long j2) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j3 = this.f43375zzf;
        if (j3 != 0 && jElapsedRealtimeNanos - j3 >= 1000000) {
            zza();
        }
        this.f43375zzf = jElapsedRealtimeNanos;
        this.f43372zzc++;
        this.f43373zzd += j2;
        this.f43376zzg = Math.min(this.f43376zzg, j2);
        this.f43377zzh = Math.max(this.f43377zzh, j2);
        if (this.f43372zzc % 50 == 0) {
            Locale locale = Locale.US;
            zzmw.zza();
        }
        if (this.f43372zzc % 500 == 0) {
            zza();
        }
    }

    public void zzd(long j2) {
        zzc((SystemClock.elapsedRealtimeNanos() / 1000) - j2);
    }
}

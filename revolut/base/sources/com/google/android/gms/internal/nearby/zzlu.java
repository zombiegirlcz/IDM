package com.google.android.gms.internal.nearby;

import androidx.collection.SimpleArrayMap;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public final class zzlu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final ExecutorService f45429zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final SimpleArrayMap f45430zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private volatile boolean f45431zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final SimpleArrayMap f45432zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final SimpleArrayMap f45433zze;

    public zzlu() {
        zzg.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(6, 6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f45429zza = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f45430zzb = new SimpleArrayMap();
        this.f45431zzc = false;
        this.f45432zzd = new SimpleArrayMap();
        this.f45433zze = new SimpleArrayMap();
    }

    public static /* bridge */ /* synthetic */ void zza(zzlu zzluVar, OutputStream outputStream, boolean z, long j2) {
        try {
            outputStream.write(z ? 1 : 0);
        } catch (IOException e) {
            String.format("Unable to deliver status for Payload %d", Long.valueOf(j2));
        } finally {
            IOUtils.closeQuietly(outputStream);
        }
    }

    public final synchronized void zzb(long j2) {
        SimpleArrayMap simpleArrayMap = this.f45430zzb;
        Long lValueOf = Long.valueOf(j2);
        IOUtils.closeQuietly((Closeable) simpleArrayMap.get(lValueOf));
        this.f45430zzb.remove(lValueOf);
        IOUtils.closeQuietly((Closeable) this.f45432zzd.get(lValueOf));
        this.f45432zzd.remove(lValueOf);
        zzmc zzmcVar = (zzmc) this.f45433zze.remove(lValueOf);
        if (zzmcVar != null) {
            IOUtils.closeQuietly(zzmcVar.zze());
            IOUtils.closeQuietly(zzmcVar.zzf());
        }
    }

    public final synchronized void zzc(InputStream inputStream, OutputStream outputStream, OutputStream outputStream2, zzmc zzmcVar, long j2) throws Throwable {
        try {
            try {
                SimpleArrayMap simpleArrayMap = this.f45430zzb;
                Long lValueOf = Long.valueOf(j2);
                simpleArrayMap.put(lValueOf, inputStream);
                this.f45432zzd.put(lValueOf, outputStream);
                this.f45433zze.put(lValueOf, zzmcVar);
                this.f45429zza.execute(new zzlt(this, inputStream, outputStream, j2, outputStream2));
            } catch (Throwable th10) {
                th = th10;
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
            throw th;
        }
    }

    public final synchronized void zzd() {
        try {
            this.f45431zzc = true;
            this.f45429zza.shutdownNow();
            for (int i = 0; i < this.f45430zzb.getSize(); i++) {
                IOUtils.closeQuietly((Closeable) this.f45430zzb.valueAt(i));
            }
            this.f45430zzb.clear();
            for (int i2 = 0; i2 < this.f45432zzd.getSize(); i2++) {
                IOUtils.closeQuietly((Closeable) this.f45432zzd.valueAt(i2));
            }
            this.f45432zzd.clear();
            for (int i3 = 0; i3 < this.f45433zze.getSize(); i3++) {
                zzmc zzmcVar = (zzmc) this.f45433zze.valueAt(i3);
                IOUtils.closeQuietly(zzmcVar.zze());
                IOUtils.closeQuietly(zzmcVar.zzf());
            }
            this.f45433zze.clear();
        } catch (Throwable th10) {
            throw th10;
        }
    }
}

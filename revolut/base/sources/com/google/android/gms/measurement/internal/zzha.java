package com.google.android.gms.measurement.internal;

import android.content.Context;
import ch.qos.logback.core.spi.ComponentTracker;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes16.dex */
public final class zzha {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzha f47019zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzio f47020zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final TelemetryLoggingClient f47021zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final AtomicLong f47022zzd = new AtomicLong(-1);

    private zzha(Context context, zzio zzioVar) {
        this.f47021zzc = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("measurement:api").build());
        this.f47020zzb = zzioVar;
    }

    public static zzha zza(zzio zzioVar) {
        if (f47019zza == null) {
            f47019zza = new zzha(zzioVar.zzaT(), zzioVar);
        }
        return f47019zza;
    }

    public final synchronized void zzc(int i, int i2, long j2, long j3, int i3) {
        final long jElapsedRealtime = this.f47020zzb.zzaU().elapsedRealtime();
        AtomicLong atomicLong = this.f47022zzd;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= ComponentTracker.DEFAULT_TIMEOUT) {
            return;
        }
        this.f47021zzc.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i2, 0, j2, j3, null, null, 0, i3)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.measurement.internal.zzgz
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc2) {
                this.f47005zza.f47022zzd.set(jElapsedRealtime);
            }
        });
    }
}

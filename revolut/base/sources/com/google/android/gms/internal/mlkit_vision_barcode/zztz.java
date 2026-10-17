package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class zztz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final TelemetryLoggingClient f42460zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final AtomicLong f42461zzb = new AtomicLong(-1);

    public zztz(Context context, String str) {
        this.f42460zza = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("mlkit:vision").build());
    }

    public static zztz zza(Context context) {
        return new zztz(context, "mlkit:vision");
    }

    public final /* synthetic */ void zzb(long j2, Exception exc2) {
        this.f42461zzb.set(j2);
    }

    public final synchronized void zzc(int i, int i2, long j2, long j3) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f42461zzb.get() != -1 && jElapsedRealtime - this.f42461zzb.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f42460zza.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, 0, j2, j3, null, null, 0)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzty
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc2) {
                this.f42458zza.zzb(jElapsedRealtime, exc2);
            }
        });
    }
}

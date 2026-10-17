package com.google.android.gms.internal.mlkit_vision_face;

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
public final class zzoe {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final TelemetryLoggingClient f44375zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final AtomicLong f44376zzb = new AtomicLong(-1);

    public zzoe(Context context, String str) {
        this.f44375zza = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("mlkit:vision").build());
    }

    public static zzoe zza(Context context) {
        return new zzoe(context, "mlkit:vision");
    }

    public final /* synthetic */ void zzb(long j2, Exception exc2) {
        this.f44376zzb.set(j2);
    }

    public final synchronized void zzc(int i, int i2, long j2, long j3) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f44376zzb.get() != -1 && jElapsedRealtime - this.f44376zzb.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f44375zza.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, 0, j2, j3, null, null, 0)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzod
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc2) {
                this.f44373zza.zzb(jElapsedRealtime, exc2);
            }
        });
    }
}

package com.google.android.gms.measurement.internal;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes16.dex */
final class zzou {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Clock f47630zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private long f47631zzb;

    public zzou(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.f47630zza = clock;
    }

    public final void zza() {
        this.f47631zzb = 0L;
    }

    public final void zzb() {
        this.f47631zzb = this.f47630zza.elapsedRealtime();
    }

    public final boolean zzc(long j2) {
        return this.f47631zzb == 0 || this.f47630zza.elapsedRealtime() - this.f47631zzb >= CoreConstants.MILLIS_IN_ONE_HOUR;
    }
}

package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.DailySummariesConfig;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Reserved({1000})
public final class zzbc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzbe f45100zza = new zzbe(null);

    public final zzbc zza(DailySummariesConfig dailySummariesConfig) {
        this.f45100zza.f45102zzb = dailySummariesConfig;
        return this;
    }

    public final zzbc zzb(zzcs zzcsVar) {
        this.f45100zza.f45101zza = zzcsVar;
        return this;
    }

    public final zzbe zzc() {
        return this.f45100zza;
    }
}

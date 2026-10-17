package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
public final class zza {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private long f46542zza = Long.MIN_VALUE;

    public final zza zza(long j2) {
        Preconditions.checkArgument(j2 >= 0, "intervalMillis can't be negative.");
        this.f46542zza = j2;
        return this;
    }

    public final zzb zzb() {
        Preconditions.checkState(this.f46542zza != Long.MIN_VALUE, "Must set intervalMillis.");
        return new zzb(this.f46542zza, true, null, null, null, false, null, 0L, null);
    }
}

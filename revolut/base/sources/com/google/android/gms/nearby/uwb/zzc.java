package com.google.android.gms.nearby.uwb;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public final class zzc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private int f48259zza = 0;

    public final zzc zza(int i) {
        this.f48259zza = i;
        return this;
    }

    public final zze zzb() {
        Preconditions.checkArgument(this.f48259zza != 0, "deviceType must be set.");
        return new zze(this.f48259zza, false, null, hashCode(), null);
    }
}

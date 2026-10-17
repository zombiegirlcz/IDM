package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Reserved({1000})
public final class zzeh {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzej f45137zza = new zzej(null);

    public final zzeh zza(boolean z) {
        this.f45137zza.f45139zzb = z;
        return this;
    }

    public final zzeh zzb(IStatusCallback iStatusCallback) {
        this.f45137zza.f45138zza = iStatusCallback;
        return this;
    }

    public final zzej zzc() {
        return this.f45137zza;
    }
}

package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Reserved({1000})
public final class zzel {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzen f45140zza = new zzen((zzem) null);

    public final zzel zza(IStatusCallback iStatusCallback) {
        this.f45140zza.f45141zza = iStatusCallback;
        return this;
    }

    public final zzen zzb() {
        return this.f45140zza;
    }
}

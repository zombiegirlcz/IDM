package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Reserved({1000})
public final class zzex {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzez f45148zza = new zzez((zzey) null);

    public final zzex zza(IStatusCallback iStatusCallback) {
        this.f45148zza.f45149zza = iStatusCallback;
        return this;
    }

    public final zzez zzb() {
        return this.f45148zza;
    }
}

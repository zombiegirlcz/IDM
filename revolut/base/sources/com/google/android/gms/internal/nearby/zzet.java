package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Reserved({1000})
public final class zzet {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzev f45145zza = new zzev(null);

    public final zzet zza(IStatusCallback iStatusCallback) {
        this.f45145zza.f45146zza = iStatusCallback;
        return this;
    }

    public final zzev zzb() {
        return this.f45145zza;
    }
}

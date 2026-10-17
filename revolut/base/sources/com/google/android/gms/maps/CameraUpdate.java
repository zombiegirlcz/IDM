package com.google.android.gms.maps;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes16.dex */
public final class CameraUpdate {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final IObjectWrapper f46578zza;

    public CameraUpdate(IObjectWrapper iObjectWrapper) {
        this.f46578zza = (IObjectWrapper) Preconditions.checkNotNull(iObjectWrapper);
    }

    @NonNull
    public final IObjectWrapper zza() {
        return this.f46578zza;
    }
}

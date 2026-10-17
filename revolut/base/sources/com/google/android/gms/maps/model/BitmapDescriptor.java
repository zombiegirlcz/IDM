package com.google.android.gms.maps.model;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes16.dex */
public final class BitmapDescriptor {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final IObjectWrapper f46623zza;

    public BitmapDescriptor(@NonNull IObjectWrapper iObjectWrapper) {
        this.f46623zza = (IObjectWrapper) Preconditions.checkNotNull(iObjectWrapper);
    }

    @NonNull
    public final IObjectWrapper zza() {
        return this.f46623zza;
    }
}

package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class zaci {
    public final RegisterListenerMethod zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    public final UnregisterListenerMethod f37910zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    public final Runnable f37911zac;

    public zaci(@NonNull RegisterListenerMethod registerListenerMethod, @NonNull UnregisterListenerMethod unregisterListenerMethod, @NonNull Runnable runnable) {
        this.zaa = registerListenerMethod;
        this.f37910zab = unregisterListenerMethod;
        this.f37911zac = runnable;
    }
}

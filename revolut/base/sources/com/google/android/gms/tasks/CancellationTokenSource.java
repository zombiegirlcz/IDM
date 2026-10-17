package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class CancellationTokenSource {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzb f48752zza = new zzb();

    public void cancel() {
        this.f48752zza.zza();
    }

    @NonNull
    public CancellationToken getToken() {
        return this.f48752zza;
    }
}

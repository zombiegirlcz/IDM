package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zaaf {
    private final ApiKey zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final TaskCompletionSource f37831zab = new TaskCompletionSource();

    public zaaf(ApiKey apiKey) {
        this.zaa = apiKey;
    }

    public final ApiKey zaa() {
        return this.zaa;
    }

    public final TaskCompletionSource zab() {
        return this.f37831zab;
    }
}

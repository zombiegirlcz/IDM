package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes16.dex */
final class zaab implements PendingResult.StatusListener {
    final /* synthetic */ BasePendingResult zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ zaad f37826zab;

    public zaab(zaad zaadVar, BasePendingResult basePendingResult) {
        this.f37826zab = zaadVar;
        this.zaa = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        this.f37826zab.zaa.remove(this.zaa);
    }
}

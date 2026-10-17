package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes16.dex */
final class zab implements zah {
    final /* synthetic */ Activity zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ Bundle f38405zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    final /* synthetic */ Bundle f38406zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    final /* synthetic */ DeferredLifecycleHelper f38407zad;

    public zab(DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.f38407zad = deferredLifecycleHelper;
        this.zaa = activity;
        this.f38405zab = bundle;
        this.f38406zac = bundle2;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 0;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(LifecycleDelegate lifecycleDelegate) {
        this.f38407zad.zaa.onInflate(this.zaa, this.f38405zab, this.f38406zac);
    }
}

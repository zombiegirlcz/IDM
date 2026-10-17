package com.google.android.gms.dynamic;

import android.os.Bundle;

/* JADX INFO: loaded from: classes16.dex */
final class zac implements zah {
    final /* synthetic */ Bundle zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ DeferredLifecycleHelper f38408zab;

    public zac(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        this.f38408zab = deferredLifecycleHelper;
        this.zaa = bundle;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 1;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(LifecycleDelegate lifecycleDelegate) {
        this.f38408zab.zaa.onCreate(this.zaa);
    }
}

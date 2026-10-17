package com.google.android.gms.dynamic;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
final class zaa implements OnDelegateCreatedListener {
    final /* synthetic */ DeferredLifecycleHelper zaa;

    public zaa(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(LifecycleDelegate lifecycleDelegate) {
        this.zaa.zaa = lifecycleDelegate;
        Iterator it8 = this.zaa.f38398zac.iterator();
        while (it8.hasNext()) {
            ((zah) it8.next()).zab(this.zaa.zaa);
        }
        this.zaa.f38398zac.clear();
        this.zaa.f38397zab = null;
    }
}

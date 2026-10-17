package ub;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;

/* JADX INFO: loaded from: classes23.dex */
public final class l implements DisposableEffectResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f278721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleEventObserver f278722b;

    public l(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        this.f278721a = lifecycle;
        this.f278722b = lifecycleEventObserver;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f278721a.removeObserver(this.f278722b);
    }
}

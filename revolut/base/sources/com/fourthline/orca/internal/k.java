package com.fourthline.orca.internal;

import androidx.lifecycle.ViewModelStoreOwner;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class k implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f30081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30082b;

    private k(d dVar, e4m.e eVar) {
        this.f30081a = dVar;
        this.f30082b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CoroutineScope get() {
        return a(this.f30081a, (ViewModelStoreOwner) this.f30082b.get());
    }

    public static k a(d dVar, e4m.e eVar) {
        return new k(dVar, eVar);
    }

    public static CoroutineScope a(d dVar, ViewModelStoreOwner viewModelStoreOwner) {
        CoroutineScope coroutineScopeA = dVar.a(viewModelStoreOwner);
        vc.s.k(coroutineScopeA);
        return coroutineScopeA;
    }
}

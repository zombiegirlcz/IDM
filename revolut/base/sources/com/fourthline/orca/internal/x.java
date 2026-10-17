package com.fourthline.orca.internal;

import androidx.lifecycle.ViewModelStoreOwner;

/* JADX INFO: loaded from: classes23.dex */
public final class x implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f34822a;

    private x(d dVar) {
        this.f34822a = dVar;
    }

    public static ViewModelStoreOwner b(d dVar) {
        ViewModelStoreOwner viewModelStoreOwnerO = dVar.o();
        vc.s.k(viewModelStoreOwnerO);
        return viewModelStoreOwnerO;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ViewModelStoreOwner get() {
        return b(this.f34822a);
    }

    public static x a(d dVar) {
        return new x(dVar);
    }
}

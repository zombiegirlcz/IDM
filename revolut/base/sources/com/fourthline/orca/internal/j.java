package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class j implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f29765a;

    private j(d dVar) {
        this.f29765a = dVar;
    }

    public static Context b(d dVar) {
        Context contextF = dVar.f();
        vc.s.k(contextF);
        return contextF;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return b(this.f29765a);
    }

    public static j a(d dVar) {
        return new j(dVar);
    }
}

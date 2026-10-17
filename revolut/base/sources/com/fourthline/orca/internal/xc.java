package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class xc implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wc f34946a;

    private xc(wc wcVar) {
        this.f34946a = wcVar;
    }

    public static Context b(wc wcVar) {
        Context contextA = wcVar.a();
        vc.s.k(contextA);
        return contextA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return b(this.f34946a);
    }

    public static xc a(wc wcVar) {
        return new xc(wcVar);
    }
}

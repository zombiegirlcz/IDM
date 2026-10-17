package com.fourthline.vision.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class gd implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ed f36249a;

    private gd(ed edVar) {
        this.f36249a = edVar;
    }

    public static e2 b(ed edVar) {
        e2 e2VarProvideDebugConsumer = edVar.provideDebugConsumer();
        vc.s.k(e2VarProvideDebugConsumer);
        return e2VarProvideDebugConsumer;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e2 get() {
        return b(this.f36249a);
    }

    public static gd a(ed edVar) {
        return new gd(edVar);
    }
}

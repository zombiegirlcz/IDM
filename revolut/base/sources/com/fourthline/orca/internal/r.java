package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class r implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f32562a;

    private r(d dVar) {
        this.f32562a = dVar;
    }

    public static Function0 b(d dVar) {
        Function0 function0K = dVar.k();
        vc.s.k(function0K);
        return function0K;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return b(this.f32562a);
    }

    public static r a(d dVar) {
        return new r(dVar);
    }
}

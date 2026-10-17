package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class t implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f33165a;

    private t(d dVar) {
        this.f33165a = dVar;
    }

    public static Function0 b(d dVar) {
        Function0 function0L = dVar.l();
        vc.s.k(function0L);
        return function0L;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return b(this.f33165a);
    }

    public static t a(d dVar) {
        return new t(dVar);
    }
}

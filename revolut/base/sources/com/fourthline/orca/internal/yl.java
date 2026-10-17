package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class yl implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ol f35373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35374b;

    private yl(ol olVar, e4m.e eVar) {
        this.f35373a = olVar;
        this.f35374b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Function0 get() {
        return a(this.f35373a, (r70) this.f35374b.get());
    }

    public static yl a(ol olVar, e4m.e eVar) {
        return new yl(olVar, eVar);
    }

    public static Function0 a(ol olVar, r70 r70Var) {
        Function0 function0A = olVar.a(r70Var);
        vc.s.k(function0A);
        return function0A;
    }
}

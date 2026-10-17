package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class vd0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd0 f34339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34340b;

    private vd0(pd0 pd0Var, e4m.e eVar) {
        this.f34339a = pd0Var;
        this.f34340b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wr get() {
        return a(this.f34339a, (CoroutineScope) this.f34340b.get());
    }

    public static vd0 a(pd0 pd0Var, e4m.e eVar) {
        return new vd0(pd0Var, eVar);
    }

    public static wr a(pd0 pd0Var, CoroutineScope coroutineScope) {
        wr wrVarA = pd0Var.a(coroutineScope);
        vc.s.k(wrVarA);
        return wrVarA;
    }
}

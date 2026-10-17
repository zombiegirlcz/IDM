package com.fourthline.vision.internal;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes23.dex */
public final class kd implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ed f36453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f36455c;
    private final e4m.e d;

    private kd(ed edVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f36453a = edVar;
        this.f36454b = eVar;
        this.f36455c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public t7 get() {
        return a(this.f36453a, (CoroutineContext) this.f36454b.get(), (y6) this.f36455c.get(), (a) this.d.get());
    }

    public static kd a(ed edVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new kd(edVar, eVar, eVar2, eVar3);
    }

    public static t7 a(ed edVar, CoroutineContext coroutineContext, y6 y6Var, a aVar) {
        t7 t7VarProvideIsSteadyDataSource = edVar.provideIsSteadyDataSource(coroutineContext, y6Var, aVar);
        vc.s.k(t7VarProvideIsSteadyDataSource);
        return t7VarProvideIsSteadyDataSource;
    }
}

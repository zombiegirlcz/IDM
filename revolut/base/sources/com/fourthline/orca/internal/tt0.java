package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class tt0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f33868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33869b;

    private tt0(lt0 lt0Var, e4m.e eVar) {
        this.f33868a = lt0Var;
        this.f33869b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public oj0 get() {
        return a(this.f33868a, (Context) this.f33869b.get());
    }

    public static tt0 a(lt0 lt0Var, e4m.e eVar) {
        return new tt0(lt0Var, eVar);
    }

    public static oj0 a(lt0 lt0Var, Context context) {
        oj0 oj0VarB = lt0Var.b(context);
        vc.s.k(oj0VarB);
        return oj0VarB;
    }
}

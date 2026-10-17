package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class oa implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ja f31611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31612b;

    private oa(ja jaVar, e4m.e eVar) {
        this.f31611a = jaVar;
        this.f31612b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p71 get() {
        return a(this.f31611a, (Function0) this.f31612b.get());
    }

    public static oa a(ja jaVar, e4m.e eVar) {
        return new oa(jaVar, eVar);
    }

    public static p71 a(ja jaVar, Function0 function0) {
        p71 p71VarA = jaVar.a(function0);
        vc.s.k(p71VarA);
        return p71VarA;
    }
}

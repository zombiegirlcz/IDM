package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class pa implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ja f31895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31896b;

    private pa(ja jaVar, e4m.e eVar) {
        this.f31895a = jaVar;
        this.f31896b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ce1 get() {
        return a(this.f31895a, (Function0) this.f31896b.get());
    }

    public static pa a(ja jaVar, e4m.e eVar) {
        return new pa(jaVar, eVar);
    }

    public static ce1 a(ja jaVar, Function0 function0) {
        ce1 ce1VarB = jaVar.b(function0);
        vc.s.k(ce1VarB);
        return ce1VarB;
    }
}

package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class be implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xd f27101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27103c;

    private be(xd xdVar, e4m.e eVar, e4m.e eVar2) {
        this.f27101a = xdVar;
        this.f27102b = eVar;
        this.f27103c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public jf get() {
        return a(this.f27101a, (kf) this.f27102b.get(), (Function0) this.f27103c.get());
    }

    public static be a(xd xdVar, e4m.e eVar, e4m.e eVar2) {
        return new be(xdVar, eVar, eVar2);
    }

    public static jf a(xd xdVar, kf kfVar, Function0 function0) {
        jf jfVarA = xdVar.a(kfVar, function0);
        vc.s.k(jfVarA);
        return jfVarA;
    }
}

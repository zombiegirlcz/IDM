package com.fourthline.vision.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class cf implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final af f36078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36079b;

    private cf(af afVar, e4m.e eVar) {
        this.f36078a = afVar;
        this.f36079b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public df get() {
        return a(this.f36078a, (b0) this.f36079b.get());
    }

    public static cf a(af afVar, e4m.e eVar) {
        return new cf(afVar, eVar);
    }

    public static df a(af afVar, b0 b0Var) {
        df dfVarProvideVisionInfo = afVar.provideVisionInfo(b0Var);
        vc.s.k(dfVarProvideVisionInfo);
        return dfVarProvideVisionInfo;
    }
}

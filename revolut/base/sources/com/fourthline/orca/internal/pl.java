package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class pl implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ol f31990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31991b;

    private pl(ol olVar, e4m.e eVar) {
        this.f31990a = olVar;
        this.f31991b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wf get() {
        return a(this.f31990a, (ml) this.f31991b.get());
    }

    public static pl a(ol olVar, e4m.e eVar) {
        return new pl(olVar, eVar);
    }

    public static wf a(ol olVar, ml mlVar) {
        wf wfVarA = olVar.a(mlVar);
        vc.s.k(wfVarA);
        return wfVarA;
    }
}

package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class cy implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx f27588a;

    private cy(wx wxVar) {
        this.f27588a = wxVar;
    }

    public static sy b(wx wxVar) {
        sy syVarE = wxVar.e();
        vc.s.k(syVarE);
        return syVarE;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public sy get() {
        return b(this.f27588a);
    }

    public static cy a(wx wxVar) {
        return new cy(wxVar);
    }
}

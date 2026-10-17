package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class yx implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx f35450a;

    private yx(wx wxVar) {
        this.f35450a = wxVar;
    }

    public static r70 b(wx wxVar) {
        r70 r70VarB = wxVar.b();
        vc.s.k(r70VarB);
        return r70VarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r70 get() {
        return b(this.f35450a);
    }

    public static yx a(wx wxVar) {
        return new yx(wxVar);
    }
}

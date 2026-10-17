package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class dy implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx f27946a;

    private dy(wx wxVar) {
        this.f27946a = wxVar;
    }

    public static gf1 b(wx wxVar) {
        gf1 gf1VarF = wxVar.f();
        vc.s.k(gf1VarF);
        return gf1VarF;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gf1 get() {
        return b(this.f27946a);
    }

    public static dy a(wx wxVar) {
        return new dy(wxVar);
    }
}

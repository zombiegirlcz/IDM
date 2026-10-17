package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class zx implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx f35745a;

    private zx(wx wxVar) {
        this.f35745a = wxVar;
    }

    public static mb.d b(wx wxVar) {
        mb.d dVarC = wxVar.c();
        vc.s.k(dVarC);
        return dVarC;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public mb.d get() {
        return b(this.f35745a);
    }

    public static zx a(wx wxVar) {
        return new zx(wxVar);
    }
}

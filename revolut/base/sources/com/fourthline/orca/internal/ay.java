package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ay implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx f26935a;

    private ay(wx wxVar) {
        this.f26935a = wxVar;
    }

    public static zq0 b(wx wxVar) {
        zq0 zq0VarD = wxVar.d();
        vc.s.k(zq0VarD);
        return zq0VarD;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zq0 get() {
        return b(this.f26935a);
    }

    public static ay a(wx wxVar) {
        return new ay(wxVar);
    }
}

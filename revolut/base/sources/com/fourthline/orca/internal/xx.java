package com.fourthline.orca.internal;

import com.fourthline.orca.Orca;

/* JADX INFO: loaded from: classes23.dex */
public final class xx implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx f35104a;

    private xx(wx wxVar) {
        this.f35104a = wxVar;
    }

    public static Orca.a b(wx wxVar) {
        Orca.a aVarA = wxVar.a();
        vc.s.k(aVarA);
        return aVarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Orca.a get() {
        return b(this.f35104a);
    }

    public static xx a(wx wxVar) {
        return new xx(wxVar);
    }
}

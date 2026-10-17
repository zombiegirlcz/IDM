package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class rp implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f32793a;

    private rp(hp hpVar) {
        this.f32793a = hpVar;
    }

    public static om b(hp hpVar) {
        om omVarA = hpVar.a();
        vc.s.k(omVarA);
        return omVarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public om get() {
        return b(this.f32793a);
    }

    public static rp a(hp hpVar) {
        return new rp(hpVar);
    }
}

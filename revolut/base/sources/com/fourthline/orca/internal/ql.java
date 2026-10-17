package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ql implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ol f32473a;

    private ql(ol olVar) {
        this.f32473a = olVar;
    }

    public static bg b(ol olVar) {
        bg bgVarA = olVar.a();
        vc.s.k(bgVarA);
        return bgVarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bg get() {
        return b(this.f32473a);
    }

    public static ql a(ol olVar) {
        return new ql(olVar);
    }
}

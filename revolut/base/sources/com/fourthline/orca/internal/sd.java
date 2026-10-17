package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class sd implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rd f32986a;

    private sd(rd rdVar) {
        this.f32986a = rdVar;
    }

    public static c80 b(rd rdVar) {
        c80 c80VarA = rdVar.a();
        vc.s.k(c80VarA);
        return c80VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c80 get() {
        return b(this.f32986a);
    }

    public static sd a(rd rdVar) {
        return new sd(rdVar);
    }
}

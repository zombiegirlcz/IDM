package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class pw implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ow f32063a;

    private pw(ow owVar) {
        this.f32063a = owVar;
    }

    public static fq0 b(ow owVar) {
        fq0 fq0VarA = owVar.a();
        vc.s.k(fq0VarA);
        return fq0VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fq0 get() {
        return b(this.f32063a);
    }

    public static pw a(ow owVar) {
        return new pw(owVar);
    }
}

package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class j71 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i71 f29822a;

    private j71(i71 i71Var) {
        this.f29822a = i71Var;
    }

    public static f71 b(i71 i71Var) {
        f71 f71VarA = i71Var.a();
        vc.s.k(f71VarA);
        return f71VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f71 get() {
        return b(this.f29822a);
    }

    public static j71 a(i71 i71Var) {
        return new j71(i71Var);
    }
}

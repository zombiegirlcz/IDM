package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class co implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vn f27528a;

    private co(vn vnVar) {
        this.f27528a = vnVar;
    }

    public static jq0 b(vn vnVar) {
        jq0 jq0VarA = vnVar.a();
        vc.s.k(jq0VarA);
        return jq0VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public jq0 get() {
        return b(this.f27528a);
    }

    public static co a(vn vnVar) {
        return new co(vnVar);
    }
}

package jxk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends wwk.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wwk.e f179243c;
    public final e d;

    public a(wwk.e view, e presenterDelegate) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(presenterDelegate, "presenterDelegate");
        this.f179243c = view;
        this.d = presenterDelegate;
    }

    @Override // yji.d
    public final void M() {
        this.d.C(this.f179243c);
    }

    @Override // yji.d
    public final void N() {
        this.d.l();
    }
}

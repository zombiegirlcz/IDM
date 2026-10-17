package h5b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f149531c;
    public final b d;

    public l(f view, b controllerModelApi) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelApi, "controllerModelApi");
        this.f149531c = view;
        this.d = controllerModelApi;
    }

    @Override // yji.d
    public final void M() {
        f fVar = this.f149531c;
        yji.d.H(this, new h23.b(rd0.e.b(fVar.f().d.f121375b), 8), new j(this, null), 3);
        yji.d.H(this, new h23.b(rd0.e.b(fVar.f().r()), 9), new k(this, null), 3);
    }
}

package ctk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f108695c;
    public final e d;

    public p(g delegates, e controllerModelExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f108695c = delegates;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        g gVar = this.f108695c;
        yji.d.H(this, new cbf.c(rd0.e.b(gVar.f108686b.f108684a.q()), 20), new o(this, null, 0), 3);
        yji.d.H(this, new cbf.c(rd0.e.b(gVar.f108685a.f52707c), 21), new o(this, null, 1), 3);
    }
}

package kcf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends ocf.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ocf.c f182725c;
    public final ocf.b d;

    public d(ocf.c screen, ocf.b controllerModelExtension) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f182725c = screen;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        ocf.c cVar = this.f182725c;
        yji.d.H(this, new jij.d(rd0.e.b(cVar.M1().f51699c), 27), new c(this, null, 0), 3);
        yji.d.H(this, new jij.d(rd0.e.b(cVar.M1().e), 28), new c(this, null, 1), 3);
    }
}

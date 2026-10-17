package isl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f168313c;
    public final b d;

    public j(h screen, b controllerModelExtension) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f168313c = screen;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new iqh.d(rd0.e.b(this.f168313c.getX().d), 7), new ibg.g(this, null, 28), 3);
    }
}

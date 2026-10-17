package a5e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f1370c;
    public final c d;

    public i(b controllerModelExtension, c delegates) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f1370c = controllerModelExtension;
        this.d = delegates;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new a15.d(rd0.e.b(this.d.f1362a.f52339c.f121375b), 3), new a0l.k(this, null, 10), 3);
    }
}

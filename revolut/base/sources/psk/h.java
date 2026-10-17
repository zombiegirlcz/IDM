package psk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f239504c;
    public final d d;

    public h(b controllerModelExtension, d delegates) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f239504c = controllerModelExtension;
        this.d = delegates;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new p73.d(rd0.e.b(this.d.f239498b.f52707c), 24), new pqc.k(this, null, 8), 3);
    }
}

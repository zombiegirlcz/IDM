package u4e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f277326c;
    public final c d;

    public h(b controllerModelExtension, c delegates) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f277326c = controllerModelExtension;
        this.d = delegates;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new tzh.g(rd0.e.b(this.d.f277320a.f53336c.f121375b), 3), new g(this, null), 3);
    }
}

package h87;

import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f149963c;
    public final c d;

    public p(d delegates, c controllerModelExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f149963c = delegates;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        d dVar = this.f149963c;
        yji.d.H(this, rd0.e.b(w.a0(dVar.f149949b.f52707c, new h5i.b(22))), new o(this, null, 0), 3);
        yji.d.H(this, new h23.b(rd0.e.b(dVar.f149948a.f52371h.f121375b), 11), new o(this, null, 1), 3);
        yji.d.H(this, new h23.b(rd0.e.b(dVar.f149950c.f53218h), 12), new o(this, null, 2), 3);
    }
}

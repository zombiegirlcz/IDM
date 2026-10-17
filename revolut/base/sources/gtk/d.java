package gtk;

import ftk.k;
import ftk.l;
import g9j.q;
import kotlin.jvm.internal.Intrinsics;
import mwk.g;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f146625c;
    public final k d;

    public d(g view, k model) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f146625c = view;
        this.d = model;
    }

    @Override // yji.d
    public final void M() {
        g gVar = this.f146625c;
        yji.d.H(this, new q(rd0.e.b(gVar.f209495a.f53336c.f121375b), 23), new c(this, null, 0), 3);
        yji.d.H(this, new q(rd0.e.b(gVar.f209496b.f52371h.f121375b), 24), new c(this, null, 1), 3);
    }
}

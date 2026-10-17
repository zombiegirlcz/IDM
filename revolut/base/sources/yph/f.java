package yph;

import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f315896c;
    public final h d;

    public f(g delegates, h modelExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        this.f315896c = delegates;
        this.d = modelExtension;
    }

    @Override // yji.d
    public final void M() {
        g gVar = this.f315896c;
        yji.d.H(this, new b(rd0.e.b(gVar.f315898b.f51611c.f121375b), 0), new e(this, null, 0), 3);
        yji.d.H(this, new y5j.e(q.q(rd0.e.b(gVar.f315899c.f53139c)), 19), new e(this, null, 1), 3);
        yji.d.H(this, new b(rd0.e.b(gVar.d.r()), 1), new e(this, null, 2), 3);
    }
}

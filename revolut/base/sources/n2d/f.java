package n2d;

import kotlin.jvm.internal.Intrinsics;
import lfg.d0;
import vkm.q;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1d.b f211523c;
    public final m1d.a d;

    public f(m1d.b view, m1d.a model) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f211523c = view;
        this.d = model;
    }

    @Override // yji.d
    public final void M() {
        m1d.b bVar = this.f211523c;
        yji.d.H(this, rd0.e.b(bVar.c().f53218h), new c(this, null), 3);
        yji.d.H(this, rd0.e.b(bVar.c().f53220l), new d(this, null), 3);
        yji.d.H(this, new an9.g(q.J(bVar.d0(), bVar.c1()), 19), new e(this, null, 0), 3);
        yji.d.H(this, new d0(bVar.x(), 15), new e(this, null, 1), 3);
    }
}

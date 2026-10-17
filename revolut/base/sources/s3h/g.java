package s3h;

import kotlin.jvm.internal.Intrinsics;
import ryj.w;
import vkm.q;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends s2h.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s2h.f f259681c;
    public final s2h.e d;

    public g(s2h.f screen, s2h.e model) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f259681c = screen;
        this.d = model;
    }

    @Override // yji.d
    public final void M() {
        s2h.f fVar = this.f259681c;
        yji.d.H(this, new an9.g(q.J(new w(rd0.e.b(fVar.l().f52692c), 4), new w(rd0.e.b(fVar.o().e.f121375b), 5), new w(rd0.e.b(fVar.b().d), 6), new w(rd0.e.b(fVar.o().f.f121375b), 7)), 28), new f(this, null), 3);
    }
}

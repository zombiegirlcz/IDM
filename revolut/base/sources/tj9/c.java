package tj9;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import te0.w;
import ti9.g;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h implements dli.b {
    public final xh9.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f271612p;

    public c(e stateMapper, xh9.a payLaterInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        this.o = payLaterInteractor;
        this.f271612p = mra.d.b(this, new b(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        g gVar = (g) this.o;
        l.a1(this, rd0.e.b(w.l(nim.a.w(rd0.e.c(gVar.k(w4l.h.f294642c), kotlin.coroutines.g.f186406a), new tif.g(5)), gVar.i())), null, null, new t9h.b(this, null, 20), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f271612p;
    }
}

package wt4;

import al4.q;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import om4.y3;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends oki.h implements dli.b {
    public final q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final al4.n f299782p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f299783q;

    public n(q creditCardProductInteractor, al4.n creditCardInteractor, o stateMapper) {
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = creditCardProductInteractor;
        this.f299782p = creditCardInteractor;
        this.f299783q = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.n(vkm.q.q(boh.f.e(nim.a.v(((y3) this.o).e(w4l.j.f294644c, true), new wsg.a(12)), new wpj.b(this, 10))), h0.f322473a), null, null, new wka.e(this, null, 24), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f299783q;
    }
}

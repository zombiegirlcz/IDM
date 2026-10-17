package hwf;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import ivf.r;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends oki.h implements d {
    public final ouf.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f156172p;

    public g(ouf.a transportInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(transportInteractor, "transportInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = transportInteractor;
        this.f156172p = mra.d.b(this, new c(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, nim.a.v(((r) this.o).b(), new b(1)), null, null, new hp2.d(this, null, 16), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f156172p;
    }
}

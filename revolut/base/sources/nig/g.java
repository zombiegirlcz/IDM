package nig;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import n68.x;
import vfg.t;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends oki.h implements b {
    public final gfg.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dgg.c f216103p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f216104q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.f f216105r;

    public g(n stateMapper, gfg.c travelMilesTransactionsPagingInteractor, dgg.c flowModel) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(travelMilesTransactionsPagingInteractor, "travelMilesTransactionsPagingInteractor");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        this.o = travelMilesTransactionsPagingInteractor;
        this.f216103p = flowModel;
        this.f216104q = mra.d.b(this, new a(0), stateMapper, null, false, 12);
        this.f216105r = v0.a.d("create(...)");
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(((t) this.o).f288641c), null, null, new f(this, null, 0), 3);
        l2(new x(this, null, 14), new yi5.b(26));
        l.a1(this, ((com.revolut.feature.travel.miles.impl.ui.flow.b) this.f216103p).u, null, null, new f(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f216104q;
    }
}

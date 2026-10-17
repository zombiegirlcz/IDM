package obc;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends oki.h implements k {
    public final tul.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f223924p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f223925q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f223926r;

    public m(tul.b trackingInteractor, n searchProvider, i3g.k stateMapper) {
        Intrinsics.checkNotNullParameter(trackingInteractor, "trackingInteractor");
        Intrinsics.checkNotNullParameter(searchProvider, "searchProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = trackingInteractor;
        this.f223924p = searchProvider;
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f223925q = z1VarB;
        this.f223926r = mra.d.b(this, new h(new Data(null, null, true, 3, null), ""), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, c6d.b.i(q.Q(this.f223925q, new ns9.h(continuation, this, 20)), new nzj.n(1, this, m.class, "observeQueriedCarrierState", "observeQueriedCarrierState(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", 0, 23)), null, null, new o95.c(this, continuation, 4), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f223926r;
    }
}

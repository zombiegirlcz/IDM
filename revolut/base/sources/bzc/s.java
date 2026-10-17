package bzc;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends oki.h implements dli.b {
    public final kpj.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zq.a f19974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xyc.a f19975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f19976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cli.y f19977s;

    public s(boolean z, d0 mapper, kpj.f sotInteractor, zq.a sotTransactionsDelegate, xyc.a flowReviewStateCalculator) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(sotInteractor, "sotInteractor");
        Intrinsics.checkNotNullParameter(sotTransactionsDelegate, "sotTransactionsDelegate");
        Intrinsics.checkNotNullParameter(flowReviewStateCalculator, "flowReviewStateCalculator");
        this.o = sotInteractor;
        this.f19974p = sotTransactionsDelegate;
        this.f19975q = flowReviewStateCalculator;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f19976r = z1VarB;
        this.f19977s = mra.d.b(this, new j(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), z), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        q qVar = new q(0, this, continuation);
        z1 z1Var = this.f19976r;
        yji.l.b1(this, vkm.q.Q(z1Var, qVar), null, new r(0, this, null), 3);
        yji.l.b1(this, vkm.q.Q(z1Var, new q(1, this, continuation)), null, new r(1, this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f19977s;
    }
}

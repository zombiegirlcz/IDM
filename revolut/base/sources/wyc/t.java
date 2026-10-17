package wyc;

import com.revolut.data.model.Data;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends oki.h implements dli.b {
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final IncomeSource f301226p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f301227q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kpj.f f301228r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f301229s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f301230t;
    public final cli.y u;

    public t(String transactionId, IncomeSource incomeSource, boolean z, d0 mapper, kpj.f sotInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(sotInteractor, "sotInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.o = transactionId;
        this.f301226p = incomeSource;
        this.f301227q = z;
        this.f301228r = sotInteractor;
        this.f301229s = transactionsInteractor;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f301230t = z1VarB;
        this.u = mra.d.b(this, new j(transactionId, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), incomeSource), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        q qVar = new q(0, continuation, this);
        z1 z1Var = this.f301230t;
        yji.l.b1(this, vkm.q.Q(z1Var, qVar), null, new s(0, null, this), 3);
        yji.l.b1(this, vkm.q.Q(z1Var, new q(1, continuation, this)), null, new s(1, null, this), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}

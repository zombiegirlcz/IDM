package mmf;

import ael.l0;
import ba4.x;
import chc.c0;
import ckf.e;
import cmf.f;
import cmf.p;
import hmf.k0;
import kkf.k1;
import kkf.l8;
import kkf.m5;
import kkf.o1;
import klf.h0;
import klf.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import qkf.h;
import qkf.m;
import vkm.q;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends hmf.a {
    public final h0 e;
    public final slf.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.c f207209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f207210h;
    public final k1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l8 f207211j;
    public final m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f207212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o1 f207213m;

    public b(h0 commonDataSource, slf.c headerProvider, amf.c hideTransactionMenuOptionProvider, e actionsProvider, k1 fromBlockProvider, l8 toAccountBlockProvider, m transactionHashBlockProvider, h detailsBlockProvider, o1 getHelpBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(headerProvider, "headerProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(actionsProvider, "actionsProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        Intrinsics.checkNotNullParameter(transactionHashBlockProvider, "transactionHashBlockProvider");
        Intrinsics.checkNotNullParameter(detailsBlockProvider, "detailsBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        this.e = commonDataSource;
        this.f = headerProvider;
        this.f207209g = hideTransactionMenuOptionProvider;
        this.f207210h = actionsProvider;
        this.i = fromBlockProvider;
        this.f207211j = toAccountBlockProvider;
        this.k = transactionHashBlockProvider;
        this.f207212l = detailsBlockProvider;
        this.f207213m = getHelpBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.i.Z2();
        p pVarZ22 = this.f207211j.Z2();
        m mVar = this.k;
        p pVarA = k0.a(pVarZ2, pVarZ22, new p(new pkg.e(mVar.f247000a.d(), mVar, 27), new c0(23), u.c(mVar.f247002c), "DeFiTransactionHash"));
        h hVar = this.f207212l;
        SharedFlow sharedFlowD = hVar.f246996a.d();
        z0 z0Var = hVar.d;
        return h(v.k(pVarA, new p(new t38.e(sharedFlowD, 24, q.Q(z0Var.f185613a.h(new kkk.u(8)), new m5(null, z0Var, 18)), new l0(3, hVar, h.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/data/model/Data;)Ljava/util/List;", 4, 29)), new c0(23), u.c(hVar.f), "DeFiExchangeDetails"), this.f207213m.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.a();
    }

    @Override // hmf.b0
    public final Flow d() {
        e eVar = this.f207210h;
        return f(u.c(new f(new x(eVar.f24830l.d(), eVar, 25), u.c(eVar), "DeFiExchangeActions")));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(u.c(this.f207209g.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}

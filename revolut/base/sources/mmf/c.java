package mmf;

import bbk.z;
import chc.c0;
import ckf.i;
import cmf.f;
import hmf.k0;
import kkf.k1;
import kkf.m5;
import kkf.o1;
import klf.h0;
import klf.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import pkg.e;
import qkf.p;
import qkf.r;
import qkf.s;
import vkm.q;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends hmf.a {
    public final h0 e;
    public final slf.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.c f207214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f207215h;
    public final k1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p f207216j;
    public final s k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o1 f207217l;

    public c(h0 commonDataSource, slf.c headerProvider, amf.c hideTransactionMenuOptionProvider, i actionsProvider, k1 fromBlockProvider, p blockchainBlockProvider, s detailsBlockProvider, o1 getHelpBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(headerProvider, "headerProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(actionsProvider, "actionsProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(blockchainBlockProvider, "blockchainBlockProvider");
        Intrinsics.checkNotNullParameter(detailsBlockProvider, "detailsBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        this.e = commonDataSource;
        this.f = headerProvider;
        this.f207214g = hideTransactionMenuOptionProvider;
        this.f207215h = actionsProvider;
        this.i = fromBlockProvider;
        this.f207216j = blockchainBlockProvider;
        this.k = detailsBlockProvider;
        this.f207217l = getHelpBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarA = k0.a(this.i.Z2());
        p pVar = this.f207216j;
        cmf.p pVar2 = new cmf.p(new e(pVar.f247004a.d(), pVar, 28), new c0(23), u.c(pVar.f247006c), "DeFiWithdrawBlockchain");
        s sVar = this.k;
        SharedFlow sharedFlowD = sVar.f247008a.d();
        z0 z0Var = sVar.f247010c;
        return h(v.k(pVarA, pVar2, new cmf.p(new t38.e(sharedFlowD, 24, q.Q(z0Var.f185613a.h(new kkk.u(8)), new m5(null, z0Var, 18)), new r(3, sVar, s.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/data/model/Data;)Ljava/util/List;", 4, 0)), new c0(23), u.c(sVar.e), "DeFiWithdrawDetails"), this.f207217l.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.a();
    }

    @Override // hmf.b0
    public final Flow d() {
        i iVar = this.f207215h;
        return f(u.c(new f(new z(iVar.f24833l.d(), 23), u.c(iVar), "DeFiTransferActions")));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(u.c(this.f207214g.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}

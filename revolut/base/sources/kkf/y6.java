package kkf;

import com.revolut.domain.interactors.transactions.TransactionsSort;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import tof.gb;

/* JADX INFO: loaded from: classes8.dex */
public final class y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f185034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.m1 f185035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k71.i f185036c;
    public final com.revolut.domain.interactors.transactions.a d;
    public final vlf.b e;
    public final xoj.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ppg.a f185037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final eub.a f185038h;
    public final glc.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a31.a f185039j;
    public final aa6.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final elf.z1 f185040l;

    public y6(klf.h0 commonDataSource, klf.m1 juniorDataSource, k71.i transactionDescriptor, com.revolut.domain.interactors.transactions.a transactionsInteractor, vlf.b commonUiMapper, xoj.a featuresInteractor, ppg.a customisedVaultInteractor, eub.a revPointsAvailabilityInteractor, glc.a roboPortfolioInfoProvider, a31.a donationsAvailabilityInteractor, aa6.c donationsInteractor, elf.z1 spareChangeClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(customisedVaultInteractor, "customisedVaultInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(donationsAvailabilityInteractor, "donationsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(donationsInteractor, "donationsInteractor");
        Intrinsics.checkNotNullParameter(spareChangeClickHandler, "spareChangeClickHandler");
        this.f185034a = commonDataSource;
        this.f185035b = juniorDataSource;
        this.f185036c = transactionDescriptor;
        this.d = transactionsInteractor;
        this.e = commonUiMapper;
        this.f = featuresInteractor;
        this.f185037g = customisedVaultInteractor;
        this.f185038h = revPointsAvailabilityInteractor;
        this.i = roboPortfolioInfoProvider;
        this.f185039j = donationsAvailabilityInteractor;
        this.k = donationsInteractor;
        this.f185040l = spareChangeClickHandler;
    }

    public final cmf.p a() {
        vkm.d dVarB = rd0.e.b(com.revolut.domain.interactors.transactions.a.d(this.d, new gb(this.f185036c.a()), null, 1, TransactionsSort.STARTED_DATE_DESC, null, 18));
        zhm.h0 h0Var = zhm.h0.f322473a;
        Flow flow1 = vkm.q.q(new a6e.b(rd0.e.n(dVarB, h0Var), 18));
        klf.h0 h0Var2 = this.f185034a;
        x5 flow2 = new x5(h0Var2.c(), 2);
        SharedFlow flow3 = h0Var2.e();
        Flow flow4 = vkm.q.q(new a6e.b(rd0.e.n(rd0.e.b(((ypg.b) this.f185037g).c()), h0Var), 16));
        wkm.l flow5 = vkm.q.Q(rd0.e.b(((cpj.b) this.f).l(yoj.c.ROBO)), new m5(null, this, 2));
        Flow flow6 = vkm.q.q(new a6e.b(rd0.e.n(rd0.e.b(aa6.c.a(this.k, false)), h0Var), 15));
        r6 flow7 = new r6(this.f185039j.j(), 0);
        n1g.p flow8 = ((nyb.b) this.f185038h).b();
        x5 flow9 = new x5(this.f185035b.a(), 3);
        t6 transform = new t6(10, 4, y6.class, this, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ZZZ)Ljava/util/List;");
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(flow3, "flow3");
        Intrinsics.checkNotNullParameter(flow4, "flow4");
        Intrinsics.checkNotNullParameter(flow5, "flow5");
        Intrinsics.checkNotNullParameter(flow6, "flow6");
        Intrinsics.checkNotNullParameter(flow7, "flow7");
        Intrinsics.checkNotNullParameter(flow8, "flow8");
        Intrinsics.checkNotNullParameter(flow9, "flow9");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new cmf.p(new oi3.g(new Flow[]{flow1, flow2, flow3, flow4, flow5, flow6, flow7, flow8, flow9}, transform, 2), new z5(2), zhm.u.c(this.f185040l), "SpareChange");
    }
}

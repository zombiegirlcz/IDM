package sa6;

import com.revolut.feature.donations.impl.domain.model.CharityTransactionsParams;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;
import nyb.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aa6.c f261319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.b f261320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f261321c;

    public h(aa6.c donationsInteractor, whf.b transactionsContentProvider, m0 revPointsTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(donationsInteractor, "donationsInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        this.f261319a = donationsInteractor;
        this.f261320b = transactionsContentProvider;
        this.f261321c = revPointsTransactionsInteractor;
    }

    public final efm.r a(CharityTransactionsParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        RevPointsTransactionPageParams revPointsTransactionPageParams = new RevPointsTransactionPageParams(params.f71990a, params.d, null, params.f71991b, f1.DONATIONS, null, null, null, null, 484);
        String str = params.f71991b;
        aa6.c cVar = this.f261319a;
        efm.r map = m70.a.g(str != null ? nim.a.w(((t) cVar).b(str, false), new s8h.h(19)) : aa6.c.a(cVar, false), null, new sa5.a(2), 1).map(new a(new f(params, 1), 2));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarC = this.f261321c.c(revPointsTransactionPageParams);
        efm.r rVarDistinctUntilChanged = whf.b.a(this.f261320b, map, null, Integer.valueOf(params.f71990a), null, 10).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return nim.a.w(kli.a.h(rVarC, rVarDistinctUntilChanged), new f(params, 0));
    }
}

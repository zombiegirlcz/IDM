package ldi;

import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1c.f1;
import nyb.m0;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pdi.a f194134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mdi.a f194135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eub.a f194136c;
    public final m0 d;

    public f(pdi.a revPointsPocketRepository, mdi.a revPointsPocketTransactionMapper, eub.a revPointsAvailabilityInteractor, m0 revPointsTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(revPointsPocketRepository, "revPointsPocketRepository");
        Intrinsics.checkNotNullParameter(revPointsPocketTransactionMapper, "revPointsPocketTransactionMapper");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        this.f194134a = revPointsPocketRepository;
        this.f194135b = revPointsPocketTransactionMapper;
        this.f194136c = revPointsAvailabilityInteractor;
        this.d = revPointsTransactionsInteractor;
    }

    public final Flow a(RevPointsTransactionPageParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.e != f1.REVPOINTS_POCKET) {
            return ta6.a.j(new IllegalArgumentException("Points pocket transactions must be requested with product REVPOINTS_POCKET"));
        }
        pdi.k kVar = (pdi.k) this.f194134a;
        kVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new im9.h(this, params, (Continuation) null, 28), kVar.e.b(Unit.f186387a, loadingStrategy));
    }

    public final vkm.d b(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        pdi.k kVar = (pdi.k) this.f194134a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return kVar.d.b(Unit.f186387a, loadingStrategy);
    }

    public final Flow c(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new e(this, loadingStrategy, null), ((nyb.b) this.f194136c).d());
    }
}

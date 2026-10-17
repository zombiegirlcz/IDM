package pd3;

import com.revolut.data.model.Data;
import efm.r;
import et6.h1;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import od3.f0;
import od3.z;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f235060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f235061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nd3.d f235062c;
    public final whf.b d;

    public e(h1 freelancerInteractor, t pricingPlanInteractor, nd3.d cashbackTransactionsFilterProvider, whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(cashbackTransactionsFilterProvider, "cashbackTransactionsFilterProvider");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f235060a = freelancerInteractor;
        this.f235061b = pricingPlanInteractor;
        this.f235062c = cashbackTransactionsFilterProvider;
        this.d = transactionsContentProvider;
    }

    @Override // pd3.a
    public final f0 a() {
        return new z(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    @Override // pd3.a
    public final Flow b() {
        r map = w.m(this.f235060a.a(), this.f235061b.x(), whf.b.a(this.d, this.f235062c.b(uc3.d.PRO), null, null, null, 14)).map(new p8k.b(23, new pb2.a(21)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }
}

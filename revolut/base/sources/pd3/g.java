package pd3;

import com.revolut.data.model.Data;
import efm.r;
import ffk.t;
import i9g.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import le.u1;
import od3.e0;
import od3.f0;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8g.a f235066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f235067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nd3.d f235068c;
    public final whf.b d;

    public g(p8g.a staysCashbackInteractor, t pricingPlanInteractor, nd3.d cashbackTransactionsFilterProvider, whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(staysCashbackInteractor, "staysCashbackInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(cashbackTransactionsFilterProvider, "cashbackTransactionsFilterProvider");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f235066a = staysCashbackInteractor;
        this.f235067b = pricingPlanInteractor;
        this.f235068c = cashbackTransactionsFilterProvider;
        this.d = transactionsContentProvider;
    }

    @Override // pd3.a
    public final f0 a() {
        return new e0(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    @Override // pd3.a
    public final Flow b() {
        r map = w.l(nim.a.w(u1.d(((p) this.f235066a).f159829a.M.f(Unit.f186387a, false), this.f235067b.q()), new pb2.a(28)), whf.b.a(this.d, this.f235068c.b(uc3.d.TRAVEL), null, null, null, 14)).map(new p8k.b(28, new pb2.a(27)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }
}

package pd3;

import com.revolut.data.model.Data;
import efm.r;
import ffk.t;
import i9g.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import le.u1;
import od3.d0;
import od3.f0;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8g.a f235063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f235064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nd3.d f235065c;
    public final whf.b d;

    public f(p8g.a staysCashbackInteractor, t pricingPlanInteractor, nd3.d cashbackTransactionsFilterProvider, whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(staysCashbackInteractor, "staysCashbackInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(cashbackTransactionsFilterProvider, "cashbackTransactionsFilterProvider");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f235063a = staysCashbackInteractor;
        this.f235064b = pricingPlanInteractor;
        this.f235065c = cashbackTransactionsFilterProvider;
        this.d = transactionsContentProvider;
    }

    @Override // pd3.a
    public final f0 a() {
        return new d0(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    @Override // pd3.a
    public final Flow b() {
        r rVarF = ((p) this.f235063a).f159829a.M.f(Unit.f186387a, false);
        t tVar = this.f235064b;
        r map = w.m(nim.a.w(u1.d(rVarF, tVar.q()), new pb2.a(26)), tVar.x(), whf.b.a(this.d, this.f235065c.b(uc3.d.STAYS), null, null, null, 14)).map(new p8k.b(27, new pb2.a(25)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }
}

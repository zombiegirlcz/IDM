package pd3;

import com.revolut.data.model.Data;
import efm.r;
import ffk.t;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import le.u1;
import od3.f0;
import od3.x;
import od3.y;
import te0.w;
import w4l.h;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f235057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bd3.a f235058c;
    public final l61.a d;
    public final nd3.d e;
    public final whf.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lal.a f235059g;

    public d(t pricingPlanInteractor, bd3.a cashbackInteractor, l61.a userCompanyInteractor, nd3.d cashbackTransactionsFilterProvider, whf.b transactionsContentProvider, lal.a cashbackFooterDataProvider, int i) {
        this.f235056a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
                Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
                Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
                Intrinsics.checkNotNullParameter(cashbackTransactionsFilterProvider, "cashbackTransactionsFilterProvider");
                Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
                Intrinsics.checkNotNullParameter(cashbackFooterDataProvider, "cashbackFooterDataProvider");
                this.f235057b = pricingPlanInteractor;
                this.f235058c = cashbackInteractor;
                this.d = userCompanyInteractor;
                this.e = cashbackTransactionsFilterProvider;
                this.f = transactionsContentProvider;
                this.f235059g = cashbackFooterDataProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
                Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
                Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
                Intrinsics.checkNotNullParameter(cashbackTransactionsFilterProvider, "cashbackTransactionsFilterProvider");
                Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
                Intrinsics.checkNotNullParameter(cashbackFooterDataProvider, "cashbackFooterDataProvider");
                this.f235057b = pricingPlanInteractor;
                this.f235058c = cashbackInteractor;
                this.d = userCompanyInteractor;
                this.e = cashbackTransactionsFilterProvider;
                this.f = transactionsContentProvider;
                this.f235059g = cashbackFooterDataProvider;
                break;
        }
    }

    @Override // pd3.a
    public final f0 a() {
        switch (this.f235056a) {
            case 0:
                return new x(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
            default:
                return new y(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
        }
    }

    @Override // pd3.a
    public final Flow b() {
        switch (this.f235056a) {
            case 0:
                t tVar = this.f235057b;
                r rVarW = nim.a.w(tVar.n(), new pb2.a(12));
                r rVarW2 = nim.a.w(tVar.o(), new pb2.a(13));
                bd3.a aVar = this.f235058c;
                r rVarF = ((gd3.g) aVar.f14523a).f143058h.f(Unit.f186387a, true);
                r rVarD = bd3.a.d(aVar);
                h hVar = h.f294642c;
                r map = w.s(rVarW, rVarW2, rVarF, rVarD, aVar.g(hVar), aVar.c(hVar), this.f235059g.x(), nim.a.w(u1.d(nim.a.w(hng.g.b(((ang.b) this.d).f7765a), new pb2.a(15)), aVar.g(hVar)), new pb2.a(14)), whf.b.a(this.f, this.e.b(uc3.d.METAL), null, null, null, 14)).map(new p8k.b(21, new pb2.a(11)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return rd0.e.b(map);
            default:
                t tVar2 = this.f235057b;
                h hVar2 = h.f294642c;
                r rVarV = tVar2.v(hVar2);
                r rVarW3 = nim.a.w(tVar2.o(), new pb2.a(17));
                r rVarW4 = nim.a.w(tVar2.n(), new pb2.a(18));
                bd3.a aVar2 = this.f235058c;
                r map2 = w.t(rVarV, rVarW3, rVarW4, ((gd3.g) aVar2.f14523a).f143058h.f(Unit.f186387a, true), bd3.a.d(aVar2), aVar2.g(hVar2), aVar2.c(hVar2), this.f235059g.x(), nim.a.w(u1.d(nim.a.w(hng.g.b(((ang.b) this.d).f7765a), new pb2.a(20)), aVar2.g(hVar2)), new pb2.a(19)), whf.b.a(this.f, this.e.b(uc3.d.PLAN), null, null, null, 14)).map(new p8k.b(22, new pb2.a(16)));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                return rd0.e.b(map2);
        }
    }
}

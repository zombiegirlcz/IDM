package w3b;

import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.feature.retail.cfd.impl.screens.margin.CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import d9.t0;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.cfd.impl.screens.margin.a f294266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f294267c;

    public /* synthetic */ l(com.revolut.feature.retail.cfd.impl.screens.margin.a aVar, n nVar) {
        this.f294265a = 1;
        this.f294266b = aVar;
        this.f294267c = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ej0.b bVar;
        switch (this.f294265a) {
            case 0:
                y49.h it8 = (y49.h) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ej0.b bVar2 = it8.f310851h;
                if (bVar2 == null) {
                    bVar2 = it8.i;
                }
                dj0.d dVarD = t0.D(bVar2, this.f294267c);
                com.revolut.feature.retail.cfd.impl.screens.margin.a aVar = this.f294266b;
                BigDecimal bigDecimalAbs = aVar.f82231r.d.abs();
                Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
                return new c(dVarD, bigDecimalAbs, aVar.f82231r.e, it8.e);
            case 1:
                MarginQuote it9 = (MarginQuote) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                com.revolut.feature.retail.cfd.impl.screens.margin.a aVar2 = this.f294266b;
                e eVar = aVar2.f82231r;
                CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType cfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType = eVar.f;
                boolean z = cfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType instanceof CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType.Limit;
                n nVar = this.f294267c;
                if (z) {
                    bVar = ((CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType.Limit) cfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType).f82223a;
                } else if (cfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType instanceof CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType.Stop) {
                    bVar = ((CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType.Stop) cfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType).f82227a;
                } else {
                    if (!cfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType.equals(CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType.Market.f82225a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new ej0.b(it9.f.f104792a, nVar.i);
                }
                dj0.d dVarD2 = t0.D(bVar, nVar);
                BigDecimal bigDecimalAbs2 = eVar.d.abs();
                Intrinsics.checkNotNullExpressionValue(bigDecimalAbs2, "abs(...)");
                BigDecimal bigDecimal = eVar.e;
                l4i.a aVar3 = aVar2.o;
                Amount amount = it9.f82111b;
                aVar3.getClass();
                return new c(dVarD2, bigDecimalAbs2, bigDecimal, l4i.a.b(amount).a());
            default:
                y49.b it10 = (y49.b) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                y49.e eVar2 = it10.f310833b;
                ej0.b bVar3 = eVar2.f310840g;
                if (bVar3 == null) {
                    bVar3 = eVar2.f310841h;
                }
                dj0.d dVarD3 = t0.D(bVar3, this.f294267c);
                com.revolut.feature.retail.cfd.impl.screens.margin.a aVar4 = this.f294266b;
                BigDecimal bigDecimalAbs3 = aVar4.f82231r.d.abs();
                Intrinsics.checkNotNullExpressionValue(bigDecimalAbs3, "abs(...)");
                return new c(dVarD3, bigDecimalAbs3, aVar4.f82231r.e, it10.f310833b.e);
        }
    }

    public /* synthetic */ l(n nVar, com.revolut.feature.retail.cfd.impl.screens.margin.a aVar, int i) {
        this.f294265a = i;
        this.f294267c = nVar;
        this.f294266b = aVar;
    }
}

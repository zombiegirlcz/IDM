package b4b;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderData;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreenContract$TargetPriceInputValue;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.trading.orders.ui.invest.placement.models.InvestInputValue;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BigDecimal f12257b;

    public /* synthetic */ x(int i, BigDecimal bigDecimal) {
        this.f12256a = i;
        this.f12257b = bigDecimal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f12256a) {
            case 0:
                CfdOrderData it8 = (CfdOrderData) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return CfdOrderData.a(it8, null, this.f12257b, null, null, null, 59);
            case 1:
                b9c.e updateState = (b9c.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                return b9c.e.a(updateState, dj0.d.c(updateState.f13703b, this.f12257b.multiply(bigDecimalValueOf).longValue(), null, 2), null, null, null, 29);
            case 2:
                cul.v vVar = (cul.v) obj2;
                InvestInputValue investInputValue = vVar.e;
                BigDecimal bigDecimal = this.f12257b;
                return cul.v.a(vVar, null, null, null, InvestInputValue.a(investInputValue, bigDecimal == null ? investInputValue.f106844a : bigDecimal, null, !pd.b.j(investInputValue.f106845b), bigDecimal == null ? vVar.e.d : true, 2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -17, 8191);
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new wtl.c(new Amount(this.f12257b, (Asset) pair.f186385a), ((nel.n) pair.f186386b).i);
            case 4:
                o7j.j update = (o7j.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f222863a.getClass();
                BigDecimal value = this.f12257b;
                Intrinsics.checkNotNullParameter(value, "value");
                return o7j.j.a(update, new CommodityTargetPriceScreenContract$TargetPriceInputValue(value, null, false), null, null, 126);
            case 5:
                qn9.f updateState2 = (qn9.f) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(100);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                return qn9.f.a(updateState2, null, this.f12257b.multiply(bigDecimalValueOf2).longValue(), null, null, null, 29);
            case 6:
                NumberClause numberClause = (NumberClause) obj2;
                Intrinsics.checkNotNullParameter(numberClause, "numberClause");
                BigDecimal bigDecimal2 = this.f12257b;
                return new TextLocalisedClause(Intrinsics.f(bigDecimal2.abs().setScale(2, RoundingMode.HALF_EVEN), new BigDecimal("1.00")) ? R$string.invest_templates_index_points : R$string.invest_templates_index_points_plural, zhm.u.c(numberClause), new Custom(Integer.valueOf(s87.c.b(bigDecimal2, false)), false, null, false, null, 254), 8);
            case 7:
                CfdOrderData it9 = (CfdOrderData) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return CfdOrderData.a(it9, null, null, null, this.f12257b, null, 47);
            default:
                return yed.o.a((yed.o) obj2, null, null, null, this.f12257b, false, false, null, null, null, null, false, null, false, null, null, null, 1048559);
        }
    }

    public /* synthetic */ x(BigDecimal bigDecimal, s87.c cVar) {
        this.f12256a = 6;
        this.f12257b = bigDecimal;
    }
}

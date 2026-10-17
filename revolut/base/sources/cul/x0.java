package cul;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.trading.orders.ui.invest.placement.models.InvestOutputValue;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class x0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InvestOutputValue f109203b;

    public /* synthetic */ x0(InvestOutputValue investOutputValue, int i) {
        this.f109202a = i;
        this.f109203b = investOutputValue;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f109202a) {
            case 0:
                return v.a((v) obj2, null, null, null, null, null, null, this.f109203b, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -129, 8191);
            default:
                OrderQuote it8 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                BigDecimal value = d9.e1.l(it8).f104717a;
                ChargeBreakdown chargeBreakdown = this.f109203b.f106857b;
                Intrinsics.checkNotNullParameter(value, "value");
                return new InvestOutputValue(value, chargeBreakdown);
        }
    }
}

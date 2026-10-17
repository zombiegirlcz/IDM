package c7i;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OrderQuote f22009b;

    public /* synthetic */ h0(OrderQuote orderQuote, int i) {
        this.f22008a = i;
        this.f22009b = orderQuote;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f22008a) {
            case 0:
                return r.a((r) obj2, null, 0L, 0L, null, this.f22009b, null, null, null, null, 495);
            case 1:
                return g8i.r.a((g8i.r) obj2, this.f22009b, false, null, null, null, null, null, 4094);
            case 2:
                OrderQuote amount = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(amount, "$this$amount");
                OrderQuote orderQuote = this.f22009b;
                return orderQuote.f104753b == orderQuote.f104752a ? new TextLocalisedClause(R$string.market_data_exchange_currency_amount, null, null, 14) : new TextLocalisedClause(R$string.market_data_exchange_currency_estimated_amount, null, null, 14);
            case 3:
                OrderQuote estimatedTotal = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(estimatedTotal, "$this$estimatedTotal");
                OrderQuote orderQuote2 = this.f22009b;
                f8l.b bVar = orderQuote2.f104753b;
                f8l.b bVar2 = orderQuote2.f104752a;
                int[] iArr = h5i.e.f149564b;
                int i = iArr[bVar.ordinal()];
                if (i == 1) {
                    int i2 = iArr[bVar2.ordinal()];
                    if (i2 == 1) {
                        return new TextLocalisedClause(R$string.market_data_exchange_currency_estimated_proceeds, null, null, 14);
                    }
                    if (i2 == 2) {
                        return new TextLocalisedClause(R$string.market_data_exchange_currency_proceeds, null, null, 14);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i3 = iArr[bVar2.ordinal()];
                if (i3 == 1) {
                    return new TextLocalisedClause(R$string.market_data_exchange_currency_cost, null, null, 14);
                }
                if (i3 == 2) {
                    return new TextLocalisedClause(R$string.market_data_exchange_currency_estimated_cost, null, null, 14);
                }
                throw new NoWhenBranchMatchedException();
            default:
                OrderQuote fees = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(fees, "$this$fees");
                return h5i.g.k(false, this.f22009b.f104755g.f104731a);
        }
    }

    public /* synthetic */ h0(h5i.g gVar, OrderQuote orderQuote) {
        this.f22008a = 4;
        this.f22009b = orderQuote;
    }
}

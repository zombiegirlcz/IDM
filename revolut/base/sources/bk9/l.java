package bk9;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.pay_later.api.models.PayLaterPaymentMethod;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_pay_later_payment_schedule_select_schedule_title, null, null, 14);
        PayLaterPaymentMethod payLaterPaymentMethod = domainState.f16284a.f78816a;
        BigDecimal bigDecimal = domainState.f16285b;
        int i2 = k.f16293a[payLaterPaymentMethod.ordinal()];
        if (i2 == 1) {
            i = R$string.credit_pay_later_payment_schedule_select_schedule_debit_card_description;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.credit_pay_later_payment_schedule_select_schedule_virtual_card_description;
        }
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(BigDecimal.valueOf(100L));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return new h(new hx4.a(textLocalisedClause, new TextLocalisedClause(i, u.c(new PercentageClause(bigDecimalMultiply, (PercentageClause.Format) null, (Style) null, 6)), null, 12), null, f0.f322471a), domainState.f16284a.f78817b != domainState.f16286c, (List) iii.c.f(domainState.d, new bjg.c(11), new bk6.n(1), new b88.o(8, domainState, this)));
    }
}

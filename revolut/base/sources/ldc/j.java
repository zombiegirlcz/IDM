package ldc;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.revolutpay.shared.R$string;
import java.util.List;
import k8d.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.d, new lbh.a(this, 10), new l9j.j(11), new kcg.j(this, domainState, 29));
        int i = i.f194067a[domainState.f194061c.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_order_summary_payment_breakdown_title, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_order_summary_payment_breakdown_exchange_title, null, null, 14);
        }
        return new g((Clause) iii.c.f(domainState.d, new lbh.a(11), new l9j.j(12), new t(this, 28)), textLocalisedClause, list);
    }
}

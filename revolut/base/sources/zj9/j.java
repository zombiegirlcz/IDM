package zj9;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import y5g.l;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h(new hx4.a(new TextLocalisedClause(R$string.credit_pay_later_payment_schedule_title, null, null, 14), new TextLocalisedClause(R$string.credit_pay_later_payment_schedule_description, null, null, 14), null, f0.f322471a), (List) iii.c.f(domainState.f322770a, new zii.c(15), new z8d.h(26), new l(this, 25)));
    }
}

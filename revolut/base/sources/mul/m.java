package mul;

import aw0.n6;
import cli.n;
import cli.o;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.trading.orders.R$string;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f209064a;

    public m(ImmutableSet breakdownMappers) {
        Intrinsics.checkNotNullParameter(breakdownMappers, "breakdownMappers");
        this.f209064a = breakdownMappers;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        lw0.a aVar;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        switch (l.f209063a[domainState.f209055a.f214597c.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                aVar = new lw0.a(new TextLocalisedClause(R$string.wealth_trading_orders_dialog_locked_period_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_orders_dialog_locked_period_description, u.c(domainState.f209055a.e), null, 12), null, null, false, 28);
                break;
            case 15:
                aVar = new lw0.a(new TextLocalisedClause(R$string.wealth_trading_orders_dialog_shares_availability_title, null, null, 14), null, null, null, false, 30);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.wealth_trading_orders_dialog_locked_period_submit, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), (List) iii.c.f(domainState.f209056b, new k(this, 0), new mqg.a(27), new m88.c(this, domainState, 14)), aVar);
    }
}

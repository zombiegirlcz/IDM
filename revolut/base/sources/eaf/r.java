package eaf;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements cli.n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f124247a = w.y0(new e18.i(25));

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) throws Throwable {
        List list;
        h hVar;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f124231b;
        if (data == null || (list = (List) iii.c.f(data, new e87.e(this, 14), new e6e.a(12), new dob.a(this, 17))) == null) {
            list = f0.f322471a;
        }
        String str = domainState.f124230a;
        TradingAccount tradingAccount = domainState.f124232c;
        u8f.d dVar = domainState.d;
        if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Personal) {
            hVar = new h(new TextLocalisedClause(R$string.trading_stocks_transfer_in_personal_jisa_broker_header_title, null, null, 14), null);
        } else if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Custodian) {
            hVar = new h(new TextLocalisedClause(R$string.trading_stocks_transfer_in_jisa_broker_header_title, u.c(((TradingAccount.TaxAdvantage.JIsa.Custodian) tradingAccount).f105237n.f105176b), null, 12), null);
        } else {
            int i = s.f124248a[dVar.ordinal()];
            if (i == 1) {
                hVar = new h(new TextLocalisedClause(R$string.trading_stocks_transfer_out_broker_header_title, null, null, 14), null);
            } else if (i == 2) {
                hVar = new h(new TextLocalisedClause(R$string.trading_stocks_transfer_in_broker_header_title, null, null, 14), new TextLocalisedClause(R$string.trading_stocks_transfer_in_broker_header_subtitle, null, null, 14));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                hx7.e.n(new IllegalStateException("NONE direction is not available for broker selection"));
                hVar = new h(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
            }
        }
        return new l(str, hVar, list);
    }
}

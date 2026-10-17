package y4f;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.trading.impl.R$string;
import ip0.ak0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a() {
        TextDelegate.Model model = new TextDelegate.Model("FOOTER", new TextLocalisedClause(R$string.wealth_trading_holdings_information_footer, null, null, 14), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
        yp0.b.r(model, 0, R$attr.uikit_dp32, 0, 0, 13);
        return u.c(model);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new m(new TextLocalisedClause(R$string.wealth_trading_holdings_information_header_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_holdings_information_header_subtitle, null, null, 14), (List) iii.c.f(domainState.f310907c, new y4b.b(this, 9), new y13.a(19), new x0b.h(this, 28)));
    }
}

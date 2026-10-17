package kzh;

import aw0.n6;
import aw0.o9;
import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Limit.UsageLimit usageLimit = domainState.f191115a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cryptobuysell_account_balance_limit_info_title, null, null, 14);
        int i = R$string.cryptobuysell_account_balance_limit_info_subtitle;
        dj0.d dVarL = a.a.L(usageLimit.f104750b);
        MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        o9 o9Var = o9.NON_SENSITIVE;
        lw0.a aVar = new lw0.a(textLocalisedClause, new TextLocalisedClause(i, v.k(new MoneyClause(dVarL, defaults, null, o9Var, 4), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "ACCOUNT_BALANCE_LIMIT_SHEET_LEARN_MORE", false), 10)), null, 12), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, true, null, null, 988), null, null, 55);
        List listC = u.c(new CellDetailsDelegate.Model("ACCOUNT_BALANCE_LIMIT_USAGE_ROW", new t0((Clause) new TextLocalisedClause(R$string.cryptobuysell_account_balance_limit_info_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.cryptobuysell_account_balance_limit_info_limit_amount, v.k(new MoneyClause(a.a.L(usageLimit.f104751c), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4), new MoneyClause(a.a.L(usageLimit.f104750b), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new cii.b(eVar, listC, aVar);
    }
}

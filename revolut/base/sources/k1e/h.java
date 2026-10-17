package k1e;

import aw0.k7;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.stock_lending.impl.R$string;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        MoneyClause moneyClause = new MoneyClause(domainState.f180218a.f20460b, new MoneyClause.Format.Headers(k7.ALWAYS, null, null, false, false, 30), null, null, 12);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_stock_lending_details_transactions_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        TimeClause timeClause = new TimeClause(domainState.f180218a.f20461c.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        LayeredImage layeredImageK = companion.k(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorWhite, R$attr.uikit_colorLightGreen);
        LayeredImage layeredImageH = companion.h(R$drawable.uikit_icn_16_plus, R$attr.uikit_colorWhite, R$attr.uikit_colorAccent);
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ID_STATUS", new TextLocalisedClause(R$string.wealth_stock_lending_transaction_details_status, null, null, 14), new TextLocalisedClause(R$string.wealth_stock_lending_transaction_details_status_completed, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        CellDetailsChevronDelegate.Model model2 = new CellDetailsChevronDelegate.Model("ID_LEARN_MORE", new TextLocalisedClause(R$string.wealth_stock_lending_transaction_details_report_issue, null, null, 14), 0, false, null, null, null, 2044);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new f(moneyClause, textLocalisedClause, timeClause, layeredImageK, layeredImageH, v.k(model, model2));
    }
}

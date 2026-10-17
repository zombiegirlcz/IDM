package d1e;

import aw0.db;
import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.stock_lending.api.navigation.StockLendingConfig;
import com.revolut.feature.stock_lending.api.navigation.StockLendingDetailsFeatureConfig;
import com.revolut.feature.stock_lending.api.navigation.StockLendingV2FlowDestination;
import com.revolut.feature.stock_lending.impl.R$string;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n4l.c;
import n4l.d;
import os2.b;
import os2.e;
import zh9.u0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static ActivityNavigateCommand a(String str) {
        return b.a(e.Companion, new TextLocalisedClause(R$string.wealth_stock_lending_onboarding_prompt_title, null, null, 14), yoj.b.m(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.wealth_stock_lending_onboarding_prompt_description_first, null, null, 14), new TextLocalisedClause(R$string.wealth_stock_lending_onboarding_prompt_description_second, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, db.BODY2, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST), 10))), new BluePromptContent.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D202", null, null, null, 30)), new TextLocalisedClause(R$string.wealth_stock_lending_onboarding_prompt_lets_go, null, null, 14), null, com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new StockLendingConfig.Onboarding(str))), null, 1048408);
    }

    public final NaviCommand b(n4l.e stockLendingStatus) {
        Intrinsics.checkNotNullParameter(stockLendingStatus, "stockLendingStatus");
        if (stockLendingStatus instanceof d) {
            return null;
        }
        if (!(stockLendingStatus instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        c cVar = (c) stockLendingStatus;
        String str = cVar.d;
        TradingProductCode tradingProductCode = cVar.f212471b;
        if (tradingProductCode instanceof TradingProductCode.StockLendingUS) {
            if (cVar.f212470a) {
                return new FeatureCommand(new StockLendingDetailsFeatureConfig(0));
            }
            if (str == null) {
                r6.b.r("PortfolioID must be not null for Stock Lending US");
            }
            if (str != null) {
                return a(str);
            }
        } else if (tradingProductCode instanceof TradingProductCode.GiaSecurityLending) {
            return u0.f(new StockLendingV2FlowDestination(cVar.f212472c, tradingProductCode));
        }
        return null;
    }
}

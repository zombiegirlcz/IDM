package bpc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m1h.r;
import m1h.s;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements m1h.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmc.d f17585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f17586b;

    public k(nmc.d roboPortfolioUiMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f17585a = roboPortfolioUiMapper;
        this.f17586b = featureToggleInteractor;
    }

    public static boolean b(q qVar) {
        Object next;
        Iterator it8 = qVar.f17593a.c0().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (com.revolut.shared.feature.wealth.models.trading_accounts.e.a((TradingProduct) next)) {
                break;
            }
        }
        TradingProduct tradingProduct = (TradingProduct) next;
        return Intrinsics.f(tradingProduct != null ? tradingProduct.f105281b : null, TradingProductCode.RoboGB.f105333a);
    }

    @Override // m1h.o
    public final m1h.p a(r state, s sVar, od0.i tradingAccount) throws Throwable {
        Image imageB;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        ResourceImage resourceImage = null;
        if (!(state instanceof q)) {
            hx7.e.n(new IllegalArgumentException("Invalid state: " + state + " received in " + k.class.getSimpleName()));
            return null;
        }
        q qVar = (q) state;
        RoboPortfolioInfo roboPortfolioInfo = qVar.f17594b;
        boolean zC = ((jte.d) this.f17586b).c(WealthUiApi$Toggles.RoboStrategies.f95863c);
        nmc.d dVar = this.f17585a;
        Clause clauseC = (zC && b(qVar)) ? dVar.c(roboPortfolioInfo) : !roboPortfolioInfo.i ? new TextLocalisedClause(R$string.wealth_invest_onboarding_add_money_subtitle, u.c(new MoneyClause(qVar.f17595c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12) : null;
        if (roboPortfolioInfo.i) {
            imageB = dVar.b(roboPortfolioInfo);
        } else {
            if (qVar.d && !b(qVar)) {
                resourceImage = new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBlue), (List) null, (ImageTransformations) null, (Clause) null, 246);
            }
            imageB = resourceImage;
        }
        return new m1h.p(clauseC, imageB);
    }
}

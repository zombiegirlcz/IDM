package ojh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import kotlin.jvm.internal.Intrinsics;
import kpj.f;
import n2l.l;
import pjh.g;
import zjh.i;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f225779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f225780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ljh.c f225781c;
    public final i d;

    public c(g portfolioBalanceItemMapper, f wealthAccountHeaderUiMapper, ljh.c wealthActionsAccountWidgetMapper, i roboPortfolioBalanceAggregator) {
        Intrinsics.checkNotNullParameter(portfolioBalanceItemMapper, "portfolioBalanceItemMapper");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(wealthActionsAccountWidgetMapper, "wealthActionsAccountWidgetMapper");
        Intrinsics.checkNotNullParameter(roboPortfolioBalanceAggregator, "roboPortfolioBalanceAggregator");
        this.f225779a = portfolioBalanceItemMapper;
        this.f225780b = wealthAccountHeaderUiMapper;
        this.f225781c = wealthActionsAccountWidgetMapper;
        this.d = roboPortfolioBalanceAggregator;
    }

    public final LayeredImage a(WealthAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        return LayeredImage.INSTANCE.i(this.f225780b.g(l.a(account)), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
    }

    public final TextLocalisedClause b(TradingLegalEntityInformation tradingLegalEntityInformation, WealthAccount account) {
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(account, "account");
        return this.f225780b.h(l.a(account), tradingLegalEntityInformation.f105106a, null);
    }
}

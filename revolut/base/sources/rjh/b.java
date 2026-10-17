package rjh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import kotlin.jvm.internal.Intrinsics;
import kpj.f;
import ljh.c;
import n2l.l;
import pjh.g;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f254675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f254676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f254677c;

    public b(g portfolioBalanceItemMapper, f wealthAccountHeaderUiMapper, c wealthActionsAccountWidgetMapper) {
        Intrinsics.checkNotNullParameter(portfolioBalanceItemMapper, "portfolioBalanceItemMapper");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(wealthActionsAccountWidgetMapper, "wealthActionsAccountWidgetMapper");
        this.f254675a = portfolioBalanceItemMapper;
        this.f254676b = wealthAccountHeaderUiMapper;
        this.f254677c = wealthActionsAccountWidgetMapper;
    }

    public final LayeredImage a(WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount) {
        return LayeredImage.INSTANCE.i(this.f254676b.g(l.a(taxAdvantageWealthAccount)), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
    }

    public final TextLocalisedClause b(WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount, TradingLegalEntityInformation tradingLegalEntityInformation) {
        return this.f254676b.h(l.a(taxAdvantageWealthAccount), tradingLegalEntityInformation.f105106a, null);
    }
}

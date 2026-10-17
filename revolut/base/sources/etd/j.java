package etd;

import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$plurals;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.type_selector_sheet.TotalWealthTypeSelectorContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalWealthTypeSelectorContract$InputData f129409a;

    public j(TotalWealthTypeSelectorContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f129409a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.analytics_networth_total_assets, null, null, 14);
        TotalWealthTypeSelectorContract$InputData totalWealthTypeSelectorContract$InputData = this.f129409a;
        RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(new MoneyClause(otd.f.a(totalWealthTypeSelectorContract$InputData.f88045a), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126);
        RowDelegate.Model model = new RowDelegate.Model("ASSETS_ID", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 60), textLocalisedClause, null, 0, new TextLocalisedQuantityClause(R$plurals.analytics_total_wealth_assets_count, Integer.valueOf(totalWealthTypeSelectorContract$InputData.f88046b), (List) null, (Style) null, 28), null, null, 0, bVar, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.analytics_networth_total_liabilities, null, null, 14);
        RowDelegate.Model.c.b bVar2 = new RowDelegate.Model.c.b(new MoneyClause(otd.f.a(totalWealthTypeSelectorContract$InputData.f88047c), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126);
        List listK = v.k(model, new RowDelegate.Model("LIABILITIES_ID", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_credit_bag, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 60), textLocalisedClause2, null, 0, new TextLocalisedQuantityClause(R$plurals.analytics_total_wealth_liabilities_count, Integer.valueOf(totalWealthTypeSelectorContract$InputData.d), (List) null, (Style) null, 28), null, null, 0, bVar2, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848));
        int i = R$attr.uikit_dp32;
        yp0.b.k(listK, i, i, 0, 0, 28);
        return new d(listK);
    }
}

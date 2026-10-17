package srj;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.impl.budgeting.R$string;
import dj0.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.i3;
import wjf.e;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.c f265245a;

    public b(thf.c transactionCategoryResourcesMapper) {
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        this.f265245a = transactionCategoryResourcesMapper;
    }

    public final RowDelegate.Model a(trj.a budgetInfo) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(budgetInfo, "budgetInfo");
        i3 i3Var = budgetInfo.f273803a;
        thf.c cVar = this.f265245a;
        LayeredImage layeredImageI = ((e) cVar).i(i3Var, null, null);
        e eVar = (e) cVar;
        TextClause textClause = new TextClause(eVar.k(i3Var), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int iC = eVar.c(i3Var);
        boolean z = budgetInfo.f273804b;
        d dVar = budgetInfo.f;
        d dVar2 = budgetInfo.f273807h;
        if (z) {
            int i = R$string.analytics_budgets_overview_overspent_format;
            a aVar = Companion;
            Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254);
            aVar.getClass();
            textLocalisedClause = new TextLocalisedClause(i, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, null, 8)), null, 12);
        } else {
            int i2 = R$string.analytics_budgets_overview_per_day_format;
            Companion.getClass();
            textLocalisedClause = new TextLocalisedClause(i2, u.c(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 8)), null, 12);
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        int i3 = R$string.analytics_budgets_overview_amount_left_format;
        a aVar2 = Companion;
        d dVar3 = budgetInfo.e;
        aVar2.getClass();
        RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(new TextLocalisedClause(i3, u.c(new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 8)), null, 12), new TextLocalisedClause(R$string.analytics_budgets_overview_amount_of_format, u.c(new MoneyClause(budgetInfo.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 8)), null, 12), null, false, 124);
        String strQ = j6.a.q("LIST_ID_CATEGORY_BUDGET_ROW_PREFIX_", v13.d.t(budgetInfo.f273803a));
        ProgressStyle.Companion companion = ProgressStyle.INSTANCE;
        int i5 = budgetInfo.f273806g;
        int i6 = R$attr.uikit_colorGreyTone10;
        companion.getClass();
        return new RowDelegate.Model(strQ, layeredImageI, null, ProgressStyle.Companion.b(i5, iC, i6), textClause, textLocalisedClause2, null, null, 0, bVar, true, false, null, null, null, null, null, budgetInfo, null, 0, 0, 0, 0, 1056958308);
    }
}

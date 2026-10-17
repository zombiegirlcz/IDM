package wyg;

import cli.y;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit.utils.ListIdTarget;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.analytics.R$string;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceScreen;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.l0;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetisedAnalyticsPerformanceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(WidgetisedAnalyticsPerformanceScreen widgetisedAnalyticsPerformanceScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetisedAnalyticsPerformanceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i;
        int i2;
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c cVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.wealth.analytics.ui.widgetised.performance.a aVar2 = (com.revolut.feature.wealth.analytics.ui.widgetised.performance.a) cVarE3;
        y yVar = aVar2.f95110w;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52715m, qxg.c.f250090a)) {
            l0 l0Var = aVar2.f95107r;
            Intrinsics.checkNotNullParameter("complex-analytics-performance-header", "id");
            ListIdTarget listIdTarget = new ListIdTarget("complex-analytics-performance-header");
            byg.c cVar = aVar2.u;
            List categories = ((a) ((j2) yVar.f22677a).getValue()).f301278l;
            vyg.e selectedCategory = ((a) ((j2) yVar.f22677a).getValue()).f301279m;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(categories, "categories");
            Intrinsics.checkNotNullParameter(selectedCategory, "selectedCategory");
            List<vyg.e> list = categories;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (vyg.e eVar : list) {
                PopupMenuItem.Companion companion = PopupMenuItem.INSTANCE;
                int[] iArr = byg.d.f19822a;
                int i3 = iArr[eVar.ordinal()];
                if (i3 == 1) {
                    str = "CONTRIBUTOR_BY_ASSET_MENU_ITEM_ID";
                } else if (i3 == 2) {
                    str = "CONTRIBUTOR_BY_POSITIONS_MENU_ITEM_ID";
                } else if (i3 == 3) {
                    str = "CONTRIBUTOR_BY_SECTOR_MENU_ITEM_ID";
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "CONTRIBUTOR_BY_PRODUCT_MENU_ITEM_ID";
                }
                int i5 = iArr[eVar.ordinal()];
                if (i5 == 1) {
                    i = R$string.wealth_analytics_widgetised_performance_asset_contributions_name;
                } else if (i5 == 2) {
                    i = R$string.wealth_analytics_widgetised_performance_position_contributions_name;
                } else if (i5 == 3) {
                    i = R$string.wealth_analytics_widgetised_performance_sector_contributions_name;
                } else {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.wealth_analytics_widgetised_performance_product_contributions_name;
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
                boolean z = eVar == selectedCategory;
                int i6 = iArr[eVar.ordinal()];
                if (i6 == 1) {
                    i2 = R$drawable.uikit_icn_24_avatar_grid;
                } else if (i6 == 2) {
                    i2 = R$drawable.uikit_icn_24_view_list_medium;
                } else if (i6 == 3) {
                    i2 = R$drawable.uikit_icn_24_services;
                } else {
                    if (i6 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R$drawable.uikit_icn_24_view_grid;
                }
                arrayList.add(PopupMenuItem.Companion.a(companion, str, textLocalisedClause, z, null, eVar, new ResourceImage(i2, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 200));
            }
            l0.d(l0Var, listIdTarget, zi0.c.d(arrayList), null, 12);
        }
        return Unit.f186387a;
    }
}

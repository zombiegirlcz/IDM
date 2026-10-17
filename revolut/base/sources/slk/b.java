package slk;

import android.os.Parcelable;
import aw0.d0;
import aw0.y4;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$plurals;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreenContract$CardSubscriptionsParcel;
import dnk.l;
import ia3.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m93.g;
import mlk.f;
import mlk.u;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();
    public static final d0 f = new d0(167, 180);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kgc.d f264224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f264225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f264226c;
    public final l d;
    public final e e;

    public b(ujk.a planHubScreenBenefitsUiBuilder, kgc.d perkIconImageMapper, g cardMapper, f perksLoseItemsMapper, l iconMapper, e sectionsItemMapper) {
        Intrinsics.checkNotNullParameter(planHubScreenBenefitsUiBuilder, "planHubScreenBenefitsUiBuilder");
        Intrinsics.checkNotNullParameter(perkIconImageMapper, "perkIconImageMapper");
        Intrinsics.checkNotNullParameter(cardMapper, "cardMapper");
        Intrinsics.checkNotNullParameter(perksLoseItemsMapper, "perksLoseItemsMapper");
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(sectionsItemMapper, "sectionsItemMapper");
        this.f264224a = perkIconImageMapper;
        this.f264225b = cardMapper;
        this.f264226c = perksLoseItemsMapper;
        this.d = iconMapper;
        this.e = sectionsItemMapper;
    }

    public static hg a(List list) {
        return new hg("ID_OFFERS_SCROLLER_ITEM", list, 2, new y4(f), null, null, false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28656);
    }

    public final List b(List list) {
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("ID_CARDS_SUBHEADER_ITEM", (Image) null, (Clause) new TextLocalisedQuantityClause(R$plurals.plan_cancellation_screen_benefits_cards_subheader, Integer.valueOf(list.size()), (List) null, (Style) null, 28), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, false, 6), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65458);
        List<u> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (u uVar : list2) {
            h93.f0 f0Var = uVar.f207025a;
            h93.f0 f0Var2 = uVar.f207025a;
            String strQ = j6.a.q("list_id_card_", f0Var.f150110a);
            g gVar = this.f264225b;
            CompositeClause compositeClauseB = g.b(gVar, f0Var2);
            Image imageD = ((t) gVar).d(f0Var2, true);
            String str = f0Var2.f150110a;
            int i = uVar.f207026b;
            Integer numValueOf = Integer.valueOf(i);
            if (i <= 0) {
                numValueOf = null;
            }
            arrayList.add(new RowDelegate.Model(strQ, imageD, null, null, compositeClauseB, numValueOf != null ? new TextLocalisedQuantityClause(R$plurals.plan_downgrade_cards_item_subtitle, Integer.valueOf(numValueOf.intValue()), v.k(Integer.valueOf(i), new TextLocalisedClause(R$string.plan_downgrade_cards_item_subtitle_tap_to_review, null, new Click(28, (Integer) null, (Object) new PlanCancelFeaturesScreenContract$CardSubscriptionsParcel(str), j6.a.q("list_id_card_subscriptions_", str), false), 10)), (Style) null, 24) : null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580));
        }
        return yp0.b.g(arrayList, model, null, 0, 0, 126);
    }
}

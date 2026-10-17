package m3g;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItemBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.models.TravelExperiencesSummary;
import ip0.ru;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f202533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lxf.k f202534b;

    public c0(a quickFiltersMapper, lxf.k revPointsRewardsBannerMapper) {
        Intrinsics.checkNotNullParameter(quickFiltersMapper, "quickFiltersMapper");
        Intrinsics.checkNotNullParameter(revPointsRewardsBannerMapper, "revPointsRewardsBannerMapper");
        this.f202533a = quickFiltersMapper;
        this.f202534b = revPointsRewardsBannerMapper;
    }

    public static FullScreenStateDelegate.Model b() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("EMPTY_ITEM_ID", new TextLocalisedClause(R$string.experiences_list_empty_state_title, null, null, 14), new TextLocalisedClause(R$string.experiences_list_empty_state_caption, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32752);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static TextLocalisedClause c(TravelExperiencesSummary travelExperiencesSummary, int i) {
        if (travelExperiencesSummary.f93204g.f93183b) {
            return new TextLocalisedClause(R$string.experiences_details_free_cancellation, null, new Custom(Integer.valueOf(i), false, null, false, null, 254), 10);
        }
        return null;
    }

    public static ArrayList d() {
        IntRange intRange = new IntRange(1, 3, 1);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            ru ruVar = new ru(a0.d.n("LOADING_ITEM_ID", it8.nextInt()));
            yp0.b.l(ruVar, 0, 0, 0, 0, null, false, 63);
            arrayList.add(ruVar);
        }
        return arrayList;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        List list;
        Clause compositeClause;
        Clause textLocalisedClause;
        String str;
        String str2;
        n domainState = (n) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lk0.g gVar = domainState.e;
        TravelExperienceFiltersSelection selectedFilters = domainState.f202545g;
        TravelExperienceDatesSelection travelExperienceDatesSelection = domainState.f202543b;
        if (gVar == null || (list = (List) iii.c.g(gVar, new m30.c(this, 17), new lxi.g(this, 25), new koe.y(this, domainState, 29))) == null) {
            list = f0.f322471a;
        }
        List list2 = list;
        int i = b0.f202531a[domainState.f.ordinal()];
        if (i == 1) {
            m70.a.t(t0.f186434a);
            compositeClause = new CompositeClause(zhm.v.k(new TextClause("• ", (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), a1g.f.d(travelExperienceDatesSelection)), null, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            m70.a.c(t0.f186434a);
            compositeClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        m mVar = domainState.f202542a;
        if (mVar instanceof k) {
            String str3 = ((k) mVar).f202540b;
            if (str3 == null) {
                m70.a.c(t0.f186434a);
                str2 = "";
            } else {
                str2 = str3;
            }
            textLocalisedClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else if (mVar instanceof j) {
            String str4 = ((j) mVar).f202538b;
            if (str4 == null) {
                m70.a.c(t0.f186434a);
                str = "";
            } else {
                str = str4;
            }
            textLocalisedClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            if (!(mVar instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.experiences_search_results_destination_user_location, null, null, 14);
        }
        Clause clause = textLocalisedClause;
        Clause clause2 = compositeClause;
        Clause clauseD = a1g.f.d(travelExperienceDatesSelection);
        s sVar = domainState.f;
        List listC = zhm.u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "MENU_ITEM_FILTER_ID", new ResourceImage(R$drawable.uikit_icn_24_filter, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, c8g.c.k(selectedFilters) ? NavBarMenuItemBadge.None.f59309a : NavBarMenuItemBadge.Dot.f59308a, null, 116));
        Data topCategories = domainState.i;
        b bVar = (b) this.f202533a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(topCategories, "topCategories");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        return new u(list2, clause, clause2, clauseD, sVar, listC, (List) iii.c.f(topCategories, new m30.c(11), new lxi.g(24), new koe.y(selectedFilters, bVar, 28)));
    }
}

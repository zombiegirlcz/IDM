package sdg;

import ajd.t;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.property.HotelsInventoryProviderLogos;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestReview;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestReviewContent;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestReviewScore;
import ip0.ia0;
import ip0.ja0;
import ip0.jp;
import ip0.la0;
import ip0.na0;
import ip0.oa0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.v5;
import sa6.y;
import te0.w;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f261886a;

    public l(c guestsReviewsItemMapper) {
        Intrinsics.checkNotNullParameter(guestsReviewsItemMapper, "guestsReviewsItemMapper");
        this.f261886a = guestsReviewsItemMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextClause textClause;
        ja0 ja0Var;
        TextLocalisedClause textLocalisedClause;
        String str;
        l lVar = this;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        do3.n nVar = (do3.n) domainState.f261879a.getContent();
        boolean z = false;
        if (nVar != null) {
            wi0.b.Companion.getClass();
            if (w.S(nVar, wi0.b.f297760n0)) {
                z = true;
            }
        }
        List list = (List) iii.c.f(domainState.f261880b, new y(25), new sa5.a(15), new t(lVar, z, 17));
        lk0.g guestsReviewsPagedData = domainState.f261881c;
        List expandedCardsIds = domainState.d;
        Intrinsics.checkNotNullParameter(guestsReviewsPagedData, "guestsReviewsPagedData");
        Intrinsics.checkNotNullParameter(expandedCardsIds, "expandedCardsIds");
        List list2 = guestsReviewsPagedData.f196174a;
        int i = 10;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((lk0.e) it8.next()).f196171a);
        }
        ArrayList<HotelsPropertyGuestReview> arrayListU = zhm.w.u(arrayList);
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayListU, 10));
        for (HotelsPropertyGuestReview hotelsPropertyGuestReview : arrayListU) {
            String strN = a0.d.n("REVIEW_CARD_ITEM_ID", hotelsPropertyGuestReview.hashCode());
            TextClause textClause2 = new TextClause(hotelsPropertyGuestReview.d, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
            long j2 = hotelsPropertyGuestReview.f98022b;
            TimeClause.Format.INSTANCE.getClass();
            TimeClause timeClause = new TimeClause(j2, TimeClause.Format.f57959a, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
            HotelsPropertyGuestReviewScore hotelsPropertyGuestReviewScoreA = c.a(hotelsPropertyGuestReview.f98023c);
            if (hotelsPropertyGuestReviewScoreA != null) {
                textClause = new TextClause(String.valueOf(hotelsPropertyGuestReviewScoreA.f98026b), (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
            } else {
                m70.a.c(t0.f186434a);
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            HotelsInventoryProviderLogos hotelsInventoryProviderLogos = hotelsPropertyGuestReview.e.f98030c;
            UrlImage urlImageD = hotelsInventoryProviderLogos != null ? h9g.e.d(hotelsInventoryProviderLogos, lVar.f261886a.f261875b.d()) : null;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.hotels_property_reviews_traveller, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), i);
            HotelsPropertyGuestReviewContent hotelsPropertyGuestReviewContent = hotelsPropertyGuestReview.f;
            TextClause textClause3 = (hotelsPropertyGuestReviewContent == null || (str = hotelsPropertyGuestReviewContent.f98024a) == null) ? null : new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            ja0 ja0Var2 = new ja0(c.b(hotelsPropertyGuestReview, expandedCardsIds));
            ia0 ia0Var = ia0.VISIBLE_WHEN_DESCRIPTION_ELLIPSIZED;
            jp jpVarB = c.b(hotelsPropertyGuestReview, expandedCardsIds);
            if (jpVarB instanceof oa0) {
                ja0Var = ja0Var2;
                textLocalisedClause = new TextLocalisedClause(R$string.hotels_common_show_less, null, null, 14);
            } else {
                ja0Var = ja0Var2;
                if (!(jpVarB instanceof na0)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.hotels_common_show_more, null, null, 14);
            }
            la0 la0Var = new la0(strN, textClause2, timeClause, textClause, urlImageD, textLocalisedClause2, textClause3, textLocalisedClause, ia0Var, ja0Var, hotelsPropertyGuestReview, 30720);
            yp0.b.l(la0Var, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(la0Var);
            lVar = this;
            i = 10;
        }
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("REVIEW_EXPLAINER_ITEM_ID", (UrlImage) null, new TextLocalisedClause(R$string.hotels_property_details_guest_reviews_explainer_title, null, null, 14), new TextLocalisedClause(R$string.hotels_property_details_guest_reviews_explainer_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new j(d0.E0(d0.F0(model, arrayList2), list), z ? u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "REVIEW_VERIFICATION_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_info_legacy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, 124)) : f0.f322471a);
    }
}

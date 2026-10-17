package xid;

import aw0.n6;
import aw0.o9;
import aw0.t0;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.ve;
import com.revolut.core.ui_kit.internal.views.SuggestionViewStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.shops.impl.R$string;
import ip0.jh0;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f306344a;

    public n(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f306344a = dateProvider;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        final c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Double d = (Double) domainState.f306324c.getContent();
        final double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.shops_screens_auction_details_title, null, null, 14), null, null, null, false, 30);
        List list = (List) iii.c.f(domainState.f306323b, new xd2.n(this, 28), new xce.d(14), new Function3() { // from class: xid.m
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r30v4, types: [com.revolut.core.ui_kit.models.Clause] */
            /* JADX WARN: Type inference failed for: r4v14 */
            /* JADX WARN: Type inference failed for: r4v8 */
            /* JADX WARN: Type inference failed for: r4v9, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
            /* JADX WARN: Type inference failed for: r7v22 */
            /* JADX WARN: Type inference failed for: r7v23 */
            /* JADX WARN: Type inference failed for: r7v24 */
            /* JADX WARN: Type inference failed for: r7v25 */
            /* JADX WARN: Type inference failed for: r7v28, types: [com.revolut.core.ui_kit.models.TextLocalisedClause] */
            /* JADX WARN: Type inference failed for: r7v29 */
            /* JADX WARN: Type inference failed for: r7v32 */
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                CellDetailsDelegate.Model model;
                ?? r4;
                ?? textLocalisedClause;
                fvb.a auction = (fvb.a) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(auction, "auction");
                List listC = u.c(new ve("PRODUCT_INFO_ITEM_ID", new UrlImage(auction.d, null, null, null, 0L, null, null, null, null, null, false, hjd.d.f152706b, null, null, false, false, 507902), new TextClause(auction.f138406b, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, new TextClause(auction.f138407c, (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122), null, null, null, null, null, 1048552));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                List list2 = listC;
                RevPoints revPoints = auction.f138408g;
                Double dValueOf = revPoints != null ? Double.valueOf(revPoints.J()) : null;
                ZonedDateTime zonedDateTime = auction.e;
                ArrayList arrayList = auction.i;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(Double.valueOf(((RevPoints) it8.next()).J()));
                }
                c cVar = domainState;
                Double d5 = cVar.d;
                RevPoints revPoints2 = auction.f;
                Double dValueOf2 = revPoints2 != null ? Double.valueOf(revPoints2.J()) : null;
                fvb.c cVar2 = auction.f138410j;
                boolean z = cVar.f306322a;
                boolean z3 = (d5 == null || arrayList2.contains(d5)) ? false : true;
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    ZonedDateTime zonedDateTime2 = zonedDateTime;
                    double dDoubleValue2 = ((Number) it9.next()).doubleValue();
                    Double d6 = dValueOf;
                    arrayList3.add(new SuggestionsBarDelegate.Suggestion("BID_SELECTOR_ITEM_ID_" + dDoubleValue2, nub.a.h(dDoubleValue2, null, null, 7), null, null, d5 != null && dDoubleValue2 == d5.doubleValue() ? new SuggestionViewStyle.Accent((Object) null) : new SuggestionViewStyle.Semiaccent((Object) null), false, Double.valueOf(dDoubleValue2), null, 364));
                    zonedDateTime = zonedDateTime2;
                    dValueOf = d6;
                }
                Double d10 = dValueOf;
                ZonedDateTime zonedDateTime3 = zonedDateTime;
                ArrayList arrayListF1 = d0.f1(arrayList3);
                if (z) {
                    if (d5 != null) {
                        r4 = 0;
                        textLocalisedClause = nub.a.h(d5.doubleValue(), null, null, 7);
                    } else {
                        r4 = 0;
                        textLocalisedClause = 0;
                    }
                    if (!z3) {
                        textLocalisedClause = r4;
                    }
                    if (textLocalisedClause == 0) {
                        textLocalisedClause = new TextLocalisedClause(R$string.shops_screens_auction_details_section_details_chip_other, r4, r4, 14);
                    }
                    ?? r302 = textLocalisedClause;
                    ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_edit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    if (!z3) {
                        resourceImage = null;
                    }
                    arrayListF1.add(new SuggestionsBarDelegate.Suggestion("OTHER_SUGGESTION_ID", r302, resourceImage, null, z3 ? new SuggestionViewStyle.Accent((Object) null) : new SuggestionViewStyle.Semiaccent((Object) null), false, null, null, 488));
                }
                aim.e eVarB = u.b();
                if (zonedDateTime3 != null) {
                    CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("TIME_LEFT_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.shops_screens_auction_details_section_time_left_title, null, null, 14), (Image) null, 0, false, 30), gid.b.a(zonedDateTime3, ((l80.f) this.f306341a.f306344a).b()), null, null, null, null, 0, null, false, false, null, null, 32760);
                    yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                    eVarB.add(model2);
                }
                CellDetailsDelegate.Model model3 = d10 != null ? new CellDetailsDelegate.Model("CURRENT_BID_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.shops_screens_auction_details_section_details_highest_bid_title, null, null, 14), (Image) null, 0, false, 30), nub.a.p(d10.doubleValue(), null, null, 7), null, null, null, null, 0, null, false, false, null, null, 32760) : null;
                if (dValueOf2 != null) {
                    model = new CellDetailsDelegate.Model("YOUR_LATEST_BID_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.shops_screens_auction_details_section_details_latest_bid_title, null, null, 14), (Image) null, 0, false, 30), nub.a.p(dValueOf2.doubleValue(), new Custom(Integer.valueOf((cVar2 == fvb.c.WINNING || cVar2 == fvb.c.WON) ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorPerformanceNegative), false, null, false, null, 254), null, 6), null, null, null, null, 0, null, false, false, null, null, 32760);
                } else {
                    model = null;
                }
                Object[] elements = {model3, model, d5 != null ? new CellDetailsDelegate.Model("YOUR_NEXT_BID_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.shops_screens_auction_details_section_details_next_bid_title, null, null, 14), (Image) null, 0, false, 30), nub.a.p(d5.doubleValue(), null, null, 7), null, null, null, null, 0, null, false, false, null, null, 32760) : null, new nh("BID_SELECTOR_ITEM_ID", arrayListF1, jh0.HORIZONTAL_SCROLLER, R$attr.uikit_dp8, 0, 0, 0, 0, 496)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                eVarB.addAll(listL);
                ArrayList arrayListE0 = d0.E0(u.a(eVarB), list2);
                Double d15 = cVar.d;
                double dDoubleValue3 = d15 != null ? d15.doubleValue() : 0.0d;
                double d41 = dDoubleValue;
                boolean z4 = d41 >= dDoubleValue3;
                t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.shops_screens_auction_details_section_disclaimer_title, null, null, 14), (Image) null, 0, false, 30);
                nub.b bVar = new nub.b(0);
                Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254);
                if (z4) {
                    custom = null;
                }
                List listK = v.k(new CellDetailsDelegate.Model("BALANCE_ITEM_ID", t0Var, nub.a.p(d41, custom, bVar, 4), null, null, null, null, 0, null, false, false, null, null, 32760), new PlainTextDelegate.Model("DISCLAIMER_ITEM_ID", (Clause) null, (Clause) new TextLocalisedClause(R$string.shops_screens_auction_details_section_disclaimer_description, null, null, 14), (v5) null, (UrlImage) null, false, pa.NORMAL, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp0, 0, 0, 0, 60910));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return d0.E0(listK, arrayListE0);
            }
        });
        Double d5 = domainState.d;
        return new cii.b((d5 == null || d5.doubleValue() > dDoubleValue) ? d5 != null ? new aw0.h(false, new n6(new TextLocalisedClause(R$string.shops_screens_auction_details_action_buy_points, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "BUY_POINTS_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), new n6(new TextLocalisedClause(R$string.shops_screens_auction_details_action_discover_ways_to_earn, null, null, 14), LargeActionButton.ButtonStyle.o, null, "DISCOVER_EARN_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, null, 121) : new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.shops_screens_auction_details_action_no_bid, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "BID_BUTTON_TAG", false, null, null, 972), null, null, 55) : new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.shops_screens_auction_details_action_bid, u.c(nub.a.p(d5.doubleValue(), null, null, 7)), null, 12), LargeActionButton.ButtonStyle.f58725a, null, "BID_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 55), list, aVar);
    }
}

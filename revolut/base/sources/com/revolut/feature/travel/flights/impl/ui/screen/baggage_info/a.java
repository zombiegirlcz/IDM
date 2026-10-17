package com.revolut.feature.travel.flights.impl.ui.screen.baggage_info;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_info.TravelFlightsBaggageInfoScreenContract$InputData;
import com.revolut.feature.travel.flights.models.domain.search.BaggageItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t4g.c;
import t4g.d;
import t4g.e;
import t4g.f;
import yp0.b;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements n {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsBaggageInfoScreenContract$InputData f93243a;

    public a(TravelFlightsBaggageInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f93243a = inputData;
    }

    public static RowDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, Clause clause, int i, RowDelegate.Model.c.b bVar) {
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i2 = R$attr.uikit_colorForeground;
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.a(companion, i, new Color.Solid(i2), new Color.ModifiedColor(new Color.Solid(i2), 0.1f), 12.0f, null, 48), null, null, false, null, false, 62), textLocalisedClause, null, 0, clause, null, null, 0, bVar, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
    }

    @Override // cli.n
    public final o c(j jVar) {
        c cVar;
        List list;
        TextLocalisedClause textLocalisedClause;
        int i;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TravelFlightsBaggageInfoScreenContract$InputData.Mode mode = this.f93243a.f93239a;
        TravelFlightsBaggageInfoScreenContract$InputData.Mode.StaticInfo staticInfo = TravelFlightsBaggageInfoScreenContract$InputData.Mode.StaticInfo.f93242a;
        int i2 = 14;
        if (Intrinsics.f(mode, staticInfo)) {
            List listK = v.k(a("PERSONAL_BAG_ITEM_ID", new TextLocalisedClause(R$string.travel_flights_baggage_info_item_personal_title, null, null, 14), new TextLocalisedClause(R$string.travel_flights_baggage_info_item_personal_subtitle, null, null, 14), R$drawable.uikit_icn_24_backpack, null), a("CABIN_BAG_ITEM_ID", new TextLocalisedClause(R$string.travel_flights_baggage_info_item_cabin_bag_title, null, null, 14), new TextLocalisedClause(R$string.travel_flights_baggage_info_item_cabin_bag_subtitle, null, null, 14), R$drawable.uikit_icn_24_cabin_bag, null), a("CHECKED_BAG_ITEM_ID", new TextLocalisedClause(R$string.travel_flights_baggage_info_item_checked_bag_title, null, null, 14), new TextLocalisedClause(R$string.travel_flights_baggage_info_item_checked_bag_subtitle, null, null, 14), R$drawable.uikit_icn_24_suitcase, null));
            b.k(listK, 0, 0, 0, 0, 31);
            list = listK;
        } else {
            if (!(mode instanceof TravelFlightsBaggageInfoScreenContract$InputData.Mode.BaggageItems)) {
                throw new NoWhenBranchMatchedException();
            }
            List<BaggageItem> listP0 = d0.P0(((TravelFlightsBaggageInfoScreenContract$InputData.Mode.BaggageItems) mode).f93240a, new f());
            ArrayList arrayList = new ArrayList();
            for (BaggageItem baggageItem : listP0) {
                int i3 = e.f267992a[baggageItem.f93561a.ordinal()];
                if (i3 == 1) {
                    cVar = new c("PERSONAL_BAG_ITEM_ID", R$string.travel_flights_baggage_info_item_personal_title, R$drawable.uikit_icn_24_backpack);
                } else if (i3 == 2) {
                    cVar = new c("CABIN_BAG_ITEM_ID", R$string.travel_flights_baggage_info_item_cabin_bag_title, R$drawable.uikit_icn_24_cabin_bag);
                } else if (i3 == 3) {
                    cVar = new c("CHECKED_BAG_ITEM_ID", R$string.travel_flights_baggage_info_item_checked_bag_title, R$drawable.uikit_icn_24_suitcase);
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = null;
                }
                RowDelegate.Model modelA = cVar == null ? null : a(cVar.f267989a, new TextLocalisedClause(cVar.f267990b, null, null, i2), new TextClause(baggageItem.f93563c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), cVar.f267991c, new RowDelegate.Model.c.b(new TextClause(a0.d.n("x", baggageItem.f93562b), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 126));
                if (modelA != null) {
                    arrayList.add(modelA);
                }
                i2 = 14;
            }
            b.k(arrayList, 0, 0, 0, 0, 31);
            list = arrayList;
        }
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.travel_flights_baggage_info_header_title, null, null, 14);
        if (Intrinsics.f(mode, staticInfo)) {
            textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_baggage_info_header_description, null, null, 14);
        } else {
            if (!(mode instanceof TravelFlightsBaggageInfoScreenContract$InputData.Mode.BaggageItems)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_search_result_baggage_description, null, null, 14);
        }
        lw0.a aVar = new lw0.a(textLocalisedClause4, textLocalisedClause, null, null, false, 28);
        if (Intrinsics.f(mode, staticInfo)) {
            i = 14;
            textLocalisedClause3 = new TextLocalisedClause(R$string.travel_flights_baggage_info_footer_description, null, null, 14);
        } else {
            i = 14;
            if (!(mode instanceof TravelFlightsBaggageInfoScreenContract$InputData.Mode.BaggageItems)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!((TravelFlightsBaggageInfoScreenContract$InputData.Mode.BaggageItems) mode).f93241b) {
                textLocalisedClause2 = null;
                return new cii.b(new aw0.e(false, textLocalisedClause2, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.travel_flights_baggage_info_footer_button, null, null, i), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 53), list, aVar);
            }
            textLocalisedClause3 = new TextLocalisedClause(R$string.travel_flights_baggage_info_infants_disclaimer, null, null, 14);
        }
        textLocalisedClause2 = textLocalisedClause3;
        return new cii.b(new aw0.e(false, textLocalisedClause2, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.travel_flights_baggage_info_footer_button, null, null, i), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 53), list, aVar);
    }
}

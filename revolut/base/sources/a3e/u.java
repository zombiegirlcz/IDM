package a3e;

import android.graphics.Bitmap;
import android.os.Parcelable;
import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.hidden_accounts.api.domain.HiddenAccountsConfig;
import com.revolut.feature.statements.api.models.SelectableOption;
import com.revolut.feature.travel.flights.api.R$plurals;
import com.revolut.feature.travel.flights.models.domain.common.Bound;
import com.revolut.feature.travel.flights.models.domain.payment.Payment;
import com.revolut.feature.travel.flights.models.domain.payment.PriceWithPoints;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchContext;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchContextPassengers;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchResultItem;
import com.revolut.feature.travel.flights.models.domain.search.TravelFlightsItinerary;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.sso.api.models.RevolutAccountSession;
import com.youTransactor.uCube.rpc.Constants;
import d7j.o0;
import ewh.y;
import fb7.j0;
import fb7.k0;
import ip0.bk0;
import ip0.ck0;
import ip0.e8;
import ip0.yj0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.v5;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import qv0.c;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1128a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1129b;

    public u(a5h.i ratingsWidgetMapper) {
        Intrinsics.checkNotNullParameter(ratingsWidgetMapper, "ratingsWidgetMapper");
        this.f1129b = ratingsWidgetMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[LOOP:0: B:9:0x0021->B:77:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final cli.o a(cli.j r14) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3e.u.a(cli.j):cli.o");
    }

    private final cli.o b(cli.j jVar) {
        bh9.a domainState = (bh9.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        bh9.i iVar = domainState.f15267b;
        List list = domainState.e;
        int i = bh9.u.f15290a[iVar.ordinal()];
        boolean z = false;
        if (i == 1) {
            if (!list.isEmpty() && of9.m.b(list, domainState.c())) {
                z = true;
            }
            return new bh9.g(of9.k.b((of9.k) this.f1129b, domainState.e, domainState.c(), domainState.d, null, domainState.f15268c, 8), z, true);
        }
        if (i == 2) {
            return new bh9.g(iii.c.b(null, null, 6, true), false, false);
        }
        if (i == 3) {
            return new bh9.g(iii.c.c(5), false, false);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final cli.o d(cli.j jVar) {
        bj8.b domainState = (bj8.b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (fpa.g) iii.c.f(domainState.f15583a, new bek.a(this, 27), new bhi.c(this, 5), new b88.o(this, 7));
    }

    private final cli.o e(cli.j jVar) {
        buk.d domainState = (buk.d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = buk.j.f18902a[((buk.e) this.f1129b).f18898a.ordinal()];
        if (i == 1) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.instrument_fundamentals_expected_return_eps_growth_contribution_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.instrument_fundamentals_expected_return_eps_growth_contribution_info_description, null, null, 14);
            CellDetailsStandaloneNoteDelegate.Model.Companion companion = CellDetailsStandaloneNoteDelegate.Model.INSTANCE;
            ArrayList arrayListA = CellDetailsStandaloneNoteDelegate.Model.Companion.a(v.k(CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion, "eps-growth-bullet-list-1", new TextLocalisedClause(R$string.instrument_fundamentals_expected_return_eps_growth_contribution_info_bullet_list1, null, null, 14)), CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion, "eps-growth-bullet-list-2", new TextLocalisedClause(R$string.instrument_fundamentals_expected_return_eps_growth_contribution_info_bullet_list2, null, null, 14)), CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion, "eps-growth-bullet-list-3", new TextLocalisedClause(R$string.instrument_fundamentals_expected_return_eps_growth_contribution_info_bullet_list3, null, null, 14))));
            yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
            return new buk.f(textLocalisedClause, textLocalisedClause2, arrayListA);
        }
        if (i == 2) {
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.instrument_fundamentals_expected_return_cell_price_earnings_title, null, null, 14);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.instrument_fundamentals_expected_return_pe_multiple_contribution_info_description, null, null, 14);
            CellDetailsStandaloneNoteDelegate.Model.Companion companion2 = CellDetailsStandaloneNoteDelegate.Model.INSTANCE;
            ArrayList arrayListA2 = CellDetailsStandaloneNoteDelegate.Model.Companion.a(v.k(CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion2, "price-to-earnings-bullet-list-1", new TextLocalisedClause(R$string.instrument_fundamentals_expected_return_pe_multiple_contribution_info_bullet_list1, null, null, 14)), CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion2, "price-to-earnings-bullet-list-2", new TextLocalisedClause(R$string.instrument_fundamentals_expected_return_pe_multiple_contribution_info_bullet_list2, null, null, 14))));
            yp0.b.k(arrayListA2, 0, 0, 0, 0, 31);
            return new buk.f(textLocalisedClause3, textLocalisedClause4, arrayListA2);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.instrument_fundamentals_expected_return_cell_dividends_title, null, null, 14);
        TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.instrument_fundamentals_expected_return_dividend_info_description, null, null, 14);
        CellDetailsStandaloneNoteDelegate.Model.Companion companion3 = CellDetailsStandaloneNoteDelegate.Model.INSTANCE;
        ArrayList arrayListA3 = CellDetailsStandaloneNoteDelegate.Model.Companion.a(v.k(CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion3, "dividend-bullet-list-1", new TextLocalisedClause(R$string.instrument_fundamentals_expected_return_dividend_info_bullet_list1, null, null, 14)), CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion3, "dividend-bullet-list-2", new TextLocalisedClause(R$string.instrument_fundamentals_expected_return_dividend_info_bullet_list2, null, null, 14)), CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion3, "dividend-bullet-list-3", new TextLocalisedClause(R$string.instrument_fundamentals_expected_return_dividend_info_bullet_list3, null, null, 14))));
        yp0.b.k(arrayListA3, 0, 0, 0, 0, 31);
        return new buk.f(textLocalisedClause5, textLocalisedClause6, arrayListA3);
    }

    private final cli.o f(cli.j jVar) {
        bwk.g domainState = (bwk.g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        dwk.b bVar = (dwk.b) this.f1129b;
        Data orderBookData = domainState.f19372a;
        List limitOrders = domainState.f19373b;
        boolean z = domainState.f19374c;
        Intrinsics.checkNotNullParameter(orderBookData, "orderBookData");
        Intrinsics.checkNotNullParameter(limitOrders, "limitOrders");
        return new bwk.h((List) iii.c.f(orderBookData, new dwi.f(bVar, 14), new dug.d(bVar, 5), new dwk.a(bVar, limitOrders, z)));
    }

    private final cli.o g(cli.j jVar) {
        c7b.i domainState = (c7b.i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (c7b.q) iii.c.f(domainState.f21895a, new c42.j(this, 22), new c2f.m(16), new b88.o(this, 29));
    }

    private final cli.o h(cli.j jVar) {
        String strA;
        Image bitmapImage;
        cj6.d domainState = (cj6.d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ri6.f fVar = (ri6.f) this.f1129b;
        ei6.d client = domainState.f24610b;
        ri6.d dVar = domainState.f24609a;
        t70.g localization = fVar.f254565b;
        ei6.b bVar = fVar.f254564a;
        ArrayList arrayList = new ArrayList();
        if (client != null) {
            String str = client.f126446a;
            String title = localization.i(com.revolut.feature.external_accounts.impl.R$string.oba_authorize_funds_title, str);
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(title, "title");
            ArrayList arrayList2 = new ArrayList();
            Bitmap bitmap = client.f126447b;
            if (bitmap == null) {
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i = R$drawable.uikit_icn_24_bank;
                int i2 = R$attr.uikit_colorDeepGrey;
                bitmapImage = LayeredImage.Companion.a(companion, i, new Color.Solid(i2), new Color.ModifiedColor(new Color.Solid(i2), 0.1f), 12.0f, Float.valueOf(32.0f), 32);
            } else {
                bitmapImage = new BitmapImage(bitmap, false, new ImageTransformations(null, new CircleTransformation(Float.valueOf(0.5f), Integer.valueOf(R$attr.uikit_colorGreyTone10), false, 12), null, null, null, 64, 64, 29), 10);
            }
            arrayList2.add(new IconDelegate.Model("image_list_id", bitmapImage, null, null, null, null, null, null, 972));
            TextClause textClause = new TextClause(title, (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124);
            bk0 bk0Var = new bk0(0);
            int i3 = R$attr.uikit_dp16;
            int i5 = R$attr.uikit_dp0;
            int i6 = R$attr.uikit_dp32;
            arrayList2.add(new TextDelegate.Model("title_list_id", textClause, false, bk0Var, null, null, i3, i5, i6, i6, 116));
            a0.x(d0.d1(arrayList2), arrayList);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.oba_authorize_funds_subtitle, zhm.u.c(str), null, 12);
            ck0 ck0Var = new ck0(yj0.CENTER_HORIZONTAL);
            int i21 = R$attr.uikit_dp16;
            int i22 = R$attr.uikit_dp0;
            int i32 = R$attr.uikit_dp32;
            arrayList.add(new TextDelegate.Model("HEADER_SUBTITLE_ID", textLocalisedClause, false, ck0Var, null, null, i21, i22, i32, i32, 116));
        }
        io3.d pocket = dVar != null ? dVar.f254562a : null;
        if (pocket != null) {
            String strO = pocket.f163147c;
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("ACCOUNT_TO_CHARGE_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.oba_authorize_funds_account_to_check, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp32, R$attr.uikit_dp16, 0, 0, 53242);
            c.C1364c c1364c = c.C1364c.f249512a;
            Intrinsics.checkNotNullParameter(c1364c, "<set-?>");
            model.f52717p = c1364c;
            Unit unit = Unit.f186387a;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(strO, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62);
            if (dVar.f254563b) {
                int i33 = com.revolut.feature.external_accounts.impl.R$string.open_banking_consent_flow_accounts_information_header_joint;
                Intrinsics.checkNotNullParameter(localization, "localization");
                strA = com.google.android.gms.internal.mlkit_vision_face.a.o(localization.getString(i33), " ", bVar.a(pocket));
            } else {
                strA = bVar.a(pocket);
            }
            TextClause textClause2 = new TextClause(strA, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            String strB = bVar.f126442b.b(strO);
            if (strB == null) {
                m70.a.c(t0.f186434a);
                strB = "";
            }
            if (!kotlin.text.d0.W(strB)) {
                strO = com.google.android.gms.internal.mlkit_vision_face.a.o(strO, " · ", strB);
            }
            a0.x(v.k(model, new RowDelegate.Model("ACCOUNT_DETAILS_ID", image40, textClause2, null, 0, new TextClause(strO, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)), arrayList);
        }
        return new cj6.h(d0.d1(arrayList));
    }

    private final cli.o i(cli.j jVar) {
        cql.c domainState = (cql.c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_session_popup_title, null, null, 14), null, null, new lw0.k(new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_session_popup_action, null, null, 14), "MENU_ID_NOT_YOU"), false, 22);
        List list = domainState.f108154a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(((tll.r) this.f1129b).f(i, (RevolutAccountSession) obj2));
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList, aVar);
    }

    private final cli.o j(cli.j jVar) {
        d47.f domainState = (d47.f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        d47.i iVar = new d47.i(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_filter_categories_header_title, null, null, 14));
        d47.h hVar = new d47.h(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_filter_categories_action_save, null, null, 14));
        w47.b bVar = (w47.b) this.f1129b;
        Set set = domainState.f111233a;
        return new d47.j(iVar, hVar, w47.b.a(bVar, set, domainState.f111234b, set.size(), false));
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    private final cli.o k(cli.j jVar) {
        d6g.f domainState = (d6g.f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TravelFlightsItinerary itinerary = domainState.f111537a;
        FlightSearchContext header = itinerary.f93597a;
        m7g.d cabinClass = domainState.f111538b;
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(cabinClass, "cabinClass");
        TextClause textClause = new TextClause(header.f93565a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(header, "<this>");
        LocalDate localDate = header.e;
        int i = 0;
        List listK = v.k(textClause, new ImageClause(localDate != null ? R$drawable.uikit_icn_24_arrow_right_left : R$drawable.uikit_icn_24_arrow_thin_right, (Integer) null, (Float) null, (Float) null, 30), new TextClause(header.f93566b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        m70.a.t(t0.f186434a);
        CompositeClause compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        Intrinsics.checkNotNullParameter(header, "<this>");
        int i2 = 14;
        ?? r72 = 0;
        TextLocalisedClause textLocalisedClause = localDate != null ? new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_itinerary_details_header_round_trip, null, null, 14) : new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_itinerary_details_header_one_way, null, null, 14);
        TextLocalisedClause textLocalisedClauseQ = ue8.c.Q(cabinClass);
        FlightSearchContextPassengers flightSearchContextPassengers = header.f93567c;
        Clause[] elements = {textLocalisedClause, textLocalisedClauseQ, new TextLocalisedQuantityClause(R$plurals.travel_flights_itinerary_details_header_passenger, Integer.valueOf(flightSearchContextPassengers.f93568a + flightSearchContextPassengers.f93569b), (List) null, (Style) null, 28)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        d6g.a aVar = new d6g.a(compositeClause, compositeClause, new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12), new UrlImage(header.f, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286));
        FlightSearchResultItem flightSearchResultItem = itinerary.f93598b;
        ArrayList traits = flightSearchResultItem.f;
        Intrinsics.checkNotNullParameter(traits, "traits");
        List listA = q4g.n.a(traits.contains(r7g.f.ONE_WAY_COMBINATION));
        f6g.a aVar2 = (f6g.a) this.f1129b;
        Intrinsics.checkNotNullParameter(itinerary, "itinerary");
        aim.e eVarB = zhm.u.b();
        for (Object obj2 : flightSearchResultItem.f93590b) {
            int i3 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            Bound bound = (Bound) obj2;
            ArrayList arrayListA = f6g.a.a(bound, i);
            String strN = a0.d.n("bound_subheader_", i);
            TextLocalisedClause textLocalisedClause2 = i == 0 ? new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_itinerary_details_card_outbound, r72, r72, i2) : new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_itinerary_details_card_return, r72, r72, i2);
            p4g.b bVar = aVar2.f132424a;
            LocalDate date = bound.f93484a.d.toLocalDate();
            Intrinsics.checkNotNullExpressionValue(date, "toLocalDate(...)");
            Intrinsics.checkNotNullParameter(date, "date");
            String str = p4g.b.f232928b.withLocale(((s80.b) bVar.f232929a).b()).format(date);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            List listK2 = v.k(textLocalisedClause2, new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124));
            m70.a.t(t0.f186434a);
            CompositeClause compositeClause2 = new CompositeClause(listK2, new TextClause(kotlin.text.a0.C(" ", 2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            int i5 = bound.d;
            eVarB.addAll(yp0.b.g(arrayListA, new ListSubheaderDelegate.Model(strN, (Image) null, (Clause) compositeClause2, (Image) null, i5 == 0 ? new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_search_result_card_bound_direct, null, null, 14) : new TextLocalisedQuantityClause(R$plurals.travel_flights_search_result_card_bound_stops, Integer.valueOf(i5), (List) null, (Style) null, 28), (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65514), null, 0, 0, 126));
            i = i3;
            i2 = 14;
            r72 = 0;
        }
        ?? r122 = r72;
        Payment payment = flightSearchResultItem.d;
        aim.e eVarB2 = zhm.u.b();
        dj0.d dVar = payment.f93534a;
        aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_search_result_card_price_title, r122, r122, 14), (Image) null, 0, false, 30);
        MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        o9 o9Var = o9.NON_SENSITIVE;
        eVarB2.add(new CellDetailsDelegate.Model("price_row", t0Var, new MoneyClause(dVar, defaults, null, o9Var, 4), null, null, null, null, 0, null, false, false, null, null, 30712));
        PriceWithPoints priceWithPoints = payment.f93535b;
        Object e8Var = priceWithPoints != null ? new e8("price_box_id", new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_search_result_card_pay_with_points_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), new nw0.a(priceWithPoints.f93543b.b(), new MoneyClause(priceWithPoints.f93542a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4)), payment, 0, 0, DefaultFrameSampler.DESIRED_FRAME_WIDTH) : q4g.m.a(payment, "points_you_earn_row", R$attr.uikit_dp12);
        if (e8Var != null) {
            eVarB2.add(e8Var);
        }
        aim.e eVarA = zhm.u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        return new d6g.k(aVar, d0.E0(zhm.u.a(eVarB), listA));
    }

    private final cli.o l(cli.j jVar) {
        dbc.d domainState = (dbc.d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new dbc.f(new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_deliveries_title, null, null, 14), (List) iii.c.f(t1.t(domainState.f112707a, domainState.f112708b), new dak.c(this, 5), new o0(this, 19), new cf1.h(this, 29)));
    }

    private final cli.o m(cli.j jVar) {
        e1c.j domainState = (e1c.j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new e1c.m((List) iii.c.f(domainState.f121951a, new dz7.k(this, 29), new e07.k(this), new dn8.k(this, domainState, 7)), domainState.f121951a.getContent() != null);
    }

    private final cli.o n(cli.j jVar) {
        e5e.c domainState = (e5e.c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new e5e.d(((a5h.i) this.f1129b).a(domainState.f122811a));
    }

    private final cli.o o(cli.j jVar) {
        ec8.g domainState = (ec8.g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new ec8.j((List) iii.c.f(t1.v(domainState.d, domainState.f124462a, domainState.f124464c, domainState.f124463b), new ebi.i(6), new e6e.a(22), new ec8.q(this, 0)));
    }

    private final cli.o p(cli.j jVar) {
        eg9.c domainState = (eg9.c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new eg9.d(((of9.b) this.f1129b).a(domainState.f125571b));
    }

    private final cli.o q(cli.j jVar) {
        f1c.l domainState = (f1c.l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new f1c.s((List) iii.c.f(domainState.f131244a, new f0d.k(this, 7), new y(this, 18), new f0e.i(this, domainState, 2)), domainState.f131246c);
    }

    private final cli.o r(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        List listA;
        ib7.i iVar;
        fb7.j domainState = (fb7.j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.d;
        na7.b bVar = domainState.f133484c;
        int size = domainState.e.size();
        ib7.j jVar2 = (ib7.j) this.f1129b;
        Intrinsics.checkNotNullParameter(domainState, "domain");
        Map map = jVar2.f160113a;
        HiddenAccountsConfig hiddenAccountsConfig = domainState.f133483b;
        phm.a aVar = (phm.a) map.get(hiddenAccountsConfig.f74646a);
        ib7.h fVar = (aVar == null || (iVar = (ib7.i) aVar.get()) == null) ? new ib7.f(f0.f322471a) : iVar.a(domainState);
        boolean z3 = fVar instanceof ib7.f;
        List listA2 = fVar.a();
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause3 = null;
        if (z) {
            int i = ib7.k.f160114a[bVar.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.hidden_accounts.impl.R$string.hidden_accounts_multiselect_header_title, null, null, 14);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.hidden_accounts.impl.R$string.secret_accounts_selection_title, null, null, 14);
            }
        } else {
            int i2 = ib7.k.f160114a[bVar.ordinal()];
            if (i2 == 1) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.hidden_accounts.impl.R$string.hidden_accounts_header_title, null, null, 14);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.hidden_accounts.impl.R$string.secret_accounts_header_title, null, null, 14);
            }
        }
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (z) {
            listA = f0.f322471a;
        } else {
            aim.e eVarB = zhm.u.b();
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            int i3 = j0.f133486a[bVar.ordinal()];
            if (i3 == 1) {
                textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.hidden_accounts.impl.R$string.hidden_accounts_header_title, null, null, 14);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.hidden_accounts.impl.R$string.secret_accounts_header_title, null, null, 14);
            }
            eVarB.add(new IconNavBarMenuItem("HIDDEN_ACCOUNTS_INFO_MENU_BUTTON_LIST_ID", resourceImage, textLocalisedClause2, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
            if ((hiddenAccountsConfig instanceof HiddenAccountsConfig.Accounts) && domainState.f133485g && !z3) {
                eVarB.add(new IconNavBarMenuItem("MULTI_SELECT_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.hidden_accounts.impl.R$string.hidden_accounts_multiselect_header_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
            }
            listA = zhm.u.a(eVarB);
        }
        TextLocalisedClause textLocalisedClause4 = z ? size > 1 ? new TextLocalisedClause(com.revolut.feature.hidden_accounts.impl.R$string.hidden_accounts_multiselect_button_title_multiple, zhm.u.c(Integer.valueOf(size)), null, 12) : new TextLocalisedClause(com.revolut.feature.hidden_accounts.impl.R$string.hidden_accounts_multiselect_button_title_single, null, null, 14) : null;
        boolean z4 = z && size > 0;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (z) {
            int i5 = ib7.m.f160115a[bVar.ordinal()];
            if (i5 == 1) {
                textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.hidden_accounts.impl.R$string.secret_accounts_selection_subtitle, null, null, 14);
            } else if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new fb7.d0(listA2, textLocalisedClause, listA, z, textLocalisedClause4, z4, textLocalisedClause3);
    }

    private final cli.o s(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        fj6.b bVar = (fj6.b) this.f1129b;
        return new cii.b(null, bVar.f135542b, bVar.f135541a);
    }

    private final cli.o t(cli.j jVar) {
        fuc.d domainState = (fuc.d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new fuc.f((List) iii.c.f(domainState.f138172a, new ft4.w(13), new fq7.j(19), new fnk.o(this, 6)));
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final cli.o u(cli.j r48) {
        /*
            Method dump skipped, instruction units count: 1902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3e.u.u(cli.j):cli.o");
    }

    private final cli.o v(cli.j jVar) {
        g22.b domainState = (g22.b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(null, ((q12.g) this.f1129b).a(domainState.f139763b, domainState.f139762a, domainState.f139764c), new lw0.a(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_transfer_fee_breakdown_with_exchange_title, null, null, 14), null, null, null, false, 30));
    }

    private final cli.o w(cli.j jVar) {
        Clause timeClause;
        PlainTextDelegate.Model model;
        gvl.j domainState = (gvl.j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        gvl.m mVar = new gvl.m(new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_frequency_settings_toolbar_title, null, null, 14));
        ivl.a aVar = (ivl.a) this.f1129b;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LocalDate localDate = domainState.f147221a;
        sel.a aVar2 = domainState.f;
        boolean z = aVar2 == sel.a.MONTHLY && localDate.getDayOfMonth() >= 29;
        if (Intrinsics.f(localDate, ((l80.f) aVar.f168884b).e())) {
            timeClause = new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_frequency_settings_today, null, null, 14);
        } else {
            long jF = oc.c.F(localDate);
            TimeClause.Format.INSTANCE.getClass();
            timeClause = new TimeClause(jF, TimeClause.Format.f57959a, null, null, 12);
        }
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("START_DATE_ITEM_ID", timeClause, new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_frequency_settings_start_date, null, null, 14), null, false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33558536, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model modelA = yp0.r.a(new InputTextDelegate.Model("PERIOD_ITEM_ID", aVar.f168883a.k(aVar2), new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_frequency_settings_repeat, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33554440, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        if (z) {
            model = new PlainTextDelegate.Model("END_OF_MONTH_DISCLAIMER_LIST_ID", (Clause) null, (Clause) new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_frequency_settings_end_of_month_disclaimer, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        } else {
            model = null;
        }
        qv0.i[] elements = {model2, modelA, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new gvl.n(mVar, listL, new gvl.l(new TextLocalisedClause(R.string.common_action_schedule, null, null, 14)));
    }

    private final cli.o x(cli.j jVar) {
        Clause compositeClause;
        gzd.e domainState = (gzd.e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f148053a;
        Set set = domainState.f148054b;
        List<SelectableOption> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (SelectableOption selectableOption : list2) {
            mzd.d dVar = (mzd.d) this.f1129b;
            boolean zContains = set.contains(selectableOption.getType());
            Intrinsics.checkNotNullParameter(selectableOption, "selectableOption");
            arrayList.add(dVar.a("ID_TRANSACTION_CATEGORY_SELECTABLE_", "ID_TRANSACTION_CATEGORY_ITEM_", selectableOption, zContains));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        if (set.isEmpty()) {
            compositeClause = new TextLocalisedClause(R.string.common_action_select, null, null, 14);
        } else {
            List listK = v.k(new TextLocalisedClause(R.string.common_action_select, null, null, 14), new TextClause(String.valueOf(set.size()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            m70.a.a(t0.f186434a);
            compositeClause = new CompositeClause(listK, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        return new gzd.g(arrayList, compositeClause, !set.isEmpty(), domainState.f148055c ? new TextLocalisedClause(R.string.common_action_clear, null, null, 14) : new TextLocalisedClause(com.revolut.feature.statements.R$string.statement_switcher_bar_button_select_all, null, null, 14));
    }

    private final cli.o y(cli.j jVar) {
        hkj.d domainState = (hkj.d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new hkj.e((List) iii.c.f(domainState.f152932a, new hhd.n(this, 18), new hkb.e(1), new gna.i(this, 27)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0b2e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0b60  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0c90  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0cd5  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0cda  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r120) {
        /*
            Method dump skipped, instruction units count: 3618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3e.u.c(cli.j):cli.o");
    }

    public u(fj6.b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f1129b = inputData;
    }

    public u(b contentMapper) {
        Intrinsics.checkNotNullParameter(contentMapper, "contentMapper");
        this.f1129b = contentMapper;
    }

    public u(ivl.c toolbarStateMapper, ivl.a contentListItemsStateMapper, ivl.b nextButtonStateMapper) {
        Intrinsics.checkNotNullParameter(toolbarStateMapper, "toolbarStateMapper");
        Intrinsics.checkNotNullParameter(contentListItemsStateMapper, "contentListItemsStateMapper");
        Intrinsics.checkNotNullParameter(nextButtonStateMapper, "nextButtonStateMapper");
        this.f1129b = contentListItemsStateMapper;
    }

    public u(dwk.b sharedItemsMapper) {
        Intrinsics.checkNotNullParameter(sharedItemsMapper, "sharedItemsMapper");
        this.f1129b = sharedItemsMapper;
    }

    public u(e1c.d selectPlanUpsellItemMapper) {
        Intrinsics.checkNotNullParameter(selectPlanUpsellItemMapper, "selectPlanUpsellItemMapper");
        this.f1129b = selectPlanUpsellItemMapper;
    }

    public u(ksa.a itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f1129b = itemsMapper;
    }

    public u(of9.b fieldMapper) {
        Intrinsics.checkNotNullParameter(fieldMapper, "fieldMapper");
        this.f1129b = fieldMapper;
    }

    public u(ri6.f openBankingAuthFundsMapper) {
        Intrinsics.checkNotNullParameter(openBankingAuthFundsMapper, "openBankingAuthFundsMapper");
        this.f1129b = openBankingAuthFundsMapper;
    }

    public u(txh.b commonMapper, k18.c unifiedMapper) {
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(unifiedMapper, "unifiedMapper");
        this.f1129b = unifiedMapper;
    }

    public u(dcl.q navBarMapper, o7.d itemsBuilder) {
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(itemsBuilder, "itemsBuilder");
        this.f1129b = itemsBuilder;
    }

    public u(f1c.f itemMapper) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        this.f1129b = itemMapper;
    }

    public u(f6g.b headerMapper, f6g.a cardMapper, q4g.n separateTicketsBannerMapper) {
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(cardMapper, "cardMapper");
        Intrinsics.checkNotNullParameter(separateTicketsBannerMapper, "separateTicketsBannerMapper");
        this.f1129b = cardMapper;
    }

    public u(r39.a validationResultsMapper, d4m.a cameraResultMapper) {
        Intrinsics.checkNotNullParameter(validationResultsMapper, "validationResultsMapper");
        Intrinsics.checkNotNullParameter(cameraResultMapper, "cameraResultMapper");
        this.f1129b = cameraResultMapper;
    }

    public u(a7b.b itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f1129b = itemsMapper;
    }

    public u(w47.b transactionExportComponentMapper) {
        Intrinsics.checkNotNullParameter(transactionExportComponentMapper, "transactionExportComponentMapper");
        this.f1129b = transactionExportComponentMapper;
    }

    public u(buk.e input, buk.h epsGrowthChartInfoBuilder, buk.i priceToEarningsInfoInfoBuilder, buk.g dividendChartInfoBuilder) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(epsGrowthChartInfoBuilder, "epsGrowthChartInfoBuilder");
        Intrinsics.checkNotNullParameter(priceToEarningsInfoInfoBuilder, "priceToEarningsInfoInfoBuilder");
        Intrinsics.checkNotNullParameter(dividendChartInfoBuilder, "dividendChartInfoBuilder");
        this.f1129b = input;
    }

    public u(of9.k commonProvider, of9.m validator) {
        Intrinsics.checkNotNullParameter(commonProvider, "commonProvider");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f1129b = commonProvider;
    }

    public u(aj8.a juniorPaymentLinkCardProfileMapper) {
        Intrinsics.checkNotNullParameter(juniorPaymentLinkCardProfileMapper, "juniorPaymentLinkCardProfileMapper");
        this.f1129b = juniorPaymentLinkCardProfileMapper;
    }

    public u(q12.g quoteMapper) {
        Intrinsics.checkNotNullParameter(quoteMapper, "quoteMapper");
        this.f1129b = quoteMapper;
    }

    public u(xtc.c securityHubCardItemMapper) {
        Intrinsics.checkNotNullParameter(securityHubCardItemMapper, "securityHubCardItemMapper");
        this.f1129b = securityHubCardItemMapper;
    }

    public u(tll.r revolutAccountsUiFactory) {
        Intrinsics.checkNotNullParameter(revolutAccountsUiFactory, "revolutAccountsUiFactory");
        this.f1129b = revolutAccountsUiFactory;
    }

    public u(fbc.b itemMapper) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        this.f1129b = itemMapper;
    }

    public u(ib7.j hiddenAccountsListItemMapperManager, k0 menuItemsFactory, ib7.l navBarTitleMapper, ib7.n toolbarDescriptionMapper) {
        Intrinsics.checkNotNullParameter(hiddenAccountsListItemMapperManager, "hiddenAccountsListItemMapperManager");
        Intrinsics.checkNotNullParameter(menuItemsFactory, "menuItemsFactory");
        Intrinsics.checkNotNullParameter(navBarTitleMapper, "navBarTitleMapper");
        Intrinsics.checkNotNullParameter(toolbarDescriptionMapper, "toolbarDescriptionMapper");
        this.f1129b = hiddenAccountsListItemMapperManager;
    }

    public u(mzd.d selectableOptionMapper) {
        Intrinsics.checkNotNullParameter(selectableOptionMapper, "selectableOptionMapper");
        this.f1129b = selectableOptionMapper;
    }

    public u(fc8.c allowanceListItemMapper) {
        Intrinsics.checkNotNullParameter(allowanceListItemMapper, "allowanceListItemMapper");
        this.f1129b = allowanceListItemMapper;
    }

    public u(r10.v itemMapper) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        this.f1129b = itemMapper;
    }

    public u(jkj.e invoicesItemsMapper) {
        Intrinsics.checkNotNullParameter(invoicesItemsMapper, "invoicesItemsMapper");
        this.f1129b = invoicesItemsMapper;
    }

    public u(anc.u headerMapper, anc.s amountInputMapper, anc.t buttonsMapper) {
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(amountInputMapper, "amountInputMapper");
        Intrinsics.checkNotNullParameter(buttonsMapper, "buttonsMapper");
        this.f1129b = amountInputMapper;
    }

    public u(c7b.r itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f1129b = itemsMapper;
    }
}

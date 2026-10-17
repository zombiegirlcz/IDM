package p2b;

import android.os.Parcelable;
import aw0.d1;
import aw0.j1;
import aw0.o9;
import aw0.r6;
import aw0.s6;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ToDoItemDelegate;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.s4;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.pay_later.impl.models.right_to_cancel.RightToCancelIntroContent;
import com.revolut.feature.retail.savings.api.documents.models.TaxForm;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingPayload;
import ip0.dt;
import ip0.jl0;
import ip0.v7;
import ip0.zj;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kl7.k0;
import kl7.l0;
import kl7.m0;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import lbf.p;
import org.jmrtd.lds.LDSFile;
import xl7.n;
import xl7.r;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232191a;

    public /* synthetic */ a(int i) {
        this.f232191a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        RightToCancelIntroContent content = (RightToCancelIntroContent) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ResourceImage resourceImage = null;
        String str = null;
        return u.c(new PromptMarketingContentDelegate.Model("cancellation_intro_prompt", ky4.a.a(R$string.credit_right_to_cancel_intro_title, content.f78853b), ky4.a.a(R$string.credit_right_to_cancel_intro_description, content.f78854c), new PromptMarketingContentDelegate.Model.Content.MediaContent(new GlyphImage(content.f78852a.c(), null, null, 6), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) ky4.a.a(R$string.credit_right_to_cancel_intro_primary_button_label, content.d), resourceImage, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), new PromptMarketingContentDelegate.Model.Button((Clause) ky4.a.a(R$string.credit_right_to_cancel_intro_secondary_button_label, content.e), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, false, str, 54), null, null, str, null, null, null, null, null, null, null, 2095536));
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        od0.i optionalSetting = (od0.i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(optionalSetting, "optionalSetting");
        soa.b bVar = (soa.b) optionalSetting.f224257a;
        if (bVar == null) {
            return null;
        }
        boolean z = false;
        return new RowDelegate.Model("SMART_NOTIFICATIONS_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_invest, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_settings_stocks_invest_insights_alerts_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_settings_stocks_invest_insights_alerts_subtitle, null, null, 14), null, null, 0, null, true, null, false, null, null, null, null, null, null, new ple.b(bVar), null, 0, 0, 0, 0, 532674520);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.isEmpty()) {
            List listC = u.c(new FullScreenStateDelegate.Model("EMPTY_STATE_LIST_ITEM_ID", new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_documents_tax_documents_empty_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D021", null, null, null, 30)), null, zj.REGULAR, false, null, null, null, 1988));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        List listP0 = d0.P0(content, new pnb.e());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj5 : listP0) {
            Integer numValueOf = Integer.valueOf(((TaxForm) obj5).f83139c);
            Object objU = linkedHashMap.get(numValueOf);
            if (objU == null) {
                objU = v7.u(linkedHashMap, numValueOf);
            }
            ((List) objU).add(obj5);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            List<TaxForm> list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            for (TaxForm taxForm : list) {
                String str = taxForm.f83137a;
                boolean z = false;
                arrayList2.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, taxForm, null, 0, 0, 0, 0, 532676600));
            }
            arrayList.add(yp0.b.g(arrayList2, new ListSubheaderDelegate.Model(String.valueOf(iIntValue), (Image) null, (Clause) new TextClause(String.valueOf(iIntValue), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, R$attr.uikit_dp16, LDSFile.EF_DG4_TAG));
        }
        return w.u(arrayList);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        String str = (String) pair.f186385a;
        String str2 = (String) pair.f186386b;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        CircleBadgeModel circleBadgeModel = null;
        ProgressStyle progressStyle = null;
        boolean z = false;
        NewBadgeContent newBadgeContent = null;
        CircleBadgeModel circleBadgeModel2 = null;
        ProgressStyle progressStyle2 = null;
        boolean z3 = false;
        NewBadgeContent newBadgeContent2 = null;
        List listK = v.k(new RowDelegate.Model("ID_REVOLUT_TERMS_ITEM", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_document, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), circleBadgeModel, progressStyle, z, newBadgeContent, false, 62), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_help_terms_general_conditions_of_sale_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, str, null, 0, 0, 0, 0, 532676600), new RowDelegate.Model("ID_PARTNER_TERMS_ITEM", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_document, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), circleBadgeModel2, progressStyle2, z3, newBadgeContent2, false, 62), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_help_terms_terms_of_service_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, str2, null, 0, 0, 0, 0, 532676600));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [aw0.h1, com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final Object e(Object obj2, Object obj3, Object obj4) {
        ?? r122;
        int i;
        TextLocalisedClause textLocalisedClause;
        List listK;
        k0 drivingStatistics = (k0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(drivingStatistics, "drivingStatistics");
        RowDelegate.Model.MainImage.Image24 image24A = sr7.e.a(nr7.b.LIMIT, R$attr.uikit_colorAccent);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_smart_driving_driving_score_title, null, null, 14);
        CompositeClause compositeClauseE = xl7.l.e(drivingStatistics);
        l0 l0Var = drivingStatistics.f185348c;
        RowDelegate.Model model = new RowDelegate.Model("SMART_DRIVING_SCORE_HEADER", image24A, textLocalisedClause2, null, 0, compositeClauseE, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        TextClause textClauseD = xl7.l.d(drivingStatistics);
        Intrinsics.checkNotNullParameter(drivingStatistics, "<this>");
        Intrinsics.checkNotNullParameter(drivingStatistics, "<this>");
        Integer numValueOf = l0Var != null ? Integer.valueOf(l0Var.f185353a) : null;
        if (numValueOf == null) {
            r122 = 0;
            i = 14;
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_smart_driving_driving_score_title_no_score, null, null, 14);
        } else {
            r122 = 0;
            i = 14;
            int iIntValue = numValueOf.intValue();
            textLocalisedClause = new TextLocalisedClause((Integer.MIN_VALUE > iIntValue || iIntValue >= 50) ? (50 > iIntValue || iIntValue >= 70) ? (70 > iIntValue || iIntValue >= 85) ? com.revolut.feature.insurance_car.impl.R$string.car_insurance_smart_driving_driving_score_summary_excellent : com.revolut.feature.insurance_car.impl.R$string.car_insurance_smart_driving_driving_score_summary_very_good : com.revolut.feature.insurance_car.impl.R$string.car_insurance_smart_driving_driving_score_summary_good : com.revolut.feature.insurance_car.impl.R$string.car_insurance_smart_driving_driving_score_summary_poor, null, null, 14);
        }
        j1 j1Var = new j1(r122, textClauseD, new d1(textLocalisedClause));
        Intrinsics.checkNotNullParameter(drivingStatistics, "<this>");
        Intrinsics.checkNotNullParameter(drivingStatistics, "<this>");
        float fIntValue = (l0Var != null ? Integer.valueOf(l0Var.f185353a) : r122) != 0 ? r3.intValue() : BitmapDescriptorFactory.HUE_RED;
        Intrinsics.checkNotNullParameter(drivingStatistics, "<this>");
        s6 s6Var = new s6(fIntValue, BitmapDescriptorFactory.HUE_RED, 100.0f, 0, 0, 0, l0Var != null, 378);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_smart_driving_driving_score_description_no_score, r122, new Click(30, (Integer) null, (Object) null, "SMART_DRIVING_SCORE_LEARN_MORE", false), 10);
        nr7.b bVar = nr7.b.DRIVING_LICENCE;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List listK2 = v.k(model, new dt("SMART_DRIVING_SCORE_CIRCLE_PROGRESS", j1Var, s6Var, new r6(new ResourceImage(hx7.l.H(bVar), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), textLocalisedClause3, null, 992));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        List list = listK2;
        Intrinsics.checkNotNullParameter(drivingStatistics, "<this>");
        aim.e eVarB = u.b();
        a0.x((l0Var == null || (listK = v.k(xl7.l.a(r.Speed, l0Var.f185354b), xl7.l.a(r.Braking, l0Var.f185355c), xl7.l.a(r.Acceleration, l0Var.d), xl7.l.a(r.Corners, l0Var.e), xl7.l.a(r.Environment, l0Var.f))) == null) ? f0.f322471a : listK, eVarB);
        m0 m0Var = drivingStatistics.d;
        a0.x(v.k(xl7.l.a(r.Trips, m0Var.f185359a), xl7.l.a(r.HoursDriven, m0Var.f185360b)), eVarB);
        eg egVar = new eg("SMART_DRIVING_SCORE_DATA_POINTS_PAGER", u.a(eVarB), null, 8.0f, 0, 0, 1012);
        yp0.b.l(egVar, R$attr.uikit_dp8, 0, 0, 0, null, false, 62);
        ArrayList arrayListF0 = d0.F0(egVar, list);
        RowDelegate.Model model2 = new RowDelegate.Model("SPEED_EVENTS_LEARN_MORE", n.k(R$drawable.uikit_icn_24_limit, false, r122, 15), new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_smart_driving_speed_alerts_top_label, r122, r122, i), null, 0, new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_smart_driving_speed_alerts_limit, r122, r122, i), null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_smart_driving_speed_alerts_learn, r122, r122, i), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return d0.E0(u.c(model2), arrayListF0);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj3).getClass();
        return ((tsl.j) obj2).a().getF104631b();
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        AsftPass pass = (AsftPass) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pass, "pass");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_pass_details_date, null, null, 14);
        long epochMilli = pass.f98715c.toEpochMilli();
        TimeClause.Format.INSTANCE.getClass();
        TimeClause.Format.DateMedium dateMedium = TimeClause.Format.f57959a;
        TimeZone timeZone = pass.f98718j;
        TimeClause timeClause = new TimeClause(epochMilli, dateMedium, null, timeZone.toZoneId(), 4);
        s4 s4Var = s4.FIXED_SMALL;
        CounterTextDelegate.Model model = new CounterTextDelegate.Model("list_id_pass_details_date", textLocalisedClause, new t4(timeClause, s4Var), null, false, null, null, 0, 0, 0, 0, 2024);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        CounterTextDelegate.Model model2 = new CounterTextDelegate.Model("list_id_pass_details_time_slot", new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_pass_details_time_slot, null, null, 14), new t4(new TimeClause(pass.f98715c.toEpochMilli(), TimeClause.Format.TimeDefault.f57977b, null, timeZone.toZoneId(), 4), s4Var), null, false, null, null, 0, 0, 0, 0, 2024);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return u.c(pui.c.b(v.k(model, model2)));
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        AsftPass asftPass = (AsftPass) pair.f186385a;
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("list_id_manage_booking", new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_pass_details_manage_booking, null, null, 14), 0, false, new AsftManageBookingPayload((String) pair.f186386b, asftPass.f98713a, asftPass.i, asftPass.o, asftPass.u), null, null, 2028);
        yp0.b.l(model, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        return u.c(model);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        Pair pair;
        AsftPass pass = (AsftPass) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pass, "pass");
        aim.e eVarB = u.b();
        List listK = v.k(new TextClause(pass.f98717h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(pass.i, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        t0 t0Var = t0.f186434a;
        eVarB.add(new EsimDelegate.Model("LIST_ID_INFO_SUMMARY", new CountryImage(pass.f98722p.f297794a, (Integer) null, (ez0.e) null, 14), null, null, new CompositeClause(listK, new TextClause(m70.a.o(t0Var), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, null, false, new AccentCircleBadge(dw0.a.Travel), false, null, null, 13292));
        OffsetDateTime offsetDateTime = pass.o;
        if (offsetDateTime != null) {
            OffsetDateTime offsetDateTimeNow = OffsetDateTime.now();
            Intrinsics.h(offsetDateTimeNow);
            pair = offsetDateTimeNow.isAfter(offsetDateTime) ? new Pair(Integer.valueOf(R$drawable.uikit_icn_16_cross), new CompositeClause(v.k(new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_manage_booking_cancellation_deadline_passed_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), pui.c.a(offsetDateTime, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254))), new TextClause(m70.a.o(t0Var), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)) : new Pair(Integer.valueOf(R$drawable.uikit_icn_16_check), pui.c.a(offsetDateTime, new Custom(Integer.valueOf(R$attr.uikit_colorStatusSuccess), false, null, false, null, 254), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254)));
        } else {
            Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_16_cross);
            List listC = u.c(new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_terminals_card_cancellation_period_unavailable, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10));
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            pair = new Pair(numValueOf, new CompositeClause(listC, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12));
        }
        int iIntValue = ((Number) pair.f186385a).intValue();
        Clause clause = (Clause) pair.f186386b;
        ToDoItemDelegate.Companion companion = ToDoItemDelegate.INSTANCE;
        List listK2 = v.k(new jl0("list_id_cancellation_note", new ResourceImage(iIntValue, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), clause), new jl0("list_id_min_child_age", new ResourceImage(R$drawable.uikit_icn_16_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_number_of_travellers_header_subtitle, u.c(Integer.valueOf(pass.f98723q)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8)));
        companion.getClass();
        ToDoItemDelegate.Companion.a(listK2);
        ((jl0) listK2.get(0)).f = R$attr.uikit_dp0;
        eVarB.addAll(listK2);
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        p content = (p) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        od0.i.Companion.getClass();
        return od0.h.a(content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0c57  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04cd A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v29, types: [java.math.BigDecimal] */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /* JADX WARN: Type inference failed for: r41v7 */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v17, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v32 */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r70, java.lang.Object r71, java.lang.Object r72) {
        /*
            Method dump skipped, instruction units count: 3550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2b.a.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f232191a = i;
    }
}

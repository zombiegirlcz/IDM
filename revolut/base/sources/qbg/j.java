package qbg;

import aim.o;
import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import bbj.d;
import ch.qos.logback.core.net.SyslogConstants;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LightPromptDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.cd;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.ld;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.t7;
import com.revolut.core.ui_kit.delegates.yc;
import com.revolut.core.ui_kit.delegates.zc;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.models.preapplication.PreApplicationCheckItem;
import com.revolut.feature.credit.application.models.preapplication.PreApplicationChecksScenario;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.CreditPromptScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Payment;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.feature.revolutpay.api.shared.domain.models.ramp.RampOrderDetails;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import com.revolut.feature.travel.miles.api.model.TravelMilesFlightFilters$FilterOption;
import com.revolut.feature.travel.miles.api.model.TravelMilesMoneyRangeFilter;
import com.revolut.feature.travel.miles.api.model.TravelMilesNumberRangeFilter;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAppliedFilters;
import com.revolut.feature_travel_hotels_models.favorites.HotelsFavoriteDestination;
import com.revolut.feature_travel_hotels_models.favorites.HotelsFavoriteProperty;
import com.revolut.feature_travel_hotels_models.favorites.HotelsFavorites;
import com.youTransactor.uCube.rpc.Constants;
import d9.e1;
import ht3.b0;
import ht3.c0;
import ht3.d0;
import ht3.g0;
import ht3.h0;
import ht3.i0;
import ht3.j0;
import ht3.k0;
import ht3.l0;
import ht3.s;
import ht3.t;
import ip0.ak0;
import ip0.ck0;
import ip0.ej;
import ip0.r70;
import ip0.y10;
import ip0.yj0;
import ip0.zj;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kl7.d2;
import kl7.f1;
import kl7.i1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.h4;
import o9c.y;
import org.jmrtd.lds.LDSFile;
import qp7.p;
import qp7.r;
import qv4.q;
import r74.m;
import rg4.x;
import xl7.n;
import yp0.e0;
import zhm.a0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f244280b;

    public /* synthetic */ j(Object obj2, int i) {
        this.f244279a = i;
        this.f244280b = obj2;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        int i;
        qp7.i iVar = (qp7.i) this.f244280b;
        d2 reservation = (d2) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(reservation, "reservation");
        Set set = iVar.f248305b;
        aim.e eVarB = u.b();
        Payment payment = reservation.e;
        i1 i1Var = reservation.f;
        boolean z = payment.f75272a == f1.ANNUAL;
        dj0.d dVarB = e1.b(payment);
        if (!z) {
            dVarB = pyd.c.U(dVarB, 12L);
        }
        List listK = v.k(new RowDelegate.Model("DATE_ITEM", n.k(R$drawable.uikit_icn_24_calendar, false, null, 15), new TextLocalisedClause(R$string.car_insurance_policy_review_sections_details_cells_start_date_title, null, null, 14), null, 0, n.h(reservation.f185305b), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("TOTAl_PRICE_ITEM", n.k(R$drawable.uikit_icn_24_time_and_money, false, null, 15), new TextLocalisedClause(R$string.car_insurance_policy_review_sections_details_cells_payment_title_annual, u.c(n.g(dVarB, null, null, 3)), null, 12), null, 0, new TextLocalisedClause(z ? R$string.car_insurance_policy_review_sections_details_cells_payment_annual : R$string.car_insurance_policy_review_sections_details_cells_payment_monthly, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("PLAN_INFO_ITEM", n.k(R$drawable.uikit_icn_16_list_bullet, false, null, 15), new TextClause(i1Var.f185340b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(i1Var.f185341c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("INFO_HEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(R$string.car_insurance_policy_review_sections_details_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        e0 e0Var = e0.OUTSIDE_BOX;
        a0.x(yp0.b.g(listK, model, e0Var, 0, 0, 124), eVarB);
        if (!reservation.f185307g.isEmpty()) {
            List listI = yp0.b.i(new RowDelegate.Model("DOCUMENTS_ITEM", n.k(R$drawable.uikit_icn_24_documents_pair, false, null, 15), new TextLocalisedClause(R$string.car_insurance_policy_review_sections_documents_cells_documents_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new ListSubheaderDelegate.Model("DOCUMENT_HEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(R$string.car_insurance_policy_review_sections_documents_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, 0, 0, 124);
            e0Var = e0Var;
            a0.x(listI, eVarB);
        }
        aim.e eVarB2 = u.b();
        o oVarB = r.b(reservation);
        eVarB2.add(xl7.i.a(new TextLocalisedClause(R$string.car_insurance_policy_review_sections_agreement_cells_answered_honestly_text, null, null, 14), "LEGAL_CHECK_ITEM_ALL", set.contains("CONDITION_GENERAL")));
        if (oVarB.f5338a.containsKey("CONDITION_SMART_DRIVING")) {
            eVarB2.add(xl7.i.a(new TextLocalisedClause(R$string.car_insurance_policy_review_sections_agreement_cells_smart_driving_text, null, null, 14), "LEGAL_CHECK_ITEM_SMART", set.contains("CONDITION_SMART_DRIVING")));
        }
        if (oVarB.f5338a.containsKey("CONDITION_MONTHLY_PAYMENT")) {
            i = 14;
            eVarB2.add(xl7.i.a(new TextLocalisedClause(R$string.car_insurance_policy_review_sections_agreement_cells_multi_payment_text, null, null, 14), "LEGAL_CHECK_ITEM_MONTHLY", set.contains("CONDITION_MONTHLY_PAYMENT")));
        } else {
            i = 14;
        }
        a0.x(yp0.b.g(u.a(eVarB2), new ListSubheaderDelegate.Model("LEGAL_CHECK_HEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(R$string.car_insurance_policy_review_sections_agreement_title, null, null, i), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, 0, 0, 124), eVarB);
        eVarB.add(new TextDelegate.Model("FOOTER_ITEM", new TextLocalisedClause(R$string.car_insurance_policy_review_footer_text_short, u.c(new TextLocalisedClause(R$string.car_insurance_policy_review_footer_link, null, new Click(28, (Integer) null, (Object) null, "FOOTER_LINK_ITEM", false), 10)), null, 12), false, new ak0(null, null, 3), null, null, 0, R$attr.uikit_dp0, 0, 0, 1780));
        return new p(u.a(eVarB), iVar.f248305b.containsAll(r.b(reservation)));
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        qq4.f fVar = (qq4.f) this.f244280b;
        qq4.b model = (qq4.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_cards_list_title, null, null, 14);
        if (model.f248481a.o != null) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_cards_list_subtitle_restricted, null, null, 14);
        } else {
            RevPointsEarningRate revPointsEarningRate = model.d;
            textLocalisedClause = revPointsEarningRate != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_cards_list_subtitle_rev_points, v.k(nub.a.i(revPointsEarningRate.f83976b, null, new nub.c(new NumberClause.Format.AllDigitsAfterDot(null, null, 3)), null, 5), sx4.f.b(3, null, null, revPointsEarningRate.f83977c)), null, 12) : null;
        }
        return new cii.b(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_cards_list_add_new_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), fVar.f248491a.a(model.f248481a, model.f248482b, model.f248483c), new lw0.a(textLocalisedClause2, textLocalisedClause, null, null, false, 28));
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        qqe.l lVar = (qqe.l) this.f244280b;
        TeenProfile teenProfile = (TeenProfile) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(teenProfile, "teenProfile");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.teen_dashboard.impl.R$string.teen_details_header_title, u.c(teenProfile.f90335b), null, 12);
        String str = teenProfile.f90338h;
        qqe.e eVar = new qqe.e(textLocalisedClause, str != null ? new TextLocalisedClause(com.revolut.feature.teen_dashboard.impl.R$string.teen_details_header_subtitle, u.c(str), null, 12) : null, new ContactImage((String) null, (String) null, teenProfile.f90337g, (String) null, (String) null, gc0.c.l(teenProfile), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4059));
        int i = com.revolut.feature.teen_dashboard.impl.R$string.teen_details_section_basic_info;
        TextClause textClause = new TextClause(gc0.c.l(teenProfile), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        LocalDate localDate = teenProfile.d;
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        long epochMilli = localDate.atStartOfDay(zoneOffset).toInstant().toEpochMilli();
        TimeClause.Format.INSTANCE.getClass();
        CellDetailsActionListDelegate.Model modelA = qqe.l.a(i, "LIST_ID_BASIC_INFO", v.k(textClause, new TimeClause(epochMilli, TimeClause.Format.f57959a, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), zoneOffset)));
        CellDetailsActionListDelegate.Model modelA2 = qqe.l.a(com.revolut.feature.teen_dashboard.impl.R$string.teen_details_section_address, "LIST_ID_ADDRESS", u.c(new TextClause(o51.a.b(teenProfile.e, null), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)));
        String str2 = teenProfile.f;
        qv0.i[] elements = {modelA, modelA2, str2 != null ? qqe.l.a(com.revolut.feature.teen_dashboard.impl.R$string.teen_details_section_phone, "LIST_ID_PHONE", u.c(new TextClause(z80.b.b(lVar.f248534a, str2, null, null, 6), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124))) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new qqe.i(eVar, listL);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        List listA;
        qv4.g gVar = (qv4.g) this.f244280b;
        qv4.e model = (qv4.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        qv4.f fVar = gVar.f249527a;
        aim.e eVarB = u.b();
        String str = "id_credit_card_statement_hub_tab_upcoming";
        List listK = v.k(new FixedTabs.Item("id_credit_card_statement_hub_tab_upcoming", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_hub_tab_upcoming, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("id_credit_card_statement_hub_tab_past", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_hub_tab_past, null, null, 14), (AnalyticsContext) null, 12));
        int[] iArr = q.f249535a;
        int i = iArr[fVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "id_credit_card_statement_hub_tab_past";
        }
        FixedTabsDelegate.Model model2 = new FixedTabsDelegate.Model("id_credit_card_statement_hub_tab", listK, str, false, null, SyslogConstants.LOG_CLOCK);
        int i2 = iArr[fVar.ordinal()];
        if (i2 == 1) {
            listA = qv4.o.a(model.f249525a);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listA = qv4.o.a(model.f249526b);
        }
        if (listA.isEmpty()) {
            FullScreenStateDelegate.Model model3 = new FullScreenStateDelegate.Model("id_credit_card_statement_hub_empty", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_hub_empty_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_hub_empty_subtitle, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_minus_circle, null, null, 6)), null, null, false, null, null, false, 0, 0, 32752);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            listA = u.c(model3);
        }
        eVarB.add(model2);
        eVarB.addAll(listA);
        return new qv4.i(u.a(eVarB));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r68, java.lang.Object r69, java.lang.Object r70) {
        /*
            Method dump skipped, instruction units count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qbg.j.e(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0a60  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0a7e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b46  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0d14  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x052c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r67, java.lang.Object r68, java.lang.Object r69) {
        /*
            Method dump skipped, instruction units count: 3398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qbg.j.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        CdnImage cdnImage;
        ht3.b bVar;
        String str;
        ht3.b bVar2;
        String str2;
        CompositeClause compositeClause;
        qv0.o oVarD;
        ht3.b bVar3;
        String str3;
        ht3.b bVar4;
        String str4;
        PromptMarketingContentDelegate.Model.Content mediaContent;
        PromptMarketingContentDelegate.Model.Content content;
        PromptMarketingContentDelegate.Model.AnimationType.SlideInAndFadeIn slideInAndFadeIn;
        int i;
        PromptMarketingContentDelegate.Model.Footer footer;
        r74.v vVar = (r74.v) this.f244280b;
        l0 content2 = (l0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content2, "content");
        CreditPromptScreenContract$InputData creditPromptScreenContract$InputData = vVar.f252013a;
        if (content2 instanceof ht3.o) {
            ht3.o oVar = (ht3.o) content2;
            CreditPromptAnalyticsConfiguration creditPromptAnalyticsConfiguration = creditPromptScreenContract$InputData.f67330b;
            int i2 = creditPromptAnalyticsConfiguration.f66328a;
            String str5 = oVar.f155293a;
            Double d = oVar.f155296g;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, u.c(str5), null, 12);
            HtmlLocalisedClause htmlLocalisedClause = new HtmlLocalisedClause(creditPromptAnalyticsConfiguration.f66329b, u.c(oVar.f155294b), (Integer) null, (Object) null, 28);
            ld ldVar = ld.CAPTION;
            ht3.i iVar = oVar.f155295c;
            TextLocalisedClause textLocalisedClauseA = iVar != null ? r74.v.a(iVar, oVar.k) : null;
            ht3.n nVar = oVar.e;
            int i3 = r74.u.f252010a[nVar.f155290a.ordinal()];
            if (i3 == 1) {
                mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(r74.v.e(nVar), null);
            } else if (i3 == 2) {
                mediaContent = new PromptMarketingContentDelegate.Model.Content.BackgroundMediaContent(r74.v.e(nVar));
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                mediaContent = new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(r74.v.e(nVar), null, null, 6);
            }
            pd pdVar = oVar.f == k0.DARK ? pd.BLACK : pd.REGULAR;
            if (d != null) {
                content = mediaContent;
                slideInAndFadeIn = new PromptMarketingContentDelegate.Model.AnimationType.SlideInAndFadeIn((long) (d.doubleValue() * 1000), 1000L, vVar.f252014b.getResources().getDisplayMetrics().heightPixels);
            } else {
                content = mediaContent;
                slideInAndFadeIn = null;
            }
            AnimationRequest animationRequest = d != null ? new AnimationRequest(false) : null;
            String str6 = oVar.d;
            if (str6 != null) {
                i = 12;
                footer = new PromptMarketingContentDelegate.Model.Footer(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_prompt_footer, u.c(str6), null, 12));
            } else {
                i = 12;
                footer = null;
            }
            ht3.c cVar = oVar.f155297h;
            PromptMarketingContentDelegate.Model.Button button = cVar != null ? new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(creditPromptAnalyticsConfiguration.f66330c, u.c(cVar.f155256a), null, i), (ResourceImage) null, r74.v.b(cVar.f155258c), false, "INTRO_PROMPT_PRIMARY_BUTTON_TAG", 22) : null;
            ht3.c cVar2 = oVar.i;
            return new r74.n(u.c(new PromptMarketingContentDelegate.Model("INTRO_PROMPT_CONTENT_ID", textLocalisedClause, htmlLocalisedClause, content, null, pdVar, !oVar.f155298j ? q74.b.a(creditPromptScreenContract$InputData.f67329a) : null, ldVar, null, button, cVar2 != null ? new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(creditPromptAnalyticsConfiguration.d, u.c(cVar2.f155256a), null, 12), (ResourceImage) null, r74.v.b(cVar2.f155258c), false, "INTRO_PROMPT_SECONDARY_BUTTON_TAG", 22) : null, null, footer, null, null, null, null, textLocalisedClauseA, slideInAndFadeIn, animationRequest, null, 1173776)));
        }
        if (!(content2 instanceof ht3.g)) {
            if (!(content2 instanceof j0)) {
                if (content2 instanceof ht3.e) {
                    throw new IllegalStateException("Implemented as separate controller \"ConstructorCreditPromptController\"");
                }
                throw new NoWhenBranchMatchedException();
            }
            j0 j0Var = (j0) content2;
            CreditPromptAnalyticsConfiguration creditPromptAnalyticsConfiguration2 = creditPromptScreenContract$InputData.f67330b;
            int i5 = creditPromptAnalyticsConfiguration2.f66328a;
            String str7 = j0Var.f155283a;
            ht3.c cVar3 = j0Var.f155286g;
            ht3.c cVar4 = j0Var.f;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i5, u.c(str7), null, 12);
            String str8 = j0Var.f155284b;
            TextLocalisedClause textLocalisedClause3 = str8 != null ? new TextLocalisedClause(creditPromptAnalyticsConfiguration2.f66329b, u.c(str8), null, 12) : null;
            i0 i0Var = j0Var.f155285c;
            if (i0Var != null) {
                h0 h0Var = i0Var.f155282a;
                cdnImage = new CdnImage(h0Var.f155277a, h0Var.f155278b, null, new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG), null, null, Constants.TAG_F4);
            } else {
                cdnImage = null;
            }
            TextLocalisedClause textLocalisedClause4 = (cVar4 == null || (str2 = cVar4.f155256a) == null) ? null : new TextLocalisedClause(creditPromptAnalyticsConfiguration2.f66330c, u.c(str2), null, 12);
            LargeActionButton.ButtonStyle buttonStyleB = (cVar4 == null || (bVar2 = cVar4.f155258c) == null) ? null : r74.v.b(bVar2);
            TextLocalisedClause textLocalisedClause5 = (cVar3 == null || (str = cVar3.f155256a) == null) ? null : new TextLocalisedClause(creditPromptAnalyticsConfiguration2.d, u.c(str), null, 12);
            LargeActionButton.ButtonStyle buttonStyleB2 = (cVar3 == null || (bVar = cVar3.f155258c) == null) ? null : r74.v.b(bVar);
            ResourceImage resourceImageA = q74.b.a(creditPromptScreenContract$InputData.f67329a);
            aim.e eVarB = u.b();
            List list = j0Var.d;
            if (list != null) {
                eVarB.addAll(r74.a.c(list));
            }
            ht3.k kVar = j0Var.e;
            n14.e.b(eVarB, kVar != null ? r74.v.d(kVar) : null);
            Unit unit = Unit.f186387a;
            aim.e eVarA = u.a(eVarB);
            yp0.b.b(R$attr.uikit_two_button_margin, eVarA);
            return new r74.o(textLocalisedClause2, textLocalisedClause3, cdnImage, textLocalisedClause4, buttonStyleB, textLocalisedClause5, buttonStyleB2, resourceImageA, eVarA);
        }
        ht3.g gVar = (ht3.g) content2;
        CreditPromptAnalyticsConfiguration creditPromptAnalyticsConfiguration3 = creditPromptScreenContract$InputData.f67330b;
        int i6 = creditPromptAnalyticsConfiguration3.f66328a;
        String str9 = gVar.f155268a;
        ht3.c cVar5 = gVar.k;
        ht3.c cVar6 = gVar.f155273j;
        ht3.i iVar2 = gVar.f155270c;
        TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(i6, u.c(str9), null, 12);
        String str10 = gVar.f155269b;
        TextLocalisedClause textLocalisedClause7 = str10 != null ? new TextLocalisedClause(creditPromptAnalyticsConfiguration3.f66329b, u.c(str10), null, 12) : null;
        String str11 = gVar.d;
        if (str11 == null && iVar2 == null) {
            compositeClause = null;
        } else {
            TextLocalisedClause[] elements = {str11 != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_prompt_second_description, prk.o.v(0, 30, null, null, str11), null, 12) : null, iVar2 != null ? r74.v.a(iVar2, gVar.f155274l) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            compositeClause = new CompositeClause(kotlin.collections.d.L(elements), new TextClause(kotlin.text.a0.C(m70.a.o(t0.f186434a), 2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        TextLocalisedClause textLocalisedClause8 = (cVar6 == null || (str4 = cVar6.f155256a) == null) ? null : new TextLocalisedClause(creditPromptAnalyticsConfiguration3.f66330c, u.c(str4), null, 12);
        LargeActionButton.ButtonStyle buttonStyleB3 = (cVar6 == null || (bVar4 = cVar6.f155258c) == null) ? null : r74.v.b(bVar4);
        TextLocalisedClause textLocalisedClause9 = (cVar5 == null || (str3 = cVar5.f155256a) == null) ? null : new TextLocalisedClause(creditPromptAnalyticsConfiguration3.d, u.c(str3), null, 12);
        LargeActionButton.ButtonStyle buttonStyleB4 = (cVar5 == null || (bVar3 = cVar5.f155258c) == null) ? null : r74.v.b(bVar3);
        ResourceImage resourceImageA2 = q74.b.a(creditPromptScreenContract$InputData.f67329a);
        aim.e eVarB2 = u.b();
        g0 g0Var = gVar.e;
        if (g0Var != null) {
            if (!(g0Var instanceof g0)) {
                throw new NoWhenBranchMatchedException();
            }
            eVarB2.add(new LightPromptDelegate.Model("INTRO_LIGHT_PROMPT_ID", null, null, com.revolut.core.ui_kit_core.displayers.image.models.b.c(g0Var.f155275a, null, null, null, 30), false, t7.f54744a));
        }
        List list2 = gVar.f155271g;
        if (list2 != null) {
            List<d0> list3 = list2;
            ArrayList arrayList = new ArrayList(w.t(list3, 10));
            for (d0 item : list3) {
                Intrinsics.checkNotNullParameter(item, "item");
                if (item instanceof b0) {
                    oVarD = r74.a.f((b0) item);
                } else if (item instanceof c0) {
                    oVarD = r74.a.g((c0) item);
                } else if (item instanceof ht3.v) {
                    oVarD = r74.a.e((ht3.v) item);
                } else {
                    if (!(item instanceof s)) {
                        if (item instanceof ht3.r) {
                            throw new UnsupportedOperationException("CarouselItem is not supported in legacy items list");
                        }
                        if (item instanceof t) {
                            throw new UnsupportedOperationException("GroupItem is not supported in legacy items list");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    oVarD = r74.a.d((s) item);
                }
                arrayList.add(oVarD);
            }
            String str12 = gVar.f;
            ht3.k kVar2 = gVar.i;
            if (str12 == null) {
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                eVarB2.addAll(arrayList);
            } else {
                eVarB2.addAll(yp0.b.g(arrayList, new ListSubheaderDelegate.Model(str12, (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_prompt_items_title, u.c(new TextClause(str12, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
            }
            if (kVar2 != null) {
                ej ejVarD = r74.v.d(kVar2);
                yp0.b.r(ejVarD, 0, 0, 0, 0, 15);
                eVarB2.add(ejVarD);
            }
        }
        List list4 = gVar.f155272h;
        if (list4 != null) {
            eVarB2.addAll(r74.a.c(list4));
        }
        Unit unit2 = Unit.f186387a;
        aim.e eVarA2 = u.a(eVarB2);
        yp0.b.b(R$attr.uikit_two_button_margin, eVarA2);
        return new m(textLocalisedClause6, textLocalisedClause7, compositeClause, textLocalisedClause8, buttonStyleB3, textLocalisedClause9, buttonStyleB4, resourceImageA2, eVarA2);
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        RampOrderDetails rampOrderDetails = (RampOrderDetails) this.f244280b;
        q6c.h orderDetails = (q6c.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
        int i = com.revolut.feature.revolutpay.impl.R$string.revolut_pay_order_summary_ramp_checkout_title;
        orderDetails.getClass();
        long j2 = orderDetails.f;
        xi0.b bVar = orderDetails.f242543l;
        return new y(new TextLocalisedClause(i, u.c(new MoneyClause(new dj0.d(j2, bVar).l(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_order_summary_ramp_header_subtitle, u.c(new MoneyClause(rampOrderDetails.f84410a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new PairedImage(new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), new CurrencyImage(rampOrderDetails.f84410a.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x013c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0171 A[FALL_THROUGH, PHI: r23
      0x0171: PHI (r23v1 com.revolut.core.ui_kit.delegates.af) = (r23v0 com.revolut.core.ui_kit.delegates.af), (r23v2 com.revolut.core.ui_kit.delegates.af) binds: [B:74:0x0166, B:77:0x016f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.revolut.core.ui_kit.delegates.RowDelegate$Model$MainImage] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r59, java.lang.Object r60, java.lang.Object r61) {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qbg.j.j(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        String str;
        HotelsFavoriteDestination hotelsFavoriteDestination;
        rcg.s sVar = (rcg.s) this.f244280b;
        HotelsFavorites favorites = (HotelsFavorites) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(favorites, "favorites");
        List<HotelsFavoriteProperty> listA = sVar.a(favorites);
        if (((ArrayList) listA).isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("FAVORITES_GRID_EMPTY_STATE", new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_stays_section_favourites_results_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_stays_section_favourites_results_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D090", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.feature.travel.core.api.R$string.travel_tab_bookings_empty_state_action_title, null, null, 14), null, h4.ACCENT), null, false, null, null, null, YearClass.CLASS_2016);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return u.c(model);
        }
        qcg.e.Companion.getClass();
        qcg.e eVarA = qcg.d.a(favorites);
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        for (HotelsFavoriteProperty hotelsFavoriteProperty : listA) {
            VoucherSmallTileDelegate.Model modelA = sVar.f253267b.a(hotelsFavoriteProperty.f97944a, (sVar.f253266a.f93932b != null || (str = hotelsFavoriteProperty.f97945b) == null || (hotelsFavoriteDestination = (HotelsFavoriteDestination) eVarA.f244783a.get(str)) == null) ? null : hotelsFavoriteDestination.f97942b);
            int i = R$attr.uikit_dp0;
            yp0.b.l(modelA, i, i, i, i, null, false, 48);
            arrayList.add(modelA);
        }
        return arrayList;
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        rch.q qVar = (rch.q) this.f244280b;
        List content = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.isEmpty()) {
            return zBooleanValue ? qVar.a() : u.c(adh.n.b(qVar.f253286b));
        }
        return qVar.f253285a.a(zhm.d0.V0(content, 25));
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        rd3.b bVar = (rd3.b) this.f244280b;
        od3.v footerType = (od3.v) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(footerType, "footerType");
        if (footerType instanceof od3.s) {
            od3.s sVar = (od3.s) footerType;
            return ((cbj.b) bVar.f253321a).c(sVar.f224295a, sVar.f224296b, sVar.f224297c);
        }
        if (footerType instanceof od3.t) {
            return u.c(new TextDelegate.Model("ID_FOOTER", new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_details_footer_provider_provided_by, u.c(((od3.t) footerType).f224306a), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
        }
        if (Intrinsics.f(footerType, od3.r.f224293a)) {
            TextLocalisedClause[] elements = {new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_disclaimer_provided_by_revolut_ltd, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.crypto_commodities.disclaimer.mapper.impl.R$string.commodities_disclosures_footer_text_plain, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.crypto_commodities.disclaimer.mapper.impl.R$string.commodities_disclosures_title, null, new Click(28, (Integer) null, (Object) d.a.f14312a, "DISCLOSURES_LINK_ID", false), 10)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return u.c(new TextDelegate.Model("LEGAL_DISCLAIMER_ID", yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements)), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036));
        }
        if (Intrinsics.f(footerType, od3.u.f224307a)) {
            return f0.f322471a;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        od3.l lVar = (od3.l) this.f244280b;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Boolean) obj3).getClass();
        sa saVar = null;
        if (!zBooleanValue) {
            sa saVar2 = new sa("ID_PRODUCT_NOT_AVAILABLE", (Clause) new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_product_unavailable_source_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_product_unavailable_source_description, u.c(z92.f.n(lVar.f224276a)), null, 12), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4040);
            yp0.b.l(saVar2, 0, 0, 0, 0, null, false, 63);
            saVar = saVar2;
        }
        return v.l(saVar);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        List listC;
        rd3.d dVar = (rd3.d) this.f244280b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        whf.p pVar = (whf.p) pair.f186385a;
        if (((dj0.d) pair.f186386b).k()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ID_NO_CASHBACK_YET", new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_product_zero_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.cashback.impl.R$string.cashback_product_zero_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D243", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            listC = u.c(model);
        } else {
            if (pVar.f297646a.isEmpty()) {
                return f0.f322471a;
            }
            ArrayList arrayListQ = ((anf.k) dVar.f253323a).q(zhm.d0.V0(pVar.f297646a, 3), pVar.f297647b, new thf.f(false, 3));
            yp0.b.k(arrayListQ, 0, 0, 0, 0, 31);
            listC = arrayListQ;
        }
        return i2b.a.q(rd3.d.f(pVar.f297646a.size() > 3), listC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5, types: [com.revolut.core.ui_kit.models.TextLocalisedClause] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v8 */
    private final Object p(Object obj2, Object obj3, Object obj4) {
        aw0.e eVar;
        n6 n6VarC;
        x xVar = (x) this.f244280b;
        PreApplicationChecksScenario scenario = (PreApplicationChecksScenario) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        mki.b bVar = xVar.f254038a;
        aim.e eVarB = u.b();
        boolean z = scenario instanceof PreApplicationChecksScenario.Ready;
        if (!z) {
            if (scenario instanceof PreApplicationChecksScenario.RejectedUndisclosed) {
                eVarB.add(new PromptMarketingContentDelegate.Model("PRE_APPLICATION_CHECKS_REJECTION", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pre_application_checks_rejected_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pre_application_checks_rejected_description, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(new GlyphImage(R$drawable.uikit_icn_24_broken_heart, null, null, 6), null), null, null, new ResourceImage(ofm.q.k(bVar), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pre_application_checks_rejected_primary_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pre_application_checks_rejected_secondary_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "PRE_APPLICATION_CHECKS_CONTINUE", 30), null, null, null, null, null, null, null, null, null, null, 2095536));
            } else if (scenario instanceof PreApplicationChecksScenario.ReadyWithInfo) {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pre_application_checks_informative_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pre_application_checks_informative_description, null, null, 14);
                cd cdVar = cd.CAPTION;
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_document_search, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, gz0.b.Undefined, null, null, null, LDSFile.EF_SOD_TAG), (Clause) null, 190);
                ArrayList<PreApplicationCheckItem> arrayList = ((PreApplicationChecksScenario.ReadyWithInfo) scenario).f66270a;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (PreApplicationCheckItem preApplicationCheckItem : arrayList) {
                    ?? G = x.g(preApplicationCheckItem.getF66254a());
                    TextLocalisedClause textLocalisedClauseF = x.f(preApplicationCheckItem.getF66254a());
                    if (textLocalisedClauseF != null) {
                        G = new CompositeClause(v.k(G, textLocalisedClauseF), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                    }
                    arrayList2.add(new yc((Clause) G, new ResourceImage(x.e(preApplicationCheckItem.getF66254a()), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246)));
                }
                eVarB.add(new PromptContentDelegate.Model("PRE_APPLICATION_CHECKS_ELIGIBILITY", textLocalisedClause, textLocalisedClause2, null, new zc(resourceImage, arrayList2), new ResourceImage(ofm.q.k(bVar), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pre_application_checks_informative_button, null, null, 14), null, null, null, null, null, cdVar, false, "PRE_APPLICATION_CHECKS_CONTINUE", false, null, null, null, null, null, null, null, null, null, 536706504));
            } else if (scenario instanceof PreApplicationChecksScenario.RemediationRequired) {
                PreApplicationChecksScenario.RemediationRequired remediationRequired = (PreApplicationChecksScenario.RemediationRequired) scenario;
                x.a(eVarB, remediationRequired.f66272a, null);
                x.a(eVarB, remediationRequired.f66273b, Integer.valueOf(com.revolut.feature.credit.core.R$string.credit_pre_application_checks_informative_header));
            } else {
                if (!(scenario instanceof PreApplicationChecksScenario.Blocked)) {
                    throw new NoWhenBranchMatchedException();
                }
                PreApplicationChecksScenario.Blocked blocked = (PreApplicationChecksScenario.Blocked) scenario;
                x.a(eVarB, blocked.f66266a, null);
                x.a(eVarB, blocked.f66267b, Integer.valueOf(com.revolut.feature.credit.core.R$string.credit_pre_application_checks_blocked_actions_header));
                x.a(eVarB, blocked.f66268c, Integer.valueOf(com.revolut.feature.credit.core.R$string.credit_pre_application_checks_informative_header));
            }
        }
        aim.e eVarA = u.a(eVarB);
        hx4.c cVarD = xVar.d(scenario);
        if (scenario instanceof PreApplicationChecksScenario.ReadyWithInfo) {
            eVar = null;
            n6VarC = null;
        } else if (scenario instanceof PreApplicationChecksScenario.RemediationRequired) {
            m6 m6Var = n6.Companion;
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pre_application_checks_remediation_button, null, null, 14);
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            ArrayList<PreApplicationCheckItem> arrayList3 = ((PreApplicationChecksScenario.RemediationRequired) scenario).f66272a;
            boolean z3 = true;
            if (!arrayList3.isEmpty()) {
                for (PreApplicationCheckItem preApplicationCheckItem2 : arrayList3) {
                    if ((preApplicationCheckItem2 instanceof PreApplicationCheckItem.Remediable) || (preApplicationCheckItem2 instanceof PreApplicationCheckItem.Pending)) {
                        z3 = false;
                        break;
                    }
                }
            }
            n6VarC = m6.c(m6Var, textLocalisedClause3, defaultFilledButton, null, "PRE_APPLICATION_CHECKS_CONTINUE", z3, null, null, null, 972);
            eVar = null;
        } else if (scenario instanceof PreApplicationChecksScenario.Blocked) {
            eVar = null;
            n6VarC = m6.c(n6.Companion, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pre_application_checks_blocked_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020);
        } else {
            eVar = null;
            if (!(scenario instanceof PreApplicationChecksScenario.RejectedUndisclosed) && !z) {
                throw new NoWhenBranchMatchedException();
            }
            n6VarC = null;
        }
        return new rg4.t(eVarA, cVarD, n6VarC != null ? new aw0.e(false, null, null, n6VarC, null, null, 55) : eVar);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        dj0.d dVar;
        dj0.d dVar2;
        rhg.j jVar = (rhg.j) this.f244280b;
        hfg.j flightFilters = (hfg.j) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(flightFilters, "flightFilters");
        ArrayList arrayList = flightFilters.f151850a;
        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = jVar.f254453b;
        Set set = travelMilesSearchAppliedFilters.f94125a;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj5 : arrayList) {
            if (set.contains(((TravelMilesFlightFilters$FilterOption) obj5).f94096a)) {
                arrayList2.add(obj5);
            } else {
                arrayList3.add(obj5);
            }
        }
        ArrayList<TravelMilesFlightFilters$FilterOption> arrayListE0 = zhm.d0.E0(arrayList3, arrayList2);
        ArrayList arrayList4 = new ArrayList(w.t(arrayListE0, 10));
        for (TravelMilesFlightFilters$FilterOption travelMilesFlightFilters$FilterOption : arrayListE0) {
            arrayList4.add(rhg.w.f(travelMilesFlightFilters$FilterOption, j6.a.q("STOPS_SECTION_ITEM_ID_", travelMilesFlightFilters$FilterOption.f94096a), set.contains(travelMilesFlightFilters$FilterOption.f94096a), new rhg.v(travelMilesFlightFilters$FilterOption)));
        }
        ArrayList arrayListG = yp0.b.g(arrayList4, rhg.w.d(), null, 0, 0, 126);
        ArrayList arrayList5 = flightFilters.f151851b;
        Set set2 = travelMilesSearchAppliedFilters.f94126b;
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        for (Object obj6 : arrayList5) {
            if (set2.contains(((TravelMilesFlightFilters$FilterOption) obj6).f94096a)) {
                arrayList6.add(obj6);
            } else {
                arrayList7.add(obj6);
            }
        }
        ArrayList<TravelMilesFlightFilters$FilterOption> arrayListE02 = zhm.d0.E0(arrayList7, arrayList6);
        ArrayList arrayList8 = new ArrayList(w.t(arrayListE02, 10));
        for (TravelMilesFlightFilters$FilterOption travelMilesFlightFilters$FilterOption2 : arrayListE02) {
            arrayList8.add(rhg.w.f(travelMilesFlightFilters$FilterOption2, j6.a.q("CABIN_SECTION_ITEM_ID_", travelMilesFlightFilters$FilterOption2.f94096a), set2.contains(travelMilesFlightFilters$FilterOption2.f94096a), new rhg.q(travelMilesFlightFilters$FilterOption2)));
        }
        ArrayList arrayListG2 = yp0.b.g(arrayList8, rhg.w.a(), null, 0, 0, 126);
        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = flightFilters.f151852c;
        double d = travelMilesNumberRangeFilter.f94102b;
        double d5 = travelMilesNumberRangeFilter.f94101a;
        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter2 = travelMilesSearchAppliedFilters.f94127c;
        double d6 = travelMilesNumberRangeFilter2 != null ? travelMilesNumberRangeFilter2.f94101a : d5;
        double d10 = travelMilesNumberRangeFilter2 != null ? travelMilesNumberRangeFilter2.f94102b : d;
        List listI = yp0.b.i(new r70("PRICE_SECTION_SLIDER_ID", new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_search_filters_price_section_separator, v.k(rhg.w.h(d6), rhg.w.h(d10)), null, 12), null, rhg.w.e(rhg.w.h(d5)), rhg.w.e(rhg.w.h(d)), (int) d5, (int) d, (int) d6, (int) d10, travelMilesNumberRangeFilter), new ListSubheaderDelegate.Model("PRICE_SECTION_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_search_filters_price_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = flightFilters.d;
        dj0.d dVar3 = travelMilesMoneyRangeFilter.f94100b;
        dj0.d dVar4 = travelMilesMoneyRangeFilter.f94099a;
        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter2 = travelMilesSearchAppliedFilters.d;
        if (travelMilesMoneyRangeFilter2 == null || (dVar = travelMilesMoneyRangeFilter2.f94099a) == null) {
            dVar = dVar4;
        }
        if (travelMilesMoneyRangeFilter2 == null || (dVar2 = travelMilesMoneyRangeFilter2.f94100b) == null) {
            dVar2 = dVar3;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_search_filters_fees_section_separator, v.k(rhg.w.g(dVar), rhg.w.g(dVar2)), null, 12);
        TextLocalisedClause textLocalisedClauseE = rhg.w.e(rhg.w.g(dVar4));
        TextLocalisedClause textLocalisedClauseE2 = rhg.w.e(rhg.w.g(dVar3));
        long j2 = dVar4.f115082a;
        xi0.b bVar = dVar4.f115083b;
        List listI2 = yp0.b.i(new r70("FEES_SECTION_SLIDER_ID", textLocalisedClause, null, textLocalisedClauseE, textLocalisedClauseE2, (int) (j2 / cp5.d.k(bVar)), (int) (dVar3.f115082a / cp5.d.k(dVar3.f115083b)), (int) (dVar.f115082a / cp5.d.k(dVar.f115083b)), (int) (dVar2.f115082a / cp5.d.k(dVar2.f115083b)), new rhg.s(travelMilesMoneyRangeFilter, bVar)), new ListSubheaderDelegate.Model("FEES_SECTION_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_top_up_payment_breakdown_fees_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        ArrayList arrayList9 = flightFilters.e;
        Set set3 = travelMilesSearchAppliedFilters.e;
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        for (Object obj7 : arrayList9) {
            if (set3.contains(((TravelMilesFlightFilters$FilterOption) obj7).f94096a)) {
                arrayList10.add(obj7);
            } else {
                arrayList11.add(obj7);
            }
        }
        List<TravelMilesFlightFilters$FilterOption> listV0 = zhm.d0.V0(zhm.d0.E0(arrayList11, arrayList10), 3);
        ArrayList arrayList12 = new ArrayList(w.t(listV0, 10));
        for (TravelMilesFlightFilters$FilterOption travelMilesFlightFilters$FilterOption3 : listV0) {
            String str = travelMilesFlightFilters$FilterOption3.f94096a;
            arrayList12.add(rhg.w.i(travelMilesFlightFilters$FilterOption3, j6.a.q("AIRLINES_SECTION_ITEM_ID_", str), j6.a.q("AIRLINES_SECTION_ITEM_INNER_ID", str), set3.contains(str), new rhg.p(travelMilesFlightFilters$FilterOption3)));
        }
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("AIRLINES_SECTION_SEE_ALL_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_search_filters_see_all_cta, null, null, 14), false, null, null, new rhg.u(arrayList9, set3, phg.h.AIRLINES), null, 744);
        if (arrayList9.size() <= 3) {
            model = null;
        }
        aim.e eVarB = u.b();
        eVarB.addAll(arrayList12);
        if (model != null) {
            eVarB.add(model);
        }
        ArrayList arrayListG3 = yp0.b.g(u.a(eVarB), arrayList9.size() > 3 ? rhg.w.b(com.revolut.feature.travel.miles.api.R$string.miles_search_filters_airlines_section_title, set3.size(), arrayList9.size(), "AIRLINES_SECTION_SUBHEADER_ID") : new ListSubheaderDelegate.Model("AIRLINES_SECTION_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_search_filters_airlines_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        ArrayList arrayList13 = flightFilters.f;
        Set set4 = travelMilesSearchAppliedFilters.f;
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        for (Object obj8 : arrayList13) {
            if (set4.contains(((TravelMilesFlightFilters$FilterOption) obj8).f94096a)) {
                arrayList14.add(obj8);
            } else {
                arrayList15.add(obj8);
            }
        }
        List<TravelMilesFlightFilters$FilterOption> listV02 = zhm.d0.V0(zhm.d0.E0(arrayList15, arrayList14), 3);
        ArrayList arrayList16 = new ArrayList(w.t(listV02, 10));
        for (TravelMilesFlightFilters$FilterOption travelMilesFlightFilters$FilterOption4 : listV02) {
            String str2 = travelMilesFlightFilters$FilterOption4.f94096a;
            arrayList16.add(rhg.w.i(travelMilesFlightFilters$FilterOption4, j6.a.q("PROGRAMMES_SECTION_ITEM_ID_", str2), j6.a.q("PROGRAMMES_SECTION_ITEM_INNER_ID", str2), set4.contains(str2), new rhg.t(travelMilesFlightFilters$FilterOption4)));
        }
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("PROGRAMMES_SECTION_SEE_ALL_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_search_filters_see_all_cta, null, null, 14), false, null, null, new rhg.u(arrayList13, set4, phg.h.MILES_PROGRAMMES), null, 744);
        if (arrayList13.size() <= 3) {
            model2 = null;
        }
        aim.e eVarB2 = u.b();
        eVarB2.addAll(arrayList16);
        if (model2 != null) {
            eVarB2.add(model2);
        }
        return w.u(v.k(arrayListG, arrayListG2, listI, listI2, arrayListG3, yp0.b.g(u.a(eVarB2), arrayList13.size() > 3 ? rhg.w.b(com.revolut.feature.travel.miles.api.R$string.miles_search_filters_programmes_section_title, set4.size(), arrayList13.size(), "PROGRAMMES_SECTION_SUBHEADER_ID") : new ListSubheaderDelegate.Model("PROGRAMMES_SECTION_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_search_filters_programmes_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0daa A[PHI: r3
      0x0daa: PHI (r3v7 org.joda.time.DateTime) = (r3v3 org.joda.time.DateTime), (r3v10 org.joda.time.DateTime) binds: [B:321:0x0d96, B:317:0x0d8d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r36v4 */
    /* JADX WARN: Type inference failed for: r36v5, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r36v6 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [qv0.i, qv0.o] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [qv0.i, qv0.o] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r8v43 */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r50, java.lang.Object r51, java.lang.Object r52) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qbg.j.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ j(Object obj2, Object obj3, int i) {
        this.f244279a = i;
        this.f244280b = obj3;
    }
}

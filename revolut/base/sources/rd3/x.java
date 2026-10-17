package rd3;

import android.os.Parcelable;
import au0.o0;
import au0.z0;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
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
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.payees.impl.ui.payees_overview.flow.PayeesOverviewFlowContract$FlowPagerItem;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.b;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentIssuerImage;
import ip0.bk0;
import ip0.c20;
import ip0.ck0;
import ip0.y10;
import ip0.yj0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jel.k2;
import jel.v1;
import jel.w1;
import jel.w2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import l15.f;
import mx0.pc;
import mx0.v5;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class x implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253332a;

    public /* synthetic */ x(int i) {
        this.f253332a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        w19.f content = (w19.f) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        if (!zBooleanValue) {
            return new aw0.e(true, null, null, new n6(new TextLocalisedClause(R$string.rev_points_new_opt_in_cta, zhm.u.c(new TextClause(content.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), LargeActionButton.ButtonStyle.f58725a, null, "ACTION_FOOTER_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 54);
        }
        n6.Companion.getClass();
        return new aw0.e(false, null, null, m6.a(), null, null, 55);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        w19.f content = (w19.f) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        if (zBooleanValue) {
            return new qzb.h(rzb.b.a(null, null));
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rev_points_new_opt_in_screen, zhm.u.c(new TextClause(content.f293806a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        return new qzb.f(textLocalisedClause, rzb.b.a(new z0(textLocalisedClause, false), new o0(new TextClause(content.f293807b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126))));
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        int i;
        f.b configuration = (f.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (!(configuration instanceof l15.g)) {
            if (!(configuration instanceof l15.h)) {
                throw new NoWhenBranchMatchedException();
            }
            l15.i iVar = ((l15.h) configuration).f191462a;
            aim.e eVarB = zhm.u.b();
            l15.a aVar = iVar.f191464b;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_financial_difficulties_contact_section_title, zhm.u.c(new TextClause(aVar.f191452a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            HtmlLocalisedClause htmlLocalisedClause = new HtmlLocalisedClause(com.revolut.feature.credit.core.R$string.credit_financial_difficulties_contact_section_description, zhm.u.c(aVar.f191453b), (Integer) null, (Object) null, 28);
            String str = aVar.f191454c;
            Object[] elements = {htmlLocalisedClause, str != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_financial_difficulties_contact_section_button, zhm.u.c(new TextClause(str, (Style) new Click(30, (Integer) null, (Object) null, "ID_CLICK_CONTACT_US", false), (Integer) null, false, (o9) null, (List) null, 124)), null, 12) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            sa saVar = new sa("contactSection", (Clause) textLocalisedClause2, (Clause) new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14), (List) null, false, (c20) null, (y10) null, (Object) null, 232);
            yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
            eVarB.add(saVar);
            l15.c cVar = iVar.f191465c;
            if (cVar != null) {
                sa saVar2 = new sa("debtAdvice", (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_financial_difficulties_debt_advice_title, zhm.u.c(new TextClause(cVar.f191456a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (Clause) new HtmlLocalisedClause(com.revolut.feature.credit.core.R$string.credit_financial_difficulties_debt_advice_description, zhm.u.c(cVar.f191457b), (Integer) null, (Object) null, 28), (List) null, false, (c20) null, (y10) null, (Object) null, 232);
                yp0.b.l(saVar2, 0, 0, 0, 0, null, false, 63);
                eVarB.add(saVar2);
            }
            aim.e eVarA = zhm.u.a(eVarB);
            String str2 = iVar.d;
            return new s15.g(eVarA, str2 != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_financial_difficulties_button, zhm.u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null, str2 != null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_financial_difficulties_title, zhm.u.c(new TextClause(iVar.f191463a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), 8);
        }
        l15.k kVar = ((l15.g) configuration).f191461a;
        String str3 = kVar.e;
        l15.j jVar = kVar.f;
        TextClause textClause = new TextClause(kVar.f191467b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        HtmlClause htmlClause = new HtmlClause(0, 30, (Integer) null, (Object) null, kVar.f191468c);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246);
        boolean z = kVar.d;
        sa saVar3 = new sa("inProgress", (Clause) textClause, (Clause) htmlClause, (List) null, false, (Image) (z ? resourceImage : null), (y10) null, (Object) null, 4040);
        yp0.b.l(saVar3, 0, 0, 0, 0, null, false, 63);
        List listC = zhm.u.c(saVar3);
        boolean z3 = str3 != null;
        if (str3 == null) {
            textLocalisedClause = null;
        } else {
            if (jVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int i2 = s15.n.f259096a[jVar.ordinal()];
            if (i2 == 1) {
                i = com.revolut.feature.credit.core.R$string.financial_difficulties_action_chat_with_support;
            } else if (i2 == 2) {
                i = com.revolut.feature.credit.core.R$string.financial_difficulties_action_resume;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = com.revolut.feature.credit.core.R$string.financial_difficulties_action_start_new_request;
            }
            textLocalisedClause = new TextLocalisedClause(i, zhm.u.c(str3), null, 12);
        }
        return new s15.g(listC, textLocalisedClause, z3, new TextLocalisedClause(kVar.e == null ? com.revolut.feature.credit.core.R$string.financial_difficulties_request_in_review_title : jVar == l15.j.CONTACT_SUPPORT ? com.revolut.feature.credit.core.R$string.financial_difficulties_rejected_title : (jVar == l15.j.NEW_APPLICATION && z) ? com.revolut.feature.credit.core.R$string.financial_difficulties_expired_title : jVar == l15.j.RESUME_APPLICATION ? com.revolut.feature.credit.core.R$string.financial_difficulties_resume_title : com.revolut.feature.credit.core.R$string.financial_difficulties_resume_title, zhm.u.c(kVar.f191466a), null, 12), 8);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        rdh.a disclaimer = (rdh.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), f0.f322471a, new lw0.a(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_screen_trade_cfds_title, null, null, 14), yoj.b.m(new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_screen_trade_cfds_description, null, null, 14), new HtmlClause(0, 30, (Integer) null, (Object) null, disclaimer.f253458b))), null, null, false, 28));
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        w2 noteDetails = (w2) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(noteDetails, "noteDetails");
        w1 w1Var = noteDetails.f173591l;
        k2 k2Var = w1Var.f173584c;
        boolean z = (k2Var != null ? k2Var.f173492a : null) != null;
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("note_about_issuer_header", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_instrument_details_overview_screen_issuer_widget_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        TextClause textClause = new TextClause(w1Var.f173582a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_instrument_details_overview_screen_issuer_widget_issuing_entity_template, zhm.u.c(w1Var.f173583b), null, 12);
        v1 v1Var = w1Var.d;
        RowDelegate.Model model2 = new RowDelegate.Model("about_issuer_row", v1Var != null ? new RowDelegate.Model.MainImage.Image40(new InstrumentIssuerImage(v1Var.f173578b, v1Var.f173577a, Integer.valueOf(R$drawable.uikit_icn_circle_background), Integer.valueOf(R$attr.uikit_colorGrey10), null, null), null, null, false, null, false, 62) : null, textClause, null, 0, textLocalisedClause, null, null, 0, z ? new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))) : null, z, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return zhm.v.k(model, model2);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        xzg.k collectionWithChildren = (xzg.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(collectionWithChildren, "content");
        TextClause textClause = new TextClause(collectionWithChildren.e(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(collectionWithChildren, "collectionWithChildren");
        String strB = collectionWithChildren.b();
        Clause textClause2 = strB != null ? new TextClause(strB, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        String str = collectionWithChildren.c().f309980h;
        TextLocalisedClause textLocalisedClause = str != null ? new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(28, (Integer) null, (Object) new s4f.i(str), "click_data.learn_more", false), 10) : null;
        if (textClause2 != null && textLocalisedClause != null) {
            textClause2 = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(textClause2, textLocalisedClause));
        } else if (textClause2 == null) {
            textClause2 = textLocalisedClause;
        }
        return new s4f.j(textClause, textClause2, collectionWithChildren instanceof xzg.n);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List listC = content;
        if (listC.isEmpty()) {
            listC = zhm.u.c(new FullScreenStateDelegate.Model("CARDS_EMPTY_ITEM_ID", new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_quick_help_cards_no_cards_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_quick_help_cards_order_a_new_card, null, null, 14), false, null, null, false, 0, 0, 32724));
        }
        List list = listC;
        yp0.b.k(list, 0, 0, 0, 0, 31);
        return list;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    private final Object i(Object obj2, Object obj3, Object obj4) {
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        b.a aVar = com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.b.Companion;
        Intrinsics.checkNotNullParameter(content, "content");
        List<a6f.j> listP0 = d0.P0(content, new s8f.i());
        ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
        for (a6f.j jVar : listP0) {
            String strQ = j6.a.q("INSTRUMENT_LIST_ID_", jVar.f1679a);
            InstrumentImage instrumentImage = new InstrumentImage(jVar.f1680b, 30, null, null);
            TextClause textClause = new TextClause(jVar.f1681c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause2 = new TextClause(jVar.f1679a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = jVar.d;
            TextClause[] elements = {textClause2, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.b.Companion.getClass();
            arrayList.add(new RowDelegate.Model(strQ, instrumentImage, null, null, textClause, yoj.b.m((DotDividerClause) com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.b.f91496a.getValue(), listL), null, null, 0, new RowDelegate.Model.c.b(new PercentageClause(jVar.e, (PercentageClause.Format) null, (Style) null, 6), null, null, false, 126), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073739628));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        qg6.d info = (qg6.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(info, "info");
        aim.e eVarB = zhm.u.b();
        TextClause textClause = new TextClause(info.f245661b, (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124);
        yj0 yj0Var = yj0.START;
        eVarB.add(new TextDelegate.Model("ID_DESCRIPTION", textClause, false, new ck0(yj0Var), null, null, 0, 0, 0, 0, 2036));
        qg6.c cVar = info.f245662c;
        if (cVar != null) {
            eVarB.add(new TextDelegate.Model("ID_COMPANIES_HEADER", new TextClause(cVar.f245658a, (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124), false, new bk0(yj0Var), null, null, 0, 0, 0, 0, 2036));
            int i = 0;
            for (Object obj5 : cVar.f245659b) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                String strN = a0.d.n("ID_COMPANY_", i);
                Clause clauseW = yoj.b.w(new ImageClause(R$drawable.uikit_icn_24_dot, Integer.valueOf(R$attr.uikit_colorForeground), (Float) null, (Float) null, 28), new TextClause((String) obj5, (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124));
                ck0 ck0Var = new ck0(yj0.START);
                int i3 = R$attr.uikit_dp0;
                eVarB.add(new TextDelegate.Model(strN, clauseW, false, ck0Var, null, null, i3, i3, 0, 0, 1652));
                i = i2;
            }
        }
        eVarB.add(new TextDelegate.Model("ID_FOOTER", new HtmlClause(0, 30, (Integer) null, (Object) null, info.d), false, new ck0(yj0.START), null, null, 0, 0, 0, 0, 2036));
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return new sj6.e(eVarA, info.f245660a, false);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        String content = (String) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ProductSelectionDelegate.Model model = new ProductSelectionDelegate.Model("id_revolut_account", new dc(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D202", null, null, null, 30)), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_autopay_select_repayment_revolut_title_v2, zhm.u.c(content), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_autopay_select_repayment_revolut_description_v2, null, null, 14), zhm.u.c(new pc("revolut-account-tag", new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_star_filled, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_autopay_select_repayment_revolut_tag_recommended, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new Color.Solid(R$attr.uikit_colorGroupedBackground), R$attr.uikit_colorTransparent, null, 1000), null)), null, null, false, false, false, 992);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        ProductSelectionDelegate.Model model2 = new ProductSelectionDelegate.Model("id_external_account", new dc(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D158", null, null, null, 30)), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_autopay_select_repayment_another_account_title_v2, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_autopay_select_repayment_another_account_description_v2, null, null, 14), null, null, null, false, false, false, 1008);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        ProductSelectionDelegate.Model model3 = new ProductSelectionDelegate.Model("id_revolut_manual_payment", new dc(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D026", null, null, null, 30)), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_autopay_select_repayment_manual_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_autopay_select_repayment_manual_description, null, null, 14), zhm.u.c(new pc("revolut-manual-payment-tag", new TagViewData(new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_autopay_select_repayment_manual_tag_not_automated, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new Color.Solid(R$attr.uikit_colorGroupedBackground), R$attr.uikit_colorTransparent, null, 1000), null)), null, null, false, false, false, 992);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        return new sk4.d(zhm.v.k(model, model2, model3));
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        Map juniorProfiles = (Map) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
        List<JuniorBankingProfile> listP0 = d0.P0(juniorProfiles.values(), new sm9.h());
        ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
        for (JuniorBankingProfile juniorBankingProfile : listP0) {
            arrayList.add(new PayeesOverviewFlowContract$FlowPagerItem.Junior(juniorBankingProfile.f77103j, juniorBankingProfile.f77099b));
        }
        return arrayList;
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        ejb.e statistics = (ejb.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(statistics, "statistics");
        aim.e eVarB = zhm.u.b();
        eVarB.add(new PlainTextDelegate.Model("DESCRIPTION_LIST_ID", (Clause) null, (Clause) new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_balance_summary_description, null, null, 14), (v5) null, (UrlImage) null, false, pa.NORMAL, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65002));
        List listK = zhm.v.k(new CellDetailsDelegate.Model("TOP_UP_ITEM_ID", new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_balance_summary_section_top_up, null, null, 14), new MoneyClause(statistics.f126841a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("WITHDRAWAL_ITEM_ID", new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_balance_summary_section_withdrawals, null, null, 14), new MoneyClause(statistics.f126842b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("INTEREST_ITEM_ID", new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_balance_summary_section_interest_payed_gross, null, null, 14), new MoneyClause(statistics.f126843c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("TOTAL_ITEM_ID", new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_balance_summary_section_balance_gross, null, null, 14), new MoneyClause(pyd.c.O(pyd.c.O(statistics.f126841a, statistics.f126842b), statistics.f126843c), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("GOT_IT_BUTTON_LIST_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        eVarB.add(model);
        return new sob.f(zhm.u.a(eVarB));
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0354  */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45, java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 3492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rd3.x.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ x(Object obj2, int i) {
        this.f253332a = i;
    }
}

package j75;

import android.os.Parcelable;
import au0.o0;
import au0.u0;
import aw0.bb;
import aw0.c7;
import aw0.cb;
import aw0.ka;
import aw0.m6;
import aw0.n1;
import aw0.n6;
import aw0.o1;
import aw0.o9;
import aw0.p1;
import aw0.p6;
import aw0.q1;
import aw0.s8;
import aw0.t0;
import aw0.y4;
import bw0.m;
import cli.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.hj;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.zi;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.SuccessCircleBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardPaymentDetails;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentChangeTermQuote;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardButtonsModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardLargeButtonModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardSectionModel;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import com.revolut.feature.rev_points.models.RevPointsBenefits;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.feature.transport.impl.common.TransportHubLocation;
import com.revolut.feature.transport.models.transit.TransitTicket;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold;
import com.revolut.feature_travel_hotels_models.property.PointsRewardRate;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import do3.q;
import eub.f;
import hw0.z;
import ip0.ak0;
import ip0.am;
import ip0.go0;
import ip0.hm0;
import ip0.jm0;
import ip0.po0;
import ip0.yj0;
import ip0.zj;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import js4.o;
import js4.p;
import jta.l;
import ju4.s;
import jzb.b0;
import jzb.e0;
import jzb.h0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import m1c.f1;
import m1c.g1;
import m1c.h1;
import m1c.r1;
import ms0.h4;
import mx0.f3;
import mx0.h3;
import org.jmrtd.lds.LDSFile;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class i implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f171859b;

    public /* synthetic */ i(int i, cli.j jVar, n nVar) {
        this.f171858a = i;
        this.f171859b = jVar;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        List listK;
        Clause textLocalisedClause;
        p pVar = (p) this.f171859b;
        js4.d content = (js4.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = u.b();
        CreditCardInstalmentChangeTermQuote.UpdatedInstalment updatedInstalment = content.f178122b;
        int i = updatedInstalment.f68796a;
        dj0.d dVar = updatedInstalment.f;
        dj0.d dVar2 = updatedInstalment.d;
        CreditCardInstalmentChangeTermQuote creditCardInstalmentChangeTermQuote = content.f178121a;
        ArrayList arrayList = creditCardInstalmentChangeTermQuote.f68792b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(Integer.valueOf(((CreditCardInstalmentChangeTermQuote.UpdatedInstalment) it8.next()).f68796a));
        }
        vt4.h hVar = pVar.f178141a;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_instalment_term_suggestion_split_purchase_in, null, null, 14);
        TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.credit_card_instalment_instalments, Integer.valueOf(i), u.c(Integer.valueOf(i)), (Style) null, 24);
        List listO0 = d0.O0(arrayList2);
        if (listO0.size() <= 6) {
            listK = arrayList2;
        } else {
            listK = ((Number) d0.m0(listO0)).intValue() <= 12 ? v.k(1, 3, 6, 9, 12) : ((Number) d0.m0(listO0)).intValue() <= 24 ? v.k(1, 6, 9, 12, 24) : ((Number) d0.m0(listO0)).intValue() <= 36 ? v.k(1, 6, 12, 24, 36) : v.k(1, 6, 12, 24, 48);
        }
        eVarB.addAll(hVar.b(textLocalisedClause2, textLocalisedQuantityClause, i, arrayList2, listK, 6));
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("id_instalment_term_item_principal_amount", new t0((Clause) new TextLocalisedClause(R$string.credit_card_instalment_term_section_item_principal_amount, null, null, 14), (Image) null, 0, false, 30), sx4.f.b(3, null, null, content.f178123c), null, null, null, null, 0, null, false, false, null, null, 32760);
        CreditCardInstalmentChangeTermQuote.CurrentInstalment currentInstalment = creditCardInstalmentChangeTermQuote.f68791a;
        Double d = currentInstalment.e;
        dj0.d dVar3 = currentInstalment.f68795c;
        Object nVar = dVar != null ? new js4.n(dVar, d) : new o(dVar2, d);
        dj0.d dVar4 = updatedInstalment.f68797b;
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.credit_card_statement_details_info_interest, null, null, 14), (Image) null, 0, false, 30);
        if (nVar instanceof o) {
            textLocalisedClause = sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, ((o) nVar).f178139a);
        } else {
            if (!(nVar instanceof js4.n)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.credit_card_instalment_dialog_estimated_interest_per_day, u.c(sx4.f.b(3, null, null, ((js4.n) nVar).f178137a)), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 8);
        }
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
        dj0.d dVar5 = currentInstalment.d;
        MoneyClause moneyClauseB = !Intrinsics.f(dVar3, dVar2) ? sx4.f.b(1, new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), null, dVar3) : null;
        Double d5 = currentInstalment.e;
        qv0.i[] elements = {model, new CellDetailsDelegate.Model("id_instalment_term_item_estimated_interest", t0Var, textLocalisedClause, moneyClauseB, dVar != null ? new js4.n(dVar, d5) : new o(dVar2, d5), null, null, 0, resourceImage, false, false, null, null, 31664), new CellDetailsDelegate.Model("id_instalment_term_item_total_to_repay", new t0((Clause) new TextLocalisedClause(R$string.credit_card_instalment_term_section_item_total_amount, null, null, 14), (Image) null, 0, false, 30), sx4.f.b(3, null, null, dVar4), !Intrinsics.f(dVar5, dVar4) ? sx4.f.b(1, new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), null, dVar5) : null, null, null, null, 0, null, false, true, null, null, 28656)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(listL);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("id_instalment_term_item_monthly_repayment", new t0((Clause) new TextLocalisedClause(R$string.credit_card_instalment_term_item_monthly_repayment, null, null, 14), (Image) null, 0, false, 30), sx4.f.b(3, null, null, updatedInstalment.e), null, null, j2.H3, null, 0, null, false, false, null, null, 32632);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        return new js4.h(u.a(eVarB), new js4.g(new TextLocalisedClause(R$string.credit_card_instalment_edit_quote_action_confirm, null, null, 14), content.e != content.f178122b.f68796a, true));
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        jt4.j jVar = (jt4.j) this.f171859b;
        CreditCardDialogModel dialog = (CreditCardDialogModel) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        TextClause textClause = new TextClause(dialog.f68841a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = dialog.f68842b;
        aw0.i eVar = null;
        lw0.a aVar = new lw0.a(textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, 28);
        List list = dialog.d;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj5 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            a0.x(jVar.f178350a.h(a0.d.n("id_credit_card_bottom_sheet_section_", i), ((CreditCardSectionModel) obj5).f68858a), arrayList);
            i = i2;
        }
        CreditCardButtonsModel creditCardButtonsModel = dialog.e;
        String str2 = dialog.f68843c;
        if (creditCardButtonsModel != null) {
            CreditCardLargeButtonModel creditCardLargeButtonModel = creditCardButtonsModel.f68826a;
            CreditCardLargeButtonModel creditCardLargeButtonModel2 = creditCardButtonsModel.f68827b;
            n6 n6VarA = lt4.e.a(creditCardLargeButtonModel);
            eVar = creditCardLargeButtonModel2 != null ? new aw0.h(false, n6VarA, lt4.e.a(creditCardLargeButtonModel2), null, null, null, 121) : new aw0.e(false, null, null, n6VarA, null, null, 55);
        } else if (str2 != null) {
            eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
        }
        return new jt4.c(eVar, arrayList, aVar);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        jta.k kVar;
        jta.w wVar = (jta.w) this.f171859b;
        com.revolut.feature.raffle.impl.data.models.b campaign = (com.revolut.feature.raffle.impl.data.models.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        TextDelegate.Model model = null;
        TextClause textClause = new TextClause(campaign.d.f18485b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        bta.d dVar = campaign.d;
        String str = dVar.f18486c;
        o0 o0Var = str != null ? new o0(new CompositeClause(prk.o.v(0, 30, null, null, str), null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), null, 10)) : null;
        String str2 = dVar.f18484a;
        g80.c cVar = wVar.f178468a;
        lta.b bVar = wVar.f178469b;
        String strA = ((g80.a) cVar).a(str2);
        List listC = u.c(new u0((strA == null || !kotlin.text.d0.J(strA, "video", false)) ? new NavBarWithContainerBackground.ImageBackground(new UrlImage(str2, null, null, null, 0L, null, null, null, ez0.h.CenterCrop, null, false, null, null, null, false, false, 523774), s8.MULTICOLOR, (Color.SolidRes) null, 12) : new NavBarWithContainerBackground.VideoBackground(new UrlVideo(str2, (String) null, false, oz0.b.CENTER_CROP, false, (oz0.c) null, LDSFile.EF_DG4_TAG), (Image) null, (VideoShutter) null, s8.MULTICOLOR, 22), textClause, o0Var));
        bta.j jVar = campaign.f81633g;
        if (jVar != null) {
            TextClause textClause2 = new TextClause(jVar.f18491a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            boolean z = jVar.f18492b;
            String str3 = jVar.f18493c;
            kVar = new jta.k(textClause2, z, str3 != null ? new ResourceImage(bVar.a(str3), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null);
        } else {
            kVar = null;
        }
        l lVar = new l(listC, v.l(campaign.f81634h != null ? new IconNavBarMenuItem("RAFFLE_SHARE_MENU_ITEM", new ResourceImage(R$drawable.uikit_icn_24_share, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.raffle.api.R$string.raffle_header_share_accessibility_key, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION) : dVar.d != null ? new IconNavBarMenuItem("RAFFLE_INFO_MENU_ITEM", new ResourceImage(R$drawable.uikit_icn_24_info_legacy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.raffle.api.R$string.raffle_header_info_article_accessibility_key, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION) : null), textClause, kVar);
        List items = campaign.e;
        Intrinsics.checkNotNullParameter(items, "items");
        List<bta.g> list = items;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (bta.g gVar : list) {
            String str4 = gVar.f18488a;
            HtmlClause htmlClause = new HtmlClause(0, 30, (Integer) null, (Object) null, str4);
            boolean z3 = false;
            RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(bVar.a(gVar.f18489b), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, 6);
            int i = lta.b.f199844b;
            arrayList.add(new RowDelegate.Model(str4, image24, htmlClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, i, i, 0, 0, 486537208));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        String str5 = campaign.f;
        if (str5 != null) {
            TextDelegate.Model model2 = new TextDelegate.Model("DISCLAIMER_LIST_ID", new HtmlClause(0, 30, (Integer) null, (Object) null, str5), false, new ak0(null, null, 3), null, null, 0, R$attr.uikit_dp0, 0, 0, 1776);
            yp0.b.r(model2, R$attr.uikit_dp16, R$attr.uikit_dp0, 0, 0, 12);
            model = model2;
        }
        if (model != null) {
            arrayList = d0.F0(model, arrayList);
        }
        return new jta.o(lVar, arrayList);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        m mVar;
        int i;
        TextLocalisedClause textLocalisedClause;
        s sVar = (s) this.f171859b;
        ju4.a content = (ju4.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = u.b();
        CreditCardPaymentDetails creditCardPaymentDetails = content.f178574a;
        dj0.d dVar = content.d;
        wi0.b countryCode = content.f178575b;
        dm4.e eVar = content.f;
        bw0.h hVar = new bw0.h(sVar.f178597a.e(dVar), cp5.d.J(dVar.f115083b), null, eVar == null, null, Boolean.TRUE, false, false, bw0.e.SuggestionsWhenTextEmptyElseCalculator, null, null, null, 31700);
        LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_pse, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 4.0f, Float.valueOf(24.0f), null, 32);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_payment_options_pse_title, null, null, 14);
        xi0.b bVar = creditCardPaymentDetails.f68737c;
        dj0.d remainingBalance = creditCardPaymentDetails.f68739h;
        dj0.d interest = creditCardPaymentDetails.f68748t;
        f3 f3Var = new f3(layeredImageB, textLocalisedClause2, new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4), false, h3.ACTIVE_NOT_CLICKABLE, false);
        if (eVar != null) {
            mVar = new m(new TextLocalisedClause(R$string.credit_card_topup_info_maximum_amount, u.c(sx4.f.b(3, null, null, eVar.f115857a)), null, 12), bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, 24);
        } else {
            if (eVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            mVar = null;
        }
        if (mVar == null) {
            dm4.d repayContext = new dm4.d(creditCardPaymentDetails, dVar, countryCode);
            Intrinsics.checkNotNullParameter(repayContext, "repayContext");
            dj0.d dVar2 = dj0.d.e;
            if (interest.f(dVar2)) {
                if (dVar.f(dVar2)) {
                    i = 14;
                    dVar.compareTo(remainingBalance);
                    textLocalisedClause = dVar.compareTo(remainingBalance) >= 0 ? new TextLocalisedClause(R$string.credit_card_topup_info_interest_saved, u.c(sx4.f.b(3, null, null, interest)), null, 12) : new TextLocalisedClause(R$string.credit_card_topup_info_estimated_interest, u.c(sx4.f.b(3, null, null, interest)), null, 12);
                } else {
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    Intrinsics.checkNotNullParameter(remainingBalance, "remainingBalance");
                    Intrinsics.checkNotNullParameter(interest, "interest");
                    wi0.b.Companion.getClass();
                    if (Intrinsics.f(countryCode, wi0.b.f297756l)) {
                        textLocalisedClause = null;
                        i = 14;
                    } else if (Intrinsics.f(countryCode, wi0.b.O)) {
                        i = 14;
                        textLocalisedClause = new TextLocalisedClause(R$string.credit_card_topup_info_pay_minimum_avoid_everdue, null, null, 14);
                    } else {
                        i = 14;
                        textLocalisedClause = new TextLocalisedClause(R$string.credit_card_topup_info_pay_to_save, v.k(sx4.f.b(3, null, null, remainingBalance), sx4.f.b(3, null, null, interest)), null, 12);
                    }
                }
                TextLocalisedClause textLocalisedClause3 = textLocalisedClause;
                mVar = textLocalisedClause3 == null ? null : new m(textLocalisedClause3, bw0.l.INFO, null, false, null, 28);
            } else {
                mVar = null;
                i = 14;
            }
        } else {
            i = 14;
        }
        eVarB.add(new CenteredAmountDelegate.Model("id_credit_card_pse_repay_amount_input", null, hVar, f3Var, mVar, null, null, false, false, creditCardPaymentDetails.f68737c, null, 1378));
        eVarB.addAll(((hu4.c) sVar.f178598b).a(dVar, content.f178574a, countryCode, content.e));
        return new ju4.j(u.a(eVarB), new ju4.f(new TextLocalisedClause(R$string.credit_card_topup_action_pay, null, null, i), dVar.f(dj0.d.e) && eVar == null));
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [com.revolut.core.ui_kit.models.Style, java.lang.Integer, java.util.List] */
    private final Object e(Object obj2, Object obj3, Object obj4) {
        ArrayList arrayList;
        luk.b bVar;
        cb cbVarB;
        TimeClause timeClauseA;
        mel.m mVar = (mel.m) this.f171859b;
        String indexName = (String) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(indexName, "indexName");
        s0 s0Var = new s0(2);
        mel.k chart = mVar.f204765b;
        Intrinsics.checkNotNullParameter(chart, "chart");
        ArrayList<mel.j> arrayList2 = chart.f204763c;
        if (arrayList2.isEmpty() || arrayList2.size() == 1) {
            arrayList = null;
            bVar = null;
        } else {
            long j2 = ((mel.j) d0.m0(arrayList2)).f204758a - ((mel.j) d0.b0(arrayList2)).f204758a;
            if (j2 == 0) {
                arrayList = null;
                bVar = null;
            } else {
                float f = j2;
                float size = f / (arrayList2.size() - 1);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayList2.size() / 3;
                int size3 = (arrayList2.size() * 2) / 3;
                int iRint = (int) Math.rint(arrayList2.size() * 0.9f);
                int i = 0;
                for (Object obj5 : arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    mel.j jVar = (mel.j) obj5;
                    float f4 = (i * size) / f;
                    if (f4 == BitmapDescriptorFactory.HUE_RED || i == size2 || i == size3 || i == iRint) {
                        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
                        if (i == iRint) {
                            timeClauseA = new TimeClause(System.currentTimeMillis(), TimeClause.Format.PrettyDayOfWeek.f57975b, custom, null, 8);
                        } else {
                            com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
                            Instant instantOfEpochMilli = Instant.ofEpochMilli(jVar.f204758a);
                            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                            LocalDate localDateW = oi0.d.W(instantOfEpochMilli);
                            LocalDateClause$DateFormat.Month month = new LocalDateClause$DateFormat.Month(ka.SHORT);
                            jVar2.getClass();
                            timeClauseA = com.revolut.core.ui_kit.models.j.a(localDateW, month, custom);
                        }
                    } else {
                        timeClauseA = null;
                    }
                    arrayList3.add(new hw0.k((String) null, jVar.f204759b.floatValue(), f4, (iw0.a) null, (Object) null, timeClauseA, 17));
                    arrayList4.add(new hw0.k((String) null, jVar.f204760c.floatValue(), f4, (iw0.a) null, (Object) null, (Clause) null, 17));
                    i = i2;
                }
                arrayList = null;
                bVar = new luk.b(arrayList3, arrayList4);
            }
        }
        BigDecimal bigDecimal = ((mel.j) d0.m0(arrayList2)).f204759b;
        BigDecimal bigDecimal2 = ((mel.j) d0.m0(arrayList2)).f204760c;
        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
            cb.Companion.getClass();
            cbVarB = bb.d();
        } else {
            cb.Companion.getClass();
            cbVarB = bb.b();
        }
        cb cbVar = cbVarB;
        ArrayList arrayList5 = bVar != null ? bVar.f200250a : arrayList;
        hm0 hm0Var = hm0.Thick;
        ArrayList arrayList6 = bVar != null ? bVar.f200251b : arrayList;
        List listC = arrayList6 != null ? u.c(new hw0.d((List) arrayList6, false, R$attr.uikit_colorOrange, 8)) : f0.f322471a;
        Comparable comparableL = cim.c.l(((mel.j) d0.b0(arrayList2)).f204759b, ((mel.j) d0.b0(arrayList2)).f204760c);
        Comparable comparableK = cim.c.k(((mel.j) d0.b0(arrayList2)).f204759b, ((mel.j) d0.b0(arrayList2)).f204760c);
        for (mel.j jVar3 : arrayList2) {
            BigDecimal bigDecimal3 = jVar3.f204759b;
            BigDecimal bigDecimal4 = jVar3.f204760c;
            BigDecimal bigDecimal5 = (BigDecimal) comparableL;
            if (bigDecimal3.compareTo(bigDecimal5) < 0 || bigDecimal4.compareTo(bigDecimal5) < 0) {
                comparableL = cim.c.l(bigDecimal3, bigDecimal4);
            }
            BigDecimal bigDecimal6 = (BigDecimal) comparableK;
            if (bigDecimal3.compareTo(bigDecimal6) > 0 || bigDecimal4.compareTo(bigDecimal6) > 0) {
                comparableK = cim.c.k(bigDecimal3, bigDecimal4);
            }
        }
        BigDecimal bigDecimal7 = (BigDecimal) comparableK;
        BigDecimal bigDecimal8 = (BigDecimal) comparableL;
        BigDecimal bigDecimalSubtract = bigDecimal7.subtract(bigDecimal8);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(new BigDecimal(3), RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        BigDecimal bigDecimalAdd = bigDecimal8.add(bigDecimalDivide);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        BigDecimal bigDecimalSubtract2 = bigDecimal7.subtract(bigDecimalDivide);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
        jm0 jm0Var = new jm0("SENTIMENT_CHART_ID", cbVar, arrayList5, false, null, null, 0, false, 0, null, false, false, new z(ms0.v.NoBackground, v.k(new hw0.a(bigDecimal7.floatValue(), juk.j.b(bigDecimal7, Integer.valueOf(R$attr.uikit_colorGreyTone50))), new hw0.a(bigDecimalSubtract2.floatValue(), juk.j.b(bigDecimalSubtract2, Integer.valueOf(R$attr.uikit_colorGreyTone50))), new hw0.a(bigDecimalAdd.floatValue(), juk.j.b(bigDecimalAdd, Integer.valueOf(R$attr.uikit_colorGreyTone50))), new hw0.a(bigDecimal8.floatValue(), juk.j.b(bigDecimal8, Integer.valueOf(R$attr.uikit_colorGreyTone50)))), 4), listC, null, hm0Var, null, null, null, null, 0, 0, 0, 0, -46280);
        n1 style = n1.LARGE;
        ?? r4 = arrayList;
        p1 trendClauses = new p1(new TextClause(indexName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), juk.j.b(bigDecimal, r4));
        List additionalChartLegendClauses = u.c(new p1(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.instrument_sentiment_chart_legend_moving_average, r4, r4, 14), juk.j.b(bigDecimal2, r4)));
        Intrinsics.checkNotNullParameter(jm0Var, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(trendClauses, "trendClauses");
        Intrinsics.checkNotNullParameter(additionalChartLegendClauses, "additionalChartLegendClauses");
        aim.e eVarB = u.b();
        eVarB.add(new q1(u.c(new p6(jm0Var.f164880b.f10269a, null)), trendClauses));
        List list = jm0Var.f164887n;
        if (list != null) {
            int size4 = list.size();
            for (int i3 = 0; i3 < size4; i3++) {
                hw0.d dVar = (hw0.d) list.get(i3);
                p1 p1Var = (p1) d0.e0(i3, additionalChartLegendClauses);
                if (p1Var != null) {
                    eVarB.add(new q1(u.c(new p6(dVar.f155994b.f10269a, null)), p1Var));
                }
            }
        }
        s0Var.b(c8g.c.K(jm0Var, new o1(u.a(eVarB), style)).toArray(new qv0.i[0]));
        s0Var.a(new TextDelegate.Model("SENTIMENT_CHART_FOOTER_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.instrument_sentiment_chart_dynamic_footer, u.c(new TextClause(indexName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
        ArrayList arrayList7 = s0Var.f186433a;
        List listK = v.k(arrayList7.toArray(new qv0.i[arrayList7.size()]));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r22, java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j75.i.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        jwf.e eVar = (jwf.e) this.f171859b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("WIDGET_NO_LOCATION_ID", new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_hub_tab_transit_widget_empty_title_with_city, u.c(new TextClause(((TransportHubLocation.Selected) eVar.f178977a).f92504a.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_hub_tab_transit_widget_empty_subtitle, null, null, 14), new ComplexImage.Regular(jwf.p.b(R$drawable.uikit_icn_24_voucher)), new l6(12, new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_hub_tab_transit_no_location_cta_title, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, jwf.d.CHOOSE_CITY, null, null, 1600);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return v.k(model, nvf.l.a());
        }
        List<bxf.f> list = content;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (bxf.f fVar : list) {
            String str = fVar.f19680a;
            TextClause textClause = new TextClause(fVar.f19681b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            List list2 = fVar.f19682c;
            ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model(str, (Image) null, (Clause) textClause, (Image) null, (Clause) (list2.size() > 2 ? new TextLocalisedClause(R.string.common_action_see_all, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10) : null), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) new jwf.h(str, fVar.f19681b), (Parcelable) null, 0, 0, 0, 0, 64426);
            List list3 = list2;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                arrayList2.add(nvf.h.b((TransitTicket) it8.next()));
            }
            String strConcat = "SECTION_BOX_ID_".concat(str);
            SmallCardDelegate.INSTANCE.getClass();
            arrayList.add(v.k(model2, new hg(strConcat, arrayList2, 2, new y4(SmallCardDelegate.f53351j), null, new gg.c(0), false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28608)));
        }
        return i2b.a.p(w.u(arrayList), nvf.l.a());
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        RevPointsEarningRate staysEarningRates;
        RevPointsEarningRate experiencesEarningRates;
        char c2;
        int i;
        char c3;
        RowDelegate.Model model;
        int i2;
        RowDelegate.Model model2;
        RowDelegate.Model model3;
        RowDelegate.Model model4;
        RowDelegate.Model model5;
        RowDelegate.Model model6;
        RowDelegate.Model model7;
        RowDelegate.Model model8;
        RowDelegate.Model model9;
        RowDelegate.Model model10;
        RowDelegate.Model model11;
        jzb.n nVar = (jzb.n) this.f171859b;
        vf0.h hVar = (vf0.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(hVar, "<destruct>");
        List<RevPointsEarningRate> list = (List) hVar.f288433a;
        g1 g1Var = (g1) hVar.f288434b;
        hzb.s sVar = (hzb.s) hVar.f288435c;
        List list2 = (List) hVar.d;
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z6 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z29 = false;
        for (h1 h1Var : g1Var.f201366a) {
            f1 f1Var = h1Var.f201375a;
            boolean z31 = h1Var.f201376b;
            switch (jzb.m.f179715a[f1Var.ordinal()]) {
                case 1:
                    z3 = z31;
                    break;
                case 2:
                    z4 = z31;
                    break;
                case 3:
                    z = z31;
                    break;
                case 4:
                    z11 = z31;
                    break;
                case 5:
                    z12 = z31;
                    break;
                case 6:
                    z6 = z31;
                    break;
                case 7:
                    z29 = z31;
                    break;
            }
        }
        RevPointsEarningRate shopsEarningRates = null;
        RevPointsEarningRate revPointsEarningRate = null;
        RevPointsEarningRate revPointsEarningRate2 = null;
        for (RevPointsEarningRate revPointsEarningRate3 : list) {
            int i3 = jzb.m.f179715a[revPointsEarningRate3.f83975a.ordinal()];
            if (i3 == 1) {
                revPointsEarningRate = revPointsEarningRate3;
            } else if (i3 == 2) {
                revPointsEarningRate2 = revPointsEarningRate3;
            } else if (i3 == 3) {
                shopsEarningRates = revPointsEarningRate3;
            }
        }
        if (shopsEarningRates != null) {
            jzb.i iVar = nVar.f179716a;
            boolean z41 = sVar.f157117a;
            ((jzb.j) iVar).getClass();
            Intrinsics.checkNotNullParameter(shopsEarningRates, "shopsEarningRates");
            if (z41) {
                c3 = 0;
                staysEarningRates = revPointsEarningRate;
                c2 = 1;
                experiencesEarningRates = revPointsEarningRate2;
                i = 14;
                model11 = new RowDelegate.Model("SHOPS_ITEM", jzb.j.c(R$drawable.uikit_icn_24_shopping), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_bonus_points_shops_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_common_rates_up_to, u.c(new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_common_rates_spent, v.k(nub.a.q(shopsEarningRates.f83976b, null, null, null, 7), new MoneyClause(shopsEarningRates.f83977c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12)), null, 12), null, null, 0, jzb.j.a(), z, null, false, jzb.j.b(z), null, null, null, null, null, new jzb.g(shopsEarningRates.f83975a), null, 0, 0, 0, 0, 532657112);
            } else {
                staysEarningRates = revPointsEarningRate;
                experiencesEarningRates = revPointsEarningRate2;
                c2 = 1;
                i = 14;
                c3 = 0;
                model11 = null;
            }
            model = model11;
        } else {
            staysEarningRates = revPointsEarningRate;
            experiencesEarningRates = revPointsEarningRate2;
            c2 = 1;
            i = 14;
            c3 = 0;
            model = null;
        }
        if (staysEarningRates != null) {
            jzb.i iVar2 = nVar.f179716a;
            boolean z49 = sVar.f157118b;
            ((jzb.j) iVar2).getClass();
            Intrinsics.checkNotNullParameter(staysEarningRates, "staysEarningRates");
            if (z49) {
                RowDelegate.Model.MainImage.Image40 image40C = jzb.j.c(R$drawable.uikit_icn_24_resort);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_bonus_points_stays_title, null, null, i);
                int i5 = com.revolut.feature.rev_points.api.R$string.rev_points_common_rates_up_to;
                int i6 = com.revolut.feature.rev_points.api.R$string.rev_points_common_rates_spent;
                TextLocalisedQuantityClause textLocalisedQuantityClauseQ = nub.a.q(staysEarningRates.f83976b, null, null, null, 7);
                MoneyClause moneyClause = new MoneyClause(staysEarningRates.f83977c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                Clause[] clauseArr = new Clause[2];
                clauseArr[c3] = textLocalisedQuantityClauseQ;
                clauseArr[c2] = moneyClause;
                i2 = 12;
                model10 = new RowDelegate.Model("STAYS_ITEM", image40C, textLocalisedClause, null, 0, new TextLocalisedClause(i5, u.c(new TextLocalisedClause(i6, v.k(clauseArr), null, 12)), null, 12), null, null, 0, jzb.j.a(), z3, null, false, jzb.j.b(z3), null, null, null, null, null, new jzb.g(staysEarningRates.f83975a), null, 0, 0, 0, 0, 532657112);
            } else {
                i2 = 12;
                model10 = null;
            }
            model2 = model10;
        } else {
            i2 = 12;
            model2 = null;
        }
        if (experiencesEarningRates != null) {
            jzb.i iVar3 = nVar.f179716a;
            boolean z54 = sVar.f157119c;
            ((jzb.j) iVar3).getClass();
            Intrinsics.checkNotNullParameter(experiencesEarningRates, "experiencesEarningRates");
            if (z54) {
                RowDelegate.Model.MainImage.Image40 image40C2 = jzb.j.c(R$drawable.uikit_icn_24_voucher);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_bonus_points_experiences_title, null, null, i);
                int i21 = com.revolut.feature.rev_points.api.R$string.rev_points_common_rates_up_to;
                int i22 = com.revolut.feature.rev_points.api.R$string.rev_points_common_rates_spent;
                TextLocalisedQuantityClause textLocalisedQuantityClauseQ2 = nub.a.q(experiencesEarningRates.f83976b, null, null, null, 7);
                MoneyClause moneyClause2 = new MoneyClause(experiencesEarningRates.f83977c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                Clause[] clauseArr2 = new Clause[2];
                clauseArr2[c3] = textLocalisedQuantityClauseQ2;
                clauseArr2[c2] = moneyClause2;
                model9 = new RowDelegate.Model("EXPERIENCES_ITEM", image40C2, textLocalisedClause2, null, 0, new TextLocalisedClause(i21, u.c(new TextLocalisedClause(i22, v.k(clauseArr2), null, i2)), null, i2), null, null, 0, jzb.j.a(), z4, null, false, jzb.j.b(z4), null, null, null, null, null, new jzb.g(experiencesEarningRates.f83975a), null, 0, 0, 0, 0, 532657112);
            } else {
                model9 = null;
            }
            model3 = model9;
        } else {
            model3 = null;
        }
        jzb.j jVar = (jzb.j) nVar.f179716a;
        if (sVar.f157122j) {
            int i32 = R$drawable.uikit_icn_24_revolut;
            jVar.getClass();
            model4 = new RowDelegate.Model("REVOLUT_PAY_ITEM", jzb.j.c(i32), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_bonus_points_revolut_pay_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_bonus_points_revolut_pay_subtitle, null, null, 14), null, null, 0, jzb.j.a(), z6, null, false, jzb.j.b(z6), null, null, null, null, null, null, null, 0, 0, 0, 0, 536851416);
        } else {
            jVar.getClass();
            model4 = null;
        }
        if (sVar.i) {
            int i33 = R$drawable.uikit_icn_24_trophy;
            jVar.getClass();
            model5 = new RowDelegate.Model("CHALLENGES_ITEM", jzb.j.c(i33), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_bonus_points_challenges_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_challenges_subtitle, null, null, 14), null, null, 0, jzb.j.a(), z11, null, false, jzb.j.b(z11), null, null, null, null, null, new jzb.g(f1.CHALLENGES), null, 0, 0, 0, 0, 532657112);
        } else {
            jVar.getClass();
            model5 = null;
        }
        RevPointsPocketThreshold lastPointsPocketThreshold = (RevPointsPocketThreshold) d0.o0(list2);
        if (lastPointsPocketThreshold != null) {
            boolean z74 = sVar.e;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(lastPointsPocketThreshold, "lastPointsPocketThreshold");
            if (z74) {
                RowDelegate.Model.MainImage.Image40 image40C3 = jzb.j.c(R$drawable.uikit_icn_24_rev_points);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_bonus_points_points_pocket_title, null, null, 14);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_points_pocket_subtitle, u.c(nub.a.q(lastPointsPocketThreshold.f97794b, null, null, null, 7)), null, i2);
                RowDelegate.Model.b bVar = z12 ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a;
                Intrinsics.checkNotNullParameter("revolut://app/rev-points/pocket", "deeplink");
                model8 = new RowDelegate.Model("POCKET_ITEM", image40C3, textLocalisedClause3, null, 0, textLocalisedClause4, null, null, 0, jzb.j.a(), z12, null, false, bVar, null, null, null, null, null, new jzb.f(), null, 0, 0, 0, 0, 532657112);
            } else {
                model8 = null;
            }
            model6 = model8;
        } else {
            model6 = null;
        }
        if (sVar.f) {
            int i43 = R$drawable.uikit_icn_24_mortgage;
            jVar.getClass();
            model7 = new RowDelegate.Model("RECURRING_PAYMENTS_ITEM", jzb.j.c(i43), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_bonus_points_rent_and_bills_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_bonus_points_rent_and_bills_subtitle, null, null, 14), null, null, 0, jzb.j.a(), z29, null, false, jzb.j.b(z29), null, null, null, null, null, new jzb.g(f1.RECURRING_PAYMENTS), null, 0, 0, 0, 0, 532657112);
        } else {
            jVar.getClass();
            model7 = null;
        }
        RowDelegate.Model[] elements = {model, model2, model3, model4, model5, model6, model7};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        return !listL.isEmpty() ? yp0.b.g(listL, jzb.n.a(), null, 0, 0, 126) : listL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0260  */
    /* JADX WARN: Type inference failed for: r0v17, types: [aim.e] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [aim.e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [com.revolut.core.ui_kit.models.Custom, nub.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r49, java.lang.Object r50, java.lang.Object r51) {
        /*
            Method dump skipped, instruction units count: 1081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j75.i.j(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.revolut.core.ui_kit.models.Custom, com.revolut.core.ui_kit.models.Style, java.util.List, nub.b] */
    /* JADX WARN: Type inference failed for: r3v16 */
    private final Object k(Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        ?? r3;
        char c2;
        RowDelegate.Model model;
        boolean z3;
        RowDelegate.Model model2;
        String str;
        Clause textLocalisedClause;
        RowDelegate.Model model3;
        TextLocalisedClause textLocalisedClause2;
        jzb.f0 f0Var = (jzb.f0) this.f171859b;
        vf0.k kVar = (vf0.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(kVar, "<destruct>");
        g1 g1Var = (g1) kVar.f288454a;
        hzb.s sVar = (hzb.s) kVar.f288455b;
        RevPointsBenefits benefits = (RevPointsBenefits) kVar.f288456c;
        od0.i pointsSpareChange = (od0.i) kVar.d;
        rub.c cVar = (rub.c) kVar.e;
        boolean z4 = false;
        boolean z6 = false;
        for (h1 h1Var : g1Var.f201366a) {
            f1 f1Var = h1Var.f201375a;
            boolean z11 = h1Var.f201376b;
            int i2 = e0.f179710a[f1Var.ordinal()];
            if (i2 == 1) {
                z4 = z11;
            } else if (i2 == 2) {
                z6 = z11;
            }
        }
        jzb.a0 a0Var = f0Var.f179711a;
        boolean z12 = sVar.f157120g;
        boolean z29 = sVar.f157121h;
        b0 b0Var = (b0) a0Var;
        RowDelegate.Model.b.a aVar = RowDelegate.Model.b.a.f53266a;
        RowDelegate.Model.b.c cVar2 = RowDelegate.Model.b.c.f53268a;
        CircleBadgeModel circleBadgeModel = null;
        if (z12) {
            int i3 = R$drawable.uikit_icn_24_rev_points;
            b0Var.getClass();
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i3, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10), circleBadgeModel, null, false, null, false, 60);
            z = z29;
            r3 = 0;
            i = 14;
            c2 = 0;
            model = new RowDelegate.Model("TOP_UPS_BUY_POINTS_ITEM", image40, new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_top_ups_points_buying_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_top_ups_points_buying_description, null, null, 14), null, null, 0, b0.a(), z4, null, false, z4 ? cVar2 : aVar, null, null, null, null, null, null, null, 0, 0, 0, 0, 536851416);
        } else {
            z = z29;
            i = 14;
            r3 = 0;
            c2 = 0;
            b0Var.getClass();
            model = null;
        }
        rub.i iVar = cVar.f257511a;
        b0Var.getClass();
        if (z) {
            int i5 = R$drawable.uikit_icn_24_retry;
            RowDelegate.Model.MainImage.Image40 image402 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i5, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10), iVar != null ? Intrinsics.f(iVar.i, Boolean.TRUE) ? new WarningCircleBadge(dw0.a.Info) : new SuccessCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_top_ups_recurring_buying_title, r3, r3, i);
            if (iVar != null) {
                int i6 = com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_top_ups_recurring_buying_description_active;
                TextLocalisedQuantityClause textLocalisedQuantityClauseP = nub.a.p(iVar.f257517a, r3, r3, 7);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_top_ups_common_month, r3, r3, i);
                Clause[] clauseArr = new Clause[2];
                clauseArr[c2] = textLocalisedQuantityClauseP;
                z3 = true;
                clauseArr[1] = textLocalisedClause4;
                textLocalisedClause2 = new TextLocalisedClause(i6, v.k(clauseArr), r3, 12);
            } else {
                z3 = true;
                textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_top_ups_recurring_buying_description, r3, r3, i);
            }
            model2 = new RowDelegate.Model("TOP_UPS_RECURRING_BUY_ITEM", image402, textLocalisedClause3, null, 0, textLocalisedClause2, null, null, 0, b0.a(), z6, null, false, z6 ? cVar2 : aVar, null, null, null, null, null, null, null, 0, 0, 0, 0, 536851416);
        } else {
            z3 = true;
            model2 = null;
        }
        boolean z31 = sVar.d;
        boolean z41 = sVar.f157120g;
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        Intrinsics.checkNotNullParameter(pointsSpareChange, "pointsSpareChange");
        dj0.d dVar = benefits.d;
        if (dVar != null && (str = benefits.e) != null && z31 && (z41 || z)) {
            LayeredImage layeredImageI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10);
            yvh.b bVar = (yvh.b) pointsSpareChange.f224257a;
            RowDelegate.Model.MainImage.Image40 image403 = new RowDelegate.Model.MainImage.Image40(layeredImageI, (bVar == null || bVar.f317177b != z3) ? null : new SuccessCircleBadge(dw0.a.Checked), null, false, null, false, 60);
            if (bVar == null || bVar.f317177b != z3) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_spare_change_title, r3, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
            } else {
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_spare_change_title, r3, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
                Float f = bVar.i;
                TextLocalisedClause[] elements = {textLocalisedClause5, f != null ? new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_spare_change_multiplier, u.c(Integer.valueOf((int) f.floatValue())), r3, 12) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                m70.a.a(kotlin.jvm.internal.t0.f186434a);
                textLocalisedClause = new CompositeClause(listL, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            }
            int i21 = com.revolut.feature.rev_points.api.R$string.rev_points_common_rates_buy;
            int i22 = com.revolut.feature.rev_points.api.R$string.rev_points_common_rates_spared;
            TextLocalisedQuantityClause textLocalisedQuantityClauseP2 = nub.a.p(Double.parseDouble(str), r3, r3, 7);
            boolean z49 = z3;
            boolean z54 = c2;
            MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Shorts(z54, 63), null, null, 12);
            Clause[] clauseArr2 = new Clause[2];
            clauseArr2[z54 ? 1 : 0] = textLocalisedQuantityClauseP2;
            clauseArr2[z49 ? 1 : 0] = moneyClause;
            model3 = new RowDelegate.Model("TOP_UPS_SPARE_CHANGE_ID", image403, textLocalisedClause, null, 0, new TextLocalisedClause(i21, u.c(new TextLocalisedClause(i22, v.k(clauseArr2), r3, 12)), r3, 12), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
        } else {
            model3 = null;
        }
        RowDelegate.Model[] elements2 = {model, model2, model3};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List listL2 = kotlin.collections.d.L(elements2);
        return !listL2.isEmpty() ? yp0.b.g(listL2, jzb.f0.a(), null, 0, 0, 126) : listL2;
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        Clause textClause;
        h0 h0Var = (h0) this.f171859b;
        eub.f upsellBannerState = (eub.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(upsellBannerState, "upsellBannerState");
        if ((upsellBannerState instanceof f.a) || (upsellBannerState instanceof f.b)) {
            return f0.f322471a;
        }
        if (!(upsellBannerState instanceof eub.g)) {
            throw new NoWhenBranchMatchedException();
        }
        eub.g gVar = (eub.g) upsellBannerState;
        RevPointsBenefits revPointsBenefits = gVar.f129543a;
        hha.d dVar = gVar.f129544b;
        if (hha.s.o(dVar)) {
            textClause = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_upsell_banner_subtitle_private, null, null, 14);
        } else if (hha.s.p(dVar)) {
            textClause = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_upsell_banner_subtitle_ultra, null, null, 14);
        } else if (hha.s.j(dVar)) {
            textClause = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_upsell_banner_subtitle_metal, null, null, 14);
        } else if (hha.s.n(dVar)) {
            textClause = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_upsell_banner_subtitle_premium, null, null, 14);
        } else if (hha.s.m(dVar)) {
            textClause = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_upsell_banner_subtitle_plus, null, null, 14);
        } else {
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        String str = "upgrade_banner_ultra";
        if (!hha.s.o(dVar) && !hha.s.p(dVar)) {
            if (hha.s.j(dVar)) {
                str = "upgrade_banner_metal";
            } else if (hha.s.n(dVar)) {
                str = "upgrade_banner_premium";
            } else if (hha.s.m(dVar)) {
                str = "upgrade_banner_plus";
            } else {
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                str = "";
            }
        }
        HeroBannerDelegate.Model model = new HeroBannerDelegate.Model("UPSELL_BANNER_LIST_ID", (Clause) new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_hub_upsell_banner_title, v.k(nub.a.p(Double.parseDouble(revPointsBenefits.f83962b), null, null, 7), new MoneyClause(revPointsBenefits.f83961a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), h0Var.f179713a.c(revPointsBenefits.f83965h, null)), null, 12), textClause, (Media) new CdnImage(str, "mobile/rev_points/upgrade_banner", null, null, null, null, Constants.TAG_FC_SPEED_MODE), (HeroBannerDelegate.b) null, false, am.AUTO, (Object) dVar, (AnalyticsContext) null, 1392);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) throws Throwable {
        k08.h hVar = (k08.h) this.f171859b;
        List documents = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(documents, "documents");
        hVar.o.getClass();
        Float fValueOf = Float.valueOf(40.0f);
        Intrinsics.checkNotNullParameter(documents, "documents");
        s0 s0Var = new s0(2);
        List list = documents;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list) {
            if (obj5 instanceof PolicyDocument.Pdf) {
                arrayList.add(obj5);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        int i = 0;
        while (true) {
            Throwable th10 = null;
            if (!it8.hasNext()) {
                s0Var.b((qv0.i[]) arrayList2.toArray(new qv0.i[0]));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : list) {
                    if (obj6 instanceof PolicyDocument.Text) {
                        arrayList3.add(obj6);
                    }
                }
                ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                int i2 = 0;
                for (Object obj7 : arrayList3) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        Throwable th11 = th10;
                        v.s();
                        throw th11;
                    }
                    PolicyDocument.Text text = (PolicyDocument.Text) obj7;
                    arrayList4.add(new RowDelegate.Model(a0.d.n("POLICY_LOCAL_DOCUMENT_ROW_ID_PREFIX_", i2), LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_document, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, fValueOf, null, 32), null, null, text.f76273a, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, false, null, null, null, null, null, text, null, 0, 0, 0, 0, 1056958444));
                    th10 = th10;
                    i2 = i3;
                }
                s0Var.b((qv0.i[]) arrayList4.toArray(new qv0.i[0]));
                ArrayList arrayList5 = s0Var.f186433a;
                List listK = v.k(arrayList5.toArray(new qv0.i[arrayList5.size()]));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            }
            Object next = it8.next();
            int i5 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            PolicyDocument.Pdf pdf2 = (PolicyDocument.Pdf) next;
            arrayList2.add(new RowDelegate.Model(a0.d.n("POLICY_REMOTE_DOCUMENT_ROW_ID_PREFIX_", i), LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_document, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, fValueOf, null, 32), null, null, pdf2.f76270a, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, false, null, null, null, null, null, pdf2, null, 0, 0, 0, 0, 1056958444));
            i = i5;
        }
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        k37.g gVar = (k37.g) this.f171859b;
        k37.f taxInfo = (k37.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(taxInfo, "taxInfo");
        wi0.b countryCode = q.y(taxInfo.f180627c);
        ds6.j taxType = gVar.f180628a;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        int i = m37.f.f202297a[taxType.ordinal()];
        m37.d dVarA = null;
        if (i == 1) {
            wi0.b.Companion.getClass();
            if (countryCode.equals(wi0.b.f297750h0)) {
                m37.c cVar = m37.d.Companion;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_title_income_es, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_caption_income_es, null, null, 14);
                cVar.getClass();
                dVarA = m37.c.a(textLocalisedClause, textLocalisedClause2);
            } else if (countryCode.equals(wi0.b.p0)) {
                m37.c cVar2 = m37.d.Companion;
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_title_income_gb, null, null, 14);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_caption_income_gb, null, null, 14);
                cVar2.getClass();
                dVarA = m37.c.a(textLocalisedClause3, textLocalisedClause4);
            } else if (countryCode.equals(wi0.b.f297760n0)) {
                m37.c cVar3 = m37.d.Companion;
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_title_income_fr, null, null, 14);
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_caption_income_fr, null, null, 14);
                cVar3.getClass();
                dVarA = m37.c.a(textLocalisedClause5, textLocalisedClause6);
            } else if (countryCode.equals(wi0.b.L0)) {
                m37.c cVar4 = m37.d.Companion;
                TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_title_income_ie, null, null, 14);
                TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_caption_income_ie, null, null, 14);
                cVar4.getClass();
                dVarA = m37.c.a(textLocalisedClause7, textLocalisedClause8);
            } else if (countryCode.equals(wi0.b.T0)) {
                m37.c cVar5 = m37.d.Companion;
                TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_title_income_it, null, null, 14);
                TextLocalisedClause textLocalisedClause10 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_caption_income_it, null, null, 14);
                cVar5.getClass();
                dVarA = m37.c.a(textLocalisedClause9, textLocalisedClause10);
            }
        } else if (i == 2) {
            wi0.b.Companion.getClass();
            if (countryCode.equals(wi0.b.f297760n0)) {
                m37.c cVar6 = m37.d.Companion;
                TextLocalisedClause textLocalisedClause11 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_title_social_security_fr, null, null, 14);
                TextLocalisedClause textLocalisedClause12 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_caption_social_security_fr, null, null, 14);
                cVar6.getClass();
                dVarA = m37.c.a(textLocalisedClause11, textLocalisedClause12);
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            wi0.b.Companion.getClass();
            if (countryCode.equals(wi0.b.f297750h0)) {
                m37.c cVar7 = m37.d.Companion;
                TextLocalisedClause textLocalisedClause13 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_title_vat_es, null, null, 14);
                TextLocalisedClause textLocalisedClause14 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_caption_vat_es, null, null, 14);
                cVar7.getClass();
                dVarA = m37.c.a(textLocalisedClause13, textLocalisedClause14);
            } else if (countryCode.equals(wi0.b.p0)) {
                m37.c cVar8 = m37.d.Companion;
                TextLocalisedClause textLocalisedClause15 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_title_vat_gb, null, null, 14);
                TextLocalisedClause textLocalisedClause16 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_caption_vat_gb, null, null, 14);
                cVar8.getClass();
                dVarA = m37.c.a(textLocalisedClause15, textLocalisedClause16);
            } else if (countryCode.equals(wi0.b.L0)) {
                m37.c cVar9 = m37.d.Companion;
                TextLocalisedClause textLocalisedClause17 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_title_vat_ie, null, null, 14);
                TextLocalisedClause textLocalisedClause18 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_caption_vat_ie, null, null, 14);
                cVar9.getClass();
                dVarA = m37.c.a(textLocalisedClause17, textLocalisedClause18);
            } else if (countryCode.equals(wi0.b.T0)) {
                m37.c cVar10 = m37.d.Companion;
                TextLocalisedClause textLocalisedClause19 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_title_vat_it, null, null, 14);
                TextLocalisedClause textLocalisedClause20 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_payment_breakdown_header_caption_vat_it, null, null, 14);
                cVar10.getClass();
                dVarA = m37.c.a(textLocalisedClause19, textLocalisedClause20);
            }
        }
        return dVarA != null ? new k37.n(dVarA.f202294a, dVarA.f202295b) : k37.o.f180639a;
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        k6f.f fVar = (k6f.f) this.f171859b;
        List disclaimers = (List) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        List list = disclaimers;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj5 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            TextDelegate.Model modelE = ((gah.g) fVar.f181705a).e((rdh.a) obj5, a0.d.n("strategies_allocation_widget_disclaimer_", i), yj0.CENTER_HORIZONTAL, null);
            modelE.f53539n = R$attr.uikit_dp0;
            arrayList.add(modelE);
            i = i2;
        }
        return arrayList;
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        k8g.u uVar = (k8g.u) this.f171859b;
        List transactionsList = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transactionsList, "transactionsList");
        List list = transactionsList;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((pyb.s) uVar.f182153b).e(((r1) it8.next()).f201449a, new TimeClause.Format.Pretty(q0.DATETIME)));
        }
        return d0.E0(!transactionsList.isEmpty() ? u.c(new LargeActionButtonDelegate.Model("TRANSACTIONS_SEE_ALL_BUTTON_ITEM_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), false, null, null, null, null, 1000)) : f0.f322471a, arrayList);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        kcg.d dVar = (kcg.d) this.f171859b;
        List properties = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(properties, "properties");
        if (properties.isEmpty()) {
            return f0.f322471a;
        }
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("PROPERTIES_TOP_DEALS_SUB_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_stays_section_top_deals_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        List<wfi.a> list = properties;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (wfi.a aVar : list) {
            String strQ = j6.a.q("PROPERTIES_TOP_DEALS_ITEM_ID_PREFIX", aVar.f297148a);
            TextClause textClause = new TextClause(aVar.f297149b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            hj hjVar = new hj(2);
            TextClause textClause2 = new TextClause(aVar.f297150c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            UrlImage urlImage = new UrlImage(aVar.d, null, null, null, 0L, null, null, null, null, null, true, new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG), null, null, false, false, 503806);
            dVar.f182730a.getClass();
            zi ziVar = new zi(urlImage, go0.PROGRESSIVE_BLUR);
            PointsRewardRate pointsRewardRate = aVar.e;
            Intrinsics.checkNotNullParameter(pointsRewardRate, "<this>");
            VoucherSmallTileDelegate.Model model2 = new VoucherSmallTileDelegate.Model(strQ, ziVar, textClause, hjVar, null, textClause2, null, null, null, new po0(TagViewData.Companion.e(TagViewData.INSTANCE, h9g.e.h(pointsRewardRate), false, null, 8)), null, false, null, null, aVar, 261072);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model2);
        }
        gg.c cVar = new gg.c(0);
        VoucherSmallTileDelegate.INSTANCE.getClass();
        return v.k(model, new hg("PROPERTIES_TOP_DEALS_SUB_CAROUSEL_ID", arrayList, 2, new y4(VoucherSmallTileDelegate.e), null, cVar, true, false, null, null, 0, 0, 0, 0, 32656));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a7  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r23v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v23 */
    /* JADX WARN: Type inference failed for: r23v24, types: [com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate$a] */
    /* JADX WARN: Type inference failed for: r23v26 */
    /* JADX WARN: Type inference failed for: r23v27 */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r61, java.lang.Object r62, java.lang.Object r63) {
        /*
            Method dump skipped, instruction units count: 3430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j75.i.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ i(Object obj2, int i) {
        this.f171858a = i;
        this.f171859b = obj2;
    }

    public /* synthetic */ i(Object obj2, Object obj3, int i) {
        this.f171858a = i;
        this.f171859b = obj3;
    }
}

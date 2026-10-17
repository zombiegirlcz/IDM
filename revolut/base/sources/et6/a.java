package et6;

import androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.runtime.Composer;
import aw0.n6;
import aw0.na;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.jd;
import com.revolut.core.ui_kit.delegates.kd;
import com.revolut.core.ui_kit.delegates.ra;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit.views.spinnerPicker.SpinnerPickerView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.autopay.models.AccountDetails;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.api.model.PhoneNumber;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import com.revolut.trading.orders.ui.invest.placement.models.FiatExchangeOrderQuoteResult;
import ip0.au;
import ip0.ck0;
import ip0.fl0;
import ip0.t5;
import ip0.yj0;
import ip0.z10;
import ip0.zj;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129185a;

    public /* synthetic */ a(int i) {
        this.f129185a = i;
    }

    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v3 */
    private final Object a(Object obj2, Object obj3, Object obj4) {
        aim.e eVar;
        boolean z;
        RowDelegate.Model model;
        int i;
        ?? r152;
        RowDelegate.Model model2;
        rei.b checkInInstruction = (rei.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(checkInInstruction, "checkInInstruction");
        aim.e eVarB = zhm.u.b();
        String str = checkInInstruction.f253595a.f253593a;
        int i2 = 6;
        boolean z3 = false;
        if (str != null) {
            eVar = eVarB;
            z = false;
            model = new RowDelegate.Model("PHONE_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_call, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, i2), new TextLocalisedClause(R$string.hotels_booking_details_check_in_instructions_call, null, null, 14), null, 0, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new tf(new yy0.h(new TextLocalisedClause(R$string.hotels_common_content_description_copy_to_clipboard, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, str, null, 0, 0, 0, 0, 532675544);
        } else {
            eVar = eVarB;
            z = false;
            model = null;
        }
        String str2 = checkInInstruction.f253595a.f253594b;
        if (str2 != null) {
            i = 14;
            r152 = 0;
            model2 = new RowDelegate.Model("EMAIL_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_mail, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i2), new TextLocalisedClause(R$string.hotels_booking_details_check_in_instructions_email, null, null, 14), null, 0, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new tf(new yy0.h(new TextLocalisedClause(R$string.hotels_common_content_description_copy_to_clipboard, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, str2, null, 0, 0, 0, 0, 532675544);
        } else {
            i = 14;
            r152 = 0;
            model2 = null;
        }
        RowDelegate.Model[] elements = {model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        aim.e eVar2 = eVar;
        eVar2.addAll(listL);
        if (!kotlin.text.d0.W(checkInInstruction.f253596b)) {
            RowDelegate.Model model3 = new RowDelegate.Model("MESSAGE_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_message, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i2), new TextLocalisedClause(R$string.hotels_booking_details_check_in_instructions_message, r152, r152, i), null, 0, new HtmlClause(0, 30, (Integer) null, (Object) null, checkInInstruction.f253596b), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            eVar2.add(model3);
        }
        return zhm.u.a(eVar2);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        List listG;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.isEmpty()) {
            listG = zhm.f0.f322471a;
        } else {
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("new_account_header_list_id", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_loan_autopay_external_account_list_accounts_header, null, null, 14), (ResourceImage) null, false, false, (Clause) null, false, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 262010);
            List<AccountDetails.LinkedAccount> list = content;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (AccountDetails.LinkedAccount linkedAccount : list) {
                Image image = linkedAccount.e;
                xi0.b bVar = linkedAccount.f68542c;
                arrayList.add(new RowDelegate.Model("linked_account_item_list_id", image, null, null, new TextClause(linkedAccount.f68540a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_autopay_external_account_details, zhm.v.k(bVar.f306286a, linkedAccount.d), null, 12), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(linkedAccount.f68541b.i, bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, false, null, null, null, null, null, linkedAccount, null, 0, 0, 0, 0, 1056962412));
            }
            listG = yp0.b.g(arrayList, model, yp0.e0.OUTSIDE_BOX, 0, 0, 124);
        }
        return new fk4.j(listG);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) throws Throwable {
        int i;
        Clause textLocalisedClause;
        int i2 = 2;
        int iC = 0;
        Clause textClause = null;
        tradingAccount = null;
        TradingAccount tradingAccount = null;
        switch (this.f129185a) {
            case 0:
                FreelancerAccountOnboardingState content = (FreelancerAccountOnboardingState) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                Intrinsics.checkNotNullParameter(content, "<this>");
                return Boolean.valueOf((content instanceof FreelancerAccountOnboardingState.Onboarded) && ((FreelancerAccountOnboardingState.Onboarded) content).f73273a.f73270b.f73321a);
            case 1:
                eu4.g content2 = (eu4.g) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                eu4.f fVar = content2.f129505a;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_payment_options_title, null, null, 14);
                if (fVar instanceof eu4.e) {
                    i = com.revolut.feature.credit.core.R$string.credit_statement_statement_balance;
                } else {
                    if (!(fVar instanceof eu4.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = com.revolut.feature.credit.core.R$string.credit_card_switcher_cell_accessory_subtitle_current_balance;
                }
                eu4.x xVar = new eu4.x(textLocalisedClause2, new CompositeClause(zhm.v.k(new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, fVar.f())), new DotDividerClause(Integer.valueOf(R$attr.uikit_colorForeground)), null, null, 12), new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
                List<eu4.m> list = content2.f129506b;
                aim.e eVarB = zhm.u.b();
                for (eu4.m mVar : list) {
                    if (mVar instanceof eu4.j) {
                        dj0.d dVar = ((eu4.j) mVar).f129509a;
                        ProductSelectionDelegate.Model model = new ProductSelectionDelegate.Model("id_payment_options_revolut_account", eu4.d0.a(R$drawable.uikit_icn_24_revolut), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_payment_options_revolut_account_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_payment_options_revolut_account_description, zhm.v.k(new CurrencyClause(dVar.f115083b, CurrencyClause.Format.Ticker.f57756a, null, 4), sx4.f.b(3, null, null, dVar)), null, 12), null, null, null, false, false, false, 1008);
                        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                        eVarB.add(model);
                    } else if (mVar instanceof eu4.k) {
                        ProductSelectionDelegate.Model model2 = new ProductSelectionDelegate.Model("id_payment_options_spei", eu4.d0.a(R$drawable.uikit_icn_24_arrow_right_left), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_payment_options_spei_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_payment_options_spei_description, null, null, 14), null, null, null, false, false, false, 1008);
                        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                        eVarB.add(model2);
                    } else if (mVar instanceof eu4.h) {
                        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_payment_options_boleto_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_payment_options_boleto_description, null, null, 14);
                        dc dcVarA = eu4.d0.a(R$drawable.uikit_icn_24_scan_card);
                        boolean z = ((eu4.h) mVar).f129507a;
                        ProductSelectionDelegate.Model model3 = new ProductSelectionDelegate.Model("id_payment_options_boleto", dcVarA, textLocalisedClause3, textLocalisedClause4, null, null, null, false, z, z, 240);
                        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                        eVarB.add(model3);
                    } else if (mVar instanceof eu4.l) {
                        eu4.l lVar = (eu4.l) mVar;
                        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_payment_options_statement_financing_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_payment_options_statement_financing_description, null, null, 14);
                        dc dcVarA2 = eu4.d0.a(R$drawable.uikit_icn_24_refinancing);
                        boolean z3 = lVar.f129511a;
                        ql4.o0 o0Var = lVar.f129513c;
                        ProductSelectionDelegate.Model model4 = new ProductSelectionDelegate.Model("ID_PAYMENT_STATEMENT_FINANCING", dcVarA2, textLocalisedClause5, textLocalisedClause6, null, z3 ? eu4.w.f129521a : o0Var == ql4.o0.INSUFFICIENT_REMAINING_STATEMENT_BALANCE ? new eu4.v(lVar.f129512b) : null, null, false, z3 || o0Var == ql4.o0.INSUFFICIENT_REMAINING_STATEMENT_BALANCE, z3, 208);
                        yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                        eVarB.add(model4);
                    } else {
                        if (!(mVar instanceof eu4.i)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ProductSelectionDelegate.Model model5 = new ProductSelectionDelegate.Model("id_payment_options_pse", eu4.d0.a(R$drawable.uikit_icn_24_pse), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_payment_options_pse_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_payment_options_pse_description, null, null, 14), null, null, null, false, true, true, 240);
                        yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
                        eVarB.add(model5);
                    }
                }
                return new eu4.a0(xVar, zhm.u.a(eVarB));
            case 2:
                d0j.k content3 = (d0j.k) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content3, "content");
                d0j.i iVar = content3.f110416l;
                String str = iVar != null ? iVar.f110406a : null;
                String str2 = iVar != null ? iVar.f110407b : null;
                Pair pair = (str == null || str2 == null) ? new Pair(null, null) : new Pair(new PromptMarketingContentDelegate.Model.Button((Clause) new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), new euj.o(str2));
                return new euj.l(zhm.u.c(new PromptMarketingContentDelegate.Model(content3.f110410a, new TextClause(content3.f110412c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(content3.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(new UrlImage(content3.f, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), textClause, jd.BOTTOM, i2), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, kd.HIGH_CONTRAST, (PromptMarketingContentDelegate.Model.Button) pair.f186385a, null, null, content3.k ? new PromptMarketingContentDelegate.Model.Footer(new TextLocalisedClause(com.revolut.retail.feature.api.rewards_hub.R$string.rewards_hub_challenge_details_eligibility_criteria_footer_disclaimer_terms, zhm.u.c(new TextLocalisedClause(com.revolut.retail.feature.api.rewards_hub.R$string.rewards_hub_challenge_details_header_eligibility_link, null, new Click(30, (Integer) null, (Object) null, "ELIGIBILITY_CLICK_ITEM_ID", false), 10)), null, 12)) : null, (euj.o) pair.f186386b, null, null, null, null, null, null, null, 2084016)), false);
            case 3:
                yhm.r rVar = (yhm.r) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                aul.b bVar = (aul.b) rVar.f314201a;
                nel.n nVar = (nel.n) rVar.f314202b;
                k4l.e0 e0Var = (k4l.e0) rVar.f314203c;
                bVar.getClass();
                if (bVar == aul.b.SECURITY) {
                    nel.z zVar = nVar.f214597c;
                    if (io3.h.i(zVar)) {
                        textLocalisedClause = e0Var.a() ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_order_edit_number_of_lots, null, null, 14) : new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_order_edit_number_of_units, null, null, 14);
                    } else if (io3.h.l(zVar) || nVar.c()) {
                        textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_order_edit_number_of_shares, null, null, 14);
                    } else if (io3.h.o(zVar)) {
                        textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_order_edit_number_of_notes, null, null, 14);
                    } else {
                        Clause[] elements = {new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_order_edit_number_of_shares, null, null, 14), new ImageClause(R$drawable.uikit_icn_24_info_outline, Integer.valueOf(R$attr.uikit_colorForeground), (Float) null, (Float) null, 28)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        textLocalisedClause = CompositeClause.a(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements)), null, new Click(12, Integer.valueOf(R$attr.uikit_colorForeground), (Object) cul.t.f109168a, "CLICK_ID_AMOUNT_TOP_LABEL", false), 11);
                    }
                    textClause = textLocalisedClause;
                }
                if (textClause == null) {
                    m70.a.c(kotlin.jvm.internal.t0.f186434a);
                    textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                return textClause;
            case 4:
                vf0.h hVar = (vf0.h) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                aul.b bVar2 = (aul.b) hVar.f288433a;
                Asset asset = (Asset) hVar.f288434b;
                nel.n nVar2 = (nel.n) hVar.f288435c;
                k4l.e0 e0Var2 = (k4l.e0) hVar.d;
                nel.z zVar2 = nVar2.f214597c;
                int[] iArr = eul.b.f129631a;
                int i3 = iArr[bVar2.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iC = asset.f104721c.c();
                } else if (!io3.h.i(zVar2) || !e0Var2.a()) {
                    iC = nVar2.f214602m;
                }
                int i5 = iArr[bVar2.ordinal()];
                aul.f eVar = aul.d.f9863a;
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (io3.h.i(zVar2) && e0Var2.a()) {
                    eVar = new aul.e(e0Var2.b());
                }
                return new cul.s(asset, iC, eVar);
            case 5:
                FiatExchangeOrderQuoteResult fiatExchangeOrderQuoteResult = (FiatExchangeOrderQuoteResult) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(fiatExchangeOrderQuoteResult, "fiatExchangeOrderQuoteResult");
                AssetClause assetClauseA = e4i.c.a(qcf.a.b(fiatExchangeOrderQuoteResult.f106843b), null, null, null, null, o9.NON_SENSITIVE, 31);
                int i6 = R$drawable.uikit_icn_16_info_outline;
                Integer numValueOf = Integer.valueOf(R$attr.uikit_colorGreyTone50);
                Float fValueOf = Float.valueOf(12.0f);
                return new bw0.m(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(assetClauseA, new ImageClause(i6, numValueOf, fValueOf, fValueOf, 16))), bw0.l.ACTION_INFO, null, true, cul.y.f109206a, 4);
            case 6:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj3).booleanValue();
                return zBooleanValue ? mx0.h3.ERROR : mx0.h3.ACTIVE;
            case 7:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                ((Boolean) obj3).booleanValue();
                return bool;
            case 8:
                List availableOrderTypes = (List) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(availableOrderTypes, "availableOrderTypes");
                if (availableOrderTypes.size() > 1) {
                    return cul.e0.f109091a;
                }
                return null;
            case 9:
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                return zhm.f0.f322471a;
            case 10:
                dj0.d content4 = (dj0.d) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content4, "content");
                return zhm.u.c(new fl0(new na(new TextLocalisedClause(com.revolut.retail.feature.trading_onboarding.impl.R$string.wealth_trading_free_stocks_select_header_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.trading_onboarding.impl.R$string.wealth_trading_free_stocks_select_header_subtitle, zhm.u.c(new MoneyClause(content4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12)), "TITLE_LIST_ID"));
            case 11:
                List content5 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content5, "content");
                if (content5.size() < 3) {
                    hx7.e.n(new IllegalStateException(a0.d.n("Instruments size should be >= 3. actual size = ", content5.size())));
                    return null;
                }
                int size = content5.size() / 3;
                int size2 = content5.size() % 3;
                ArrayList arrayList = new ArrayList();
                int i21 = 0;
                int i22 = 0;
                for (int i32 = 3; i21 < i32; i32 = 3) {
                    int i33 = (i21 < size2 ? size + 1 : size) + i22;
                    arrayList.add(content5.subList(i22, i33));
                    i21++;
                    i22 = i33;
                }
                return new com.revolut.core.ui_kit.views.spinnerPicker.a(ezk.d.a(0, (List) arrayList.get(0)), ezk.d.a(1, (List) arrayList.get(1)), ezk.d.a(2, (List) arrayList.get(2)), SpinnerPickerView.b.C0446b.f59704a, ey0.f.START);
            case 12:
                return ComposableSingletons$ContextMenuUiKt.lambda__1455401925$lambda$0((ContextMenuColors) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 13:
                od0.i content6 = (od0.i) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content6, "content");
                od0.h hVar2 = od0.i.Companion;
                TradingAccount tradingAccount2 = (TradingAccount) content6.f224257a;
                if (tradingAccount2 != null && (tradingAccount2.W() instanceof TradingAccountType.Gia)) {
                    tradingAccount = tradingAccount2;
                }
                hVar2.getClass();
                return od0.h.a(tradingAccount);
            case 14:
                l7g.a0 bookings = (l7g.a0) obj2;
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                Throwable th10 = (Throwable) obj4;
                Intrinsics.checkNotNullParameter(bookings, "bookings");
                if (zBooleanValue2 && bookings.f192583a.isEmpty() && bookings.f192584b.isEmpty()) {
                    return f5g.a.b();
                }
                ArrayList arrayList2 = bookings.f192583a;
                ArrayList arrayList3 = bookings.f192584b;
                if (arrayList2.isEmpty() && th10 != null) {
                    return zhm.d0.E0(f5g.n.a(!arrayList3.isEmpty()), q4g.b.a(4, "TRAVEL_FLIGHTS_BOOKINGS_ERROR", true));
                }
                if (!arrayList2.isEmpty()) {
                    return zhm.d0.E0(f5g.n.a(!arrayList3.isEmpty()), f5g.a.a(arrayList2));
                }
                if (arrayList3.isEmpty()) {
                    FullScreenStateDelegate.Model model6 = new FullScreenStateDelegate.Model("TRAVEL_FLIGHTS_BOOKINGS_EMPTY", new TextLocalisedClause(com.revolut.feature.travel.core.api.R$string.travel_tab_bookings_empty_state_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_bookings_empty_state_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D103", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.feature.travel.core.api.R$string.travel_tab_bookings_empty_state_action_title, null, null, 14), false, null, null, false, 0, 0, 31680);
                    yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
                    return zhm.u.c(model6);
                }
                FullScreenStateDelegate.Model model7 = new FullScreenStateDelegate.Model("TRAVEL_FLIGHTS_BOOKINGS_PAST_OR_CANCELLED", new TextLocalisedClause(com.revolut.feature.travel.core.api.R$string.travel_tab_bookings_empty_state_title_upcoming, null, null, 14), new TextLocalisedClause(com.revolut.feature.travel.core.api.R$string.travel_tab_bookings_empty_state_subtitle_upcoming, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D103", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.feature.travel.core.api.R$string.travel_tab_bookings_empty_state_action_title_past_and_cancelled, null, null, 14), false, null, null, false, 0, 0, 31680);
                yp0.b.l(model7, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(model7);
            case 15:
                Map content7 = (Map) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(content7, "content");
                return zhm.d0.d1(content7.values());
            case 16:
                n71.b content8 = (n71.b) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content8, "content");
                aim.e eVarB2 = zhm.u.b();
                eVarB2.add(new ListSubheaderDelegate.Model("TITLE_WIDGET_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.direct_deposit.impl.R$string.direct_deposit_transfer_local, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(com.revolut.feature.direct_deposit.impl.R$string.direct_deposit_share, null, null, 14), true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946));
                String str3 = content8.i;
                String str4 = content8.f212983p;
                t5 t5Var = new t5("BENEFICIARY_NAME_ID", new TextClause(str3 == null ? "" : str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.direct_deposit.impl.R$string.direct_deposit_beneficiary, null, null, 14), content8.i, null, null, 0, 0, 0, 0, 2024);
                String str5 = content8.d;
                t5[] elements2 = {t5Var, new t5("ACCOUNT_NUMBER_ID", new TextClause(str5 == null ? "" : str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.direct_deposit.impl.R$string.direct_deposit_account, null, null, 14), content8.d, null, null, 0, 0, 0, 0, 2024), (str4 == null || str4.length() == 0) ? null : new t5("ACH_ROUTING_NUMBER", new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.direct_deposit.impl.R$string.direct_deposit_achRoutingNumber, null, null, 14), content8.f212983p, null, null, 0, 0, 0, 0, 2024)};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                List listL = kotlin.collections.d.L(elements2);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                eVarB2.addAll(listL);
                TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.feature.direct_deposit.impl.R$string.direct_deposit_assistant_title_text, null, null, 14);
                TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(com.revolut.feature.direct_deposit.impl.R$string.direct_deposit_assistant_description_text, null, null, 14);
                z10 z10Var = sa.Companion;
                ResourceImage resourceImage = w01.h.f293612a;
                Intrinsics.checkNotNullParameter(z10Var, "<this>");
                sa saVar = new sa("DIRECT_DEPOSIT_ACTION_ID", textLocalisedClause7, textLocalisedClause8, new ra(new TextLocalisedClause(com.revolut.feature.direct_deposit.impl.R$string.direct_deposit_send_to_employer_button, null, null, 14)), w01.h.f293612a, 8080);
                yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(saVar);
                j8 j8Var = new j8(new ResourceImage(R$drawable.uikit_icn_24_lightbulb, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
                TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(com.revolut.feature.direct_deposit.impl.R$string.direct_deposit_bank_details_local_info_USA, null, null, 14);
                au auVar = au.SMALL;
                List listK = zhm.v.k(new ListCellDelegate.Model("BANK_DETAILS_TOOLTIP_ID", j8Var, textLocalisedClause9, auVar, null, false, null, null, 0, 0, 0, 0, 524272), content8.v == null ? new ListCellDelegate.Model("WIRES_TOOLTIP_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_flag, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(com.revolut.feature.direct_deposit.impl.R$string.direct_deposit_bank_details_wiresAndDebits, null, null, 14), auVar, null, false, null, null, 0, 0, 0, 0, 524272) : new ListCellDelegate.Model("FEDWIRE_TOOLTIP_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(com.revolut.feature.direct_deposit.impl.R$string.direct_deposit_bank_details_ach_transfers_time, null, null, 14), auVar, null, false, null, null, 0, 0, 0, 0, 524272));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB2.addAll(listK);
                return zhm.u.a(eVarB2);
            case 17:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                ((Boolean) obj3).getClass();
                RowDelegate.Model modelA = !zBooleanValue3 ? f9a.l.a("list_id_document", R$drawable.uikit_icn_24_national_id, com.revolut.feature.pix.impl.R$string.pix_key_document, AliasRegistrationType.UserDocument.f80394a) : null;
                int i43 = R$drawable.uikit_icn_24_smartphone;
                int i59 = com.revolut.feature.pix.impl.R$string.pix_key_phone;
                fj0.b.Companion.getClass();
                Serializable serializableA = fj0.a.a(55);
                yhm.o.b(serializableA);
                RowDelegate.Model[] elements3 = {modelA, f9a.l.a("list_id_phone", i43, i59, new AliasRegistrationType.Phone(new PhoneNumber(((fj0.b) serializableA).f135518a, ""), null)), f9a.l.a("list_id_email", R$drawable.uikit_icn_24_envelope, com.revolut.feature.pix.impl.R$string.pix_key_email, new AliasRegistrationType.Email(null, null)), f9a.l.a("list_id_random_key", R$drawable.uikit_icn_24_avatar_grid, com.revolut.feature.pix.impl.R$string.pix_key_random, AliasRegistrationType.RandomKey.f80393a)};
                Intrinsics.checkNotNullParameter(elements3, "elements");
                List listL2 = kotlin.collections.d.L(elements3);
                yp0.b.k(listL2, 0, 0, 0, 0, 31);
                return listL2;
            case 18:
                TradingAccounts content9 = (TradingAccounts) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content9, "content");
                List list2 = content9.f105278a;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList4.add(((TradingAccount) it8.next()).J());
                }
                ArrayList arrayListU = zhm.w.u(arrayList4);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : arrayListU) {
                    TradingAccount.Portfolio portfolio = (TradingAccount.Portfolio) obj5;
                    Intrinsics.checkNotNullParameter(portfolio, "<this>");
                    switch (com.revolut.shared.feature.wealth.models.trading_accounts.c.f105338a[portfolio.f105211b.ordinal()]) {
                        case 1:
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            arrayList5.add(obj5);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                Iterator it9 = arrayList5.iterator();
                while (it9.hasNext()) {
                    arrayList6.add(((TradingAccount.Portfolio) it9.next()).f105210a.toString());
                }
                return arrayList6;
            case 19:
                qa6.f exchangeQuote = (qa6.f) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(exchangeQuote, "exchangeQuote");
                aim.e eVarB3 = zhm.u.b();
                int i66 = R$drawable.uikit_icn_16_info_outline;
                ImageClauseTint.Color color = new ImageClauseTint.Color(R$attr.uikit_colorGreyTone50);
                Float fValueOf2 = Float.valueOf(12.0f);
                eVarB3.add(new ImageClause(i66, color, fValueOf2, fValueOf2, 16));
                eVarB3.add(new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_amount_input_auxiliary_text_charity_gets_template, zhm.u.c(new MoneyClause(exchangeQuote.f243968a.f71967a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12));
                return new TextDelegate.Model("ID_DISCLAIMER_TEXT", yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.u.a(eVarB3)), true, new ck0(yj0.CENTER_HORIZONTAL), exchangeQuote, null, R$attr.uikit_dp8, R$attr.uikit_dp0, 0, 0, 1616);
            case 20:
                return a(obj2, obj3, obj4);
            case 21:
                JuniorBankingProfile juniorProfile = (JuniorBankingProfile) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
                return juniorProfile.f77099b;
            case 22:
                of8.b products = (of8.b) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(products, "products");
                return Boolean.valueOf(i2b.a.h(products.f224753j));
            case 23:
                JuniorBankingProfile juniorProfile2 = (JuniorBankingProfile) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(juniorProfile2, "juniorProfile");
                return juniorProfile2;
            case 24:
                RemoteLoginInvitation remoteLoginInvitation = (RemoteLoginInvitation) obj2;
                ((Boolean) obj3).booleanValue();
                return remoteLoginInvitation;
            case 25:
                xg3.c detailsContent = (xg3.c) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(detailsContent, "detailsContent");
                xg3.m mVar2 = detailsContent.f305486c;
                if (mVar2 == null) {
                    return null;
                }
                return new aw0.e(false, null, null, new n6(new TextClause(mVar2.f305496a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.f58725a, null, j6.a.q("PRIMARY_ACTION_TAG_PREFIX_", mVar2.f305496a), false, null, mVar2, 492), null, null, 55);
            case 26:
                m1c.x content10 = (m1c.x) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content10, "content");
                return new LabelNavBarMenuItem("REV_POINTS_MENU_ITEM", new ResourceImage(R$drawable.uikit_icn_24_rev_points, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), v1.c.g(0, content10.f201472c, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 4), null, null, 504);
            case 27:
                return b(obj2, obj3, obj4);
            case 28:
                zh9.r0 plan = (zh9.r0) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(plan, "plan");
                ArrayList instalments = plan.B;
                Intrinsics.checkNotNullParameter(plan, "plan");
                Intrinsics.checkNotNullParameter(instalments, "instalments");
                List listP0 = zhm.d0.P0(instalments, new vi9.x());
                ArrayList arrayList7 = new ArrayList(zhm.w.t(listP0, 10));
                for (Object obj6 : listP0) {
                    int i74 = iC + 1;
                    if (iC < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    arrayList7.add(vi9.z.a(plan, (zh9.p) obj6, iC, zhm.v.j(instalments)));
                    iC = i74;
                }
                yp0.b.k(arrayList7, 0, 0, 0, 0, 31);
                return arrayList7;
            default:
                List content11 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content11, "content");
                alc.d dVar2 = (alc.d) zhm.d0.d0(content11);
                List listV = zhm.d0.V(content11, 1);
                if (dVar2 != null) {
                    return new fnc.p(new TextLocalisedClause(boc.b.a(dVar2).f127286b, null, null, 10), !listV.isEmpty());
                }
                return null;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f129185a = i;
    }
}

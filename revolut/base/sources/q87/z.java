package q87;

import android.os.Parcelable;
import aw0.o9;
import cfl.f0;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.models.openbanking.ConsentType;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import com.revolut.domain.models.openbanking.OutboundOpenBankingClient;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.CreditCardRepayPaymentAmountScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.OpenBankingConsentsFlowContract$FlowType;
import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.domain.models.ramp.RampOrderDetails;
import com.revolut.feature.robo.api.model.RiskMetrics;
import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.GroupDetailsScreenContract$InputData;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$FlowState;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.crypto.CryptoHeaderData;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.SimpleTotalValueChart;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetConfig;
import com.revolut.retail.wealth.resources.R$plurals;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.portfolio.TradingOnboardingStatus;
import com.revolut.tracking.v3.InvestNewOrderPriceSetContext;
import com.revolut.trading.orders.ui.invest.placement.models.TargetPriceInputValue;
import d9.e1;
import dx4.g2;
import grl.b6;
import grl.d6;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import jel.a2;
import jel.w2;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.h4;
import mx0.f3;
import mx0.h3;
import org.joda.time.DateTime;
import qoc.s0;
import ru9.l0;
import tx0.r2;
import vrl.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f243041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f243042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f243043c;

    public /* synthetic */ z(Object obj2, Object obj3, int i) {
        this.f243041a = i;
        this.f243042b = obj2;
        this.f243043c = obj3;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        qce.d dVar = (qce.d) this.f243042b;
        k71.q qVar = (k71.q) this.f243043c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        return dVar.b((List) pair.f186385a, (List) pair.f186386b, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v0 qdk.r0, still in use, count: 5, list:
          (r5v0 qdk.r0) from 0x0383: MOVE (r20v8 qdk.r0) = (r5v0 qdk.r0)
          (r5v0 qdk.r0) from 0x028e: MOVE (r20v9 qdk.r0) = (r5v0 qdk.r0)
          (r5v0 qdk.r0) from 0x0286: MOVE (r20v10 qdk.r0) = (r5v0 qdk.r0)
          (r5v0 qdk.r0) from 0x025f: MOVE (r20v12 qdk.r0) = (r5v0 qdk.r0)
          (r5v0 qdk.r0) from 0x01d7: MOVE (r20v15 qdk.r0) = (r5v0 qdk.r0)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object b(java.lang.Object r60, java.lang.Object r61, java.lang.Object r62) {
        /*
            Method dump skipped, instruction units count: 2828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q87.z.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        boolean z;
        pf4.s sVarA;
        qf4.g gVar = (qf4.g) this.f243042b;
        pf4.e eVar = (pf4.e) this.f243043c;
        cv3.s content = (cv3.s) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        pf4.b bVar = gVar.f245241b;
        cv3.r rVar = content.f109267a;
        String str = content.d;
        cv3.q qVar = rVar instanceof cv3.q ? (cv3.q) rVar : null;
        if (qVar == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "BigTileOfferContentStateMapper", "Unsupported header " + rVar, null, h0Var);
            qVar = null;
        }
        if (qVar != null) {
            ResourceImage resourceImageA = q74.b.a(bVar.f235433b.f68136g);
            TextLocalisedClause textLocalisedClauseE = pf4.b.e(qVar.f109264a);
            String str2 = qVar.f109265b;
            z = zBooleanValue;
            sVarA = new pf4.s(resourceImageA, textLocalisedClauseE, str2 != null ? new TextLocalisedClause(R$string.credit_application_offer_description, zhm.u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null, new UrlImage(qVar.d, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), new r2(new TextLocalisedClause(R$string.credit_application_mortgage_offer_offer_tag, zhm.u.c(new TextClause(qVar.f109266c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), Integer.valueOf(R$drawable.uikit_icn_24_time)), pf4.b.d(qVar.e));
        } else {
            z = zBooleanValue;
            sVarA = bVar.a();
        }
        return new pf4.u(bVar.c(content, eVar.f235435a), sVarA, z, str != null ? new TextLocalisedClause(R$string.credit_application_offer_action, zhm.u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null, str != null, 80);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        List list;
        NavBarWithContainerBackground navBarWithContainerBackground;
        List listC;
        qje.v vVar = (qje.v) this.f243042b;
        uje.a aVar = vVar.f246858a;
        TabCryptoFlowContract$FlowState tabCryptoFlowContract$FlowState = (TabCryptoFlowContract$FlowState) this.f243043c;
        CryptoHeaderData headerData = (CryptoHeaderData) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        if (headerData.f == yh5.a.ENABLED_AND_ONBOARDED || headerData.f89822h) {
            ake.a aVar2 = tabCryptoFlowContract$FlowState.f89789a;
            List list2 = aVar2.f5803b;
            SimpleTotalValueChart simpleTotalValueChart = aVar2.f;
            AccountSelectionNavBarContentView.b bVar = aVar2.f5805g;
            ChosenBackground chosenBackground = aVar2.f5804c;
            if (chosenBackground != null) {
                navBarWithContainerBackground = chosenBackground.f63742b;
                list = list2;
            } else {
                list = list2;
                navBarWithContainerBackground = null;
            }
            listC = zhm.u.c(aVar.b(headerData, list, simpleTotalValueChart, bVar, navBarWithContainerBackground));
        } else {
            ChosenBackground chosenBackground2 = tabCryptoFlowContract$FlowState.f89789a.f5804c;
            listC = zhm.u.c(aVar.d(chosenBackground2 != null ? chosenBackground2.f63742b : null));
        }
        List list3 = listC;
        ake.a aVar3 = tabCryptoFlowContract$FlowState.f89789a;
        qje.o oVar = tabCryptoFlowContract$FlowState.f89790b;
        return new qje.p(((kbb.f) vVar.f246859b).b(oVar.f246841b), list3, aVar3.d, tabCryptoFlowContract$FlowState.f89789a.e.f263435a, oVar.f246842c, oVar.d);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        qjk.h hVar = (qjk.h) this.f243042b;
        qjk.c cVar = (qjk.c) this.f243043c;
        PricingPlanBottomSheetConfig content = (PricingPlanBottomSheetConfig) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return hVar.f246905a.b(content.f102815c, cVar.f246897b);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        int i;
        Clause clauseB;
        TextLocalisedClause textLocalisedClause;
        ql6.v vVar = (ql6.v) this.f243042b;
        ql6.m mVar = (ql6.m) this.f243043c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List list = (List) pair.f186385a;
        List list2 = (List) pair.f186386b;
        OutboundOpenBankingClient outboundOpenBankingClient = mVar.f247211a;
        aim.e eVarB = zhm.u.b();
        ArrayList<OpenBankingConsent> arrayList = new ArrayList();
        for (Object obj5 : list) {
            OpenBankingConsent openBankingConsent = (OpenBankingConsent) obj5;
            if (openBankingConsent instanceof OpenBankingConsent.Australia) {
                if (((OpenBankingConsent.Australia) openBankingConsent).f == OpenBankingConsent.Australia.ConsentState.ACTIVE) {
                }
            } else if (!(openBankingConsent instanceof OpenBankingConsent.Default)) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(obj5);
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (OpenBankingConsent openBankingConsent2 : arrayList) {
            String f60382a = openBankingConsent2.getF60382a();
            TextLocalisedClause textLocalisedClauseD = ql6.v.d(openBankingConsent2);
            if (openBankingConsent2 instanceof OpenBankingConsent.Australia) {
                OpenBankingConsent.Australia australia = (OpenBankingConsent.Australia) openBankingConsent2;
                ConsentType consentType = australia.f60376b;
                DateTime dateTime = australia.f60378g;
                DateTime dateTime2 = australia.f60377c;
                Long lValueOf = dateTime2 != null ? Long.valueOf(dateTime2.getMillis()) : null;
                if (dateTime == null || lValueOf == null) {
                    textLocalisedClause = lValueOf != null ? new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_banking_consents_expiry_format, zhm.u.c(new TimeClause(lValueOf.longValue(), new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, null, 12)), null, 12) : consentType == ConsentType.ACCOUNTS ? new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_banking_consents_type_account, null, null, 14) : consentType == ConsentType.PAYMENTS ? new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_banking_consents_type_payment, null, null, 14) : consentType == ConsentType.FUND_CONFIRMATIONS ? new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.consent_fund_confirmations_title, null, null, 14) : null;
                } else {
                    int i2 = com.revolut.feature.external_accounts.impl.R$string.open_banking_consents_valid_range_format;
                    long millis = dateTime.getMillis();
                    n0 n0Var = n0.HIDE_CURRENT_YEAR;
                    textLocalisedClause = new TextLocalisedClause(i2, zhm.v.k(new TimeClause(millis, new TimeClause.Format.DateMedium(n0Var), null, null, 12), new TimeClause(lValueOf.longValue(), new TimeClause.Format.DateMedium(n0Var), null, null, 12)), null, 12);
                }
                clauseB = gl6.a.a(textLocalisedClause, australia);
            } else {
                if (!(openBankingConsent2 instanceof OpenBankingConsent.Default)) {
                    throw new NoWhenBranchMatchedException();
                }
                clauseB = ql6.v.b((OpenBankingConsent.Default) openBankingConsent2);
            }
            arrayList2.add(new RowDelegate.Model(f60382a, ql6.v.a(openBankingConsent2.getF60383b(), outboundOpenBankingClient.getF60400c()), textLocalisedClauseD, null, 0, clauseB, null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.consent_action_revoke, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, openBankingConsent2, null, 0, 0, 0, 0, 532675544));
        }
        eVarB.addAll(yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("ALLOWED_ACCESS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.consent_allow_access, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65528), null, 0, 0, 126));
        if (!list2.isEmpty()) {
            OpenBankingConsentsFlowContract$FlowType openBankingConsentsFlowContract$FlowType = vVar.f247220a.f72782b;
            if (Intrinsics.f(openBankingConsentsFlowContract$FlowType, OpenBankingConsentsFlowContract$FlowType.Default.f72742a)) {
                i = com.revolut.feature.external_accounts.impl.R$string.open_banking_consents_application_access_inactive_authorisations;
            } else {
                if (!Intrinsics.f(openBankingConsentsFlowContract$FlowType, OpenBankingConsentsFlowContract$FlowType.Australia.f72741a)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = com.revolut.feature.external_accounts.impl.R$string.open_banking_consents_application_access_authorisation_history;
            }
            CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("INACTIVE_CONSENTS_LIST_ID", new TextLocalisedClause(i, null, null, 14), 0, false, null, null, null, 2044);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
        }
        return zhm.u.a(eVarB);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        RowDelegate.Model model;
        qn9.o oVar = (qn9.o) this.f243042b;
        qn9.f fVar = (qn9.f) this.f243043c;
        mn9.a paymentDetails = (mn9.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        TextClause textClause = new TextClause(paymentDetails.f207487a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = paymentDetails.f207488b;
        UrlImage urlImage = str != null ? new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : null;
        ArrayList arrayList = new ArrayList();
        w80.b bVar = oVar.f247889a;
        long j2 = fVar.f247880b;
        dj0.d.Companion.getClass();
        String strE = bVar.e(new dj0.d(j2, dj0.d.f115081c));
        xi0.b bVar2 = fVar.f247879a;
        String strJ = cp5.d.J(bVar2);
        String str2 = bVar2.f306286a;
        bw0.h hVar = new bw0.h(strE, strJ, null, true, null, Boolean.TRUE, false, false, bw0.e.Calculator, null, null, null, 31700);
        bw0.m mVar = new bw0.m(new TextLocalisedClause(com.revolut.feature.payinstore.impl.R$string.retail_pay_in_store_flow_payment_screen_home_cell_amount_entry_subtitle_cashback, zhm.u.c(Integer.valueOf(paymentDetails.f207489c)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), bw0.l.INFO, null, false, null, 28);
        Custom custom = knm.b.m(fVar) ? null : new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254);
        CurrencyImage currencyImage = new CurrencyImage(str2, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        io3.d dVarU = knm.b.u(fVar);
        String str3 = dVarU != null ? dVarU.d : null;
        if (str3 == null) {
            str3 = "";
        }
        TextClause textClause2 = new TextClause(str3, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
        io3.d dVarU2 = knm.b.u(fVar);
        long j3 = dVarU2 != null ? dVarU2.i : 0L;
        xi0.b.Companion.getClass();
        arrayList.add(new CenteredAmountDelegate.Model("AMOUNT_EDIT_DELEGATE_LIST_ID", null, hVar, new f3(currencyImage, textClause2, new MoneyClause(new dj0.d(j3, xi0.a.a(str2)), new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, null, 8), true, h3.ACTIVE, true), mVar, null, null, false, false, new qn9.e(((s80.b) oVar.f247890b).b(), bVar2), null, 1506));
        if (knm.b.m(fVar)) {
            model = null;
        } else {
            RowDelegate.Model model2 = new RowDelegate.Model("INSUFFICIENT_FUNDS_LIST_ID", null, new TextLocalisedClause(com.revolut.feature.payinstore.impl.R$string.retail_pay_in_store_flow_payment_screen_home_cell_insufficient_funds_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.payinstore.impl.R$string.retail_pay_in_store_flow_payment_screen_home_cell_insufficient_funds_subtitle, null, null, 14), null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.payinstore.impl.R$string.retail_pay_in_store_flow_payment_screen_home_footer_button_add_money_title, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869850);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            model = model2;
        }
        if (model != null) {
            arrayList.add(model);
        }
        Unit unit = Unit.f186387a;
        return new qn9.m(textClause, urlImage, arrayList, fVar.f247880b > 0 && knm.b.m(fVar), new TextLocalisedClause(com.revolut.feature.payinstore.impl.R$string.retail_pay_in_store_common_action_pay, null, null, 14));
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        s0 s0Var = (s0) this.f243042b;
        jlc.r rVar = (jlc.r) this.f243043c;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((alc.j) obj2, "<unused var>");
        TreeMap treeMapE = q0.e(rVar.k);
        LocalDate localDate = rVar.f175702j;
        List listA = (localDate == null || treeMapE.isEmpty()) ? f0.f322471a : s0Var.f248148b.a(rVar.f175697a, treeMapE, rVar.f175704m, rVar.i, localDate, null, null, rVar.f175703l, rVar.f);
        if (listA.isEmpty()) {
            return f0.f322471a;
        }
        List listB = s0Var.b(rVar);
        if (listB == null) {
            listB = f0.f322471a;
        }
        Data data = rVar.o;
        List list = data != null ? (List) iii.c.f(data, new qnd.c(13), new qjj.g(18), new qbg.j(s0Var, 10)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        return yp0.b.g(zhm.w.u(zhm.v.k(listA, listB, list)), s0.c(), null, 0, 0, 126);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        GroupingExtraData groupingExtraData;
        com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.b bVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.b) this.f243042b;
        qpd.f fVar = (qpd.f) this.f243043c;
        qpd.e content = (qpd.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        GroupDetailsScreenContract$InputData groupDetailsScreenContract$InputData = bVar.d;
        GroupDetailsScreenContract$InputData.Group group = groupDetailsScreenContract$InputData.f87687a;
        GroupDetailsScreenContract$InputData.Group.CardholderGroup cardholderGroup = group instanceof GroupDetailsScreenContract$InputData.Group.CardholderGroup ? (GroupDetailsScreenContract$InputData.Group.CardholderGroup) group : null;
        String str = cardholderGroup != null ? cardholderGroup.f87694b : null;
        he3.j jVar = (he3.j) content.f248351b.f224257a;
        if (jVar == null) {
            return qpd.h.f248355a;
        }
        if (group instanceof GroupDetailsScreenContract$InputData.Group.ParticipantGroup) {
            groupingExtraData = fVar.f248354c;
        } else {
            boolean z = group instanceof GroupDetailsScreenContract$InputData.Group.SourceAccountGroup;
            GroupingExtraData card = GroupingExtraData.None.f87450a;
            if (z) {
                GroupingExtraData.SourceAccount.AccountPocketSource accountPocketSource = ((GroupDetailsScreenContract$InputData.Group.SourceAccountGroup) group).f87703b;
                if (accountPocketSource != null) {
                    card = new GroupingExtraData.SourceAccount(zhm.u.c(accountPocketSource));
                }
            } else if (group instanceof GroupDetailsScreenContract$InputData.Group.CardGroup) {
                GroupDetailsScreenContract$InputData.Group.CardGroup cardGroup = (GroupDetailsScreenContract$InputData.Group.CardGroup) group;
                TerminatedCard terminatedCard = cardGroup.f87692c;
                h93.f0 f0Var = cardGroup.f87691b;
                if (f0Var != null || terminatedCard != null) {
                    card = new GroupingExtraData.Card(zhm.v.l(f0Var), zhm.v.l(terminatedCard));
                }
            }
            groupingExtraData = card;
        }
        cmd.a aVar = bVar.f87713b;
        GroupDetailsScreenContract$InputData.Group group2 = groupDetailsScreenContract$InputData.f87687a;
        GroupDetailsScreenContract$InputData.Group.CategoryGroup categoryGroup = group2 instanceof GroupDetailsScreenContract$InputData.Group.CategoryGroup ? (GroupDetailsScreenContract$InputData.Group.CategoryGroup) group2 : null;
        yld.i iVarA = cmd.a.a(aVar, jVar, zhm.v.l(categoryGroup != null ? categoryGroup.f87695a : null), str, groupingExtraData, 4);
        return new qpd.i(iVarA.f314699b, new CompositeClause(zhm.v.k(new MoneyClause(jVar.f151564b, com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.b.e, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), mzi.b.a(bVar.f87714c, groupDetailsScreenContract$InputData.f87688b.f65744c, null, false, null, 62)), new DotDividerClause((Integer) null), null, null, 12), iVarA.f314700c);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        String strE;
        bw0.m mVar;
        qu4.i iVar = (qu4.i) this.f243042b;
        qu4.x xVar = (qu4.x) this.f243043c;
        wm4.a repaymentDetails = (wm4.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(repaymentDetails, "repaymentDetails");
        boolean z = iVar.f249225c;
        boolean z3 = iVar.f249227h;
        boolean z4 = iVar.f249226g;
        boolean z6 = (!z || z4 || z3) ? false : true;
        g2 g2Var = repaymentDetails.f298610a;
        List listB = g2Var == null ? f0.f322471a : xVar.d.b(g2Var, new ax4.b(0));
        aim.e eVarB = zhm.u.b();
        boolean zIsEmpty = listB.isEmpty();
        CreditCardRepayPaymentAmountScreenContract$InputData creditCardRepayPaymentAmountScreenContract$InputData = xVar.f249248a;
        dj0.d dVar = iVar.f249224b;
        if (dVar == null || (strE = xVar.f249249b.e(dVar)) == null) {
            m70.a.c(t0.f186434a);
            strE = "";
        }
        String str = strE;
        String string = u80.o.b(new u80.g(new dj0.d(0L, creditCardRepayPaymentAmountScreenContract$InputData.f69609b), u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString();
        boolean z11 = !z4;
        bw0.e eVar = bw0.e.SuggestionsElseCalculator;
        List listC = zhm.u.c(xVar.f249250c);
        ArrayList arrayList = repaymentDetails.f298611b;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (true) {
            TextClause textClause = null;
            if (!it8.hasNext()) {
                break;
            }
            wm4.b bVar = (wm4.b) it8.next();
            MoneyClause moneyClauseB = sx4.f.b(3, null, null, bVar.f298612a);
            String str2 = bVar.f298613b;
            if (str2 != null) {
                textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            arrayList2.add(new bw0.d(moneyClauseB, moneyClauseB, textClause));
        }
        bw0.h hVar = new bw0.h(str, string, (TextClause) null, z11, listC, Boolean.TRUE, (List) arrayList2, false, false, false, false, eVar, (Clause) null, false, 30596);
        String str3 = z4 ? iVar.f : iVar.e;
        if (z3) {
            mVar = new bw0.m(null, bw0.l.LOADING, null, false, null, 28);
        } else if (str3 != null) {
            mVar = new bw0.m(new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), z4 ? bw0.l.ERROR : bw0.l.INFO, null, false, null, 28);
        } else {
            mVar = null;
        }
        eVarB.add(new CenteredAmountDelegate.Model("credit_card_repay_payment_amount_repayment_payment_amount", null, hVar, null, mVar, null, null, zIsEmpty, false, creditCardRepayPaymentAmountScreenContract$InputData.f69609b, null, 1130));
        eVarB.addAll(listB);
        return new qu4.n(zhm.u.a(eVarB), xVar.a(iVar, z6));
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        oul.k kVar = (oul.k) this.f243042b;
        qul.b bVar = (qul.b) this.f243043c;
        nel.n instrument = (nel.n) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        TargetPriceInputValue targetPriceInputValue = kVar.f229907c;
        Amount amountA = bVar.f249491c.a(targetPriceInputValue, instrument);
        BigDecimal bigDecimal = amountA.f104717a;
        Intrinsics.checkNotNullParameter(amountA, "<this>");
        bVar.e().getClass();
        String string = l4i.a.d(amountA) ? u80.o.b(new u80.g(bVar.g(amountA), u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString() : null;
        String strB = bVar.f249490b.b(bigDecimal, amountA.f104718b);
        boolean zD = e1.D(bigDecimal);
        boolean z = targetPriceInputValue.f106874c;
        return new bw0.h(strB, string, null, zD, null, z ? Boolean.TRUE : null, !targetPriceInputValue.d, z, bw0.e.None, null, null, null, 31316);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        jid.z zVar = (jid.z) this.f243042b;
        oul.k kVar = (oul.k) this.f243043c;
        InstrumentTicker instrumentTicker = (InstrumentTicker) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        ogm.i iVar = (ogm.i) zVar.f174462c;
        bfl.g gVar = kVar.f229905a;
        r0 orderType = kVar.f229906b;
        double dDoubleValue = iVar.a(instrumentTicker, gVar, orderType).f104717a.doubleValue();
        dsl.a aVar = (dsl.a) zVar.f174461b;
        double dDoubleValue2 = kVar.f229907c.f106872a.doubleValue();
        bfl.g orderSide = kVar.f229905a;
        ((dsl.b) aVar).getClass();
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        InvestNewOrderPriceSetContext.a aVarNewBuilder = InvestNewOrderPriceSetContext.newBuilder();
        aVarNewBuilder.c();
        ((InvestNewOrderPriceSetContext) aVarNewBuilder.f49761b).setSelectedPrice(dDoubleValue2);
        aVarNewBuilder.c();
        ((InvestNewOrderPriceSetContext) aVarNewBuilder.f49761b).setLastMarketPrice(dDoubleValue);
        b6 b6VarO = v04.b.O(orderSide);
        aVarNewBuilder.c();
        ((InvestNewOrderPriceSetContext) aVarNewBuilder.f49761b).setOrderSide(b6VarO);
        d6 d6VarP = v04.b.P(orderType);
        aVarNewBuilder.c();
        ((InvestNewOrderPriceSetContext) aVarNewBuilder.f49761b).setOrderType(d6VarP);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        int i;
        qul.f fVar = (qul.f) this.f243042b;
        oul.k kVar = (oul.k) this.f243043c;
        yhm.r rVar = (yhm.r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        nel.n nVar = (nel.n) rVar.f314201a;
        InstrumentTicker instrumentTicker = (InstrumentTicker) rVar.f314202b;
        if (((Optional) rVar.f314203c).isPresent()) {
            return new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_trading_orders_pre_ipo_limit_explanation, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        }
        Clause priceClause = xul.m.a(fVar.f249496a, nVar, instrumentTicker, kVar.f229905a, null, null, kVar.f229906b, 24);
        r0 orderType = kVar.f229906b;
        bfl.g tradeSide = kVar.f229905a;
        String symbol = instrumentTicker.f105113c;
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(priceClause, "priceClause");
        r0 r0Var = r0.LIMIT;
        if (orderType == r0Var && tradeSide == bfl.g.BUY) {
            i = com.revolut.trading.orders.R$string.trading_orders_limit_buy_explanation;
        } else if (orderType == r0Var && tradeSide == bfl.g.SELL) {
            i = com.revolut.trading.orders.R$string.trading_orders_limit_sell_explanation;
        } else {
            r0 r0Var2 = r0.STOP;
            if (orderType == r0Var2 && tradeSide == bfl.g.BUY) {
                i = com.revolut.trading.orders.R$string.trading_orders_stop_buy_explanation;
            } else {
                if (orderType != r0Var2 || tradeSide != bfl.g.SELL) {
                    throw new IllegalStateException("Unsupported");
                }
                i = com.revolut.trading.orders.R$string.trading_orders_stop_sell_explanation;
            }
        }
        return new TextLocalisedClause(i, zhm.v.k(symbol, priceClause), custom, 8);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        oul.k kVar = (oul.k) this.f243042b;
        bul.o oVar = (bul.o) this.f243043c;
        vf0.h hVar = (vf0.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(hVar, "<destruct>");
        nel.n nVar = (nel.n) hVar.f288433a;
        InstrumentTicker instrumentTicker = (InstrumentTicker) hVar.f288434b;
        Optional optional = (Optional) hVar.f288435c;
        qul.h hVar2 = new qul.h(kVar.f229907c, nVar, instrumentTicker, (oel.l) optional.orElse(null), (a0) hVar.d, kVar.f229905a, kVar.f229906b);
        for (qul.g gVar : oVar.f18910a) {
            if (gVar.a(hVar2)) {
                return gVar.b(hVar2);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        qul.m mVar = (qul.m) this.f243042b;
        oul.k kVar = (oul.k) this.f243043c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        nel.n instrument = (nel.n) pair.f186385a;
        InstrumentTicker instrumentTicker = (InstrumentTicker) pair.f186386b;
        wul.o oVar = mVar.f249506b.f249504a;
        bfl.g tradeSide = kVar.f229905a;
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
        r0 r0Var = kVar.f229906b;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Float fValueOf = Float.valueOf(16.0f);
        Clause textLocalisedQuantityClause = qul.k.f249503a[instrumentTicker.d.ordinal()] == 1 ? new TextLocalisedQuantityClause(R$plurals.wealth_orders_bonds_header_description_unit, (Number) 1, zhm.v.k(1, xul.m.a(oVar, instrument, instrumentTicker, tradeSide, null, null, null, 48)), (Style) new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "ORDER_SCREEN_HEADER_DESCRIPTION_UNIT_CLAUSE", false), 8) : yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new TextClause("1", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(instrumentTicker.f105113c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause("=", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), xul.m.a(oVar, instrument, instrumentTicker, tradeSide, null, null, r0Var, 24)));
        Clause[] elements = new Clause[3];
        elements[0] = null;
        elements[1] = textLocalisedQuantityClause;
        ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_24_moon, Integer.valueOf(R$attr.uikit_colorGrey50), fValueOf, fValueOf, 16);
        if (instrumentTicker.f105115h != nel.n0.MARKET_CLOSED) {
            imageClause = null;
        }
        elements[2] = imageClause;
        Intrinsics.checkNotNullParameter(elements, "elements");
        return CompositeClause.a(yoj.b.m(new DotDividerClause((Integer) null), zhm.u.c(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements)))), null, custom, 11);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        qwf.a0 a0Var = (qwf.a0) this.f243042b;
        dj0.d checkoutPrice = (dj0.d) this.f243043c;
        ivf.g transitUserPocket = (ivf.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transitUserPocket, "pocket");
        twf.d dVar = a0Var.f249913b;
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        Intrinsics.checkNotNullParameter(transitUserPocket, "transitUserPocket");
        if (!(transitUserPocket instanceof ivf.f)) {
            throw new NoWhenBranchMatchedException();
        }
        PaymentMethod.Pocket pocket = ((ivf.f) transitUserPocket).f168845a;
        return dec.q.c(dVar.f275011a, pocket, true, !ruf.f.a(pocket.f84381j, checkoutPrice) ? dec.o.INSUFFICIENT_FUNDS : dec.o.DEFAULT, false, 16);
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        ChatItem chatItem;
        boolean z;
        List list;
        r0a.z zVar = (r0a.z) this.f243042b;
        r0a.i iVar = (r0a.i) this.f243043c;
        List chatItems = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(chatItems, "content");
        if (chatItems.isEmpty()) {
            ChatTransferRecipient recipient = iVar.f250735b;
            qv0.i iVar2 = iVar.e;
            if (iVar2 != null) {
                return zhm.u.c(iVar2);
            }
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            if (!(recipient instanceof ChatTransferRecipient.ApmTransferRecipient)) {
                return zhm.u.c(p0a.c.a(true));
            }
            ApmRecipient recipient2 = ((ChatTransferRecipient.ApmTransferRecipient) recipient).f79715a;
            Intrinsics.checkNotNullParameter(recipient2, "recipient");
            if (!(recipient2 instanceof BizumContact) || Intrinsics.f(((BizumContact) recipient2).f, ApmContact.State.ACTIVE.f62099a)) {
                list = f0.f322471a;
            } else {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.bizum.api.R$string.bizum_contact_chat_phone_not_registered, null, null, 14);
                ApmBizum.f61808c.getClass();
                List listK = zhm.v.k(new ListCellDelegate.Model("EMPTY_STATE_STEP_1", new j8(new ResourceImage(R$drawable.uikit_icn_24_bizum, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), textLocalisedClause, null, false, null, null, 0, 0, 0, 0, 4088), new ListCellDelegate.Model("EMPTY_STATE_STEP_2", new j8(new ResourceImage(R$drawable.uikit_icn_16_link, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(com.revolut.feature.apm.bizum.api.R$string.bizum_contact_chat_send_invite, null, null, 14), null, false, null, null, 0, 0, 0, 0, 4088));
                int i = R$attr.uikit_dp48;
                int i2 = R$attr.uikit_dp16;
                yp0.b.k(listK, 0, i, i2, i2, 17);
                list = listK;
            }
            if (list.isEmpty()) {
                return zhm.u.c(p0a.c.a(true));
            }
            FullScreenStateDelegate.Model modelA = p0a.c.a(false);
            aim.e eVarB = zhm.u.b();
            eVarB.add(modelA);
            eVarB.addAll(list);
            return zhm.u.a(eVarB);
        }
        p0a.a aVar = zVar.f250766b;
        qv0.i iVar3 = iVar.e;
        xo0.a accessibilitySender = new xo0.a(new TextClause(iVar.f250735b.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        Intrinsics.checkNotNullParameter(chatItems, "chatItems");
        Intrinsics.checkNotNullParameter(accessibilitySender, "accessibilitySender");
        if (chatItems.isEmpty()) {
            return f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        DateTime f79571b = ((ChatItem) d0.b0(chatItems)).getF79574b();
        arrayList.add(p0a.a.a(f79571b));
        int i3 = 0;
        for (Object obj5 : chatItems) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                zhm.v.s();
                throw null;
            }
            ChatItem chatItem2 = (ChatItem) obj5;
            if (!chatItem2.getF79574b().toLocalDate().isEqual(f79571b.toLocalDate())) {
                arrayList.add(p0a.a.a(chatItem2.getF79574b()));
                f79571b = chatItem2.getF79574b();
            }
            DateTime dateTime = f79571b;
            l0 l0Var = aVar.f231488a;
            cam.f fVarA = ru9.o.a(i3, chatItems);
            if (i3 == zhm.v.j(chatItems)) {
                chatItem = chatItem2;
                z = true;
            } else {
                chatItem = chatItem2;
                z = false;
            }
            arrayList.add(l0Var.a(chatItem, fVarA, z, false, null, accessibilitySender, null));
            i3 = i5;
            f79571b = dateTime;
        }
        return i2b.a.p(arrayList, iVar3);
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        r18.n nVar = (r18.n) this.f243042b;
        a18.d dVar = (a18.d) this.f243043c;
        a18.a content = (a18.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        x08.i iVar = content.f557a;
        if (!(iVar instanceof x08.g)) {
            if (Intrinsics.f(iVar, x08.h.f301536a)) {
                return yp0.b.g(zhm.u.c(new FullScreenStateDelegate.Model("watchlist-is-empty-list-id", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.feed_section_insights_lock_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.feed_section_insights_lock_subtitle, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_lock, null, null, 6)), new l6(12, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.feed_section_insights_lock_action_unlock, null, null, 14), null, h4.SEMIACCENT), null, false, q18.e.f241405a, null, null, 1760)), r18.n.b(false), null, 0, 0, 126);
            }
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.i(iVar, "null cannot be cast to non-null type com.revolut.feature.invest.smart_notifications.api.domain.models.InvestSmartNotificationsState.Available");
        List listV0 = d0.V0(((x08.g) iVar).f301535a, dVar.f559a);
        ArrayList arrayList = new ArrayList(zhm.w.t(listV0, 10));
        Iterator it8 = listV0.iterator();
        while (it8.hasNext()) {
            arrayList.add(nVar.f250925a.a((x08.f) it8.next()));
        }
        if (!arrayList.isEmpty()) {
            return yp0.b.g(arrayList, r18.n.b(true), null, 0, 0, 126);
        }
        FeedFilter feedFilter = content.f558b;
        if (feedFilter instanceof FeedFilter.ByAssetFilter) {
            return yp0.b.g(zhm.u.c(new FullScreenStateDelegate.Model("watchlist-is-empty-list-id", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.feed_section_insights_empty_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.feed_section_insights_empty_subtitle, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_newspaper, null, null, 6)), new l6(12, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.feed_section_insights_empty_action_add_to_watchlist, null, null, 14), null, h4.SEMIACCENT), null, false, q18.d.f241404a, null, null, 1760)), r18.n.b(true), null, 0, 0, 126);
        }
        if (feedFilter instanceof FeedFilter.ByRef) {
            return f0.f322471a;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object t(Object obj2, Object obj3, Object obj4) throws Throwable {
        char c2;
        List listA;
        Collection collectionB;
        List list;
        r3b.q qVar = (r3b.q) this.f243042b;
        r3b.i iVar = (r3b.i) this.f243043c;
        yhm.r rVar = (yhm.r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        wel.e portfolio = (wel.e) rVar.f314201a;
        List accountActions = (List) rVar.f314202b;
        WealthAccount account = (WealthAccount) rVar.f314203c;
        wel.h hVar = portfolio.f.f296826a;
        if ((hVar != null ? hVar.f296827a : null) != TradingOnboardingStatus.COMPLETED) {
            return f0.f322471a;
        }
        t3b.l lVar = qVar.d;
        Data state = iVar.f251244g;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        List list2 = (List) iii.c.f(state, new sx2.h(lVar, state, 18), new qce.b(lVar, state, 21), new si5.c(lVar, state, 11));
        Data unrealisedPerformance = iVar.f251243c;
        int i = 0;
        if (unrealisedPerformance != null) {
            t5d.d dVar = qVar.f;
            Data data = iVar.i;
            t3b.i iVar2 = (t3b.i) qVar.f251260b;
            iVar2.getClass();
            Intrinsics.checkNotNullParameter(portfolio, "portfolio");
            Intrinsics.checkNotNullParameter(unrealisedPerformance, "unrealisedPerformance");
            Intrinsics.checkNotNullParameter(accountActions, "accountActions");
            Intrinsics.checkNotNullParameter(account, "account");
            int i2 = 10;
            if (i2b.a.m(portfolio)) {
                c2 = 0;
                collectionB = t3b.i.b((List) iii.c.f(unrealisedPerformance, new t3b.g(i), new szb.f(15), new si5.c(iVar2, portfolio, i2)), new ListSubheaderDelegate.Model("ID_CFD_INVESTMENTS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_margin_cfd_open_positions_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            } else {
                c2 = 0;
                collectionB = f0.f322471a;
            }
            Collection collection = collectionB;
            if (i2b.a.m(portfolio)) {
                list = (List) iii.c.f(unrealisedPerformance, new t3b.g(1), new szb.f(16), new ccg.b(iVar2, portfolio, accountActions, account, 8));
            } else {
                List<kel.b> listA2 = k5b.d.a(portfolio, null);
                ArrayList arrayList = new ArrayList(zhm.w.t(listA2, 10));
                for (kel.b bVar : listA2) {
                    arrayList.add(iVar2.a(bVar, bVar.d, accountActions, account));
                }
                list = arrayList;
            }
            listA = dVar.a(data, d0.E0(t3b.i.b(list, new ListSubheaderDelegate.Model("ID_CFD_CASH_HOLDINGS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_cfd_cash_holdings_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)), collection));
        } else {
            c2 = 0;
            listA = null;
        }
        List listB = ((fsl.u) qVar.f251261c).b(iVar, new fsl.j(null, 3));
        List list3 = iVar.f;
        List[] elements = new List[4];
        elements[c2] = list2;
        elements[1] = listA;
        elements[2] = listB;
        elements[3] = list3;
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zhm.w.u(kotlin.collections.d.L(elements));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u(java.lang.Object r44, java.lang.Object r45, java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 1168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q87.z.u(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        r5e.j jVar = (r5e.j) this.f243042b;
        r5e.f fVar = (r5e.f) this.f243043c;
        w2 details = (w2) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(details, "details");
        int i = fVar.f251590b;
        aim.e eVarB = zhm.u.b();
        ArrayList arrayList = details.f173593n;
        if (arrayList.size() <= 1) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            int i2 = 0;
            for (Object obj5 : arrayList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    zhm.v.s();
                    throw null;
                }
                arrayList2.add(new FixedTabs.Item(String.valueOf(i2), new TextClause(((a2) obj5).f173405a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (AnalyticsContext) null, 12));
                i2 = i3;
            }
            eVarB.add(new FixedTabsDelegate.Model("payout_scenarios_tabs", arrayList2, String.valueOf(i), false, null, SyslogConstants.LOG_CLOCK));
        }
        a2 a2Var = (a2) d0.e0(i, details.f173593n);
        if (a2Var != null) {
            eVarB.addAll(jVar.f251592a.a(i, a2Var));
        }
        return zhm.u.a(eVarB);
    }

    private final Object w(Object obj2, Object obj3, Object obj4) {
        RiskMetrics.ReturnBreakDown returnBreakDown;
        r6f.e eVar = (r6f.e) this.f243042b;
        r6f.j jVar = (r6f.j) this.f243043c;
        f0.a product = (f0.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(product, "product");
        RiskMetrics riskMetrics = (RiskMetrics) eVar.f251830b.getContent();
        RiskMetrics.ReturnBreakDown.OngoingCharges ongoingCharges = (riskMetrics == null || (returnBreakDown = riskMetrics.f85041r) == null) ? null : returnBreakDown.f85046c;
        CellDetailsDelegate.Model[] elements = {new CellDetailsDelegate.Model("ManagedPortfolioDetailsFeesExtensionMapper_fee_management", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.trading.managed_portfolios.impl.R$string.managed_portfolios_template_list_about_widget_fees_management, null, null, 14), (Image) null, 0, false, 30), new PercentageClause(e1.Z(product.a().f23728a.f23759a), (PercentageClause.Format) null, (Style) null, 6), null, null, null, null, 0, null, false, false, null, null, 32760), ongoingCharges != null ? new CellDetailsDelegate.Model("ManagedPortfolioDetailsFeesExtensionMapper_fee_product", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.trading.managed_portfolios.impl.R$string.wealth_robo_template_details_about_widget_product_fee_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(com.revolut.feature.trading.managed_portfolios.impl.R$string.wealth_robo_template_details_about_widget_product_fee_value, zhm.v.k(new PercentageClause(e1.Z(ongoingCharges.f85047a), (PercentageClause.Format) null, (Style) null, 6), new PercentageClause(e1.Z(ongoingCharges.f85048b), (PercentageClause.Format) null, (Style) null, 6)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return yp0.b.g(kotlin.collections.d.L(elements), jVar.f251834a, null, 0, 0, 126);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x039c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r43, java.lang.Object r44, java.lang.Object r45) {
        /*
            Method dump skipped, instruction units count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q87.z.x(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object y(Object obj2, Object obj3, Object obj4) {
        r9c.n nVar = (r9c.n) this.f243042b;
        RampOrderDetails rampOrderDetails = (RampOrderDetails) this.f243043c;
        vf0.h hVar = (vf0.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(hVar, "<destruct>");
        q6c.h hVar2 = (q6c.h) hVar.f288433a;
        od0.i iVar = (od0.i) hVar.f288434b;
        s6c.l lVar = (s6c.l) hVar.f288435c;
        n6c.a aVar = (n6c.a) hVar.d;
        aim.e eVarB = zhm.u.b();
        aim.e eVarB2 = zhm.u.b();
        aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_order_summary_ramp_order_details_recipient, null, null, 14), (Image) null, 0, false, 30);
        RampOrderDetails.Recipient recipient = rampOrderDetails.d;
        eVarB2.add(new CellDetailsDelegate.Model("ID_TO_CELL", t0Var, new TextClause(recipient.f84416a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(recipient.f84417b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, 0, null, false, false, null, null, 32752));
        eVarB2.add(new CellDetailsDelegate.Model("ID_NETWORK_CEEL", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_order_summary_ramp_order_details_network, null, null, 14), (Image) null, 0, false, 30), ((ik5.a) nVar.f252566a).b(rampOrderDetails.e, true, null), null, null, null, null, 0, null, false, false, null, null, 32760));
        aim.e eVarA = zhm.u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        aim.e eVarB3 = zhm.u.b();
        dj0.d dVar = new dj0.d(rampOrderDetails.f84412c, hVar2.f242543l);
        aw0.t0 t0Var2 = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_order_summary_ramp_order_details_receive, null, null, 14), (Image) null, 0, false, 30);
        MoneyClause moneyClause = new MoneyClause(rampOrderDetails.f84410a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        long j2 = hVar2.f;
        xi0.b bVar = hVar2.f242543l;
        eVarB3.add(new CellDetailsDelegate.Model("ID_YOU_GET_CELL", t0Var2, moneyClause, new MoneyClause(pyd.c.H(new dj0.d(j2, bVar), dVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, 0, null, false, false, null, null, 32752));
        aw0.t0 t0Var3 = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_order_summary_ramp_order_details_price, null, null, 14), (Image) null, 0, false, 30);
        RampOrderDetails.ExchangeRate exchangeRate = rampOrderDetails.f;
        eVarB3.add(new CellDetailsDelegate.Model("ID_PRICE_CELL", t0Var3, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new TextClause(String.valueOf(exchangeRate.f84414a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CurrencyClause(rampOrderDetails.f84410a.f115083b, CurrencyClause.Format.Ticker.f57756a, null, 4), new TextClause("=", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(new dj0.d(exchangeRate.f84415b, bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12))), null, null, null, null, 0, null, false, false, null, null, 32760));
        eVarB3.add(new CellDetailsDelegate.Model("ID_RAMP_FEES_CELL", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_order_summary_ramp_fees_disclaimer_title, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), 0, true, 20), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        eVarB3.addAll(nVar.f252567b.c(iVar, lVar, aVar));
        aim.e eVarA2 = zhm.u.a(eVarB3);
        yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA2);
        return zhm.u.a(eVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0a75  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0a78  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0a9a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0aa0  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0b56  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0b90  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0b93  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0c05  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0c08  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0c4b  */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v17 */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r72, java.lang.Object r73, java.lang.Object r74) {
        /*
            Method dump skipped, instruction units count: 3484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q87.z.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}

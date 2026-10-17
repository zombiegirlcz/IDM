package dn8;

import android.os.Parcelable;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.q2;
import aw0.t0;
import bw0.m;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.CapitalizedClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.common.impl.flow.field_search.search.FieldSearchScreenContract$InputData;
import com.revolut.feature.address.models.AddressFieldSuggestion;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.backend_flow.domain.models.BackendEntityItem;
import com.revolut.feature.credit.loan.api.LoanApi$Toggles;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanRepaymentConfig;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import com.revolut.feature.credit.loan.api.models.rev10.RepaymentSuggestion;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.FiatCryptoWithdrawLimits;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.time_slot_picker.AsftTimeSlotPickerScreenContract$InputData;
import com.revolut.retail.feature.balance.picker.api.R$string;
import com.revolut.retail.feature.impl.budgeting.R$plurals;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget.SetOverallBudgetScreenContract$InputData;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.tracking.v3.RevPointsFeaturedRewardsContext;
import com.revolut.trading.orders.ui.invest.placement.models.InvestInputValue;
import com.youTransactor.uCube.rpc.Constants;
import d9.e1;
import e2j.q;
import e69.n;
import e85.m;
import e85.r;
import e85.s;
import e8e.b0;
import e8e.o;
import eq5.m1;
import eq5.n1;
import eq5.x0;
import eq8.c0;
import eq8.i0;
import eq8.j0;
import eq8.k0;
import eq8.l0;
import eq8.m0;
import esj.x;
import hha.y0;
import hha.z0;
import ip0.a10;
import ip0.b9;
import ip0.c10;
import ip0.zj;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import kotlin.text.a0;
import kotlin.text.d0;
import m1c.q0;
import m1c.z;
import mx0.f3;
import mx0.h3;
import org.joda.time.DateTime;
import q35.g0;
import qua.p;
import vf0.y;
import yp0.e0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f116247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f116248c;

    public /* synthetic */ k(Object obj2, Object obj3, int i) {
        this.f116246a = i;
        this.f116247b = obj2;
        this.f116248c = obj3;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        List listC;
        Object next;
        q qVar = (q) this.f116247b;
        e2j.f fVar = (e2j.f) this.f116248c;
        List currencies = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = currencies.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next2 = it8.next();
            e2j.e eVar = (e2j.e) next2;
            String query = fVar.f122120a;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(query, "query");
            if (d0.W(query) || a0.H(cp5.d.K(eVar.f122119b.f115083b), query, true) || a0.H(eVar.f122118a, query, true)) {
                arrayList.add(next2);
            }
        }
        ArrayList arrayListF1 = zhm.d0.f1(arrayList);
        if (!arrayListF1.isEmpty()) {
            aim.e eVarB = u.b();
            Iterator it9 = arrayListF1.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                if (Intrinsics.f(((e2j.e) next).f122119b.f115083b, qVar.f122137a.f99485c)) {
                    break;
                }
            }
            e2j.e eVar2 = (e2j.e) next;
            u0.a(arrayListF1).remove(eVar2);
            if (eVar2 != null) {
                eVarB.add(qVar.b(eVar2, true));
            }
            ArrayList arrayList2 = new ArrayList(w.t(arrayListF1, 10));
            Iterator it10 = arrayListF1.iterator();
            while (it10.hasNext()) {
                arrayList2.add(qVar.b((e2j.e) it10.next(), false));
            }
            eVarB.addAll(arrayList2);
            listC = u.a(eVarB);
            yp0.b.k(listC, 0, 0, 0, 0, 31);
        } else if (zBooleanValue) {
            listC = q.a();
        } else if (d0.W(fVar.f122120a)) {
            listC = f0.f322471a;
        } else {
            listC = u.c(new FullScreenStateDelegate.Model("NO_SEARCH_RESULT_LIST_ID", new TextLocalisedClause(R$string.balance_picker_search_no_result_title, u.c(fVar.f122120a), null, 12), new TextLocalisedClause(R$string.balance_picker_search_no_result_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, new TextLocalisedClause(R$string.balance_picker_search_clear, null, null, 14), false, null, null, false, 0, 0, 32720));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
        }
        return new e2j.h(new TextLocalisedClause(R$string.currency_picker_accessibility_label, u.c(fVar.f122122c), null, 12), listC, currencies.size() >= 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x023d  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r51, java.lang.Object r52, java.lang.Object r53) {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dn8.k.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        CellDetailsDelegate.Model model;
        e69.w wVar = (e69.w) this.f116247b;
        e69.f fVar = (e69.f) this.f116248c;
        ApmPaymentAuthorisationPendingAction pendingPayment = (ApmPaymentAuthorisationPendingAction) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pendingPayment, "pendingPayment");
        Data fundingSource = fVar.f122942b;
        ApmPaymentAuthorisationSummary f61991a = pendingPayment.getF61991a();
        PaymentMethodDetails paymentMethodDetails = f61991a.f61995g;
        LocalDateTime localDateTime = f61991a.f61999m;
        PaymentMethodDetails.MasavRequestToPay paymentMethodDetails2 = paymentMethodDetails instanceof PaymentMethodDetails.MasavRequestToPay ? (PaymentMethodDetails.MasavRequestToPay) paymentMethodDetails : null;
        if (paymentMethodDetails2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        PaymentMethodDetails.Creditor creditor = paymentMethodDetails2.f62040a;
        aim.e eVarB = u.b();
        dj0.d dVar = f61991a.f;
        Intrinsics.checkNotNullParameter(paymentMethodDetails2, "paymentMethodDetails");
        List listC = u.c(new RowDelegate.Model("ID_MERCHANT_ITEM", new RowDelegate.Model.MainImage.Image40(new ContactImage((String) null, (String) null, (String) null, (String) null, creditor.d, creditor.f62030a, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4047), null, null, false, null, false, 62), new TextClause(creditor.f62030a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, dVar != null ? new RowDelegate.Model.c.b(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126) : null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867832));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        eVarB.addAll(listC);
        h69.a aVar = wVar.f122960a;
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        eVarB.addAll(yp0.b.g((List) iii.c.f(fundingSource, new h5i.b(16), new h43.q(4), new gzb.d(aVar, 6)), new ListSubheaderDelegate.Model("ID_PAYMENT_FROM_ITEM_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_payment_from_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        Float fValueOf = Float.valueOf(16.0f);
        Intrinsics.checkNotNullParameter(paymentMethodDetails2, "paymentMethodDetails");
        String str = paymentMethodDetails2.f62042c;
        CellDetailsDelegate.Model model2 = str != null ? new CellDetailsDelegate.Model("ID_INVOICE_NUMBER_ITEM", new t0((Clause) new TextLocalisedClause(com.revolut.feature.masav.api.R$string.authorisation_masav_p2m_invoice_number, null, null, 14), (Image) null, 0, false, 30), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760) : null;
        String str2 = paymentMethodDetails2.d;
        if (str2 != null) {
            t0 t0Var = new t0((Clause) new TextLocalisedClause(com.revolut.feature.masav.api.R$string.authorisation_masav_p2m_invoice_link, null, null, 14), (Image) null, 0, false, 30);
            List listK = v.k(new ImageClause(R$drawable.uikit_icn_24_link_external, new ImageClauseTint.Color(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16), new TextLocalisedClause(com.revolut.feature.masav.api.R$string.authorisation_masav_p2m_invoice_link_action_open, null, null, 14));
            m70.a.t(kotlin.jvm.internal.t0.f186434a);
            model = new CellDetailsDelegate.Model("ID_INVOICE_LINK_ITEM", t0Var, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(30, (Integer) null, (Object) null, "ID_INVOICE_LINK_CLICK", false), null, 8), null, new ExternalDestination.Browser(str2, null), null, null, 0, null, true, false, null, null, 30648);
        } else {
            model = null;
        }
        CellDetailsDelegate.Model[] elements = {model2, model, localDateTime != null ? new CellDetailsDelegate.Model("ID_EXPIRY_DATE_ITEM", new t0((Clause) new TextLocalisedClause(com.revolut.feature.masav.api.R$string.authorisation_masav_p2m_expiry_date, null, null, 14), (Image) null, 0, false, 30), new TimeClause(oi0.d.R(localDateTime), new TimeClause.Format.Pretty(0), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        e0 e0Var = e0.OUTSIDE_BOX;
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        if (!listL.isEmpty()) {
            listL = yp0.b.d(listL, new ListSubheaderDelegate.Model("ID_PAYMENT_DETAILS_SUBHEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.masav.api.R$string.authorisation_masav_p2m_payment_details_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i, i, i2, i2);
        }
        eVarB.addAll(listL);
        aim.e eVarA = u.a(eVarB);
        String creditorName = creditor.f62030a;
        Intrinsics.checkNotNullParameter(creditorName, "creditorName");
        TextLocalisedClause textLocalisedClause = localDateTime != null ? new TextLocalisedClause(com.revolut.feature.masav.api.R$string.authorisation_masav_p2m_expiration_message, v.k(new TextClause(creditorName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TimeClause(oi0.d.R(localDateTime), new TimeClause.Format.Pretty(0), null, null, 12)), null, 12) : null;
        m6 m6Var = n6.Companion;
        return new n(eVarA, new aw0.h(true, m6.c(m6Var, new TextLocalisedClause(com.revolut.feature.masav.api.R$string.authorisation_masav_p2m_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "APPROVE_BUTTON_TAG", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), m6.c(m6Var, new TextLocalisedClause(com.revolut.feature.masav.api.R$string.authorisation_masav_p2m_action_reject, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, "REJECT_BUTTON_TAG", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), textLocalisedClause, null, null, 112));
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        e7f.i iVar = (e7f.i) this.f116247b;
        l5f.b bVar = (l5f.b) this.f116248c;
        vf0.h hVar = (vf0.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(hVar, "<destruct>");
        List list = (List) hVar.f288433a;
        del.b bVar2 = (del.b) hVar.f288434b;
        vel.j jVar = (vel.j) hVar.f288435c;
        TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) hVar.d;
        vel.l lVar = (vel.l) zhm.d0.b0(list);
        hel.b bVar3 = tradingLegalEntityInformation.f105106a;
        dj0.d dVar = lVar.f288366c.f288362a;
        dj0.d dVarQ = mif.a.Q(bVar2.f113708a);
        Clause clauseB = sfl.b.b(iVar.f123323a, jVar.f288360a, jVar.f288361b, null, 28);
        HeaderDelegate.Model model = new HeaderDelegate.Model("ManagedPortfolioPerformanceSummaryExtensionMapper_header", null, new q2(26, new MoneyClause(dVarQ, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12), null, false), null, new TextLocalisedClause(com.revolut.feature.trading.managed_portfolios.impl.R$string.wealth_robo_template_details_investments_total_value, u.c(clauseB), null, 12), null, null, HeaderDelegate.a.c.f52422a, null, null, null, 127960);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        kpj.f fVar = iVar.f123324b;
        n2l.i iVar2 = n2l.i.f211591a;
        return yp0.b.g(v.k(model, new RowDelegate.Model("ManagedPortfolioPerformanceSummaryExtensionMapper_row", new RowDelegate.Model.MainImage.Image40(companion.i(fVar.g(iVar2), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), fVar.h(iVar2, bVar3, null), null, 0, new TextLocalisedClause(com.revolut.feature.trading.managed_portfolios.impl.R$string.wealth_robo_template_details_investments_contributed, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVarQ, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), clauseB, null, false, 124), true, null, false, null, null, null, null, null, null, bVar, null, 0, 0, 0, 0, 532673496)), iVar.f123325c, null, 0, 0, 126);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        ArrayList arrayList;
        m mVar;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Clause textClause;
        r rVar = (r) this.f116247b;
        e85.g gVar = (e85.g) this.f116248c;
        e85.f content = (e85.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        dj0.d dVar = gVar.f123583c;
        dj0.d dVar2 = dVar == null ? new dj0.d(0L, content.f123579a.f70144a.f70123x) : dVar;
        LoanDetails loanDetails = content.f123579a;
        LoanRepaymentAccountModelExtension.RepaymentAccountState repaymentAccountState = content.f123580b;
        LoanRepaymentConfig loanRepaymentConfig = loanDetails.f70152n;
        Loan loan = loanDetails.f70144a;
        Clause clauseA = null;
        e85.m mVarA = dVar != null ? s.a(dVar, loanRepaymentConfig, loan.f70110c) : null;
        boolean z = dVar != null && dVar.compareTo(repaymentAccountState.f70504a.getBalance()) > 0;
        dj0.d balance = repaymentAccountState.f70504a.getBalance();
        LoanRepaymentConfig loanRepaymentConfig2 = loanDetails.f70152n;
        xi0.b currency = loan.f70123x;
        boolean z3 = ((jte.d) rVar.f123598b).c(LoanApi$Toggles.AllowChangeRepaymentAccount.f70064c) && !repaymentAccountState.f70505b.f241816g.f5338a.isEmpty();
        AccountWrapper accountWrapper = repaymentAccountState.f70504a;
        int i = 3;
        f3 f3Var = new f3(accountWrapper.f97226c, accountWrapper.f97225b, sx4.f.b(3, null, null, balance), z3, z ? h3.ERROR : h3.ACTIVE, z3);
        List list = loanRepaymentConfig2.f70181h;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                RepaymentSuggestion repaymentSuggestion = (RepaymentSuggestion) it8.next();
                dj0.d dVar3 = repaymentSuggestion.f70205b;
                arrayList.add(new bw0.d(sx4.f.b(i, null, null, dVar3), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_repayment_v2_amount_suggestion_title, u.c(sx4.f.b(i, null, null, dVar3)), null, 12), new TextClause(repaymentSuggestion.f70204a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
                dVar = dVar;
                it8 = it8;
                z = z;
                f3Var = f3Var;
                i = 3;
            }
        } else {
            arrayList = null;
        }
        dj0.d dVar4 = dVar;
        boolean z4 = z;
        f3 f3Var2 = f3Var;
        String strE = rVar.f123597a.e(dVar2);
        Intrinsics.checkNotNullParameter(currency, "currency");
        String strJ = cp5.d.J(currency);
        bw0.e eVar = bw0.e.SuggestionsElseCalculator;
        List list3 = arrayList;
        if (arrayList == null) {
            list3 = f0.f322471a;
        }
        bw0.h hVar = new bw0.h(strE, strJ, (TextClause) null, true, (List) null, Boolean.TRUE, list3, false, false, false, false, eVar, (Clause) null, false, 30612);
        if (mVarA != null) {
            if (mVarA instanceof m.c) {
                textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_repayment_v2_amount_validation_below_minimum, u.c(sx4.f.b(3, null, null, loanRepaymentConfig2.f70178b)), null, 12);
            } else if ((mVarA instanceof m.a) || mVarA.equals(m.b.f123592a)) {
                textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_repayment_v2_amount_validation_exceeds_maximum, u.c(sx4.f.b(3, null, null, loanRepaymentConfig2.f70179c)), null, 12);
            } else {
                if (!(mVarA instanceof e85.n)) {
                    throw new NoWhenBranchMatchedException();
                }
                textClause = new TextClause(((e85.n) mVarA).f123594a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                mVar = new bw0.m(textClause, bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, 24);
            }
            textClause = textLocalisedClause2;
            mVar = new bw0.m(textClause, bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, 24);
        } else {
            mVar = null;
        }
        List listC = u.c(new CenteredAmountDelegate.Model("INPUT_AMOUNT", null, hVar, f3Var2, mVar, null, b9.MATCH_PARENT, null, null, null, null, new e85.h(currency), null, 6050));
        boolean z6 = (dVar4 == null || mVarA != null || z4 || dVar2.k()) ? false : true;
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        LoanState loanState = loan.i;
        if (loanState instanceof LoanState.Outstanding) {
            clauseA = e85.q.a(loanDetails, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_repayment_v2_amount_disclaimer_outstanding_short, u.c(sx4.f.b(3, null, null, ((LoanState.Outstanding) loanState).f70190a)), null, 12));
        } else if (loanState instanceof LoanState.Overdue) {
            clauseA = e85.q.a(loanDetails, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_repayment_v2_amount_disclaimer_overdue_short, u.c(sx4.f.b(3, null, null, ((LoanState.Overdue) loanState).f70193a)), null, 12));
        } else if ((loanState instanceof LoanState.Cancelled) || (loanState instanceof LoanState.Terminated)) {
            clauseA = e85.q.a(loanDetails, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_repayment_v2_amount_disclaimer_cancelled_short, u.c(sx4.f.b(3, null, null, loan.f70110c)), null, 12));
        } else {
            List list4 = loanRepaymentConfig2.d;
            if (list4 != null) {
                boolean zContains = list4.contains(g0.AMOUNT_REDUCTION);
                boolean zContains2 = list4.contains(g0.TERM_REDUCTION);
                if (zContains && zContains2) {
                    clauseA = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_repayment_v2_amount_disclaimer_healthy_two_options, v.k(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_repayment_v2_amount_disclaimer_strategy_reduce_monthly_repayments, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_repayment_v2_amount_disclaimer_strategy_reduce_term, null, null, 14)), null, 12);
                } else {
                    if (zContains) {
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_repayment_v2_amount_disclaimer_healthy_one_option, u.c(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_repayment_v2_amount_disclaimer_strategy_reduce_monthly_repayments, null, null, 14)), null, 12);
                    } else if (zContains2) {
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_repayment_v2_amount_disclaimer_healthy_one_option, u.c(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_repayment_v2_amount_disclaimer_strategy_reduce_term, null, null, 14)), null, 12);
                    }
                    clauseA = textLocalisedClause;
                }
            }
        }
        return new e85.l(listC, r.a(clauseA, z6));
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        Object obj5;
        Object obj6;
        List list;
        aim.e eVarA;
        e8e.m mVar = (e8e.m) this.f116247b;
        b0 b0Var = (b0) this.f116248c;
        e8e.l content = (e8e.l) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List list2 = content.f123639a;
        e8e.k kVar = content.f123641c;
        if (kVar == null || (obj5 = kVar.f123638b) == null) {
            obj5 = h0.f322473a;
        }
        Object obj7 = obj5;
        e8e.j jVar = content.d;
        if (jVar == null || (obj6 = jVar.f123636b) == null) {
            obj6 = h0.f322473a;
        }
        Object obj8 = obj6;
        Set set = mVar.f123644c;
        Subaccount subaccount = content.f123640b;
        Set set2 = mVar.d;
        h6e.b bVar = jVar != null ? jVar.f123635a : null;
        k71.q qVar = mVar.f;
        if (list2.isEmpty()) {
            aim.e eVarB = u.b();
            eVarB.add(new FullScreenStateDelegate.Model("EMPTY_ITEM", new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.bill_accounts_payments_picker_empty_state_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.bill_accounts_payments_picker_empty_state_subtitle, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_receipt, null, null, 6)), zj.REGULAR, null, false, null, null, false, 0, 0, 31712));
            eVarB.add(b0.e());
            eVarB.add(b0.b());
            eVarA = u.a(eVarB);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        } else {
            ZonedDateTime zonedDateTimeK = ((l80.f) b0Var.f123632a).k();
            dqd.a aVar = new dqd.a(zonedDateTimeK, obj7, obj8, subaccount, 3);
            List listP0 = zhm.d0.P0(list2, new e8e.a0());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj9 : listP0) {
                o oVar = (o) aVar.invoke((p) obj9);
                Object arrayList = linkedHashMap.get(oVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(oVar, arrayList);
                }
                ((List) arrayList).add(obj9);
            }
            aim.e eVarB2 = u.b();
            o oVar2 = o.LINKED_CARD;
            List list3 = (List) linkedHashMap.get(oVar2);
            if (list3 == null) {
                list3 = f0.f322471a;
            }
            zhm.a0.x(b0.f(b0Var.d(list3, set2.contains(oVar2), "COLLAPSE_BUTTON_CARD", oVar2, qVar), new ListSubheaderDelegate.Model("ITEM_ID_HEADER_USER_CARD", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.subaccount_payments_picker_linked_to_card_title, v1.c.v(list3), null, 12), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.subaccount_payments_picker_action_unlink_card, null, null, 14), true, (Object) oVar2, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898)), eVarB2);
            o oVar3 = o.LINKED_PARTNER_CARD;
            List list4 = (List) linkedHashMap.get(oVar3);
            if (list4 == null) {
                list4 = f0.f322471a;
            }
            List list5 = list4;
            zhm.a0.x(bVar != null ? b0.f(b0Var.d(list5, set2.contains(oVar3), "COLLAPSE_BUTTON_PARTNER_CARD", oVar3, qVar), new ListSubheaderDelegate.Model("ITEM_ID_HEADER_PARTNER_CARD", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.subaccount_payments_picker_linked_partner_to_card_title, v.k(bVar.i, Integer.valueOf(list5.size())), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) oVar3, (Parcelable) null, 0, 0, 0, 0, 64506)) : f0.f322471a, eVarB2);
            o oVar4 = o.CURRENT;
            List list6 = (List) linkedHashMap.get(oVar4);
            if (list6 == null) {
                list6 = f0.f322471a;
            }
            zhm.a0.x(b0Var.c(list6, zonedDateTimeK, set, com.revolut.feature.subaccount.impl.R$string.subaccount_payments_picker_linked_to_pocket_title, 0, null, set2.contains(oVar4), oVar4, qVar), eVarB2);
            o oVar5 = o.SUBSCRIPTION;
            List list7 = (List) linkedHashMap.get(oVar5);
            if (list7 == null) {
                list7 = f0.f322471a;
            }
            zhm.a0.x(b0Var.c(list7, zonedDateTimeK, set, com.revolut.feature.subaccount.impl.R$string.bill_accounts_payments_picker_rev10_subscriptions_title, 1, new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.bill_accounts_payments_picker_rev10_action_find_existing, null, null, 14), set2.contains(oVar5), oVar5, qVar), eVarB2);
            o oVar6 = o.RECURRING;
            List list8 = (List) linkedHashMap.get(oVar6);
            if (list8 == null) {
                list8 = f0.f322471a;
            }
            zhm.a0.x(b0Var.c(list8, zonedDateTimeK, set, com.revolut.feature.subaccount.impl.R$string.bill_accounts_payments_picker_rev10_recurring_transfer_title, 2, new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.bill_accounts_payments_picker_rev10_action_add_new, null, null, 14), set2.contains(oVar6), oVar6, qVar), eVarB2);
            o oVar7 = o.DEBIT;
            List list9 = (List) linkedHashMap.get(oVar7);
            if (list9 == null) {
                list9 = f0.f322471a;
            }
            zhm.a0.x(b0Var.c(list9, zonedDateTimeK, set, com.revolut.feature.subaccount.impl.R$string.bill_accounts_payments_picker_rev10_direct_debits_title, 3, null, set2.contains(oVar7), oVar7, qVar), eVarB2);
            o oVar8 = o.ANOTHER_SUBACCOUNT;
            List listV0 = (List) linkedHashMap.get(oVar8);
            if (listV0 == null) {
                listV0 = f0.f322471a;
            }
            boolean zContains = set2.contains(oVar8);
            boolean z = listV0.size() > 3;
            if (!zContains) {
                listV0 = zhm.d0.V0(listV0, 3);
            }
            aim.e eVarB3 = u.b();
            List list10 = listV0;
            ArrayList arrayList2 = new ArrayList(w.t(list10, 10));
            Iterator it8 = list10.iterator();
            while (it8.hasNext()) {
                arrayList2.add(a9e.a.b(b0Var.f123633b, (p) it8.next(), false, true, qVar));
            }
            eVarB3.addAll(arrayList2);
            if (z) {
                eVarB3.add(new LargeActionButtonDelegate.Model("COLLAPSE_BUTTON_OTHER_POCKET", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(zContains ? com.revolut.feature.subaccount.impl.R$string.bill_accounts_payments_picker_action_show_less : com.revolut.feature.subaccount.impl.R$string.bill_accounts_payments_picker_action_show_more, null, null, 14), false, null, null, o.ANOTHER_SUBACCOUNT, null, 744));
            }
            zhm.a0.x(b0.f(u.a(eVarB3), new ListSubheaderDelegate.Model("ITEM_ID_HEADER_DIFFERENT_POCKET", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.subaccount_payments_picker_already_linked_payments_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)), eVarB2);
            List list11 = (List) linkedHashMap.get(o.BLOCKED);
            if (list11 == null) {
                list11 = f0.f322471a;
            }
            if (list11.isEmpty()) {
                list = f0.f322471a;
            } else {
                List listC = u.c(new CellDetailsChevronDelegate.Model("ITEM_ID_BLOCKED_PAYMENTS", new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.subaccount_payments_picker_action_blocked_payments, null, null, 14), f2.INTERNAL, 0, null, null, 2040));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                list = listC;
            }
            zhm.a0.x(list, eVarB2);
            boolean zN = ue0.e.n((List) linkedHashMap.get(o.SUBSCRIPTION));
            boolean zN2 = ue0.e.n((List) linkedHashMap.get(o.RECURRING));
            aim.e eVarB4 = u.b();
            if (zN) {
                eVarB4.add(b0.e());
            }
            if (zN2) {
                eVarB4.add(b0.b());
            }
            zhm.a0.x(b0.f(u.a(eVarB4), new ListSubheaderDelegate.Model("ITEM_ID_OTHER_OPTIONS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.bill_accounts_payments_picker_more_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)), eVarB2);
            eVarA = u.a(eVarB2);
        }
        return new e8e.q(new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.subaccount_common_confirm, null, null, 14), eVarA);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        FieldSearchScreenContract$InputData fieldSearchScreenContract$InputData = ((ei1.m) this.f116247b).f126353a;
        ei1.e eVar = (ei1.e) this.f116248c;
        List suggestions = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        if (suggestions.isEmpty()) {
            List listC = u.c(ei1.m.a(eVar.f126345b, fieldSearchScreenContract$InputData.d));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        aim.e eVarB = u.b();
        if (fieldSearchScreenContract$InputData.d) {
            eVarB.add(new RowDelegate.Model("ADD_MANUALLY_ID", null, new TextLocalisedClause(com.revolut.feature.address.common.api.R$string.address_component_search_search_enter_manually_button, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906));
        }
        List<AddressFieldSuggestion> list = suggestions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (AddressFieldSuggestion addressFieldSuggestion : list) {
            String value = addressFieldSuggestion.getValue();
            TextClause textClause = new TextClause(addressFieldSuggestion.getDisplayName(), (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
            String displayCode = addressFieldSuggestion.getDisplayCode();
            arrayList.add(new RowDelegate.Model(value, null, textClause, null, 0, displayCode != null ? new TextClause(displayCode, (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122) : null, null, null, 0, null, addressFieldSuggestion.isEnabled(), null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868826));
        }
        eVarB.addAll(arrayList);
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        String str;
        int i;
        char c2;
        List list;
        coa.a aVar = (coa.a) this.f116247b;
        eoa.e eVar = (eoa.e) this.f116248c;
        yhm.r rVar = (yhm.r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        List list2 = (List) rVar.f314201a;
        od0.i iVar = (od0.i) rVar.f314202b;
        boolean zBooleanValue = ((Boolean) rVar.f314203c).booleanValue();
        boolean z = aVar.f;
        boolean z3 = aVar.e;
        if (z) {
            List listL = v.l(eVar.b(list2, soa.c.REVOLUT_X_MARKETING, zBooleanValue, z3));
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            List listL2 = v.l(eVar.b(list2, soa.c.CRYPTOCURRENCY_VOLATILITY, zBooleanValue, z3));
            yp0.b.k(listL2, 0, 0, 0, 0, 31);
            return zhm.d0.E0(listL2, listL);
        }
        pp3.a aVar2 = (pp3.a) iVar.f224257a;
        boolean z4 = false;
        qv0.i[] elements = {eVar.b(list2, soa.c.MARKETING, zBooleanValue, z3), eVar.b(list2, soa.c.PERSONALIZED_THIRD_PARTY, zBooleanValue, z3)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL3 = kotlin.collections.d.L(elements);
        yp0.b.k(listL3, 0, 0, 0, 0, 31);
        RowDelegate.Model modelB = eVar.b(list2, soa.c.TRADING_STOCKS_VOLATILITY, zBooleanValue, z3);
        RowDelegate.Model modelB2 = eVar.b(list2, soa.c.COMMODITY_VOLATILITY, zBooleanValue, z3);
        RowDelegate.Model modelB3 = eVar.b(list2, soa.c.CRYPTOCURRENCY_VOLATILITY, zBooleanValue, z3);
        RowDelegate.Model model = null;
        if (aVar2 != null) {
            RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bell, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), z4, z4, 6);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_notification_settings_credit_collection_title, null, null, 14);
            TextLocalisedClause[] elements2 = {aVar2.f238251a ? new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_notification_settings_state_push, null, null, 14) : null, aVar2.f238252b ? new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_notification_settings_state_email, null, null, 14) : null, aVar2.f238253c ? new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_notification_settings_state_sms, null, null, 14) : null, aVar2.d ? new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_notification_settings_state_phone, null, null, 14) : null, aVar2.e ? new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_notification_settings_state_whatsapp, null, null, 14) : null, aVar2.f ? new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_notification_settings_state_ivr, null, null, 14) : null};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            CompositeClause compositeClause = new CompositeClause(kotlin.collections.d.L(elements2), eoa.e.f127877b, null, null, 12);
            Intrinsics.checkNotNullParameter(compositeClause, "<this>");
            i = 2;
            str = "elements";
            list = listL3;
            c2 = 0;
            model = new RowDelegate.Model("credit_collection_notification", image24, textLocalisedClause, null, 0, new CapitalizedClause(compositeClause), null, null, 0, null, false, null, false, null, null, null, null, null, null, aVar2, null, 0, 0, 0, 0, 532676568);
        } else {
            str = "elements";
            i = 2;
            c2 = 0;
            list = listL3;
        }
        qv0.i[] iVarArr = new qv0.i[4];
        iVarArr[c2] = modelB;
        iVarArr[1] = modelB2;
        iVarArr[i] = modelB3;
        iVarArr[3] = model;
        Intrinsics.checkNotNullParameter(iVarArr, str);
        List listL4 = kotlin.collections.d.L(iVarArr);
        yp0.b.k(listL4, 0, 0, 0, 0, 31);
        RowDelegate.Model modelB4 = eVar.b(list2, soa.c.REVOLUT_PAY_DELIVERY_TRACKING, zBooleanValue, z3);
        RowDelegate.Model modelB5 = eVar.b(list2, soa.c.REVOLUT_PAY_FLIGHT_TRACKING, zBooleanValue, z3);
        qv0.i[] iVarArr2 = new qv0.i[i];
        iVarArr2[c2] = modelB4;
        iVarArr2[1] = modelB5;
        Intrinsics.checkNotNullParameter(iVarArr2, str);
        List listL5 = kotlin.collections.d.L(iVarArr2);
        yp0.b.k(listL5, 0, 0, 0, 0, 31);
        return zhm.d0.E0(listL5, zhm.d0.E0(listL4, list));
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        m1 m1Var = (m1) this.f116247b;
        eq5.r rVar = (eq5.r) this.f116248c;
        y yVar = (y) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(yVar, "<destruct>");
        CryptoAddress cryptoAddress = (CryptoAddress) yVar.f288491a;
        FiatCryptoMoney fiatCryptoMoney = (FiatCryptoMoney) yVar.f288492b;
        FiatCryptoMoney fiatCryptoMoney2 = (FiatCryptoMoney) yVar.f288493c;
        eq5.p pVar = (eq5.p) yVar.d;
        FiatCryptoWithdrawLimits fiatCryptoWithdrawLimits = (FiatCryptoWithdrawLimits) yVar.e;
        yhm.r rVar2 = (yhm.r) yVar.f;
        x0 x0Var = m1Var.f128292b;
        xi0.b bVar = cryptoAddress.f71060b;
        CryptoWithdrawLimits cryptoWithdrawLimits = cryptoAddress.f71067n;
        n1 n1Var = (n1) rVar.f128314m.getContent();
        List list = n1Var != null ? n1Var.f128295a : null;
        if (list == null) {
            list = f0.f322471a;
        }
        FiatCryptoWithdrawLimits fiatCryptoWithdrawLimitsC = x0Var.c(bVar, cryptoWithdrawLimits, list);
        xi0.b bVar2 = (xi0.b) rVar2.f314201a;
        nqi.c cVar = (nqi.c) rVar2.f314202b;
        wk5.a aVar = (wk5.a) rVar2.f314203c;
        FundingSource fundingSource = rVar.i;
        boolean zF = Intrinsics.f(bVar2, fundingSource != null ? fundingSource.f92241b : null);
        yp5.f fVar = m1Var.f128291a;
        od0.i.Companion.getClass();
        return fVar.h(bVar2, cVar, fiatCryptoMoney, fiatCryptoMoney2, pVar, cryptoAddress, fiatCryptoWithdrawLimits, od0.h.a(fiatCryptoWithdrawLimitsC), rVar.f128313l, zF, aVar, rVar.f128312j);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        List listQ;
        List listQ2;
        Object next;
        char c2;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        eq8.l lVar = (eq8.l) this.f116247b;
        k0 k0Var = (k0) this.f116248c;
        c0 content = (c0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List list = content.f128370a;
        if (list.isEmpty()) {
            return (List) iii.c.f(lVar.f128393a, new eq8.g0(k0Var, 1), new eq8.h0(k0Var, 1), new dob.a(k0Var, 29));
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list2) {
            if (((dp8.b) obj5).e == dp8.h.COMPLETED) {
                arrayList.add(obj5);
            }
        }
        List listP0 = zhm.d0.P0(arrayList, new i0());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : list2) {
            if (((dp8.b) obj6).e == dp8.h.PLANNED) {
                arrayList2.add(obj6);
            }
        }
        List listP02 = zhm.d0.P0(arrayList2, new j0());
        int i = 14;
        int i2 = 12;
        if (listP0.isEmpty()) {
            listQ = f0.f322471a;
        } else {
            if (listP0.size() > 1) {
                dj0.d.Companion.getClass();
                dj0.d dVarO = dj0.d.e;
                int i3 = 0;
                for (Object obj7 : listP0) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        v.s();
                        throw null;
                    }
                    dVarO = i3 == 0 ? ((dp8.b) obj7).f : pyd.c.O(dVarO, ((dp8.b) obj7).f);
                    i3 = i5;
                }
                textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_overview_section_completed_pay_all, u.c(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
            } else {
                textLocalisedClause3 = null;
            }
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("LIST_ID_SUBHEADER_COMPLETED_TASKS", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_overview_section_completed_title, v1.c.v(listP0), null, 12), (ResourceImage) null, false, false, (Clause) textLocalisedClause3, true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946);
            List<dp8.b> list3 = listP0;
            ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
            for (dp8.b challenge : list3) {
                Intrinsics.checkNotNullParameter(challenge, "challenge");
                String str = challenge.f116831a;
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_overview_section_completed_item_name, u.c(challenge.d), null, 12);
                DateTime dateTime = challenge.f116836j;
                arrayList3.add(new wh(str, new RowDelegate.Model(str, null, textLocalisedClause4, null, 0, dateTime != null ? r51.a.a(dateTime) ? new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_overview_section_completed_item_completed_today, null, null, i) : new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_overview_section_completed_item_completed_date, u.c(new TimeClause(dateTime.getMillis(), new TimeClause.Format.DayAndMonth(0), null, null, 12)), null, 12) : null, null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_overview_section_completed_item_pay, u.c(new MoneyClause(challenge.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, challenge, null, 0, 0, 0, 0, 532675546), m0.a(challenge), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
                i = 14;
            }
            yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
            listQ = i2b.a.q(model, arrayList3);
        }
        if (listP02.isEmpty()) {
            listQ2 = f0.f322471a;
        } else {
            ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("LIST_ID_SUBHEADER_OPEN_TASKS", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_overview_section_open_title, v1.c.v(listP02), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            List<dp8.b> list4 = listP02;
            ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
            for (dp8.b challenge2 : list4) {
                List coparents = content.f128371b;
                Intrinsics.checkNotNullParameter(challenge2, "challenge");
                Intrinsics.checkNotNullParameter(coparents, "coparents");
                Iterator it8 = coparents.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (Intrinsics.f(((vd8.a) next).f287813a, challenge2.f116833c)) {
                        break;
                    }
                }
                vd8.a aVar = (vd8.a) next;
                int i6 = l0.f128395a[challenge2.f116837l.ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        c2 = 14;
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_item_frequency_daily, null, null, 14);
                    } else if (i6 == 3) {
                        c2 = 14;
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_item_frequency_weekly, null, null, 14);
                    } else {
                        if (i6 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c2 = 14;
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_item_frequency_monthly, null, null, 14);
                    }
                    textLocalisedClause = textLocalisedClause2;
                } else {
                    c2 = 14;
                    textLocalisedClause = null;
                }
                Image contactImage = aVar != null ? new ContactImage((String) null, aVar.e, (String) null, (String) null, (String) null, ngm.n.n(aVar), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4061) : LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_user, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48);
                String str2 = challenge2.f116831a;
                arrayList4.add(new wh(str2, new RowDelegate.Model(str2, new RowDelegate.Model.MainImage.Image40(contactImage, null, null, false, null, false, 60), new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_overview_section_open_item_name, u.c(challenge2.d), null, i2), null, 0, textLocalisedClause, null, null, 0, new RowDelegate.Model.c.b(new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_overview_section_open_item_amount, u.c(new MoneyClause(challenge2.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, challenge2, null, 0, 0, 0, 0, 532675544), m0.a(challenge2), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
                i2 = 12;
            }
            yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
            listQ2 = i2b.a.q(model2, arrayList4);
        }
        return i2b.a.o(listQ, listQ2);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        bw0.m mVar;
        TextLocalisedClause textLocalisedClause;
        CellDetailsActionDelegate.Model model;
        TextLocalisedClause textLocalisedClause2;
        int i;
        esj.f0 f0Var = (esj.f0) this.f116247b;
        esj.o oVar = (esj.o) this.f116248c;
        esj.w content = (esj.w) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        boolean z = oVar.f128978b;
        SetOverallBudgetScreenContract$InputData setOverallBudgetScreenContract$InputData = f0Var.f128974c;
        w80.b bVar = f0Var.f128973b;
        dj0.d dVar = content.f;
        uzi.b bVar2 = content.f128985a;
        String strE = bVar.e(dVar);
        dj0.d dVar2 = content.f;
        bw0.h hVar = new bw0.h(strE, u80.o.b(new u80.g(dVar2, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), true, null, Boolean.valueOf(f0Var.d.a("AMOUNT_LIST_ID")), z, false, false, false, null, 8084);
        dj0.d dVar3 = content.f128987c;
        if (dVar2.e(dVar3)) {
            int i2 = esj.e0.f128970b[bVar2.f284679a.ordinal()];
            if (i2 == 1) {
                i = com.revolut.retail.feature.impl.budgeting.R$string.analytics_budget_screen_input_subtitle_last_month_format;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = com.revolut.retail.feature.impl.budgeting.R$string.analytics_budget_screen_input_subtitle_last_week_format;
            }
            mVar = new bw0.m(new TextLocalisedClause(i, u.c(new MoneyClause(content.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), bw0.l.INFO, null, false, null, 28);
        } else {
            mVar = new bw0.m(new TextLocalisedClause(com.revolut.retail.feature.impl.budgeting.R$string.analytics_budgets_overview_min_amount_hint, u.c(new MoneyClause(content.f128987c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, null, 16);
        }
        List listC = u.c(new CenteredAmountDelegate.Model("AMOUNT_LIST_ID", null, hVar, null, mVar, null, null, false, false, dVar2.f115083b, null, 1514));
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.feature.impl.budgeting.R$string.analytics_budgets_overview_cycle_section_title, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
        uzi.c cVar = bVar2.f284679a;
        int i3 = bVar2.f284680b;
        int i5 = esj.e0.f128970b[cVar.ordinal()];
        if (i5 == 1) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.impl.budgeting.R$string.analytics_cycle_monthly_on, u.c(Integer.valueOf(i3)), null, 12);
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.impl.budgeting.R$string.analytics_cycle_weekly_on, u.c(((cnd.b) f0Var.f128972a).a(i3)), null, 12);
        }
        CellDetailsActionDelegate.Model model2 = new CellDetailsActionDelegate.Model("BUDGET_CYCLE_LIST_ID", textLocalisedClause3, 0, resourceImage, textLocalisedClause, false, false, null, null, 0, 0, 32736);
        bsj.a aVar = setOverallBudgetScreenContract$InputData.f101562a;
        bsj.a aVar2 = bsj.a.UPDATE;
        if (aVar == aVar2) {
            int i6 = content.f128986b;
            model = new CellDetailsActionDelegate.Model("CATEGORY_BUDGETS_LIST_ID", new TextLocalisedClause(com.revolut.retail.feature.impl.budgeting.R$string.analytics_set_spending_budget_screen_categories_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_pie_chart, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), i6 == 0 ? new TextLocalisedClause(com.revolut.retail.feature.impl.budgeting.R$string.analytics_budget_screen_categories_banner_set_up, null, null, 14) : new TextLocalisedQuantityClause(R$plurals.analytics_budget_screen_categories_banner_number_of_categories, Integer.valueOf(i6), (List) null, (Style) null, 28), false, false, null, null, 0, 0, 32736);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        } else {
            model = null;
        }
        qv0.i[] elements = {model2, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        ArrayList arrayListU = w.u(v.k(listC, listL));
        TextNavBarMenuItem textNavBarMenuItem = new TextNavBarMenuItem("RESET_BUDGET_MENU_ITEM_ID", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_reset, null, null, 14), null, null, 12);
        if (aVar != aVar2) {
            textNavBarMenuItem = null;
        }
        List listL2 = v.l(textNavBarMenuItem);
        boolean z3 = dVar2.f(dj0.d.e) && dVar2.e(dVar3);
        int i21 = esj.e0.f128969a[aVar.ordinal()];
        if (i21 == 1) {
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.uicomponent.R$string.common_action_continue, null, null, 14);
        } else {
            if (i21 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.uicomponent.R$string.common_action_confirm, null, null, 14);
        }
        return new x(arrayListU, listL2, z3, true, textLocalisedClause2, f0Var.b());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v0 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model, still in use, count: 2, list:
          (r5v0 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model) from 0x00f7: MOVE (r20v0 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model) = (r5v0 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model)
          (r5v0 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model) from 0x00e6: MOVE (r20v2 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model) = (r5v0 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object m(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dn8.k.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        cul.v vVar = (cul.v) this.f116247b;
        evl.c cVar = ((eul.j) this.f116248c).f129642a;
        yhm.r rVar = (yhm.r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        SourcePocketWrapper sourcePocketWrapper = (SourcePocketWrapper) rVar.f314201a;
        boolean zBooleanValue = ((Boolean) rVar.f314202b).booleanValue();
        TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) rVar.f314203c;
        int i = eul.i.f129641a[vVar.f109175a.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new f3(cVar.c(sourcePocketWrapper.f91794a), cVar.a(sourcePocketWrapper.f91794a, tradingLegalEntityInformation, null), null, zBooleanValue, h3.ACTIVE, zBooleanValue);
            }
            throw new NoWhenBranchMatchedException();
        }
        Data data = vVar.B;
        Amount amount = sourcePocketWrapper.f91795b;
        SourcePocket sourcePocket = sourcePocketWrapper.f91794a;
        return new f3(cVar.c(sourcePocket), cVar.a(sourcePocket, tradingLegalEntityInformation, null), e4i.c.b(amount, new eul.d(3), new eul.d(4), null, 25), zBooleanValue, (h3) iii.c.f(data, new eul.d(5), new eu4.b0(11), new et6.a(6)), zBooleanValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ee  */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r30, java.lang.Object r31, java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dn8.k.o(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        ac4.g gVar = (ac4.g) this.f116247b;
        evi.d dVar = (evi.d) this.f116248c;
        AsftTerminal asftTerminal = (AsftTerminal) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(asftTerminal, "asftTerminal");
        List<AsftTimeSlot> listF = ((nd.n) gVar.f3032c).f(asftTerminal.f98743l, asftTerminal.i, dVar.f129960b, ((AsftTimeSlotPickerScreenContract$InputData) gVar.f3031b).f98901a);
        if (listF != null && !listF.isEmpty()) {
            AsftTimeSlot asftTimeSlot = dVar.f129961c;
            Intrinsics.checkNotNullParameter(listF, "<this>");
            int iIndexOf = listF.indexOf(asftTimeSlot);
            ArrayList arrayList = new ArrayList(w.t(listF, 10));
            for (AsftTimeSlot asftTimeSlot2 : listF) {
                arrayList.add(new c10(i2b.a.b(asftTimeSlot2.f98749a), asftTimeSlot2));
            }
            return u.c(new a10("ID_TIME_SLOT_PICKER", arrayList, iIndexOf));
        }
        return f0.f322471a;
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        ewc.g gVar = (ewc.g) this.f116247b;
        dwc.e eVar = (dwc.e) this.f116248c;
        List limits = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(limits, "limits");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj5 : limits) {
            cuc.e eVar2 = ((OutboundTransactionLimit) obj5).f85480j;
            Object arrayList = linkedHashMap.get(eVar2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(eVar2, arrayList);
            }
            ((List) arrayList).add(obj5);
        }
        List list = (List) linkedHashMap.get(cuc.e.INDIVIDUAL);
        List list2 = (List) linkedHashMap.get(cuc.e.PIX);
        List list3 = (List) linkedHashMap.get(cuc.e.OTHER);
        List list4 = (List) linkedHashMap.get(cuc.e.EMPTY);
        aim.e eVarB = u.b();
        List list5 = list;
        if (list5 != null && !list5.isEmpty()) {
            eVarB.addAll(yp0.b.g(gVar.a(list), new ListSubheaderDelegate.Model("INDIVIDUAL_LIMITS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_india_section_individuals, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, false, 6), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65458), null, 0, 0, 126));
        }
        List list6 = list2;
        if (list6 != null && !list6.isEmpty()) {
            eVarB.addAll(yp0.b.g(gVar.a(list2), new ListSubheaderDelegate.Model("PIX_LIMITS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_section_pix_limits, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        }
        List list7 = list3;
        if (list7 != null && !list7.isEmpty()) {
            ArrayList arrayListA = gVar.a(list3);
            bwc.d dVar = eVar.d;
            eVarB.addAll(yp0.b.g(arrayListA, new ListSubheaderDelegate.Model("OTHER_LIMITS_SUBHEADER_LIST_ID", (Image) null, (Clause) ((dVar == null ? -1 : ewc.f.f130160a[dVar.ordinal()]) == 1 ? new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_india_section_other, null, null, 14) : new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_section_other, null, null, 14)), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, false, 6), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65458), null, 0, 0, 126));
        }
        List list8 = list4;
        if (!(list8 == null || list8.isEmpty())) {
            ArrayList arrayListA2 = gVar.a(list4);
            yp0.b.k(arrayListA2, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayListA2);
        }
        return u.a(eVarB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0558  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r64, java.lang.Object r65, java.lang.Object r66) {
        /*
            Method dump skipped, instruction units count: 1464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dn8.k.r(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Style] */
    /* JADX WARN: Type inference failed for: r13v7 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) throws IOException {
        Object next;
        JuniorBankingProfile juniorBankingProfile;
        ?? r132;
        TextLocalisedClause textLocalisedClause;
        List listC;
        RowDelegate.Model model;
        RowDelegate.Model model2;
        RowDelegate.Model model3;
        RowDelegate.Model model4;
        Clause compositeClause;
        hha.x0 x0Var;
        Clause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        TextLocalisedClause textLocalisedClause4;
        AnalyticsContext analyticsContext;
        int i = this.f116246a;
        int i2 = 10;
        int i3 = 13;
        int i5 = 12;
        int i6 = 6;
        boolean z = true;
        Object[] objArr = null;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        String str = null;
        Object obj5 = this.f116248c;
        Object obj6 = this.f116247b;
        switch (i) {
            case 0:
                l lVar = (l) obj6;
                vf0.h hVar = (vf0.h) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                Map map = (Map) hVar.f288433a;
                List list = (List) hVar.f288434b;
                do3.n nVar = (do3.n) hVar.f288435c;
                SavingsProductData savingsProductData = (SavingsProductData) hVar.d;
                String str2 = ((a) obj5).f116232a;
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((rcd.a) next).f253250a, str2)) {
                        }
                    } else {
                        next = null;
                    }
                }
                rcd.a aVar = (rcd.a) next;
                if (aVar != null && (juniorBankingProfile = (JuniorBankingProfile) map.get(aVar.f253251b)) != null) {
                    aim.e eVarB = u.b();
                    wi0.b bVarY = do3.q.y(nVar);
                    wi0.b.Companion.getClass();
                    if (bVarY.equals(wi0.b.f297771r)) {
                        r132 = 0;
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_home_discover_subtitle_ias, null, null, 14);
                    } else {
                        r132 = 0;
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior_savings.impl.R$string.junior_saving_request_review_overview_details, v.k(juniorBankingProfile.f77099b, lVar.f116249a.g(savingsProductData, false, null, true)), null, 12);
                    }
                    FullScreenStateDelegate.Model model5 = new FullScreenStateDelegate.Model("HEADER", textLocalisedClause, null, new ComplexImage.Overlapped(v.k(new UserAvatarImage(new UserNamePlaceholder.Default(te0.w.I(nVar), 0), r132, r132, 6), new ContactImage(juniorBankingProfile.f77103j, (String) null, (String) null, (String) null, (String) null, ta6.a.t(juniorBankingProfile), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4062))), zj.OVERLAPPED, null, false, null, null, false, 0, 0, 32740);
                    yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
                    eVarB.add(model5);
                    boolean z3 = false;
                    RowDelegate.Model model6 = new RowDelegate.Model("SHARED_ACCOUNT", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_wallet, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, i6), new TextLocalisedClause(com.revolut.feature.junior_savings.impl.R$string.junior_saving_request_review_overview_explanation1_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.junior_savings.impl.R$string.junior_saving_request_review_overview_explanation1_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
                    boolean z4 = false;
                    RowDelegate.Model model7 = new RowDelegate.Model("CONTROL", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_switches, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, i6), new TextLocalisedClause(com.revolut.feature.junior_savings.impl.R$string.junior_saving_request_review_overview_explanation2_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.junior_savings.impl.R$string.junior_saving_request_review_overview_explanation2_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
                    boolean z6 = false;
                    List listK = v.k(model6, model7, new RowDelegate.Model("FLEXIBLE", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_percent, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z6, z6, i6), new TextLocalisedClause(com.revolut.feature.junior_savings.impl.R$string.junior_saving_request_review_overview_explanation3_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.junior_savings.impl.R$string.junior_saving_request_review_overview_explanation3_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                    yp0.b.k(listK, 0, 0, 0, 0, 31);
                    eVarB.addAll(listK);
                    return new d(u.a(eVarB), true);
                }
                return new d(iii.c.b(null, null, 6, true), false);
            case 1:
                do8.v vVar = (do8.v) obj6;
                do8.i iVar = (do8.i) obj5;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter((RemoteLoginInvitation) obj2, "<unused var>");
                go8.c cVar = vVar.f116470a;
                Data profileData = iVar.f116451a;
                Data remoteLoginInvitationData = iVar.f116452b;
                Data activeDevicePresentData = iVar.f116453c;
                Intrinsics.checkNotNullParameter(profileData, "profileData");
                Intrinsics.checkNotNullParameter(remoteLoginInvitationData, "remoteLoginInvitationData");
                Intrinsics.checkNotNullParameter(activeDevicePresentData, "activeDevicePresentData");
                return zhm.d0.E0((List) iii.c.f(remoteLoginInvitationData, new dmj.a(i3), new dmb.m(7), new dbg.b(vVar, i6)), (List) iii.c.f(t1.u(profileData, remoteLoginInvitationData, activeDevicePresentData), new gn.a(cVar, i2), new gcc.c(29), new gna.i(cVar, 2)));
            case 2:
                Clause clause = (Clause) obj6;
                dv5.f fVar = (dv5.f) obj5;
                whf.p transactionsContent = (whf.p) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
                if (transactionsContent.f297646a.isEmpty()) {
                    return f0.f322471a;
                }
                if (clause != null) {
                    fVar.getClass();
                    listC = u.c(dv5.f.f(clause));
                } else {
                    listC = null;
                }
                if (listC == null) {
                    listC = f0.f322471a;
                }
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                List listB = pt5.f.b(fVar, transactionsContent, false, "", false, 8);
                yp0.b.k(listB, 0, R$attr.uikit_dp0, 0, 0, 29);
                return i2b.a.o(listC, listB);
            case 3:
                dx5.e eVar = (dx5.e) obj5;
                xzg.k content = (xzg.k) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                xzg.d dVarC = content.c();
                f01.c cVar2 = ((dx5.p) obj6).f120890a;
                String str3 = dVarC.f309979g;
                if (str3 == null) {
                    str3 = "";
                }
                int iA = cVar2.a(str3);
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                Integer numValueOf = Integer.valueOf(iA);
                if (iA == 0) {
                    numValueOf = null;
                }
                return new PairedImage(new CurrencyImage(eVar.f120871a.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), LayeredImage.Companion.b(companion, numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_apps, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 4.0f, null, null, 48), R$attr.uikit_colorWidgetBackground, null);
            case 4:
                dyf.f fVar2 = (dyf.f) obj6;
                lxf.a aVar2 = (lxf.a) obj5;
                hxf.f bookings = (hxf.f) obj2;
                ((Boolean) obj3).getClass();
                Throwable th10 = (Throwable) obj4;
                Intrinsics.checkNotNullParameter(bookings, "bookings");
                List list2 = bookings.f156593a;
                List list3 = bookings.f156594b;
                if (list2.isEmpty() && th10 != null) {
                    return zhm.d0.E0(dyf.f.b(!list3.isEmpty(), aVar2), dyf.f.a());
                }
                List list4 = bookings.f156593a;
                boolean zIsEmpty = list3.isEmpty();
                boolean z11 = !zIsEmpty;
                if (!list4.isEmpty()) {
                    return zhm.d0.E0(dyf.f.b(z11, aVar2), fVar2.f121102a.b(list4));
                }
                if (zIsEmpty) {
                    FullScreenStateDelegate.Model model8 = new FullScreenStateDelegate.Model("EMPTY_BOOKINGS_STATE_ID", aVar2.f200566a, aVar2.f200567b, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D300", null, null, null, 30)), zj.REGULAR, aVar2.f200568c, false, null, null, false, 0, 0, 31680);
                    yp0.b.l(model8, 0, 0, 0, 0, null, false, 63);
                    return u.c(model8);
                }
                FullScreenStateDelegate.Model model9 = new FullScreenStateDelegate.Model("PAST_OR_CANCELLED_BOOKINGS_BUTTON_ID", aVar2.d, aVar2.e, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D300", null, null, null, 30)), zj.REGULAR, aVar2.f, false, null, null, false, 0, 0, 31680);
                yp0.b.l(model9, 0, 0, 0, 0, null, false, 63);
                return u.c(model9);
            case 5:
                e07.l lVar2 = (e07.l) obj6;
                e07.e eVar2 = (e07.e) obj5;
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Set set = (Set) pair.f186386b;
                boolean z12 = eVar2.d;
                boolean z29 = eVar2.e;
                aim.e eVarB2 = u.b();
                RowDelegate.Model model10 = new RowDelegate.Model("ITEM_ID_PRO_ACCOUNT", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_merchant, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i6), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_settings_items_account_settings_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
                cs6.c cVar3 = cs6.c.INVOICE;
                if (set.contains(cVar3)) {
                    boolean z31 = false;
                    model = new RowDelegate.Model("ITEM_ID_INVOICE_SETTINGS", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z31, z31, i6), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_settings_items_invoice_settings_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
                } else {
                    model = null;
                }
                if (((et6.l0) lVar2.f121455b).k()) {
                    boolean z41 = false;
                    model2 = new RowDelegate.Model("ITEM_ID_TAXES", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_coins_earning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z41, z41, i6), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_settings_items_taxes_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
                } else {
                    model2 = null;
                }
                if (set.contains(cs6.c.PAYMENT_LINK) || set.contains(cVar3)) {
                    boolean z49 = false;
                    model3 = new RowDelegate.Model("ITEM_ID_BRANDING", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_image, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z49, z49, i6), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_business_profile_items_branding_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
                } else {
                    model3 = null;
                }
                if (((ha1.f) lVar2.f121454a.f203896c).b() == null && !z12) {
                    model4 = null;
                } else {
                    boolean z54 = false;
                    model4 = new RowDelegate.Model("ITEM_ID_TIPPING", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z54, z54, i6), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_business_profile_items_tipping_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
                }
                RowDelegate.Model[] elements = {model10, model, model2, model3, model4};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                eVarB2.addAll(listL);
                aim.e eVarB3 = u.b();
                if (z29) {
                    boolean z74 = false;
                    RowDelegate.Model model11 = new RowDelegate.Model("ITEM_ID_INVITE_TO_PRO", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_present, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z74, z74, i6), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_settings_items_referrals_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
                    yp0.b.l(model11, 0, 0, 0, 0, null, false, 63);
                    eVarB3.add(model11);
                }
                eVarB2.addAll(u.a(eVarB3));
                boolean z83 = false;
                List listC2 = u.c(new RowDelegate.Model("ITEM_ID_MERCHANT_TERMS", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_refinancing, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z83, z83, i6), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_merchant_settings_items_merchant_terms_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                eVarB2.addAll(listC2);
                boolean z89 = false;
                RowDelegate.Model model12 = new RowDelegate.Model("ITEM_ID_ACCOUNT_CLOSURE", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_heart_broken, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z89, z89, i6), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_account_closure_account_actions_close_account, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
                yp0.b.l(model12, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(model12);
                return u.a(eVarB2);
            case 6:
                return IndicationKt.indication$lambda$1((Indication) obj6, (InteractionSource) obj5, (Modifier) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 7:
                List content2 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                e1c.d dVar = (e1c.d) ((a3e.u) obj6).f1129b;
                z0 z0Var = ((e1c.j) obj5).f121952b;
                Intrinsics.checkNotNullParameter(content2, "content");
                List list5 = content2;
                ArrayList arrayList = new ArrayList(w.t(list5, 10));
                int i21 = 0;
                for (Object obj7 : list5) {
                    int i22 = i21 + 1;
                    if (i21 < 0) {
                        v.s();
                        throw null;
                    }
                    e1c.k kVar = (e1c.k) obj7;
                    hha.d dVar2 = kVar.f121953a;
                    z0 z0Var2 = kVar.f121954b;
                    hha.x0 x0Var2 = z0Var2.f;
                    String str4 = z0Var2.f152378a;
                    Object[] objArr5 = objArr;
                    y0 y0Var = z0Var2.e;
                    double d = y0Var.f152373a;
                    boolean z96 = z;
                    Clause clauseA = fgk.b.a(dVar.f121947a, dVar2);
                    String strValueOf = String.valueOf(i21);
                    boolean zF = Intrinsics.f(str4, z0Var != null ? z0Var.f152378a : str);
                    RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_premium, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10), Intrinsics.f(str4, z0Var != null ? z0Var.f152378a : null) ? new AccentCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60);
                    if (z0Var2.f152380c) {
                        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_upsell_select_plan_current, null, null, 14);
                        Clause[] clauseArr = new Clause[2];
                        clauseArr[objArr5 == true ? 1 : 0] = clauseA;
                        clauseArr[z96 ? 1 : 0] = textLocalisedClause5;
                        compositeClause = new CompositeClause(v.k(clauseArr), new DotDividerClause((Integer) null), null, null, 12);
                    } else {
                        compositeClause = clauseA;
                    }
                    TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(com.revolut.feature.rev_points.api.R$plurals.rev_points_upsell_select_plan_reward, Double.valueOf(d), v.k(new NumberClause(new BigDecimal(String.valueOf(d)), null, null, null, 14), new MoneyClause(y0Var.f152374b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), (Style) null, 24);
                    if (x0Var2 != null) {
                        x0Var = x0Var2;
                        textLocalisedClause2 = new MoneyClause(x0Var.f152372b, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(2, 2), false, false, 5), null, null, 12);
                    } else {
                        x0Var = x0Var2;
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_upsell_select_plan_free, null, null, 14);
                    }
                    Clause clause2 = textLocalisedClause2;
                    if (x0Var != null) {
                        int i32 = e1c.c.f121946a[x0Var.f152371a.ordinal()];
                        if (i32 == z96) {
                            textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_upsell_select_plan_monthly, null, null, 14);
                        } else {
                            if (i32 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_upsell_select_plan_annually, null, null, 14);
                        }
                        textLocalisedClause3 = textLocalisedClause4;
                    } else {
                        textLocalisedClause3 = null;
                    }
                    arrayList.add(new RowDelegate.Model(strValueOf, image40, compositeClause, null, 0, textLocalisedQuantityClause, null, null, 0, new RowDelegate.Model.c.b(clause2, textLocalisedClause3, null, false, 124), false, null, zF, null, null, null, null, null, null, new e1c.b(z0Var2), null, 0, 0, 0, 0, 532667352));
                    i21 = i22;
                    objArr = objArr5 == true ? 1 : 0;
                    z = true;
                    str = null;
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 8:
                return a(obj2, obj3, obj4);
            case 9:
                return b(obj2, obj3, obj4);
            case 10:
                return c(obj2, obj3, obj4);
            case 11:
                return d(obj2, obj3, obj4);
            case 12:
                return e(obj2, obj3, obj4);
            case 13:
                return g(obj2, obj3, obj4);
            case 14:
                BackendEntityItem backendEntityItem = (BackendEntityItem) obj5;
                List entities = (List) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Throwable th11 = (Throwable) obj4;
                Intrinsics.checkNotNullParameter(entities, "entities");
                return ((eb0.a) obj6).f124279a.d(backendEntityItem, entities, th11 != null ? ad0.k.f3217a : zBooleanValue ? ad0.l.f3218a : ad0.j.f3216a);
            case 15:
                ebf.r rVar = (ebf.r) obj5;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
                n2l.j jVarB = n2l.l.b(((ebf.h) obj6).d);
                return ebf.r.a(jVarB != null ? rVar.f124332a.h(jVarB, tradingLegalEntityInformation.f105106a, null) : null);
            case 16:
                cbh.j jVar = (cbh.j) obj6;
                ebh.c cVar4 = (ebh.c) obj5;
                List transactions = (List) obj2;
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                Object[] objArr6 = jVar.f22822h && transactions.size() < 100;
                if (transactions.isEmpty() && objArr6 == true) {
                    return ebh.c.a(5);
                }
                if (!zBooleanValue2 && objArr6 == false) {
                    z = false;
                }
                return cVar4.b(transactions, z, jVar);
            case 17:
                return h(obj2, obj3, obj4);
            case 18:
                return i(obj2, obj3, obj4);
            case 19:
                return j(obj2, obj3, obj4);
            case 20:
                return k(obj2, obj3, obj4);
            case 21:
                return l(obj2, obj3, obj4);
            case 22:
                cul.v vVar2 = (cul.v) obj6;
                eul.c cVar5 = (eul.c) obj5;
                Pair pair2 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                aul.b bVar = (aul.b) pair2.f186385a;
                Asset asset = (Asset) pair2.f186386b;
                String strJ = bVar == aul.b.FIAT ? cp5.d.J(asset.f104721c) : null;
                InvestInputValue investInputValue = vVar2.e;
                String strB = cVar5.f129632a.b(investInputValue.f106844a, asset);
                boolean zD = e1.D(investInputValue.f106844a);
                boolean z100 = investInputValue.f106846c;
                return new bw0.h(strB, strJ, null, zD, null, z100 ? Boolean.TRUE : investInputValue.f106845b, !investInputValue.d, z100, bw0.e.None, null, null, null, 31316);
            case 23:
                return m(obj2, obj3, obj4);
            case 24:
                return n(obj2, obj3, obj4);
            case 25:
                return o(obj2, obj3, obj4);
            case 26:
                return p(obj2, obj3, obj4);
            case 27:
                return q(obj2, obj3, obj4);
            case 28:
                return r(obj2, obj3, obj4);
            default:
                f0c.l lVar3 = (f0c.l) obj6;
                c0c.k kVar2 = (c0c.k) obj5;
                z revPointsAccountStatus = (z) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
                if (!(revPointsAccountStatus instanceof m1c.y)) {
                    if (!Intrinsics.f(revPointsAccountStatus, z.a.f201476a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Opted-out state received in RevPoints Redeem screen");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    FullScreenStateDelegate.Model model13 = new FullScreenStateDelegate.Model("OPTED_OUT_ERROR_STATE_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32756);
                    yp0.b.l(model13, 0, 0, 0, 0, null, false, 63);
                    return new c0c.m(u.c(model13));
                }
                f0c.i iVar2 = lVar3.f131078a;
                m1c.x revPointsAccount = ((m1c.y) revPointsAccountStatus).f201475a;
                ((f0c.j) iVar2).getClass();
                Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_rev_points, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
                RevPoints revPoints = revPointsAccount.f201472c;
                aim.e eVarB4 = u.b();
                m70.a.t(kotlin.jvm.internal.t0.f186434a);
                eVarB4.add(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                eVarB4.add(v1.c.g(0, revPoints, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 4));
                List listC3 = u.c(new LabelNavBarMenuItem("REV_POINTS_BALANCE_MENU_ID", resourceImage, new CompositeClause(u.a(eVarB4), null, null, null, 14), null, null, 504));
                Set featuredRewardItemsVisible = kVar2.f;
                Intrinsics.checkNotNullParameter(featuredRewardItemsVisible, "featuredRewardItemsVisible");
                ArrayList arrayList2 = new ArrayList();
                Iterator it9 = featuredRewardItemsVisible.iterator();
                while (it9.hasNext()) {
                    String str5 = ((q0) it9.next()).f201444h;
                    if (str5 != null) {
                        arrayList2.add(str5);
                    }
                }
                if (arrayList2.isEmpty()) {
                    analyticsContext = null;
                } else {
                    String strK0 = zhm.d0.k0(arrayList2, ", ", null, null, 0, null, 62);
                    AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
                    RevPointsFeaturedRewardsContext.a aVarNewBuilder = RevPointsFeaturedRewardsContext.newBuilder();
                    aVarNewBuilder.c();
                    ((RevPointsFeaturedRewardsContext) aVarNewBuilder.f49761b).setItemsShown(strK0);
                    w0 w0VarA = aVarNewBuilder.a();
                    companion2.getClass();
                    analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
                }
                aim.e eVarB5 = u.b();
                List list6 = (List) kVar2.e.getContent();
                if (list6 != null) {
                    eVarB5.addAll(list6);
                }
                f0c.d dVar3 = lVar3.f131080c;
                Data revPointFeaturedRewards = kVar2.f20211c;
                fub.h hVar2 = fub.i.Companion;
                int i33 = R$attr.uikit_colorAccentNeutral_10;
                Intrinsics.checkNotNullParameter(revPointFeaturedRewards, "revPointFeaturedRewards");
                eVarB5.addAll((List) iii.c.f(revPointFeaturedRewards, new ewh.x(dVar3, 27), new ewh.y(i5), new f0c.b(dVar3, str, i33, objArr4 == true ? 1 : 0)));
                f0c.h hVar3 = lVar3.d;
                Data placement = kVar2.d;
                Intrinsics.checkNotNullParameter(placement, "placement");
                eVarB5.addAll((List) iii.c.f(placement, new ewh.x(hVar3, 28), new ewh.y(i3), new ec8.q(hVar3, 21)));
                f0c.n nVar2 = lVar3.f131079b;
                Data productItems = kVar2.f20210b;
                f0c.o oVar = (f0c.o) nVar2;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(productItems, "productItems");
                eVarB5.addAll((List) iii.c.f(productItems, new eu7.c(oVar, 27), new ewh.y(15), new ec8.q(oVar, 22)));
                eVarB5.addAll(zjh.j.v(lVar3.e, kVar2.f20212g));
                return new c0c.m(analyticsContext, listC3, u.a(eVarB5));
        }
    }
}

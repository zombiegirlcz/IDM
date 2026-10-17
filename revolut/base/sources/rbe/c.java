package rbe;

import android.os.Parcelable;
import aw0.b4;
import aw0.k1;
import aw0.k7;
import aw0.ka;
import aw0.o9;
import aw0.p9;
import aw0.t0;
import aw0.w3;
import aw0.x3;
import aw0.y4;
import aw0.z3;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFee;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubVatSummary;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimCancellation;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimDetails;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimExpenseSummary;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimProgress;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimStatus;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimTotalSummary;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import com.revolut.feature.revolutpay.promoted_merchants.models.merchants.PromotedMerchant;
import com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreenContract$SelectedBalanceInfo;
import com.revolut.feature.trading.api.FeatureTradingApi$Toggles$RelatedCollections;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.retail.wealth.resources.R$plurals;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import com.youTransactor.uCube.rpc.Constants;
import ds6.g0;
import gu7.h2;
import gu7.k2;
import gu7.l2;
import ik7.h;
import ip0.ak0;
import ip0.c20;
import ip0.e8;
import ip0.qd0;
import ip0.r40;
import ip0.rh;
import ip0.u8;
import ip0.xk;
import ip0.y10;
import ip0.zj;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jb3.l;
import jel.x2;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import nr6.c0;
import pyb.s;
import rhj.m;
import ri4.o;
import rk7.n;
import ru6.r;
import ru6.t;
import ruk.f;
import ruk.i;
import rv7.k;
import ryi.g;
import ryj.a0;
import ryj.y;
import tof.a3;
import u09.p;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;
import zjh.j;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f253032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f253033c;

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f253031a = i;
        this.f253032b = obj2;
        this.f253033c = obj3;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        CompositeClause compositeClause;
        TextLocalisedClause textLocalisedClause;
        n nVar = (n) this.f253032b;
        rk7.e eVar = (rk7.e) this.f253033c;
        CFACClaimDetails claimDetails = (CFACClaimDetails) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(claimDetails, "claimDetails");
        ArrayList arrayList = claimDetails.d;
        CFACClaimCancellation cFACClaimCancellation = claimDetails.f;
        CFACClaimExpenseSummary cFACClaimExpenseSummary = claimDetails.e;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i5 = 0;
        for (Object obj5 : arrayList) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                v.s();
                throw null;
            }
            CFACClaimProgress cFACClaimProgress = (CFACClaimProgress) obj5;
            int i21 = i5;
            long j2 = cFACClaimProgress.f74962b;
            CFACClaimStatus status = cFACClaimProgress.f74961a;
            TimeClause timeClause = new TimeClause(j2, new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12);
            Intrinsics.checkNotNullParameter(status, "status");
            int[] iArr = h.f161905a;
            switch (iArr[status.ordinal()]) {
                case 1:
                    i = R$string.cfac_my_claims_claim_details_progress_timeline_claim_in_review;
                    break;
                case 2:
                    i = R$string.cfac_my_claims_claim_details_progress_timeline_claim_declined;
                    break;
                case 3:
                    i = R$string.cfac_my_claims_claim_details_progress_timeline_submitting;
                    break;
                case 4:
                    i = R$string.cfac_my_claims_claim_details_progress_timeline_submitted;
                    break;
                case 5:
                    i = R$string.cfac_my_claims_claim_details_progress_timeline_paid;
                    break;
                case 6:
                    i = R$string.cfac_my_claims_claim_details_progress_timeline_claim_submission_failed;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, null, null, 14);
            Intrinsics.checkNotNullParameter(status, "status");
            switch (iArr[status.ordinal()]) {
                case 1:
                    i2 = R$attr.uikit_colorAccent;
                    break;
                case 2:
                    i2 = R$attr.uikit_colorRed;
                    break;
                case 3:
                    i2 = R$attr.uikit_colorAccent;
                    break;
                case 4:
                    i2 = R$attr.uikit_colorAccent;
                    break;
                case 5:
                    i2 = R$attr.uikit_colorGreen;
                    break;
                case 6:
                    i2 = R$attr.uikit_colorRed;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            boolean z = v.j(arrayList) == i21;
            CFACClaimStatus cFACClaimStatus = ((CFACClaimProgress) d0.b0(arrayList)).f74961a;
            CFACClaimStatus cFACClaimStatus2 = CFACClaimStatus.DECLINED;
            if (cFACClaimStatus == cFACClaimStatus2 && status != CFACClaimStatus.SUBMITTED && z) {
                if (status == CFACClaimStatus.IN_REVIEW) {
                    i3 = i2;
                    textLocalisedClause = new TextLocalisedClause(R$string.cfac_my_claims_claims_details_progress_vertical_more_information_needed, null, null, 14);
                } else {
                    i3 = i2;
                    textLocalisedClause = null;
                }
                TextLocalisedClause[] elements = {textLocalisedClause, new TextLocalisedClause(R$string.cfac_my_claims_claims_details_progress_vertical_see_details, null, new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) Boolean.valueOf(status == cFACClaimStatus2), "SEE CLAIM DECLINED DETAILS", false), 10)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                compositeClause = new CompositeClause(kotlin.collections.d.L(elements), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            } else {
                i3 = i2;
                compositeClause = null;
            }
            arrayList2.add(new r40("PROGRESS VERTICAL TIMELINE", timeClause, textLocalisedClause2, compositeClause, null, null, i3, false, null, 0, 0, 0, null, 16304));
            i5 = i6;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("TOTAL EXPENSE", new TextLocalisedClause(R$string.cfac_claim_review_claim_details_amounts_total_expenses, null, null, 14), new MoneyClause(cFACClaimExpenseSummary.f74954a.f74964a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.cfac_claim_review_claim_details_amounts_coverage, null, null, 14);
        int i22 = cFACClaimExpenseSummary.f74955b;
        CFACClaimTotalSummary cFACClaimTotalSummary = cFACClaimExpenseSummary.f74954a;
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("COVERAGE INFO", textLocalisedClause3, new PercentageClause(i22, (PercentageClause.Format) null, (Custom) null, 6), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        dj0.d dVar = cFACClaimTotalSummary.d;
        CellDetailsDelegate.Model model3 = dVar != null ? new CellDetailsDelegate.Model("EXCESS PAYABLE", new TextLocalisedClause(R$string.cfac_claim_review_claim_details_amounts_excess_payable, null, null, 14), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null;
        CellDetailsDelegate.Model model4 = new CellDetailsDelegate.Model("CLAIMED_AMOUNT", new TextLocalisedClause(R$string.cfac_claim_review_claim_details_amounts_claimed_amount, null, null, 14), new MoneyClause(cFACClaimTotalSummary.f74965b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        dj0.d dVar2 = cFACClaimTotalSummary.f74966c;
        CellDetailsDelegate.Model[] elements2 = {model, model2, model3, model4, dVar2 != null ? new CellDetailsDelegate.Model("CLAIMED_AMOUNT", new TextLocalisedClause(R$string.cfac_my_claims_claim_details_expense_info_paid_amount, null, null, 14), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List listL = kotlin.collections.d.L(elements2);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        ArrayList arrayListE0 = d0.E0(listL, arrayList2);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.cfac_my_claims_claim_details_cancellation_reason, null, null, 14);
        TextClause textClause = new TextClause(cFACClaimCancellation.f74935a.f74940a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        List listC = !cFACClaimCancellation.f74936b.isEmpty() ? u.c(new ActionsView.Item("PLAIN TEXT WARNING ACTION", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.cfac_my_claims_claim_details_view_documents, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), new ResourceImage(R$drawable.uikit_icn_24_documents_pair, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668)) : null;
        if (listC == null) {
            listC = f0.f322471a;
        }
        List listC2 = u.c(new sa("PLAIN TEXT WARNING", (Clause) textLocalisedClause4, (Clause) textClause, listC, false, (c20) null, (y10) null, (Object) null, 240));
        yp0.b.k(listC2, 0, 0, 0, 0, 31);
        return d0.E0((List) iii.c.f(eVar.f254754b, new rj7.b(nVar, 10), new m(nVar, 12), new c(nVar, claimDetails, 6)), d0.E0(listC2, arrayListE0));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r56, java.lang.Object r57, java.lang.Object r58) {
        /*
            Method dump skipped, instruction units count: 1551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rbe.c.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x045b  */
    /* JADX WARN: Type inference failed for: r61v0 */
    /* JADX WARN: Type inference failed for: r61v1 */
    /* JADX WARN: Type inference failed for: r61v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r63, java.lang.Object r64, java.lang.Object r65) {
        /*
            Method dump skipped, instruction units count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rbe.c.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        nr6.b bVar = (nr6.b) this.f253032b;
        ru6.w wVar = (ru6.w) this.f253033c;
        fu6.h paymentDetails = (fu6.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        nr6.w wVar2 = paymentDetails.f138086a;
        aim.e eVarB = u.b();
        ArrayList arrayList = wVar2.f218585a;
        ArrayList arrayList2 = wVar2.f218587c;
        Iterator it8 = d0.P0(d0.E0(wVar2.f218586b, arrayList), new ru6.v()).iterator();
        while (it8.hasNext()) {
            eVarB.add(wVar.f257459a.a((AcquiringOrderPayment) it8.next()));
        }
        if (bVar.d != c0.AUTHORISED) {
            if (!arrayList2.isEmpty()) {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_fees, null, null, 14);
                dj0.d.Companion.getClass();
                dj0.d dVar = dj0.d.e;
                int i = 0;
                dj0.d dVarO = dVar;
                for (Object obj5 : arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    dVarO = i == 0 ? ((AcquiringPaymentFee) obj5).f73365a : pyd.c.O(dVarO, ((AcquiringPaymentFee) obj5).f73365a);
                    i = i2;
                }
                eVarB.add(new CellDetailsDelegate.Model("LIST_ID_PAYMENTS_FEES", textLocalisedClause, new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8), 0, new t(arrayList2), null, null, null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, 0, 31208));
            }
            eVarB.add(new CellDetailsDelegate.Model("LIST_ID_PAYMENTS_NET_AMOUNT", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_net, null, null, 14), new MoneyClause(wVar2.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        return u.a(eVarB);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        List listC;
        List listC2;
        twk.e eVar;
        Clause clauseA;
        int i;
        i iVar = (i) this.f253032b;
        ruk.w wVar = (ruk.w) this.f253033c;
        x2 target = (x2) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(target, "content");
        dj0.d current = iVar.e;
        if (current != null) {
            twk.e mode = iVar.f257601c;
            int i2 = ruk.v.f257622a[mode.ordinal()];
            if (i2 == 1) {
                eVar = twk.e.PERC;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = twk.e.ABS;
            }
            f parcel = new f(eVar);
            Intrinsics.checkNotNullParameter(current, "current");
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_analyst_price_targets_overview_content_high, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
            dj0.d dVar = target.f173604a;
            dj0.d dVar2 = target.f173605b;
            dj0.d dVar3 = target.f173606c;
            Clause clauseA2 = twk.b.a(mode, current, textLocalisedClause, dVar);
            Clause clauseA3 = twk.b.a(mode, current, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_analyst_price_targets_overview_content_average, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), dVar3);
            Clause clauseA4 = twk.b.a(mode, current, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_analyst_price_targets_overview_content_low, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), dVar2);
            int[] iArr = twk.a.f275047a;
            int i3 = iArr[mode.ordinal()];
            if (i3 == 1) {
                clauseA = twk.d.a(1, null, new MoneyClause.Format.Headers(null, null, null, false, false, 23), dVar3);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                clauseA = twk.d.b(dVar3, current);
            }
            CompositeClause compositeClauseF = v1.c.f(v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_analyst_price_targets_target, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_analyst_price_targets_analysts_count, u.c(Integer.valueOf(target.d)), null, 12)), null);
            int i5 = iArr[mode.ordinal()];
            if (i5 == 1) {
                i = R$drawable.uikit_icn_24_percent;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_fees;
            }
            listC = u.c(new rh("priceTarget.fanChart.chart", new k1(clauseA, compositeClauseF, LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 12.0f, Float.valueOf(16.0f), null, 32), 24), new x3(new w3(current.f115082a, null), new w3(target.f173604a.f115082a, null), new w3(dVar3.f115082a, null), new w3(dVar2.f115082a, null), null, new b4(twk.d.a(2, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, current), clauseA2, clauseA3, clauseA4, null), true, z3.HIDE_WHEN_CLOSE), parcel, 240));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
        } else {
            listC = f0.f322471a;
        }
        dj0.d dVar4 = iVar.e;
        if (dVar4 != null) {
            dj0.d dVar5 = target.f173606c;
            dj0.d dVar6 = target.f173606c;
            int i6 = dVar5.f(dVar4) ? com.revolut.retail.wealth.resources.R$string.wealth_trading_instrument_price_forecast_description : com.revolut.retail.wealth.resources.R$string.wealth_trading_instrument_price_forecast_description_negative;
            TextClause textClause = new TextClause(wVar.f257623a.f103880a.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            MoneyClause moneyClause = new MoneyClause(dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            TextClause textClause2 = new TextClause(String.valueOf(target.d), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            MoneyClause moneyClause2 = new MoneyClause(dVar6, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dVar6.f115082a);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(dVar4.f115082a);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            BigDecimal bigDecimalT = dVar6.f(dVar4) ? l.t(bigDecimalValueOf, bigDecimalValueOf2) : l.t(bigDecimalValueOf, bigDecimalValueOf2).negate();
            Intrinsics.h(bigDecimalT);
            Clause[] elements = {textClause, moneyClause, textClause2, moneyClause2, xqi.a.c(bigDecimalT, false, false, false, false, false, 71)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listC2 = u.c(new PlainTextDelegate.Model("price-target-analyst-description-list-id", (Clause) null, (Clause) new TextLocalisedClause(i6, kotlin.collections.d.L(elements), null, 12), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518));
            yp0.b.k(listC2, 0, 0, 0, 0, 31);
        } else {
            listC2 = f0.f322471a;
        }
        return i2b.a.o(i2b.a.o(listC, listC2), (List) iii.c.f(iVar.f257600b, new r(2), new ru5.m(5), new o(wVar, 10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r24, java.lang.Object r25, java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rbe.c.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        Object next;
        k kVar = (k) this.f253032b;
        rv7.f fVar = (rv7.f) this.f253033c;
        l2 documents = (l2) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(documents, "documents");
        String str = fVar.f257723b;
        String strL = str != null ? m70.a.l(str) : null;
        List list = documents.f146785b;
        List list2 = list;
        Iterator it8 = list2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((k2) next).f146778a, strL)) {
                break;
            }
        }
        k2 k2Var = (k2) next;
        xv7.h hVar = kVar.f257733a;
        List documents2 = k2Var != null ? k2Var.f146779b : null;
        if (documents2 == null) {
            documents2 = f0.f322471a;
        }
        Intrinsics.checkNotNullParameter(documents2, "documents");
        List list3 = documents2;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        Iterator it9 = list3.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            h2 h2Var = (h2) it9.next();
            String strQ = j6.a.q("DOCUMENT_ITEM_ID_", h2Var.f146757b);
            String str2 = h2Var.f146756a;
            RowDelegate.Model.MainImage.Image24 image24A = str2 != null ? xu7.d.a(hVar.f309219a, str2, Integer.valueOf(R$attr.uikit_colorAccent)) : null;
            TextClause textClauseA = sr7.c.a(h2Var.f146757b, null);
            String str3 = h2Var.f146758c;
            arrayList.add(new RowDelegate.Model(strQ, image24A, textClauseA, null, 0, str3 != null ? sr7.c.a(str3, null) : null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), false, null, false, null, null, null, null, null, null, h2Var, null, 0, 0, 0, 0, 532675544));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        TextClause textClauseA2 = sr7.c.a(documents.f146784a, null);
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator it10 = list2.iterator();
        while (it10.hasNext()) {
            String str4 = ((k2) it10.next()).f146778a;
            String str5 = str4 == null ? "" : str4;
            if (str4 == null) {
                str4 = "";
            }
            arrayList2.add(new FixedTabs.Item(str5, sr7.c.a(str4, null), (AnalyticsContext) null, 12));
        }
        return new rv7.i(arrayList, textClauseA2, false, arrayList2, strL, list.size() > 1);
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        rx5.k kVar = (rx5.k) this.f253032b;
        rx5.a aVar = (rx5.a) this.f253033c;
        cw5.a content = (cw5.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return gw5.b.a(kVar.f258035a, null, null, content, gw5.a.ROWS, R$attr.uikit_dp0, null, "TRENDING_LIST_ID", f0.f322471a, null, new rrd.l(aVar, 21), null, 6144);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    private final Object j(Object obj2, Object obj3, Object obj4) {
        qv0.i e8Var;
        ryi.k kVar = (ryi.k) this.f253032b;
        ryi.c cVar = (ryi.c) this.f253033c;
        svi.w refundInfo = (svi.w) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(refundInfo, "refundInfo");
        if (refundInfo.f266012a.isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("LIST_ID_NO_CONTENT", new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_refund_no_refunds_item_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_refund_no_refunds_item_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31680);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return u.c(model);
        }
        qv0.i[] iVarArr = new qv0.i[2];
        int size = cVar.f258377b.size();
        int size2 = refundInfo.f266012a.size();
        u8 u8Var = new u8("LIST_ID_REFUNDS_AMOUNT", new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_refund_entries_item_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_refund_entries_item_subtitle, u.c(String.valueOf(size2)), null, 12), new NumberClause(size, (NumberClause.Format.Compact) null, (Custom) null, 6), (ResourceImage) kVar.f258388b.getValue(), (ResourceImage) kVar.f258387a.getValue(), size < size2, size > 0, null, 63874);
        yp0.b.l(u8Var, 0, 0, 0, 0, null, false, 63);
        iVarArr[0] = u8Var;
        g gVar = cVar.f258378c;
        if (gVar.f258382b != null) {
            e8Var = new e8("LIST_ID_REFUNDS_AMOUNT", new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_refund_total_refund_item_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new nw0.a(new BigDecimal(String.valueOf(gVar.f258382b.doubleValue())), new MoneyClause(gVar.f258381a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 0, 0, 496);
            yp0.b.l(e8Var, 0, 0, 0, 0, null, false, 63);
        } else {
            CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("LIST_ID_REFUNDS_AMOUNT", new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_refund_total_refund_item_title, null, null, 14), new MoneyClause(gVar.f258381a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), 0, null, null, j2.H6, null, null, false, 0, 0, 32696);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            e8Var = model2;
        }
        iVarArr[1] = e8Var;
        return v.k(iVarArr);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        List listU;
        y yVar = (y) this.f253032b;
        String str = (String) this.f253033c;
        List terms = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(terms, "terms");
        if (terms.isEmpty() && zBooleanValue) {
            return yVar.f258426a;
        }
        int i = 10;
        if (str.length() == 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj5 : terms) {
                String strValueOf = String.valueOf(kotlin.text.f0.P0(((p) obj5).f276142b));
                Intrinsics.i(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                Object objO = linkedHashMap.get(upperCase);
                if (objO == null) {
                    objO = v0.a.o(linkedHashMap, upperCase);
                }
                ((List) objO).add(obj5);
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                List list = (List) entry.getValue();
                a0 a0Var = new a0(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ListSubheaderDelegate.Model(j6.a.q("GLOSSARY_LETTER_SUBHEADER_ID_", str2), (Image) null, (Clause) new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(w.t(list2, i));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(new a0(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), y.b((p) it8.next())));
                }
                arrayList.add(i2b.a.q(a0Var, arrayList2));
                i = 10;
            }
            listU = w.u(arrayList);
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj6 : terms) {
                if (kotlin.text.d0.J(((p) obj6).f276142b, str, true)) {
                    arrayList3.add(obj6);
                }
            }
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
            Iterator it9 = arrayList3.iterator();
            while (it9.hasNext()) {
                arrayList4.add(y.b((p) it9.next()));
            }
            listU = arrayList4;
        }
        if (listU.isEmpty()) {
            listU = yVar.f258427b;
        }
        return listU;
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        ArrayList arrayListF0;
        rzb.d dVar = (rzb.d) this.f253032b;
        ozb.e eVar = dVar.f258583b;
        Data data = (Data) this.f253033c;
        w19.f content = (w19.f) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        if (zBooleanValue) {
            arrayListF0 = rzb.d.a();
        } else {
            List list = content.f293808c;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            int i = 0;
            for (Object obj5 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                w19.e eVar2 = (w19.e) obj5;
                String strValueOf = String.valueOf(i);
                TextClause textClause = new TextClause(eVar2.f293804b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Clause clauseA = eVar.a(eVar2.f293805c);
                String str = eVar2.d;
                int iA = dVar.f258582a.a(str);
                if (iA == 0) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Icon ", str, " not found"));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                    iA = R$drawable.uikit_icn_24_revolut;
                }
                arrayList.add(new RowDelegate.Model(strValueOf, new RowDelegate.Model.MainImage.Image24(new ResourceImage(iA, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), textClause, null, 0, clauseA, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                i = i2;
            }
            RevPointsTextWithLinks revPointsTextWithLinks = content.e;
            arrayListF0 = revPointsTextWithLinks != null ? d0.F0(new TextDelegate.Model("TERMS_DISCLAIMER_LIST_ID", eVar.a(revPointsTextWithLinks), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036), arrayList) : arrayList;
        }
        return d0.E0(j.v(dVar.f258584c, data), arrayListF0);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        s0c.c cVar = (s0c.c) this.f253032b;
        s0c.f fVar = (s0c.f) this.f253033c;
        List relatedLoyaltyTransactions = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(relatedLoyaltyTransactions, "relatedLoyaltyTransactions");
        aim.e eVarB = u.b();
        q qVar = cVar.f258928b;
        if (qVar != null) {
            ArrayList arrayListH = ((s) fVar.f258937b).h(relatedLoyaltyTransactions, qVar);
            yp0.b.k(arrayListH, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayListH);
        }
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("CELL_DELEGATE_TOTAL_EARNED_POINTS_ITEM_ID", new t0((Clause) new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_related_transactions_total, null, null, 14), (Image) null, 0, false, 30), nub.a.q(fVar.f258936a.f83900b, null, new nub.e(p9.ALWAYS), null, 5), null, null, null, null, 0, null, false, false, null, null, 32760);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        return u.a(eVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0367  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r57, java.lang.Object r58, java.lang.Object r59) {
        /*
            Method dump skipped, instruction units count: 1805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rbe.c.n(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        s44.q qVar = (s44.q) this.f253032b;
        s44.g gVar = (s44.g) this.f253033c;
        ky3.a currentAddress = (ky3.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(currentAddress, "currentAddress");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_address_v2_title, u.c(gVar.f259754a), null, 12);
        TextLocalisedClause textLocalisedClauseA = s44.q.a(gVar.f259755b);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_continue, null, null, 14);
        ky3.b bVar = currentAddress.f190616a;
        ky3.b bVar2 = ky3.b.EDITABLE;
        boolean z = bVar == bVar2 || bVar == ky3.b.NOT_EDITABLE;
        Address address = currentAddress.f190618c;
        List list = gVar.e;
        uh1.a aVar = qVar.f259770a;
        aim.e eVarB = u.b();
        ky3.b bVar3 = ky3.b.MISSING_INFO;
        Integer numValueOf = bVar == bVar3 ? Integer.valueOf(R$attr.uikit_colorOrange) : null;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_address_v2_current_address_verify_address, null, new Click(30, (Integer) null, (Object) null, "id_verify_address", false), 10);
        ky3.b bVar4 = ky3.b.IN_REVIEW;
        RowDelegate.Model model = new RowDelegate.Model("id_current_address", null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_address_v2_current_address, null, null, 14), null, 0, new TextClause(uh1.a.a(aVar, address), (Style) null, numValueOf, false, (o9) null, (List) null, 122), bVar == bVar4 ? textLocalisedClause3 : null, null, 0, bVar == bVar2 || bVar == bVar3 || bVar == bVar4 ? new pf(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_address_v2_edit, null, null, 14), null, null, false, null, null, 510) : null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867738);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj5 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            Address address2 = (Address) obj5;
            RowDelegate.Model model2 = new RowDelegate.Model(a0.d.n("id_previous_address_", i), null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_address_v2_previous_address, null, null, 14), null, 0, new TextClause(uh1.a.a(aVar, address2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_address_v2_remove, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, address2, null, 0, 0, 0, 0, 532675546);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model2);
            i = i2;
        }
        eVarB.addAll(arrayList);
        RowDelegate.Model model3 = new RowDelegate.Model("id_add_new_address", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_plus, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_address_v2_add_address, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model3);
        return new s44.m(textLocalisedClause, textLocalisedClauseA, textLocalisedClause2, u.a(eVarB), z);
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        int i;
        TaxHubVatSummary.Summary summary;
        s47.u uVar = (s47.u) this.f253032b;
        s47.j jVar = (s47.j) this.f253033c;
        s47.i reviewInfo = (s47.i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
        aim.e eVarB = u.b();
        g0 g0Var = reviewInfo.f259783a;
        LinkedHashMap linkedHashMap = g0Var.f117237a;
        int i2 = g0Var.f117238b;
        int i3 = 0;
        CounterTextDelegate.Model model = null;
        if (linkedHashMap.isEmpty()) {
            boolean z = jVar.e > i2;
            if (z) {
                i = com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_no_transactions_title_filters;
            } else {
                int i5 = s47.t.f259799a[jVar.f259785a.ordinal()];
                if (i5 == 1) {
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_no_transactions_title_inbound;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_no_transactions_title_outbound;
                }
            }
            eVarB.add(w47.b.c(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(z ? com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_no_transactions_subtitle_filters : com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_no_transactions_subtitle, null, null, 14)));
        } else {
            CounterTextDelegate.Model.Companion companion = CounterTextDelegate.Model.INSTANCE;
            CounterTextDelegate.Model modelC = CounterTextDelegate.Model.Companion.c(companion, "LIST_ID_TRANSACTION_INFO_AMOUNT", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_review_details_total_amount, null, null, 14), new MoneyClause(g0Var.d, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12), null, false, 2024);
            yp0.b.l(modelC, 0, R$attr.uikit_dp0, 0, 0, null, false, 61);
            CounterTextDelegate.Model modelC2 = CounterTextDelegate.Model.Companion.c(companion, "LIST_ID_TRANSACTION_INFO_COUNT", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_review_details_transactions, null, null, 14), new TextClause(String.valueOf(i2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, 2024);
            yp0.b.l(modelC2, 0, R$attr.uikit_dp0, 0, 0, null, false, 61);
            List listK = v.k(modelC, modelC2);
            int i6 = R$attr.uikit_dp4;
            eVarB.add(new xk("LIST_ID_TRANSACTION_INFO_GRID", listK, 2, Float.valueOf(8.0f), null, 0, R$attr.uikit_dp8, i6, i6, 63728));
            TaxHubVatSummary taxHubVatSummary = reviewInfo.f259784b;
            dj0.d dVar = (taxHubVatSummary == null || (summary = taxHubVatSummary.f73490b) == null) ? null : summary.f73494c;
            if (dVar != null) {
                CounterTextDelegate.Model modelC3 = CounterTextDelegate.Model.Companion.c(companion, "LIST_ID_VAT_INFO", yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_review_details_estimated_vat, null, null, 14), new ImageClause(R$drawable.uikit_icn_24_info_legacy, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28))), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, true, 2024);
                yp0.b.l(modelC3, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
                model = modelC3;
            }
            if (model != null) {
                eVarB.add(model);
            }
            for (Map.Entry entry : g0Var.f117237a.entrySet()) {
                LocalDate dateGroup = (LocalDate) entry.getKey();
                List list = (List) entry.getValue();
                q qVar = g0Var.f117239c;
                aim.e eVarB2 = u.b();
                String strS = h30.l.s("LIST_ID_TRANSACTION_LIST_HEADER_", dateGroup);
                TimeClause timeClause = new TimeClause(ebm.a.P(dateGroup), new TimeClause.Format.DayAndMonth(i3), null, null, 12);
                jVar.getClass();
                Set set = jVar.d;
                Intrinsics.checkNotNullParameter(dateGroup, "dateGroup");
                Iterable iterable = (List) jVar.f.get(dateGroup);
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : iterable) {
                    if (!set.contains((a3) obj5)) {
                        arrayList.add(obj5);
                    }
                }
                SelectableDelegate.Model modelD = w47.b.d(strS, timeClause, arrayList.size(), list.size(), dateGroup);
                yp0.b.r(modelD, 0, R$attr.uikit_dp0, 0, 0, 13);
                eVarB2.add(modelD);
                List<a3> list2 = list;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                for (a3 transaction : list2) {
                    SelectableDelegate.Model modelP = ((anf.l) uVar.f259800a).p(transaction, qVar, new thf.h(false, false, 7));
                    Intrinsics.checkNotNullParameter(transaction, "transaction");
                    arrayList2.add(SelectableDelegate.Model.e(modelP, null, !set.contains(transaction) ? qd0.SELECTED : qd0.UNSELECTED, null, null, 4194235));
                }
                yp0.b.k(arrayList2, R$attr.uikit_dp0, 0, 0, 0, 30);
                zhm.a0.x(arrayList2, eVarB2);
                eVarB.addAll(u.a(eVarB2));
                i3 = 0;
            }
        }
        return u.a(eVarB);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        char c2;
        char c3;
        Iterable iterableU;
        List listE0;
        cq9.m mVar = (cq9.m) this.f253032b;
        s4f.f fVar = (s4f.f) this.f253033c;
        xzg.k collectionWithChildren = (xzg.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(collectionWithChildren, "collection");
        s4f.q qVar = (s4f.q) mVar.f108058b;
        Data data = fVar.f259850b;
        List list = data != null ? (List) data.getContent() : null;
        Intrinsics.checkNotNullParameter(collectionWithChildren, "collectionWithChildren");
        if (collectionWithChildren instanceof xzg.l) {
            List list2 = ((xzg.l) collectionWithChildren).d;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            int i = 0;
            for (Object obj5 : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                xzg.d dVar = (xzg.d) obj5;
                boolean z = i % 2 == 0;
                List list3 = dVar.f309981j;
                int size = list3 != null ? list3.size() : 0;
                String str = dVar.f309976a;
                TextClause textClause = new TextClause(dVar.f309978c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                SmallCardDelegate.b.C0425b c0425b = new SmallCardDelegate.b.C0425b(new TextLocalisedQuantityClause(R$plurals.wealth_trading_discovery_stocks_amount_plural, Integer.valueOf(size), u.c(Integer.valueOf(size)), (Style) null, 24), new ResourceImage(R$drawable.uikit_icn_24_view_list, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), null, 4);
                String str2 = dVar.f;
                UrlImage urlImage = str2 != null ? new UrlImage(str2, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : null;
                String str3 = dVar.e;
                SmallCardDelegate.Model model = new SmallCardDelegate.Model(str, urlImage, textClause, c0425b, str3 != null ? new UrlImage(str3, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : null, null, null, new s4f.g(dVar.f309976a), null, 1044432);
                int i3 = R$attr.uikit_dp4;
                yp0.b.l(model, i3, i3, z ? R$attr.uikit_dp16 : i3, !z ? R$attr.uikit_dp16 : i3, qv0.h.LARGE, false, 32);
                arrayList.add(model);
                i = i2;
            }
            c2 = 0;
            c3 = 1;
            listE0 = arrayList;
        } else {
            c2 = 0;
            if (collectionWithChildren instanceof xzg.n) {
                s4f.p pVar = qVar.f259865b;
                xzg.n collectionWithChildren2 = (xzg.n) collectionWithChildren;
                List list4 = collectionWithChildren2.e;
                Intrinsics.checkNotNullParameter(collectionWithChildren2, "collectionWithChildren");
                if (!((jte.d) pVar.f259863a).c(FeatureTradingApi$Toggles$RelatedCollections.f91206c) || list4.isEmpty()) {
                    c3 = 1;
                    iterableU = null;
                } else {
                    c3 = 1;
                    List listC = u.c(new ListSubheaderDelegate.Model("OTHER_COLLECTIONS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_collections_other_collections_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                    List<xzg.d> listV0 = d0.V0(list4, 5);
                    ArrayList arrayList2 = new ArrayList(w.t(listV0, 10));
                    for (xzg.d collection : listV0) {
                        Intrinsics.checkNotNullParameter(collection, "collection");
                        String str4 = collection.f309976a;
                        TextClause textClause2 = new TextClause(collection.f309978c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        int i5 = R$plurals.wealth_trading_discovery_stocks_amount_plural;
                        List list5 = collection.f309981j;
                        SmallCardDelegate.b.C0425b c0425b2 = new SmallCardDelegate.b.C0425b(new TextLocalisedQuantityClause(i5, Integer.valueOf(list5 != null ? list5.size() : 0), u.c(Integer.valueOf(list5 != null ? list5.size() : 0)), (Style) null, 24), new ResourceImage(R$drawable.uikit_icn_24_view_list, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), null, 4);
                        String str5 = collection.f;
                        UrlImage urlImage2 = str5 != null ? new UrlImage(str5, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : null;
                        String str6 = collection.e;
                        SmallCardDelegate.Model model2 = new SmallCardDelegate.Model(str4, urlImage2, textClause2, c0425b2, str6 != null ? new UrlImage(str6, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : null, null, null, new s4f.g(collection.f309976a), null, 1044432);
                        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                        arrayList2.add(model2);
                    }
                    String strQ = j6.a.q("COLLECTIONS_SCROLLER_FOR_", collectionWithChildren2.f310015a);
                    SmallCardDelegate.INSTANCE.getClass();
                    iterableU = w.u(v.k(listC, u.c(new hg(strQ, arrayList2, 2, new y4(SmallCardDelegate.f53351j), null, null, false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28656))));
                }
                if (iterableU == null) {
                    iterableU = f0.f322471a;
                }
                if (list == null) {
                    list = collectionWithChildren2.d;
                }
                List<nel.a0> list6 = list;
                ArrayList arrayList3 = new ArrayList(w.t(list6, 10));
                for (nel.a0 instrumentWithTicker : list6) {
                    nbh.f fVar2 = qVar.f259864a.f277343a;
                    nel.n nVar = instrumentWithTicker.f214560a;
                    s4f.h hVar = new s4f.h(nVar);
                    m70.a.c(kotlin.jvm.internal.t0.f186434a);
                    Intrinsics.checkNotNullParameter(instrumentWithTicker, "instrumentWithTicker");
                    Intrinsics.checkNotNullParameter("", "listPrefix");
                    arrayList3.add(new wh(j6.a.q("", nVar.e), new RowDelegate.Model(nVar.e, new InstrumentImage(nVar.f214596b, 24, Integer.valueOf(R$drawable.uikit_icn_circle_background), Integer.valueOf(R$attr.uikit_colorGrey10)), null, null, fVar2.f(nVar), fVar2.c(nVar), fVar2.d(nVar), fVar2.e(nVar), 3, p1h.a.a(fVar2, instrumentWithTicker.f214560a, instrumentWithTicker.f214561b, null, null, 12), false, false, null, null, null, null, null, hVar, null, 0, 0, 0, 0, 1056960620), f0.f322471a, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                listE0 = d0.E0(iterableU, arrayList3);
            } else {
                c3 = 1;
                listE0 = f0.f322471a;
            }
        }
        s4f.s sVar = (s4f.s) mVar.d;
        Data data2 = fVar.f259849a;
        Data data3 = fVar.d;
        Data dataT = (data2 == null || data3 == null) ? null : t1.t(data2, data3);
        List list7 = dataT != null ? (List) iii.c.f(dataT, new s4b.e(7), new s20.c(18), new o(sVar, 25)) : null;
        if (list7 == null) {
            list7 = f0.f322471a;
        }
        List[] listArr = new List[2];
        listArr[c2] = listE0;
        listArr[c3] = list7;
        return w.u(v.k(listArr));
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        anl.j jVar = (anl.j) this.f253032b;
        s85.f fVar = (s85.f) this.f253033c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        return ((c55.k) jVar.f7820b).a((LoanBackupCard) pair.f186385a, fVar.f260889a, ((LoanDetails) pair.f186386b).f70150l);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object s(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        boolean z;
        Integer numValueOf;
        sae.i iVar;
        sae.h hVar;
        Object model;
        String str;
        sae.n nVar = (sae.n) this.f253032b;
        sae.i iVar2 = (sae.i) this.f253033c;
        sae.h domainContent = (sae.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(domainContent, "domainContent");
        vae.d dVar = nVar.f261394a;
        PaymentBalancePickerScreenContract$SelectedBalanceInfo selectedBalanceInfo = iVar2.f261390b;
        Intrinsics.checkNotNullParameter(domainContent, "domainContent");
        Intrinsics.checkNotNullParameter(selectedBalanceInfo, "selectedBalanceInfo");
        ArrayList arrayList = domainContent.f261387b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (true) {
            ArrayList arrayListG = null;
            String str2 = null;
            if (!it8.hasNext()) {
                ArrayList items = w.u(arrayList2);
                aw0.e eVarA = vae.c.a(iVar2);
                Intrinsics.checkNotNullParameter(items, "items");
                Iterator it9 = items.iterator();
                int i = 0;
                while (true) {
                    if (it9.hasNext()) {
                        koi.j jVar = (koi.j) it9.next();
                        if (!(jVar instanceof RowDelegate.Model) || !((RowDelegate.Model) jVar).J()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                return new sae.k(items, eVarA, i >= 0 ? Integer.valueOf(i) : null);
            }
            k1j.b bVar = (k1j.b) it8.next();
            k1j.c balanceGroupType = bVar.f180282a;
            Intrinsics.checkNotNullParameter(balanceGroupType, "balanceGroupType");
            switch (vae.f.f287282a[balanceGroupType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.card_payment_method_cash_section_debit_title, null, null, 14);
                    textLocalisedClause2 = textLocalisedClause;
                    break;
                case 4:
                case 5:
                case 6:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.card_payment_method_pockets_section_title, null, null, 14);
                    textLocalisedClause2 = textLocalisedClause;
                    break;
                default:
                    textLocalisedClause2 = null;
                    break;
            }
            if (textLocalisedClause2 == null) {
                iVar = iVar2;
                hVar = domainContent;
            } else {
                aim.e eVarB = u.b();
                dj0.d allCashBalancesAmount = domainContent.f261388c;
                Intrinsics.checkNotNullParameter(selectedBalanceInfo, "selectedBalanceInfo");
                Intrinsics.checkNotNullParameter(allCashBalancesAmount, "allCashBalancesAmount");
                Intrinsics.checkNotNullParameter(balanceGroupType, "balanceGroupType");
                int i2 = vae.b.f287280a[balanceGroupType.ordinal()];
                if (i2 != 1) {
                    z = true;
                    numValueOf = i2 != 2 ? i2 != 3 ? null : Integer.valueOf(com.revolut.feature.subscriptionscommon.impl.R$string.payment_method_dd_any_pro_account) : Integer.valueOf(com.revolut.feature.subscriptionscommon.impl.R$string.payment_method_dd_any_joint_account);
                } else {
                    z = true;
                    numValueOf = Integer.valueOf(com.revolut.feature.subscriptionscommon.impl.R$string.card_payment_method_any_cash_account);
                }
                PaymentBalancePickerScreenContract$SelectedBalanceInfo.AllCashAccounts allCashAccounts = PaymentBalancePickerScreenContract$SelectedBalanceInfo.AllCashAccounts.f89223a;
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    boolean zF = Intrinsics.f(selectedBalanceInfo, allCashAccounts);
                    iVar = iVar2;
                    hVar = domainContent;
                    str2 = null;
                    model = new RowDelegate.Model("ANY_CASH_ACCOUNT_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_rates_converter_page, new Color.Solid(R$attr.uikit_colorWhite), new Color.Solid(R$attr.uikit_colorBlue)), zF ? d8l.d.b(z) : null, null, false, null, false, 60), new TextLocalisedClause(iIntValue, null, null, 14), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(allCashBalancesAmount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), true, null, zF, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536859640);
                } else {
                    iVar = iVar2;
                    hVar = domainContent;
                    model = null;
                }
                if (model != null) {
                    eVarB.add(model);
                }
                List<BalanceWrapper> list = bVar.f180284c;
                ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                for (BalanceWrapper balanceWrapper : list) {
                    o2j.q qVar = dVar.f287281a;
                    if (selectedBalanceInfo instanceof PaymentBalancePickerScreenContract$SelectedBalanceInfo.Balance) {
                        str = ((PaymentBalancePickerScreenContract$SelectedBalanceInfo.Balance) selectedBalanceInfo).f89224a;
                    } else {
                        if (!selectedBalanceInfo.equals(allCashAccounts) && !selectedBalanceInfo.equals(PaymentBalancePickerScreenContract$SelectedBalanceInfo.Undefined.f89227a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = str2;
                    }
                    arrayList3.add(qVar.c(balanceWrapper, str, false));
                }
                eVarB.addAll(arrayList3);
                arrayListG = yp0.b.g(u.a(eVarB), new ListSubheaderDelegate.Model(balanceGroupType.name(), (Image) null, (Clause) textLocalisedClause2, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            }
            if (arrayListG != null) {
                arrayList2.add(arrayListG);
            }
            iVar2 = iVar;
            domainContent = hVar;
        }
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        qee.s sVar = (qee.s) this.f253032b;
        scc.d dVar = (scc.d) this.f253033c;
        List merchants = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(merchants, "merchants");
        if (merchants.isEmpty()) {
            return ncc.d.a();
        }
        List list = merchants;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ncc.d) sVar.f245144b).b((PromotedMerchant) it8.next(), false, dVar.f261703c));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016b  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r45, java.lang.Object r46, java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 3524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rbe.c.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ c(rd3.o oVar, od3.l lVar, TextLocalisedClause textLocalisedClause) {
        this.f253031a = 4;
        this.f253032b = lVar;
        this.f253033c = textLocalisedClause;
    }
}

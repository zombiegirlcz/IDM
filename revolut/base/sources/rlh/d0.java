package rlh;

import android.os.Parcelable;
import android.util.Base64;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.backgroundpicker.impl.flow.catalogue.BackgroundCatalogController;
import com.revolut.feature.external_accounts.impl.ui.india.upi.flow.UpiTransferFlowContract$State;
import com.revolut.feature.foreign_currencies.impl.R$string;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.delete.IncomeSorterDeleteContract$InputData;
import com.revolut.feature.transfer.core.impl.quotes.data.network.TransferQuoteService;
import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import com.revolut.feature.transfer.models.quotes.TransferAvailability;
import com.revolut.feature.transfer.models.quotes.TransferQuoteRequest;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSender;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSplit;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSplitOption;
import com.revolut.feature.transfer.models.quotes.TransferQuoteUserIdentifier;
import com.revolut.feature.user_declarations.shared.flows.tracking.flow.TrackingConsentFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits.WaitlistBenefitPreview;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.t1;
import mx0.u1;
import nii.j0;
import nii.y0;
import rp0.p0;
import rp0.s1;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f255051b;

    public /* synthetic */ d0(Object obj2, int i) {
        this.f255050a = i;
        this.f255051b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [xi0.b] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r1v84, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        nrf.g gVar;
        TransferQuoteSplit transferQuoteSplit;
        upf.j iVar;
        String str;
        int i = this.f255050a;
        int i2 = 12;
        int i3 = 1;
        String str2 = null;
        Object obj3 = this.f255051b;
        switch (i) {
            case 0:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                List list = (List) getDefaultLoadingItems.invoke();
                ((qee.s) obj3).getClass();
                return new z(w.f255075a, list);
            case 1:
                Cipher cipher = (Cipher) obj2;
                Intrinsics.checkNotNullParameter(cipher, "cipher");
                byte[] bArrDoFinal = cipher.doFinal(Base64.decode(((rm0.u) obj3).f255169a, 2));
                Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
                return new String(bArrDoFinal, rm0.y.f255172c);
            case 2:
                BackgroundCatalogController.Companion aVar = BackgroundCatalogController.INSTANCE;
                Intrinsics.checkNotNullParameter((RecyclerView) obj2, "it");
                return new ScreenGridLayoutManager(((BackgroundCatalogController) obj3).m2(), 3, 12);
            case 3:
                com.revolut.feature.external_accounts.impl.ui.india.upi.flow.a aVar2 = (com.revolut.feature.external_accounts.impl.ui.india.upi.flow.a) obj3;
                sm6.m result = (sm6.m) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof sm6.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.H2(aVar2.f72944t, new d0(result, 4));
                sm6.l lVar = (sm6.l) result;
                aVar2.I2(lVar.f264373a, lVar.f264374b, lVar.f264375c, aVar2.o.f72935b != null);
                return Unit.f186387a;
            case 4:
                UpiTransferFlowContract$State update = (UpiTransferFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return UpiTransferFlowContract$State.a(update, false, ((sm6.l) ((sm6.m) obj3)).d, 1);
            case 5:
                return UpiTransferFlowContract$State.a((UpiTransferFlowContract$State) obj2, false, ((lg6.b) obj3).f195077b, 1);
            case 6:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list2 = (List) rVar.f314201a;
                xi0.b bVar = (xi0.b) rVar.f314202b;
                String str3 = ((hha.d) rVar.f314203c).f152287a;
                ((rmb.q) obj3).getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list2) {
                    SavingsProduct savingsProduct = ((SavingsProductData) obj4).f86683a;
                    if (savingsProduct.f86619c == ncd.g.SAVINGS_FIXED_TERM && Intrinsics.f(savingsProduct.i, str3)) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((SavingsProductData) it8.next()).f86683a.f86618b);
                }
                List listU = zhm.d0.U(arrayList2);
                 = listU.contains(bVar) ? bVar : 0;
                if ( == 0 && ( = (xi0.b) zhm.d0.d0(listU)) == 0) {
                    throw new IllegalStateException("Fixed-term products for the current pricing plan must not be empty");
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : arrayList) {
                    if (Intrinsics.f(((SavingsProductData) obj5).f86683a.f86618b, )) {
                        arrayList3.add(obj5);
                    }
                }
                return zhm.d0.P0(arrayList3, new rmb.m());
            case 7:
                return new npg.a(((npg.a) obj3).f218205a, (SavingsAccountDetails) zhm.d0.b0((List) obj2));
            case 8:
                SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) obj2;
                Intrinsics.checkNotNullParameter(savingsAccountDetails, "savingsAccount");
                etj.o oVar = (etj.o) ((rnb.m) obj3).d;
                Intrinsics.checkNotNullParameter(savingsAccountDetails, "savingsAccountDetails");
                return oVar.l(new chf.a(oVar, savingsAccountDetails, , 25));
            case 9:
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                List list3 = (List) rVar2.f314201a;
                List list4 = (List) rVar2.f314202b;
                List list5 = (List) rVar2.f314203c;
                aim.e eVarB = zhm.u.b();
                eVarB.add((AnalyticsAccount.Joint.All) obj3);
                eVarB.addAll(list3);
                eVarB.addAll(list4);
                eVarB.addAll(list5);
                return zhm.u.a(eVarB);
            case 10:
                ro2.h update2 = (ro2.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ro2.h.a(update2, null, (qo2.c) obj3, 3);
            case 11:
                ro7.o oVar2 = (ro7.o) obj3;
                po7.f result2 = (po7.f) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!(result2 instanceof po7.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                oVar2.x2(new no7.k(result2, i3));
                return Unit.f186387a;
            case 12:
                com.revolut.feature.user_declarations.shared.flows.tracking.flow.a aVar3 = (com.revolut.feature.user_declarations.shared.flows.tracking.flow.a) obj3;
                qog.d output = (qog.d) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof qog.c) {
                    aVar3.l2(new rm6.c(aVar3, output, , 6), new yi5.b(26));
                } else if (Intrinsics.f(output, qog.b.f248208a)) {
                    oki.h.w2(aVar3.f94687r, TrackingConsentFlowContract$Step.LearnMore.f94684a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                } else {
                    if (!Intrinsics.f(output, qog.a.f248207a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Cancelled output is not supported");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            case 13:
                WaitlistBenefitPreview view = (WaitlistBenefitPreview) obj3;
                t1 event = (t1) obj2;
                rok.a aVar4 = view.f103692y;
                Intrinsics.h(event);
                wy0.a aVar5 = aVar4.f256027a;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.equals(t1.a.f210006a)) {
                    aVar5.n0().h(view);
                } else {
                    if (!(event instanceof u1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    u1 u1Var = (u1) event;
                    aVar5.n0().d(view, u1Var.f210026a, "waitlist.benefits.full.screen.product.intro", null, u1Var.f210027b);
                }
                return Unit.f186387a;
            case 14:
                nml.h result3 = (nml.h) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                ((com.revolut.sso.impl.ui.post_authentication.a) obj3).C2(new rol.d(result3.f217381a));
                return Unit.f186387a;
            case 15:
                rp0.o oVar3 = (rp0.o) obj3;
                WindowInsets windowInsets = (WindowInsets) obj2;
                Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
                WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
                Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
                int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
                Insets insets = windowInsetsCompat.getInsets(iSystemBars);
                Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
                int i5 = insets.top;
                int i6 = insets.bottom;
                WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(iSystemBars, Insets.NONE).build();
                Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "build(...)");
                windowInsetsCompatBuild.toWindowInsets();
                BottomExpandableDialogView.b bVar2 = oVar3.f256135c;
                View view2 = oVar3.d;
                if ((bVar2 instanceof BottomExpandableDialogView.b.a) && ((Boolean) jo0.g.k.getValue()).booleanValue()) {
                    knm.b.v(i6, oVar3.f256136g);
                    i6 = 0;
                }
                if (view2.getPaddingTop() != i5 || view2.getPaddingBottom() != i6) {
                    oVar3.f.setBottomDialogBottomPadding(i6);
                    view2.setPadding(0, i5, 0, 0);
                }
                return Unit.f186387a;
            case 16:
                ((p0) obj3).a();
                return Unit.f186387a;
            case 17:
                s1 s1Var = (s1) obj3;
                WindowInsets windowInsets2 = (WindowInsets) obj2;
                Intrinsics.checkNotNullParameter(windowInsets2, "windowInsets");
                WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.toWindowInsetsCompat(windowInsets2);
                Intrinsics.checkNotNullExpressionValue(windowInsetsCompat2, "toWindowInsetsCompat(...)");
                Insets insets2 = windowInsetsCompat2.getInsets(WindowInsetsCompat.Type.systemBars());
                Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                int i21 = insets2.top;
                int i22 = insets2.bottom;
                if (s1Var.j().getPaddingTop() != i21 || s1Var.j().getPaddingBottom() != i22) {
                    s1Var.j().setPadding(0, i21, 0, i22);
                }
                return Unit.f186387a;
            case 18:
                xo1.d params = (xo1.d) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (List) ((rp1.j) obj3).f256246c.get(rp1.j.a(params));
            case 19:
                com.revolut.feature.bank_account_switching.impl.ui.switch_out.a aVar6 = (com.revolut.feature.bank_account_switching.impl.ui.switch_out.a) obj3;
                yki.a aVar7 = aVar6.f64052s;
                up2.h result4 = (up2.h) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (result4 instanceof up2.f) {
                    up2.f fVar = (up2.f) result4;
                    mn2.a aVar8 = fVar.f281818a;
                    int i32 = rp2.d.f256249a[aVar8.ordinal()];
                    if (i32 == 1) {
                        aVar6.l2(new rm6.c(aVar6, "revolut://app/form/overstap-switch-out", , 15), new yi5.b(26));
                        oki.h.D2(aVar7);
                    } else if (i32 == 2) {
                        aVar6.I2(aVar8, fVar, "revolut://app/form/cass-switch-out-partial");
                    } else {
                        if (i32 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar6.I2(aVar8, fVar, "revolut://app/form/mobility-switch-out-partial");
                    }
                } else {
                    if (!Intrinsics.f(result4, up2.g.f281821a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(aVar7);
                }
                return Unit.f186387a;
            case 20:
                BillType billType = (BillType) obj3;
                rp9.a updateState = (rp9.a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                List list6 = updateState.f256290b;
                return list6.contains(billType) ? rp9.a.a(updateState, null, zhm.d0.A0(list6, billType), null, 5) : rp9.a.a(updateState, null, zhm.d0.F0(billType, list6), null, 5);
            case 21:
                k1h.j links = (k1h.j) obj2;
                Intrinsics.checkNotNullParameter(links, "links");
                return new k1h.e(links, ((cfl.z) obj3).f23759a);
            case 22:
                k71.q transactionsExtraData = (k71.q) obj2;
                Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
                IncomeSorterDeleteContract$InputData incomeSorterDeleteContract$InputData = ((rpd.k) obj3).o;
                return new rpd.b(incomeSorterDeleteContract$InputData.f87715a, incomeSorterDeleteContract$InputData.f87716b, transactionsExtraData, incomeSorterDeleteContract$InputData.f87717c, incomeSorterDeleteContract$InputData.d);
            case 23:
                upf.c dto = (upf.c) obj2;
                Intrinsics.checkNotNullParameter(dto, "it");
                String str4 = ((TransferQuoteRequest) obj3).d;
                Intrinsics.checkNotNullParameter(dto, "dto");
                upf.e eVarF = dto.getRate();
                lrf.a aVar9 = new lrf.a(eVarF.getRate(), eVarF.getFrom(), eVarF.getTo(), eVarF.getTimestamp(), 0L, 0L, 0L, null, null, eVarF.getDealing(), 496);
                dj0.d dVarO = mo3.a.o(dto.getRecipientAmount());
                dj0.d dVarO2 = mo3.a.o(dto.getBillAmount());
                upf.o oVarI = dto.getTransferLimits();
                if (oVarI != null) {
                    dj0.d dVarO3 = mo3.a.o(oVarI.getLower());
                    jo3.a upper = oVarI.getUpper();
                    gVar = new nrf.g(dVarO3, upper != null ? mo3.a.o(upper) : null);
                } else {
                    gVar = null;
                }
                upf.b bVarC = dto.getCharges();
                dj0.d dVarO4 = mo3.a.o(bVarC.getTotal());
                upf.d dVarA = bVarC.getFee();
                dj0.d dVarO5 = mo3.a.o(dVarA.getTotal());
                boolean zB = dVarA.getIntermediaryFees();
                List listA = dVarA.getBreakdown();
                ArrayList arrayList4 = new ArrayList(zhm.w.t(listA, 10));
                Iterator it9 = listA.iterator();
                while (it9.hasNext()) {
                    arrayList4.add(spf.a.a((upf.a) it9.next()));
                }
                nrf.f fVar2 = new nrf.f(dVarO5, zB, arrayList4, null);
                upf.n nVarB = bVarC.getTax();
                dj0.d dVarO6 = mo3.a.o(nVarB.getTotal());
                List breakdown = nVarB.getBreakdown();
                ArrayList arrayList5 = new ArrayList(zhm.w.t(breakdown, 10));
                Iterator it10 = breakdown.iterator();
                while (it10.hasNext()) {
                    arrayList5.add(spf.a.a((upf.a) it10.next()));
                }
                nrf.e eVar = new nrf.e(dVarO4, fVar2, new nrf.h(dVarO6, null, arrayList5));
                upf.l lVarJ = dto.getTransferSplit();
                if (lVarJ != null) {
                    List<upf.m> options = lVarJ.getOptions();
                    ArrayList arrayList6 = new ArrayList(zhm.w.t(options, 10));
                    for (upf.m mVar : options) {
                        dj0.d dVarO7 = mo3.a.o(mVar.getAmount());
                        dj0.d dVarO8 = mo3.a.o(mVar.getTotalAmountWithInterest());
                        int term = mVar.getTerm();
                        jo3.a monthlyRepayment = mVar.getMonthlyRepayment();
                        dj0.d dVarO9 = monthlyRepayment != null ? mo3.a.o(monthlyRepayment) : null;
                        String firstInstalmentDueDate = mVar.getFirstInstalmentDueDate();
                        LocalDate localDate = firstInstalmentDueDate != null ? LocalDate.parse(firstInstalmentDueDate) : null;
                        String lastInstalmentDueDate = mVar.getLastInstalmentDueDate();
                        arrayList6.add(new TransferQuoteSplitOption(dVarO7, dVarO8, term, dVarO9, localDate, lastInstalmentDueDate != null ? LocalDate.parse(lastInstalmentDueDate) : null, mVar.getRate()));
                    }
                    transferQuoteSplit = new TransferQuoteSplit(arrayList6);
                } else {
                    transferQuoteSplit = null;
                }
                orf.a aVarD = dto.getCreditCardInterest();
                CreditCardInterest creditCardInterestA = aVarD != null ? aVarD.a() : null;
                orf.c cVarA = dto.getAvailability();
                TransferAvailability transferAvailabilityA = cVarA != null ? cVarA.a() : null;
                String strE = dto.getDisclaimer();
                rrf.a aVarH = dto.getTaxTreatment();
                return new nrf.c(aVar9, dVarO, dVarO2, gVar, eVar, transferQuoteSplit, creditCardInterestA, transferAvailabilityA, strE, str4, aVarH != null ? n14.e.G(aVarH) : null);
            case 24:
                kbb.c cVar = (kbb.c) obj3;
                TransferQuoteRequest transferQuoteRequest = (TransferQuoteRequest) obj2;
                Intrinsics.checkNotNullParameter(transferQuoteRequest, "transferQuoteRequest");
                TransferQuoteService transferQuoteService = (TransferQuoteService) cVar.f182549b;
                String str5 = transferQuoteRequest.f92282b.f92286c;
                if (str5 == null || !((cw9.d) cVar.f182550c).a()) {
                    str5 = null;
                }
                String str6 = transferQuoteRequest.d;
                Intrinsics.checkNotNullParameter(transferQuoteRequest, "transferQuoteRequest");
                jo3.a aVarP = mo3.a.p(transferQuoteRequest.f92281a);
                TransferQuoteSender transferQuoteSender = transferQuoteRequest.f92282b;
                String str7 = transferQuoteSender.f92284a.f306286a;
                String str8 = transferQuoteSender.f92285b;
                TransferQuoteUserIdentifier transferQuoteUserIdentifier = transferQuoteRequest.f92283c;
                if (transferQuoteUserIdentifier instanceof TransferQuoteUserIdentifier.Code) {
                    iVar = new upf.f(((TransferQuoteUserIdentifier.Code) transferQuoteUserIdentifier).f92292a);
                } else if (transferQuoteUserIdentifier instanceof TransferQuoteUserIdentifier.Email) {
                    iVar = new upf.g(((TransferQuoteUserIdentifier.Email) transferQuoteUserIdentifier).f92293a);
                } else if (transferQuoteUserIdentifier instanceof TransferQuoteUserIdentifier.Id) {
                    iVar = new upf.h(((TransferQuoteUserIdentifier.Id) transferQuoteUserIdentifier).f92294a);
                } else {
                    if (!(transferQuoteUserIdentifier instanceof TransferQuoteUserIdentifier.Phone)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar = new upf.i(((TransferQuoteUserIdentifier.Phone) transferQuoteUserIdentifier).f92295a);
                }
                upf.j jVar = iVar;
                qrf.b bVar3 = transferQuoteRequest.e;
                if (bVar3 != null) {
                    Intrinsics.checkNotNullParameter(bVar3, "<this>");
                    int i33 = qrf.a.f248729a[bVar3.ordinal()];
                    if (i33 == 1) {
                        str = "GROSS_UP";
                    } else {
                        if (i33 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "DEDUCT";
                    }
                    str2 = str;
                }
                efm.d0<upf.c> d0VarRequestTransferQuotes = transferQuoteService.requestTransferQuotes(str5, str6, new upf.k(aVarP, str7, str8, jVar, str2));
                rof.e eVar2 = new rof.e(29, new d0(cVar, transferQuoteRequest, 23));
                d0VarRequestTransferQuotes.getClass();
                ufm.i iVar2 = new ufm.i(d0VarRequestTransferQuotes, eVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
            case 25:
                rpi.h hVar = (rpi.h) obj3;
                hVar.y();
                View currentFocus = hVar.f256393h.getCurrentFocus();
                if (currentFocus != null) {
                    currentFocus.clearFocus();
                }
                return Unit.f186387a;
            case 26:
                oq5.c result5 = (oq5.c) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                ((com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingflow.a) obj3).I2(result5.f227743a, result5.f227744b);
                return Unit.f186387a;
            case 27:
                com.revolut.feature.foreign_currencies.impl.ui.flow.a aVar10 = (com.revolut.feature.foreign_currencies.impl.ui.flow.a) obj3;
                ExchangeGlobalAccessOutput it11 = (ExchangeGlobalAccessOutput) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                if (it11 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                    yji.l.a1(aVar10, aVar10.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.foreign_currencies_dialog_success, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (nii.u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094), false, 5)), null, null, new c(aVar10, , i2), 3);
                } else {
                    aVar10.B2();
                }
                return Unit.f186387a;
            case 28:
                Intrinsics.checkNotNullParameter((do3.n) obj2, "it");
                return ((cn0.g) ((rqk.k) obj3).f256590l).d().a();
            default:
                Intrinsics.checkNotNullParameter((File) obj2, "it");
                return ((rrc.q) obj3).f256794g.a();
        }
    }

    public /* synthetic */ d0(Object obj2, Object obj3, int i) {
        this.f255050a = i;
        this.f255051b = obj3;
    }
}

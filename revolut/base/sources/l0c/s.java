package l0c;

import aw0.k8;
import aw0.k9;
import aw0.l8;
import aw0.o9;
import cli.y;
import com.revolut.core.model.FileExtension;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.CreditCardApplicationAutopayFlowContract$State;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeActivationSuccessException;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.rev_points.models.TermsInfo;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.InvestorUpdateHistoryFlowContract$PagerItem;
import com.revolut.feature.travel.flights.impl.ui.flow.home.TravelFlightsHomeFlowContract$PagerItem;
import com.revolut.feature.wealth.api.navigation.models.DepositInfo;
import com.revolut.feature_retail_user_declarations.credit_consent.CreditConsentOutputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreenContract$InputData;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$OutputData;
import efm.d0;
import ip0.pb0;
import ip0.wj;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jid.z;
import kl.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kye.m0;
import o97.o0;
import q35.h0;
import s7a.a0;
import vkm.j2;
import zh9.u0;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f191223b;

    public /* synthetic */ s(Object obj2, int i) {
        this.f191222a = i;
        this.f191223b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        int i = this.f191222a;
        int i2 = 27;
        int i3 = 5;
        int i5 = 26;
        int i6 = 6;
        int i21 = 0;
        Object[] objArr = 0;
        int i22 = 1;
        DepositInfo depositInfo = null;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object obj3 = this.f191223b;
        switch (i) {
            case 0:
                u uVar = (u) obj3;
                Terms terms = (Terms) obj2;
                Intrinsics.checkNotNullParameter(terms, "terms");
                uVar.H2(uVar.f191230t, new bai.n(terms, i22));
                String str2 = terms.f90357c;
                if (str2 != null) {
                    return uVar.I2(str2, FileExtension.Html.f51403b, new m0(i5));
                }
                String str3 = terms.d;
                return str3 != null ? uVar.I2(str3, FileExtension.Pdf.f51406b, new m0(i2)) : new go.g(new Data(null, new IllegalStateException("Unable to load terms content for provided input data"), false, 5, null), 2);
            case 1:
                TermsInfo termsInfo = (TermsInfo) obj3;
                od0.i optionalTerms = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalTerms, "optionalTerms");
                Terms terms2 = (Terms) optionalTerms.g();
                if (terms2 != null) {
                    return new Data(terms2, null, false, 6, null);
                }
                return new Data(null, new IllegalStateException("Unable to load terms with documentId = " + termsInfo), false, 5, null);
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new r(zhm.u.c(new wj("LOADING_ITEM_ID")), x.a((j) obj3), (List) null, false, 28);
            case 3:
                CdnImage cdnImage = l13.m.f191444a;
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                ((l13.m) obj3).getClass();
                return new l13.h(zhm.v.k(new pb0("loading_1"), new pb0("loading_2")));
            case 4:
                l1a.c cVar = (l1a.c) obj3;
                BillType billType = (BillType) obj2;
                Intrinsics.checkNotNullParameter(billType, "billType");
                if (billType instanceof BillType.CustomBill) {
                    return ((BillType.CustomBill) billType).f79173a;
                }
                if (billType instanceof BillType.TransactionBill) {
                    return ((bnf.r) cVar.f191503a).g(((BillType.TransactionBill) billType).f79176a);
                }
                if (!(billType instanceof BillType.RecurringPaymentBill)) {
                    throw new NoWhenBranchMatchedException();
                }
                m70.a.c(t0.f186434a);
                return "";
            case 5:
                l25.u uVar2 = (l25.u) obj3;
                zl4.h result = (zl4.h) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                r25.b.c3(uVar2, "update-credit-card-display-amount", new l25.n(uVar2, result, objArr2 == true ? 1 : 0, i22), 6);
                return Unit.f186387a;
            case 6:
                p26.o oVar = (p26.o) obj3;
                return l26.b.a((l26.b) obj2, null, null, oVar.f232098a, oVar.f232099b, null, null, null, null, null, 499);
            case 7:
                l32.h hVar = (l32.h) obj3;
                PendingPaymentContract$OutputData result2 = (PendingPaymentContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (hVar.o.f62314b) {
                    hVar.C2(result2);
                } else {
                    oki.h.D2(hVar.f191846q);
                }
                return Unit.f186387a;
            case 8:
                jul.o oVar2 = (jul.o) obj3;
                z3d.a allWatchlists = (z3d.a) obj2;
                Intrinsics.checkNotNullParameter(allWatchlists, "allWatchlists");
                if (allWatchlists.f319245a.isEmpty()) {
                    return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                }
                ArrayList<z3d.d> arrayList = allWatchlists.f319245a;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (z3d.d plainWatchlist : arrayList) {
                    z zVar = (z) oVar2.f178696c;
                    Intrinsics.checkNotNullParameter(plainWatchlist, "plainWatchlist");
                    arrayList2.add(plainWatchlist.f319252c.isEmpty() ? new go.g(new Data(new Watchlist(f0.f322471a, plainWatchlist.d, plainWatchlist.f319250a, plainWatchlist.f319251b), null, false, 6, null), 2) : nim.a.v(((c0) zVar.f174461b).f(plainWatchlist.f319252c), new l3d.d(zVar, plainWatchlist, i22)));
                }
                return u0.k(arrayList2);
            case 9:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Pair((z3d.a) obj3, r0.t(it8));
            case 10:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return ((l3l.h) obj3).f191960a.d0();
            case 11:
                l4g.e update = (l4g.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return l4g.e.a(update, ((TravelFlightsHomeFlowContract$PagerItem) obj3).getF94249a(), null, 5);
            case 12:
                CreditCardApplicationAutopayFlowContract$State update2 = (CreditCardApplicationAutopayFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return CreditCardApplicationAutopayFlowContract$State.a(update2, null, null, null, ((ik4.b) ((ik4.c) obj3)).f161891a, null, null, 55);
            case 13:
                k9 k9Var = (k9) obj3;
                Intrinsics.h(k9Var);
                return l5a.l.a((l5a.l) obj2, null, k9Var, null, null, null, false, null, null, false, null, 1021);
            case 14:
                return l5a.l.a((l5a.l) obj2, null, null, null, null, null, false, ((l5a.n) obj3).f192212a, null, false, null, 959);
            case 15:
                com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow.b) obj3;
                m64.f result3 = (m64.f) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof m64.d) {
                    bVar.l2(new l34.a(bVar, result3, objArr3 == true ? 1 : 0, i6), new yi5.b(i5));
                } else {
                    if (!(result3 instanceof m64.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.K2(null);
                }
                return Unit.f186387a;
            case 16:
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.a aVar = (com.revolut.feature.card_screen.impl.kompot.cards_carousel.a) obj3;
                o83.g result4 = (o83.g) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (result4 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.C1(new BridgeDestination(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(result4.f222917a.f249314a.f160150a, objArr == true ? 1 : 0, objArr4 == true ? 1 : 0, i6))));
                return Unit.f186387a;
            case 17:
                l7f.c update3 = (l7f.c) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return l7f.c.a(update3, null, ((InvestorUpdateHistoryFlowContract$PagerItem) obj3).getF94249a(), 1);
            case 18:
                l7f.e it9 = (l7f.e) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                ((com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.b) obj3).C2(it9);
                return Unit.f186387a;
            case 19:
                io3.d dVar = (io3.d) obj2;
                rea.m mVar = ((l7j.z) obj3).f192701w;
                Intrinsics.h(dVar);
                return mVar.d(AccountId.Personal.f51414a, dVar);
            case 20:
                LoanRepaymentAccountModelExtension.RepaymentAccountState selectedAccountState = (LoanRepaymentAccountModelExtension.RepaymentAccountState) obj2;
                Intrinsics.checkNotNullParameter(selectedAccountState, "selectedAccountState");
                return nim.a.v(ngm.n.K(new l85.j((l85.n) obj3, selectedAccountState, null)), new s(selectedAccountState, 21));
            case 21:
                h0 preview = (h0) obj2;
                Intrinsics.checkNotNullParameter(preview, "preview");
                return new l85.f(preview, (LoanRepaymentAccountModelExtension.RepaymentAccountState) obj3);
            case 22:
                d0 d0Var = (d0) obj3;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return error instanceof ExchangeActivationSuccessException ? d0Var : d0.l(error);
            case 23:
                l97.i iVar = (l97.i) obj2;
                List list = ((o97.i) obj3).f223110c;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    arrayList3.add(new TextClause((String) it10.next(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                }
                return l97.i.n(iVar, null, arrayList3, null, null, null, null, 61);
            case 24:
                String str4 = ((o0) obj3).f223124a;
                l8.Companion.getClass();
                return l97.i.n((l97.i) obj2, str4, null, null, null, null, k8.a(str4), 30);
            case 25:
                com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a aVar2 = (com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a) obj3;
                xi0.b baseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                yud.g gVar = aVar2.f99990p;
                CryptoEarningScreenContract$InputData cryptoEarningScreenContract$InputData = aVar2.v;
                efm.r rVarZ = nim.a.z(nim.a.w(rd0.e.c(gVar.a(cryptoEarningScreenContract$InputData.f99983a.f88081a, baseCurrency, w4l.i.f294643c), kotlin.coroutines.g.f186406a), new l5a.u(28)), new l5a.u(29));
                StakingPocket stakingPocket = cryptoEarningScreenContract$InputData.f99983a;
                return kli.a.i(rVarZ, nim.a.z(nim.a.w(gt5.a.a(aVar2.f99991q, baseCurrency, false, 6), new i5f.g(18, stakingPocket.f88082b.d)), new l5a.u(i2)), nim.a.z(nim.a.w(nim.a.w(aVar2.o.e(v1.c.w(stakingPocket.f88082b.d, baseCurrency), n9l.b.SEC_3), new l9j.k(i21)), new l9j.k(i22)), new l5a.u(25)));
            case 26:
                return l9k.i.a((l9k.i) obj2, null, (l9k.j) obj3, null, null, 27);
            case 27:
                com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a aVar3 = (com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a) obj3;
                y yVar = aVar3.f76776w;
                a0 output = (a0) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                s7a.c0 c0Var = output.f260599a;
                c8a.a aVar4 = c0Var instanceof c8a.a ? (c8a.a) c0Var : null;
                String str5 = aVar4 != null ? aVar4.f22154a : null;
                if (str5 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Result from country picker should be CountryPickerControllerResult");
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    return Unit.f186387a;
                }
                wi0.b.Companion.getClass();
                wi0.b bVarA = wi0.a.a(str5);
                if (!bVarA.equals(((la8.e) ((j2) yVar.f22677a).getValue()).f193346a)) {
                    fj0.a aVar5 = fj0.b.Companion;
                    String strJ = aVar3.f76771p.j(bVarA);
                    aVar5.getClass();
                    Serializable serializableB = fj0.a.b(strJ);
                    yhm.o.b(serializableB);
                    aVar3.H2(yVar, new a94.e(bVarA, ((fj0.b) serializableB).f135518a, aVar3, i3));
                }
                return Unit.f186387a;
            case 28:
                lah.e eVar = (lah.e) obj3;
                ybh.r output2 = (ybh.r) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof ybh.q) {
                    depositInfo = ((ybh.q) output2).f312341a;
                } else if (!(output2 instanceof ybh.p)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar.C2(new lah.c(depositInfo));
                return Unit.f186387a;
            default:
                com.revolut.feature_retail_user_declarations.credit_consent.flow.a aVar6 = (com.revolut.feature_retail_user_declarations.credit_consent.flow.a) obj3;
                d67.u output3 = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof d67.s) {
                    ivh.c.Z2(aVar6.f97544q, "CreditConsentFlowModel", "CREDIT_CONSENT_PRIMARY_BUTTON", new lai.e(aVar6, true, null), null, null, 56);
                } else if (output3 instanceof d67.t) {
                    ivh.c.Z2(aVar6.f97544q, "CreditConsentFlowModel", "CREDIT_CONSENT_SECONDARY_BUTTON", new lai.e(aVar6, false, null), null, null, 56);
                } else if (output3 instanceof d67.q) {
                    aVar6.C2(CreditConsentOutputData.Cancel.f97540a);
                } else if (output3 instanceof d67.p) {
                    if (Intrinsics.f(((d67.p) output3).f111461a.f275445a, "CREDIT_CONSENT_TERMS_LINK") && (str = aVar6.o.f97539c) != null) {
                        aVar6.l2(new l34.a(aVar6, str, objArr5 == true ? 1 : 0, 15), new yi5.b(i5));
                    }
                } else if (!(output3 instanceof d67.r)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ s(x xVar, j jVar) {
        this.f191222a = 2;
        this.f191223b = jVar;
    }
}

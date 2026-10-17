package as9;

import aed.d;
import aii.q;
import aii.r;
import akl.s1;
import androidx.sqlite.SQLiteConnection;
import asa.m;
import atg.s;
import atg.v;
import au6.z0;
import aw0.o9;
import b1c.h;
import b4h.c;
import bjl.p;
import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments.CreditCardRepayFutureInstalmentsFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.settings.flow.CreditCardSettingsFlowContract$Step;
import com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.address_not_supported.AddressNotSupportedActivity;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderData;
import com.revolut.feature.retail.cfd.impl.screens.common.ExpiryDate;
import com.revolut.feature.retail.cfd.impl.screens.order.v2.CfdOrderFormControllerContract$ModalStep;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.stock_lending.impl.ui.onboarding.StockLendingOnboardingContract$Configuration;
import com.revolut.feature.three_ds_verification.api.navigation.ThreeDsMerchantRedirectDestination;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.f;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import com.revolut.feature.trading_orders.api.investment_plan.projection.InvestmentProjectionsContract$InputData;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$ModalStep;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$RemoveTarget;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureProgress;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.trading.orders.ui.flows.investment_plan.projection.InvestmentProjectionsFlowContract$FlowStep;
import fxf.d;
import ip0.nb0;
import ip0.pb0;
import ipa.j;
import ise.l0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import jhi.k;
import kel.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import nel.n;
import od0.i;
import vkm.j2;
import wim.z;
import x8h.n0;
import xe0.e;
import yki.l;
import zh9.u0;
import zhm.a1;
import zhm.d0;
import zhm.r0;
import zhm.w;
import zul.o;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8879c;

    public /* synthetic */ a(c cVar, List list, n nVar) {
        this.f8877a = 29;
        this.f8878b = list;
        this.f8879c = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        p0 p0Var;
        r rVar;
        h hVar;
        h hVar2;
        k kVarB;
        Object next;
        boolean z;
        Object next2;
        switch (this.f8877a) {
            case 0:
                b bVar = (b) this.f8878b;
                j jVar = (j) this.f8879c;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new pfm.h(new d(bVar, jVar, (String) pair.f186385a, (String) pair.f186386b), 2);
            case 1:
                m mVar = (m) this.f8878b;
                PushToCardTransferData pushToCardTransferData = (PushToCardTransferData) this.f8879c;
                i it8 = (i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return mVar.f8906g.validate(new l1l.r((hrf.i) it8.g(), pushToCardTransferData.e.d())).f316033b;
            case 2:
                com.revolut.feature.three_ds_verification.impl.ui.a aVar = (com.revolut.feature.three_ds_verification.impl.ui.a) this.f8878b;
                l lVar = (l) this.f8879c;
                f result = (f) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof l0) {
                    aVar.C1(u0.c(new KompotOverlayFeatureConfig(new ThreeDsMerchantRedirectDestination(((l0) result).f168213a), yhi.b.POPUP, (Integer) null, 12)));
                    oki.h.D2(lVar);
                } else {
                    oki.h.D2(aVar.f90397p);
                }
                return Unit.f186387a;
            case 3:
                com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments.a aVar2 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments.a) this.f8878b;
                l lVar2 = (l) this.f8879c;
                us4.i result2 = (us4.i) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                oki.h.t2(aVar2, lVar2, new CreditCardRepayFutureInstalmentsFlowContract$Step.PaymentDetails(result2.f282426a, result2.f282427b, result2.f282428c), true, null, false, 12);
                return Unit.f186387a;
            case 4:
                v vVar = (v) this.f8878b;
                String str = (String) this.f8879c;
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                List<io3.d> list = pockets;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((io3.d) obj3).e == io3.l.CURRENT) {
                        arrayList.add(obj3);
                    }
                }
                List listP0 = d0.P0(arrayList, new s(vVar, 1));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : listP0) {
                    if (((io3.d) obj4).f == io3.k.ACTIVE) {
                        arrayList2.add(obj4);
                    }
                }
                for (io3.d dVar : list) {
                    if (Intrinsics.f(dVar.f163145a, str)) {
                        atg.k kVar = vVar.d;
                        ArrayList items = new ArrayList(w.t(listP0, 10));
                        Iterator it9 = listP0.iterator();
                        while (it9.hasNext()) {
                            items.add(((io3.d) it9.next()).f163147c);
                        }
                        synchronized (kVar) {
                            try {
                                Intrinsics.checkNotNullParameter(items, "items");
                                Iterator it10 = items.iterator();
                                int i = 0;
                                while (true) {
                                    if (it10.hasNext()) {
                                        Object next3 = it10.next();
                                        int i2 = i + 1;
                                        if (i < 0) {
                                            zhm.v.s();
                                            throw null;
                                        }
                                        kVar.c(i, (String) next3);
                                        i = i2;
                                    } else {
                                        e eVar = kVar.f9054a;
                                        List listA = kVar.a();
                                        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                                        KType kTypeB = o0.b(String.class);
                                        companion.getClass();
                                        KType kTypeC = o0.c(List.class, KTypeProjection.Companion.a(kTypeB));
                                        p0Var = o0.f186429a;
                                        eVar.G(listA, "POCKETS_ORDER_STORAGE_NAME", z.d(p0Var.d(kTypeC)));
                                    }
                                }
                            } finally {
                            }
                        }
                        atg.k kVar2 = vVar.d;
                        String item = dVar.f163147c;
                        io3.d dVar2 = (io3.d) d0.o0(arrayList2);
                        String str2 = dVar2 != null ? dVar2.f163147c : null;
                        synchronized (kVar2) {
                            try {
                                Intrinsics.checkNotNullParameter(item, "item");
                                int iG0 = d0.g0(str2, kVar2.a());
                                Integer numValueOf = Integer.valueOf(iG0);
                                if (iG0 < 0) {
                                    numValueOf = null;
                                }
                                Integer numValueOf2 = numValueOf != null ? Integer.valueOf(numValueOf.intValue() + 1) : null;
                                kVar2.c(numValueOf2 != null ? numValueOf2.intValue() : 0, item);
                                kVar2.f9054a.G(kVar2.a(), "POCKETS_ORDER_STORAGE_NAME", z.d(p0Var.d(o0.c(List.class, KTypeProjection.Companion.a(o0.b(String.class))))));
                            } finally {
                            }
                        }
                        return Unit.f186387a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 5:
                v vVar2 = (v) this.f8878b;
                w4l.k loadingStrategy = (w4l.k) this.f8879c;
                String walletId = (String) obj2;
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                atg.h hVar3 = (atg.h) vVar2.e;
                hVar3.getClass();
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return hVar3.f9053g.e(walletId, loadingStrategy);
            case 6:
                com.revolut.trading.orders.ui.flows.investment_plan.projection.a aVar3 = (com.revolut.trading.orders.ui.flows.investment_plan.projection.a) this.f8878b;
                l lVar3 = (l) this.f8879c;
                o output = (o) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                InvestOrderContract$InputData.Companion companion2 = InvestOrderContract$InputData.INSTANCE;
                InvestmentProjectionsContract$InputData investmentProjectionsContract$InputData = aVar3.o;
                n nVar = investmentProjectionsContract$InputData.f91737b;
                UUID uuid = investmentProjectionsContract$InputData.f91738c;
                BigDecimal bigDecimalY = pyd.c.Y(output.f325549a);
                sel.a aVar4 = sel.a.MONTHLY;
                companion2.getClass();
                oki.h.t2(aVar3, lVar3, new InvestmentProjectionsFlowContract$FlowStep.InvestOrderFlow(InvestOrderContract$InputData.Companion.d(nVar, uuid, bigDecimalY, false, aVar4)), true, null, false, 12);
                return Unit.f186387a;
            case 7:
                aug.d dVar3 = (aug.d) this.f8878b;
                wel.e eVar2 = (wel.e) this.f8879c;
                AccountClosureProgress progress = (AccountClosureProgress) obj2;
                Intrinsics.checkNotNullParameter(progress, "progress");
                xtg.e eVar3 = dVar3.f9824a;
                String portfolioId = eVar2.f296818a;
                eVar3.getClass();
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                ue0.c cVar = eVar3.e;
                StringBuilder sb6 = new StringBuilder("ACCOUNT_CLOSURE_PROGRESS_UPDATED_KEY_");
                sb6.append(portfolioId);
                boolean z3 = cVar.T2(sb6.toString(), Unit.class) != null;
                if (!progress.f104494l) {
                    return new AccountClosureStatus.AccountClosureInProgress(progress, z3);
                }
                ArrayList arrayList3 = eVar2.e;
                ArrayList arrayList4 = new ArrayList();
                Iterator it11 = arrayList3.iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        Iterator it12 = arrayList4.iterator();
                        while (true) {
                            if (it12.hasNext()) {
                                Object next4 = it12.next();
                                if (((kel.b) next4).f183149b.f115082a < 0) {
                                    obj = next4;
                                }
                            }
                        }
                        return new AccountClosureStatus.AccountClosureProgressBlocked(progress, (kel.b) obj, z3);
                    }
                    g gVar = (g) it11.next();
                    obj = gVar instanceof kel.b ? (kel.b) gVar : null;
                    if (obj != null) {
                        arrayList4.add(obj);
                    }
                }
                break;
            case 8:
                d0j.h hVar4 = (d0j.h) this.f8878b;
                auj.n nVar2 = (auj.n) this.f8879c;
                auj.g gVar2 = (auj.g) obj2;
                Map mapQ = r0.q(gVar2.f9844c, new Pair(hVar4.f110400b, hVar4));
                return auj.g.a(gVar2, auj.n.I2(nVar2, gVar2.f9843b, mapQ), mapQ, false, 9);
            case 9:
                com.revolut.feature.credit.card.impl.ui.settings.flow.a aVar5 = (com.revolut.feature.credit.card.impl.ui.settings.flow.a) this.f8878b;
                l lVar4 = (l) this.f8879c;
                bv4.e result3 = (bv4.e) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (!(result3 instanceof bv4.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.t2(aVar5, lVar4, CreditCardSettingsFlowContract$Step.SelectDueDate.f69634a, false, null, false, 14);
                return Unit.f186387a;
            case 10:
                av5.l lVar5 = (av5.l) this.f8878b;
                CryptoTransactionFilter cryptoTransactionFilter = (CryptoTransactionFilter) this.f8879c;
                av5.f updateState = (av5.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                List<CryptoTransactionFilter> list2 = ((av5.f) lVar5.t2()).f9915a;
                ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                for (CryptoTransactionFilter cryptoTransactionFilterA : list2) {
                    if (Intrinsics.f(cryptoTransactionFilterA, cryptoTransactionFilter)) {
                        cryptoTransactionFilterA = cryptoTransactionFilterA.a();
                    }
                    arrayList5.add(cryptoTransactionFilterA);
                }
                List list3 = ((av5.f) lVar5.t2()).f9916b;
                return av5.f.a(updateState, arrayList5, list3 != null ? knm.b.S(list3, arrayList5) : null, 12);
            case 11:
                av8.r rVar2 = (av8.r) this.f8878b;
                av8.j jVar2 = (av8.j) this.f8879c;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listK = zhm.v.k(rVar2.a(jVar2.f9948a), av8.r.b());
                nb0 nb0Var = pb0.Companion;
                List listK2 = zhm.v.k(nb0.a(nb0Var, "row_loading_delegate_model_0", false, 6), nb0.a(nb0Var, "row_loading_delegate_model_1", false, 6));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                return i2b.a.o(listK, listK2);
            case 12:
                TravelItineraryAddEventContract$ModalStep travelItineraryAddEventContract$ModalStep = (TravelItineraryAddEventContract$ModalStep) this.f8878b;
                com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b bVar2 = (com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.b) this.f8879c;
                Intrinsics.checkNotNullParameter((q) obj2, "it");
                TravelItineraryAddEventContract$RemoveTarget travelItineraryAddEventContract$RemoveTarget = ((TravelItineraryAddEventContract$ModalStep.RemoveItem) travelItineraryAddEventContract$ModalStep).f101622a;
                if (travelItineraryAddEventContract$RemoveTarget instanceof TravelItineraryAddEventContract$RemoveTarget.Event) {
                    rVar = avj.d.f10051a;
                } else {
                    if (!(travelItineraryAddEventContract$RemoveTarget instanceof TravelItineraryAddEventContract$RemoveTarget.Proposal)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVar = avj.e.f10052a;
                }
                bVar2.C2(rVar);
                return Unit.f186387a;
            case 13:
                com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.a aVar6 = (com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.a) this.f8878b;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f8879c;
                bjl.q result4 = (bjl.q) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                Continuation continuation = null;
                if (result4 instanceof bjl.o) {
                    aVar6.l2(new akb.s(aVar6, continuation, 29), new yi5.b(26));
                } else {
                    if (!(result4 instanceof p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar6.l2(new s1(aVar6, ref$ObjectRef, result4, continuation, 21), new yi5.b(26));
                }
                return Unit.f186387a;
            case 14:
                ayf.r rVar3 = (ayf.r) this.f8878b;
                fxf.a aVar7 = (fxf.a) this.f8879c;
                yhm.r rVar4 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar4, "<destruct>");
                boolean zBooleanValue = ((Boolean) rVar4.f314201a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) rVar4.f314202b).booleanValue();
                x39.b bVar3 = (x39.b) rVar4.f314203c;
                rVar3.getClass();
                if ((zBooleanValue || zBooleanValue2) && bVar3 == x39.b.ENABLED) {
                    return new ufm.i(((z39.b) rVar3.f11181b).f319221b.e(), new z0(new ax9.a(22), 24), 1);
                }
                int i3 = ayf.q.f11179a[aVar7.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        zBooleanValue = zBooleanValue2;
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zBooleanValue = zBooleanValue || zBooleanValue2;
                    }
                }
                if (!zBooleanValue) {
                    return efm.d0.m(d.a.f138817a);
                }
                ufm.b bVarM = efm.d0.m(d.b.f138818a);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 15:
                az7.c cVar2 = (az7.c) this.f8878b;
                az7.g gVar3 = (az7.g) this.f8879c;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                zw7.c viewModel = (zw7.c) pair2.f186385a;
                List list4 = (List) pair2.f186386b;
                if (viewModel != null) {
                    xpi.c cVar3 = (xpi.c) gVar3.f11399j;
                    cVar3.Z(true);
                    gVar3.o.getClass();
                    Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                    int i5 = R$string.pets_dashboard_issues_address_not_supported_subtitle;
                    long jB = jli.b.b(viewModel.f325760c);
                    TimeClause.Format.INSTANCE.getClass();
                    cVar3.Y(new TextLocalisedClause(i5, zhm.v.k(new TimeClause(jB, TimeClause.Format.f57959a, null, null, 12), new MoneyClause(viewModel.f325759b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12));
                }
                ((AddressNotSupportedActivity) cVar2).setItems(list4);
                return Unit.f186387a;
            case 16:
                b1b.k kVar3 = (b1b.k) this.f8878b;
                d1b.c cVar4 = (d1b.c) this.f8879c;
                b1b.f update = (b1b.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                y yVar = kVar3.f11776s;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                return b1b.f.a(update, ((b1b.f) j2Var.getValue()).f11764a.contains(cVar4) ? a1.j(((b1b.f) j2Var2.getValue()).f11764a, cVar4) : a1.m(((b1b.f) j2Var2.getValue()).f11764a, cVar4), null, null, null, 14);
            case 17:
                com.revolut.feature.rev_points.impl.ui.trophy_room.home.b bVar4 = (com.revolut.feature.rev_points.impl.ui.trophy_room.home.b) this.f8878b;
                RowDelegate.Model model = (RowDelegate.Model) this.f8879c;
                b1c.i update2 = (b1c.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                h hVar5 = ((b1c.i) ((j2) bVar4.f83931s.f22677a).getValue()).d;
                String str3 = model.f53228a;
                if (Intrinsics.f(str3, "PAID_PLAN_ITEM_ID")) {
                    hVar2 = new h(hVar5.f11779a, !hVar5.f11780b);
                } else {
                    if (!Intrinsics.f(str3, "REV_POINTS_ITEM_ID")) {
                        hVar = hVar5;
                        return b1c.i.a(update2, null, null, null, hVar, 7);
                    }
                    hVar2 = new h(!hVar5.f11779a, hVar5.f11780b);
                }
                hVar = hVar2;
                return b1c.i.a(update2, null, null, null, hVar, 7);
            case 18:
                b1e.a aVar8 = (b1e.a) this.f8878b;
                BackendFlow backedFlow = (BackendFlow) this.f8879c;
                StockLendingOnboardingContract$Configuration config = (StockLendingOnboardingContract$Configuration) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                n0 n0Var = (n0) aVar8.f11796b;
                String portfolioId2 = config.f88401a;
                Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                Intrinsics.checkNotNullParameter(backedFlow, "backedFlow");
                e8h.d0 d0Var = n0Var.f303367c;
                d0Var.getClass();
                Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                Intrinsics.checkNotNullParameter(backedFlow, "backedFlow");
                efm.d0<q90.i> d0VarPostStockLendingFlow = d0Var.f123677a.postStockLendingFlow(portfolioId2, d0Var.f123678b.b(backedFlow));
                e8h.c cVar5 = new e8h.c(8, new dkm.a(1, d0Var.f123678b, t90.g.class, "toDomain", "toDomain(Lcom/revolut/core/backend_flow/data/network/dto/BackendFlowDto;)Lcom/revolut/feature/backend_flow/domain/models/BackendFlow;", 0, 18));
                d0VarPostStockLendingFlow.getClass();
                ufm.i iVar = new ufm.i(d0VarPostStockLendingFlow, cVar5, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return te0.w.i0(iVar);
            case 19:
                b23.h hVar6 = (b23.h) this.f8878b;
                kc8.a aVar9 = (kc8.a) this.f8879c;
                List walletProfiles = (List) obj2;
                Intrinsics.checkNotNullParameter(walletProfiles, "walletProfiles");
                if (walletProfiles.isEmpty()) {
                    return zi0.c.i(n33.l.f211756a);
                }
                wf8.c cVar6 = hVar6.e;
                int i6 = b23.a.f11868a[aVar9.ordinal()];
                if (i6 == 1) {
                    kVarB = ((ag8.e) cVar6).b("ORDER_NEW_CARD_BOTTOM_DIALOG_RECYCLER");
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVarB = ((ag8.e) cVar6).c("ORDER_NEW_CARD_BOTTOM_DIALOG_RECYCLER");
                }
                return nim.a.v(kVarB, b23.b.f);
            case 20:
                com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar10 = (com.revolut.feature.retail.cfd.impl.screens.order.v2.a) this.f8878b;
                t2b.c cVar7 = aVar10.f82249p;
                CfdOrderFormControllerContract$ModalStep.TargetPrice targetPrice = (CfdOrderFormControllerContract$ModalStep.TargetPrice) this.f8879c;
                hdf.b output2 = (hdf.b) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                BigDecimal bigDecimal = output2.f151428b.f104717a;
                if (!targetPrice.f82244b) {
                    cVar7.a(new b4b.z(new ExpiryDate(l3b.a.NINETY_DAYS, ((l80.f) aVar10.A).k().plusDays(90L)), 0));
                    aVar10.n2(new ald.m((Object) aVar10, (Object) BigDecimal.ZERO, true, (Continuation) null, 3), new whi.b(6));
                }
                cVar7.a(new a(targetPrice, bigDecimal, 21));
                return Unit.f186387a;
            case 21:
                CfdOrderFormControllerContract$ModalStep.TargetPrice targetPrice2 = (CfdOrderFormControllerContract$ModalStep.TargetPrice) this.f8878b;
                BigDecimal bigDecimal2 = (BigDecimal) this.f8879c;
                CfdOrderData it13 = (CfdOrderData) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return CfdOrderData.a(it13, targetPrice2.f82243a, null, null, bigDecimal2, null, 45);
            case 22:
                dj0.d dVar4 = (dj0.d) this.f8878b;
                g gVar4 = (g) this.f8879c;
                y49.f performance = (y49.f) obj2;
                Intrinsics.checkNotNullParameter(performance, "performance");
                Iterator it14 = performance.d.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        next = it14.next();
                        if (Intrinsics.f(((y49.c) next).f310834a, gVar4.getId())) {
                        }
                    } else {
                        next = null;
                    }
                }
                y49.c cVar8 = (y49.c) next;
                dj0.d dVar5 = cVar8 != null ? cVar8.f310836c : null;
                return dVar5 == null ? dVar4 : dVar5;
            case 23:
                com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar11 = (com.revolut.feature.retail.cfd.impl.screens.order.v2.a) this.f8878b;
                e2b.a aVar12 = (e2b.a) this.f8879c;
                Intrinsics.checkNotNullParameter((idf.b) obj2, "it");
                oki.h.v2(aVar11.K, new CfdOrderFormControllerContract$ModalStep.TargetPrice(aVar12, false, false), ModalDestination.Style.POPUP.f98311a);
                return Unit.f186387a;
            case 24:
                Data limits = (Data) this.f8878b;
                ((com.revolut.feature.retail.cfd.impl.screens.order.v2.a) this.f8879c).v.getClass();
                Intrinsics.checkNotNullParameter(limits, "limits");
                return b4b.n.a((b4b.n) obj2, null, null, null, limits, (Set) iii.c.f(limits, new a35.b(18), new a08.n(21), new a2g.m(2)), null, null, null, null, false, null, null, 8143);
            case 25:
                return b4d.d.f((b4d.d) this.f8878b, (ArrayList) this.f8879c);
            case 26:
                ((b4d.d) this.f8878b).f12298b.insert((SQLiteConnection) obj2, (Iterable) this.f8879c);
                return null;
            case 27:
                FavouritesAssetTypeKey favouritesAssetTypeKey = (FavouritesAssetTypeKey) this.f8878b;
                b4d.i iVar2 = (b4d.i) this.f8879c;
                mgd.g params = (mgd.g) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                if (params.f205262a.contains(favouritesAssetTypeKey)) {
                    ArrayList arrayListB = iVar2.f12304a.b(params);
                    ArrayList arrayList6 = new ArrayList(w.t(arrayListB, 10));
                    Iterator it15 = arrayListB.iterator();
                    while (it15.hasNext()) {
                        arrayList6.add(d4d.b.a((c4d.a) it15.next()));
                    }
                    iVar2.f12306c.f(b4d.g.a(b4d.i.Companion, params), arrayList6);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                List list5 = (List) obj2;
                return new z2h.b(list5.size(), ((c) this.f8878b).a(list5), (xi0.b) this.f8879c);
            default:
                List list6 = (List) this.f8878b;
                n nVar3 = (n) this.f8879c;
                List list7 = ((hdh.e) obj2).f151437a;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : list7) {
                    if (obj5 instanceof hdh.c) {
                        arrayList7.add(obj5);
                    }
                }
                Iterator it16 = arrayList7.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        next2 = it16.next();
                        TradingAccount account = ((hdh.c) next2).f151434a.getAccount();
                        if (Intrinsics.f(account.W(), TradingAccountType.Gia.f105270a) || (account instanceof TradingAccount.TaxAdvantage.JIsa.Personal)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                hdh.c cVar9 = (hdh.c) next2;
                if (cVar9 != null) {
                    if (!cVar9.f151434a.a()) {
                        cVar9 = null;
                    }
                    if (cVar9 != null) {
                        return new z2h.c(list6.size(), null, nVar3, cVar9.f151434a.getAccount());
                    }
                }
                return z2h.e.f319085a;
        }
    }

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f8877a = i;
        this.f8878b = obj2;
        this.f8879c = obj3;
    }
}

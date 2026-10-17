package hcj;

import ael.l0;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.biometric_verification.api.models.BiometricVerificationVisionRemoteResource;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.wero.impl.ui.pay.create.CreateRequestLinkData;
import com.revolut.feature.crypto.locked.balance.api.navigation.CryptoBalanceBreakdownInputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.TaxHubTransactionExportFilterScreenContract$InputData;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplateCreatePayload;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.additional_information.TravelHotelsBookingAdditionalInformationScreenContract$InputData;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.address_list.ReturnCryptoDepositAddressListScreenContract$InputData;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import dfj.b5;
import dfj.s4;
import et6.i2;
import et6.s3;
import g23.e0;
import hmf.k0;
import hmf.t;
import ht2.w;
import hy1.b0;
import ihd.v;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kd8.x;
import kjk.s;
import kkf.z7;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import l3d.h0;
import n4d.r0;
import nfj.z1;
import opf.c0;
import tof.a3;
import tof.i7;
import tof.k2;
import tof.x1;
import vkm.j2;
import vkm.v1;
import vkm.y;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f150915w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f150916x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f150917y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hg2.e eVar, a02.h hVar, Continuation continuation) {
        super(3, continuation);
        this.u = 1;
        this.f150916x = eVar;
        this.f150917y = hVar;
    }

    private final Object b(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f150915w;
            w4l.k kVar = (w4l.k) this.f150916x;
            com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.a aVar2 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.a) this.f150917y;
            vkm.d dVarB = rd0.e.b(m0k.e.b(aVar2.f103956s, WealthNewsCategory.Stocks.f101808b, false, aVar2.u.f103949a, null, null, null, new Integer(5), kVar instanceof w4l.i, 56));
            this.f150915w = null;
            this.f150916x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        switch (this.u) {
            case 0:
                o oVar = new o((Continuation) obj4, (p) this.f150917y, 0);
                oVar.f150915w = flowCollector;
                oVar.f150916x = obj3;
                return oVar.invokeSuspend(Unit.f186387a);
            case 1:
                o oVar2 = new o((hg2.e) this.f150916x, (a02.h) this.f150917y, (Continuation) obj4);
                oVar2.f150915w = flowCollector;
                return oVar2.invokeSuspend(Unit.f186387a);
            case 2:
                o oVar3 = new o((Continuation) obj4, (com.revolut.feature.retail.salary_account.impl.salary_hub.a) this.f150917y, 2);
                oVar3.f150915w = flowCollector;
                oVar3.f150916x = obj3;
                return oVar3.invokeSuspend(Unit.f186387a);
            case 3:
                o oVar4 = new o((Continuation) obj4, (com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.h) this.f150917y, 3);
                oVar4.f150915w = flowCollector;
                oVar4.f150916x = obj3;
                return oVar4.invokeSuspend(Unit.f186387a);
            case 4:
                o oVar5 = new o((Continuation) obj4, (hi2.n) this.f150917y, 4);
                oVar5.f150915w = flowCollector;
                oVar5.f150916x = obj3;
                return oVar5.invokeSuspend(Unit.f186387a);
            case 5:
                o oVar6 = new o((Continuation) obj4, (hk9.q) this.f150917y, 5);
                oVar6.f150915w = flowCollector;
                oVar6.f150916x = obj3;
                return oVar6.invokeSuspend(Unit.f186387a);
            case 6:
                o oVar7 = new o((Continuation) obj4, (hkb.d) this.f150917y, 6);
                oVar7.f150915w = flowCollector;
                oVar7.f150916x = obj3;
                return oVar7.invokeSuspend(Unit.f186387a);
            case 7:
                o oVar8 = new o((Continuation) obj4, (hkj.f) this.f150917y, 7);
                oVar8.f150915w = flowCollector;
                oVar8.f150916x = obj3;
                return oVar8.invokeSuspend(Unit.f186387a);
            case 8:
                o oVar9 = new o((Continuation) obj4, (t) this.f150917y, 8);
                oVar9.f150915w = flowCollector;
                oVar9.f150916x = obj3;
                return oVar9.invokeSuspend(Unit.f186387a);
            case 9:
                o oVar10 = new o((Continuation) obj4, (hq8.m) this.f150917y, 9);
                oVar10.f150915w = flowCollector;
                oVar10.f150916x = obj3;
                return oVar10.invokeSuspend(Unit.f186387a);
            case 10:
                o oVar11 = new o((Continuation) obj4, (hqk.d) this.f150917y, 10);
                oVar11.f150915w = flowCollector;
                oVar11.f150916x = obj3;
                return oVar11.invokeSuspend(Unit.f186387a);
            case 11:
                o oVar12 = new o((Continuation) obj4, (com.revolut.biometric_verification.impl.ui.step.document.flow.e) this.f150917y, 11);
                oVar12.f150915w = flowCollector;
                oVar12.f150916x = obj3;
                return oVar12.invokeSuspend(Unit.f186387a);
            case 12:
                o oVar13 = new o((Continuation) obj4, (w) this.f150917y, 12);
                oVar13.f150915w = flowCollector;
                oVar13.f150916x = obj3;
                return oVar13.invokeSuspend(Unit.f186387a);
            case 13:
                o oVar14 = new o((Continuation) obj4, (hy5.h) this.f150917y, 13);
                oVar14.f150915w = flowCollector;
                oVar14.f150916x = obj3;
                return oVar14.invokeSuspend(Unit.f186387a);
            case 14:
                o oVar15 = new o((Continuation) obj4, (hz6.k) this.f150917y, 14);
                oVar15.f150915w = flowCollector;
                oVar15.f150916x = obj3;
                return oVar15.invokeSuspend(Unit.f186387a);
            case 15:
                o oVar16 = new o((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a) this.f150917y, 15);
                oVar16.f150915w = flowCollector;
                oVar16.f150916x = obj3;
                return oVar16.invokeSuspend(Unit.f186387a);
            case 16:
                o oVar17 = new o((Continuation) obj4, (com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a) this.f150917y, 16);
                oVar17.f150915w = flowCollector;
                oVar17.f150916x = obj3;
                return oVar17.invokeSuspend(Unit.f186387a);
            case 17:
                o oVar18 = new o((Continuation) obj4, (i7g.g) this.f150917y, 17);
                oVar18.f150915w = flowCollector;
                oVar18.f150916x = obj3;
                return oVar18.invokeSuspend(Unit.f186387a);
            case 18:
                o oVar19 = new o((Continuation) obj4, (iad.g) this.f150917y, 18);
                oVar19.f150915w = flowCollector;
                oVar19.f150916x = obj3;
                return oVar19.invokeSuspend(Unit.f186387a);
            case 19:
                o oVar20 = new o((Continuation) obj4, (ibg.h) this.f150917y, 19);
                oVar20.f150915w = flowCollector;
                oVar20.f150916x = obj3;
                return oVar20.invokeSuspend(Unit.f186387a);
            case 20:
                o oVar21 = new o((Continuation) obj4, (com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a) this.f150917y, 20);
                oVar21.f150915w = flowCollector;
                oVar21.f150916x = obj3;
                return oVar21.invokeSuspend(Unit.f186387a);
            case 21:
                o oVar22 = new o((Continuation) obj4, (id8.j) this.f150917y, 21);
                oVar22.f150915w = flowCollector;
                oVar22.f150916x = obj3;
                return oVar22.invokeSuspend(Unit.f186387a);
            case 22:
                o oVar23 = new o((Continuation) obj4, (iga.j) this.f150917y, 22);
                oVar23.f150915w = flowCollector;
                oVar23.f150916x = obj3;
                return oVar23.invokeSuspend(Unit.f186387a);
            case 23:
                o oVar24 = new o((Continuation) obj4, (com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.a) this.f150917y, 23);
                oVar24.f150915w = flowCollector;
                oVar24.f150916x = obj3;
                return oVar24.invokeSuspend(Unit.f186387a);
            case 24:
                o oVar25 = new o((Continuation) obj4, (v) this.f150917y, 24);
                oVar25.f150915w = flowCollector;
                oVar25.f150916x = obj3;
                return oVar25.invokeSuspend(Unit.f186387a);
            case 25:
                o oVar26 = new o((Continuation) obj4, (iie.b) this.f150917y, 25);
                oVar26.f150915w = flowCollector;
                oVar26.f150916x = obj3;
                return oVar26.invokeSuspend(Unit.f186387a);
            case 26:
                o oVar27 = new o((Continuation) obj4, (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b) this.f150917y, 26);
                oVar27.f150915w = flowCollector;
                oVar27.f150916x = obj3;
                return oVar27.invokeSuspend(Unit.f186387a);
            case 27:
                o oVar28 = new o((Continuation) obj4, (com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b) this.f150917y, 27);
                oVar28.f150915w = flowCollector;
                oVar28.f150916x = obj3;
                return oVar28.invokeSuspend(Unit.f186387a);
            case 28:
                o oVar29 = new o((Continuation) obj4, (com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.a) this.f150917y, 28);
                oVar29.f150915w = flowCollector;
                oVar29.f150916x = obj3;
                return oVar29.invokeSuspend(Unit.f186387a);
            default:
                o oVar30 = new o((Continuation) obj4, (iqh.d) this.f150917y, 29);
                oVar30.f150915w = flowCollector;
                oVar30.f150916x = obj3;
                return oVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
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
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        Flow gVar;
        tzg.j jVar;
        Flow b0Var;
        FlowCollector flowCollector;
        Flow flowF;
        Flow kVar;
        int i = this.u;
        w4l.i loadingStrategy = w4l.i.f294643c;
        int i2 = 10;
        int i3 = 13;
        w4l.h hVar = w4l.h.f294642c;
        int i5 = 23;
        boolean z = false;
        z = false;
        z = false;
        Continuation continuation = null;
        Object obj3 = this.f150917y;
        int i6 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f150915w;
                    p pVar = (p) obj3;
                    r10.w wVar = pVar.o;
                    ReturnCryptoDepositAddressListScreenContract$InputData returnCryptoDepositAddressListScreenContract$InputData = pVar.f150918p;
                    wk5.a aVar2 = returnCryptoDepositAddressListScreenContract$InputData.f100125b;
                    xi0.b currency = returnCryptoDepositAddressListScreenContract$InputData.f100124a;
                    wVar.getClass();
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    Flow flowE = boh.f.e(aVar2 != null ? new go.g(new Data(aVar2, null, false, 6, null), 2) : nim.a.v(rd0.e.b(((bk5.a) wVar.f250866b).a(currency)), new hb4.k(i5)), new h56.a(wVar, i5));
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowE, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                FlowCollector flowCollector3 = this.f150915w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    co9.b bVar = ((hg2.e) this.f150916x).f152067a;
                    String str = ((a02.h) obj3).f113a.f107b;
                    this.f150915w = flowCollector3;
                    this.v = 1;
                    objA = bVar.a(str, this);
                    if (objA == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                PaymentCounterpartyInfo paymentCounterpartyInfo = (PaymentCounterpartyInfo) objA;
                if (paymentCounterpartyInfo != null) {
                    this.f150915w = null;
                    this.v = 2;
                    if (flowCollector3.emit(paymentCounterpartyInfo, this) == aVar3) {
                        return aVar3;
                    }
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f150915w;
                    vkm.d dVarA = ((com.revolut.feature.retail.salary_account.impl.salary_hub.a) obj3).f82991p.a((w4l.k) this.f150916x);
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, dVarA, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f150915w;
                    Set set = (Set) this.f150916x;
                    h0 h0Var = ((com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.h) obj3).f86954p;
                    List assetKeys = d0.d1(set);
                    h0Var.getClass();
                    Intrinsics.checkNotNullParameter(assetKeys, "assetTypeKeys");
                    Intrinsics.checkNotNullParameter(assetKeys, "assetKeys");
                    List list = assetKeys;
                    int iB = q0.b(zhm.w.t(list, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                    for (Object obj4 : list) {
                        linkedHashMap.put(obj4, (Integer) r0.f212393m.get(((FavouritesAssetTypeKey) obj4).f86866a));
                    }
                    Data dataP = zi0.c.P(linkedHashMap, false, null, 3);
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector5);
                    Object objEmit = new hg4.i(new ha3.w(flowCollector5, set, 1), i2).emit(dataP, this);
                    fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                    if (objEmit != aVar6) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit != aVar6) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit != aVar6) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit != aVar6) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = this.f150915w;
                    CreateRequestLinkData data = (CreateRequestLinkData) this.f150916x;
                    r10.f fVar = ((hi2.n) obj3).o;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(data, "data");
                    hrf.h.Companion.getClass();
                    hrf.h hVar2 = hrf.h.d;
                    c0 c0Var = (c0) fVar.c;
                    data.getClass();
                    hi2.f fVar2 = new hi2.f(hVar2, c0Var.a(new dj0.d(data.f63099a, data.f63100b)));
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector6);
                    Object objEmit2 = flowCollector6.emit(fVar2, this);
                    if (objEmit2 != aVar7) {
                        objEmit2 = Unit.f186387a;
                    }
                    if (objEmit2 != aVar7) {
                        objEmit2 = Unit.f186387a;
                    }
                    if (objEmit2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = this.f150915w;
                    dj0.d dVar = (dj0.d) this.f150916x;
                    hk9.q qVar = (hk9.q) obj3;
                    ti9.g gVar2 = (ti9.g) qVar.o;
                    akg.n nVarV = nim.a.v(xam.a.h(new s(6, dVar.f115082a, gVar2, null), rd0.e.b(gVar2.j(hVar))), new l2c.l(qVar.f152887r.f78903a, 21));
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector7, nVarV, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = this.f150915w;
                    hkb.d dVar2 = (hkb.d) obj3;
                    vkm.d dVarJ = dVar2.f152911p.j(dVar2.o.f83202a, hVar);
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector8, dVarJ, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = this.f150915w;
                    hkj.f fVar3 = (hkj.f) obj3;
                    vkm.d dVarA2 = fVar3.f152935q.a(fVar3.o.f101224a, hVar);
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector9, dVarA2, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                t tVar = (t) obj3;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = this.f150915w;
                    a3 a3Var = (a3) this.f150916x;
                    cmf.p pVarZ2 = tVar.f153917j.Z2();
                    cmf.p pVarZ22 = tVar.k.Z2();
                    cmf.p pVarZ23 = a3Var.f272585c1 == x1.UPI ? tVar.f153919m.Z2() : null;
                    cmf.p pVarA = tVar.f153918l.a();
                    lkf.d dVar3 = tVar.f153920n;
                    klf.h0 h0Var2 = dVar3.f196370l;
                    cmf.p pVar2 = new cmf.p(new t38.e(h0Var2.d(), 24, h0Var2.c(), new l0(3, dVar3, lkf.d.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;)Ljava/util/List;", 4, 25)), new lh9.b(20), u.c(dVar3), "ApmChargebackBlockProvider");
                    cmf.p pVarA2 = tVar.f153926w.a();
                    lkf.m mVar = tVar.o;
                    z7 z7Var = new z7(mVar.f196393a.d(), mVar, 29);
                    lh9.b bVar2 = new lh9.b(23);
                    f0 f0Var = f0.f322471a;
                    cmf.p pVar3 = new cmf.p(z7Var, bVar2, f0Var, "ApmNoteBlockProvider");
                    cmf.p pVarA3 = tVar.f153921p.a(false);
                    cmf.p pVarA4 = tVar.f153922q.a();
                    cmf.p pVarZ24 = tVar.f153923r.Z2();
                    cmf.p pVarZ25 = tVar.f153924s.Z2();
                    lkf.w wVar2 = tVar.f153925t;
                    cmf.p pVarA5 = k0.a(pVarA4, pVarZ24, pVarZ25, new cmf.p(new lkf.v(wVar2.f196413a.d(), wVar2, z ? 1 : 0), new lh9.b(26), f0Var, "ApmPaymentMethod"), tVar.u.a());
                    lkf.k kVar2 = tVar.v;
                    cmf.p[] elements = {pVarZ2, pVarZ22, pVarZ23, pVarA, pVar2, pVarA2, pVar3, pVarA3, pVarA5, new cmf.p(new z7(kVar2.f196388a.d(), kVar2, 28), new lh9.b(22), f0Var, "ApmId"), tVar.f153927x.a(), tVar.f153928y.b3(), tVar.z.c(true), tVar.A.Z2(), tVar.B.a(), tVar.C.a()};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    Flow flowH = tVar.h(kotlin.collections.d.L(elements));
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector10, flowH, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = this.f150915w;
                    hq8.m mVar2 = (hq8.m) obj3;
                    akg.n nVarA = hj8.a.a(mVar2.f154635p, mVar2.o.f154628a, (w4l.k) this.f150916x);
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector11, nVarA, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                hqk.d dVar4 = (hqk.d) obj3;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = this.f150915w;
                    i7 filter = (i7) this.f150916x;
                    gqk.e eVar = (gqk.e) dVar4.f154737a;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(filter, "filter");
                    mhf.b bVar3 = eVar.e;
                    k2[] elements2 = {k2.VALID_STATES, k2.NOT_SPARE_CHANGE, k2.SUSPICIOUS_BY_FRAUD_STATE};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    efm.r rVarB = gqk.e.b(com.revolut.domain.interactors.transactions.a.d(eVar.f145770a, mhf.b.a(bVar3, filter, kotlin.collections.d.y0(elements2), null, 4), null, null, null, null, 26), "SuspiciousTransactions");
                    efm.r rVarQ = ue0.e.q(((njf.j) eVar.f145771b).f(), zhm.h0.f322473a);
                    fal.b bVar4 = eVar.d;
                    fal.a aVar14 = fal.b.Companion;
                    efm.r map = te0.w.m(rVarB, rVarQ, gqk.e.b(((pal.a) bVar4).a(false), "KnownSuspiciousTransactionDetails")).map(new gjg.e(new gqk.a(eVar, z ? 1 : 0), 28));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    vkm.d dVarB = rd0.e.b(map);
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector12);
                    Object objCollect = dVarB.collect(new e0(flowCollector12, dVar4, i5), this);
                    if (objCollect != aVar13) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar13) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = this.f150915w;
                    com.revolut.biometric_verification.impl.ui.step.document.flow.e eVar2 = (com.revolut.biometric_verification.impl.ui.step.document.flow.e) obj3;
                    sr.a aVar16 = eVar2.v;
                    ArrayList arrayList = eVar2.u.f50542a.f50402a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : arrayList) {
                        if (obj5 instanceof BiometricVerificationVisionRemoteResource) {
                            arrayList2.add(obj5);
                        }
                    }
                    Flow flowA = aVar16.a(arrayList2);
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector13, flowA, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                w wVar3 = (w) obj3;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = this.f150915w;
                    boolean zBooleanValue = ((Boolean) this.f150916x).booleanValue();
                    wVar3.H2(wVar3.f155249t, new akm.d(zBooleanValue, 1));
                    if (zBooleanValue) {
                        n5j.i iVar = wVar3.f155245p;
                        gVar = new n5j.f(rd0.e.b(mwa.b.b(iVar.f212624a, pwa.n.RETAIL_TO_BUSINESS, false, 6)), iVar, i6);
                    } else {
                        gVar = new go.g(null, 2);
                    }
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector14, gVar, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = this.f150915w;
                    Pair pair = (Pair) this.f150916x;
                    xzg.k kVar3 = (xzg.k) pair.f186385a;
                    qta.f fVar4 = (qta.f) pair.f186386b;
                    xzg.m mVar3 = kVar3 instanceof xzg.m ? (xzg.m) kVar3 : null;
                    List list2 = mVar3 != null ? mVar3.d : null;
                    hy5.h hVar3 = (hy5.h) obj3;
                    nw5.a aVar19 = hVar3.f156741p;
                    if (list2 == null) {
                        b0Var = new go.g(f0.f322471a, 2);
                    } else {
                        efm.r rVarG = m70.a.g(zi0.c.o(aVar19.a(list2, n9l.b.SEC_3)), null, new hy2.b(5), 1);
                        switch (hy5.e.f156736a[fVar4.ordinal()]) {
                            case 1:
                                jVar = tzg.j.ONE_DAY;
                                break;
                            case 2:
                                jVar = tzg.j.ONE_WEEK;
                                break;
                            case 3:
                                jVar = tzg.j.ONE_MONTH;
                                break;
                            case 4:
                                jVar = tzg.j.THREE_MONTHS;
                                break;
                            case 5:
                                jVar = tzg.j.SIX_MONTHS;
                                break;
                            case 6:
                                jVar = tzg.j.ONE_YEAR;
                                break;
                            case 7:
                                jVar = tzg.j.FIVE_YEARS;
                                break;
                            case 8:
                                jVar = tzg.j.ALL;
                                break;
                            default:
                                throw new IllegalStateException("Unrecognized tab clicked");
                        }
                        b0Var = new b0(rd0.e.b(te0.w.l(rVarG, m70.a.g(zi0.c.o(aVar19.b(list2, jVar)), null, new hy2.b(6), 1))), hVar3, list2, 4);
                    }
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector15, b0Var, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector16 = this.f150915w;
                    vkm.d dVarB2 = rd0.e.b(rd0.e.c(((hz6.k) obj3).o.f129383a.d.c(Unit.f186387a, true), kotlin.coroutines.g.f186406a));
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector16, dVarB2, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector17 = this.f150915w;
                    com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a aVar22 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a) obj3;
                    gr6.q qVar2 = aVar22.f74379p;
                    TaxHubTransactionExportFilterScreenContract$InputData taxHubTransactionExportFilterScreenContract$InputData = aVar22.o;
                    LocalDate startDate = taxHubTransactionExportFilterScreenContract$InputData.f74372a;
                    LocalDate endDate = taxHubTransactionExportFilterScreenContract$InputData.f74373b;
                    s3 s3Var = (s3) qVar2;
                    s3Var.getClass();
                    Intrinsics.checkNotNullParameter(startDate, "startDate");
                    Intrinsics.checkNotNullParameter(endDate, "endDate");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    Flow flowE2 = boh.f.e(((i2) s3Var.f129323a).c(loadingStrategy), new eed.i(s3Var, 11, startDate, endDate));
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector17, flowE2, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector18 = this.f150915w;
                    i52.o oVar = ((com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a) obj3).f62472q;
                    Flow flowC = ((q12.f) oVar.f158576c).c(c52.b.a(oVar.f158575b), oVar.f158574a.f62468c);
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector18);
                    Object objCollect2 = flowC.collect(new i52.l(flowCollector18, oVar, z ? 1 : 0), this);
                    if (objCollect2 != aVar23) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 != aVar23) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector19 = this.f150915w;
                    i7g.g gVar3 = (i7g.g) obj3;
                    akg.n nVarA2 = gVar3.o.a(((i7g.e) ((j2) gVar3.f159298q.f22677a).getValue()).f159293a, (w4l.k) this.f150916x);
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector19, nVarA2, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector20 = this.f150915w;
                    iad.g gVar4 = (iad.g) obj3;
                    zjh.i iVar2 = gVar4.f159994p;
                    InvoiceTemplateCreatePayload payload = gVar4.o.f86421a;
                    iVar2.getClass();
                    Intrinsics.checkNotNullParameter(payload, "payload");
                    y9d.e eVar3 = (y9d.e) iVar2.f322838b;
                    eVar3.getClass();
                    Intrinsics.checkNotNullParameter(payload, "payload");
                    Flow flowE3 = t1.E(rd0.e.e(new y(new wda.l(2, 13, null), new v1(new xkl.e(eVar3, payload, continuation, 5))), zhm.h0.f322473a, new v77.c(3, 14, continuation)));
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector20, flowE3, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector21 = this.f150915w;
                    ibg.h hVar4 = (ibg.h) obj3;
                    i9g.d0 d0Var = hVar4.f160170p;
                    TravelHotelsBookingAdditionalInformationScreenContract$InputData travelHotelsBookingAdditionalInformationScreenContract$InputData = hVar4.o;
                    vkm.d dVarB3 = rd0.e.b(ue0.e.p(d0Var.a(travelHotelsBookingAdditionalInformationScreenContract$InputData.f93846a, travelHotelsBookingAdditionalInformationScreenContract$InputData.f93847b, travelHotelsBookingAdditionalInformationScreenContract$InputData.f93848c), zhm.h0.f322473a));
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector21, dVarB3, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a aVar27 = (com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a) obj3;
                cli.y yVar = aVar27.A;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector22 = this.f150915w;
                    List list3 = ((ich.l) ((j2) yVar.f22677a).getValue()).i;
                    InstrumentsCollectionSortOption instrumentsCollectionSortOption = ((ich.l) ((j2) yVar.f22677a).getValue()).f160275g;
                    Object obj6 = (List) ((ich.l) ((j2) yVar.f22677a).getValue()).f160276h.getContent();
                    if (obj6 == null) {
                        obj6 = f0.f322471a;
                    }
                    if (Intrinsics.f(obj6, list3) && Intrinsics.f((InstrumentsCollectionSortOption) aVar27.z.getValue(), instrumentsCollectionSortOption)) {
                        zzg.g gVar5 = (zzg.g) ((ich.l) ((j2) yVar.f22677a).getValue()).f160272a.getContent();
                        if (ue0.e.n(gVar5 != null ? gVar5.f326735a : null)) {
                            z = true;
                        }
                    }
                    wkm.l lVarD = aVar27.v.d(aVar27.o.f95602a, instrumentsCollectionSortOption, list3, z);
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector22, lVarD, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector23 = this.f150915w;
                    Map map2 = (Map) this.f150916x;
                    Continuation continuation2 = null;
                    if (map2.isEmpty()) {
                        flowF = new go.g(f0.f322471a, 2);
                        flowCollector = null;
                    } else {
                        id8.j jVar2 = (id8.j) obj3;
                        x xVar = jVar2.f160445a;
                        xVar.getClass();
                        w4l.i loadingStrategy2 = w4l.i.f294643c;
                        Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                        xc8.d dVar5 = xc8.d.PAYMENT_LINKS;
                        ae8.c cVar = new ae8.c(bla.b.b(xVar.f182860b, "YOUTH"), i3);
                        a67.c cVar2 = new a67.c(continuation2, xVar, loadingStrategy2, dVar5, 26);
                        flowCollector = null;
                        flowF = mo3.a.f(vkm.q.Q(cVar, cVar2), new i83.m(i5), new id8.f(map2, jVar2), new i83.m(24));
                    }
                    this.f150915w = flowCollector;
                    this.f150916x = flowCollector;
                    this.v = 1;
                    if (vkm.q.u(flowCollector23, flowF, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector24 = this.f150915w;
                    String str2 = (String) this.f150916x;
                    wik.n nVar = (wik.n) ((iga.j) obj3).f161110q;
                    nVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    kjk.f0 f0Var2 = (kjk.f0) nVar.f297927c;
                    f0Var2.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    x4l.c cVar3 = f0Var2.f184443q;
                    if (str2 == null) {
                        str2 = "";
                    }
                    vkm.d dVarB4 = cVar3.b(str2, loadingStrategy);
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector24, dVarB4, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.a aVar31 = (com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.a) obj3;
                CryptoBalanceBreakdownInputData cryptoBalanceBreakdownInputData = aVar31.o;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector25 = this.f150915w;
                    w4l.k loadingStrategy3 = (w4l.k) this.f150916x;
                    oh5.d dVar6 = aVar31.f70879p;
                    xi0.a aVar33 = xi0.b.Companion;
                    String str3 = cryptoBalanceBreakdownInputData.f70872a;
                    aVar33.getClass();
                    xi0.b currency2 = xi0.a.a(str3);
                    boolean z3 = cryptoBalanceBreakdownInputData.f70873b;
                    dVar6.getClass();
                    Intrinsics.checkNotNullParameter(currency2, "currency");
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    Flow flowE4 = dVar6.f225308a.e(loadingStrategy3);
                    Flow xVar2 = !z3 ? new mle.x(flowE4, dVar6, currency2, 5) : new t38.e(flowE4, 24, dVar6.f225309b.c(currency2, loadingStrategy3), new amf.k(dVar6, currency2, continuation, 7));
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector25, xVar2, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector26 = this.f150915w;
                    v vVar = (v) obj3;
                    h0 h0Var3 = vVar.f161394p;
                    CombinedWatchlistContext combinedWatchlistContext = vVar.f161395q.d;
                    v1 v1VarG = h0.g(h0Var3, combinedWatchlistContext.f86890b, combinedWatchlistContext.f86889a, false, false, null, 96);
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector26, v1VarG, this) == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                iie.b bVar5 = (iie.b) obj3;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector27 = this.f150915w;
                    ProductAccountDescriptor$Value productAccountDescriptor$Value = (ProductAccountDescriptor$Value) this.f150916x;
                    if (bVar5.f161609l.isEmpty()) {
                        kVar = new go.g(f0.f322471a, 2);
                    } else {
                        List list4 = bVar5.f161609l;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it8 = list4.iterator();
                        while (it8.hasNext()) {
                            arrayList3.add(((pfe.i) it8.next()).t(productAccountDescriptor$Value));
                        }
                        kVar = new ag1.k((Flow[]) d0.d1(arrayList3).toArray(new Flow[0]), 27);
                    }
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector27, kVar, this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector28 = this.f150915w;
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b bVar6 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b) obj3;
                    s4 s4Var = bVar6.f101121p;
                    String str4 = bVar6.o.f101108c;
                    z1 z1Var = ((b5) s4Var).f113922b;
                    z1Var.getClass();
                    akg.n nVarV2 = nim.a.v(t1.E(new v1(new mtj.i(i3, z1Var, str4, continuation))), new dee.x(i5));
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector28, nVarV2, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b bVar7 = (com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b) obj3;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector29 = this.f150915w;
                    Flow flowH2 = xam.a.h(new iqg.o(bVar7, continuation, z ? 1 : 0), rd0.e.b(((ypg.p) bVar7.f94748q).j(bVar7.o.f94744a, hVar)));
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector29, flowH2, this) == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                return b(obj2);
            default:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector30 = this.f150915w;
                    int iIntValue = ((Number) this.f150916x).intValue();
                    this.f150915w = null;
                    this.f150916x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector30);
                    Object objCollect3 = ((iqh.d) obj3).collect(new iw4.j(flowCollector30, iIntValue, 0), this);
                    if (objCollect3 != aVar38) {
                        objCollect3 = Unit.f186387a;
                    }
                    if (objCollect3 != aVar38) {
                        objCollect3 = Unit.f186387a;
                    }
                    if (objCollect3 == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f150917y = obj2;
    }
}

package x4k;

import ahe.h0;
import asa.h;
import asa.m;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.shared.feature.wealth.domain.api.WealthDomainApi$Toggles$ChartsCachingImprovements;
import do3.n;
import gim.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import sa6.v;
import sa6.w;
import skm.e0;
import u6c.t;
import vdl.j1;
import vdl.k1;
import vdl.l1;
import vkm.q;
import w4l.j;
import wkm.l;
import xkf.b2;
import yhm.o;
import yra.x;
import zhl.k;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function3 {
    public Object A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f302882w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f302883x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f302884y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Continuation continuation, b9k.f fVar, BankTransferData bankTransferData) {
        super(3, continuation);
        this.u = 0;
        this.z = fVar;
        this.A = bankTransferData;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        switch (this.u) {
            case 0:
                c cVar = new c((Continuation) obj4, (b9k.f) this.z, (BankTransferData) this.A);
                cVar.f302882w = flowCollector;
                cVar.f302883x = obj3;
                return cVar.invokeSuspend(Unit.f186387a);
            case 1:
                c cVar2 = new c((Continuation) obj4, (x66.d) this.f302884y, (List) this.z, (wk5.a) this.A, 1);
                cVar2.f302882w = flowCollector;
                cVar2.f302883x = obj3;
                return cVar2.invokeSuspend(Unit.f186387a);
            case 2:
                c cVar3 = new c((Continuation) obj4, (y57.b) this.f302884y, (String) this.z, (String) this.A, 2);
                cVar3.f302882w = flowCollector;
                cVar3.f302883x = obj3;
                return cVar3.invokeSuspend(Unit.f186387a);
            case 3:
                c cVar4 = new c((Continuation) obj4, (x) this.z);
                cVar4.f302882w = flowCollector;
                cVar4.f302883x = obj3;
                return cVar4.invokeSuspend(Unit.f186387a);
            case 4:
                c cVar5 = new c((yt9.g) this.f302884y, (io3.d) this.f302883x, (AccountId) this.z, (CountryProfile) this.A, (Continuation) obj4);
                cVar5.f302882w = flowCollector;
                return cVar5.invokeSuspend(Unit.f186387a);
            case 5:
                c cVar6 = new c((Continuation) obj4, (z57.b) this.f302884y, (String) this.z, (String) this.A, 5);
                cVar6.f302882w = flowCollector;
                cVar6.f302883x = obj3;
                return cVar6.invokeSuspend(Unit.f186387a);
            case 6:
                c cVar7 = new c((Continuation) obj4, (com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a) this.f302884y, (xi0.b) this.z, (xi0.b) this.A, 6);
                cVar7.f302882w = flowCollector;
                cVar7.f302883x = obj3;
                return cVar7.invokeSuspend(Unit.f186387a);
            case 7:
                c cVar8 = new c((Continuation) obj4, (zc7.i) this.f302884y, (String) this.z, (String) this.A, 7);
                cVar8.f302882w = flowCollector;
                cVar8.f302883x = obj3;
                return cVar8.invokeSuspend(Unit.f186387a);
            case 8:
                c cVar9 = new c((Continuation) obj4, (zge.i) this.f302884y, (oge.a) this.z, (n) this.A, 8);
                cVar9.f302882w = flowCollector;
                cVar9.f302883x = obj3;
                return cVar9.invokeSuspend(Unit.f186387a);
            default:
                c cVar10 = new c((Continuation) obj4, (k) this.f302884y, (String) this.z, (Flow) this.A, 9);
                cVar10.f302882w = flowCollector;
                cVar10.f302883x = obj3;
                return cVar10.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        FlowCollector flowCollector;
        Object objO;
        FlowCollector flowCollector2;
        PushToCardTransferData transferData;
        Flow flowI;
        Flow flowS;
        int i = this.u;
        int i2 = 0;
        int i3 = 4;
        int i5 = 2;
        Continuation continuation = null;
        Object obj3 = this.z;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    flowCollector = this.f302882w;
                    boolean zBooleanValue = ((Boolean) this.f302883x).booleanValue();
                    b9k.f fVar = (b9k.f) obj3;
                    BankTransferData bankTransferData = (BankTransferData) this.A;
                    this.f302882w = null;
                    this.f302883x = null;
                    this.f302884y = flowCollector;
                    this.v = 1;
                    fVar.getClass();
                    objO = e0.o(new g(fVar, bankTransferData, zBooleanValue, null), this);
                    if (objO == aVar) {
                        return aVar;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    flowCollector = (FlowCollector) this.f302884y;
                    o.b(obj2);
                    objO = obj2;
                }
                this.f302882w = null;
                this.f302883x = null;
                this.f302884y = null;
                this.v = 2;
                if (q.u(flowCollector, (Flow) objO, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            case 1:
                List list = (List) obj3;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector3 = this.f302882w;
                    xi0.b bVar = (xi0.b) this.f302883x;
                    u66.b bVar2 = ((x66.d) this.f302884y).d;
                    Intrinsics.h(bVar);
                    SortingType.MarketCap marketCap = new SortingType.MarketCap(0);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        linkedHashSet.add(((xi0.b) it8.next()).f306286a);
                    }
                    akg.n nVarV = nim.a.v(bVar2.c(new q66.c(4, 0, bVar, marketCap, null, linkedHashSet, (wk5.a) this.A)), new ht4.a(list, i3));
                    this.f302882w = null;
                    this.f302883x = null;
                    this.v = 1;
                    if (q.u(flowCollector3, nVarV, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector4 = this.f302882w;
                    Flow flowJ = ((Boolean) this.f302883x).booleanValue() ? ((y57.b) this.f302884y).j((String) obj3, (String) this.A) : org.bouncycastle.jcajce.provider.digest.a.s(3, null);
                    this.f302882w = null;
                    this.f302883x = null;
                    this.v = 1;
                    if (q.u(flowCollector4, flowJ, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                x xVar = (x) obj3;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    flowCollector2 = this.f302882w;
                    transferData = (PushToCardTransferData) this.f302883x;
                    efm.b bVarC0 = xVar.f316202s.c0(transferData);
                    this.f302882w = null;
                    this.f302883x = null;
                    this.f302884y = flowCollector2;
                    this.A = transferData;
                    this.v = 1;
                    if (nim.a.a(bVarC0, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    transferData = (PushToCardTransferData) this.A;
                    flowCollector2 = (FlowCollector) this.f302884y;
                    o.b(obj2);
                }
                m mVar = (m) xVar.u;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(transferData, "transferData");
                l lVarQ = q.Q(ta6.a.h(transferData.f81528b > 0 ? mVar.f8903a.c(transferData) : new go.g(null, 2), ((yt9.g) mVar.f8905c).g(transferData.e, transferData.f), mVar.d(transferData), new h0(i3, i5, continuation)), new h(continuation, mVar, transferData, i2));
                this.f302882w = null;
                this.f302883x = null;
                this.f302884y = null;
                this.A = null;
                this.v = 2;
                if (q.u(flowCollector2, lVarQ, this) == aVar4) {
                    return aVar4;
                }
                return Unit.f186387a;
            case 4:
                FlowCollector flowCollector5 = this.f302882w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    PaymentPocketInfo paymentPocketInfoH = ((yt9.g) this.f302884y).h((io3.d) this.f302883x, (AccountId) obj3, (CountryProfile) this.A);
                    this.f302882w = null;
                    this.v = 1;
                    if (flowCollector5.emit(paymentPocketInfoH, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector6 = this.f302882w;
                    Flow flowJ2 = ((Boolean) this.f302883x).booleanValue() ? ((z57.b) this.f302884y).j((String) obj3, (String) this.A) : org.bouncycastle.jcajce.provider.digest.a.s(3, null);
                    this.f302882w = null;
                    this.f302883x = null;
                    this.v = 1;
                    if (q.u(flowCollector6, flowJ2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector7 = this.f302882w;
                    v vVar = (v) ((od0.i) this.f302883x).f224257a;
                    if (vVar == null) {
                        w wVar = ((com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a) this.f302884y).f72092t;
                        xi0.b donationCurrency = (xi0.b) obj3;
                        xi0.b bVar3 = (xi0.b) this.A;
                        sa6.x xVar2 = (sa6.x) wVar;
                        xVar2.getClass();
                        Intrinsics.checkNotNullParameter(donationCurrency, "donationCurrency");
                        q7c.g gVar = xVar2.f261352a;
                        u6c.n nVar = new u6c.n(null, null, t.DONATIONS, null, donationCurrency, false, null, null, 995);
                        k6c.a aVar8 = k6c.b.Companion;
                        flowI = c8g.a.D(nim.a.v(gVar.d(nVar), new s06.e(xVar2, 6, donationCurrency, bVar3)));
                    } else {
                        od0.i.Companion.getClass();
                        flowI = zi0.c.i(od0.h.a(vVar));
                    }
                    this.f302882w = null;
                    this.f302883x = null;
                    this.v = 1;
                    if (q.u(flowCollector7, flowI, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector8 = this.f302882w;
                    if (((Boolean) this.f302883x).booleanValue()) {
                        String str = (String) this.A;
                        zc7.d dVar = zc7.i.Companion;
                        flowS = ((zc7.i) this.f302884y).j((String) obj3, null, str);
                    } else {
                        flowS = org.bouncycastle.jcajce.provider.digest.a.s(3, null);
                    }
                    this.f302882w = null;
                    this.f302883x = null;
                    this.v = 1;
                    if (q.u(flowCollector8, flowS, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                zge.i iVar = (zge.i) this.f302884y;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector9 = this.f302882w;
                    Pair pair = (Pair) this.f302883x;
                    long jLongValue = ((Number) pair.f186385a).longValue();
                    List list2 = (List) pair.f186386b;
                    l lVarQ2 = q.Q(iVar.f322119c.c(), new ei3.f(2, jLongValue, iVar, null));
                    n nVar2 = (n) this.A;
                    this.f302882w = null;
                    this.f302883x = null;
                    this.v = 1;
                    q.w(flowCollector9);
                    Object objCollect = lVarQ2.collect(new acb.h(flowCollector9, iVar, list2, (oge.a) obj3, nVar2, 14), this);
                    if (objCollect != aVar10) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar10) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                k kVar = (k) this.f302884y;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector10 = this.f302882w;
                    Pair pair2 = (Pair) this.f302883x;
                    eel.c chartPeriod = (eel.c) pair2.f186385a;
                    eel.i chartValueType = (eel.i) pair2.f186386b;
                    gte.a aVar12 = kVar.d;
                    WealthDomainApi$Toggles$ChartsCachingImprovements wealthDomainApi$Toggles$ChartsCachingImprovements = WealthDomainApi$Toggles$ChartsCachingImprovements.f105071c;
                    boolean zC = ((jte.d) aVar12).c(wealthDomainApi$Toggles$ChartsCachingImprovements);
                    w4l.k kVarD = w4l.i.f294643c;
                    w4l.k loadingStrategy = zC ? j.f294644c : kVarD;
                    l1 l1Var = kVar.f322451a;
                    String ref2 = (String) obj3;
                    eel.m tradingHours = eel.m.EXTENDED;
                    Intrinsics.checkNotNullParameter(ref2, "ref");
                    Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
                    Intrinsics.checkNotNullParameter(chartValueType, "chartValueType");
                    Intrinsics.checkNotNullParameter(tradingHours, "tradingHours");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    j1 j1Var = new j1(ref2, chartPeriod, chartValueType, tradingHours);
                    x4l.c cVar = l1Var.i;
                    if (k1.f287991a[chartPeriod.ordinal()] != 1) {
                        kVarD = l1Var.f.d(loadingStrategy, l1.b(j1Var), ((jte.d) l1Var.f287999g).c(wealthDomainApi$Toggles$ChartsCachingImprovements));
                    }
                    vkm.d dVarB = cVar.b(j1Var, kVarD);
                    int i96 = zhl.e.f322438a[chartPeriod.ordinal()];
                    Long l2 = i96 != 1 ? i96 != 2 ? null : 600L : 60L;
                    j23.b bVarD = yh5.b.d((Flow) this.A, q.Q(l2 != null ? ta6.a.I(l2.longValue(), TimeUnit.SECONDS) : new go.g(Unit.f186387a, 2), new z6e.g(continuation, dVarB, 13)));
                    this.f302882w = null;
                    this.f302883x = null;
                    this.v = 1;
                    q.w(flowCollector10);
                    Object objCollect2 = bVarD.collect(new b2(flowCollector10, kVar, 21), this);
                    if (objCollect2 != aVar11) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 != aVar11) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Continuation continuation, Object obj2, Object obj3, Object obj4, int i) {
        super(3, continuation);
        this.u = i;
        this.f302884y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Continuation continuation, x xVar) {
        super(3, continuation);
        this.u = 3;
        this.z = xVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yt9.g gVar, io3.d dVar, AccountId accountId, CountryProfile countryProfile, Continuation continuation) {
        super(3, continuation);
        this.u = 4;
        this.f302884y = gVar;
        this.f302883x = dVar;
        this.z = accountId;
        this.A = countryProfile;
    }
}

package cvi;

import a26.p;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.network.CreditCardService;
import com.revolut.feature.robo.api.RoboApi$Toggles;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.TransactionsDayNightLimitsScreenContract$InputData;
import com.revolut.feature.staking.impl.service.unstaking.UnstakingDataService;
import com.revolut.rxdata.core.CompositeException;
import d2g.y;
import dfj.x;
import doc.t;
import dp4.c0;
import dwi.i0;
import efm.r;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import le.u1;
import lhk.a0;
import nd.m;
import nj8.n;
import org.joda.time.DateTime;
import ql4.p0;
import r10.v;
import vkm.q;
import vkm.q0;
import yhm.o;
import yn4.z;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f109473w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f109474x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f109475y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f109475y = obj2;
    }

    private final Object b(Object obj2) {
        dn8.f fVar = (dn8.f) this.f109475y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f109473w;
            w4l.k kVar = (w4l.k) this.f109474x;
            uf0.b bVarG = yh5.b.g(((n) fVar.f116239p).k(null, kVar), fVar.f116240q.a(kVar), rd0.e.b(fVar.f116241r.k(kVar.equals(w4l.i.f294643c))), fVar.f116242s.a(fVar.o.f116236b, kVar));
            this.f109473w = null;
            this.f109474x = null;
            this.v = 1;
            if (q.u(flowCollector, bVarG, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object c(Object obj2) throws Throwable {
        Flow flowI;
        akg.n nVarV;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f109473w;
            Pair pair = (Pair) this.f109474x;
            pdh.c selectedTimeSpan = (pdh.c) pair.f186385a;
            doc.d chartInput = (doc.d) pair.f186386b;
            loc.b bVar = ((t) this.f109475y).f116519n;
            bVar.getClass();
            qmc.d dVar = bVar.f197448c;
            Intrinsics.checkNotNullParameter(chartInput, "chartInput");
            Intrinsics.checkNotNullParameter(selectedTimeSpan, "timeSpan");
            Continuation continuation = null;
            if (chartInput instanceof doc.c) {
                nVarV = nim.a.v(bVar.f197446a.b(new alc.c(((doc.c) chartInput).f116492a, null, selectedTimeSpan)), new llb.e(28));
            } else if (chartInput instanceof doc.a) {
                String str = ((doc.a) chartInput).f116485a;
                nVarV = nim.a.v(u0.m(xam.a.h(new a0(bVar, selectedTimeSpan, continuation, 6), rd0.e.b(bVar.d.B(str, w4l.h.f294642c))), dVar.b(str)), new llb.e(29));
            } else {
                if (!(chartInput instanceof doc.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                kge.d dVar2 = bVar.f197447b;
                String portfolioId = ((doc.b) chartInput).f116488a;
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(selectedTimeSpan, "selectedTimeSpan");
                Flow flowE = boh.f.e(((x8h.k) dVar2.f183975c).b(), new li8.n(dVar2, 6, portfolioId, selectedTimeSpan));
                Flow flowB = dVar.b(portfolioId);
                if (((jte.d) bVar.e).c(RoboApi$Toggles.RoboUkBePerformanceCalculation.f85025c)) {
                    flowI = xam.a.h(new a0(bVar, portfolioId, continuation, 5), bVar.f.b());
                } else {
                    flowI = zi0.c.i(f0.f322471a);
                }
                nVarV = nim.a.v(u0.i(flowE, flowB, flowI), new loc.a(0));
            }
            q0 q0VarN = rd0.e.n(nVarV, h0.f322473a);
            this.f109473w = null;
            this.f109474x = null;
            this.v = 1;
            q.w(flowCollector);
            Object objCollect = q0VarN.collect(new dc0.c(flowCollector, selectedTimeSpan, 5), this);
            if (objCollect != aVar) {
                objCollect = Unit.f186387a;
            }
            if (objCollect != aVar) {
                objCollect = Unit.f186387a;
            }
            if (objCollect == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Type inference failed for: r10v7, types: [ll4.d] */
    /* JADX WARN: Type inference failed for: r11v1, types: [ll4.d[]] */
    /* JADX WARN: Type inference failed for: r13v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v7, types: [ll4.d] */
    /* JADX WARN: Type inference failed for: r17v8, types: [java.lang.Enum] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cvi.i.n(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj2) {
        String str;
        Object instalmentPlans;
        cp4.a0 a0Var = (cp4.a0) this.f109474x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            str = a0Var.f107777a;
            CreditCardService creditCardService = ((c0) this.f109475y).f116604a;
            this.f109474x = null;
            this.f109473w = str;
            this.v = 1;
            instalmentPlans = creditCardService.getInstalmentPlans(str, this);
            if (instalmentPlans == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.f109473w;
            o.b(obj2);
            instalmentPlans = obj2;
        }
        String facilityId = str;
        Iterable<yn4.a0> iterable = (Iterable) instalmentPlans;
        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
        for (yn4.a0 a0Var2 : iterable) {
            Intrinsics.checkNotNullParameter(a0Var2, "<this>");
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            String strC = a0Var2.getId();
            Instant instantOfEpochMilli = Instant.ofEpochMilli(a0Var2.getCreatedAt());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            ql4.t tVarA = zn4.c.a(a0Var2.getState());
            int iH = a0Var2.getSettledInstalments();
            int iJ = a0Var2.getTerm();
            dj0.d dVarO = mo3.a.o(a0Var2.getPrincipalAmount());
            dj0.d dVarO2 = mo3.a.o(a0Var2.getRemainingTotalAmount());
            jo3.a aVarD = a0Var2.getNextDueAmount();
            dj0.d dVarO3 = aVarD != null ? mo3.a.o(aVarD) : null;
            LocalDate localDateE = a0Var2.getNextDueDate();
            List listK = a0Var2.getTransactionIds();
            z.a aVarA = a0Var2.getCancellation();
            ql4.l lVarF = aVarA != null ? zn4.c.f(aVarA) : null;
            p0 p0Var = ql4.q0.Companion;
            String strL = a0Var2.getType();
            if (strL == null) {
                strL = "";
            }
            p0Var.getClass();
            arrayList.add(new ql4.k(strC, facilityId, instantOfEpochMilli, tVarA, iJ, iH, dVarO, dVarO2, dVarO3, localDateE, listK, lVarF, p0.a(strL)));
        }
        return arrayList;
    }

    private final Object p(Object obj2) {
        boolean z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f109473w;
            Data[] dataArr = (Data[]) ((Object[]) this.f109474x);
            ArrayList<Throwable> arrayList = new ArrayList();
            for (Data data : dataArr) {
                Throwable error = data.getError();
                if (error != null) {
                    arrayList.add(error);
                }
            }
            int length = dataArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                if (dataArr[i2].getLoading()) {
                    z = true;
                    break;
                }
                i2++;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Data data2 : dataArr) {
                Object content = data2.getContent();
                if (content != null) {
                    arrayList2.add(content);
                }
            }
            if (arrayList2.size() < ((ArrayList) this.f109475y).size() && !z && !arrayList.isEmpty()) {
                for (Throwable th10 : arrayList) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "NEtWorthDelegate", "networth type was not loaded", th10, h0Var);
                }
            }
            Data data3 = new Data(arrayList2, arrayList.isEmpty() ? null : new CompositeException(arrayList), z);
            this.f109473w = null;
            this.f109474x = null;
            this.v = 1;
            if (flowCollector.emit(data3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object s(Object obj2) {
        Flow gVar;
        Flow gVar2;
        com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a aVar = (com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a) this.f109475y;
        wtc.k kVar = aVar.f85727p;
        TransactionsDayNightLimitsScreenContract$InputData transactionsDayNightLimitsScreenContract$InputData = aVar.o;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f109473w;
            do3.n nVar = (do3.n) this.f109474x;
            aVar.f85730s.getClass();
            bwc.d dVar = wtc.q0.b(nVar) ? bwc.d.INDIA : bwc.d.BRAZIL;
            aVar.H2(aVar.f85732w, new p(dVar, 20));
            cuc.g gVar3 = transactionsDayNightLimitsScreenContract$InputData.f85720a;
            cuc.g gVar4 = cuc.g.OTHER;
            if (gVar3 != gVar4) {
                cuc.z zVar = (cuc.z) ((wtc.n) kVar).f299887a;
                zVar.getClass();
                w4l.i loadingStrategy = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                gVar = nim.a.v(zVar.e.b(Unit.f186387a, loadingStrategy), new wpj.b(gVar3, 12));
            } else {
                gVar = new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
            }
            Flow flowV = (transactionsDayNightLimitsScreenContract$InputData.f85720a == gVar4 && dVar == bwc.d.BRAZIL) ? nim.a.v(rd0.e.b(osg.b.k(((wtc.n) kVar).f299888b, false, 3)), new wsg.a(18)) : new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
            if (transactionsDayNightLimitsScreenContract$InputData.f85720a == gVar4 && dVar == bwc.d.BRAZIL) {
                r rVarX = mt8.d.c(aVar.u).x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                gVar2 = new dmj.k(rd0.e.b(rVarX), 12);
            } else {
                gVar2 = new go.g(Boolean.FALSE, 2);
            }
            j23.b bVarE = yh5.b.e(gVar, flowV, gVar2);
            this.f109473w = null;
            this.f109474x = null;
            this.v = 1;
            if (q.u(flowCollector, bVarE, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object t(Object obj2) {
        m mVar;
        String str = (String) this.f109474x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            dwd.a aVar2 = (dwd.a) this.f109475y;
            m mVar2 = aVar2.d;
            UnstakingDataService unstakingDataService = aVar2.f120368b;
            this.f109474x = null;
            this.f109473w = mVar2;
            this.v = 1;
            obj2 = unstakingDataService.getUnstakingData(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
            mVar = mVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = (m) this.f109473w;
            o.b(obj2);
        }
        pwd.a unstakingDataDto = (pwd.a) obj2;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(unstakingDataDto, "unstakingDataDto");
        Intrinsics.checkNotNullParameter(unstakingDataDto, "unstakingDataDto");
        DateTime dateTime = new DateTime(unstakingDataDto.getUnstakingStartDate());
        wtd.b bVar = (wtd.b) u1.t(unstakingDataDto.getState(), wtd.b.UNKNOWN, uvd.a.f283355b);
        String productId = unstakingDataDto.getProductId();
        String estimatedLockUpEndDate = unstakingDataDto.getEstimatedLockUpEndDate();
        return new ewd.a(dateTime, bVar, productId, estimatedLockUpEndDate != null ? new DateTime(estimatedLockUpEndDate) : null);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                i iVar = new i((Continuation) obj4, (k) this.f109475y, 0);
                iVar.f109473w = (FlowCollector) obj2;
                iVar.f109474x = obj3;
                return iVar.invokeSuspend(Unit.f186387a);
            case 1:
                i iVar2 = new i((Continuation) obj4, (com.revolut.trading.orders.ui.screens.pocket_picker.b) this.f109475y, 1);
                iVar2.f109473w = (FlowCollector) obj2;
                iVar2.f109474x = obj3;
                return iVar2.invokeSuspend(Unit.f186387a);
            case 2:
                i iVar3 = new i((Continuation) obj4, (cw6.l) this.f109475y, 2);
                iVar3.f109473w = (FlowCollector) obj2;
                iVar3.f109474x = obj3;
                return iVar3.invokeSuspend(Unit.f186387a);
            case 3:
                i iVar4 = new i((Continuation) obj4, (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) this.f109475y, 3);
                iVar4.f109473w = (FlowCollector) obj2;
                iVar4.f109474x = obj3;
                return iVar4.invokeSuspend(Unit.f186387a);
            case 4:
                i iVar5 = new i((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) this.f109475y, 4);
                iVar5.f109473w = (FlowCollector) obj2;
                iVar5.f109474x = obj3;
                return iVar5.invokeSuspend(Unit.f186387a);
            case 5:
                i iVar6 = new i((Continuation) obj4, (y) this.f109475y, 5);
                iVar6.f109473w = (FlowCollector) obj2;
                iVar6.f109474x = obj3;
                return iVar6.invokeSuspend(Unit.f186387a);
            case 6:
                i iVar7 = new i((d34.e) this.f109475y, (Continuation) obj4, 6);
                iVar7.f109474x = (d34.a) obj3;
                return iVar7.invokeSuspend(Unit.f186387a);
            case 7:
                i iVar8 = new i((Continuation) obj4, (d4f.p) this.f109475y, 7);
                iVar8.f109473w = (FlowCollector) obj2;
                iVar8.f109474x = obj3;
                return iVar8.invokeSuspend(Unit.f186387a);
            case 8:
                i iVar9 = new i((Continuation) obj4, (d4j.c) this.f109475y, 8);
                iVar9.f109473w = (FlowCollector) obj2;
                iVar9.f109474x = obj3;
                return iVar9.invokeSuspend(Unit.f186387a);
            case 9:
                i iVar10 = new i((Continuation) obj4, (d6e.r) this.f109475y, 9);
                iVar10.f109473w = (FlowCollector) obj2;
                iVar10.f109474x = obj3;
                return iVar10.invokeSuspend(Unit.f186387a);
            case 10:
                i iVar11 = new i((Continuation) obj4, (com.revolut.feature.travel.flights.impl.ui.screen.itinerary.a) this.f109475y, 10);
                iVar11.f109473w = (FlowCollector) obj2;
                iVar11.f109474x = obj3;
                return iVar11.invokeSuspend(Unit.f186387a);
            case 11:
                i iVar12 = new i((Continuation) obj4, (d78.t) this.f109475y, 11);
                iVar12.f109473w = (FlowCollector) obj2;
                iVar12.f109474x = obj3;
                return iVar12.invokeSuspend(Unit.f186387a);
            case 12:
                i iVar13 = new i((Continuation) obj4, (com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details.a) this.f109475y, 12);
                iVar13.f109473w = (FlowCollector) obj2;
                iVar13.f109474x = obj3;
                return iVar13.invokeSuspend(Unit.f186387a);
            case 13:
                i iVar14 = new i((Continuation) obj4, (u6j.c) this.f109475y, 13);
                iVar14.f109473w = (FlowCollector) obj2;
                iVar14.f109474x = obj3;
                return iVar14.invokeSuspend(Unit.f186387a);
            case 14:
                i iVar15 = new i((Continuation) obj4, (com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a) this.f109475y, 14);
                iVar15.f109473w = (FlowCollector) obj2;
                iVar15.f109474x = obj3;
                return iVar15.invokeSuspend(Unit.f186387a);
            case 15:
                i iVar16 = new i((dbd.g) this.f109475y, (Continuation) obj4, 15);
                iVar16.f109474x = (String) obj3;
                return iVar16.invokeSuspend(Unit.f186387a);
            case 16:
                i iVar17 = new i((dbd.g) this.f109475y, (Continuation) obj4, 16);
                iVar17.f109474x = (dbd.d) obj3;
                return iVar17.invokeSuspend(Unit.f186387a);
            case 17:
                i iVar18 = new i((dbd.g) this.f109475y, (Continuation) obj4, 17);
                iVar18.f109474x = (vad.g) obj3;
                return iVar18.invokeSuspend(Unit.f186387a);
            case 18:
                i iVar19 = new i((Continuation) obj4, (v) this.f109475y, 18);
                iVar19.f109473w = (FlowCollector) obj2;
                iVar19.f109474x = obj3;
                return iVar19.invokeSuspend(Unit.f186387a);
            case 19:
                i iVar20 = new i((Continuation) obj4, (x) this.f109475y, 19);
                iVar20.f109473w = (FlowCollector) obj2;
                iVar20.f109474x = obj3;
                return iVar20.invokeSuspend(Unit.f186387a);
            case 20:
                i iVar21 = new i((Continuation) obj4, (com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup.a) this.f109475y, 20);
                iVar21.f109473w = (FlowCollector) obj2;
                iVar21.f109474x = obj3;
                return iVar21.invokeSuspend(Unit.f186387a);
            case 21:
                i iVar22 = new i((Continuation) obj4, (dlf.j) this.f109475y, 21);
                iVar22.f109473w = (FlowCollector) obj2;
                iVar22.f109474x = obj3;
                return iVar22.invokeSuspend(Unit.f186387a);
            case 22:
                i iVar23 = new i((Continuation) obj4, (dn8.f) this.f109475y, 22);
                iVar23.f109473w = (FlowCollector) obj2;
                iVar23.f109474x = obj3;
                return iVar23.invokeSuspend(Unit.f186387a);
            case 23:
                i iVar24 = new i((Continuation) obj4, (t) this.f109475y, 23);
                iVar24.f109473w = (FlowCollector) obj2;
                iVar24.f109474x = obj3;
                return iVar24.invokeSuspend(Unit.f186387a);
            case 24:
                i iVar25 = new i((dp4.r) this.f109475y, (Continuation) obj4, 24);
                iVar25.f109474x = (cp4.n) obj3;
                return iVar25.invokeSuspend(Unit.f186387a);
            case 25:
                i iVar26 = new i((c0) this.f109475y, (Continuation) obj4, 25);
                iVar26.f109474x = (cp4.a0) obj3;
                return iVar26.invokeSuspend(Unit.f186387a);
            case 26:
                i iVar27 = new i((Continuation) obj4, (ArrayList) this.f109475y, 26);
                iVar27.f109473w = (FlowCollector) obj2;
                iVar27.f109474x = (Object[]) obj3;
                return iVar27.invokeSuspend(Unit.f186387a);
            case 27:
                i iVar28 = new i((Continuation) obj4, (com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a) this.f109475y, 27);
                iVar28.f109473w = (FlowCollector) obj2;
                iVar28.f109474x = obj3;
                return iVar28.invokeSuspend(Unit.f186387a);
            case 28:
                i iVar29 = new i((dwd.a) this.f109475y, (Continuation) obj4, 28);
                iVar29.f109474x = (String) obj3;
                return iVar29.invokeSuspend(Unit.f186387a);
            default:
                i iVar30 = new i((Continuation) obj4, (i0) this.f109475y, 29);
                iVar30.f109473w = (FlowCollector) obj2;
                iVar30.f109474x = obj3;
                return iVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b7 A[LOOP:0: B:126:0x02b1->B:128:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x033d A[LOOP:3: B:149:0x0337->B:151:0x033d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0780 A[LOOP:4: B:322:0x077a->B:324:0x0780, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v85, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r2v87, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 2864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cvi.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f109475y = obj2;
    }
}

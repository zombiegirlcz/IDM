package dz6;

import a83.o0;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import com.revolut.feature.rev_points.impl.ui.wrapped.cards.RevPointsWrappedCardsScreenContract$InputData;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import e69.u;
import eh9.z;
import ekf.v;
import esj.c0;
import et6.u1;
import f1c.t;
import f23.l0;
import java.time.LocalDate;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mif.e0;
import vdl.c1;
import vkm.s1;
import vkm.y;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f121251w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f121252x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f121253y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f121253y = obj2;
    }

    private final Object b(Object obj2) throws Throwable {
        com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b bVar = (com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b) this.f121253y;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        int i2 = 1;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f121251w;
            w4l.k loadingStrategy = (w4l.k) this.f121252x;
            twg.c cVar = bVar.f104168p;
            ph7.c collectionKey = ph7.c.FREE_STOCKS;
            Map selectedFilters = r0.g();
            cVar.getClass();
            InstrumentsTrendCollectionId.FreeStocks collectionId = InstrumentsTrendCollectionId.FreeStocks.f74899a;
            Intrinsics.checkNotNullParameter(collectionId, "collectionId");
            Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
            Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            Flow flowE = boh.f.e(boh.f.e(cVar.L(collectionId, collectionKey, selectedFilters, loadingStrategy), new ai7.b(cVar, collectionKey, i2)), new eu7.c(bVar, 21));
            usc.a aVar = bVar.f104169q;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            e8h.j jVar = (e8h.j) aVar.f282889b;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            vkm.d dVarB = jVar.d.b(Unit.f186387a, loadingStrategy);
            Continuation continuation = null;
            o0 o0Var = new o0(3, 4, continuation);
            this.f121251w = null;
            this.f121252x = null;
            this.v = 1;
            vkm.q.w(flowCollector);
            Object objG = e0.g(this, s1.f290118a, new c1((Function3) o0Var, continuation, 15), flowCollector, new Flow[]{flowE, dVarB});
            if (objG != fim.a.COROUTINE_SUSPENDED) {
                objG = Unit.f186387a;
            }
            if (objG != fim.a.COROUTINE_SUSPENDED) {
                objG = Unit.f186387a;
            }
            if (objG == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f121251w;
            w4l.k loadingStrategy = (w4l.k) this.f121252x;
            t tVar = (t) this.f121253y;
            u29.q qVar = tVar.f131252p;
            RevPointsWrappedCardsScreenContract$InputData revPointsWrappedCardsScreenContract$InputData = tVar.o;
            LocalDate localDate = revPointsWrappedCardsScreenContract$InputData.f83933a;
            LocalDate localDate2 = revPointsWrappedCardsScreenContract$InputData.f83934b;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            Flow flowH = xam.a.h(new a9h.c(9, qVar, localDate, localDate2, loadingStrategy, (Continuation) null), f39.c.b(qVar.f276582b));
            this.f121251w = null;
            this.f121252x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, flowH, this) == aVar) {
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

    private final Object n(Object obj2) {
        Flow gVar;
        l0 l0Var = (l0) this.f121253y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f121251w;
            Continuation continuation = null;
            if (((Boolean) this.f121252x).booleanValue()) {
                gVar = new y(new u1(mo3.a.g(((et6.g) l0Var.d).d(w4l.h.f294642c), null, null, 3), l0Var, 5), new eob.e(3, 12, continuation));
            } else {
                gVar = new go.g(Boolean.FALSE, 2);
            }
            this.f121251w = null;
            this.f121252x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, gVar, this) == aVar) {
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

    private final Object o(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f121251w;
            hel.b bVar = ((TradingLegalEntityInformation) this.f121252x).f105106a;
            int i2 = bVar == null ? -1 : f28.c.f131451a[bVar.ordinal()];
            Flow gVar = (i2 == -1 || i2 == 1) ? new go.g(Boolean.FALSE, 2) : rd0.e.b(ue0.e.y(((f28.t) this.f121253y).f.d(wog.a.ANALYTICS), m72.b.w("InvestAnalyticsWidget", "isAvailable"), f28.h.f131465a));
            this.f121251w = null;
            this.f121252x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, gVar, this) == aVar) {
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
                n nVar = new n((Continuation) obj4, (q) this.f121253y, 0);
                nVar.f121251w = flowCollector;
                nVar.f121252x = obj3;
                return nVar.invokeSuspend(Unit.f186387a);
            case 1:
                n nVar2 = new n((Continuation) obj4, (e0a.l) this.f121253y, 1);
                nVar2.f121251w = flowCollector;
                nVar2.f121252x = obj3;
                return nVar2.invokeSuspend(Unit.f186387a);
            case 2:
                n nVar3 = new n((Continuation) obj4, (e1c.q) this.f121253y, 2);
                nVar3.f121251w = flowCollector;
                nVar3.f121252x = obj3;
                return nVar3.invokeSuspend(Unit.f186387a);
            case 3:
                n nVar4 = new n((Continuation) obj4, (com.revolut.feature.semi_independent_onboarding.impl.ui.details.b) this.f121253y, 3);
                nVar4.f121251w = flowCollector;
                nVar4.f121252x = obj3;
                return nVar4.invokeSuspend(Unit.f186387a);
            case 4:
                n nVar5 = new n((Continuation) obj4, (u) this.f121253y, 4);
                nVar5.f121251w = flowCollector;
                nVar5.f121252x = obj3;
                return nVar5.invokeSuspend(Unit.f186387a);
            case 5:
                n nVar6 = new n((Continuation) obj4, (e75.o) this.f121253y, 5);
                nVar6.f121251w = flowCollector;
                nVar6.f121252x = obj3;
                return nVar6.invokeSuspend(Unit.f186387a);
            case 6:
                n nVar7 = new n((Continuation) obj4, (com.revolut.feature.global_markets.impl.ui.flow.index_details.b) this.f121253y, 6);
                nVar7.f121251w = flowCollector;
                nVar7.f121252x = obj3;
                return nVar7.invokeSuspend(Unit.f186387a);
            case 7:
                n nVar8 = new n((Continuation) obj4, (eaf.q) this.f121253y, 7);
                nVar8.f121251w = flowCollector;
                nVar8.f121252x = obj3;
                return nVar8.invokeSuspend(Unit.f186387a);
            case 8:
                n nVar9 = new n((Continuation) obj4, (com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a) this.f121253y, 8);
                nVar9.f121251w = flowCollector;
                nVar9.f121252x = obj3;
                return nVar9.invokeSuspend(Unit.f186387a);
            case 9:
                n nVar10 = new n((Continuation) obj4, (eh8.k) this.f121253y, 9);
                nVar10.f121251w = flowCollector;
                nVar10.f121252x = obj3;
                return nVar10.invokeSuspend(Unit.f186387a);
            case 10:
                n nVar11 = new n((Continuation) obj4, (z) this.f121253y, 10);
                nVar11.f121251w = flowCollector;
                nVar11.f121252x = obj3;
                return nVar11.invokeSuspend(Unit.f186387a);
            case 11:
                n nVar12 = new n((Continuation) obj4, (ei3.m) this.f121253y, 11);
                nVar12.f121251w = flowCollector;
                nVar12.f121252x = obj3;
                return nVar12.invokeSuspend(Unit.f186387a);
            case 12:
                n nVar13 = new n((Continuation) obj4, (eic.t) this.f121253y, 12);
                nVar13.f121251w = flowCollector;
                nVar13.f121252x = obj3;
                return nVar13.invokeSuspend(Unit.f186387a);
            case 13:
                n nVar14 = new n((Continuation) obj4, (com.revolut.feature.atm.impl.ui.redesign.details.a) this.f121253y, 13);
                nVar14.f121251w = flowCollector;
                nVar14.f121252x = obj3;
                return nVar14.invokeSuspend(Unit.f186387a);
            case 14:
                n nVar15 = new n((Continuation) obj4, (v) this.f121253y, 14);
                nVar15.f121251w = flowCollector;
                nVar15.f121252x = obj3;
                return nVar15.invokeSuspend(Unit.f186387a);
            case 15:
                n nVar16 = new n((Continuation) obj4, (com.revolut.retail.feature.pricing_plans.ui.impl.widget.b) this.f121253y, 15);
                nVar16.f121251w = flowCollector;
                nVar16.f121252x = obj3;
                return nVar16.invokeSuspend(Unit.f186387a);
            case 16:
                n nVar17 = new n((Continuation) obj4, (com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.b) this.f121253y, 16);
                nVar17.f121251w = flowCollector;
                nVar17.f121252x = obj3;
                return nVar17.invokeSuspend(Unit.f186387a);
            case 17:
                n nVar18 = new n((Continuation) obj4, (com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.f121253y, 17);
                nVar18.f121251w = flowCollector;
                nVar18.f121252x = obj3;
                return nVar18.invokeSuspend(Unit.f186387a);
            case 18:
                n nVar19 = new n((Continuation) obj4, (c0) this.f121253y, 18);
                nVar19.f121251w = flowCollector;
                nVar19.f121252x = obj3;
                return nVar19.invokeSuspend(Unit.f186387a);
            case 19:
                n nVar20 = new n((Continuation) obj4, (eu7.b) this.f121253y, 19);
                nVar20.f121251w = flowCollector;
                nVar20.f121252x = (Object[]) obj3;
                return nVar20.invokeSuspend(Unit.f186387a);
            case 20:
                n nVar21 = new n((Continuation) obj4, (ev4.q) this.f121253y, 20);
                nVar21.f121251w = flowCollector;
                nVar21.f121252x = obj3;
                return nVar21.invokeSuspend(Unit.f186387a);
            case 21:
                n nVar22 = new n((Continuation) obj4, (r10.t) this.f121253y, 21);
                nVar22.f121251w = flowCollector;
                nVar22.f121252x = obj3;
                return nVar22.invokeSuspend(Unit.f186387a);
            case 22:
                n nVar23 = new n((Continuation) obj4, (evi.g) this.f121253y, 22);
                nVar23.f121251w = flowCollector;
                nVar23.f121252x = obj3;
                return nVar23.invokeSuspend(Unit.f186387a);
            case 23:
                n nVar24 = new n((Continuation) obj4, (com.revolut.feature.rev_points.impl.ui.challenges.home.b) this.f121253y, 23);
                nVar24.f121251w = flowCollector;
                nVar24.f121252x = obj3;
                return nVar24.invokeSuspend(Unit.f186387a);
            case 24:
                n nVar25 = new n((Continuation) obj4, (com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b) this.f121253y, 24);
                nVar25.f121251w = flowCollector;
                nVar25.f121252x = obj3;
                return nVar25.invokeSuspend(Unit.f186387a);
            case 25:
                n nVar26 = new n((Continuation) obj4, (f0e.d) this.f121253y, 25);
                nVar26.f121251w = flowCollector;
                nVar26.f121252x = obj3;
                return nVar26.invokeSuspend(Unit.f186387a);
            case 26:
                n nVar27 = new n((Continuation) obj4, (t) this.f121253y, 26);
                nVar27.f121251w = flowCollector;
                nVar27.f121252x = obj3;
                return nVar27.invokeSuspend(Unit.f186387a);
            case 27:
                n nVar28 = new n((Continuation) obj4, (l0) this.f121253y, 27);
                nVar28.f121251w = flowCollector;
                nVar28.f121252x = obj3;
                return nVar28.invokeSuspend(Unit.f186387a);
            case 28:
                n nVar29 = new n((Continuation) obj4, (f28.t) this.f121253y, 28);
                nVar29.f121251w = flowCollector;
                nVar29.f121252x = obj3;
                return nVar29.invokeSuspend(Unit.f186387a);
            default:
                n nVar30 = new n((Continuation) obj4, (f39.c) this.f121253y, 29);
                nVar30.f121251w = flowCollector;
                nVar30.f121252x = (Object[]) obj3;
                return nVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:509:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dz6.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

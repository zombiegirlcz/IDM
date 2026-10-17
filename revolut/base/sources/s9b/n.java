package s9b;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.review.PaymentReviewContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.flow.PortfolioInsightsFlowContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mif.e0;
import s6e.v;
import smd.u;
import ss4.y;
import tf1.i0;
import tf1.l0;
import tf1.n0;
import tf1.o0;
import tf1.p0;
import tf1.q0;
import vdl.c1;
import vkm.s1;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f261161w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f261162x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f261163y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f261163y = obj2;
    }

    private final Object b(Object obj2) throws Throwable {
        com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.a aVar = (com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.a) this.f261163y;
        PortfolioInsightsFlowContract$InputData portfolioInsightsFlowContract$InputData = aVar.o;
        emc.e eVar = aVar.f91380p;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        int i2 = 1;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f261161w;
            akg.n nVarV = nim.a.v(eVar.a(portfolioInsightsFlowContract$InputData.f91377a), t7f.g.f268662a);
            vkm.d dVarD = eVar.d(portfolioInsightsFlowContract$InputData.f91377a);
            Continuation continuation = null;
            sne.e eVar2 = new sne.e(aVar, continuation, i2);
            this.f261161w = null;
            this.f261162x = null;
            this.v = 1;
            vkm.q.w(flowCollector);
            Object objG = e0.g(this, s1.f290118a, new c1((Function3) eVar2, continuation, 15), flowCollector, new Flow[]{nVarV, dVarD});
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
            FlowCollector flowCollector = (FlowCollector) this.f261161w;
            w4l.k loadingStrategy = (w4l.k) this.f261162x;
            com.revolut.feature.junior.isa.impl.ui.jisa_national_number.a aVar2 = (com.revolut.feature.junior.isa.impl.ui.jisa_national_number.a) this.f261163y;
            z98.d dVar = aVar2.f76806p;
            String str = aVar2.o.f76802a;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-identity-auth-domain-model-RegisteredIdentityId$-juniorRegId$0");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            ca8.a aVar3 = dVar.f320320a;
            aVar3.getClass();
            Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-identity-auth-domain-model-RegisteredIdentityId$-juniorRegId$0");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            vkm.d dVarB = aVar3.d.b(str, loadingStrategy);
            this.f261161w = null;
            this.f261162x = null;
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

    private final Object n(Object obj2) {
        ryc.a aVar = (ryc.a) this.f261163y;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f261161w;
            ArrayList arrayListA = ((l0) aVar.f258289a).a((List) this.f261162x);
            Flow gVar = arrayListA.isEmpty() ? new go.g(o0.f270192a, 2) : new v((Flow[]) d0.d1(arrayListA).toArray(new Flow[0]), aVar, 19);
            this.f261161w = null;
            this.f261162x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, gVar, this) == aVar2) {
                return aVar2;
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
            FlowCollector flowCollector = (FlowCollector) this.f261161w;
            Pair[] pairArr = (Pair[]) ((Object[]) this.f261162x);
            ryc.a aVar2 = (ryc.a) this.f261163y;
            List listV0 = kotlin.collections.d.v0(pairArr);
            ArrayList arrayList = new ArrayList();
            Iterator it8 = listV0.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Pair pair = (Pair) it8.next();
                qf1.m mVar = (qf1.m) ((Data) pair.f186386b).getContent();
                Pair pair2 = mVar != null ? new Pair(pair.f186385a, mVar) : null;
                if (pair2 != null) {
                    arrayList.add(pair2);
                }
            }
            Object n0Var = !arrayList.isEmpty() ? new n0(arrayList, (List) aVar2.f258290b) : o0.f270192a;
            this.f261161w = null;
            this.f261162x = null;
            this.v = 1;
            if (flowCollector.emit(n0Var, this) == aVar) {
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

    private final Object p(Object obj2) {
        ArrayList arrayList;
        Flow flowJ;
        i0 i0Var;
        qf1.l lVar;
        jt0.b bVar = (jt0.b) this.f261163y;
        ryc.a aVar = (ryc.a) bVar.d;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f261161w;
            Data data = (Data) this.f261162x;
            List list = (List) data.getContent();
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((tj1.c) obj3).f271597b == tj1.e.ADD_NEW_WIDGET_PRODUCT) {
                        arrayList.add(obj3);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                flowJ = data.getLoading() ? new go.g(q0.f270197a, 2) : ((arrayList == null || !arrayList.isEmpty()) && data.getError() != null) ? new go.g(p0.f270194a, 2) : aVar.j();
            } else {
                su9.c cVar = (su9.c) bVar.f178266c;
                ArrayList<qf1.l> advisedProductIds = new ArrayList();
                Iterator it8 = arrayList.iterator();
                while (true) {
                    int i2 = 0;
                    if (!it8.hasNext()) {
                        break;
                    }
                    String str = ((tj1.c) it8.next()).f271596a;
                    qf1.l[] lVarArrValues = qf1.l.values();
                    int length = lVarArrValues.length;
                    while (true) {
                        if (i2 >= length) {
                            lVar = null;
                            break;
                        }
                        lVar = lVarArrValues[i2];
                        if (a0.z(lVar.name(), str, true)) {
                            break;
                        }
                        i2++;
                    }
                    if (lVar == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("AddNewProductId enum does not have the matching name with the Advised Component id");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    }
                    if (lVar != null) {
                        advisedProductIds.add(lVar);
                    }
                }
                Intrinsics.checkNotNullParameter(advisedProductIds, "advisedProductIds");
                l0 l0Var = (l0) cVar.f265693a;
                ArrayList arrayListS = t61.a.s("advisedProductIds", advisedProductIds);
                for (qf1.l lVar2 : advisedProductIds) {
                    mf1.c cVar2 = (mf1.c) l0Var.f270178a.get(lVar2);
                    if (cVar2 != null) {
                        i0Var = new i0(cVar2.isAvailable(), lVar2, 0);
                    } else {
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "WidgetFlowHelper", "No widget data source for " + lVar2, null, h0Var2);
                        i0Var = null;
                    }
                    if (i0Var != null) {
                        arrayListS.add(i0Var);
                    }
                }
                flowJ = arrayListS.isEmpty() ? ((ryc.a) cVar.f265694b).j() : vkm.q.Q(new j23.b((Flow[]) d0.d1(arrayListS).toArray(new Flow[0]), 22), new tf1.e0((Continuation) null, cVar, advisedProductIds));
            }
            this.f261161w = null;
            this.f261162x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, flowJ, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object s(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f261161w;
            th9.j jVar = ((th9.v) this.f261163y).f271352q;
            x02.b bVar = jVar.f271340b;
            PaymentReviewContract$InputData paymentReviewContract$InputData = jVar.f271339a;
            Flow flowC = ((q12.f) bVar).c(new ApmQuoteDirection.Outgoing(oh9.b.a(paymentReviewContract$InputData.f78796a)), paymentReviewContract$InputData.f78797b);
            this.f261161w = null;
            this.f261162x = null;
            this.v = 1;
            vkm.q.w(flowCollector);
            Object objCollect = flowC.collect(new te8.j(flowCollector, 15), this);
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
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                n nVar = new n((Continuation) obj4, (p) this.f261163y, 0);
                nVar.f261161w = (FlowCollector) obj2;
                nVar.f261162x = obj3;
                return nVar.invokeSuspend(Unit.f186387a);
            case 1:
                n nVar2 = new n((Continuation) obj4, (com.revolut.feature.subscriptions.impl.payment_balance_picker.b) this.f261163y, 1);
                nVar2.f261161w = (FlowCollector) obj2;
                nVar2.f261162x = obj3;
                return nVar2.invokeSuspend(Unit.f186387a);
            case 2:
                n nVar3 = new n((Continuation) obj4, (sc3.c) this.f261163y, 2);
                nVar3.f261161w = (FlowCollector) obj2;
                nVar3.f261162x = obj3;
                return nVar3.invokeSuspend(Unit.f186387a);
            case 3:
                n nVar4 = new n((Continuation) obj4, (sec.o) this.f261163y, 3);
                nVar4.f261161w = (FlowCollector) obj2;
                nVar4.f261162x = obj3;
                return nVar4.invokeSuspend(Unit.f186387a);
            case 4:
                n nVar5 = new n((Continuation) obj4, (sl1.c) this.f261163y, 4);
                nVar5.f261161w = (FlowCollector) obj2;
                nVar5.f261162x = obj3;
                return nVar5.invokeSuspend(Unit.f186387a);
            case 5:
                n nVar6 = new n((Continuation) obj4, (u) this.f261163y, 5);
                nVar6.f261161w = (FlowCollector) obj2;
                nVar6.f261162x = obj3;
                return nVar6.invokeSuspend(Unit.f186387a);
            case 6:
                n nVar7 = new n((Continuation) obj4, (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b) this.f261163y, 6);
                nVar7.f261161w = (FlowCollector) obj2;
                nVar7.f261162x = obj3;
                return nVar7.invokeSuspend(Unit.f186387a);
            case 7:
                n nVar8 = new n((Continuation) obj4, (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i) this.f261163y, 7);
                nVar8.f261161w = (FlowCollector) obj2;
                nVar8.f261162x = obj3;
                return nVar8.invokeSuspend(Unit.f186387a);
            case 8:
                n nVar9 = new n((Continuation) obj4, (sr8.g) this.f261163y, 8);
                nVar9.f261161w = (FlowCollector) obj2;
                nVar9.f261162x = obj3;
                return nVar9.invokeSuspend(Unit.f186387a);
            case 9:
                n nVar10 = new n((Continuation) obj4, (y) this.f261163y, 9);
                nVar10.f261161w = (FlowCollector) obj2;
                nVar10.f261162x = obj3;
                return nVar10.invokeSuspend(Unit.f186387a);
            case 10:
                n nVar11 = new n((Continuation) obj4, (com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a) this.f261163y, 10);
                nVar11.f261161w = (FlowCollector) obj2;
                nVar11.f261162x = obj3;
                return nVar11.invokeSuspend(Unit.f186387a);
            case 11:
                n nVar12 = new n(this.f261163y, (Continuation) obj4, 11);
                nVar12.f261161w = (FlowCollector) obj2;
                nVar12.f261162x = (Throwable) obj3;
                return nVar12.invokeSuspend(Unit.f186387a);
            case 12:
                n nVar13 = new n((Continuation) obj4, (sw6.h) this.f261163y, 12);
                nVar13.f261161w = (FlowCollector) obj2;
                nVar13.f261162x = obj3;
                return nVar13.invokeSuspend(Unit.f186387a);
            case 13:
                n nVar14 = new n((swg.f) this.f261163y, (Continuation) obj4, 13);
                nVar14.f261162x = (pwg.n) obj3;
                return nVar14.invokeSuspend(Unit.f186387a);
            case 14:
                n nVar15 = new n((swg.f) this.f261163y, (Continuation) obj4, 14);
                nVar15.f261161w = (pwg.n) obj2;
                nVar15.f261162x = (pwg.d) obj3;
                return nVar15.invokeSuspend(Unit.f186387a);
            case 15:
                n nVar16 = new n((swg.f) this.f261163y, (Continuation) obj4, 15);
                nVar16.f261161w = (pwg.p) obj2;
                nVar16.f261162x = (pwg.a) obj3;
                return nVar16.invokeSuspend(Unit.f186387a);
            case 16:
                n nVar17 = new n((Continuation) obj4, (sxi.q) this.f261163y, 16);
                nVar17.f261161w = (FlowCollector) obj2;
                nVar17.f261162x = obj3;
                return nVar17.invokeSuspend(Unit.f186387a);
            case 17:
                n nVar18 = new n((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a) this.f261163y, 17);
                nVar18.f261161w = (FlowCollector) obj2;
                nVar18.f261162x = obj3;
                return nVar18.invokeSuspend(Unit.f186387a);
            case 18:
                n nVar19 = new n((Continuation) obj4, (syk.o) this.f261163y, 18);
                nVar19.f261161w = (FlowCollector) obj2;
                nVar19.f261162x = obj3;
                return nVar19.invokeSuspend(Unit.f186387a);
            case 19:
                n nVar20 = new n((Continuation) obj4, (t27.r) this.f261163y, 19);
                nVar20.f261161w = (FlowCollector) obj2;
                nVar20.f261162x = obj3;
                return nVar20.invokeSuspend(Unit.f186387a);
            case 20:
                n nVar21 = new n((Continuation) obj4, (com.revolut.feature.store.impl.ui.brand_detail.screen.earn.a) this.f261163y, 20);
                nVar21.f261161w = (FlowCollector) obj2;
                nVar21.f261162x = obj3;
                return nVar21.invokeSuspend(Unit.f186387a);
            case 21:
                n nVar22 = new n((Continuation) obj4, (com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c) this.f261163y, 21);
                nVar22.f261161w = (FlowCollector) obj2;
                nVar22.f261162x = obj3;
                return nVar22.invokeSuspend(Unit.f186387a);
            case 22:
                n nVar23 = new n((Continuation) obj4, (ib7.j) this.f261163y, 22);
                nVar23.f261161w = (FlowCollector) obj2;
                nVar23.f261162x = obj3;
                return nVar23.invokeSuspend(Unit.f186387a);
            case 23:
                n nVar24 = new n((Continuation) obj4, (com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.a) this.f261163y, 23);
                nVar24.f261161w = (FlowCollector) obj2;
                nVar24.f261162x = obj3;
                return nVar24.invokeSuspend(Unit.f186387a);
            case 24:
                n nVar25 = new n((Continuation) obj4, (com.revolut.feature.junior.isa.impl.ui.jisa_national_number.a) this.f261163y, 24);
                nVar25.f261161w = (FlowCollector) obj2;
                nVar25.f261162x = obj3;
                return nVar25.invokeSuspend(Unit.f186387a);
            case 25:
                n nVar26 = new n((Continuation) obj4, (ryc.a) this.f261163y, 25);
                nVar26.f261161w = (FlowCollector) obj2;
                nVar26.f261162x = obj3;
                return nVar26.invokeSuspend(Unit.f186387a);
            case 26:
                n nVar27 = new n((Continuation) obj4, (ryc.a) this.f261163y, 26);
                nVar27.f261161w = (FlowCollector) obj2;
                nVar27.f261162x = (Object[]) obj3;
                return nVar27.invokeSuspend(Unit.f186387a);
            case 27:
                n nVar28 = new n((Continuation) obj4, (jt0.b) this.f261163y, 27);
                nVar28.f261161w = (FlowCollector) obj2;
                nVar28.f261162x = obj3;
                return nVar28.invokeSuspend(Unit.f186387a);
            case 28:
                n nVar29 = new n((Continuation) obj4, (th9.v) this.f261163y, 28);
                nVar29.f261161w = (FlowCollector) obj2;
                nVar29.f261162x = obj3;
                return nVar29.invokeSuspend(Unit.f186387a);
            default:
                n nVar30 = new n((Continuation) obj4, (ti9.h) this.f261163y, 29);
                nVar30.f261161w = (FlowCollector) obj2;
                nVar30.f261162x = obj3;
                return nVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:496:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s9b.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f261163y = obj2;
    }
}

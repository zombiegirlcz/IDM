package ns9;

import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsPerformanceTracker$Scenario;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import jid.z;
import klf.w1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nv6.s;
import nwf.l;
import nx1.u;
import o44.m;
import ocg.r;
import ojk.l0;
import tof.i7;
import vkm.q;
import vkm.v1;
import vkm.y;
import yhm.o;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f218765w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f218766x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f218767y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f218767y = obj2;
    }

    private final Object b(Object obj2) {
        fim.a aVar;
        Priority.HIGH high;
        mhf.g gVar;
        TransactionContext transactionContext;
        boolean z;
        boolean z3;
        int i;
        com.revolut.domain.interactors.transactions.a aVar2;
        long j2;
        Flow flowB;
        Flow flow;
        Flow flowB2;
        Flow flowV;
        Continuation continuation;
        Flow flowB3;
        ojf.e eVar = (ojf.e) this.f218767y;
        com.revolut.domain.interactors.transactions.a aVar3 = eVar.f225773a;
        fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.v;
        if (i2 == 0) {
            o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f218765w;
            mhf.e eVar2 = (mhf.e) this.f218766x;
            if (eVar2 instanceof mhf.d) {
                mhf.h hVar = ((mhf.d) eVar2).f205562a;
                ojf.a aVar5 = ojf.e.Companion;
                if (d0.W(hVar.e())) {
                    continuation = null;
                    flowB3 = rd0.e.b(nz8.d.o(com.revolut.domain.interactors.transactions.a.d(aVar3, hVar.f205566a, null, Integer.valueOf(hVar.f205568c), TransactionsSort.STARTED_DATE_DESC, new TransactionContext(ojf.e.e, hVar.f205567b.f60266b), 2), TransactionsPerformanceTracker$Scenario.LIST_DOMAIN, eVar.f225774b));
                } else {
                    continuation = null;
                    flowB3 = new v1(new ojf.d(null, eVar, hVar, ojf.b.BEFORE_DATE, true, null));
                }
                flowV = new y(new w1(2, 12, continuation), flowB3);
                aVar = aVar4;
            } else {
                if (!(eVar2 instanceof mhf.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                mhf.g gVar2 = ((mhf.c) eVar2).f205561a;
                i7 i7Var = gVar2.f205563a;
                long j3 = gVar2.e;
                Priority.HIGH high2 = ojf.e.e;
                boolean zW = d0.W(gVar2.e());
                TransactionContext transactionContext2 = gVar2.f205564b;
                int i3 = gVar2.f205565c;
                if (zW) {
                    aVar = aVar4;
                    high = high2;
                    gVar = gVar2;
                    transactionContext = transactionContext2;
                    z = false;
                    z3 = false;
                    i = i3;
                    aVar2 = aVar3;
                    j2 = j3;
                    flowB = rd0.e.b(com.revolut.domain.interactors.transactions.a.d(aVar2, ojf.e.a(ojf.b.AFTER_DATE, i7Var, j3, false), null, Integer.valueOf(i), TransactionsSort.STARTED_DATE_ASC, new TransactionContext(high, transactionContext.f60266b), 2));
                } else {
                    transactionContext = transactionContext2;
                    high = high2;
                    aVar = aVar4;
                    i = i3;
                    z3 = false;
                    gVar = gVar2;
                    z = false;
                    flowB = new v1(new ojf.d(Long.valueOf(j3), eVar, gVar2, ojf.b.AFTER_DATE, false, null));
                    aVar2 = aVar3;
                    j2 = j3;
                }
                if (d0.W(gVar.e())) {
                    flow = flowB;
                    flowB2 = rd0.e.b(com.revolut.domain.interactors.transactions.a.d(aVar2, ojf.e.a(ojf.b.BEFORE_DATE, i7Var, j2, z3), null, Integer.valueOf(i), TransactionsSort.STARTED_DATE_DESC, new TransactionContext(high, transactionContext.f60266b), 2));
                } else {
                    flowB2 = new v1(new ojf.d(Long.valueOf(j2), eVar, gVar, ojf.b.BEFORE_DATE, z, null));
                    flow = flowB;
                }
                flowV = nim.a.v(u0.m(flow, flowB2), new oh3.a(20));
            }
            y yVarE = rd0.e.e(q.q(flowV), h0.f322473a, new im2.b(3, 26, null));
            this.f218765w = null;
            this.f218766x = null;
            this.v = 1;
            fim.a aVar6 = aVar;
            if (q.u(flowCollector, yVarE, this) == aVar6) {
                return aVar6;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                h hVar = new h((Continuation) obj4, (com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.a) this.f218767y, 0);
                hVar.f218765w = (FlowCollector) obj2;
                hVar.f218766x = obj3;
                return hVar.invokeSuspend(Unit.f186387a);
            case 1:
                h hVar2 = new h((Continuation) obj4, (nsh.o) this.f218767y, 1);
                hVar2.f218765w = (FlowCollector) obj2;
                hVar2.f218766x = obj3;
                return hVar2.invokeSuspend(Unit.f186387a);
            case 2:
                h hVar3 = new h((Continuation) obj4, (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b) this.f218767y, 2);
                hVar3.f218765w = (FlowCollector) obj2;
                hVar3.f218766x = obj3;
                return hVar3.invokeSuspend(Unit.f186387a);
            case 3:
                h hVar4 = new h((Continuation) obj4, (nv5.h) this.f218767y, 3);
                hVar4.f218765w = (FlowCollector) obj2;
                hVar4.f218766x = obj3;
                return hVar4.invokeSuspend(Unit.f186387a);
            case 4:
                h hVar5 = new h((Continuation) obj4, (s) this.f218767y, 4);
                hVar5.f218765w = (FlowCollector) obj2;
                hVar5.f218766x = obj3;
                return hVar5.invokeSuspend(Unit.f186387a);
            case 5:
                h hVar6 = new h((Continuation) obj4, (l) this.f218767y, 5);
                hVar6.f218765w = (FlowCollector) obj2;
                hVar6.f218766x = obj3;
                return hVar6.invokeSuspend(Unit.f186387a);
            case 6:
                h hVar7 = new h((Continuation) obj4, (u) this.f218767y, 6);
                hVar7.f218765w = (FlowCollector) obj2;
                hVar7.f218766x = obj3;
                return hVar7.invokeSuspend(Unit.f186387a);
            case 7:
                h hVar8 = new h((Continuation) obj4, (com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) this.f218767y, 7);
                hVar8.f218765w = (FlowCollector) obj2;
                hVar8.f218766x = obj3;
                return hVar8.invokeSuspend(Unit.f186387a);
            case 8:
                h hVar9 = new h((Continuation) obj4, (nyb.i) this.f218767y, 8);
                hVar9.f218765w = (FlowCollector) obj2;
                hVar9.f218766x = obj3;
                return hVar9.invokeSuspend(Unit.f186387a);
            case 9:
                h hVar10 = new h((Continuation) obj4, (o07.d) this.f218767y, 9);
                hVar10.f218765w = (FlowCollector) obj2;
                hVar10.f218766x = obj3;
                return hVar10.invokeSuspend(Unit.f186387a);
            case 10:
                h hVar11 = new h((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a) this.f218767y, 10);
                hVar11.f218765w = (FlowCollector) obj2;
                hVar11.f218766x = obj3;
                return hVar11.invokeSuspend(Unit.f186387a);
            case 11:
                h hVar12 = new h((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b) this.f218767y, 11);
                hVar12.f218765w = (FlowCollector) obj2;
                hVar12.f218766x = obj3;
                return hVar12.invokeSuspend(Unit.f186387a);
            case 12:
                h hVar13 = new h((Continuation) obj4, (o42.k) this.f218767y, 12);
                hVar13.f218765w = (FlowCollector) obj2;
                hVar13.f218766x = obj3;
                return hVar13.invokeSuspend(Unit.f186387a);
            case 13:
                h hVar14 = new h((Continuation) obj4, (m) this.f218767y, 13);
                hVar14.f218765w = (FlowCollector) obj2;
                hVar14.f218766x = obj3;
                return hVar14.invokeSuspend(Unit.f186387a);
            case 14:
                h hVar15 = new h((Continuation) obj4, (o6f.m) this.f218767y, 14);
                hVar15.f218765w = (FlowCollector) obj2;
                hVar15.f218766x = obj3;
                return hVar15.invokeSuspend(Unit.f186387a);
            case 15:
                h hVar16 = new h((Continuation) obj4, (o7b.h) this.f218767y, 15);
                hVar16.f218765w = (FlowCollector) obj2;
                hVar16.f218766x = obj3;
                return hVar16.invokeSuspend(Unit.f186387a);
            case 16:
                h hVar17 = new h((Continuation) obj4, (o8i.d) this.f218767y, 16);
                hVar17.f218765w = (FlowCollector) obj2;
                hVar17.f218766x = obj3;
                return hVar17.invokeSuspend(Unit.f186387a);
            case 17:
                h hVar18 = new h((Continuation) obj4, (o95.g) this.f218767y, 17);
                hVar18.f218765w = (FlowCollector) obj2;
                hVar18.f218766x = obj3;
                return hVar18.invokeSuspend(Unit.f186387a);
            case 18:
                h hVar19 = new h((Continuation) obj4, (oa9.h) this.f218767y, 18);
                hVar19.f218765w = (FlowCollector) obj2;
                hVar19.f218766x = obj3;
                return hVar19.invokeSuspend(Unit.f186387a);
            case 19:
                h hVar20 = new h((Continuation) obj4, (ob3.e) this.f218767y, 19);
                hVar20.f218765w = (FlowCollector) obj2;
                hVar20.f218766x = obj3;
                return hVar20.invokeSuspend(Unit.f186387a);
            case 20:
                h hVar21 = new h((Continuation) obj4, (obc.m) this.f218767y, 20);
                hVar21.f218765w = (FlowCollector) obj2;
                hVar21.f218766x = obj3;
                return hVar21.invokeSuspend(Unit.f186387a);
            case 21:
                h hVar22 = new h((Continuation) obj4, (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.b) this.f218767y, 21);
                hVar22.f218765w = (FlowCollector) obj2;
                hVar22.f218766x = obj3;
                return hVar22.invokeSuspend(Unit.f186387a);
            case 22:
                h hVar23 = new h((oc0.i) this.f218767y, (Continuation) obj4);
                hVar23.f218766x = (oc0.h) obj3;
                return hVar23.invokeSuspend(Unit.f186387a);
            case 23:
                h hVar24 = new h((Continuation) obj4, (z) this.f218767y, 23);
                hVar24.f218765w = (FlowCollector) obj2;
                hVar24.f218766x = obj3;
                return hVar24.invokeSuspend(Unit.f186387a);
            case 24:
                h hVar25 = new h((Continuation) obj4, (r) this.f218767y, 24);
                hVar25.f218765w = (FlowCollector) obj2;
                hVar25.f218766x = obj3;
                return hVar25.invokeSuspend(Unit.f186387a);
            case 25:
                h hVar26 = new h((Continuation) obj4, (oj2.i) this.f218767y, 25);
                hVar26.f218765w = (FlowCollector) obj2;
                hVar26.f218766x = obj3;
                return hVar26.invokeSuspend(Unit.f186387a);
            case 26:
                h hVar27 = new h((Continuation) obj4, (ojf.e) this.f218767y, 26);
                hVar27.f218765w = (FlowCollector) obj2;
                hVar27.f218766x = obj3;
                return hVar27.invokeSuspend(Unit.f186387a);
            case 27:
                h hVar28 = new h((Continuation) obj4, (l0) this.f218767y, 27);
                hVar28.f218765w = (FlowCollector) obj2;
                hVar28.f218766x = obj3;
                return hVar28.invokeSuspend(Unit.f186387a);
            case 28:
                h hVar29 = new h((Continuation) obj4, (okf.b) this.f218767y, 28);
                hVar29.f218765w = (FlowCollector) obj2;
                hVar29.f218766x = obj3;
                return hVar29.invokeSuspend(Unit.f186387a);
            default:
                h hVar30 = new h((Continuation) obj4, (okf.f) this.f218767y, 29);
                hVar30.f218765w = (FlowCollector) obj2;
                hVar30.f218766x = obj3;
                return hVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:308:0x08ea  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ns9.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(oc0.i iVar, Continuation continuation) {
        super(3, continuation);
        this.u = 22;
        this.f218767y = iVar;
    }
}

package tik;

import com.revolut.data.model.Data;
import com.revolut.feature.global_markets.impl.ui.screen.index_overview.IndexOverviewScreenContract$InputData;
import gim.i;
import go.g;
import jpc.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import ts1.u;
import tsk.t;
import tt4.s;
import u87.j;
import u87.k;
import u87.l;
import u87.m;
import u87.n;
import u87.q;
import vkm.q0;
import vkm.t0;
import w4l.h;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f271572w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f271573x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f271574y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f271574y = obj2;
    }

    private final Object b(Object obj2) {
        q qVar = (q) this.f271574y;
        k0h.a aVar = qVar.f278140t;
        IndexOverviewScreenContract$InputData indexOverviewScreenContract$InputData = qVar.o;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = this.f271572w;
            q0 q0Var = new q0(qVar.f278137q.k(indexOverviewScreenContract$InputData.f74611a), new k(qVar, null), 1);
            q0 q0Var2 = new q0(((ael.k) qVar.f278139s).p(indexOverviewScreenContract$InputData.f74611a, h.f294642c, n9l.b.SEC_3.a()), new l(qVar, null), 1);
            q0 q0Var3 = new q0(qVar.f278138r.e(new t0(qVar.f278142x.B(new u4e.i(29)), 1), new g(eel.i.PRICE, 2), indexOverviewScreenContract$InputData.f74611a, vgl.b.NONE), new j(qVar, null), 1);
            String strP = p.a.p("index_", indexOverviewScreenContract$InputData.f74612b, "_related_EQUITY");
            xzg.o oVar = xzg.o.STOCKS;
            uf0.b bVarI = yh5.b.i(q0Var, q0Var2, q0Var3, new q0(aVar.b3(strP, oVar), new m(qVar, null), 1), new q0(aVar.b3("index_" + indexOverviewScreenContract$InputData.f74612b + "_related_ETF", oVar), new u87.i(qVar, null), 1), new q0(qVar.f278136p.f2828l.w0(), new n(qVar, null), 1));
            this.f271572w = null;
            this.f271573x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, bVarI, this) == aVar2) {
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

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        switch (this.u) {
            case 0:
                b bVar = new b((Continuation) obj4, (c) this.f271574y, 0);
                bVar.f271572w = flowCollector;
                bVar.f271573x = obj3;
                return bVar.invokeSuspend(Unit.f186387a);
            case 1:
                b bVar2 = new b((Continuation) obj4, (e) this.f271574y, 1);
                bVar2.f271572w = flowCollector;
                bVar2.f271573x = obj3;
                return bVar2.invokeSuspend(Unit.f186387a);
            case 2:
                b bVar3 = new b((Continuation) obj4, (com.revolut.feature.junior_rewards.impl.ui.list.a) this.f271574y, 2);
                bVar3.f271572w = flowCollector;
                bVar3.f271573x = obj3;
                return bVar3.invokeSuspend(Unit.f186387a);
            case 3:
                b bVar4 = new b((Continuation) obj4, (tnb.q) this.f271574y, 3);
                bVar4.f271572w = flowCollector;
                bVar4.f271573x = obj3;
                return bVar4.invokeSuspend(Unit.f186387a);
            case 4:
                b bVar5 = new b((Continuation) obj4, (u) this.f271574y, 4);
                bVar5.f271572w = flowCollector;
                bVar5.f271573x = obj3;
                return bVar5.invokeSuspend(Unit.f186387a);
            case 5:
                b bVar6 = new b((Continuation) obj4, (ts5.n) this.f271574y, 5);
                bVar6.f271572w = flowCollector;
                bVar6.f271573x = obj3;
                return bVar6.invokeSuspend(Unit.f186387a);
            case 6:
                b bVar7 = new b((Continuation) obj4, (tse.i) this.f271574y, 6);
                bVar7.f271572w = flowCollector;
                bVar7.f271573x = obj3;
                return bVar7.invokeSuspend(Unit.f186387a);
            case 7:
                b bVar8 = new b((Continuation) obj4, (p3c.a) this.f271574y, 7);
                bVar8.f271572w = flowCollector;
                bVar8.f271573x = obj3;
                return bVar8.invokeSuspend(Unit.f186387a);
            case 8:
                b bVar9 = new b((Continuation) obj4, (t) this.f271574y, 8);
                bVar9.f271572w = flowCollector;
                bVar9.f271573x = (Object[]) obj3;
                return bVar9.invokeSuspend(Unit.f186387a);
            case 9:
                b bVar10 = new b((Continuation) obj4, (s) this.f271574y, 9);
                bVar10.f271572w = flowCollector;
                bVar10.f271573x = obj3;
                return bVar10.invokeSuspend(Unit.f186387a);
            case 10:
                b bVar11 = new b((Continuation) obj4, (tv4.o) this.f271574y, 10);
                bVar11.f271572w = flowCollector;
                bVar11.f271573x = obj3;
                return bVar11.invokeSuspend(Unit.f186387a);
            case 11:
                b bVar12 = new b(this.f271574y, (Continuation) obj4, 11);
                bVar12.f271572w = flowCollector;
                bVar12.f271573x = (Throwable) obj3;
                return bVar12.invokeSuspend(Unit.f186387a);
            case 12:
                b bVar13 = new b((Continuation) obj4, (com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a) this.f271574y, 12);
                bVar13.f271572w = flowCollector;
                bVar13.f271573x = obj3;
                return bVar13.invokeSuspend(Unit.f186387a);
            case 13:
                b bVar14 = new b((Continuation) obj4, (tz6.o) this.f271574y, 13);
                bVar14.f271572w = flowCollector;
                bVar14.f271573x = obj3;
                return bVar14.invokeSuspend(Unit.f186387a);
            case 14:
                b bVar15 = new b((tzl.l) this.f271574y, (Continuation) obj4, 14);
                bVar15.f271572w = flowCollector;
                bVar15.f271573x = (Data) obj3;
                return bVar15.invokeSuspend(Unit.f186387a);
            case 15:
                b bVar16 = new b((Continuation) obj4, (u07.l) this.f271574y, 15);
                bVar16.f271572w = flowCollector;
                bVar16.f271573x = obj3;
                return bVar16.invokeSuspend(Unit.f186387a);
            case 16:
                b bVar17 = new b((Continuation) obj4, (u1a.l) this.f271574y, 16);
                bVar17.f271572w = flowCollector;
                bVar17.f271573x = obj3;
                return bVar17.invokeSuspend(Unit.f186387a);
            case 17:
                b bVar18 = new b((Continuation) obj4, (u29.m) this.f271574y, 17);
                bVar18.f271572w = flowCollector;
                bVar18.f271573x = obj3;
                return bVar18.invokeSuspend(Unit.f186387a);
            case 18:
                b bVar19 = new b((Continuation) obj4, (u2e.j) this.f271574y, 18);
                bVar19.f271572w = flowCollector;
                bVar19.f271573x = obj3;
                return bVar19.invokeSuspend(Unit.f186387a);
            case 19:
                b bVar20 = new b((Continuation) obj4, (rul.e) this.f271574y, 19);
                bVar20.f271572w = flowCollector;
                bVar20.f271573x = obj3;
                return bVar20.invokeSuspend(Unit.f186387a);
            case 20:
                b bVar21 = new b((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a) this.f271574y, 20);
                bVar21.f271572w = flowCollector;
                bVar21.f271573x = obj3;
                return bVar21.invokeSuspend(Unit.f186387a);
            case 21:
                b bVar22 = new b((Continuation) obj4, (u3k.h) this.f271574y, 21);
                bVar22.f271572w = flowCollector;
                bVar22.f271573x = obj3;
                return bVar22.invokeSuspend(Unit.f186387a);
            case 22:
                b bVar23 = new b((Continuation) obj4, (u4i.t) this.f271574y, 22);
                bVar23.f271572w = flowCollector;
                bVar23.f271573x = obj3;
                return bVar23.invokeSuspend(Unit.f186387a);
            case 23:
                b bVar24 = new b((Continuation) obj4, (u65.i) this.f271574y, 23);
                bVar24.f271572w = flowCollector;
                bVar24.f271573x = obj3;
                return bVar24.invokeSuspend(Unit.f186387a);
            case 24:
                b bVar25 = new b((Continuation) obj4, (u6b.l) this.f271574y, 24);
                bVar25.f271572w = flowCollector;
                bVar25.f271573x = obj3;
                return bVar25.invokeSuspend(Unit.f186387a);
            case 25:
                b bVar26 = new b((Continuation) obj4, (com.revolut.retail.feature.payments.payment_links.impl.ui.details.b) this.f271574y, 25);
                bVar26.f271572w = flowCollector;
                bVar26.f271573x = obj3;
                return bVar26.invokeSuspend(Unit.f186387a);
            case 26:
                b bVar27 = new b((Continuation) obj4, (u82.m) this.f271574y, 26);
                bVar27.f271572w = flowCollector;
                bVar27.f271573x = obj3;
                return bVar27.invokeSuspend(Unit.f186387a);
            case 27:
                b bVar28 = new b((Continuation) obj4, (u85.j) this.f271574y, 27);
                bVar28.f271572w = flowCollector;
                bVar28.f271573x = obj3;
                return bVar28.invokeSuspend(Unit.f186387a);
            case 28:
                b bVar29 = new b((Continuation) obj4, (q) this.f271574y, 28);
                bVar29.f271572w = flowCollector;
                bVar29.f271573x = obj3;
                return bVar29.invokeSuspend(Unit.f186387a);
            default:
                b bVar30 = new b((Continuation) obj4, (ud6.h) this.f271574y, 29);
                bVar30.f271572w = flowCollector;
                bVar30.f271573x = obj3;
                return bVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0315  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tik.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f271574y = obj2;
    }
}

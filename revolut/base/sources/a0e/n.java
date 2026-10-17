package a0e;

import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$Step;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import nii.y0;
import nii.z;
import skm.a2;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n() {
        super(3, null);
        this.u = 7;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                n nVar = new n(3, 0, (Continuation) obj4);
                nVar.v = (b) obj2;
                return nVar.invokeSuspend(Unit.f186387a);
            case 1:
                return new n((aw.k) this.v, (Continuation) obj4, 1).invokeSuspend(Unit.f186387a);
            case 2:
                return new n((b97.l) this.v, (Continuation) obj4, 2).invokeSuspend(Unit.f186387a);
            case 3:
                n nVar2 = new n(3, 3, (Continuation) obj4);
                nVar2.v = (cli.o) obj3;
                return nVar2.invokeSuspend(Unit.f186387a);
            case 4:
                return new n((com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d) this.v, (Continuation) obj4, 4).invokeSuspend(Unit.f186387a);
            case 5:
                return new n((gui.j) this.v, (Continuation) obj4, 5).invokeSuspend(Unit.f186387a);
            case 6:
                n nVar3 = new n(3, 6, (Continuation) obj4);
                nVar3.v = (a3) obj2;
                return nVar3.invokeSuspend(Unit.f186387a);
            case 7:
                n nVar4 = new n(3, 7, (Continuation) obj4);
                nVar4.v = (jki.m) obj3;
                return nVar4.invokeSuspend(Unit.f186387a);
            case 8:
                return new n((Function0) this.v, (Continuation) obj4, 8).invokeSuspend(Unit.f186387a);
            case 9:
                ((Number) obj3).intValue();
                n nVar5 = new n(3, 9, (Continuation) obj4);
                nVar5.v = (Data) obj2;
                return nVar5.invokeSuspend(Unit.f186387a);
            case 10:
                return new n((com.revolut.core.backend_flow.impl.ui.form_screen.a) this.v, (Continuation) obj4, 10).invokeSuspend(Unit.f186387a);
            case 11:
                return new n((mfl.o) this.v, (Continuation) obj4, 11).invokeSuspend(Unit.f186387a);
            case 12:
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                new n((plc.g) this.v, (Continuation) obj4, 12).invokeSuspend(Unit.f186387a);
                throw null;
            case 13:
                return new n((com.revolut.feature.transport.impl.ui.activation.flow.a) this.v, (Continuation) obj4, 13).invokeSuspend(Unit.f186387a);
            case 14:
                return new n((uai.i) this.v, (Continuation) obj4, 14).invokeSuspend(Unit.f186387a);
            case 15:
                return new n((a2) this.v, (Continuation) obj4, 15).invokeSuspend(Unit.f186387a);
            case 16:
                return new n((com.revolut.kompot.bridge.impl.rootflow.a) this.v, (Continuation) obj4, 16).invokeSuspend(Unit.f186387a);
            case 17:
                return new n((xai.a) this.v, (Continuation) obj4, 17).invokeSuspend(Unit.f186387a);
            case 18:
                n nVar6 = new n(3, 18, (Continuation) obj4);
                nVar6.v = (Set) obj3;
                return nVar6.invokeSuspend(Unit.f186387a);
            case 19:
                n nVar7 = new n(3, 19, (Continuation) obj4);
                nVar7.v = (enk.e) obj2;
                return nVar7.invokeSuspend(Unit.f186387a);
            default:
                return new n((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f) this.v, (Continuation) obj4, 20).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        amd.b bVar = null;
        int i = 0;
        switch (this.u) {
            case 0:
                b bVar2 = (b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return bVar2;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dw.u uVar = ((dw.v) ((aw.k) this.v).k.get()).f118225a;
                uVar.f118224b.d.execute(new a0.a(uVar, 24));
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b97.l lVar = (b97.l) this.v;
                int i2 = b97.l.i;
                return lVar.d();
            case 3:
                cli.o oVar = (cli.o) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return oVar;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d) this.v;
                dVar.H2(dVar.D, new ghk.x(dVar, i));
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gui.j.b3((gui.j) this.v, false);
                return Unit.f186387a;
            case 6:
                a3 a3Var = (a3) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return a3Var;
            case 7:
                jki.m mVar = (jki.m) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return mVar;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((Function0) this.v).invoke();
                return Unit.f186387a;
            case 9:
                Data data = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return data;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.core.backend_flow.impl.ui.form_screen.a) this.v).d0(false, false);
                return Unit.f186387a;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mfl.o oVar2 = (mfl.o) this.v;
                oVar2.X1(new y0("OBSERVE_REPORT_LINK_ERROR_DIALOG_ID", (z) oVar2.f205037s.getValue(), false, 4));
                return Unit.f186387a;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                throw new NoWhenBranchMatchedException();
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.transport.impl.ui.activation.flow.a) this.v).K2();
                return Unit.f186387a;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uai.i iVar = (uai.i) this.v;
                iVar.H2(iVar.f278674s, new u8c.c(16));
                return Unit.f186387a;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((a2) this.v).f(null);
                return Unit.f186387a;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a2 a2Var = ((com.revolut.kompot.bridge.impl.rootflow.a) this.v).L;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                ((com.revolut.kompot.bridge.impl.rootflow.a) this.v).L = null;
                return Unit.f186387a;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xai.a) this.v).f303893c.decrementAndGet();
                return Unit.f186387a;
            case 18:
                Set set = (Set) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return set;
            case 19:
                enk.e eVar = (enk.e) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return eVar;
            default:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f) this.v;
                oki.h.t2(fVar, fVar.u, new TotalWealthFlowContract$Step.TotalWealth(yld.g.ASSET, bVar), false, null, false, 12);
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.v = obj2;
    }
}

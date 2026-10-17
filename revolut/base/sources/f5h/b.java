package f5h;

import akg.m;
import com.revolut.feature.apm.core.models.recipients.IrisContact;
import com.revolut.feature.apm.iris.impl.ui.area.IrisAreaScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f;
import dp4.z0;
import fb7.i0;
import fnc.d0;
import fq7.k;
import fr8.r;
import g23.k0;
import g3e.s;
import g4c.u;
import g5b.g;
import g5b.j;
import g62.l;
import gim.i;
import h12.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import rd0.e;
import tof.n;
import vkm.e0;
import vkm.q;
import vkm.y;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f132323w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f132324x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f132325y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f132325y = obj2;
    }

    private final Object b(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f132323w;
            ((Boolean) this.f132324x).getClass();
            j jVar = (j) this.f132325y;
            jhi.b bVarF = mo3.a.f(jVar.f140730m.a(), new s(26), new k(11), new s(27));
            e0 e0VarT = q.t(bVarF, 1);
            Continuation continuation = null;
            z0 z0Var = new z0(3, 16, continuation);
            g gVar = new g(jVar, continuation, 0);
            this.f132323w = null;
            this.f132324x = null;
            this.v = 1;
            q.w(flowCollector);
            Object objO = skm.e0.o(new pn2.c(e0VarT, bVarF, new m(flowCollector, gVar, 5), z0Var, (Continuation) null), this);
            if (objO != fim.a.COROUTINE_SUSPENDED) {
                objO = Unit.f186387a;
            }
            if (objO != obj3) {
                objO = Unit.f186387a;
            }
            if (objO != obj3) {
                objO = Unit.f186387a;
            }
            if (objO == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f132323w;
            zq.a aVar2 = ((l) this.f132325y).f140826p;
            y yVarE = e.e(new ax9.o(yh5.b.d(((u12.c) ((h) aVar2.f324336c)).c(IrisContact.class), h.a((h) aVar2.f324336c, n.IRIS, tof.l.IRIS, null, t52.b.a(((IrisAreaScreenContract$InputData) aVar2.f324335b).f62511a), 4)), 6), h0.f322473a, new a82.q(3, 23, null));
            this.f132323w = null;
            this.f132324x = null;
            this.v = 1;
            if (q.u(flowCollector, yVarE, this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                b bVar = new b((c) this.f132325y, (Continuation) obj4, 0);
                bVar.f132324x = (xi0.b) obj3;
                return bVar.invokeSuspend(Unit.f186387a);
            case 1:
                b bVar2 = new b((Continuation) obj4, (com.revolut.feature.junior.isa.impl.ui.child_details.a) this.f132325y, 1);
                bVar2.f132323w = (FlowCollector) obj2;
                bVar2.f132324x = obj3;
                return bVar2.invokeSuspend(Unit.f186387a);
            case 2:
                b bVar3 = new b((Continuation) obj4, (com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a) this.f132325y, 2);
                bVar3.f132323w = (FlowCollector) obj2;
                bVar3.f132324x = obj3;
                return bVar3.invokeSuspend(Unit.f186387a);
            case 3:
                b bVar4 = new b((Continuation) obj4, (i0) this.f132325y, 3);
                bVar4.f132323w = (FlowCollector) obj2;
                bVar4.f132324x = obj3;
                return bVar4.invokeSuspend(Unit.f186387a);
            case 4:
                b bVar5 = new b((Continuation) obj4, (fbg.l) this.f132325y, 4);
                bVar5.f132323w = (FlowCollector) obj2;
                bVar5.f132324x = obj3;
                return bVar5.invokeSuspend(Unit.f186387a);
            case 5:
                b bVar6 = new b((Continuation) obj4, (ffk.h) this.f132325y, 5);
                bVar6.f132323w = (FlowCollector) obj2;
                bVar6.f132324x = obj3;
                return bVar6.invokeSuspend(Unit.f186387a);
            case 6:
                b bVar7 = new b((Continuation) obj4, (f) this.f132325y, 6);
                bVar7.f132323w = (FlowCollector) obj2;
                bVar7.f132324x = obj3;
                return bVar7.invokeSuspend(Unit.f186387a);
            case 7:
                b bVar8 = new b((Continuation) obj4, (fkj.f) this.f132325y, 7);
                bVar8.f132323w = (FlowCollector) obj2;
                bVar8.f132324x = obj3;
                return bVar8.invokeSuspend(Unit.f186387a);
            case 8:
                b bVar9 = new b((Continuation) obj4, (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.a) this.f132325y, 8);
                bVar9.f132323w = (FlowCollector) obj2;
                bVar9.f132324x = obj3;
                return bVar9.invokeSuspend(Unit.f186387a);
            case 9:
                b bVar10 = new b((Continuation) obj4, (fn5.j) this.f132325y, 9);
                bVar10.f132323w = (FlowCollector) obj2;
                bVar10.f132324x = obj3;
                return bVar10.invokeSuspend(Unit.f186387a);
            case 10:
                b bVar11 = new b((Continuation) obj4, (d0) this.f132325y, 10);
                bVar11.f132323w = (FlowCollector) obj2;
                bVar11.f132324x = obj3;
                return bVar11.invokeSuspend(Unit.f186387a);
            case 11:
                b bVar12 = new b((Continuation) obj4, (com.revolut.feature.wealth_discovery.impl.collection.top_movers.a) this.f132325y, 11);
                bVar12.f132323w = (FlowCollector) obj2;
                bVar12.f132324x = obj3;
                return bVar12.invokeSuspend(Unit.f186387a);
            case 12:
                b bVar13 = new b((Continuation) obj4, (r) this.f132325y, 12);
                bVar13.f132323w = (FlowCollector) obj2;
                bVar13.f132324x = obj3;
                return bVar13.invokeSuspend(Unit.f186387a);
            case 13:
                b bVar14 = new b((Continuation) obj4, (twg.c) this.f132325y, 13);
                bVar14.f132323w = (FlowCollector) obj2;
                bVar14.f132324x = obj3;
                return bVar14.invokeSuspend(Unit.f186387a);
            case 14:
                b bVar15 = new b((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b) this.f132325y, 14);
                bVar15.f132323w = (FlowCollector) obj2;
                bVar15.f132324x = obj3;
                return bVar15.invokeSuspend(Unit.f186387a);
            case 15:
                b bVar16 = new b((Continuation) obj4, (fwf.m) this.f132325y, 15);
                bVar16.f132323w = (FlowCollector) obj2;
                bVar16.f132324x = obj3;
                return bVar16.invokeSuspend(Unit.f186387a);
            case 16:
                b bVar17 = new b((Continuation) obj4, (fx6.i) this.f132325y, 16);
                bVar17.f132323w = (FlowCollector) obj2;
                bVar17.f132324x = obj3;
                return bVar17.invokeSuspend(Unit.f186387a);
            case 17:
                b bVar18 = new b((Continuation) obj4, (fy5.m) this.f132325y, 17);
                bVar18.f132323w = (FlowCollector) obj2;
                bVar18.f132324x = obj3;
                return bVar18.invokeSuspend(Unit.f186387a);
            case 18:
                b bVar19 = new b((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c) this.f132325y, 18);
                bVar19.f132323w = (FlowCollector) obj2;
                bVar19.f132324x = obj3;
                return bVar19.invokeSuspend(Unit.f186387a);
            case 19:
                b bVar20 = new b((Continuation) obj4, (g17.h) this.f132325y, 19);
                bVar20.f132323w = (FlowCollector) obj2;
                bVar20.f132324x = obj3;
                return bVar20.invokeSuspend(Unit.f186387a);
            case 20:
                b bVar21 = new b((g18.c) this.f132325y, (Continuation) obj4, 20);
                bVar21.f132323w = (x4l.c) obj2;
                bVar21.f132324x = (String) obj3;
                return bVar21.invokeSuspend(Unit.f186387a);
            case 21:
                b bVar22 = new b((Continuation) obj4, (k0) this.f132325y, 21);
                bVar22.f132323w = (FlowCollector) obj2;
                bVar22.f132324x = obj3;
                return bVar22.invokeSuspend(Unit.f186387a);
            case 22:
                b bVar23 = new b((g2e.r) this.f132325y, (Continuation) obj4, 22);
                bVar23.f132324x = (g2e.h) obj3;
                return bVar23.invokeSuspend(Unit.f186387a);
            case 23:
                b bVar24 = new b((Continuation) obj4, (g2l.m) this.f132325y, 23);
                bVar24.f132323w = (FlowCollector) obj2;
                bVar24.f132324x = obj3;
                return bVar24.invokeSuspend(Unit.f186387a);
            case 24:
                b bVar25 = new b((Continuation) obj4, (com.revolut.feature.retail.cfd.impl.screens.positions.a) this.f132325y, 24);
                bVar25.f132323w = (FlowCollector) obj2;
                bVar25.f132324x = obj3;
                return bVar25.invokeSuspend(Unit.f186387a);
            case 25:
                b bVar26 = new b((Continuation) obj4, (u) this.f132325y, 25);
                bVar26.f132323w = (FlowCollector) obj2;
                bVar26.f132324x = obj3;
                return bVar26.invokeSuspend(Unit.f186387a);
            case 26:
                b bVar27 = new b((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a) this.f132325y, 26);
                bVar27.f132323w = (FlowCollector) obj2;
                bVar27.f132324x = obj3;
                return bVar27.invokeSuspend(Unit.f186387a);
            case 27:
                b bVar28 = new b((Continuation) obj4, (j) this.f132325y, 27);
                bVar28.f132323w = (FlowCollector) obj2;
                bVar28.f132324x = obj3;
                return bVar28.invokeSuspend(Unit.f186387a);
            case 28:
                b bVar29 = new b((Continuation) obj4, (l) this.f132325y, 28);
                bVar29.f132323w = (FlowCollector) obj2;
                bVar29.f132324x = obj3;
                return bVar29.invokeSuspend(Unit.f186387a);
            default:
                b bVar30 = new b((Continuation) obj4, (com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) this.f132325y, 29);
                bVar30.f132323w = (FlowCollector) obj2;
                bVar30.f132324x = obj3;
                return bVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:478:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5h.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f132325y = obj2;
    }
}

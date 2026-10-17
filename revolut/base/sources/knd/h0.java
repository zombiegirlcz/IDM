package knd;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.ConveyancingAppointmentSchedulingFlowContract$Step;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.messaging.data.api.model.GroupChatItem;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$Button;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kye.k3;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f186084w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f186085x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f186086y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b bVar, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 21;
        this.f186084w = bVar;
        this.f186085x = str;
        this.f186086y = (gim.i) function1;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v7, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h0 h0Var = new h0((j0) this.f186085x, (amd.i) this.f186086y, continuation, 0);
                h0Var.f186084w = obj2;
                return h0Var;
            case 1:
                h0 h0Var2 = new h0((h1) this.f186086y, continuation, 1);
                h0Var2.f186084w = obj2;
                return h0Var2;
            case 2:
                return new h0((h1) this.f186084w, (ukm.j0) this.f186085x, (AnalyticsSpendingPeriod$Interval) this.f186086y, continuation, 2);
            case 3:
                return new h0((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a) this.f186084w, (String) this.f186085x, (PlansDashboardLayout$Button) this.f186086y, continuation, 3);
            case 4:
                h0 h0Var3 = new h0((Function1) this.f186085x, (Function0) this.f186086y, continuation);
                h0Var3.f186084w = obj2;
                return h0Var3;
            case 5:
                return new h0((ks9.l) this.f186084w, (PaymentGroup) this.f186085x, (String) this.f186086y, continuation, 5);
            case 6:
                return new h0((ks9.l) this.f186084w, (PaymentGroup) this.f186085x, (qs9.a) this.f186086y, continuation, 6);
            case 7:
                return new h0((ks9.v) this.f186084w, (GroupChatItem) this.f186085x, (PaymentGroup) this.f186086y, continuation, 7);
            case 8:
                return new h0((ks9.b0) this.f186084w, (PaymentGroup) this.f186085x, (ArrayList) this.f186086y, continuation, 8);
            case 9:
                return new h0((ks9.b0) this.f186084w, (PaymentGroup) this.f186085x, (List) this.f186086y, continuation, 9);
            case 10:
                return new h0((ks9.f0) this.f186084w, (PaymentGroup) this.f186085x, (st9.b) this.f186086y, continuation, 10);
            case 11:
                return new h0((ku1.e0) this.f186084w, (c02.j) this.f186085x, (String) this.f186086y, continuation, 11);
            case 12:
                return new h0((ku1.e0) this.f186084w, (String) this.f186085x, (AccountId) this.f186086y, continuation, 12);
            case 13:
                h0 h0Var4 = new h0((ku2.h) this.f186086y, continuation, 13);
                h0Var4.f186084w = obj2;
                return h0Var4;
            case 14:
                return new h0((AtomicReference) this.f186084w, (Function1) this.f186085x, (Function1) this.f186086y, continuation, 14);
            case 15:
                return new h0((k3) this.f186084w, (String) this.f186085x, (String) this.f186086y, continuation, 15);
            case 16:
                return new h0((l0c.u) this.f186084w, (String) this.f186085x, (Terms) this.f186086y, continuation, 16);
            case 17:
                return new h0((l16.e) this.f186084w, (String) this.f186085x, (String) this.f186086y, continuation, 17);
            case 18:
                return new h0((m1b.c) this.f186084w, (l1b.g) this.f186085x, (String) this.f186086y, continuation, 18);
            case 19:
                return new h0((l34.b) this.f186084w, (ft3.h1) this.f186085x, (String) this.f186086y, continuation, 19);
            case 20:
                return new h0((l40.q) this.f186084w, (UUID) this.f186085x, (l40.r) this.f186086y, continuation, 20);
            case 21:
                return new h0((com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b) this.f186084w, (String) this.f186085x, (Function1) this.f186086y, continuation);
            case 22:
                h0 h0Var5 = new h0((l5d.j) this.f186086y, continuation, 22);
                h0Var5.f186084w = obj2;
                return h0Var5;
            case 23:
                h0 h0Var6 = new h0((l5d.j) this.f186085x, (e5d.b) this.f186086y, continuation, 23);
                h0Var6.f186084w = obj2;
                return h0Var6;
            case 24:
                h0 h0Var7 = new h0((l72.d) this.f186086y, continuation, 24);
                h0Var7.f186084w = obj2;
                return h0Var7;
            case 25:
                return new h0((com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.c) this.f186084w, (ConveyancingAppointmentSchedulingFlowContract$Step) this.f186085x, (o74.l) this.f186086y, continuation, 25);
            case 26:
                h0 h0Var8 = new h0((l97.n) this.f186085x, (Ref$ObjectRef) this.f186086y, continuation, 26);
                h0Var8.f186084w = obj2;
                return h0Var8;
            case 27:
                h0 h0Var9 = new h0((l97.n) this.f186085x, (l97.l0) this.f186086y, continuation, 27);
                h0Var9.f186084w = obj2;
                return h0Var9;
            case 28:
                return new h0((l97.i0) this.f186084w, (efm.r) this.f186085x, (ukm.q) this.f186086y, continuation, 28);
            default:
                return new h0((com.revolut.core.backend_flow.impl.internal_flow.b) this.f186085x, (ya0.b) this.f186086y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((h0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:516:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:517:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:557:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v19, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v33, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:442:0x0943 -> B:444:0x0947). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: knd.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f186084w = obj2;
        this.f186085x = obj3;
        this.f186086y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f186085x = obj2;
        this.f186086y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f186086y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(Function1 function1, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        this.f186085x = (gim.i) function1;
        this.f186086y = function0;
    }
}

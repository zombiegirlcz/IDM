package jb1;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.feature.acquiring.card_reader.order.api.model.PaymentMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f172565w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f172566x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x f172567y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, x xVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f172567y = xVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                r rVar = new r(0, this.f172567y, continuation);
                rVar.f172565w = flowCollector;
                rVar.f172566x = obj3;
                return rVar.invokeSuspend(Unit.f186387a);
            default:
                r rVar2 = new r(1, this.f172567y, continuation);
                rVar2.f172565w = flowCollector;
                rVar2.f172566x = obj3;
                return rVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f172565w;
                    vkm.d dVarB = rd0.e.b(nim.a.w(osg.b.e(((mfc.c) this.f172567y.f172573q).d, false, io3.l.MERCHANT, io3.k.ACTIVE, null, null, null, null, SyslogConstants.LOG_CLOCK), new md0.c(17)));
                    this.f172565w = null;
                    this.f172566x = null;
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
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f172565w;
                    x xVar = this.f172567y;
                    xa1.a aVar3 = xVar.f172573q;
                    PaymentMethod paymentMethod = ((g) xVar.t2()).d;
                    vkm.d dVarB2 = rd0.e.b(xa1.a.a(aVar3, new com.revolut.feature.acquiring.card_reader.order.api.model.a(paymentMethod != null ? paymentMethod.getCurrency() : null, xVar.f172572p.f60601a), 2));
                    this.f172565w = null;
                    this.f172566x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}

package nnj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.y;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f217706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f217707x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c f217708y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c cVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f217708y = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                s sVar = new s(0, this.f217708y, continuation);
                sVar.f217706w = flowCollector;
                sVar.f217707x = obj3;
                return sVar.invokeSuspend(Unit.f186387a);
            case 1:
                s sVar2 = new s(1, this.f217708y, continuation);
                sVar2.f217706w = flowCollector;
                sVar2.f217707x = obj3;
                return sVar2.invokeSuspend(Unit.f186387a);
            default:
                s sVar3 = new s(2, this.f217708y, continuation);
                sVar3.f217706w = flowCollector;
                sVar3.f217707x = obj3;
                return sVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f217706w;
                    y yVarB = this.f217708y.f101471s.b((w4l.k) this.f217707x);
                    this.f217706w = null;
                    this.f217707x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, yVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f217706w;
                    t38.e eVarB = this.f217708y.f101470r.b((w4l.k) this.f217707x);
                    this.f217706w = null;
                    this.f217707x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, eVarB, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f217706w;
                    vkm.d dVarA = this.f217708y.u.a(w4l.h.f294642c);
                    this.f217706w = null;
                    this.f217707x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarA, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}

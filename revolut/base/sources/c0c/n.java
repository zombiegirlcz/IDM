package c0c;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import m1c.o0;
import vkm.y;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f20216w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f20217x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f20218y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, s sVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f20218y = sVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                n nVar = new n(0, this.f20218y, continuation);
                nVar.f20216w = flowCollector;
                nVar.f20217x = obj3;
                return nVar.invokeSuspend(Unit.f186387a);
            case 1:
                n nVar2 = new n(1, this.f20218y, continuation);
                nVar2.f20216w = flowCollector;
                nVar2.f20217x = obj3;
                return nVar2.invokeSuspend(Unit.f186387a);
            case 2:
                n nVar3 = new n(2, this.f20218y, continuation);
                nVar3.f20216w = flowCollector;
                nVar3.f20217x = obj3;
                return nVar3.invokeSuspend(Unit.f186387a);
            case 3:
                n nVar4 = new n(3, this.f20218y, continuation);
                nVar4.f20216w = flowCollector;
                nVar4.f20217x = obj3;
                return nVar4.invokeSuspend(Unit.f186387a);
            default:
                n nVar5 = new n(4, this.f20218y, continuation);
                nVar5.f20216w = flowCollector;
                nVar5.f20217x = obj3;
                return nVar5.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f20216w;
                    y yVarJ = this.f20218y.v.j(new md6.q(md6.p.REV_POINTS, true));
                    this.f20216w = null;
                    this.f20217x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, yVarJ, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f20216w;
                    a aVar3 = this.f20218y.f20226r;
                    Flow flowH = xam.a.h(new btd.e(aVar3, null, 22), rd0.e.b(aVar3.f20203a.b(o0.ACTIVATION)));
                    this.f20216w = null;
                    this.f20217x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowH, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f20216w;
                    Flow flowA = this.f20218y.f20230x.a(f19.h.REWARDS_FOR_YOU_CAROUSEL, w4l.i.f294643c);
                    this.f20216w = null;
                    this.f20217x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowA, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f20216w;
                    vkm.d dVarB = rd0.e.b(this.f20218y.f20225q.c(true));
                    this.f20216w = null;
                    this.f20217x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, dVarB, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f20216w;
                    nyb.k kVar = this.f20218y.f20225q;
                    kVar.getClass();
                    w4l.i loadingStrategy = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    jxb.l lVar = (jxb.l) kVar.f220804a;
                    lVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB2 = rd0.e.b(lVar.f179129j.e(Unit.f186387a, loadingStrategy));
                    this.f20216w = null;
                    this.f20217x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, dVarB2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}

package hkk;

import com.revolut.feature.insurance.api.models.InsuranceDocumentsAvailability;
import ip0.v7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f152952w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f152953x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p f152954y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, p pVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f152954y = pVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                m mVar = new m(0, this.f152954y, continuation);
                mVar.f152952w = flowCollector;
                mVar.f152953x = obj3;
                return mVar.invokeSuspend(Unit.f186387a);
            case 1:
                m mVar2 = new m(1, this.f152954y, continuation);
                mVar2.f152952w = flowCollector;
                mVar2.f152953x = obj3;
                return mVar2.invokeSuspend(Unit.f186387a);
            default:
                m mVar3 = new m(2, this.f152954y, continuation);
                mVar3.f152952w = flowCollector;
                mVar3.f152953x = obj3;
                return mVar3.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f152952w;
                    wik.e eVar = (wik.e) this.f152954y.o;
                    eVar.getClass();
                    w4l.h loadingStrategy = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    Flow flowE = boh.f.e(rd0.e.b(mo3.a.n(eVar.f297912b.v(loadingStrategy))), new wdb.b(eVar, 25));
                    this.f152952w = null;
                    this.f152953x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowE, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f152952w;
                    p pVar = this.f152954y;
                    wkm.l lVarQ = vkm.q.Q(v7.w(pVar.v.B(o.f152956a)), new m(2, pVar, null));
                    this.f152952w = null;
                    this.f152953x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, lVarQ, this) == aVar2) {
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
                    FlowCollector flowCollector3 = this.f152952w;
                    vkm.d dVarB = rd0.e.b(yoj.b.s(si7.a.d(this.f152954y.f152957p, (String) this.f152953x), InsuranceDocumentsAvailability.Unavailable.f74931a));
                    this.f152952w = null;
                    this.f152953x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB, this) == aVar3) {
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

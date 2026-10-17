package ukk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f280782w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f280783x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p f280784y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, Continuation continuation, p pVar) {
        super(3, continuation);
        this.u = i;
        this.f280784y = pVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                m mVar = new m(0, continuation, this.f280784y);
                mVar.f280782w = flowCollector;
                mVar.f280783x = obj3;
                return mVar.invokeSuspend(Unit.f186387a);
            default:
                m mVar2 = new m(1, continuation, this.f280784y);
                mVar2.f280782w = flowCollector;
                mVar2.f280783x = obj3;
                return mVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f280782w;
                    vkm.d dVarB = rd0.e.b(this.f280784y.f280787q.q());
                    this.f280782w = null;
                    this.f280783x = null;
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
                    FlowCollector flowCollector2 = this.f280782w;
                    vkm.d dVarB2 = rd0.e.b(bgc.e.c(this.f280784y.f280786p, null, 3));
                    this.f280782w = null;
                    this.f280783x = null;
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

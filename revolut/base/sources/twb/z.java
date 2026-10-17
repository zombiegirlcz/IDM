package twb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class z extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f275006w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f275007x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a f275008y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Continuation continuation, com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a aVar, String str, int i) {
        super(3, continuation);
        this.u = i;
        this.f275008y = aVar;
        this.z = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                z zVar = new z(continuation, this.f275008y, this.z, 0);
                zVar.f275006w = flowCollector;
                zVar.f275007x = obj3;
                return zVar.invokeSuspend(Unit.f186387a);
            default:
                z zVar2 = new z(continuation, this.f275008y, this.z, 1);
                zVar2.f275006w = flowCollector;
                zVar2.f275007x = obj3;
                return zVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f275006w;
                    vkm.d dVarD = this.f275008y.f83719r.d(this.z, w4l.i.f294643c);
                    this.f275006w = null;
                    this.f275007x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, dVarD, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f275006w;
                    vkm.d dVarB = this.f275008y.f83719r.b(this.z);
                    this.f275006w = null;
                    this.f275007x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB, this) == aVar2) {
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

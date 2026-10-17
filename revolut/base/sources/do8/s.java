package do8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f116464w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f116465x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d f116466y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f116466y = dVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                s sVar = new s(0, this.f116466y, continuation);
                sVar.f116464w = flowCollector;
                sVar.f116465x = obj3;
                return sVar.invokeSuspend(Unit.f186387a);
            default:
                s sVar2 = new s(1, this.f116466y, continuation);
                sVar2.f116464w = flowCollector;
                sVar2.f116465x = obj3;
                return sVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f116464w;
                    w4l.k kVar = (w4l.k) this.f116465x;
                    com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar = this.f116466y;
                    akg.n nVarD = dVar.v.d(dVar.o.f77277a, kVar);
                    this.f116464w = null;
                    this.f116465x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, nVarD, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f116464w;
                    com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar2 = this.f116466y;
                    vkm.d dVarU = dVar2.f77288q.u(dVar2.o.f77277a, w4l.i.f294643c);
                    this.f116464w = null;
                    this.f116465x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarU, this) == aVar2) {
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

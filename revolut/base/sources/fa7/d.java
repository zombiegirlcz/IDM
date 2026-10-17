package fa7;

import com.google.crypto.tink.shaded.protobuf.t1;
import e1.f;
import gim.i;
import gs2.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.n0;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.h;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f133242w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ vkm.d f133243x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(vkm.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f133243x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f133243x, continuation, 0);
                dVar.f133242w = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f133243x, continuation, 1);
                dVar2.f133242w = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f133243x, continuation, 2);
                dVar3.f133242w = obj2;
                return dVar3;
            default:
                d dVar4 = new d(this.f133243x, continuation, 3);
                dVar4.f133242w = obj2;
                return dVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f133242w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    c cVar = new c(new Ref$BooleanRef(), flowCollector, 0);
                    this.f133242w = null;
                    this.v = 1;
                    if (this.f133243x.collect(cVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                FlowCollector flowCollector2 = (FlowCollector) this.f133242w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    ref$BooleanRef.f186407a = true;
                    h hVarS = q.s(t1.e(this.f133243x, new f(ref$BooleanRef, 1)), new t(8), q.f290100b);
                    this.f133242w = null;
                    this.v = 1;
                    if (q.u(flowCollector2, hVarS, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                FlowCollector flowCollector3 = (FlowCollector) this.f133242w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    u97.e eVar = new u97.e(new n0(), flowCollector3);
                    this.f133242w = null;
                    this.v = 1;
                    if (this.f133243x.collect(eVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector4 = (FlowCollector) this.f133242w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                    ref$BooleanRef2.f186407a = true;
                    h hVarS2 = q.s(t1.e(this.f133243x, new f(ref$BooleanRef2, 5)), new xub.e(16), q.f290100b);
                    this.f133242w = null;
                    this.v = 1;
                    if (q.u(flowCollector4, hVarS2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}

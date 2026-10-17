package wkm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f298312w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f298313x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f298314y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, FlowCollector flowCollector, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.f298313x = lVar;
        this.f298314y = flowCollector;
        this.f298312w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f298313x, this.f298314y, this.f298312w, continuation);
            default:
                i iVar = new i(this.f298313x, this.f298314y, continuation);
                iVar.f298312w = obj2;
                return iVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ?? r87 = this.f298313x.e;
                    Object obj3 = this.f298312w;
                    this.v = 1;
                    if (r87.invoke(this.f298314y, obj3, this) == aVar) {
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
                    CoroutineScope coroutineScope = (CoroutineScope) this.f298312w;
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    l lVar = this.f298313x;
                    Flow flow = lVar.d;
                    k kVar = new k(ref$ObjectRef, coroutineScope, lVar, this.f298314y);
                    this.v = 1;
                    if (flow.collect(kVar, this) == aVar2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.f298313x = lVar;
        this.f298314y = flowCollector;
    }
}

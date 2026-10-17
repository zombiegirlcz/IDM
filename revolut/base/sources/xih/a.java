package xih;

import com.revolut.data.model.Data;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f306396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object[] f306397x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f306398y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Continuation continuation, c cVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f306398y = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Object[] objArr = (Object[]) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                a aVar = new a(continuation, this.f306398y, 0);
                aVar.f306396w = flowCollector;
                aVar.f306397x = objArr;
                return aVar.invokeSuspend(Unit.f186387a);
            default:
                a aVar2 = new a(continuation, this.f306398y, 1);
                aVar2.f306396w = flowCollector;
                aVar2.f306397x = objArr;
                return aVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f306396w;
                    Data dataG3 = c.g3(this.f306398y, kotlin.collections.d.v0((Data[]) this.f306397x));
                    this.f306396w = null;
                    this.f306397x = null;
                    this.v = 1;
                    if (flowCollector.emit(dataG3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f306396w;
                    Data dataG32 = c.g3(this.f306398y, kotlin.collections.d.v0((Data[]) this.f306397x));
                    this.f306396w = null;
                    this.f306397x = null;
                    this.v = 1;
                    if (flowCollector2.emit(dataG32, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}

package wdb;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Data f296528w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f296529x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w wVar, Continuation continuation) {
        super(3, continuation);
        this.f296529x = wVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        p pVar = new p(this.f296529x, (Continuation) obj4);
        pVar.v = (FlowCollector) obj2;
        pVar.f296528w = (Data) obj3;
        return pVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        Data data = this.f296528w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            this.v = null;
            this.f296528w = data;
            this.u = 1;
            if (flowCollector.emit(data, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Boolean.valueOf(!w.a(this.f296529x, data));
    }
}

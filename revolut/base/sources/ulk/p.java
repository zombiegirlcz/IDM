package ulk;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ud3.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f281046w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f281046w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f281046w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            case 1:
                p pVar2 = new p(this.f281046w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
            default:
                p pVar3 = new p(this.f281046w, continuation, 2);
                pVar3.v = obj2;
                return pVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        q qVar = this.f281046w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.H2(qVar.f281048q, new a0(data, 22));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.H2(qVar.f281048q, new a0(data2, 23));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.H2(qVar.f281048q, new a0(data3, 24));
                break;
        }
        return Unit.f186387a;
    }
}

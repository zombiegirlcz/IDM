package dnc;

import com.revolut.data.model.Data;
import dcf.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f116271w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, r rVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f116271w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(0, this.f116271w, continuation);
                qVar.v = obj2;
                return qVar;
            case 1:
                q qVar2 = new q(1, this.f116271w, continuation);
                qVar2.v = obj2;
                return qVar2;
            case 2:
                q qVar3 = new q(2, this.f116271w, continuation);
                qVar3.v = obj2;
                return qVar3;
            case 3:
                q qVar4 = new q(3, this.f116271w, continuation);
                qVar4.v = obj2;
                return qVar4;
            default:
                q qVar5 = new q(4, this.f116271w, continuation);
                qVar5.v = obj2;
                return qVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        r rVar = this.f116271w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rVar.x2(new g0(data, 24));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rVar.x2(new g0(data2, 25));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rVar.x2(new g0(data3, 26));
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rVar.x2(new g0(data4, 27));
                break;
            default:
                Data data5 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rVar.x2(new g0(data5, 28));
                break;
        }
        return Unit.f186387a;
    }
}

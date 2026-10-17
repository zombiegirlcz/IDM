package i4b;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g0 f158399w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(g0 g0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f158399w = g0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z zVar = new z(this.f158399w, continuation, 0);
                zVar.v = obj2;
                return zVar;
            case 1:
                z zVar2 = new z(this.f158399w, continuation, 1);
                zVar2.v = obj2;
                return zVar2;
            case 2:
                z zVar3 = new z(this.f158399w, continuation, 2);
                zVar3.v = obj2;
                return zVar3;
            case 3:
                z zVar4 = new z(this.f158399w, continuation, 3);
                zVar4.v = obj2;
                return zVar4;
            case 4:
                z zVar5 = new z(this.f158399w, continuation, 4);
                zVar5.v = obj2;
                return zVar5;
            default:
                z zVar6 = new z(this.f158399w, continuation, 5);
                zVar6.v = obj2;
                return zVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((z) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        g0 g0Var = this.f158399w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0Var.x2(new hzb.e0(data, 16));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0Var.x2(new hzb.e0(data2, 17));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0Var.x2(new hzb.e0(data3, 18));
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0Var.x2(new hzb.e0(data4, 19));
                break;
            case 4:
                Data data5 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0Var.x2(new hzb.e0(data5, 20));
                break;
            default:
                Data data6 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0Var.x2(new hzb.e0(data6, 21));
                break;
        }
        return Unit.f186387a;
    }
}

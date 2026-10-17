package m9d;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes7.dex */
public final class v0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Data f203744w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g1 f203745x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(g1 g1Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f203745x = g1Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Data data = (Data) obj2;
        Data data2 = (Data) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                v0 v0Var = new v0(this.f203745x, continuation, 0);
                v0Var.v = data;
                v0Var.f203744w = data2;
                return v0Var.invokeSuspend(Unit.f186387a);
            case 1:
                v0 v0Var2 = new v0(this.f203745x, continuation, 1);
                v0Var2.v = data;
                v0Var2.f203744w = data2;
                return v0Var2.invokeSuspend(Unit.f186387a);
            default:
                v0 v0Var3 = new v0(this.f203745x, continuation, 2);
                v0Var3.v = data;
                v0Var3.f203744w = data2;
                return v0Var3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        g1 g1Var = this.f203745x;
        switch (i) {
            case 0:
                Data data = this.v;
                Data data2 = this.f203744w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g1Var.x2(new a83.p0(data, data2, 28));
                break;
            case 1:
                Data data3 = this.v;
                Data data4 = this.f203744w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g1Var.x2(new zkk.r(data3, data4, 1));
                break;
            default:
                Data data5 = this.v;
                Data data6 = this.f203744w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g1Var.x2(new w0(data5, data6, 0));
                break;
        }
        return Unit.f186387a;
    }
}

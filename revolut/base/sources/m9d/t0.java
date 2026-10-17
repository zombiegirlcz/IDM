package m9d;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class t0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g1 f203740w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(g1 g1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f203740w = g1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t0 t0Var = new t0(this.f203740w, continuation, 0);
                t0Var.v = obj2;
                return t0Var;
            case 1:
                t0 t0Var2 = new t0(this.f203740w, continuation, 1);
                t0Var2.v = obj2;
                return t0Var2;
            case 2:
                t0 t0Var3 = new t0(this.f203740w, continuation, 2);
                t0Var3.v = obj2;
                return t0Var3;
            case 3:
                t0 t0Var4 = new t0(this.f203740w, continuation, 3);
                t0Var4.v = obj2;
                return t0Var4;
            case 4:
                t0 t0Var5 = new t0(this.f203740w, continuation, 4);
                t0Var5.v = obj2;
                return t0Var5;
            case 5:
                t0 t0Var6 = new t0(this.f203740w, continuation, 5);
                t0Var6.v = obj2;
                return t0Var6;
            case 6:
                t0 t0Var7 = new t0(this.f203740w, continuation, 6);
                t0Var7.v = obj2;
                return t0Var7;
            default:
                t0 t0Var8 = new t0(this.f203740w, continuation, 7);
                t0Var8.v = obj2;
                return t0Var8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t0) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        g1 g1Var = this.f203740w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g1Var.x2(new m58.l(data, 11));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g1Var.x2(new m58.l(data2, 12));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g1Var.x2(new m58.l(data3, 13));
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g1Var.x2(new m58.l(data4, 14));
                break;
            case 4:
                Data data5 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g1Var.x2(new m58.l(data5, 15));
                break;
            case 5:
                Data data6 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g1Var.x2(new m58.l(data6, 16));
                break;
            case 6:
                Data data7 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g1Var.x2(new m58.l(data7, 17));
                break;
            default:
                Data data8 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g1Var.x2(new m58.l(data8, 18));
                break;
        }
        return Unit.f186387a;
    }
}

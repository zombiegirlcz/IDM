package uv1;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d0 f283261w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(d0 d0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f283261w = d0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(this.f283261w, continuation, 0);
                b0Var.v = obj2;
                return b0Var;
            case 1:
                b0 b0Var2 = new b0(this.f283261w, continuation, 1);
                b0Var2.v = obj2;
                return b0Var2;
            case 2:
                b0 b0Var3 = new b0(this.f283261w, continuation, 2);
                b0Var3.v = obj2;
                return b0Var3;
            case 3:
                b0 b0Var4 = new b0(this.f283261w, continuation, 3);
                b0Var4.v = obj2;
                return b0Var4;
            case 4:
                b0 b0Var5 = new b0(this.f283261w, continuation, 4);
                b0Var5.v = obj2;
                return b0Var5;
            default:
                b0 b0Var6 = new b0(this.f283261w, continuation, 5);
                b0Var6.v = obj2;
                return b0Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        d0 d0Var = this.f283261w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.B, new unc.y(data, 16));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.B, new unc.y(data2, 17));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.B, new unc.y(data3, 18));
                break;
            case 3:
                Pair pair = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.B, new a82.n(((Boolean) pair.f186385a).booleanValue(), ((Boolean) pair.f186386b).booleanValue(), 9));
                break;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.B, new unc.y(data4, 19));
                break;
            default:
                Data data5 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.B, new unc.y(data5, 20));
                break;
        }
        return Unit.f186387a;
    }
}

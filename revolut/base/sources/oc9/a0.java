package oc9;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f224132w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b0 b0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f224132w = b0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(this.f224132w, continuation, 0);
                a0Var.v = obj2;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0(this.f224132w, continuation, 1);
                a0Var2.v = obj2;
                return a0Var2;
            case 2:
                a0 a0Var3 = new a0(this.f224132w, continuation, 2);
                a0Var3.v = obj2;
                return a0Var3;
            default:
                a0 a0Var4 = new a0(this.f224132w, continuation, 3);
                a0Var4.v = obj2;
                return a0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a0) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        b0 b0Var = this.f224132w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.f224137t, new o9a.y(data, 14));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.f224137t, new o9a.y(data2, 15));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.f224137t, new o9a.y(data3, 16));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.f224137t, new o9a.y(data4, 17));
                break;
        }
        return Unit.f186387a;
    }
}

package mhd;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j0 f205499w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(j0 j0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f205499w = j0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g0 g0Var = new g0(this.f205499w, continuation, 0);
                g0Var.v = obj2;
                return g0Var;
            case 1:
                g0 g0Var2 = new g0(this.f205499w, continuation, 1);
                g0Var2.v = obj2;
                return g0Var2;
            case 2:
                g0 g0Var3 = new g0(this.f205499w, continuation, 2);
                g0Var3.v = obj2;
                return g0Var3;
            default:
                g0 g0Var4 = new g0(this.f205499w, continuation, 3);
                g0Var4.v = obj2;
                return g0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        j0 j0Var = this.f205499w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j0Var.x2(new me7.h(data, 4));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j0Var.x2(new me7.h(data2, 5));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j0Var.x2(new me7.h(data3, 6));
                break;
            default:
                List list = (List) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j0Var.x2(new lsl.d(list, 7));
                break;
        }
        return Unit.f186387a;
    }
}

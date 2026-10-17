package bbk;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d0 f14316w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i, d0 d0Var, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f14316w = d0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(0, this.f14316w, continuation);
                a0Var.v = obj2;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0(1, this.f14316w, continuation);
                a0Var2.v = obj2;
                return a0Var2;
            default:
                a0 a0Var3 = new a0(2, this.f14316w, continuation);
                a0Var3.v = obj2;
                return a0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a0) create((tak.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        d0 d0Var = this.f14316w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.f14323t, new b58.f(d0Var, data, 25));
                break;
            case 1:
                tak.b bVar = (tak.b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.f14323t, new b9i.f(bVar, 9));
                break;
            default:
                List list = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.f14323t, new a26.j(list, 26));
                break;
        }
        return Unit.f186387a;
    }
}

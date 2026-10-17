package iuj;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f168653w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, a0 a0Var, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f168653w = a0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                y yVar = new y(0, this.f168653w, continuation);
                yVar.v = obj2;
                return yVar;
            case 1:
                y yVar2 = new y(1, this.f168653w, continuation);
                yVar2.v = obj2;
                return yVar2;
            default:
                y yVar3 = new y(2, this.f168653w, continuation);
                yVar3.v = obj2;
                return yVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((y) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        a0 a0Var = this.f168653w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a0Var.H2(a0Var.f168628t, new ilk.i(data, 29));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a0Var.H2(a0Var.f168628t, new z(data2, 0));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a0Var.H2(a0Var.f168628t, new z(data3, 1));
                break;
        }
        return Unit.f186387a;
    }
}

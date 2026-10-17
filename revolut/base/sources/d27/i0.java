package d27;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a f110750w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f110750w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i0 i0Var = new i0(this.f110750w, continuation, 0);
                i0Var.v = obj2;
                return i0Var;
            case 1:
                i0 i0Var2 = new i0(this.f110750w, continuation, 1);
                i0Var2.v = obj2;
                return i0Var2;
            default:
                i0 i0Var3 = new i0(this.f110750w, continuation, 2);
                i0Var3.v = obj2;
                return i0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar = this.f110750w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.E, new a6j.a((lr6.f0) pair.f186385a, ((Boolean) pair.f186386b).booleanValue(), 13));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.E, new czc.b0(data, 2));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.E, new czc.b0(data2, 3));
                break;
        }
        return Unit.f186387a;
    }
}

package mlk;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f207002w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(h0 h0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f207002w = h0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d0 d0Var = new d0(this.f207002w, continuation, 0);
                d0Var.v = obj2;
                return d0Var;
            case 1:
                d0 d0Var2 = new d0(this.f207002w, continuation, 1);
                d0Var2.v = obj2;
                return d0Var2;
            case 2:
                d0 d0Var3 = new d0(this.f207002w, continuation, 2);
                d0Var3.v = obj2;
                return d0Var3;
            default:
                d0 d0Var4 = new d0(this.f207002w, continuation, 3);
                d0Var4.v = obj2;
                return d0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d0) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        h0 h0Var = this.f207002w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.E, new me7.h(data, 16));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.E, new me7.h(data2, 18));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.E, new me7.h(data3, 19));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0Var.H2(h0Var.E, new me7.h(data4, 20));
                break;
        }
        return Unit.f186387a;
    }
}

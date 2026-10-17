package e2f;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b f122064w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i, com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f122064w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f0 f0Var = new f0(0, this.f122064w, continuation);
                f0Var.v = obj2;
                return f0Var;
            case 1:
                f0 f0Var2 = new f0(1, this.f122064w, continuation);
                f0Var2.v = obj2;
                return f0Var2;
            default:
                f0 f0Var3 = new f0(2, this.f122064w, continuation);
                f0Var3.v = obj2;
                return f0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b bVar = this.f122064w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Pair pair2 = (Pair) pair.f186385a;
                Data data = (Data) pair.f186386b;
                bVar.H2(bVar.A, new afg.h(5, (Data) pair2.f186385a, (Data) pair2.f186386b, data));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.A, new do8.t(data2, 21));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.A, new do8.t(data3, 22));
                break;
        }
        return Unit.f186387a;
    }
}

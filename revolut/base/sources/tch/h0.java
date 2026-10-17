package tch;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a f269829w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f269829w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h0 h0Var = new h0(this.f269829w, continuation, 0);
                h0Var.v = obj2;
                return h0Var;
            case 1:
                h0 h0Var2 = new h0(this.f269829w, continuation, 1);
                h0Var2.v = obj2;
                return h0Var2;
            case 2:
                h0 h0Var3 = new h0(this.f269829w, continuation, 2);
                h0Var3.v = obj2;
                return h0Var3;
            default:
                h0 h0Var4 = new h0(this.f269829w, continuation, 3);
                h0Var4.v = obj2;
                return h0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((h0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a aVar = this.f269829w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95644w, new tb6.x(data, 2));
                break;
            case 1:
                List list = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95644w, new s78.n(list, 11));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95644w, new tb6.x(data2, 3));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95644w, new tb6.x(data3, 4));
                break;
        }
        return Unit.f186387a;
    }
}

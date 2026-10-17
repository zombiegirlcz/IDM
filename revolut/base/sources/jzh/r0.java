package jzh;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class r0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.order_summary.a f179851w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i, com.revolut.feature_crypto_order_flow.impl.order_summary.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f179851w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r0 r0Var = new r0(0, this.f179851w, continuation);
                r0Var.v = obj2;
                return r0Var;
            case 1:
                r0 r0Var2 = new r0(1, this.f179851w, continuation);
                r0Var2.v = obj2;
                return r0Var2;
            case 2:
                r0 r0Var3 = new r0(2, this.f179851w, continuation);
                r0Var3.v = obj2;
                return r0Var3;
            default:
                r0 r0Var4 = new r0(3, this.f179851w, continuation);
                r0Var4.v = obj2;
                return r0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((r0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature_crypto_order_flow.impl.order_summary.a aVar = this.f179851w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.E, new i2l.e0(list, 27));
                break;
            case 1:
                List list2 = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.E, new i2l.e0(list2, 28));
                break;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.E, new jxi.e0(data, 8));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.E, new jxi.e0(data2, 9));
                break;
        }
        return Unit.f186387a;
    }
}

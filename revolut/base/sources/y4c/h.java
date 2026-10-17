package y4c;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import xl9.m;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolut_x_balances.impl.fiat.a f310869w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.feature.revolut_x_balances.impl.fiat.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f310869w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f310869w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(this.f310869w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            default:
                h hVar3 = new h(this.f310869w, continuation, 2);
                hVar3.v = obj2;
                return hVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.revolut_x_balances.impl.fiat.a aVar = this.f310869w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.u, new m(data, 28));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.u, new m(data2, 29));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.u, new i(data3, 0));
                break;
        }
        return Unit.f186387a;
    }
}

package boh;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth_discovery.impl.collection.most_traded.a f17483w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.wealth_discovery.impl.collection.most_traded.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f17483w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f17483w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            case 1:
                u uVar2 = new u(this.f17483w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
            default:
                u uVar3 = new u(this.f17483w, continuation, 2);
                uVar3.v = obj2;
                return uVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.wealth_discovery.impl.collection.most_traded.a aVar = this.f17483w;
        switch (i) {
            case 0:
                r rVar = (r) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new bnj.n(rVar.f17479a, rVar.f17480b, 5));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new bmj.g(data, 1));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new bmj.g(data2, 2));
                break;
        }
        return Unit.f186387a;
    }
}

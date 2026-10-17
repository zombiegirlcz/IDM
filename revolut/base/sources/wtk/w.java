package wtk;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.a f300031w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f300031w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w wVar = new w(this.f300031w, continuation, 0);
                wVar.v = obj2;
                return wVar;
            case 1:
                w wVar2 = new w(this.f300031w, continuation, 1);
                wVar2.v = obj2;
                return wVar2;
            case 2:
                w wVar3 = new w(this.f300031w, continuation, 2);
                wVar3.v = obj2;
                return wVar3;
            default:
                w wVar4 = new w(this.f300031w, continuation, 3);
                wVar4.v = obj2;
                return wVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((w) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.a aVar = this.f300031w;
        switch (i) {
            case 0:
                fuk.h hVar = (fuk.h) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f103865t, new wpj.b(hVar, 14));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f103865t, new wgd.k(data, 26));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f103865t, new wgd.k(data2, 27));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f103865t, new wgd.k(data3, 28));
                break;
        }
        return Unit.f186387a;
    }
}

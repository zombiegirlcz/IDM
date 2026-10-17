package cgh;

import b8f.z;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights.a f23983w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f23983w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(this.f23983w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            case 1:
                q qVar2 = new q(this.f23983w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
            default:
                q qVar3 = new q(this.f23983w, continuation, 2);
                qVar3.v = obj2;
                return qVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights.a aVar = this.f23983w;
        switch (i) {
            case 0:
                d1h.g gVar = (d1h.g) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95805t, new z(gVar, 3));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95805t, new cbf.i(data, 18));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95805t, new cbf.i(data2, 19));
                break;
        }
        return Unit.f186387a;
    }
}

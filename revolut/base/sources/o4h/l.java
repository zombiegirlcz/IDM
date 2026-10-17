package o4h;

import avk.u;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.a f222284w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f222284w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f222284w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(this.f222284w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
            default:
                l lVar3 = new l(this.f222284w, continuation, 2);
                lVar3.v = obj2;
                return lVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.a aVar = this.f222284w;
        switch (i) {
            case 0:
                n2h.f fVar = (n2h.f) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.f95423s, new u(fVar, 3));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.f95423s, new nsl.g(data, 21));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.f95423s, new nsl.g(data2, 22));
                break;
        }
        return Unit.f186387a;
    }
}

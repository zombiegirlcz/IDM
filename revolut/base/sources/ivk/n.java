package ivk;

import com.revolut.data.model.Data;
import iuj.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.a f168879w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f168879w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(this.f168879w, continuation, 0);
                nVar.v = obj2;
                return nVar;
            case 1:
                n nVar2 = new n(this.f168879w, continuation, 1);
                nVar2.v = obj2;
                return nVar2;
            case 2:
                n nVar3 = new n(this.f168879w, continuation, 2);
                nVar3.v = obj2;
                return nVar3;
            default:
                n nVar4 = new n(this.f168879w, continuation, 3);
                nVar4.v = obj2;
                return nVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.a aVar = this.f168879w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f103959x, new z(data, 5));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f103959x, new z(data2, 6));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f103959x, new z(data3, 7));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f103959x, new z(data4, 8));
                break;
        }
        return Unit.f186387a;
    }
}

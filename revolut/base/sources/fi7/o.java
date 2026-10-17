package fi7;

import com.revolut.data.model.Data;
import fg8.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.instruments.trend.collections.impl.ui.collection.a f135337w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, com.revolut.feature.instruments.trend.collections.impl.ui.collection.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f135337w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(0, this.f135337w, continuation);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(1, this.f135337w, continuation);
                oVar2.v = obj2;
                return oVar2;
            case 2:
                o oVar3 = new o(2, this.f135337w, continuation);
                oVar3.v = obj2;
                return oVar3;
            default:
                o oVar4 = new o(3, this.f135337w, continuation);
                oVar4.v = obj2;
                return oVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.instruments.trend.collections.impl.ui.collection.a aVar = this.f135337w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f74919y, new y(aVar, data, 9));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f74919y, new f9a.i(data2, 11));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f74919y, new f9a.i(data3, 12));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f74919y, new f9a.i(data4, 13));
                break;
        }
        return Unit.f186387a;
    }
}

package eac;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.management.impl.ui.management.home.a f124184w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, com.revolut.feature.revolutpay.management.impl.ui.management.home.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f124184w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w wVar = new w(0, this.f124184w, continuation);
                wVar.v = obj2;
                return wVar;
            case 1:
                w wVar2 = new w(1, this.f124184w, continuation);
                wVar2.v = obj2;
                return wVar2;
            case 2:
                w wVar3 = new w(2, this.f124184w, continuation);
                wVar3.v = obj2;
                return wVar3;
            case 3:
                w wVar4 = new w(3, this.f124184w, continuation);
                wVar4.v = obj2;
                return wVar4;
            default:
                w wVar5 = new w(4, this.f124184w, continuation);
                wVar5.v = obj2;
                return wVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((w) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.revolutpay.management.impl.ui.management.home.a aVar = this.f124184w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.A, new e50.t(data, 16));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.A, new e50.t(data2, 17));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.A, new e50.t(data3, 18));
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.A, new e50.t(data4, 19));
                break;
            default:
                Data data5 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.A, new e50.t(data5, 20));
                break;
        }
        return Unit.f186387a;
    }
}

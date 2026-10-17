package beb;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a f14758w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xdb.y f14759x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a aVar, xdb.y yVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f14758w = aVar;
        this.f14759x = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w wVar = new w(this.f14758w, this.f14759x, continuation, 0);
                wVar.v = obj2;
                return wVar;
            default:
                w wVar2 = new w(this.f14758w, this.f14759x, continuation, 1);
                wVar2.v = obj2;
                return wVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                ((w) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.TRUE;
            default:
                return ((w) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        xdb.y yVar = this.f14759x;
        com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a aVar = this.f14758w;
        switch (i) {
            case 0:
                Throwable th10 = (Throwable) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f82839s, new s(yVar, th10, 1));
                return Boolean.TRUE;
            default:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f82839s, new u(data, yVar, 1));
                return Unit.f186387a;
        }
    }
}

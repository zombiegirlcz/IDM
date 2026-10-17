package oul;

import com.revolut.data.model.Data;
import com.revolut.trading.orders.ui.invest.placement.models.TargetPriceInputValue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.target_price.b f229925w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(com.revolut.trading.orders.ui.invest.placement.target_price.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f229925w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x(this.f229925w, continuation, 0);
                xVar.v = obj2;
                return xVar;
            case 1:
                x xVar2 = new x(this.f229925w, continuation, 1);
                xVar2.v = obj2;
                return xVar2;
            case 2:
                x xVar3 = new x(this.f229925w, continuation, 2);
                xVar3.v = obj2;
                return xVar3;
            case 3:
                x xVar4 = new x(this.f229925w, continuation, 3);
                xVar4.v = obj2;
                return xVar4;
            case 4:
                x xVar5 = new x(this.f229925w, continuation, 4);
                xVar5.v = obj2;
                return xVar5;
            case 5:
                x xVar6 = new x(this.f229925w, continuation, 5);
                xVar6.v = obj2;
                return xVar6;
            default:
                x xVar7 = new x(this.f229925w, continuation, 6);
                xVar7.v = obj2;
                return xVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        final com.revolut.trading.orders.ui.invest.placement.target_price.b bVar = this.f229925w;
        switch (i) {
            case 0:
                nel.n nVar = (nel.n) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!nVar.b()) {
                }
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.getState(), new oph.k(data, 17));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.getState(), new oph.k(data2, 18));
                break;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.getState(), new oph.k(data3, 19));
                break;
            case 4:
                ?? r06 = bVar.z;
                Pair pair = (Pair) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                final TargetPriceInputValue targetPriceInputValue = (TargetPriceInputValue) pair.f186385a;
                final nel.n nVar2 = (nel.n) pair.f186386b;
                if (!nVar2.b()) {
                    final int i2 = 1;
                } else {
                    final int i3 = 0;
                }
                break;
            case 5:
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.getState(), new oph.k(data4, 20));
                break;
            default:
                Data data5 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.getState(), new oph.k(data5, 21));
                break;
        }
        return Unit.f186387a;
    }
}

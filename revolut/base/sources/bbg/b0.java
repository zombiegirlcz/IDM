package bbg;

import a83.p0;
import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a f14272w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i, com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f14272w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(0, this.f14272w, continuation);
                b0Var.v = obj2;
                return b0Var;
            case 1:
                b0 b0Var2 = new b0(1, this.f14272w, continuation);
                b0Var2.v = obj2;
                return b0Var2;
            case 2:
                b0 b0Var3 = new b0(2, this.f14272w, continuation);
                b0Var3.v = obj2;
                return b0Var3;
            case 3:
                b0 b0Var4 = new b0(3, this.f14272w, continuation);
                b0Var4.v = obj2;
                return b0Var4;
            case 4:
                b0 b0Var5 = new b0(4, this.f14272w, continuation);
                b0Var5.v = obj2;
                return b0Var5;
            case 5:
                b0 b0Var6 = new b0(5, this.f14272w, continuation);
                b0Var6.v = obj2;
                return b0Var6;
            default:
                b0 b0Var7 = new b0(6, this.f14272w, continuation);
                b0Var7.v = obj2;
                return b0Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar = this.f14272w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.D, new p0((Data) pair.f186385a, (Data) pair.f186386b, 6));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.D, new b4b.d0(data, 22));
                aVar.f93832x.a("stays-booking-amendment-confirmation");
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.D, new b4b.d0(data2, 23));
                aVar.f93832x.a("stays-booking-amendment-confirmation");
                break;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.D, new b4b.d0(data3, 24));
                break;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.D, new b4b.d0(data4, 25));
                break;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.D, new b4b.d0(data5, 26));
                break;
            default:
                Data data6 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.D, new b4b.d0(data6, 27));
                break;
        }
        return Unit.f186387a;
    }
}

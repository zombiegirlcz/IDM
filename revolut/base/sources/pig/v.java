package pig;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.g1;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.screen.transfer.a f236500w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f236500w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v(0, this.f236500w, continuation);
                vVar.v = obj2;
                return vVar;
            case 1:
                v vVar2 = new v(1, this.f236500w, continuation);
                vVar2.v = obj2;
                return vVar2;
            case 2:
                v vVar3 = new v(2, this.f236500w, continuation);
                vVar3.v = obj2;
                return vVar3;
            case 3:
                v vVar4 = new v(3, this.f236500w, continuation);
                vVar4.v = obj2;
                return vVar4;
            default:
                v vVar5 = new v(4, this.f236500w, continuation);
                vVar5.v = obj2;
                return vVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        int i3 = 1;
        com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar = this.f236500w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.z, new u(data, i2));
                break;
            case 1:
                g1 g1Var = (g1) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.z, new m2f.a0(g1Var, 1));
                break;
            case 2:
                xi0.b currency = (xi0.b) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.z, new ou5.a(5, currency));
                vfg.d dVar = aVar.f94389r;
                String accountId = aVar.o.f94383a;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                Intrinsics.checkNotNullParameter(currency, "currency");
                lfg.e eVar = dVar.f288613a;
                String currency2 = currency.f306286a;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                Intrinsics.checkNotNullParameter(currency2, "currency");
                break;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.z, new u(data2, i3));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.z, new u(data3, 2));
                break;
        }
        return Unit.f186387a;
    }
}

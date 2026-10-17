package pmk;

import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import m9d.w0;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f237629w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(v vVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f237629w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f237629w, continuation, 0);
                sVar.v = obj2;
                return sVar;
            case 1:
                s sVar2 = new s(this.f237629w, continuation, 1);
                sVar2.v = obj2;
                return sVar2;
            case 2:
                s sVar3 = new s(this.f237629w, continuation, 2);
                sVar3.v = obj2;
                return sVar3;
            case 3:
                s sVar4 = new s(this.f237629w, continuation, 3);
                sVar4.v = obj2;
                return sVar4;
            case 4:
                s sVar5 = new s(this.f237629w, continuation, 4);
                sVar5.v = obj2;
                return sVar5;
            case 5:
                s sVar6 = new s(this.f237629w, continuation, 5);
                sVar6.v = obj2;
                return sVar6;
            default:
                s sVar7 = new s(this.f237629w, continuation, 6);
                sVar7.v = obj2;
                return sVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        v vVar = this.f237629w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vVar.x2(new pig.u(data, 21));
                break;
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vVar.x2(new w0((Data) pair.f186386b, (Data) pair.f186385a, 8));
                break;
            case 2:
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vVar.x2(new pig.u(data2, 22));
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vVar.x2(new pig.u(data3, 23));
                break;
            case 5:
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vVar.x2(new pig.u(data4, 24));
                break;
            default:
                Data data5 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vVar.x2(new pig.u(data5, 25));
                break;
        }
        return Unit.f186387a;
    }
}

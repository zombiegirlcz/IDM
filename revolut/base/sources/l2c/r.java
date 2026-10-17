package l2c;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ku1.y;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a f191757w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f191757w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(0, this.f191757w, continuation);
                rVar.v = obj2;
                return rVar;
            case 1:
                r rVar2 = new r(1, this.f191757w, continuation);
                rVar2.v = obj2;
                return rVar2;
            case 2:
                r rVar3 = new r(2, this.f191757w, continuation);
                rVar3.v = obj2;
                return rVar3;
            default:
                r rVar4 = new r(3, this.f191757w, continuation);
                rVar4.v = obj2;
                return rVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a aVar = this.f191757w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f84180y, new y(data, 20));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f84180y, new kzc.a(data2, aVar, 7));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f84180y, new y(data3, 21));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f84180y, new y(data4, 22));
                break;
        }
        return Unit.f186387a;
    }
}

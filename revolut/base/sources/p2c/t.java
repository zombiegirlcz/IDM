package p2c;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ox5.m0;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a f232223w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f232223w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(0, this.f232223w, continuation);
                tVar.v = obj2;
                return tVar;
            case 1:
                t tVar2 = new t(1, this.f232223w, continuation);
                tVar2.v = obj2;
                return tVar2;
            default:
                t tVar3 = new t(2, this.f232223w, continuation);
                tVar3.v = obj2;
                return tVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a aVar = this.f232223w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new m0(data, 8));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new os9.t(data2, aVar, 22));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new m0(data3, 9));
                break;
        }
        return Unit.f186387a;
    }
}

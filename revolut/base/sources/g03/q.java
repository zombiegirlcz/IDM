package g03;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b f139273w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f139273w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(this.f139273w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            case 1:
                q qVar2 = new q(this.f139273w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
            default:
                q qVar3 = new q(this.f139273w, continuation, 2);
                qVar3.v = obj2;
                return qVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar = this.f139273w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.B, new fv6.r(data, 14));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.B, new fv6.r(data2, 15));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.B, new fv6.r(data3, 16));
                break;
        }
        return Unit.f186387a;
    }
}

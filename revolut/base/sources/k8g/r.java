package k8g;

import com.revolut.data.model.Data;
import jxi.e0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a f182151w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f182151w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(0, this.f182151w, continuation);
                rVar.v = obj2;
                return rVar;
            default:
                r rVar2 = new r(1, this.f182151w, continuation);
                rVar2.v = obj2;
                return rVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a aVar = this.f182151w;
        switch (i) {
            case 0:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f93611w, new afg.h(8, (Data) rVar.f314201a, (Data) rVar.f314202b, (Data) rVar.f314203c));
                break;
            default:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f93611w, new e0(data, 26));
                break;
        }
        return Unit.f186387a;
    }
}

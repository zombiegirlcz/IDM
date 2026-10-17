package aig;

import af4.t;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.screen.home.e f5267w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, com.revolut.feature.travel.miles.impl.ui.screen.home.e eVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f5267w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(0, this.f5267w, continuation);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(1, this.f5267w, continuation);
                lVar2.v = obj2;
                return lVar2;
            default:
                l lVar3 = new l(2, this.f5267w, continuation);
                lVar3.v = obj2;
                return lVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.travel.miles.impl.ui.screen.home.e eVar = this.f5267w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.z, new t(data, 17));
                break;
            case 1:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data2 = (Data) rVar.f314201a;
                Data data3 = (Data) rVar.f314202b;
                eVar.H2(eVar.z, new afg.h(1, data2, (Data) rVar.f314203c, data3));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.z, new t(data4, 18));
                break;
        }
        return Unit.f186387a;
    }
}

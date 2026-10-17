package g3e;

import a83.d0;
import com.revolut.data.model.Data;
import com.revolut.feature.store.api.model.StoreExclusivesFiltersResponse;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f140283w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f140283w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(this.f140283w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            case 1:
                q qVar2 = new q(this.f140283w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
            case 2:
                q qVar3 = new q(this.f140283w, continuation, 2);
                qVar3.v = obj2;
                return qVar3;
            default:
                q qVar4 = new q(this.f140283w, continuation, 3);
                qVar4.v = obj2;
                return qVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((lk0.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        r rVar = this.f140283w;
        switch (i) {
            case 0:
                lk0.g gVar = (lk0.g) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rVar.H2(rVar.f140288t, new a3e.s(gVar, 3));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rVar.H2(rVar.f140288t, new fv6.r(data, 25));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                StoreExclusivesFiltersResponse storeExclusivesFiltersResponse = (StoreExclusivesFiltersResponse) data2.getContent();
                if (storeExclusivesFiltersResponse != null) {
                    rVar.H2(rVar.f140288t, new g1.b(storeExclusivesFiltersResponse, 22));
                }
                break;
            default:
                Set set = (Set) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rVar.H2(rVar.f140288t, new d0(23, set));
                break;
        }
        return Unit.f186387a;
    }
}

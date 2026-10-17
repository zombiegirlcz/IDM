package khe;

import com.revolut.data.model.Data;
import java.util.List;
import ka2.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a f184105w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f184105w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(this.f184105w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            case 1:
                q qVar2 = new q(this.f184105w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
            default:
                q qVar3 = new q(this.f184105w, continuation, 2);
                qVar3.v = obj2;
                return qVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a aVar = this.f184105w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new k37.t(list, 7));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new b0(data, 8));
                iii.c.f(data, new kh4.b(8), new kd8.f(19), new kcg.j(aVar, 2));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new b0(data2, 9));
                break;
        }
        return Unit.f186387a;
    }
}

package rq7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.data.model.Policy;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f256499w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f256499w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f256499w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            case 1:
                r rVar2 = new r(this.f256499w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
            default:
                r rVar3 = new r(this.f256499w, continuation, 2);
                rVar3.v = obj2;
                return rVar3;
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
        Data data;
        Policy policy;
        Object next;
        int i = this.u;
        s sVar = this.f256499w;
        switch (i) {
            case 0:
                Data data2 = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        Iterator it8 = ((List) content).iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((Policy) next).f75286a, sVar.f256500p.f75672a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        policy = (Policy) next;
                    } else {
                        policy = null;
                    }
                    data = new Data(policy, data2.getError(), data2.getLoading());
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                sVar.x2(new rj9.i(data, 14));
                break;
            case 1:
                Data data3 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.x2(new rj9.i(data3, 15));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.x2(new rj9.i(data4, 16));
                break;
        }
        return Unit.f186387a;
    }
}

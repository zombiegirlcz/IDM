package lq7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.data.model.Policy;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f199201w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f199201w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f199201w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            case 1:
                k kVar2 = new k(this.f199201w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
            default:
                k kVar3 = new k(this.f199201w, continuation, 2);
                kVar3.v = obj2;
                return kVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        Policy policy;
        Object next;
        int i = this.u;
        l lVar = this.f199201w;
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
                                if (Intrinsics.f(((Policy) next).f75286a, lVar.f199202p.f75660a)) {
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
                lVar.x2(new lnk.m(data, 1));
                break;
            case 1:
                Data data3 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                lVar.x2(new lnk.m(data3, 2));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                lVar.x2(new lnk.m(data4, 3));
                break;
        }
        return Unit.f186387a;
    }
}

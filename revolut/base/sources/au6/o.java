package au6;

import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrder$Id;
import com.revolut.feature.freelancer.impl.network.services.AcquiringOrdersService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f9586w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v f9587x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(v vVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f9587x = vVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        AcquiringOrder$Id acquiringOrder$Id = (AcquiringOrder$Id) obj3;
        switch (this.u) {
            case 0:
                String str = acquiringOrder$Id.f73342a;
                o oVar = new o(this.f9587x, (Continuation) obj4, 0);
                oVar.f9586w = str;
                return oVar.invokeSuspend(Unit.f186387a);
            default:
                String str2 = acquiringOrder$Id.f73342a;
                o oVar2 = new o(this.f9587x, (Continuation) obj4, 1);
                oVar2.f9586w = str2;
                return oVar2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                String str = this.f9586w;
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    AcquiringOrdersService acquiringOrdersService = this.f9587x.f9634a;
                    this.f9586w = null;
                    this.v = 1;
                    obj2 = acquiringOrdersService.getLineItems(str, this);
                    if (obj2 != arrayList) {
                    }
                    return arrayList;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                Iterable iterable = (Iterable) obj2;
                arrayList = new ArrayList(zhm.w.t(iterable, 10));
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    arrayList.add(bu6.a.d((jt6.i) it8.next()));
                }
                return arrayList;
            default:
                String str2 = this.f9586w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    AcquiringOrdersService acquiringOrdersService2 = this.f9587x.f9634a;
                    this.f9586w = str2;
                    this.v = 1;
                    obj2 = acquiringOrdersService2.getOrderPayments(str2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return bu6.a.e((jt6.k) obj2, str2);
        }
    }
}

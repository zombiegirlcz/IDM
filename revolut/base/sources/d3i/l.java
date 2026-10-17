package d3i;

import com.revolut.data.model.Data;
import com.revolut.feature_exchange.api.models.ExchangePocket;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f111178w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f111179x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f111178w = mVar;
        this.f111179x = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f111178w, this.f111179x, continuation, 0);
                lVar.v = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f111178w, this.f111179x, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n nVar = this.f111179x;
        m mVar = this.f111178w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(list);
                List list2 = list;
                int iB = q0.b(zhm.w.t(list2, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : list2) {
                    linkedHashMap.put(((ExchangePocket) obj3).f96822a, obj3);
                }
                mVar.f(new k(nVar, linkedHashMap, 0));
                break;
            default:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                OrderQuote orderQuote = (OrderQuote) data.getContent();
                if (orderQuote != null) {
                    mVar.f(new k(nVar, orderQuote, 1));
                }
                break;
        }
        return Unit.f186387a;
    }
}

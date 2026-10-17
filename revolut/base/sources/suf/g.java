package suf;

import com.revolut.feature.transport.impl.data.TransportService;
import com.revolut.feature.transport.models.transit.TransitTicketRevPointOption;
import cvf.r;
import cvf.s;
import cvf.u;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f265751w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f265752x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, List list, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f265751w = hVar;
        this.f265752x = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f265751w, this.f265752x, continuation, 0);
            default:
                return new g(this.f265751w, this.f265752x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    TransportService transportService = this.f265751w.f265753a;
                    r rVar = new r(this.f265752x);
                    this.v = 1;
                    obj2 = transportService.getPaymentQuotes(rVar, this);
                    if (obj2 != arrayList) {
                    }
                    return arrayList;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                List<s> paymentQuotes = ((u) obj2).getPaymentQuotes();
                arrayList = new ArrayList(w.t(paymentQuotes, 10));
                for (s sVar : paymentQuotes) {
                    Intrinsics.checkNotNullParameter(sVar, "<this>");
                    arrayList.add(new TransitTicketRevPointOption(mo3.a.o(sVar.getFiatAmount()), sVar.getPointsAmount(), sVar.getToken()));
                }
                return arrayList;
            default:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                h hVar = this.f265751w;
                if (i2 == 0) {
                    o.b(obj2);
                    TransportService transportService2 = hVar.f265753a;
                    this.v = 1;
                    obj2 = transportService2.getPurchasedTransitTicketsByIds(this.f265752x, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return h.a(hVar, (List) obj2);
        }
    }
}

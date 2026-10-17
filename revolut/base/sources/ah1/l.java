package ah1;

import a83.p0;
import af4.t;
import com.revolut.data.model.Data;
import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import com.revolut.feature.card_add_to_googlepay.api.models.RetailCardWrapper;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b f4865w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f4865w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f4865w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f4865w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b bVar = this.f4865w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data = (Data) pair.f186385a;
                Data data2 = (Data) pair.f186386b;
                SharedRevolutCardWrapper sharedRevolutCardWrapper = (SharedRevolutCardWrapper) data.getContent();
                if (sharedRevolutCardWrapper != null) {
                    bVar.l2(new n(bVar, ((RetailCardWrapper) sharedRevolutCardWrapper).f64443a, null), new yi5.b(26));
                }
                bVar.H2(bVar.f60901t, new p0(data, data2, 1));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f60901t, new t(data3, 10));
                break;
        }
        return Unit.f186387a;
    }
}

package gh1;

import com.revolut.data.model.Data;
import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import com.revolut.feature.card_add_to_googlepay.api.models.RetailCardWrapper;
import com.revolut.shared.cards.model.SharedRevolutCard;
import g4c.t;
import ga9.v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f143817w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f143817w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f143817w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f143817w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SharedRevolutCardWrapper sharedRevolutCardWrapper;
        int i = this.u;
        i iVar = this.f143817w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (data != null && (sharedRevolutCardWrapper = (SharedRevolutCardWrapper) data.getContent()) != null) {
                    SharedRevolutCard sharedRevolutCard = ((RetailCardWrapper) sharedRevolutCardWrapper).f64443a;
                    d dVar = i.Companion;
                    iVar.l2(new v(iVar, sharedRevolutCard, (Continuation) null, 20), new yi5.b(26));
                }
                iVar.H2(iVar.f143823s, new t(data, 26));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                iVar.H2(iVar.f143823s, new t(data2, 27));
                break;
        }
        return Unit.f186387a;
    }
}

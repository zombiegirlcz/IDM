package u7k;

import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.payments.payment_links.impl.ui.details.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferLinkDetails.Active f277944w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.revolut.retail.feature.payments.payment_links.impl.ui.details.b bVar, TransferLinkDetails.Active active, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f277944w = active;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a0(this.v, this.f277944w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        TransferLinkDetails.Active active = this.f277944w;
        com.revolut.retail.feature.payments.payment_links.impl.ui.details.b bVar = this.v;
        z zVar = new z(bVar, active, null);
        this.u = 1;
        Object objB0 = u0.b0(bVar.X(), "ID_ACTION_ACCEPT", zVar, this);
        return objB0 == aVar ? aVar : objB0;
    }
}

package y7k;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.transfer.models.quotes.TransferAvailabilityReason;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ CenteredAmountDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a f311563w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(CenteredAmountDelegate.Model model, com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = model;
        this.f311563w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p0(this.v, this.f311563w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar = this.f311563w;
        s5k.a aVar2 = aVar.f102215y;
        fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Object obj3 = this.v.f51981p;
            if (obj3 instanceof yof.b) {
                yqi.b bVar = ((yof.b) obj3).f315673b;
                if (bVar instanceof i1l.l) {
                    ((s5k.d) aVar2).e3(((i1l.l) bVar).f157654a);
                } else if (bVar instanceof i1l.f) {
                    ((s5k.d) aVar2).Z2();
                } else if (bVar instanceof i1l.i) {
                    TransferAvailabilityReason transferAvailabilityReason = ((i1l.i) bVar).f157652a;
                    if (transferAvailabilityReason != null) {
                        ((s5k.d) aVar2).c3(transferAvailabilityReason);
                    }
                } else {
                    n5k.b bVar2 = aVar.f102214x;
                    n60.a aVar4 = aVar.A;
                    this.u = 1;
                    if (((n5k.p) bVar2).k3(aVar4, this) == aVar3) {
                        return aVar3;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}

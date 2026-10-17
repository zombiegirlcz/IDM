package e0a;

import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cu9.m f121514w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, cu9.m mVar, Continuation continuation) {
        super(1, continuation);
        this.v = qVar;
        this.f121514w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p(this.v, this.f121514w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h7k.j jVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        cu9.m mVar = this.f121514w;
        q qVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            efm.d0 d0VarF = ((k61.i) qVar.f121517n).f(mVar.f108929b);
            this.u = 1;
            obj2 = nim.a.b(d0VarF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        TransferLinkDetails transferLinkDetails = (TransferLinkDetails) obj2;
        if (!(transferLinkDetails instanceof TransferLinkDetails.Active)) {
            if (transferLinkDetails instanceof TransferLinkDetails.NonActive) {
                throw new IllegalStateException("No actions supported for non active Transfer Links");
            }
            throw new NoWhenBranchMatchedException();
        }
        h7k.a aVar2 = qVar.f121516m;
        TransferLinkDetails.Active active = (TransferLinkDetails.Active) transferLinkDetails;
        int i2 = o.f121513a[mVar.f108930c.ordinal()];
        if (i2 == 1) {
            jVar = h7k.j.ACCEPT;
        } else if (i2 == 2) {
            jVar = h7k.j.DECLINE;
        } else if (i2 == 3) {
            jVar = h7k.j.CANCEL;
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                qVar.A2(u0.b(qVar.o.a(transferLinkDetails)));
                return Unit.f186387a;
            }
            jVar = h7k.j.REMIND;
        }
        ((h7k.i) aVar2).Z2(active, jVar);
        return Unit.f186387a;
    }
}

package ks9;

import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cu9.b f189364w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, cu9.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = sVar;
        this.f189364w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p(this.v, this.f189364w, continuation);
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
        s sVar = this.v;
        cu9.b bVar = this.f189364w;
        if (i == 0) {
            yhm.o.b(obj2);
            efm.d0 d0VarF = ((k61.i) sVar.f189381t).f(((cu9.m) bVar).f108929b);
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
        TransferLinkDetails.Active active = obj2 instanceof TransferLinkDetails.Active ? (TransferLinkDetails.Active) obj2 : null;
        if (active == null) {
            return Unit.f186387a;
        }
        h7k.a aVar2 = sVar.u;
        cu9.m mVar = (cu9.m) bVar;
        int i2 = o.f189362a[mVar.f108930c.ordinal()];
        if (i2 == 1) {
            jVar = h7k.j.CANCEL;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException(mVar.f108930c + " is not supported in Group Chats");
            }
            jVar = h7k.j.REMIND;
        }
        ((h7k.i) aVar2).Z2(active, jVar);
        return Unit.f186387a;
    }
}

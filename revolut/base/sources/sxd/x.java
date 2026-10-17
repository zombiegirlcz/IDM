package sxd;

import com.revolut.domain.models.topup.AutoTopUpState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import sxd.h;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ z v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, Continuation continuation) {
        super(1, continuation);
        this.v = zVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new x(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((x) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        z zVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            pfm.a aVarC = zVar.f266453p.c(new AutoTopUpState(false, null, null, null, null, null, zVar.o.f88205c));
            this.u = 1;
            if (nim.a.a(aVarC, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        zVar.C2(h.b.f266430a);
        return Unit.f186387a;
    }
}

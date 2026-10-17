package lae;

import com.revolut.feature.subaccount.api.models.SubaccountType;
import h93.f0;
import ha3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6e.z;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Continuation continuation) {
        super(1, continuation);
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        n nVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            f0 f0Var = (f0) ((g) ((j2) nVar.f193380t.f22677a).getValue()).f193367a.getContent();
            pfm.a aVarE = ((x) nVar.f193377q).J(nVar.o.f89208a).e(((z) nVar.f193378r).y((f0Var == null || !f0Var.P()) ? SubaccountType.Personal.f88963a : SubaccountType.Joint.f88961a));
            Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
            this.u = 1;
            if (nim.a.a(aVarE, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        nVar.C2(h.f193369a);
        return Unit.f186387a;
    }
}

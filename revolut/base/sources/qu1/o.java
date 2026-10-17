package qu1;

import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.models.alias.AliasType;
import hu1.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class o extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ p v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Continuation continuation) {
        super(2, continuation);
        this.v = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        tji.l lVarG;
        p pVar = this.v;
        v02.c cVar = pVar.f249187r;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        if (i == 0) {
            yhm.o.b(obj2);
            n nVar = new n(pVar, continuation, 1);
            this.u = 1;
            obj2 = pVar.p2(this, nVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        c02.d dVar = (c02.d) obj2;
        int i2 = m.f249183a[dVar.f20101a.ordinal()];
        if (i2 == 1) {
            pVar.H2(pVar.f249189t, new b0(dVar, 1));
            lVarG = ((j12.d) cVar).g(AliasType.PHONE.f61895b);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.f(dVar.f20103c, "KEY_PHONE_ALREADY_IN_USE")) {
                lVarG = ((j12.d) cVar).f(ApmBlik.f61809c.e());
            } else {
                lVarG = ((j12.d) cVar).b();
            }
        }
        return yji.l.a1(pVar, pVar.X1(lVarG), null, null, new qqj.g(dVar, pVar, continuation, 1), 3);
    }
}

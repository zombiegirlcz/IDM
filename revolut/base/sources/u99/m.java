package u99;

import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ Function0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c f278427w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Function0 function0, com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = function0;
        this.f278427w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, this.f278427w, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (n1Var instanceof l1) {
            this.v.invoke();
        } else {
            if (!(n1Var instanceof k1) && !(n1Var instanceof j1) && !(n1Var instanceof m1)) {
                throw new NoWhenBranchMatchedException();
            }
            e eVar = com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c.Companion;
            this.f278427w.K2(ExchangeGlobalAccessOutput.FeatureNotAvailable.f78172a);
        }
        return Unit.f186387a;
    }
}

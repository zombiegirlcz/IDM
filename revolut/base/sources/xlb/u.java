package xlb;

import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$FailResolveFirstStepException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e f307004w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f307004w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f307004w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            case 1:
                u uVar2 = new u(this.f307004w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
            default:
                u uVar3 = new u(this.f307004w, continuation, 2);
                uVar3.v = obj2;
                return uVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        switch (this.u) {
            case 0:
                ((u) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.TRUE;
            case 1:
                return ((u) create((m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((xib.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e eVar = this.f307004w;
        switch (i) {
            case 0:
                Throwable th10 = (Throwable) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.R2(new SavingsOnboardingFlowContract$FailResolveFirstStepException(th10));
                break;
            case 1:
                m mVar = (m) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.H2(eVar.B, new v(mVar, 1));
                break;
            default:
                xib.a aVar3 = (xib.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eVar.f83275t.f298469a.i();
                eVar.C2(new zib.a(aVar3));
                break;
        }
        return Unit.f186387a;
    }
}

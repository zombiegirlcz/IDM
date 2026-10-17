package hq3;

import com.revolut.feature.credit.application.plugins.impl.models.CreditOnboardingClosePayload;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mri.w;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ o u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, Continuation continuation) {
        super(1, continuation);
        this.u = oVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVar = this.u;
        w.r0(oVar.f154605w, ((CreditOnboardingClosePayload) oVar.f154600p.f66220a).f66907a.f66892b);
        return oVar.C1(u0.b(new FinishCommand(null, null, null, 7)));
    }
}

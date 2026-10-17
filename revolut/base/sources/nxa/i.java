package nxa;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ PersonalizedTrackingController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PersonalizedTrackingController personalizedTrackingController, Continuation continuation) {
        super(2, continuation);
        this.u = personalizedTrackingController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.referrals.impl.personalized_tracking.a aVar2 = (com.revolut.feature.referrals.impl.personalized_tracking.a) this.u.R2();
        cli.y yVar = aVar2.f81799x;
        o oVar = ((l) ((j2) yVar.f22677a).getValue()).d;
        Continuation continuation = null;
        if (Intrinsics.f(oVar, n.f220509a)) {
            aVar2.n2(new nt4.f(aVar2, null, 6), new whi.b(6));
        } else if (oVar instanceof m) {
            aVar2.H2(yVar, new nuc.n(29));
            m mVar = (m) oVar;
            aVar2.l2(new n8a.r(aVar2, mVar.f220506a, mVar.f220507b, continuation, 28), new yi5.b(26));
        } else if (oVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}

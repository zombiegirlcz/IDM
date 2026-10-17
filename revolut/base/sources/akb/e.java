package akb;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.ManageChallengeScreen;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ ManageChallengeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ManageChallengeScreen manageChallengeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = manageChallengeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.a aVar2 = (com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.a) this.u.d();
        aVar2.getClass();
        aVar2.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.TopLevelFaq(null), (SharedFaqDestination.PassthroughData) null, false, 14));
        return Unit.f186387a;
    }
}

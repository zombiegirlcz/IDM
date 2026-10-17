package xb9;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.WaitingListAwaitingScreen;
import com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.WaitingListAwaitingScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ WaitingListAwaitingScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WaitingListAwaitingScreen waitingListAwaitingScreen, Continuation continuation) {
        super(2, continuation);
        this.u = waitingListAwaitingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        oki.h.v2(((com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a) this.u.d()).f78509x, WaitingListAwaitingScreenContract$ModalStep.ChangeCountryConfirmationDialog.f78501a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}

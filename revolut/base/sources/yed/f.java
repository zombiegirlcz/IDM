package yed;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertRevampedScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ SharedCreateAlertRevampedScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SharedCreateAlertRevampedScreen sharedCreateAlertRevampedScreen, Continuation continuation) {
        super(2, continuation);
        this.u = sharedCreateAlertRevampedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) this.u.T2()).C2();
        return Unit.f186387a;
    }
}

package yed;

import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ SharedCreateAlertScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SharedCreateAlertScreen sharedCreateAlertScreen, Continuation continuation) {
        super(2, continuation);
        this.u = sharedCreateAlertScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((AmountEditDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) ((q) this.u.Z.getValue())).C2();
        return Unit.f186387a;
    }
}

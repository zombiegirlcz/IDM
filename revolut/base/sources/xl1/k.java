package xl1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.aani.impl.ui.registration.confirmation.AaniRegistrationConfirmationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ AaniRegistrationConfirmationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AaniRegistrationConfirmationScreen aaniRegistrationConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = aaniRegistrationConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((m) this.u.Q.getValue()).I2(e.f306905a);
        return Unit.f186387a;
    }
}

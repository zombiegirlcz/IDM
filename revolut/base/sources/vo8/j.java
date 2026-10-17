package vo8;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ JuniorSecurityAndPrivacyController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(JuniorSecurityAndPrivacyController juniorSecurityAndPrivacyController, Continuation continuation) {
        super(2, continuation);
        this.u = juniorSecurityAndPrivacyController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b) this.u.d()).B.a();
        return Unit.f186387a;
    }
}

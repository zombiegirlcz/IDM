package x3a;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.notify.OnboardingContactSyncNotifyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ OnboardingContactSyncNotifyScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(OnboardingContactSyncNotifyScreen onboardingContactSyncNotifyScreen, Continuation continuation) {
        super(2, continuation);
        this.u = onboardingContactSyncNotifyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) this.u.N.getValue();
        lVar.getClass();
        lVar.l2(new k(lVar, null, 0), new yi5.b(26));
        return Unit.f186387a;
    }
}

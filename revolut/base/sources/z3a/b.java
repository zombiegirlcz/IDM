package z3a;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.OnboardingContactSyncPermissionScreen;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.OnboardingContactSyncPermissionScreenContract$ScreenModelApi$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ OnboardingContactSyncPermissionScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(OnboardingContactSyncPermissionScreen onboardingContactSyncPermissionScreen, Continuation continuation) {
        super(2, continuation);
        this.u = onboardingContactSyncPermissionScreen;
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
        com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.a aVar2 = (com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.a) ((i) this.u.O.getValue());
        y80.a aVar3 = aVar2.o;
        if (aVar3.c("android.permission.READ_CONTACTS") && aVar3.c("android.permission.WRITE_CONTACTS")) {
            aVar2.l2(new k(aVar2, null, 1), new yi5.b(26));
        } else {
            oki.h.v2(aVar2.f80117r, OnboardingContactSyncPermissionScreenContract$ScreenModelApi$ModalStep.ContactPermissionsFlow.f80114a, ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        }
        return Unit.f186387a;
    }
}

package ajh;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.wealth.ui.impl.accounts.screen.get_started_onboarding.WealthAccountsGetStartedOnboardingScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WealthAccountsGetStartedOnboardingScreen f5572w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WealthAccountsGetStartedOnboardingScreen wealthAccountsGetStartedOnboardingScreen, Continuation continuation) {
        super(2, continuation);
        this.f5572w = wealthAccountsGetStartedOnboardingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.f5572w, continuation);
        cVar.v = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.v;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            g gVar = (g) this.f5572w.Q.getValue();
            Intrinsics.h(model);
            this.v = null;
            this.u = 1;
            l lVar = (l) gVar;
            lVar.getClass();
            Object objB = pu7.a.B(lVar.k, "WealthAccountsGetStartedOnboardingScreenModel_onFullScreenActionClicked", new i(model, lVar, null), this);
            if (objB != obj3) {
                objB = Unit.f186387a;
            }
            if (objB == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}

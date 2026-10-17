package ajh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.ui.impl.accounts.screen.get_started_onboarding.WealthAccountsGetStartedOnboardingScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WealthAccountsGetStartedOnboardingScreen f5573w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WealthAccountsGetStartedOnboardingScreen wealthAccountsGetStartedOnboardingScreen, Continuation continuation) {
        super(2, continuation);
        this.f5573w = wealthAccountsGetStartedOnboardingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.f5573w, continuation);
        dVar.v = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.v;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            g gVar = (g) this.f5573w.Q.getValue();
            Intrinsics.h(model);
            this.v = null;
            this.u = 1;
            l lVar = (l) gVar;
            lVar.getClass();
            Object objB = pu7.a.B(lVar.k, "WealthAccountsGetStartedOnboardingScreenModel_ActionClick", new k(lVar, model, null), this);
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

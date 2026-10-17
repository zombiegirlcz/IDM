package zh3;

import com.google.firebase.messaging.t;
import ei3.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements mm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f322234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mm.d f322235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q89.e f322236c;
    public final sh3.a d;
    public final tm.g e;

    public k(ln.a navigationCommandsDispatcher, mm.d actionsDispatcher, q89.e onboardingInteractor, sh3.a checkoutInteractor, p processCheckoutOrderProvider, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(processCheckoutOrderProvider, "processCheckoutOrderProvider");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f322234a = navigationCommandsDispatcher;
        this.f322235b = actionsDispatcher;
        this.f322236c = onboardingInteractor;
        this.d = checkoutInteractor;
        this.e = actionDelegateFactory.f(new za9.c(this, 28));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        rh3.c action = (rh3.c) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.e.a(action);
    }
}

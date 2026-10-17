package vc0;

import com.google.firebase.messaging.t;
import kotlin.jvm.internal.Intrinsics;
import qc0.j;
import qc0.k;
import tm.g;
import wl2.f;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements mm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f287612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f287613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f287614c;
    public final eli.j d;
    public final ca0.a e;
    public final g f;

    public c(k state, j router, f backendFlowInteractor, eli.j twoFaErrorHandler, ca0.a twoFaCodeResolver, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(backendFlowInteractor, "backendFlowInteractor");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(twoFaCodeResolver, "twoFaCodeResolver");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f287612a = state;
        this.f287613b = router;
        this.f287614c = backendFlowInteractor;
        this.d = twoFaErrorHandler;
        this.e = twoFaCodeResolver;
        this.f = actionDelegateFactory.f(new v25.k(this, 27));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        qc0.f action = (qc0.f) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f.a(action);
    }
}

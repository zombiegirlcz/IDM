package vc0;

import com.google.firebase.messaging.t;
import kotlin.jvm.internal.Intrinsics;
import mm.d;
import qc0.j;
import qc0.k;
import tm.g;
import xl2.f;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements mm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f287608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f287609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ln.a f287610c;
    public final f d;
    public final d e;
    public final g f;

    public a(j router, k state, ln.a navigationCommandsDispatcher, f backendFlowConfiguration, d actionsDispatcher, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(backendFlowConfiguration, "backendFlowConfiguration");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f287608a = router;
        this.f287609b = state;
        this.f287610c = navigationCommandsDispatcher;
        this.d = backendFlowConfiguration;
        this.e = actionsDispatcher;
        this.f = actionDelegateFactory.f(new v25.k(this, 26));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        qc0.c action = (qc0.c) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f.a(action);
    }
}

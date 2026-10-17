package vc0;

import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.jvm.internal.Intrinsics;
import qc0.d;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements mm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f287611a;

    public b(ln.a navigationCommandsDispatcher) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        this.f287611a = navigationCommandsDispatcher;
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        d action = (d) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f287611a.a(new FinishCommand(1609, null, null, 6));
    }
}

package gz7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mm.d f147969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln.a f147970b;

    public w(mm.d actionDispatcher, ln.a navigationCommandsDispatcher) {
        Intrinsics.checkNotNullParameter(actionDispatcher, "actionDispatcher");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        this.f147969a = actionDispatcher;
        this.f147970b = navigationCommandsDispatcher;
    }

    public final efm.b a() {
        return okl.m.w(null, null, null, 7, this.f147970b);
    }
}

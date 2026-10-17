package rxl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import no.o1;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f258186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wxl.a f258187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xxl.a f258188c;
    public final o1 d;

    public a(CoroutineScope scope, wxl.a nudgeInteractor, xxl.a motionSpecFactory, o1 nudgeEventsTracker) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(nudgeInteractor, "nudgeInteractor");
        Intrinsics.checkNotNullParameter(motionSpecFactory, "motionSpecFactory");
        Intrinsics.checkNotNullParameter(nudgeEventsTracker, "nudgeEventsTracker");
        this.f258186a = scope;
        this.f258187b = nudgeInteractor;
        this.f258188c = motionSpecFactory;
        this.d = nudgeEventsTracker;
    }
}

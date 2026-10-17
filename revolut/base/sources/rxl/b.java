package rxl;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import no.o1;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f258189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f258190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wxl.a f258191c;
    public final o1 d;
    public boolean e;

    public b(Activity activity, CoroutineScope scope, wxl.a nudgeInteractor, xxl.a motionSpecFactory, o1 nudgeEventsTracker) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(nudgeInteractor, "nudgeInteractor");
        Intrinsics.checkNotNullParameter(motionSpecFactory, "motionSpecFactory");
        Intrinsics.checkNotNullParameter(nudgeEventsTracker, "nudgeEventsTracker");
        this.f258189a = activity;
        this.f258190b = scope;
        this.f258191c = nudgeInteractor;
        this.d = nudgeEventsTracker;
    }
}

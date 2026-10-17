package qpa;

import com.google.firebase.messaging.u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f248322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f248323b;

    public c(List interceptors, u pushEventsTracker) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(pushEventsTracker, "pushEventsTracker");
        this.f248322a = interceptors;
        this.f248323b = pushEventsTracker;
    }
}

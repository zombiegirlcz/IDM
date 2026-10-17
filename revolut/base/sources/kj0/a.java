package kj0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f184254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f184255b;

    public a(g config, d circuitBreakerStateTransitionTracker) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(circuitBreakerStateTransitionTracker, "circuitBreakerStateTransitionTracker");
        this.f184254a = config;
        this.f184255b = circuitBreakerStateTransitionTracker;
    }
}

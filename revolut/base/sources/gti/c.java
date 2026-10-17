package gti;

import kotlin.jvm.internal.Intrinsics;
import uo.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f146611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f146612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uo.b f146613c;
    public final b d;
    public e e;

    public c(com.revolut.kompot.navigable.a screen, q0 screenNameFinder, uo.b activeScreenHolder, b brightnessAnalyticsTracker) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(brightnessAnalyticsTracker, "brightnessAnalyticsTracker");
        this.f146611a = screen;
        this.f146612b = screenNameFinder;
        this.f146613c = activeScreenHolder;
        this.d = brightnessAnalyticsTracker;
    }
}

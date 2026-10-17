package xvi;

import kotlin.jvm.internal.Intrinsics;
import uo.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f309276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f309277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uo.b f309278c;
    public final b d;
    public e e;

    public c(com.revolut.kompot.navigable.a screen, q0 screenNameFinder, uo.b activeScreenHolder, b brightnessAnalyticsTracker) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(brightnessAnalyticsTracker, "brightnessAnalyticsTracker");
        this.f309276a = screen;
        this.f309277b = screenNameFinder;
        this.f309278c = activeScreenHolder;
        this.d = brightnessAnalyticsTracker;
    }
}

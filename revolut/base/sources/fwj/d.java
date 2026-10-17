package fwj;

import ho.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.analytics.tracking.v3.d f138660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f138661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eo.f f138662c;

    public d(com.revolut.analytics.tracking.v3.d diagnosticEventsTracker, t analyticsTracker) {
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        this.f138660a = diagnosticEventsTracker;
        this.f138661b = analyticsTracker;
        this.f138662c = eo.f.SEON;
    }
}

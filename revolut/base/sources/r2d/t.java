package r2d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f251121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efd.a f251122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xoj.a f251123c;

    public t(s mapper, efd.a alertsInteractor, xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(alertsInteractor, "alertsInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f251121a = mapper;
        this.f251122b = alertsInteractor;
        this.f251123c = featuresInteractor;
    }
}

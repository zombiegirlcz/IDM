package whe;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f297626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.analytics.tracking.v3.d f297627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sjf.e f297628c;
    public boolean d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f297629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f297630h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f297631j;
    public boolean k;

    public c(CoroutineScope coroutineScope, com.revolut.analytics.tracking.v3.d diagnosticEventsTracker, sjf.e transactionsPerformanceTracker) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        Intrinsics.checkNotNullParameter(transactionsPerformanceTracker, "transactionsPerformanceTracker");
        this.f297626a = coroutineScope;
        this.f297627b = diagnosticEventsTracker;
        this.f297628c = transactionsPerformanceTracker;
    }
}

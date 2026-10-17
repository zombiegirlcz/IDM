package pzl;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements wu.a {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.analytics.tracking.v3.d f241020a;

    public e(com.revolut.analytics.tracking.v3.d analyticsTracker) {
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        this.f241020a = analyticsTracker;
    }

    public final void a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ((com.revolut.analytics.tracking.v3.f) this.f241020a).d(0L, "failed");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CacheCleanerWorker", "Unexpected error in cacheCleaner", throwable, h0Var);
    }

    public final void b() {
        ((com.revolut.analytics.tracking.v3.f) this.f241020a).d(0L, "skipped");
    }

    public final void c(long j2) {
        ((com.revolut.analytics.tracking.v3.f) this.f241020a).d(j2, "cleaned");
    }
}

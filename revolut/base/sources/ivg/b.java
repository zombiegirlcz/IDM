package ivg;

import com.revolut.feature.wealth.analytics.benchmark.service.WealthAnalyticsPerformanceBenchmarkService;
import e6d.f;
import is2.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.d;
import org.jetbrains.annotations.NotNull;
import x4l.c;
import xe0.e;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f168860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f168861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WealthAnalyticsPerformanceBenchmarkService f168862c;
    public final c d;

    public b(e storage, d cache, WealthAnalyticsPerformanceBenchmarkService service) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f168860a = storage;
        this.f168861b = cache;
        this.f168862c = service;
        Continuation continuation = null;
        this.d = new c(new f(this, continuation, 27), new t(this, 19), new in1.a(this, 16), new iaf.d(this, continuation, 23), new hwi.b(this, continuation, 11));
    }
}

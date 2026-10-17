package abm;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;
import nd.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Future f2993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f2994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f2995c;

    public e(Future future, k logger, Executor executor) {
        Intrinsics.checkNotNullParameter(future, "future");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f2993a = future;
        this.f2994b = logger;
        this.f2995c = executor;
    }

    public final Object a() {
        if (Intrinsics.f(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalThreadStateException("Operation should not run from main thread.");
        }
        return this.f2993a.get();
    }
}

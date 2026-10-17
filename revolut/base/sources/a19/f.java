package a19;

import a09.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f566c;

    public f(c buildDependenciesProvider, j memoryCache) {
        Intrinsics.checkNotNullParameter(buildDependenciesProvider, "buildDependenciesProvider");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f564a = buildDependenciesProvider;
        this.f565b = memoryCache;
        Continuation continuation = null;
        this.f566c = new x4l.c(new o(this, continuation, 1), new a0.c(this, 5), new a09.b(this, 5), new a01.e(this, continuation, 2), new e(3, 0, null));
    }
}

package are;

import a09.o;
import a09.p;
import akl.e0;
import com.revolut.feature.teen_profile.impl.services.TeenProfileService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import x4l.c;
import xe0.e;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TeenProfileService f8690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f8691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f8692c;
    public final c d;

    public b(TeenProfileService service, j memoryCache, e storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f8690a = service;
        this.f8691b = memoryCache;
        this.f8692c = storage;
        Continuation continuation = null;
        this.d = new c(new o(this, continuation, 6), new ar1.c(this, 7), new anc.b(this, 11), new e0(this, continuation, 7), new p(this, continuation, 8));
    }
}

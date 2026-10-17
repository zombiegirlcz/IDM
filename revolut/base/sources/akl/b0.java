package akl;

import com.revolut.sso.impl.network.services.DocumentsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f5991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rqk.k f5992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocumentsService f5993c;
    public final x4l.c d;

    public b0(ne0.j memoryCache, rqk.k revolutSsoDependenciesProvider, DocumentsService service) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f5991a = memoryCache;
        this.f5992b = revolutSsoDependenciesProvider;
        this.f5993c = service;
        Continuation continuation = null;
        this.d = new x4l.c(new a09.o(this, continuation, 4), new afa.q(this, 19), new ack.f(this, 21), new o(2, 1, continuation), new a19.e(3, 4, continuation));
    }
}

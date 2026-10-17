package hwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungesProductArticleService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungesProductArticleService f156236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f156237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f156238c;
    public final x4l.c d;

    public m0(AirportLoungesProductArticleService service, ue0.c storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f156236a = service;
        this.f156237b = storage;
        this.f156238c = memoryCache;
        Continuation continuation = null;
        int i = 4;
        this.d = new x4l.c(new e6d.f(this, continuation, 22), new hw9.a(this, i), new hw9.b(this, i), new l0(this, continuation, 0), new b(this, continuation, 5));
    }
}

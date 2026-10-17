package hwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungeNewPassesService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungeNewPassesService f156196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f156197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f156198c;
    public final x4l.c d;

    public c(AirportLoungeNewPassesService service, ue0.c storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f156196a = service;
        this.f156197b = storage;
        this.f156198c = memoryCache;
        Continuation continuation = null;
        int i = 2;
        this.d = new x4l.c(new e6d.f(this, continuation, 18), new hw9.a(this, i), new hw9.b(this, i), new hbg.h(this, continuation, 27), new b(this, continuation, 0));
    }
}

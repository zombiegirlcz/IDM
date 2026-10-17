package hwi;

import com.revolut.retail.feature.airportlounges.impl.network.SchemeAirportLoungesService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class f1 {

    @NotNull
    public static final e1 Companion = new e1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SchemeAirportLoungesService f156213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f156214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f156215c;
    public final x4l.c d;

    public f1(SchemeAirportLoungesService service, ue0.c storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f156213a = service;
        this.f156214b = storage;
        this.f156215c = memoryCache;
        Continuation continuation = null;
        int i = 6;
        this.d = new x4l.c(new e6d.f(this, continuation, 24), new hw9.a(this, i), new hw9.b(this, i), new l0(this, continuation, 2), new b(this, continuation, 7));
    }
}

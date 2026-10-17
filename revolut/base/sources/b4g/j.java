package b4g;

import com.revolut.feature.travel.flights.impl.data.network.TravelFlightsApi;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsApi f12338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f12339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f12340c;
    public final x4l.c d;

    public j(TravelFlightsApi api2, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f12338a = api2;
        this.f12339b = memoryCache;
        this.f12340c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new a09.o(this, continuation, 17), new b4b.z(this, 4), new av8.n(this, 16), new h(this, continuation, 0), new awd.b(this, continuation, 3), new h(this, continuation, 1));
    }
}

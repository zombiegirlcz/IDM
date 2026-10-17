package b4g;

import com.revolut.feature.travel.flights.impl.data.network.TravelFlightsApi;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsApi f12322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f12323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f12324c;

    public d0(TravelFlightsApi api2, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f12322a = api2;
        this.f12323b = memoryCache;
        Continuation continuation = null;
        this.f12324c = new x4l.c(new a72.k(this, continuation, 28), new b4b.z(this, 8), new av8.n(this, 20), new akl.o(2, 12, continuation), new a19.e(3, 14, continuation));
    }
}

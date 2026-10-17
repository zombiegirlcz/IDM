package b4g;

import com.revolut.feature.travel.flights.impl.data.network.TravelFlightsApi;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class y {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsApi f12369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f12370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f12371c;

    public y(TravelFlightsApi api2, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f12369a = api2;
        this.f12370b = memoryCache;
        Continuation continuation = null;
        this.f12371c = new x4l.c(new a72.k(this, continuation, 26), new b4b.z(this, 6), new av8.n(this, 18), new akl.o(2, 10, continuation), new a19.e(3, 12, continuation));
    }
}

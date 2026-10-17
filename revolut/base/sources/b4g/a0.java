package b4g;

import com.revolut.feature.travel.flights.impl.data.network.TravelFlightsApi;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsApi f12314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f12315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f12316c;

    public a0(TravelFlightsApi api2, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f12314a = api2;
        this.f12315b = memoryCache;
        Continuation continuation = null;
        this.f12316c = new x4l.c(new a72.k(this, continuation, 27), new b4b.z(this, 7), new av8.n(this, 19), new akl.o(2, 11, null), new a19.e(3, 13, continuation));
    }
}

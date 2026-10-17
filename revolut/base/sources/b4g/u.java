package b4g;

import com.revolut.feature.travel.flights.impl.data.network.TravelFlightsApi;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class u {

    @NotNull
    private static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsApi f12363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk0.b f12364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f12365c;
    public final ue0.c d;
    public final x4l.c e;

    public u(TravelFlightsApi api2, zk0.b fileSystemRepository, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f12363a = api2;
        this.f12364b = fileSystemRepository;
        this.f12365c = memoryCache;
        this.d = storage;
        Continuation continuation = null;
        this.e = new x4l.c(new a72.k(this, continuation, 25), new b4b.z(this, 5), new av8.n(this, 17), new avk.i(this, continuation, 22), new a0e.o(this, continuation, 20));
    }

    public static String a(s sVar) {
        StringBuilder sb6 = new StringBuilder("TRAVEL_FLIGHTS_RECEIPTS_");
        sb6.append(sVar.f12361a);
        String str = sVar.f12362b;
        if (str != null) {
            sb6.append(":");
            sb6.append(str);
        }
        return sb6.toString();
    }
}

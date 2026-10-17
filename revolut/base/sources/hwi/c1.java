package hwi;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.airportlounges.impl.network.AirportSavedLoungesService;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class c1 implements y0 {

    @NotNull
    public static final b1 Companion = new b1();
    public static final Type f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportSavedLoungesService f156200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f156201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f156202c;
    public final b80.c d;
    public final Lazy e;

    static {
        Type type = new TypeToken<List<? extends iwi.c>>() { // from class: com.revolut.retail.feature.airportlounges.impl.repository.AirportSavedLoungesRepositoryImpl$Companion$TYPE_AIRPORT_LOUNGE_ENTITY$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f = type;
    }

    public c1(AirportSavedLoungesService service, ue0.c storage, ne0.j memoryCache, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f156200a = service;
        this.f156201b = storage;
        this.f156202c = memoryCache;
        this.d = networkStateRepository;
        this.e = yhm.j.b(new hq1.f(this, 10));
    }
}

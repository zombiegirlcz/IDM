package hwi;

import com.revolut.retail.feature.airportlounges.impl.network.AirportLoungesUserCapabilitiesService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class x0 {

    @NotNull
    public static final w0 Companion = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungesUserCapabilitiesService f156268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f156269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f156270c;
    public final x4l.c d;

    public x0(AirportLoungesUserCapabilitiesService service, ue0.c storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f156268a = service;
        this.f156269b = storage;
        this.f156270c = memoryCache;
        Continuation continuation = null;
        int i = 5;
        this.d = new x4l.c(new e6d.f(this, continuation, 23), new hw9.a(this, i), new hw9.b(this, i), new l0(this, continuation, 1), new b(this, continuation, 6));
    }

    public static vkm.d a(x0 x0Var) {
        x0Var.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return x0Var.d.b(Unit.f186387a, loadingStrategy);
    }
}

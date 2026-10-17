package ll7;

import com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceCarService f196636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f196637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f196638c;
    public final x4l.c d;

    public i0(InsuranceCarService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f196636a = service;
        this.f196637b = memoryCache;
        this.f196638c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new k7c.x(this, continuation, 18), new lk4.g(this, 5), new lcc.c(this, 21), new le8.d(this, continuation, 19), new j40.d(this, continuation, 27));
    }
}

package ll7;

import com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceCarService f196639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f196640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f196641c;

    public k(InsuranceCarService service, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f196639a = service;
        this.f196640b = memoryCache;
        Continuation continuation = null;
        this.f196641c = new x4l.c(new k7c.x(this, continuation, 16), new lk4.g(this, 4), new lcc.c(this, 20), new iz1.g(2, 21, null), new k3c.l(3, 14, continuation));
    }
}

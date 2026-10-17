package pfk;

import com.revolut.retail.feature.pricing_plans.impl.network.PricingPlanSubscriptionsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanSubscriptionsService f235630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xe0.e f235631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f235632c;
    public final x4l.c d;

    public e0(PricingPlanSubscriptionsService service, xe0.e storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f235630a = service;
        this.f235631b = storage;
        this.f235632c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new k3c.k(this, continuation, 25), new pb2.v(this, 13), new p5f.c(this, 18), new ox5.r(this, continuation, 29), new q(this, continuation, 3));
    }
}

package au6;

import com.revolut.feature.freelancer.impl.network.services.FreelancerPricingPlanService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 {

    @NotNull
    public static final w1 Companion = new w1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerPricingPlanService f9656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f9657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f9658c;
    public final ft6.o d;
    public final x4l.c e;

    public x1(FreelancerPricingPlanService service, ne0.j memoryCache, ue0.c storage, ft6.o mapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f9656a = service;
        this.f9657b = memoryCache;
        this.f9658c = storage;
        this.d = mapper;
        Continuation continuation = null;
        int i = 24;
        this.e = new x4l.c(new a72.k(this, continuation, 11), new ar1.c(this, i), new anc.b(this, i), new akl.e0(this, continuation, 13), new a09.p(this, continuation, 20));
    }
}

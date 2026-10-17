package pfk;

import com.revolut.retail.feature.pricing_plans.impl.network.PricingPlanWorkflowService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanWorkflowService f235637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f235638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f235639c;
    public final x4l.c d;

    public g0(PricingPlanWorkflowService service, ne0.j memoryCache, xe0.e storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f235637a = service;
        this.f235638b = memoryCache;
        this.f235639c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new k3c.k(this, continuation, 26), new pb2.v(this, 14), new p5f.c(this, 19), new p0l.d(this, continuation, 21), new p24.q(this, continuation, 4));
    }
}

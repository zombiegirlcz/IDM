package au6;

import com.revolut.feature.freelancer.impl.network.services.FreelancerPaymentsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class u1 {

    @NotNull
    public static final t1 Companion = new t1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerPaymentsService f9629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f9630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f9631c;
    public final x4l.c d;

    public u1(FreelancerPaymentsService api2, ne0.j memoryCache, ue0.c storageCache) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storageCache, "storageCache");
        this.f9629a = api2;
        this.f9630b = memoryCache;
        this.f9631c = storageCache;
        Continuation continuation = null;
        int i = 23;
        this.d = new x4l.c(new a72.k(this, continuation, 10), new ar1.c(this, i), new anc.b(this, i), new ap7.k(this, continuation, 16), new a0e.o(this, continuation, 10));
    }
}

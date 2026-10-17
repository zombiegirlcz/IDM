package au6;

import com.revolut.feature.freelancer.impl.network.services.FreelancerProductArticleService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f9674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerProductArticleService f9675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f9676c;
    public final x4l.c d;

    public z1(ne0.j memoryCache, FreelancerProductArticleService api2, ue0.c storage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f9674a = memoryCache;
        this.f9675b = api2;
        this.f9676c = storage;
        Continuation continuation = null;
        int i = 25;
        this.d = new x4l.c(new a72.k(this, continuation, 12), new ar1.c(this, i), new anc.b(this, i), new ap7.k(this, continuation, 17), new a0e.o(this, continuation, 11));
    }
}

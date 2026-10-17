package au6;

import com.revolut.feature.freelancer.impl.network.services.FreelancerOnboardingService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 {

    @NotNull
    public static final q1 Companion = new q1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerOnboardingService f9607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final is6.d f9608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f9609c;
    public final x4l.c d;

    public r1(FreelancerOnboardingService api2, is6.d businessCategoryDao, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(businessCategoryDao, "businessCategoryDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f9607a = api2;
        this.f9608b = businessCategoryDao;
        this.f9609c = memoryCache;
        Continuation continuation = null;
        int i = 22;
        this.d = new x4l.c(new a09.o(this, continuation, 9), new ar1.c(this, i), new anc.b(this, i), new akl.e0(this, continuation, 12), new a09.p(this, continuation, 19));
    }
}

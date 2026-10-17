package au6;

import com.revolut.feature.freelancer.impl.network.services.FreelancerLearnLessonsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 {

    @NotNull
    public static final o1 Companion = new o1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerLearnLessonsService f9595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f9596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f9597c;
    public final x4l.c d;

    public p1(FreelancerLearnLessonsService api2, ne0.j memoryCache, ue0.c storageCache) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storageCache, "storageCache");
        this.f9595a = api2;
        this.f9596b = memoryCache;
        this.f9597c = storageCache;
        Continuation continuation = null;
        int i = 21;
        this.d = new x4l.c(new a72.k(this, continuation, 9), new ar1.c(this, i), new anc.b(this, i), new ap7.k(this, continuation, 15), new a0e.o(this, continuation, 9));
    }

    public static String a(ur6.b bVar) {
        return "freelancer:LearnLessons:" + bVar;
    }
}

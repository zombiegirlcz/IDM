package au6;

import com.revolut.feature.freelancer.impl.network.services.FreelancerSettlementService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class q2 {

    @NotNull
    public static final p2 Companion = new p2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerSettlementService f9602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f9603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f9604c;

    public q2(FreelancerSettlementService api2, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f9602a = api2;
        this.f9603b = memoryCache;
        Continuation continuation = null;
        int i = 27;
        this.f9604c = new x4l.c(new a09.o(this, continuation, 11), new ar1.c(this, i), new anc.b(this, i), new akl.o(2, 4, continuation), new a19.e(3, 7, continuation));
    }
}

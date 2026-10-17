package au6;

import com.revolut.feature.freelancer.impl.network.services.FreelancerAccountService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class n1 {

    @NotNull
    public static final l1 Companion = new l1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerAccountService f9579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f9580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f9581c;

    public n1(FreelancerAccountService api2, ne0.j memoryCache, ue0.c storageCache) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storageCache, "storageCache");
        this.f9579a = api2;
        this.f9580b = memoryCache;
        this.f9581c = storageCache;
    }
}

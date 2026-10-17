package au6;

import com.revolut.feature.freelancer.impl.network.services.FreelancerTaxPocketsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m3 {

    @NotNull
    public static final l3 Companion = new l3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerTaxPocketsService f9573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f9574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f9575c;
    public final x4l.c d;

    public m3(FreelancerTaxPocketsService api2, ne0.j memoryCache, xe0.e storageCache) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storageCache, "storageCache");
        this.f9573a = api2;
        this.f9574b = memoryCache;
        this.f9575c = storageCache;
        Continuation continuation = null;
        int i = 28;
        this.d = new x4l.c(new a09.o(this, continuation, 14), new ar1.c(this, i), new anc.b(this, i), new akl.e0(this, continuation, 16), new a09.p(this, continuation, 24));
    }
}

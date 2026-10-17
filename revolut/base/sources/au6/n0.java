package au6;

import com.revolut.feature.freelancer.impl.network.services.FreelancerCurrencyService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 {

    @NotNull
    public static final m0 Companion = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerCurrencyService f9576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f9577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bu6.c f9578c;
    public final x4l.c d;

    public n0(FreelancerCurrencyService api2, ne0.j memoryCache, bu6.c freelancerCurrencySettingsMapper) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(freelancerCurrencySettingsMapper, "freelancerCurrencySettingsMapper");
        this.f9576a = api2;
        this.f9577b = memoryCache;
        this.f9578c = freelancerCurrencySettingsMapper;
        int i = 20;
        this.d = new x4l.c(new a09.o(this, null, 8), new ar1.c(this, i), new anc.b(this, i), new akl.o(2, 3, null), new a19.e(3, 6, null));
    }
}

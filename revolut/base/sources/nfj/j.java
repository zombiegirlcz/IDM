package nfj;

import com.revolut.retail.feature.esim.impl.network.EsimConnectEligibilityService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimConnectEligibilityService f214963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f214964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f214965c;

    public j(EsimConnectEligibilityService api2, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f214963a = api2;
        this.f214964b = memoryCache;
        Continuation continuation = null;
        this.f214965c = new x4l.c(new k3c.k(this, continuation, 19), new n7h.c(this, 29), new n8i.e(this, 14), new mqc.p(2, 9, continuation), new i(3, 0, continuation));
    }
}

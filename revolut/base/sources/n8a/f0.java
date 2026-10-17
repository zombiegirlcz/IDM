package n8a;

import com.revolut.feature.pix.impl.data.network.TrustedBeneficiariesService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 {

    @NotNull
    private static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrustedBeneficiariesService f213315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f213316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f213317c;
    public final x4l.c d;

    public f0(TrustedBeneficiariesService service, ue0.c storage, ne0.d memoryCache, k8a.d mapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f213315a = service;
        this.f213316b = storage;
        this.f213317c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new k3c.k(this, continuation, 16), new n7h.c(this, 5), new mz3.r(this, 29), new mta.c(this, continuation, 21), new l05.b(this, continuation, 19));
    }
}

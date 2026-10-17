package nfj;

import com.revolut.retail.feature.esim.impl.network.EsimHelpService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimHelpService f214918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f214919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f214920c;
    public final x4l.c d;

    public b0(EsimHelpService api2, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f214918a = api2;
        this.f214919b = memoryCache;
        this.f214920c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new mtj.k(this, continuation, 13), new l(this, 3), new n8i.e(this, 18), new naf.j(this, continuation, 11), new lp6.g(this, continuation, 23));
    }
}

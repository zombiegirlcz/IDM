package vdl;

import com.revolut.shared.feature.wealth.domain.impl.data.network.dividends.DividendsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f287963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f287964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b80.c f287965c;
    public final DividendsService d;
    public final x4l.c e;

    public f(ue0.c storage, ne0.j memoryCache, b80.c networkStateRepository, DividendsService service) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f287963a = storage;
        this.f287964b = memoryCache;
        this.f287965c = networkStateRepository;
        this.d = service;
        Continuation continuation = null;
        this.e = new x4l.c(new th6.p(this, continuation, 15), new a(this, 1), new v48.d(this, 16), new v44.e(this, continuation, 21), new sne.e(this, continuation, 19));
    }

    public static String a(String str) {
        return j6.a.q("PENDING_ASSETS_MEMORY_KEY", str);
    }
}

package l05;

import com.revolut.feature.credit.health.impl.data.network.CreditHealthService;
import k3c.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditHealthService f191184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f191185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f191186c;
    public final x4l.c d;

    public i(CreditHealthService service, ne0.d memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f191184a = service;
        this.f191185b = memoryCache;
        this.f191186c = storage;
        Continuation continuation = null;
        int i = 29;
        this.d = new x4l.c(new k(this, continuation, 10), new kv7.g(this, i), new kj4.c(this, i), new ko2.b(this, continuation, 16), new b(this, continuation, 2));
    }
}

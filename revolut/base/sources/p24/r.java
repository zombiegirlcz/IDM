package p24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPluginsService f232059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f232060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ve0.c f232061c;
    public final x4l.c d;

    public r(CreditPluginsService creditPluginsService, ne0.d memoryCache, ve0.c storage) {
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f232059a = creditPluginsService;
        this.f232060b = memoryCache;
        this.f232061c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new k3c.k(this, continuation, 23), new oxd.m(this, 13), new or4.i(this, 24), new p0l.d(this, continuation, 3), new q(this, continuation, 0));
    }
}

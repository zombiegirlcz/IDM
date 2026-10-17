package bdk;

import a09.o;
import com.revolut.retail.feature.plan_rewards.impl.data.service.MonthlyDrawsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MonthlyDrawsService f14612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f14613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f14614c;
    public final x4l.c d;

    public f(MonthlyDrawsService service, ne0.j cache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f14612a = service;
        this.f14613b = cache;
        this.f14614c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new o(this, continuation, 20), new b9i.f(this, 13), new b7d.c(this, 21), new az.i(this, continuation, 27), new awd.b(this, continuation, 10));
    }
}

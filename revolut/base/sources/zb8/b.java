package zb8;

import com.revolut.feature.junior_allowance.impl.service.JuniorAllowanceStandingOrderService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import ue0.c;
import wtc.b0;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f320841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f320842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JuniorAllowanceStandingOrderService f320843c;
    public final x4l.c d;

    public b(c storage, j memoryCache, JuniorAllowanceStandingOrderService service) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f320841a = storage;
        this.f320842b = memoryCache;
        this.f320843c = service;
        Continuation continuation = null;
        this.d = new x4l.c(new b0(this, continuation, 15), new za9.c(this, 5), new yz4.b(this, 29), new z3f.b(this, null, 7), new wa7.j(this, continuation, 23));
    }
}

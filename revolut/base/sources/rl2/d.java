package rl2;

import com.revolut.feature.backend_driven_limits.impl.v2.network.RestrictionsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import p24.q;
import r6f.i;
import raf.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pl2.a f254911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f254912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f254913c;
    public final RestrictionsService d;
    public final x4l.c e;

    public d(pl2.a mapper, j memoryCache, ue0.c storage, RestrictionsService service) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f254911a = mapper;
        this.f254912b = memoryCache;
        this.f254913c = storage;
        this.d = service;
        Continuation continuation = null;
        int i = 29;
        this.e = new x4l.c(new b(this, null), new o(this, i), new i(this, i), new c(this, continuation, 0), new q(this, continuation, 24), new c(this, continuation, 1));
    }
}

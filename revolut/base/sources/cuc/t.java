package cuc;

import com.revolut.feature.security_hub.impl.network.SecurityHubChecklistService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f108971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f108972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecurityHubChecklistService f108973c;
    public final x4l.c d;

    public t(ue0.c storage, ne0.j memoryCache, SecurityHubChecklistService service, s mapper) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f108971a = storage;
        this.f108972b = memoryCache;
        this.f108973c = service;
        int i = 25;
        Continuation continuation = null;
        this.d = new x4l.c(new a09.o(this, continuation, i), new cp7.k(this, i), new cnc.t(this, 17), new co7.c(this, continuation, 8), new awd.b(this, continuation, 21));
    }
}

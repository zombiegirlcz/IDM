package vdl;

import com.revolut.shared.feature.wealth.domain.impl.data.network.IndexesService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f287970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f287971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IndexesService f287972c;
    public final x4l.c d;

    public h(ne0.j memoryCache, ue0.c storage, IndexesService service, b80.c connectivityRepository) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        this.f287970a = memoryCache;
        this.f287971b = storage;
        this.f287972c = service;
        Continuation continuation = null;
        int i = 23;
        this.d = new x4l.c(new th6.p(connectivityRepository, this, (Continuation) null), new a(this, 2), new v48.d(this, 17), new uwe.f(this, continuation, i), new ska.c(this, continuation, i));
    }
}

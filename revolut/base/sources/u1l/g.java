package u1l;

import com.revolut.retail.feature.travel_status.impl.data.service.TravelStatusService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pti.s;
import tp8.l;
import tx0.p4;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelStatusService f276440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f276441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f276442c;
    public final x4l.c d;

    public g(TravelStatusService service, ue0.c storage, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f276440a = service;
        this.f276441b = storage;
        this.f276442c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new s(this, continuation, 21), new p4(this, 15), new l(this, 22), new u07.b(this, continuation, 2), new ska.c(this, continuation, 16));
    }
}

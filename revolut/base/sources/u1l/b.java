package u1l;

import com.revolut.retail.feature.travel_status.impl.data.service.TravelStatusService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pti.s;
import tp8.l;
import tx0.p4;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelStatusService f276433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f276434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f276435c;
    public final x4l.c d;

    public b(TravelStatusService service, ue0.c storage, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f276433a = service;
        this.f276434b = storage;
        this.f276435c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new s(this, continuation, 20), new p4(this, 13), new l(this, 20), new u07.b(this, continuation, 1), new ska.c(this, continuation, 15));
    }
}

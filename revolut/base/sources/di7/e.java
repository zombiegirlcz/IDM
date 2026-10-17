package di7;

import bwb.n;
import com.revolut.feature.instruments.trend.collections.impl.network.InstrumentsTrendCollectionsService;
import dce.l0;
import dgj.h;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.d f114940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstrumentsTrendCollectionsService f114941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f114942c;
    public final x4l.c d;

    public e(ne0.d memoryCache, InstrumentsTrendCollectionsService service, xe0.e storage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f114940a = memoryCache;
        this.f114941b = service;
        this.f114942c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new d(this, null), new l0(this, 15), new h(this, 3), new d8j.c(this, continuation, 18), new n(this, continuation, 22));
    }
}

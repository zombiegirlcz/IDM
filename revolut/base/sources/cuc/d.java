package cuc;

import com.revolut.feature.security_hub.impl.network.LinkedWalletsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedWalletsService f108947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f108948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f108949c;
    public final a d;
    public final x4l.c e;

    public d(LinkedWalletsService service, ue0.c storage, ne0.j memoryCache, a linkedWalletsMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(linkedWalletsMapper, "linkedWalletsMapper");
        this.f108947a = service;
        this.f108948b = storage;
        this.f108949c = memoryCache;
        this.d = linkedWalletsMapper;
        Continuation continuation = null;
        this.e = new x4l.c(new b6a.d(this, continuation, 28), new cp7.k(this, 24), new cnc.t(this, 16), new co7.c(this, continuation, 6), new awd.b(this, continuation, 19));
    }
}

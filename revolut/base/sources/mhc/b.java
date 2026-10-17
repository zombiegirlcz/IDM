package mhc;

import com.revolut.feature.rewards.impl.data.network.services.ConciergeAlbertineService;
import k3c.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m84.e;
import m9d.y0;
import ne0.d;
import org.jetbrains.annotations.NotNull;
import ue0.c;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConciergeAlbertineService f205480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f205481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f205482c;
    public final x4l.c d;

    public b(ConciergeAlbertineService service, c storage, d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f205480a = service;
        this.f205481b = storage;
        this.f205482c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new k(this, continuation, 13), new m98.k(this, 21), new e(this, 18), new y0(this, continuation, 12), new l05.b(this, continuation, 14));
    }
}

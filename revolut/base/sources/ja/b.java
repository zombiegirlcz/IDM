package ja;

import com.feature.navigation.hub.impl.network.NavigationHubService;
import ecm.k0;
import iw6.l;
import j2c.n;
import j40.d;
import j82.q;
import j87.m;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import ue0.c;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f172399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavigationHubService f172400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f172401c;
    public final j d;
    public final x4l.c e;

    public b(k0 mapper, NavigationHubService service, c storage, j cache) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f172399a = mapper;
        this.f172400b = service;
        this.f172401c = storage;
        this.d = cache;
        Continuation continuation = null;
        this.e = new x4l.c(new l(this, continuation, 10), new m(this, 5), new n(this, 20), new q(this, continuation, 6), new d(this, continuation, 1));
    }
}

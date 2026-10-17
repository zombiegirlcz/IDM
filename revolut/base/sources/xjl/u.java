package xjl;

import au6.k0;
import bjl.p0;
import bjl.u0;
import com.revolut.sso.impl.network.services.UserActivityService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class u implements u0 {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f306582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f306583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f306584c;
    public final rqk.m d;
    public final UserActivityService e;
    public final x4l.c f;

    public u(ne0.j cache, ue0.c storage, p0 revolutSsoDependenciesProvider, rqk.m userInfoFromAppProvider, UserActivityService userActivityService) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(userInfoFromAppProvider, "userInfoFromAppProvider");
        Intrinsics.checkNotNullParameter(userActivityService, "userActivityService");
        this.f306582a = cache;
        this.f306583b = storage;
        this.f306584c = revolutSsoDependenciesProvider;
        this.d = userInfoFromAppProvider;
        this.e = userActivityService;
        Continuation continuation = null;
        this.f = new x4l.c(new wqj.g(this, continuation, 7), new ro7.n(this, 21), new k0(this, 10), new g(this, continuation, 1), new wvg.i(this, continuation, 16));
    }
}

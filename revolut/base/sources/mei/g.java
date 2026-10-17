package mei;

import com.revolut.feature_tiles_impl.repository.TilesService;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qe0.s;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TilesService f204691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f204692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f204693c;
    public final w4l.f d;

    public g(b80.c connectivityRepository, TilesService tilesService, ne0.d memoryCache, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        Intrinsics.checkNotNullParameter(tilesService, "tilesService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f204691a = tilesService;
        this.f204692b = memoryCache;
        this.f204693c = ((ze0.c) forceReloadStrategyFactory).b(180000L);
        this.d = new w4l.f(w.k0(connectivityRepository, new b(this, 0)), new b(this, 1), new m84.e(this, 12), null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}

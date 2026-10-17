package awd;

import a72.k;
import akl.e0;
import auj.o;
import av8.n;
import com.revolut.feature.staking.impl.service.products.v2.StakingProductsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingProductsService f10760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f10761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f10762c;
    public final he2.b d;
    public final x4l.c e;

    public c(StakingProductsService stakingProductsService, ue0.c storage, j memoryCache, he2.b stakingProductsMapper) {
        Intrinsics.checkNotNullParameter(stakingProductsService, "stakingProductsService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(stakingProductsMapper, "stakingProductsMapper");
        this.f10760a = stakingProductsService;
        this.f10761b = storage;
        this.f10762c = memoryCache;
        this.d = stakingProductsMapper;
        Continuation continuation = null;
        this.e = new x4l.c(new k(this, continuation, 17), new o(this, 11), new n(this, 2), new e0(this, continuation, 24), new b(this, continuation, 0));
    }
}

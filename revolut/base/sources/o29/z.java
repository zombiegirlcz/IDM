package o29;

import com.revolut.feature.lifestyle.core.impl.network.LifestyleHomeService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nfj.l1;
import nya.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifestyleHomeService f221593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f221594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f221595c;
    public final v d;
    public final x4l.c e;

    public z(LifestyleHomeService lifestyleHomeService, ne0.j memoryCache, ue0.c storage, v cacheKeyMapper) {
        Intrinsics.checkNotNullParameter(lifestyleHomeService, "lifestyleHomeService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cacheKeyMapper, "cacheKeyMapper");
        this.f221593a = lifestyleHomeService;
        this.f221594b = memoryCache;
        this.f221595c = storage;
        this.d = cacheKeyMapper;
        Continuation continuation = null;
        this.e = new x4l.c(new l(this, continuation, 1), new b0(this, 25), new nx2.f(this, 15), new nwc.f(this, continuation, 17), new l1(this, continuation, 11));
    }
}

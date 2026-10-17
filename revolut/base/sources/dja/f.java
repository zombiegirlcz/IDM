package dja;

import com.revolut.feature.product.lifecycle.data.ProductLifecycleService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements c {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f115266c;
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductLifecycleService f115267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eja.a f115268b;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f115266c = kotlin.time.c.g(5, pkm.e.SECONDS);
    }

    public f(ProductLifecycleService productLifecycleService, eja.a lifecycleProcessMapper) {
        Intrinsics.checkNotNullParameter(productLifecycleService, "productLifecycleService");
        Intrinsics.checkNotNullParameter(lifecycleProcessMapper, "lifecycleProcessMapper");
        this.f115267a = productLifecycleService;
        this.f115268b = lifecycleProcessMapper;
    }
}

package tw5;

import com.revolut.feature.cryptocommodity_invest.impl.network.CryptoTrendingService;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoTrendingService f274928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f274929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f274930c;

    public i(CryptoTrendingService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f274928a = service;
        this.f274929b = memoryCache;
        this.f274930c = storage;
    }
}

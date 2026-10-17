package l7h;

import com.revolut.feature.wealth.impl.data.network.mostowned.MostOwnedAssetsService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MostOwnedAssetsService f192641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k8h.f f192642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7h.a f192643c;
    public final b80.c d;

    public e(MostOwnedAssetsService service, k8h.f storage, b7h.a cache, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f192641a = service;
        this.f192642b = storage;
        this.f192643c = cache;
        this.d = networkStateRepository;
    }
}

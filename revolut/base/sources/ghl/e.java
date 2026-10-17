package ghl;

import com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.screener.ScreenerService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerService f144002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f144003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f144004c;

    public e(ScreenerService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f144002a = service;
        this.f144003b = memoryCache;
        this.f144004c = storage;
    }
}

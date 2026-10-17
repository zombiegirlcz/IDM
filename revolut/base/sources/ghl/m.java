package ghl;

import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.screener.ScreenerService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerService f144013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f144014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f144015c;

    public m(ScreenerService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f144013a = service;
        this.f144014b = memoryCache;
        this.f144015c = storage;
    }

    public static ScreenerCollection a(m mVar, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ne0.j jVar = mVar.f144014b;
        Companion.getClass();
        return (ScreenerCollection) jVar.get(k.a(key));
    }

    public static Unit b(m mVar, String key, ScreenerCollection collection) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(collection, "collection");
        ne0.j jVar = mVar.f144014b;
        Companion.getClass();
        jVar.f(k.a(key), collection);
        return Unit.f186387a;
    }
}

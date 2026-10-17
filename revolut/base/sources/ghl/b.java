package ghl;

import com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.curated_collections.CuratedCollectionsService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CuratedCollectionsService f143997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f143998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f143999c;

    public b(CuratedCollectionsService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f143997a = service;
        this.f143998b = memoryCache;
        this.f143999c = storage;
    }

    public static String a(String str) {
        return j6.a.q("CURATED_COLLECTION_KEY_", str);
    }
}

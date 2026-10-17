package ghl;

import com.google.gson.reflect.TypeToken;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.screener.ScreenerService;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    @NotNull
    public static final h Companion = new h();
    public static final Type e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerService f144008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f144009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f144010c;
    public final i d;

    static {
        Type type = new TypeToken<List<? extends String>>() { // from class: com.revolut.shared.feature.wealth_discovery.domain.impl.data.dods.ScreenerSearchDodProvider$Companion$INDEX_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        e = type;
    }

    public j(ScreenerService service, ne0.j memoryCache, ue0.c storage, i keyMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(keyMapper, "keyMapper");
        this.f144008a = service;
        this.f144009b = memoryCache;
        this.f144010c = storage;
        this.d = keyMapper;
    }
}

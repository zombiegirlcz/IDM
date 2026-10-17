package y6h;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Type f311291c = new TypeToken<b>() { // from class: com.revolut.feature.wealth.impl.data.cache.collections.CollectionPerformanceStorage$Companion$COLLECTION_PERFORMANCE_CHART_TYPE$1
    }.getType();
    public static final Type d = new TypeToken<List<? extends e>>() { // from class: com.revolut.feature.wealth.impl.data.cache.collections.CollectionPerformanceStorage$Companion$COLLECTION_PERFORMANCES_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f311292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f311293b;

    public g(ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f311292a = memoryCache;
        this.f311293b = storage;
    }
}

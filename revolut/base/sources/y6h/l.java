package y6h;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Type f311303c = new TypeToken<j>() { // from class: com.revolut.feature.wealth.impl.data.cache.collections.CollectionQuoteStorage$Companion$COLLECTION_QUOTE_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f311304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f311305b;

    public l(ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f311304a = memoryCache;
        this.f311305b = storage;
    }
}

package uy1;

import com.revolut.feature.apm.core.impl.data.network.alias.AliasService;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasService f284032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f284033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yk0.a f284034c;
    public final xe0.f d;
    public final je0.d e;

    public b(AliasService service, ne0.j memoryCache, yk0.a databaseSessionProvider, xe0.f storageFactory, je0.d objectMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        this.f284032a = service;
        this.f284033b = memoryCache;
        this.f284034c = databaseSessionProvider;
        this.d = storageFactory;
        this.e = objectMapper;
    }

    public final j a(zz1.h aliasSystem) {
        Intrinsics.checkNotNullParameter(aliasSystem, "aliasSystem");
        String lowerCase = aliasSystem.f326492a.toLowerCase(Locale.ROOT);
        return new j(aliasSystem, this.f284032a, xe0.f.f(this.d, this.f284034c, t61.a.p(lowerCase, "toLowerCase(...)", "apm_storage_", lowerCase), this.e, 1, null, 48), this.f284033b);
    }
}

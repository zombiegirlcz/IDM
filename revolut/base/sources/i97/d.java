package i97;

import com.revolut.feature.globalsearch.impl.data.GlobalSearchService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlobalSearchService f159588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fd0.d f159589b;

    public d(GlobalSearchService service, fd0.d memoryCache, c97.i sourceIdentifierParser) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(sourceIdentifierParser, "sourceIdentifierParser");
        this.f159588a = service;
        this.f159589b = memoryCache;
    }
}

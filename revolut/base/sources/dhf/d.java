package dhf;

import ehf.g;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zsc.k;
import zsc.m;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f114809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8b.a f114810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.c f114811c;
    public final f01.c d;
    public final t70.b e;

    public d(e dateProvider, n8b.a countryInteractor, thf.c transactionCategoryResourcesMapper, f01.c uiKitResources, t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        this.f114809a = dateProvider;
        this.f114810b = countryInteractor;
        this.f114811c = transactionCategoryResourcesMapper;
        this.d = uiKitResources;
        this.e = currenciesLocalization;
    }

    public final k a(m query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new k(v.k(new ehf.a(query), new ehf.b(query, this.f114811c), new ehf.c(query), new ehf.d(query, this.f114810b), new ehf.e(query), new g(query, this.d, this.e)));
    }
}

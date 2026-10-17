package zkh;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class o0 implements z87.d {

    @NotNull
    public static final n0 Companion = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dlh.a f323021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f323022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r39.a f323023c;
    public final o97.r d;

    public o0(dlh.a recentlyViewedMapper, l0 recentlyViewedSearchDataProvider, r39.a performanceAssetDestinationProvider) {
        Intrinsics.checkNotNullParameter(recentlyViewedMapper, "recentlyViewedMapper");
        Intrinsics.checkNotNullParameter(recentlyViewedSearchDataProvider, "recentlyViewedSearchDataProvider");
        Intrinsics.checkNotNullParameter(performanceAssetDestinationProvider, "performanceAssetDestinationProvider");
        this.f323021a = recentlyViewedMapper;
        this.f323022b = recentlyViewedSearchDataProvider;
        this.f323023c = performanceAssetDestinationProvider;
        this.d = o97.r.WEALTH_ASSETS_RECENTLY_VIEWED;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!kotlin.text.d0.W(searchQuery)) {
            return zi0.c.j(zhm.u.c(new o97.e0(zhm.f0.f322471a)));
        }
        efm.r map = rd0.e.c(this.f323022b.a(), kotlin.coroutines.g.f186406a).map(new zii.e(new m0(this, 0), 19));
        Intrinsics.h(map);
        return map;
    }

    @Override // z87.f
    public final o97.r h() {
        return this.d;
    }

    @Override // z87.f
    public final Object l(String str, o97.y yVar, Continuation continuation) {
        Object obj2 = yVar.f223136b;
        vel.f fVar = obj2 instanceof vel.f ? (vel.f) obj2 : null;
        return fVar == null ? o97.e.f223096a : new o97.d(this.f323023c.d(fVar));
    }
}

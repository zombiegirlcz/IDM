package mc2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends yji.n implements e12.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final iz1.n f204247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a12.h f204248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f204249n;

    public b(iz1.n draftsRepository, a12.h draftsMapper, c draftsNavigationProvider) {
        Intrinsics.checkNotNullParameter(draftsRepository, "draftsRepository");
        Intrinsics.checkNotNullParameter(draftsMapper, "draftsMapper");
        Intrinsics.checkNotNullParameter(draftsNavigationProvider, "draftsNavigationProvider");
        this.f204247l = draftsRepository;
        this.f204248m = draftsMapper;
        this.f204249n = draftsNavigationProvider;
    }
}

package g3e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kye.e f140274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2e.e f140275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f140276c;
    public final ihm.f d;
    public final ihm.f e;

    public i(kye.e storeExclusivesInteractor, g2e.e filtersStateRepository, yk0.d schedulerProvider) {
        Intrinsics.checkNotNullParameter(storeExclusivesInteractor, "storeExclusivesInteractor");
        Intrinsics.checkNotNullParameter(filtersStateRepository, "filtersStateRepository");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        this.f140274a = storeExclusivesInteractor;
        this.f140275b = filtersStateRepository;
        this.f140276c = j6.a.h("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
    }
}

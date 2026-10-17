package y2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2e.a f310649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2e.b f310650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f310651c;
    public final ihm.f d;
    public final ihm.f e;

    public m(l2e.a storeBrandsInteractor, g2e.b filtersStateRepository, yk0.d schedulerProvider) {
        Intrinsics.checkNotNullParameter(storeBrandsInteractor, "storeBrandsInteractor");
        Intrinsics.checkNotNullParameter(filtersStateRepository, "filtersStateRepository");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        this.f310649a = storeBrandsInteractor;
        this.f310650b = filtersStateRepository;
        this.f310651c = j6.a.h("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
    }
}

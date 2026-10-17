package ve1;

import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nd1.c f288107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f288108q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p stateMapper, nd1.c catalogueInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(catalogueInteractor, "catalogueInteractor");
        this.f288107p = catalogueInteractor;
        this.f288108q = new d(0);
    }

    @Override // jki.g
    public final i r2() {
        return this.f288108q;
    }
}

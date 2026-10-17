package hb0;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends oki.h implements i {
    public final gb0.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qa0.b f150545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f150546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f150547r;

    public k(ac4.g stateMapper, gb0.a pagingExtension, qa0.b externalNavigationExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pagingExtension, "pagingExtension");
        Intrinsics.checkNotNullParameter(externalNavigationExtension, "externalNavigationExtension");
        this.o = pagingExtension;
        this.f150545p = externalNavigationExtension;
        this.f150546q = mra.d.b(this, new g(null), stateMapper, null, false, 12);
        this.f150547r = new j(this, 0);
    }

    @Override // yji.l
    public final void I1() {
        gb0.f fVar = (gb0.f) this.o;
        fVar.getClass();
        j storage = this.f150547r;
        Intrinsics.checkNotNullParameter(storage, "storage");
        fVar.f142212q = storage;
        m70.a.c(t0.f186434a);
        fVar.b3("");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f150546q;
    }
}

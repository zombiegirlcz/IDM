package y2e;

import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends oki.h implements g {
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l2e.a f310655p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g2e.b f310656q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wn.a f310657r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f310658s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ihm.f f310659t;

    public s(t stateMapper, k storeBrandsPagingInteractor, l2e.a storeBrandsInteractor, g2e.b filtersStateRepository, wn.a adsTrackingControllerModelExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(storeBrandsPagingInteractor, "storeBrandsPagingInteractor");
        Intrinsics.checkNotNullParameter(storeBrandsInteractor, "storeBrandsInteractor");
        Intrinsics.checkNotNullParameter(filtersStateRepository, "filtersStateRepository");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        this.o = storeBrandsPagingInteractor;
        this.f310655p = storeBrandsInteractor;
        this.f310656q = filtersStateRepository;
        this.f310657r = adsTrackingControllerModelExtension;
        this.f310658s = mra.d.b(this, new a(((g2e.c) filtersStateRepository).a(), 7), stateMapper, null, false, 12);
        this.f310659t = v0.a.d("create(...)");
    }

    @Override // yji.l
    public final void I1() {
        efm.r rVarFilter = ((m) this.o).f310651c.hide().filter(new y25.c(new y25.d(1), 5));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(rVarFilter), null, null, new r(this, continuation, 0), 3);
        yji.l.a1(this, this.f310655p.b(w4l.h.f294642c), null, null, new r(this, continuation, 1), 3);
        yji.l.a1(this, vkm.q.q(vkm.q.h(((g2e.c) this.f310656q).f139974a)), null, null, new r(this, continuation, 2), 3);
        l2(new xb4.e(this, null, 21), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f310658s;
    }
}

package q49;

import cli.n;
import cli.y;
import ix0.p0;
import kbb.o;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends oki.h implements d {
    public final ftb.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ekg.g f242089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p0 f242090q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f242091r;

    public h(n stateMapper, ftb.c provider, ekg.g uiPersonalisationInteractor, p0 maxItemsCountProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(maxItemsCountProvider, "maxItemsCountProvider");
        this.o = provider;
        this.f242089p = uiPersonalisationInteractor;
        this.f242090q = maxItemsCountProvider;
        this.f242091r = mra.d.b(this, new c(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, ((o) this.o).c(), null, null, new g(this, null), 3);
        H2(this.f242091r, new q03.h(this, 22));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f242091r;
    }
}

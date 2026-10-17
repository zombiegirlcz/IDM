package yg5;

import cli.y;
import e7l.g;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wli.x;
import yed.g0;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends oki.h implements k {

    @NotNull
    private static final o Companion = new o();
    public final fk3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nw5.j f313540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vg5.c f313541q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mg5.a f313542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vh5.a f313543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wsg.b f313544t;
    public final x u;
    public final f80.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f313545w;

    public u(fk3.a configurationInteractor, nw5.j cryptoStatsInteractor, vg5.c assetSorter, mg5.a cryptoGiftAssetRepository, vh5.a cryptoPermissionModelExtension, wsg.b newWalletsInteractor, x deeplinkHandler, f80.a uriHelper, n stateMapper) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(cryptoStatsInteractor, "cryptoStatsInteractor");
        Intrinsics.checkNotNullParameter(assetSorter, "assetSorter");
        Intrinsics.checkNotNullParameter(cryptoGiftAssetRepository, "cryptoGiftAssetRepository");
        Intrinsics.checkNotNullParameter(cryptoPermissionModelExtension, "cryptoPermissionModelExtension");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = configurationInteractor;
        this.f313540p = cryptoStatsInteractor;
        this.f313541q = assetSorter;
        this.f313542r = cryptoGiftAssetRepository;
        this.f313543s = cryptoPermissionModelExtension;
        this.f313544t = newWalletsInteractor;
        this.u = deeplinkHandler;
        this.v = uriHelper;
        this.f313545w = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, nim.a.v(new yc7.h(u0.m(nim.a.v(rd0.e.b(((ik3.c) this.o).l(g.b.f123407a, w4l.h.f294642c)), new ye1.m(16)), rd0.e.b(this.f313540p.a(true))), 2), new g0(this, 5)), null, null, new q(this, null, 0), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        qg5.c cVar = (qg5.c) this.f313542r;
        cVar.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.b1(this, cVar.f245653c.a(Unit.f186387a, loadingStrategy), null, new q(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f313545w;
    }
}

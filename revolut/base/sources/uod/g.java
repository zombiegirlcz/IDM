package uod;

import cli.y;
import cli.z;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.share.TripsShareContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ks0.n;
import org.jetbrains.annotations.NotNull;
import w4l.j;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends oki.h implements z {

    @NotNull
    public static final f Companion = new f();
    public final TripsShareContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nad.c f281633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f281634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fmc.z f281635r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f281636s;

    public g(TripsShareContract$InputData inputData, nad.c shareMediaInteractor, n globeResourcesInteractor, fmc.z tripsCountriesProvider, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shareMediaInteractor, "shareMediaInteractor");
        Intrinsics.checkNotNullParameter(globeResourcesInteractor, "globeResourcesInteractor");
        Intrinsics.checkNotNullParameter(tripsCountriesProvider, "tripsCountriesProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f281633p = shareMediaInteractor;
        this.f281634q = globeResourcesInteractor;
        this.f281635r = tripsCountriesProvider;
        this.f281636s = mra.d.b(this, new a(inputData.f87640b, inputData.f87639a, inputData.f87641c, null, f0.f322471a, null, Integer.valueOf(inputData.e)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new uea.e(this, continuation, 17), new yi5.b(26));
        l.a1(this, mo3.a.g(this.f281634q.c(this.o.d, j.f294644c), null, new uj8.j(24), 1), null, null, new uf0.d(this, continuation, 28), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f281636s;
    }
}

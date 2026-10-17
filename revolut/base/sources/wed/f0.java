package wed;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreenContract$SharedAlertsScreenConfiguration;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsConfiguration;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import vkm.z1;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 extends jki.g implements q {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SharedAlertsScreenContract$InputData f296725p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f296726q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final efd.a f296727r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ghd.c f296728s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n3d.c f296729t;
    public final g1 u;
    public final ped.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f296730w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z1 f296731x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z1 f296732y;
    public final a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(SharedAlertsScreenContract$InputData inputData, j60.a bottomDialog, efd.a alertsInteractor, ghd.c watchlistDialogFactory, jki.p stateMapper, n3d.c watchlistFooterDelegate, g1 shotDialogDisplayer, ped.a alertsDialogFactory) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(alertsInteractor, "alertsInteractor");
        Intrinsics.checkNotNullParameter(watchlistDialogFactory, "watchlistDialogFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(watchlistFooterDelegate, "watchlistFooterDelegate");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(alertsDialogFactory, "alertsDialogFactory");
        this.f296725p = inputData;
        this.f296726q = bottomDialog;
        this.f296727r = alertsInteractor;
        this.f296728s = watchlistDialogFactory;
        this.f296729t = watchlistFooterDelegate;
        this.u = shotDialogDisplayer;
        this.v = alertsDialogFactory;
        SharedAlertsScreenContract$SharedAlertsScreenConfiguration sharedAlertsScreenContract$SharedAlertsScreenConfiguration = inputData.f86721a;
        Set set = sharedAlertsScreenContract$SharedAlertsScreenConfiguration.f86723a;
        Set set2 = sharedAlertsScreenContract$SharedAlertsScreenConfiguration.f86724b;
        mgd.d dVar = sharedAlertsScreenContract$SharedAlertsScreenConfiguration.f86725c;
        zhm.f0 f0Var = zhm.f0.f322471a;
        this.f296730w = new l(set, set2, set, dVar, f0Var, r0.g(), r0.g(), false, f0Var);
        ukm.f fVar = ukm.f.DROP_OLDEST;
        this.f296731x = vkm.q.b(0, 2, fVar);
        this.f296732y = vkm.q.b(0, 2, fVar);
        this.z = new a();
    }

    public static void y2(f0 f0Var, AssetIdWithSymbol assetIdWithSymbol, FavouritesAssetTypeKey favouritesAssetTypeKey, int i) {
        Continuation continuation = null;
        if ((i & 1) != 0) {
            assetIdWithSymbol = null;
        }
        if ((i & 2) != 0) {
            favouritesAssetTypeKey = null;
        }
        f0Var.n2(new w3k.i(f0Var, new vx9.v(f0Var, 13, favouritesAssetTypeKey, assetIdWithSymbol), continuation, 24), new whi.b(6));
    }

    @Override // yji.l
    public final void T1(long j2) {
        SharedAlertsConfiguration.Action action;
        Continuation continuation = null;
        if (!((l) t2()).f296746h && (action = this.f296725p.f86721a.d) != null) {
            x2(new s(this, 2));
            if (!(action instanceof SharedAlertsConfiguration.Action.CreateAlert)) {
                throw new NoWhenBranchMatchedException();
            }
            y2(this, ((SharedAlertsConfiguration.Action.CreateAlert) action).f86771a, null, 2);
        }
        w wVar = new w(0, continuation, this);
        z1 z1Var = this.f296731x;
        wkm.l lVarQ = vkm.q.Q(z1Var, wVar);
        z1 z1Var2 = this.f296732y;
        yji.l.b1(this, vkm.q.Q(yh5.b.d(lVarQ, vkm.q.q(z1Var2)), new w(1, continuation, this)), null, new x(0, continuation, this), 3);
        yji.l.b1(this, this.f296729t.b(((l) t2()).f296743b), null, new x(1, continuation, this), 3);
        yji.l.b1(this, rd0.e.b(this.f296726q.E()), null, new x(3, continuation, this), 3);
        int i = 2;
        yji.l.b1(this, vkm.q.Q(vkm.q.q(new vy5.d0(q2(), 4)), new w(i, continuation, this)), null, new x(i, continuation, this), 3);
        yji.l.b1(this, t1.d(z1Var2, 10000L), null, new x(4, continuation, this), 3);
        z1Var.k(Unit.f186387a);
        z1Var2.k(w4l.i.f294643c);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f296730w;
    }

    @Override // jki.g
    public final kki.a s2() {
        return this.z;
    }
}

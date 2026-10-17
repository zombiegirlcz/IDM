package g3e;

import cli.y;
import com.revolut.feature.rev_points.exclusive_store.api.navigation.RevPointsExclusiveStoreProductDestination;
import com.revolut.feature.store.api.model.StoreExclusivesOfferContext;
import fo1.b0;
import g1i.i0;
import g2e.d0;
import g2e.e0;
import g2e.n0;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends oki.h implements b {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kye.e f140284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g2e.e f140285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f140286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wn.a f140287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f140288t;
    public final ihm.f u;

    public r(u stateMapper, f storeExclusivesPagingInteractor, kye.e storeExclusivesInteractor, g2e.e filtersStateRepository, x deeplinkHandler, wn.a adsTrackingControllerModelExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(storeExclusivesPagingInteractor, "storeExclusivesPagingInteractor");
        Intrinsics.checkNotNullParameter(storeExclusivesInteractor, "storeExclusivesInteractor");
        Intrinsics.checkNotNullParameter(filtersStateRepository, "filtersStateRepository");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        this.o = storeExclusivesPagingInteractor;
        this.f140284p = storeExclusivesInteractor;
        this.f140285q = filtersStateRepository;
        this.f140286r = deeplinkHandler;
        this.f140287s = adsTrackingControllerModelExtension;
        this.f140288t = mra.d.b(this, new a(7, (Set) filtersStateRepository.f139981a.getValue()), stateMapper, null, false, 12);
        this.u = v0.a.d("create(...)");
    }

    @Override // yji.l
    public final void I1() {
        efm.r rVarFilter = ((i) this.o).f140276c.hide().filter(new i0(15, new h(1)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(rVarFilter), null, null, new q(this, continuation, 0), 3);
        kye.e eVar = this.f140284p;
        eVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        n0 n0Var = (n0) eVar.f190729b;
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, n0Var.e.b(new e0(n0Var.d.z()), loadingStrategy), null, null, new q(this, continuation, 1), 3);
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, n0Var.f.b(new d0(n0Var.d.z()), loadingStrategy), null, null, new q(this, continuation, 2), 3);
        yji.l.a1(this, vkm.q.h(this.f140285q.f139981a), null, null, new q(this, continuation, 3), 3);
        l2(new b0(this, continuation, 13), new yi5.b(26));
    }

    public final void I2(Object obj2) {
        String str;
        Continuation continuation = null;
        m2e.b bVar = obj2 instanceof m2e.b ? (m2e.b) obj2 : null;
        if (bVar == null) {
            return;
        }
        this.f140287s.Z2(bVar);
        Object obj3 = bVar.f201957a;
        StoreExclusivesOfferContext storeExclusivesOfferContext = obj3 instanceof StoreExclusivesOfferContext ? (StoreExclusivesOfferContext) obj3 : null;
        if (storeExclusivesOfferContext == null) {
            return;
        }
        if (storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.Product) {
            str = ((StoreExclusivesOfferContext.Product) storeExclusivesOfferContext).f88515a.f88575c;
        } else {
            if (!(storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.Auction) && !(storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.SoldOutProduct) && !(storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.LockedProduct) && !(storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.ComingSoonProduct)) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        if (str != null) {
            l2(new g1k.i(this, str, continuation, 4), new yi5.b(26));
        } else {
            C1(new RevPointsExclusiveStoreProductDestination(u3e.a.b(storeExclusivesOfferContext)));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f140288t;
    }
}

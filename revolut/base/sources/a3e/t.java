package a3e;

import cli.y;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig;
import com.revolut.feature.store.api.model.StoreDealsOfferContext;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.kompot.common.ExternalDestination;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import vkm.j2;
import wli.x;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends oki.h implements f {
    public final t1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c3e.f f1120p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c3e.c f1121q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f1122r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wn.a f1123s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s70.a f1124t;
    public final y u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ihm.f f1125w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a2 f1126x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a2 f1127y;
    public boolean z;

    public t(u stateMapper, t1 storeDealsInteractor, c3e.f dealsLocationInteractor, c3e.c discoverMorePagingInteractor, x deeplinkHandler, wn.a adsTrackingControllerModelExtension, s70.a intentProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(storeDealsInteractor, "storeDealsInteractor");
        Intrinsics.checkNotNullParameter(dealsLocationInteractor, "dealsLocationInteractor");
        Intrinsics.checkNotNullParameter(discoverMorePagingInteractor, "discoverMorePagingInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.o = storeDealsInteractor;
        this.f1120p = dealsLocationInteractor;
        this.f1121q = discoverMorePagingInteractor;
        this.f1122r = deeplinkHandler;
        this.f1123s = adsTrackingControllerModelExtension;
        this.f1124t = intentProvider;
        this.u = mra.d.b(this, new c(0), stateMapper, null, false, 12);
        this.v = new vii.b(w4l.h.f294642c);
        this.f1125w = v0.a.d("create(...)");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.v, new a0e.m(continuation, this, 5)), null, null, new r(this, continuation, 0), 3);
        yji.l.a1(this, rd0.e.b(this.f1121q.f20940b), null, null, new r(this, continuation, 1), 3);
        a2 a2Var = this.f1127y;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f1127y = l2(new q(this, null), new yi5.b(26));
    }

    public final void I2() {
        f3e.h hVar = ((c) ((j2) this.u.f22677a).getValue()).f1104b;
        co3.a aVar = null;
        if ((hVar instanceof f3e.g) && ((f3e.g) hVar).f131969a) {
            this.z = true;
            C1(new ExternalDestination.ByIntent(((s70.b) this.f1124t).c(), null));
            return;
        }
        f3e.f fVar = hVar instanceof f3e.f ? (f3e.f) hVar : null;
        if (fVar != null) {
            f3e.c cVar = fVar.f131968a;
            aVar = new co3.a(cVar.f131961a, cVar.f131962b);
        }
        C1(u0.c(new ShopsFeatureConfig.Map(aVar)));
    }

    public final void J2(m2e.b bVar) {
        this.f1123s.Z2(bVar);
        Object obj2 = bVar.f201957a;
        Continuation continuation = null;
        StoreDealsOfferContext storeDealsOfferContext = obj2 instanceof StoreDealsOfferContext ? (StoreDealsOfferContext) obj2 : null;
        if (storeDealsOfferContext instanceof StoreDealsOfferContext.Mega) {
            StoreMegaOffer storeMegaOffer = ((StoreDealsOfferContext.Mega) storeDealsOfferContext).f88487a;
            C2(new d(storeMegaOffer.f88547a, storeMegaOffer));
        } else if (storeDealsOfferContext instanceof StoreDealsOfferContext.Deeplink) {
            l2(new p(this, ((StoreDealsOfferContext.Deeplink) storeDealsOfferContext).f88486a.f88503a, continuation, 0), new yi5.b(26));
        } else if (storeDealsOfferContext != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (!this.z) {
            this.v.a();
            return;
        }
        this.z = false;
        a2 a2Var = this.f1127y;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f1127y = l2(new q(this, null), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}

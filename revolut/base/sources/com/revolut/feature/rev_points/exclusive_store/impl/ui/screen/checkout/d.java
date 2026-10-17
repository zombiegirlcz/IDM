package com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout;

import cli.n;
import cli.y;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.RevPointsExclusiveStoreProductCheckoutScreenContract$Step;
import i4b.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nyb.k;
import oki.h;
import or4.i;
import ou6.o;
import ovb.e;
import ovb.j;
import ovb.l;
import ovb.m;
import vkm.q;
import vkm.q0;
import yki.g;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends h implements ovb.h, g {
    public final RevPointsExclusiveStoreProductCheckoutScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ivb.h f83605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f83606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f83607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i90.b f83608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ang.f f83609t;
    public final wub.a u;
    public final lvb.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final mre.c f83610w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vii.b f83611x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f83612y;
    public final yki.a z;

    public d(n stateMapper, RevPointsExclusiveStoreProductCheckoutScreenContract$InputData inputData, ivb.h exclusiveStoreRepository, f storeProductInteractor, k revPointsInteractor, i90.b uuidUtils, ang.f userInteractor, wub.a revPointsBuyingFeatureInteractor, lvb.c countryPickerControllerInteractor, mre.c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(exclusiveStoreRepository, "exclusiveStoreRepository");
        Intrinsics.checkNotNullParameter(storeProductInteractor, "storeProductInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(revPointsBuyingFeatureInteractor, "revPointsBuyingFeatureInteractor");
        Intrinsics.checkNotNullParameter(countryPickerControllerInteractor, "countryPickerControllerInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.o = inputData;
        this.f83605p = exclusiveStoreRepository;
        this.f83606q = storeProductInteractor;
        this.f83607r = revPointsInteractor;
        this.f83608s = uuidUtils;
        this.f83609t = userInteractor;
        this.u = revPointsBuyingFeatureInteractor;
        this.v = countryPickerControllerInteractor;
        this.f83610w = termsNavigationFactory;
        this.f83611x = new vii.b();
        this.f83612y = mra.d.b(this, new e(0), stateMapper, null, false, 12);
        i iVar = new i(this, 10);
        this.z = cp5.d.a(this, RevPointsExclusiveStoreProductCheckoutScreenContract$Step.AddressUpdate.f83597a, f0.f322471a, iVar);
    }

    @Override // yji.l
    public final void I1() {
        H2(this.f83612y, new j(this, 0));
        Continuation continuation = null;
        l lVar = new l(0, this, continuation);
        vii.b bVar = this.f83611x;
        yji.l.b1(this, q.Q(new q0(q.Q(bVar, lVar), new m(0, this, continuation), 1), new l(1, this, continuation)), null, new m(1, this, continuation), 3);
        yji.l.a1(this, nim.a.v(q.Q(bVar, new l(2, this, continuation)), new o(12)), null, null, new osk.m(this, continuation, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f83612y;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.z;
    }
}

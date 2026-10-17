package com.revolut.feature.shops.impl.ui.map_view;

import cli.n;
import cli.y;
import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import com.revolut.feature.shops.impl.ui.map_view.ShopsMapViewScreenContract$Step;
import jid.r;
import jid.t;
import jid.v;
import kjd.j;
import kjd.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oid.e0;
import oid.g0;
import oid.h0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import yji.l;
import yki.g;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends h implements j, g {

    @NotNull
    public static final o Companion = new o();
    public final h0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h4g.g f87234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f87235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wn.a f87236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ShopsMapViewScreenContract$InputData f87237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f87238t;
    public final y u;

    public e(h0 shopsOutletsRepository, h4g.g shopsFeatureAvailabilityInteractor, v shopsLocationInteractor, wn.a adsTrackingControllerModelExtension, ShopsMapViewScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(shopsOutletsRepository, "shopsOutletsRepository");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(shopsLocationInteractor, "shopsLocationInteractor");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = shopsOutletsRepository;
        this.f87234p = shopsFeatureAvailabilityInteractor;
        this.f87235q = shopsLocationInteractor;
        this.f87236r = adsTrackingControllerModelExtension;
        this.f87237s = inputData;
        kj4.c cVar = new kj4.c(this, 3);
        this.f87238t = cp5.d.a(this, ShopsMapViewScreenContract$Step.LocationPermissions.f87221a, f0.f322471a, cVar);
        this.u = mra.d.b(this, new b(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        jck.y yVar = new jck.y(this.f87234p.e(), 18);
        y yVar2 = this.u;
        H2(yVar2, yVar);
        if (this.f87237s.f87220a != null) {
            H2(yVar2, new kjd.n(this, 0));
        } else {
            l2(new d(this, null), new yi5.b(26));
        }
    }

    public final void I2() {
        co3.a aVar;
        g0 g0Var;
        y yVar = this.u;
        t tVar = ((b) ((j2) yVar.f22677a).getValue()).f87226a;
        Continuation continuation = null;
        r rVar = tVar instanceof r ? (r) tVar : null;
        if (rVar == null || (aVar = rVar.f174451a) == null) {
            return;
        }
        oid.f0 f0Var = new oid.f0(aVar.f25486a, aVar.f25487b);
        ah0.b bVar = ((b) ((j2) yVar.f22677a).getValue()).f;
        if (bVar != null) {
            GmsLatLngBounds gmsLatLngBounds = (GmsLatLngBounds) bVar;
            g0Var = new g0(gmsLatLngBounds.c().f4847a, gmsLatLngBounds.c().f4848b, gmsLatLngBounds.b().f4847a, gmsLatLngBounds.b().f4848b);
        } else {
            g0Var = null;
        }
        e0 outletsParams = new e0(f0Var, g0Var, 4);
        h0 h0Var = this.o;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter("ShopsMap", "source");
        Intrinsics.checkNotNullParameter(outletsParams, "outletsParams");
        l.a1(this, rd0.e.b(nim.a.w(h0Var.d.e(outletsParams, w4l.h.f294642c), new o23.l("ShopsMap", 18))), null, null, new kae.d(this, continuation, 14), 3);
    }

    public final void J2(boolean z) {
        y yVar = this.u;
        t tVar = ((b) ((j2) yVar.f22677a).getValue()).f87226a;
        r rVar = tVar instanceof r ? (r) tVar : null;
        if (rVar != null) {
            H2(yVar, new gae.a(rVar.f174451a, z, 26));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f87238t;
    }
}

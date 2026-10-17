package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common;

import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.SmartEstimationBottomSheetContract$Variant;
import egk.e;
import ffk.t;
import hha.u;
import hha.w0;
import hha.x;
import hha.y;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import jla.h;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rrd.l;
import rrd.m;
import tsj.g;
import w4l.k;
import yji.n;
import zh9.u0;
import zhm.f0;
import zi0.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends n {

    @NotNull
    private static final m Companion = new m();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Set f87951p;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f87952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f87953m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f87954n;
    public final e o;

    static {
        y[] elements = {y.ENABLED, y.LOCKED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f87951p = d.y0(elements);
    }

    public a(t pricingPlanInteractor, g customAssetsInteractor, h productCatalogueInteractor, e pricingPlansUiInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(customAssetsInteractor, "customAssetsInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(pricingPlansUiInteractor, "pricingPlansUiInteractor");
        this.f87952l = pricingPlanInteractor;
        this.f87953m = customAssetsInteractor;
        this.f87954n = productCatalogueInteractor;
        this.o = pricingPlansUiInteractor;
    }

    public static int Z2(hha.d dVar) {
        u.Companion.getClass();
        if (b3(dVar, u.f152359q)) {
            return 20;
        }
        if (b3(dVar, u.f152360r)) {
            return 10;
        }
        if (b3(dVar, u.f152361s)) {
            return 8;
        }
        if (b3(dVar, u.f152362t)) {
            return 4;
        }
        return b3(dVar, u.u) ? 2 : 0;
    }

    public static boolean b3(hha.d dVar, u uVar) {
        List<x> list = dVar.e;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (x xVar : list) {
            if (xVar.f152369a.equals(uVar) && f87951p.contains(xVar.f152370b)) {
                return true;
            }
        }
        return false;
    }

    public final akg.n c3(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        t tVar = this.f87952l;
        return nim.a.v(u0.j(rd0.e.b(tVar.q()), this.f87953m.f(loadingStrategy), rd0.e.b(c.G(((wik.t) this.o).d(), Boolean.FALSE)), rd0.e.b(c.G(tVar.n(), f0.f322471a))), new l(this, 0));
    }

    public final void d3(SmartEstimationAccess access) {
        Intrinsics.checkNotNullParameter(access, "access");
        boolean z = access.f87948g;
        boolean z3 = access.f87950j;
        int i = access.f87947c;
        w0 w0Var = access.f87945a;
        r2().M0(new yrd.c(z ? new SmartEstimationBottomSheetContract$Variant.FreeInfo(access.d) : access.f87949h ? new SmartEstimationBottomSheetContract$Variant.OutOfAssets(w0Var, i, z3) : new SmartEstimationBottomSheetContract$Variant.Remaining(w0Var, access.f, i, z3), access.e));
    }

    public final void e3(SmartEstimationAccess access) {
        Intrinsics.checkNotNullParameter(access, "access");
        r2().M0(new yrd.c(access.f87948g ? new SmartEstimationBottomSheetContract$Variant.FreeInfo(access.d) : new SmartEstimationBottomSheetContract$Variant.OutOfAssets(access.f87945a, access.f87947c, access.f87950j), access.e));
    }
}

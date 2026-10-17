package com.revolut.feature.credit.impl.ui.entry_points;

import a35.q;
import al4.p;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.api.entry_points.CreditApplicationPrimaryEntryPoint;
import com.revolut.feature.credit.api.navigation.ProductGroupDestination;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.impl.ui.entry_points.CreditEntryPointsControllerContract$Configuration;
import ft3.a1;
import g1k.k;
import g35.f;
import g35.g;
import g35.i;
import g35.m;
import g35.o;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import rd0.e;
import w4l.j;
import xo8.i0;
import xq3.w;
import xr3.b0;
import xr3.f0;
import yji.l;
import yp3.b;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements f {

    @NotNull
    private static final m Companion = new m();
    public final CreditEntryPointsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f70060p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gz3.a f70061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f70062r;

    public a(CreditEntryPointsControllerContract$InputData inputData, o creditPrimaryEntryPointProvider, gz3.a startCreditApplicationNavigationDestinationProvider, n stateMapper) {
        g gVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditPrimaryEntryPointProvider, "creditPrimaryEntryPointProvider");
        Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f70060p = creditPrimaryEntryPointProvider;
        this.f70061q = startCreditApplicationNavigationDestinationProvider;
        CreditEntryPointsControllerContract$Configuration creditEntryPointsControllerContract$Configuration = inputData.f70058a;
        if (creditEntryPointsControllerContract$Configuration instanceof CreditEntryPointsControllerContract$Configuration.All) {
            gVar = new g(new TextLocalisedClause(R$string.credit_get_credit_toolbar_title, null, null, 14), new Data(null, null, true, 3, null));
        } else {
            if (!(creditEntryPointsControllerContract$Configuration instanceof CreditEntryPointsControllerContract$Configuration.Specified)) {
                throw new NoWhenBranchMatchedException();
            }
            CreditEntryPointsControllerContract$Configuration.Specified specified = (CreditEntryPointsControllerContract$Configuration.Specified) creditEntryPointsControllerContract$Configuration;
            gVar = new g(specified.f70056a, new Data(specified.f70057b, null, false, 6, null));
        }
        this.f70062r = d.b(this, gVar, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        if (this.o.f70058a instanceof CreditEntryPointsControllerContract$Configuration.All) {
            I2();
        }
    }

    public final void I2() {
        o oVar = this.f70060p;
        akg.n nVarD = ((q) oVar.f140201a).d();
        vkm.y yVarI = oVar.f140202b.i(j.f294644c);
        Flow flowA = p.a(oVar.d);
        akg.n nVarV = nim.a.v(e.b(oVar.e.k(false)), new k(29));
        w wVar = oVar.f140203c;
        w4l.h requestedStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(requestedStrategy, "requestedStrategy");
        f0 f0Var = wVar.f308101a;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(requestedStrategy, "requestedStrategy");
        l.a1(this, nim.a.u(new g06.k(null, oVar), u0.m(u0.i(nVarD, yVarI, flowA), u0.m(nVarV, n14.k.p(f0Var.e.b(b0.f308205a, f0Var.d.c("PRIMARY_ENTRY_POINTS_KEY", requestedStrategy)), new i0(15))))), null, null, new g06.k(this, null, 9), 3);
    }

    public final void J2(g35.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof g35.j) {
            B2();
            return;
        }
        if (!(event instanceof i)) {
            if (!(event instanceof g35.h)) {
                throw new NoWhenBranchMatchedException();
            }
            I2();
            return;
        }
        ProductSelectionDelegate.Model model = ((i) event).f140196a;
        Object obj2 = model.i;
        if (!(obj2 instanceof CreditApplicationPrimaryEntryPoint)) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(c.ERROR, "CreditEntryPointsControllerModel", a0.d.s("Unsupported product selection event: modelListId=", model.f52973a, ", parcelType=", obj2 != null ? obj2.getClass().getSimpleName() : "null"), null, h0Var);
            return;
        }
        CreditApplicationPrimaryEntryPoint creditApplicationPrimaryEntryPoint = (CreditApplicationPrimaryEntryPoint) obj2;
        boolean z = creditApplicationPrimaryEntryPoint instanceof CreditApplicationPrimaryEntryPoint.GroupedProducts;
        CreditEntryPointsControllerContract$InputData creditEntryPointsControllerContract$InputData = this.o;
        if (z) {
            CreditApplicationPrimaryEntryPoint.GroupedProducts groupedProducts = (CreditApplicationPrimaryEntryPoint.GroupedProducts) creditApplicationPrimaryEntryPoint;
            C1(new ProductGroupDestination(groupedProducts.f66162a, groupedProducts.e, creditEntryPointsControllerContract$InputData.f70059b));
        } else {
            if (!(creditApplicationPrimaryEntryPoint instanceof CreditApplicationPrimaryEntryPoint.SingleProduct)) {
                throw new NoWhenBranchMatchedException();
            }
            CreditApplicationPrimaryEntryPoint.SingleProduct singleProduct = (CreditApplicationPrimaryEntryPoint.SingleProduct) creditApplicationPrimaryEntryPoint;
            C1(this.f70061q.c(singleProduct.e, new a1(creditEntryPointsControllerContract$InputData.f70059b, null, singleProduct.f, null, null, 26), wp3.a.OPEN_EXISTING_APPLICATION, yp3.d.DEFAULT, (1916 & 16) != 0 ? null : null, (1916 & 32) != 0 ? yp3.f.SHOW_ALL : null, yp3.c.DEFAULT, (1916 & 128) != 0 ? yp3.e.SKIP_ON_TOGGLE_DISABLED : null, b.DEFAULT, (1916 & 512) != 0 ? null : null, null));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f70062r;
    }
}

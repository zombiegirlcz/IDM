package com.revolut.feature.retail.restaurants.impl.ui.confirmreservation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import beb.b;
import beb.d;
import beb.f;
import beb.g;
import beb.i;
import beb.j;
import beb.k;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsImageDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.ConfirmReservationScreen;
import com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.ConfirmReservationScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/ui/confirmreservation/ConfirmReservationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbeb/i;", "Ltki/c;", "Lbeb/k;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConfirmReservationScreen extends ViewController<i> implements c {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(ConfirmReservationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final ConfirmReservationScreenContract$InputData K;
    public final int L;
    public final h M;
    public final ListSubheaderDelegate N;
    public final FullScreenStateDelegate O;
    public final CellDetailsPriceDelegate P;
    public final RowDelegate Q;
    public final InputChecklistDelegate R;
    public final PlainTextWarningDelegate S;
    public final Object T;
    public final Object U;
    public final Object V;

    public ConfirmReservationScreen(ConfirmReservationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, b.f);
        this.N = new ListSubheaderDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = new CellDetailsPriceDelegate();
        this.Q = new RowDelegate(null, null, 7);
        this.R = new InputChecklistDelegate();
        this.S = new PlainTextWarningDelegate();
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: beb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmReservationScreen f14732b;

            {
                this.f14732b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConfirmReservationScreen confirmReservationScreen = this.f14732b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ConfirmReservationScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(confirmReservationScreen.m2()).a().get(vdb.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vdb.j.class, " is not found"));
                        }
                        vdb.j jVar = ((vdb.j) aVar2.b()).i;
                        ConfirmReservationScreenContract$InputData confirmReservationScreenContract$InputData = confirmReservationScreen.K;
                        confirmReservationScreenContract$InputData.getClass();
                        return new vdb.b(jVar, confirmReservationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ConfirmReservationScreen.W;
                        return (j) ((vdb.b) confirmReservationScreen.T.getValue()).f287838c.get();
                    default:
                        KProperty[] kPropertyArr3 = ConfirmReservationScreen.W;
                        ConfirmReservationScreen confirmReservationScreen2 = this.f14732b;
                        return tki.g.a(confirmReservationScreen2, confirmReservationScreen2.R2(), zhm.v.k(new CellDetailsImageDelegate(), new CellDetailsLoadingDelegate(), confirmReservationScreen2.P, confirmReservationScreen2.O, confirmReservationScreen2.N, new ListSubheaderLoadingDelegate(), new PlainTextDelegate(), confirmReservationScreen2.S, confirmReservationScreen2.R, confirmReservationScreen2.Q, new RowLoadingDelegate()), confirmReservationScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: beb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmReservationScreen f14732b;

            {
                this.f14732b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConfirmReservationScreen confirmReservationScreen = this.f14732b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConfirmReservationScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(confirmReservationScreen.m2()).a().get(vdb.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vdb.j.class, " is not found"));
                        }
                        vdb.j jVar = ((vdb.j) aVar2.b()).i;
                        ConfirmReservationScreenContract$InputData confirmReservationScreenContract$InputData = confirmReservationScreen.K;
                        confirmReservationScreenContract$InputData.getClass();
                        return new vdb.b(jVar, confirmReservationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ConfirmReservationScreen.W;
                        return (j) ((vdb.b) confirmReservationScreen.T.getValue()).f287838c.get();
                    default:
                        KProperty[] kPropertyArr3 = ConfirmReservationScreen.W;
                        ConfirmReservationScreen confirmReservationScreen2 = this.f14732b;
                        return tki.g.a(confirmReservationScreen2, confirmReservationScreen2.R2(), zhm.v.k(new CellDetailsImageDelegate(), new CellDetailsLoadingDelegate(), confirmReservationScreen2.P, confirmReservationScreen2.O, confirmReservationScreen2.N, new ListSubheaderLoadingDelegate(), new PlainTextDelegate(), confirmReservationScreen2.S, confirmReservationScreen2.R, confirmReservationScreen2.Q, new RowLoadingDelegate()), confirmReservationScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: beb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmReservationScreen f14732b;

            {
                this.f14732b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ConfirmReservationScreen confirmReservationScreen = this.f14732b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConfirmReservationScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(confirmReservationScreen.m2()).a().get(vdb.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vdb.j.class, " is not found"));
                        }
                        vdb.j jVar = ((vdb.j) aVar2.b()).i;
                        ConfirmReservationScreenContract$InputData confirmReservationScreenContract$InputData = confirmReservationScreen.K;
                        confirmReservationScreenContract$InputData.getClass();
                        return new vdb.b(jVar, confirmReservationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ConfirmReservationScreen.W;
                        return (j) ((vdb.b) confirmReservationScreen.T.getValue()).f287838c.get();
                    default:
                        KProperty[] kPropertyArr3 = ConfirmReservationScreen.W;
                        ConfirmReservationScreen confirmReservationScreen2 = this.f14732b;
                        return tki.g.a(confirmReservationScreen2, confirmReservationScreen2.R2(), zhm.v.k(new CellDetailsImageDelegate(), new CellDetailsLoadingDelegate(), confirmReservationScreen2.P, confirmReservationScreen2.O, confirmReservationScreen2.N, new ListSubheaderLoadingDelegate(), new PlainTextDelegate(), confirmReservationScreen2.S, confirmReservationScreen2.R, confirmReservationScreen2.Q, new RowLoadingDelegate()), confirmReservationScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        TextLocalisedClause textLocalisedClause = uiState.f14740b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setMenuItems(uiState.f14741c);
        d3().f174533b.setModel(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vdb.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new beb.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52707c), new beb.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53218h), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52518c), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.t()), new b74.e(this, continuation, 19), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new beb.c(this, continuation, 1), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.V.getValue();
    }
}

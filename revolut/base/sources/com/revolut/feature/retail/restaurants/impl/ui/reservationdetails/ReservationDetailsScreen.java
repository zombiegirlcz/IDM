package com.revolut.feature.retail.restaurants.impl.ui.reservationdetails;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.c1;
import au0.m0;
import au0.s0;
import au0.v0;
import cli.o;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.retail.restaurants.impl.ui.reservationdetails.ReservationDetailsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.c0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q43.m;
import qeb.d;
import qeb.g;
import qeb.i;
import te0.w;
import tki.c;
import tx0.p2;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/ui/reservationdetails/ReservationDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lqeb/i;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReservationDetailsScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ReservationDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileActionfooterBinding;", 0))};
    public final g K;
    public final int L;
    public final h M;
    public final CounterTextDelegate N;
    public final RowDelegate O;
    public final RowLoadingDelegate P;
    public final FullScreenStateDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public ReservationDetailsScreen(g input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = R$layout.screen_recycler_navbarwithbigtile_actionfooter;
        this.M = s.t(this, qeb.c.f);
        this.N = new CounterTextDelegate();
        this.O = new RowDelegate(null, null, 7);
        this.P = new RowLoadingDelegate();
        this.Q = new FullScreenStateDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: qeb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationDetailsScreen f245105b;

            {
                this.f245105b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReservationDetailsScreen reservationDetailsScreen = this.f245105b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReservationDetailsScreen.U;
                        ReservationDetailsScreen reservationDetailsScreen2 = this.f245105b;
                        return tki.g.a(reservationDetailsScreen2, reservationDetailsScreen2.R2(), v.k(reservationDetailsScreen2.N, reservationDetailsScreen2.O, reservationDetailsScreen2.P, reservationDetailsScreen2.Q), reservationDetailsScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ReservationDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(reservationDetailsScreen.m2()).a().get(vdb.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vdb.j.class, " is not found"));
                        }
                        vdb.j jVar = ((vdb.j) aVar2.b()).i;
                        g gVar = reservationDetailsScreen.K;
                        gVar.getClass();
                        return new vdb.h(jVar, gVar);
                    default:
                        KProperty[] kPropertyArr3 = ReservationDetailsScreen.U;
                        return (h) ((vdb.h) reservationDetailsScreen.S.getValue()).f287851b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: qeb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationDetailsScreen f245105b;

            {
                this.f245105b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReservationDetailsScreen reservationDetailsScreen = this.f245105b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReservationDetailsScreen.U;
                        ReservationDetailsScreen reservationDetailsScreen2 = this.f245105b;
                        return tki.g.a(reservationDetailsScreen2, reservationDetailsScreen2.R2(), v.k(reservationDetailsScreen2.N, reservationDetailsScreen2.O, reservationDetailsScreen2.P, reservationDetailsScreen2.Q), reservationDetailsScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ReservationDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(reservationDetailsScreen.m2()).a().get(vdb.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vdb.j.class, " is not found"));
                        }
                        vdb.j jVar = ((vdb.j) aVar2.b()).i;
                        g gVar = reservationDetailsScreen.K;
                        gVar.getClass();
                        return new vdb.h(jVar, gVar);
                    default:
                        KProperty[] kPropertyArr3 = ReservationDetailsScreen.U;
                        return (h) ((vdb.h) reservationDetailsScreen.S.getValue()).f287851b.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: qeb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationDetailsScreen f245105b;

            {
                this.f245105b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ReservationDetailsScreen reservationDetailsScreen = this.f245105b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReservationDetailsScreen.U;
                        ReservationDetailsScreen reservationDetailsScreen2 = this.f245105b;
                        return tki.g.a(reservationDetailsScreen2, reservationDetailsScreen2.R2(), v.k(reservationDetailsScreen2.N, reservationDetailsScreen2.O, reservationDetailsScreen2.P, reservationDetailsScreen2.Q), reservationDetailsScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ReservationDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(reservationDetailsScreen.m2()).a().get(vdb.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vdb.j.class, " is not found"));
                        }
                        vdb.j jVar = ((vdb.j) aVar2.b()).i;
                        g gVar = reservationDetailsScreen.K;
                        gVar.getClass();
                        return new vdb.h(jVar, gVar);
                    default:
                        KProperty[] kPropertyArr3 = ReservationDetailsScreen.U;
                        return (h) ((vdb.h) reservationDetailsScreen.S.getValue()).f287851b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().f174505c;
        c1.S(navBarWithBigTile, u.c(uiState.f245110c), null, v0.NONE, 2);
        navBarWithBigTile.setLoadingState(uiState.f);
        navBarWithBigTile.setActionStatusLabel(uiState.d);
        navBarWithBigTile.setActions(uiState.e);
        navBarWithBigTile.setToolbarTitle(uiState.f245109b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vdb.h) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f174505c;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setTitleStyle(b1.LARGE);
        navBarWithBigTile.setHeightMode(p2.f275222a);
        navBarWithBigTile.setLayoutType(s0.CENTERED);
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.BOTTOM_BLUR);
        ActionFooterView actionFooterView = d3().f174504b;
        Intrinsics.checkNotNullExpressionValue(actionFooterView, "screenRecyclerNavBarWith…ionFooterActionFooterView");
        actionFooterView.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174505c.f59357t), new m(this, null, 28), 3);
        ViewController.P2(this, rd0.e.b(d3().f174505c.K()), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new qeb.e(this, null), 3);
    }

    public final c0 d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final qeb.h R2() {
        return (qeb.h) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.R.getValue();
    }
}

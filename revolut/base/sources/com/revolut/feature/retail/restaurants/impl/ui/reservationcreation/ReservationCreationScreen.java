package com.revolut.feature.retail.restaurants.impl.ui.reservationcreation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import au0.b1;
import au0.c1;
import au0.m0;
import au0.s0;
import au0.v0;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.ReservationCreationScreen;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.ReservationCreationScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ieb.b;
import ieb.d;
import ieb.h;
import ieb.j;
import ieb.k;
import java.util.List;
import jii.c0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import tx0.p2;
import vc.s;
import vdb.f;
import wp5.y;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/ui/reservationcreation/ReservationCreationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lieb/h;", "Ltki/c;", "Lieb/k;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReservationCreationScreen extends ViewController<h> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ReservationCreationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileActionfooterBinding;", 0))};
    public final ReservationCreationScreenContract$InputData K;
    public final int L;
    public final ao.h M;
    public final AttributeSelectorSmallDelegate N;
    public final InputTextDelegate O;
    public final FullScreenStateDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public ReservationCreationScreen(ReservationCreationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbarwithbigtile_actionfooter;
        this.M = s.t(this, b.f);
        this.N = new AttributeSelectorSmallDelegate();
        this.O = new InputTextDelegate(null);
        this.P = new FullScreenStateDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: ieb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationCreationScreen f160683b;

            {
                this.f160683b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReservationCreationScreen reservationCreationScreen = this.f160683b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReservationCreationScreen.T;
                        ReservationCreationScreen reservationCreationScreen2 = this.f160683b;
                        j jVarD = reservationCreationScreen2.d();
                        AttributeSelectorSmallDelegate attributeSelectorSmallDelegate = reservationCreationScreen2.N;
                        return tki.g.a(reservationCreationScreen2, jVarD, v.k(new GridBoxDelegate(v.k(attributeSelectorSmallDelegate, new AttributeSelectorSmallLoadingDelegate(), reservationCreationScreen2.O), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), new ScrollerDelegate(u.c(attributeSelectorSmallDelegate), false), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), reservationCreationScreen2.P), reservationCreationScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ReservationCreationScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(reservationCreationScreen.m2()).a().get(vdb.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vdb.j.class, " is not found"));
                        }
                        vdb.j jVar = ((vdb.j) aVar2.b()).i;
                        ReservationCreationScreenContract$InputData reservationCreationScreenContract$InputData = reservationCreationScreen.K;
                        reservationCreationScreenContract$InputData.getClass();
                        return new vdb.f(jVar, reservationCreationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ReservationCreationScreen.T;
                        return (j) ((vdb.f) reservationCreationScreen.R.getValue()).f287847b.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: ieb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationCreationScreen f160683b;

            {
                this.f160683b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReservationCreationScreen reservationCreationScreen = this.f160683b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReservationCreationScreen.T;
                        ReservationCreationScreen reservationCreationScreen2 = this.f160683b;
                        j jVarD = reservationCreationScreen2.d();
                        AttributeSelectorSmallDelegate attributeSelectorSmallDelegate = reservationCreationScreen2.N;
                        return tki.g.a(reservationCreationScreen2, jVarD, v.k(new GridBoxDelegate(v.k(attributeSelectorSmallDelegate, new AttributeSelectorSmallLoadingDelegate(), reservationCreationScreen2.O), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), new ScrollerDelegate(u.c(attributeSelectorSmallDelegate), false), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), reservationCreationScreen2.P), reservationCreationScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ReservationCreationScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(reservationCreationScreen.m2()).a().get(vdb.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vdb.j.class, " is not found"));
                        }
                        vdb.j jVar = ((vdb.j) aVar2.b()).i;
                        ReservationCreationScreenContract$InputData reservationCreationScreenContract$InputData = reservationCreationScreen.K;
                        reservationCreationScreenContract$InputData.getClass();
                        return new vdb.f(jVar, reservationCreationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ReservationCreationScreen.T;
                        return (j) ((vdb.f) reservationCreationScreen.R.getValue()).f287847b.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: ieb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationCreationScreen f160683b;

            {
                this.f160683b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ReservationCreationScreen reservationCreationScreen = this.f160683b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReservationCreationScreen.T;
                        ReservationCreationScreen reservationCreationScreen2 = this.f160683b;
                        j jVarD = reservationCreationScreen2.d();
                        AttributeSelectorSmallDelegate attributeSelectorSmallDelegate = reservationCreationScreen2.N;
                        return tki.g.a(reservationCreationScreen2, jVarD, v.k(new GridBoxDelegate(v.k(attributeSelectorSmallDelegate, new AttributeSelectorSmallLoadingDelegate(), reservationCreationScreen2.O), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), new ScrollerDelegate(u.c(attributeSelectorSmallDelegate), false), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), reservationCreationScreen2.P), reservationCreationScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ReservationCreationScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(reservationCreationScreen.m2()).a().get(vdb.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vdb.j.class, " is not found"));
                        }
                        vdb.j jVar = ((vdb.j) aVar2.b()).i;
                        ReservationCreationScreenContract$InputData reservationCreationScreenContract$InputData = reservationCreationScreen.K;
                        reservationCreationScreenContract$InputData.getClass();
                        return new vdb.f(jVar, reservationCreationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ReservationCreationScreen.T;
                        return (j) ((vdb.f) reservationCreationScreen.R.getValue()).f287847b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().f174505c;
        c1.S(navBarWithBigTile, u.c(uiState.f160695c), null, v0.NONE, 2);
        navBarWithBigTile.setLoadingState(uiState.d);
        navBarWithBigTile.setToolbarTitle(uiState.f160694b);
        ActionFooterView actionFooterView = d3().f174504b;
        Intrinsics.checkNotNullExpressionValue(actionFooterView, "screenRecyclerNavBarWith…ionFooterActionFooterView");
        actionFooterView.setVisibility(uiState.f ? 0 : 8);
        d3().f174504b.setModel(uiState.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f174505c;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setTitleStyle(b1.LARGE);
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.BOTTOM_BLUR);
        navBarWithBigTile.setHeightMode(p2.f275222a);
        navBarWithBigTile.setLayoutType(s0.CENTERED);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174505c.f59357t), new ieb.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174504b.f), new ieb.c(this, continuation, 1), 3);
        InputTextDelegate inputTextDelegate = this.O;
        ViewController.P2(this, y.x(inputTextDelegate.f52575g.f121375b, inputTextDelegate.i.f121375b, "mergeWith(...)"), new ieb.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.p()), new ieb.f(this, null), 3);
    }

    public final c0 d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }
}

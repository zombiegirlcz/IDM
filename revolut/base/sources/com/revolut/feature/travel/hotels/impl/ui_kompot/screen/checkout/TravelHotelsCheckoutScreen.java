package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsCheckoutScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import wbg.a0;
import wbg.b0;
import wbg.c0;
import wbg.d0;
import wbg.e0;
import wbg.f0;
import wbg.m0;
import wbg.n0;
import wbg.p0;
import wbg.q0;
import wbg.r0;
import wbg.s0;
import wbg.t0;
import wbg.v;
import wbg.x;
import wbg.z;
import wp5.y;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/checkout/TravelHotelsCheckoutScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwbg/m0;", "Ldli/a;", "Lwbg/t0;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsCheckoutScreen extends ViewController<m0> implements dli.a {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f93892d0 = {o0.f186429a.j(new h0(TravelHotelsCheckoutScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsCheckoutBinding;", 0))};
    public final int K;
    public final ListSubheaderDelegate L;
    public final TextDelegate M;
    public final LargeActionButtonDelegate N;
    public final CellDetailsDelegate O;
    public final CellDetailsBadgeDelegate P;
    public final PlainTextDelegate Q;
    public final CellDetailsPriceDelegate R;
    public final CellDetailsNoteDelegate S;
    public final RoomPreviewCardDelegate T;
    public final RowDelegate U;
    public final PlainTextWarningDelegate V;
    public final AttributeSelectorSmallDelegate W;
    public final FooterTextDelegate X;
    public final ScrollerDelegate Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final h f93893a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f93894b0;
    public final Object c0;

    public TravelHotelsCheckoutScreen(TravelHotelsCheckoutScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_hotels_checkout;
        this.L = new ListSubheaderDelegate();
        this.M = new TextDelegate();
        this.N = new LargeActionButtonDelegate();
        this.O = new CellDetailsDelegate();
        this.P = new CellDetailsBadgeDelegate();
        this.Q = new PlainTextDelegate();
        this.R = new CellDetailsPriceDelegate();
        this.S = new CellDetailsNoteDelegate();
        this.T = new RoomPreviewCardDelegate();
        this.U = new RowDelegate(null, null, 7);
        this.V = new PlainTextWarningDelegate();
        AttributeSelectorSmallDelegate attributeSelectorSmallDelegate = new AttributeSelectorSmallDelegate();
        this.W = attributeSelectorSmallDelegate;
        this.X = new FooterTextDelegate();
        this.Y = new ScrollerDelegate(u.c(attributeSelectorSmallDelegate), false);
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: wbg.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsCheckoutScreen f296204b;

            {
                this.f296204b = this;
            }

            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsCheckoutScreen.f93892d0;
                        TravelHotelsCheckoutScreen travelHotelsCheckoutScreen = this.f296204b;
                        return dli.f.a(travelHotelsCheckoutScreen, travelHotelsCheckoutScreen.d(), zhm.v.k(new ListingTileDelegate(), travelHotelsCheckoutScreen.S, travelHotelsCheckoutScreen.R, travelHotelsCheckoutScreen.M, travelHotelsCheckoutScreen.P, travelHotelsCheckoutScreen.L, travelHotelsCheckoutScreen.O, travelHotelsCheckoutScreen.N, travelHotelsCheckoutScreen.Q, travelHotelsCheckoutScreen.T, travelHotelsCheckoutScreen.U, travelHotelsCheckoutScreen.V, travelHotelsCheckoutScreen.Y, travelHotelsCheckoutScreen.X), R$id.travelHotelsCheckoutScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsCheckoutScreen.f93892d0;
                        return (s0) ((g9g.o) this.f296204b.f93894b0.getValue()).f141764r.get();
                }
            }
        });
        this.f93893a0 = s.t(this, v.f);
        this.f93894b0 = w.y0(new w83.a(this, inputData, 8));
        final int i2 = 1;
        this.c0 = w.y0(new Function0(this) { // from class: wbg.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsCheckoutScreen f296204b;

            {
                this.f296204b = this;
            }

            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsCheckoutScreen.f93892d0;
                        TravelHotelsCheckoutScreen travelHotelsCheckoutScreen = this.f296204b;
                        return dli.f.a(travelHotelsCheckoutScreen, travelHotelsCheckoutScreen.d(), zhm.v.k(new ListingTileDelegate(), travelHotelsCheckoutScreen.S, travelHotelsCheckoutScreen.R, travelHotelsCheckoutScreen.M, travelHotelsCheckoutScreen.P, travelHotelsCheckoutScreen.L, travelHotelsCheckoutScreen.O, travelHotelsCheckoutScreen.N, travelHotelsCheckoutScreen.Q, travelHotelsCheckoutScreen.T, travelHotelsCheckoutScreen.U, travelHotelsCheckoutScreen.V, travelHotelsCheckoutScreen.Y, travelHotelsCheckoutScreen.X), R$id.travelHotelsCheckoutScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsCheckoutScreen.f93892d0;
                        return (s0) ((g9g.o) this.f296204b.f93894b0.getValue()).f141764r.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        t0 uiState = (t0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        n0 n0Var = qVar instanceof n0 ? (n0) qVar : null;
        if (n0Var == null || n0Var.f296188a) {
            q0 q0Var = uiState.f296206b;
            if (q0Var instanceof p0) {
                p0 p0Var = (p0) q0Var;
                f3(p0Var.f296194b, p0Var.f296193a, true);
                return;
            }
            if (q0Var instanceof wbg.o0) {
                wbg.o0 o0Var = (wbg.o0) q0Var;
                f3(o0Var.f296191b, o0Var.f296190a, false);
            } else {
                if (!(q0Var instanceof q0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                LargeActionButton travelHotelsCheckoutScreenButton = d3().f22398b;
                Intrinsics.checkNotNullExpressionValue(travelHotelsCheckoutScreenButton, "travelHotelsCheckoutScreenButton");
                travelHotelsCheckoutScreenButton.setVisibility(8);
                TwinVerticalButton travelHotelsCheckoutScreenTwinVerticalButtonView = d3().e;
                Intrinsics.checkNotNullExpressionValue(travelHotelsCheckoutScreenTwinVerticalButtonView, "travelHotelsCheckoutScreenTwinVerticalButtonView");
                travelHotelsCheckoutScreenTwinVerticalButtonView.setVisibility(8);
                g3(false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g9g.o) this.f93894b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((g9g.o) this.f93894b0.getValue()).f.get()).d(zhm.v.k(this.O, this.N));
        TwinVerticalButton twinVerticalButton = d3().e;
        twinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        twinVerticalButton.setDescriptionVisibility(8);
        twinVerticalButton.setSecondaryButtonVisible(false);
        twinVerticalButton.setCollapsed(true, false);
        NavBarWithToolbar navBarWithToolbar = d3().f22399c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_checkout_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.m0()), new z(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f22399c.f59410q), new z(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.W.p()), new b0(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f22398b.o), new z(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(this.U.f53218h), new c0(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f.f121375b), new d0(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52707c), new e0(this, null), 3);
        TextDelegate textDelegate = this.M;
        ViewController.P2(this, rd0.e.b(textDelegate.f53530c), new f0(this, null), 3);
        RoomPreviewCardDelegate roomPreviewCardDelegate = this.T;
        ViewController.P2(this, rd0.e.b(roomPreviewCardDelegate.f), new wbg.w(this, continuation, 7), 3);
        ViewController.P2(this, rd0.e.b(roomPreviewCardDelegate.d), new wbg.w(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.R.f51887c), new wbg.w(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.V.t()), new wbg.w(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(roomPreviewCardDelegate.f53211c), new wbg.w(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(textDelegate.d), new wbg.w(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(this.X.e.f121375b), new wbg.w(this, continuation, 5), 3);
        ViewController.P2(this, rd0.e.b(this.O.d), new x(this, null), 3);
        CellDetailsBadgeDelegate cellDetailsBadgeDelegate = this.P;
        ViewController.P2(this, y.x(cellDetailsBadgeDelegate.f51819c.f121375b, cellDetailsBadgeDelegate.d.f121375b, "mergeWith(...)"), new wbg.w(this, continuation, 6), 3);
        ViewController.P2(this, rd0.e.b(this.N.d.f121375b), new wbg.y(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().e.o0()), new z(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.S.d), new a0(this, null), 3);
    }

    public final c9g.h d3() {
        ViewBinding value = this.f93893a0.getValue(this, f93892d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c9g.h) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final s0 d() {
        return (s0) this.c0.getValue();
    }

    public final void f3(r0 r0Var, TextLocalisedClause textLocalisedClause, boolean z) {
        int i = wbg.u.f296207a[r0Var.ordinal()];
        if (i == 1) {
            TwinVerticalButton travelHotelsCheckoutScreenTwinVerticalButtonView = d3().e;
            Intrinsics.checkNotNullExpressionValue(travelHotelsCheckoutScreenTwinVerticalButtonView, "travelHotelsCheckoutScreenTwinVerticalButtonView");
            travelHotelsCheckoutScreenTwinVerticalButtonView.setVisibility(8);
            LargeActionButton largeActionButton = d3().f22398b;
            largeActionButton.setVisibility(0);
            largeActionButton.setEnabled(z);
            largeActionButton.setText(textLocalisedClause);
            g3(true);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        LargeActionButton travelHotelsCheckoutScreenButton = d3().f22398b;
        Intrinsics.checkNotNullExpressionValue(travelHotelsCheckoutScreenButton, "travelHotelsCheckoutScreenButton");
        travelHotelsCheckoutScreenButton.setVisibility(8);
        TwinVerticalButton twinVerticalButton = d3().e;
        twinVerticalButton.setVisibility(0);
        twinVerticalButton.setMainButtonEnabled(z);
        twinVerticalButton.setMainButtonText(textLocalisedClause);
        g3(false);
    }

    public final void g3(boolean z) {
        ScreenContentRecyclerView travelHotelsCheckoutScreenRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(travelHotelsCheckoutScreenRecyclerView, "travelHotelsCheckoutScreenRecyclerView");
        travelHotelsCheckoutScreenRecyclerView.setPaddingRelative(travelHotelsCheckoutScreenRecyclerView.getPaddingStart(), travelHotelsCheckoutScreenRecyclerView.getPaddingTop(), travelHotelsCheckoutScreenRecyclerView.getPaddingEnd(), z ? kli.a.k(m2(), 96.0f) : 0);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Z.getValue();
    }
}

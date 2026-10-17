package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.n6;
import az.i;
import bbg.b;
import bbg.d;
import bbg.f;
import bbg.g;
import bbg.p;
import bbg.r;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate;
import com.revolut.core.ui_kit.delegates.RoomPreviewLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import g9g.c;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbbg/p;", "Ldli/a;", "Lbbg/s;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsAmendmentConfirmationScreen extends ViewController<p> implements dli.a {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(TravelHotelsAmendmentConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final FullScreenStateDelegate K;
    public final AttributeSelectorSmallDelegate L;
    public final ScrollerDelegate M;
    public final ListSubheaderDelegate N;
    public final RowDelegate O;
    public final RoomPreviewCardDelegate P;
    public final PlainTextWarningDelegate Q;
    public final CellDetailsDelegate R;
    public final CellDetailsNoteDelegate S;
    public final CellDetailsPriceDelegate T;
    public final TextDelegate U;
    public final Object V;
    public final h W;
    public final Object X;
    public final Object Y;

    public TravelHotelsAmendmentConfirmationScreen(TravelHotelsAmendmentConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new FullScreenStateDelegate();
        AttributeSelectorSmallDelegate attributeSelectorSmallDelegate = new AttributeSelectorSmallDelegate();
        this.L = attributeSelectorSmallDelegate;
        this.M = new ScrollerDelegate(u.c(attributeSelectorSmallDelegate), false);
        this.N = new ListSubheaderDelegate();
        this.O = new RowDelegate(null, null, 7);
        this.P = new RoomPreviewCardDelegate();
        this.Q = new PlainTextWarningDelegate();
        this.R = new CellDetailsDelegate();
        this.S = new CellDetailsNoteDelegate();
        this.T = new CellDetailsPriceDelegate();
        this.U = new TextDelegate();
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: bbg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsAmendmentConfirmationScreen f14268b;

            {
                this.f14268b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsAmendmentConfirmationScreen.Z;
                        TravelHotelsAmendmentConfirmationScreen travelHotelsAmendmentConfirmationScreen = this.f14268b;
                        return dli.f.a(travelHotelsAmendmentConfirmationScreen, travelHotelsAmendmentConfirmationScreen.R2(), zhm.v.k(travelHotelsAmendmentConfirmationScreen.K, travelHotelsAmendmentConfirmationScreen.N, travelHotelsAmendmentConfirmationScreen.O, travelHotelsAmendmentConfirmationScreen.M, travelHotelsAmendmentConfirmationScreen.P, travelHotelsAmendmentConfirmationScreen.Q, travelHotelsAmendmentConfirmationScreen.R, travelHotelsAmendmentConfirmationScreen.S, travelHotelsAmendmentConfirmationScreen.T, travelHotelsAmendmentConfirmationScreen.U, new RoomPreviewLoadingDelegate(), new ListSubheaderLoadingDelegate(), new CellDetailsLoadingDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsAmendmentConfirmationScreen.Z;
                        return (r) ((g9g.c) this.f14268b.X.getValue()).f141609j.get();
                }
            }
        });
        this.W = s.t(this, b.f);
        this.X = w.y0(new at4.b(this, inputData, 29));
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: bbg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsAmendmentConfirmationScreen f14268b;

            {
                this.f14268b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsAmendmentConfirmationScreen.Z;
                        TravelHotelsAmendmentConfirmationScreen travelHotelsAmendmentConfirmationScreen = this.f14268b;
                        return dli.f.a(travelHotelsAmendmentConfirmationScreen, travelHotelsAmendmentConfirmationScreen.R2(), zhm.v.k(travelHotelsAmendmentConfirmationScreen.K, travelHotelsAmendmentConfirmationScreen.N, travelHotelsAmendmentConfirmationScreen.O, travelHotelsAmendmentConfirmationScreen.M, travelHotelsAmendmentConfirmationScreen.P, travelHotelsAmendmentConfirmationScreen.Q, travelHotelsAmendmentConfirmationScreen.R, travelHotelsAmendmentConfirmationScreen.S, travelHotelsAmendmentConfirmationScreen.T, travelHotelsAmendmentConfirmationScreen.U, new RoomPreviewLoadingDelegate(), new ListSubheaderLoadingDelegate(), new CellDetailsLoadingDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsAmendmentConfirmationScreen.Z;
                        return (r) ((g9g.c) this.f14268b.X.getValue()).f141609j.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        bbg.s uiState = (bbg.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        bbg.q qVar2 = qVar instanceof bbg.q ? (bbg.q) qVar : null;
        if (qVar2 == null || qVar2.f14294a) {
            n6 n6Var = uiState.f14297b;
            if (n6Var != null) {
                ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
                Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
                screenRecyclerNavbarActionFooterActionFooterView.setVisibility(0);
                d3().f174533b.setModel(new e(false, null, null, n6Var, null, null, 55));
            } else {
                ActionFooterView screenRecyclerNavbarActionFooterActionFooterView2 = d3().f174533b;
                Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView2, "screenRecyclerNavbarActionFooterActionFooterView");
                screenRecyclerNavbarActionFooterActionFooterView2.setVisibility(8);
            }
        }
        if (qVar2 == null || qVar2.f14295b) {
            d3().f174534c.setMenuItems(uiState.f14298c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_amendment_confirmation_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new i(this, continuation, 23), 3);
        ViewController.P2(this, rd0.e.b(d3().f174534c.o.f57403b), new bbg.c(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(this.K.f52371h.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.p()), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53218h), new bbg.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52707c), new bbg.i(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new bbg.c(this, continuation, 5), 3);
        RoomPreviewCardDelegate roomPreviewCardDelegate = this.P;
        ViewController.P2(this, rd0.e.b(roomPreviewCardDelegate.f53211c), new bbg.c(this, continuation, 6), 3);
        ViewController.P2(this, rd0.e.b(roomPreviewCardDelegate.d), new bbg.c(this, continuation, 7), 3);
        ViewController.P2(this, rd0.e.b(roomPreviewCardDelegate.f), new bbg.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.Q.t()), new bbg.c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.R.d), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.d), new bbg.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.f51887c), new bbg.c(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.U.d), new bbg.c(this, continuation, 3), 3);
    }

    public final k d3() {
        ViewBinding value = this.W.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r R2() {
        return (r) this.Y.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getM() {
        return R$layout.screen_recycler_navbar_action_footer;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}

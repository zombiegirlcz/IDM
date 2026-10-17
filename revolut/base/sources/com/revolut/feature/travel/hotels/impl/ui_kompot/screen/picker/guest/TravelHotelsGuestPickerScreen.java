package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest;

import adg.b;
import adg.d;
import adg.f;
import adg.k;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellIncrementDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.TravelHotelsGuestPickerScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.TravelHotelsGuestPickerScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import g9g.g1;
import g9g.h1;
import hoi.j;
import jii.u;
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
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/guest/TravelHotelsGuestPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ltki/c;", "Ladg/k;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsGuestPickerScreen extends ViewController<Object> implements c {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TravelHotelsGuestPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final TravelHotelsGuestPickerScreenContract$InputData K;
    public final CellIncrementDelegate L;
    public final CellDetailsActionDelegate M;
    public final TextDelegate N;
    public final ListSubheaderDelegate O;
    public final h P;
    public final int Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public TravelHotelsGuestPickerScreen(TravelHotelsGuestPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new CellIncrementDelegate();
        this.M = new CellDetailsActionDelegate();
        this.N = new TextDelegate();
        this.O = new ListSubheaderDelegate();
        this.P = s.t(this, b.f);
        this.Q = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: adg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsGuestPickerScreen f3342b;

            {
                this.f3342b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsGuestPickerScreen travelHotelsGuestPickerScreen = this.f3342b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsGuestPickerScreen.U;
                        qji.b bVarU2 = travelHotelsGuestPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.di.TravelHotelsGuestPickerScreenInjector");
                        g1 g1Var = (g1) ((ddg.a) bVarU2).y().mo3808a(travelHotelsGuestPickerScreen);
                        TravelHotelsGuestPickerScreenContract$InputData travelHotelsGuestPickerScreenContract$InputData = travelHotelsGuestPickerScreen.K;
                        switch (g1Var.f141676a) {
                            case 0:
                                travelHotelsGuestPickerScreenContract$InputData.getClass();
                                g1Var.d = travelHotelsGuestPickerScreenContract$InputData;
                                break;
                            default:
                                travelHotelsGuestPickerScreenContract$InputData.getClass();
                                g1Var.d = travelHotelsGuestPickerScreenContract$InputData;
                                break;
                        }
                        return (h1) g1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsGuestPickerScreen.U;
                        h1 h1Var = (h1) travelHotelsGuestPickerScreen.R.getValue();
                        switch (h1Var.f141687a) {
                            case 0:
                                return (j) h1Var.f141689c.get();
                            default:
                                return (j) h1Var.f141689c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsGuestPickerScreen.U;
                        TravelHotelsGuestPickerScreen travelHotelsGuestPickerScreen2 = this.f3342b;
                        return tki.g.a(travelHotelsGuestPickerScreen2, travelHotelsGuestPickerScreen2.d(), v.k(travelHotelsGuestPickerScreen2.L, travelHotelsGuestPickerScreen2.O, travelHotelsGuestPickerScreen2.M, travelHotelsGuestPickerScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: adg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsGuestPickerScreen f3342b;

            {
                this.f3342b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsGuestPickerScreen travelHotelsGuestPickerScreen = this.f3342b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsGuestPickerScreen.U;
                        qji.b bVarU2 = travelHotelsGuestPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.di.TravelHotelsGuestPickerScreenInjector");
                        g1 g1Var = (g1) ((ddg.a) bVarU2).y().mo3808a(travelHotelsGuestPickerScreen);
                        TravelHotelsGuestPickerScreenContract$InputData travelHotelsGuestPickerScreenContract$InputData = travelHotelsGuestPickerScreen.K;
                        switch (g1Var.f141676a) {
                            case 0:
                                travelHotelsGuestPickerScreenContract$InputData.getClass();
                                g1Var.d = travelHotelsGuestPickerScreenContract$InputData;
                                break;
                            default:
                                travelHotelsGuestPickerScreenContract$InputData.getClass();
                                g1Var.d = travelHotelsGuestPickerScreenContract$InputData;
                                break;
                        }
                        return (h1) g1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsGuestPickerScreen.U;
                        h1 h1Var = (h1) travelHotelsGuestPickerScreen.R.getValue();
                        switch (h1Var.f141687a) {
                            case 0:
                                return (j) h1Var.f141689c.get();
                            default:
                                return (j) h1Var.f141689c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsGuestPickerScreen.U;
                        TravelHotelsGuestPickerScreen travelHotelsGuestPickerScreen2 = this.f3342b;
                        return tki.g.a(travelHotelsGuestPickerScreen2, travelHotelsGuestPickerScreen2.d(), v.k(travelHotelsGuestPickerScreen2.L, travelHotelsGuestPickerScreen2.O, travelHotelsGuestPickerScreen2.M, travelHotelsGuestPickerScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: adg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsGuestPickerScreen f3342b;

            {
                this.f3342b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelHotelsGuestPickerScreen travelHotelsGuestPickerScreen = this.f3342b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsGuestPickerScreen.U;
                        qji.b bVarU2 = travelHotelsGuestPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.di.TravelHotelsGuestPickerScreenInjector");
                        g1 g1Var = (g1) ((ddg.a) bVarU2).y().mo3808a(travelHotelsGuestPickerScreen);
                        TravelHotelsGuestPickerScreenContract$InputData travelHotelsGuestPickerScreenContract$InputData = travelHotelsGuestPickerScreen.K;
                        switch (g1Var.f141676a) {
                            case 0:
                                travelHotelsGuestPickerScreenContract$InputData.getClass();
                                g1Var.d = travelHotelsGuestPickerScreenContract$InputData;
                                break;
                            default:
                                travelHotelsGuestPickerScreenContract$InputData.getClass();
                                g1Var.d = travelHotelsGuestPickerScreenContract$InputData;
                                break;
                        }
                        return (h1) g1Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsGuestPickerScreen.U;
                        h1 h1Var = (h1) travelHotelsGuestPickerScreen.R.getValue();
                        switch (h1Var.f141687a) {
                            case 0:
                                return (j) h1Var.f141689c.get();
                            default:
                                return (j) h1Var.f141689c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsGuestPickerScreen.U;
                        TravelHotelsGuestPickerScreen travelHotelsGuestPickerScreen2 = this.f3342b;
                        return tki.g.a(travelHotelsGuestPickerScreen2, travelHotelsGuestPickerScreen2.d(), v.k(travelHotelsGuestPickerScreen2.L, travelHotelsGuestPickerScreen2.O, travelHotelsGuestPickerScreen2.M, travelHotelsGuestPickerScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174565c.setDescriptionText(uiState.f3348b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h1) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setItemAnimator(new j(null, 3));
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_stays_search_guests_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.hotels_common_action_confirm, null, null, 14));
        largeActionButton.setLoadingButtonTag("CONFIRM_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new adg.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new adg.c(this, continuation, 1), 3);
        CellIncrementDelegate cellIncrementDelegate = this.L;
        ViewController.P2(this, rd0.e.b(cellIncrementDelegate.f51948c), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(cellIncrementDelegate.d), new d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52707c), new adg.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.d), new f(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final adg.j d() {
        return (adg.j) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }
}

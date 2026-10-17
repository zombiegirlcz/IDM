package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import g9g.w0;
import g9g.x0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qbg.b;
import qbg.g;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/TravelHotelsCancellationPolicyScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lqbg/h;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsCancellationPolicyScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TravelHotelsCancellationPolicyScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final TravelHotelsCancellationPolicyScreenContract$InputData K;
    public final ProgressStepVerticalDelegate L;
    public final h M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TravelHotelsCancellationPolicyScreen(TravelHotelsCancellationPolicyScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new ProgressStepVerticalDelegate();
        this.M = s.t(this, b.f);
        this.N = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: qbg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsCancellationPolicyScreen f244268b;

            {
                this.f244268b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsCancellationPolicyScreen travelHotelsCancellationPolicyScreen = this.f244268b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsCancellationPolicyScreen.R;
                        qji.b bVarU2 = travelHotelsCancellationPolicyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.di.TravelHotelsCancellationPolicyScreenInjector");
                        w0 w0Var = (w0) ((tbg.a) bVarU2).j().mo3808a(travelHotelsCancellationPolicyScreen);
                        TravelHotelsCancellationPolicyScreenContract$InputData travelHotelsCancellationPolicyScreenContract$InputData = travelHotelsCancellationPolicyScreen.K;
                        switch (w0Var.f141839a) {
                            case 0:
                                travelHotelsCancellationPolicyScreenContract$InputData.getClass();
                                w0Var.d = travelHotelsCancellationPolicyScreenContract$InputData;
                                break;
                            default:
                                travelHotelsCancellationPolicyScreenContract$InputData.getClass();
                                w0Var.d = travelHotelsCancellationPolicyScreenContract$InputData;
                                break;
                        }
                        return (x0) w0Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsCancellationPolicyScreen.R;
                        x0 x0Var = (x0) travelHotelsCancellationPolicyScreen.O.getValue();
                        switch (x0Var.f141845a) {
                            case 0:
                                return (g) x0Var.f141847c.get();
                            default:
                                return (g) x0Var.f141847c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsCancellationPolicyScreen.R;
                        TravelHotelsCancellationPolicyScreen travelHotelsCancellationPolicyScreen2 = this.f244268b;
                        return tki.g.a(travelHotelsCancellationPolicyScreen2, (g) travelHotelsCancellationPolicyScreen2.P.getValue(), u.c(travelHotelsCancellationPolicyScreen2.L), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: qbg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsCancellationPolicyScreen f244268b;

            {
                this.f244268b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsCancellationPolicyScreen travelHotelsCancellationPolicyScreen = this.f244268b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsCancellationPolicyScreen.R;
                        qji.b bVarU2 = travelHotelsCancellationPolicyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.di.TravelHotelsCancellationPolicyScreenInjector");
                        w0 w0Var = (w0) ((tbg.a) bVarU2).j().mo3808a(travelHotelsCancellationPolicyScreen);
                        TravelHotelsCancellationPolicyScreenContract$InputData travelHotelsCancellationPolicyScreenContract$InputData = travelHotelsCancellationPolicyScreen.K;
                        switch (w0Var.f141839a) {
                            case 0:
                                travelHotelsCancellationPolicyScreenContract$InputData.getClass();
                                w0Var.d = travelHotelsCancellationPolicyScreenContract$InputData;
                                break;
                            default:
                                travelHotelsCancellationPolicyScreenContract$InputData.getClass();
                                w0Var.d = travelHotelsCancellationPolicyScreenContract$InputData;
                                break;
                        }
                        return (x0) w0Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsCancellationPolicyScreen.R;
                        x0 x0Var = (x0) travelHotelsCancellationPolicyScreen.O.getValue();
                        switch (x0Var.f141845a) {
                            case 0:
                                return (g) x0Var.f141847c.get();
                            default:
                                return (g) x0Var.f141847c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsCancellationPolicyScreen.R;
                        TravelHotelsCancellationPolicyScreen travelHotelsCancellationPolicyScreen2 = this.f244268b;
                        return tki.g.a(travelHotelsCancellationPolicyScreen2, (g) travelHotelsCancellationPolicyScreen2.P.getValue(), u.c(travelHotelsCancellationPolicyScreen2.L), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: qbg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsCancellationPolicyScreen f244268b;

            {
                this.f244268b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelHotelsCancellationPolicyScreen travelHotelsCancellationPolicyScreen = this.f244268b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsCancellationPolicyScreen.R;
                        qji.b bVarU2 = travelHotelsCancellationPolicyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.di.TravelHotelsCancellationPolicyScreenInjector");
                        w0 w0Var = (w0) ((tbg.a) bVarU2).j().mo3808a(travelHotelsCancellationPolicyScreen);
                        TravelHotelsCancellationPolicyScreenContract$InputData travelHotelsCancellationPolicyScreenContract$InputData = travelHotelsCancellationPolicyScreen.K;
                        switch (w0Var.f141839a) {
                            case 0:
                                travelHotelsCancellationPolicyScreenContract$InputData.getClass();
                                w0Var.d = travelHotelsCancellationPolicyScreenContract$InputData;
                                break;
                            default:
                                travelHotelsCancellationPolicyScreenContract$InputData.getClass();
                                w0Var.d = travelHotelsCancellationPolicyScreenContract$InputData;
                                break;
                        }
                        return (x0) w0Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsCancellationPolicyScreen.R;
                        x0 x0Var = (x0) travelHotelsCancellationPolicyScreen.O.getValue();
                        switch (x0Var.f141845a) {
                            case 0:
                                return (g) x0Var.f141847c.get();
                            default:
                                return (g) x0Var.f141847c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsCancellationPolicyScreen.R;
                        TravelHotelsCancellationPolicyScreen travelHotelsCancellationPolicyScreen2 = this.f244268b;
                        return tki.g.a(travelHotelsCancellationPolicyScreen2, (g) travelHotelsCancellationPolicyScreen2.P.getValue(), u.c(travelHotelsCancellationPolicyScreen2.L), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        qbg.h uiState = (qbg.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Clause clause = uiState.f244275b;
        navBarWithToolbar.setDescriptionVisible(clause != null);
        if (clause != null) {
            navBarWithToolbar.setDescriptionText(clause);
        }
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.f244276c ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_room_options_cancellation_window_timeline_header_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().f174564b.setText(new TextLocalisedClause(R$string.hotels_booking_details_manage_booking_cancellation_timeline_cancel_button_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new qbg.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new qbg.c(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }
}

package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import c9g.l;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import g9g.z0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import t73.z2;
import tcg.c;
import tcg.d;
import tcg.m;
import tcg.n;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/location_picker/TravelHotelsLocationPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltcg/m;", "Ldli/a;", "Ltcg/o;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsLocationPickerScreen extends ViewController<m> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TravelHotelsLocationPickerScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsLocationPickerBinding;", 0))};
    public final int K;
    public final boolean L;
    public final RowDelegate M;
    public final FooterTextDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public TravelHotelsLocationPickerScreen(TravelHotelsLocationPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_hotels_location_picker;
        this.L = true;
        this.M = new RowDelegate(null, null, 7);
        this.N = new FooterTextDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: tcg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsLocationPickerScreen f269778b;

            {
                this.f269778b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsLocationPickerScreen.S;
                        TravelHotelsLocationPickerScreen travelHotelsLocationPickerScreen = this.f269778b;
                        return dli.f.a(travelHotelsLocationPickerScreen, travelHotelsLocationPickerScreen.R2(), zhm.v.k(travelHotelsLocationPickerScreen.M, travelHotelsLocationPickerScreen.N, new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.travelHotelsLocationPickerScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsLocationPickerScreen.S;
                        z0 z0Var = (z0) this.f269778b.Q.getValue();
                        switch (z0Var.f141864a) {
                            case 0:
                                return (n) z0Var.f141869j.get();
                            case 1:
                                return (n) z0Var.f141869j.get();
                            default:
                                return (n) z0Var.f141869j.get();
                        }
                }
            }
        });
        this.P = s.t(this, c.f);
        this.Q = w.y0(new sw6.a(this, inputData, 14));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: tcg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsLocationPickerScreen f269778b;

            {
                this.f269778b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsLocationPickerScreen.S;
                        TravelHotelsLocationPickerScreen travelHotelsLocationPickerScreen = this.f269778b;
                        return dli.f.a(travelHotelsLocationPickerScreen, travelHotelsLocationPickerScreen.R2(), zhm.v.k(travelHotelsLocationPickerScreen.M, travelHotelsLocationPickerScreen.N, new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.travelHotelsLocationPickerScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsLocationPickerScreen.S;
                        z0 z0Var = (z0) this.f269778b.Q.getValue();
                        switch (z0Var.f141864a) {
                            case 0:
                                return (n) z0Var.f141869j.get();
                            case 1:
                                return (n) z0Var.f141869j.get();
                            default:
                                return (n) z0Var.f141869j.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        tcg.o uiState = (tcg.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f22410b.setHints(uiState.f269797b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z0) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f22410b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.j0(false);
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.E0();
        kli.c.d(navBarWithToolbar, 300L);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22410b.f59409p.f57336l), null, new t05.m(this, null, 19), 3);
        r rVarDistinctUntilChanged = d3().f22410b.f59409p.f57337m.debounce(300L, TimeUnit.MILLISECONDS).map(new z2(new t9b.a(27), 29)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarDistinctUntilChanged), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new tcg.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.e.f121375b), null, new d(this, continuation, 1), 3);
    }

    public final l d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n R2() {
        return (n) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}

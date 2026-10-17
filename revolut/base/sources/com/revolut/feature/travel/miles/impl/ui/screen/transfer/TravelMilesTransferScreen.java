package com.revolut.feature.travel.miles.impl.ui.screen.transfer;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AmountDualEditDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.TravelMilesTransferScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p40.n;
import pe2.c;
import pig.e;
import pig.g;
import pig.i;
import pig.m;
import pig.p;
import rfg.d;
import te0.w;
import ufg.l0;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/transfer/TravelMilesTransferScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpig/m;", "Ldli/a;", "Lpig/p;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesTransferScreen extends ViewController<m> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TravelMilesTransferScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenMilesTopUpBinding;", 0))};
    public final h K;
    public final FullScreenStateDelegate L;
    public final AmountDualEditDelegate M;
    public final RowDelegate N;
    public final int O;
    public final boolean P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TravelMilesTransferScreen(TravelMilesTransferScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, e.f);
        this.L = new FullScreenStateDelegate();
        this.M = new AmountDualEditDelegate(new n(this, 10));
        this.N = new RowDelegate(null, null, 7);
        this.O = R$layout.screen_miles_top_up;
        this.P = true;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: pig.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesTransferScreen f236478b;

            {
                this.f236478b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesTransferScreen.T;
                        TravelMilesTransferScreen travelMilesTransferScreen = this.f236478b;
                        return dli.f.a(travelMilesTransferScreen, travelMilesTransferScreen.d(), zhm.v.k(travelMilesTransferScreen.L, travelMilesTransferScreen.M, travelMilesTransferScreen.N), R$id.milesTopUp_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesTransferScreen.T;
                        l0 l0Var = (l0) this.f236478b.R.getValue();
                        switch (l0Var.f279762a) {
                            case 0:
                                return (o) l0Var.f279765g.get();
                            default:
                                return (o) l0Var.f279765g.get();
                        }
                }
            }
        });
        this.R = w.y0(new c(this, inputData, 8));
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: pig.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesTransferScreen f236478b;

            {
                this.f236478b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesTransferScreen.T;
                        TravelMilesTransferScreen travelMilesTransferScreen = this.f236478b;
                        return dli.f.a(travelMilesTransferScreen, travelMilesTransferScreen.d(), zhm.v.k(travelMilesTransferScreen.L, travelMilesTransferScreen.M, travelMilesTransferScreen.N), R$id.milesTopUp_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesTransferScreen.T;
                        l0 l0Var = (l0) this.f236478b.R.getValue();
                        switch (l0Var.f279762a) {
                            case 0:
                                return (o) l0Var.f279765g.get();
                            default:
                                return (o) l0Var.f279765g.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        pig.n nVar = qVar instanceof pig.n ? (pig.n) qVar : null;
        d3().f253785c.setEnabled(uiState.f236494c);
        if (nVar == null || nVar.f236491a) {
            d3().f253784b.setToolbarDescription(uiState.f236493b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l0) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithAvatar navBarWithAvatar = d3().f253784b;
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
        navBarWithAvatar.setToolbarTitle(new TextLocalisedClause(R$string.miles_airlines_action_button_title, null, null, 14));
        LargeActionButton largeActionButton = d3().f253785c;
        largeActionButton.setText(new TextLocalisedClause(R$string.miles_top_up_action_button_title, null, null, 14));
        largeActionButton.setLoadingButtonTag("TOP_UP_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253784b.f59338a), null, new g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253785c.o), null, new g(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52371h.f121375b), null, new pig.h(this, null), 3);
        AmountDualEditDelegate amountDualEditDelegate = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(amountDualEditDelegate.e.f121375b), null, new g(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(amountDualEditDelegate.k.f121375b), null, new g(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53218h), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253784b.f59343j), null, new g(this, continuation, 4), 3);
    }

    public final d d3() {
        ViewBinding value = this.K.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final pig.o d() {
        return (pig.o) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}

package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreenContract$InputData;
import dli.a;
import dli.c;
import gul.n;
import gvi.b;
import gvi.d;
import gvi.f;
import gvi.g;
import gvi.j;
import gvi.l;
import gvi.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/traveller_details/AsftTravellerDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgvi/j;", "Ldli/a;", "Lgvi/m;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsftTravellerDetailsScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AsftTravellerDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final AsftTravellerDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public AsftTravellerDetailsScreen(AsftTravellerDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, d.f);
        this.N = w.y0(new b(0));
        this.O = w.y0(new b(1));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: gvi.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftTravellerDetailsScreen f147179b;

            {
                this.f147179b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AsftTravellerDetailsScreen asftTravellerDetailsScreen = this.f147179b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AsftTravellerDetailsScreen.S;
                        AsftTravellerDetailsScreen asftTravellerDetailsScreen2 = this.f147179b;
                        return dli.f.a(asftTravellerDetailsScreen2, asftTravellerDetailsScreen2.R2(), v.k(new ListSubheaderDelegate(), (InputTextDelegate) asftTravellerDetailsScreen2.N.getValue(), (FullScreenStateDelegate) asftTravellerDetailsScreen2.O.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftTravellerDetailsScreen.S;
                        qji.b bVarU2 = asftTravellerDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.di.AsftTravellerDetailsScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        lti.g gVar = kVar.f199922a;
                        lti.k kVar2 = kVar.f199923b;
                        AsftTravellerDetailsScreenContract$InputData asftTravellerDetailsScreenContract$InputData = asftTravellerDetailsScreen.K;
                        asftTravellerDetailsScreenContract$InputData.getClass();
                        return new lti.s(gVar, kVar2, asftTravellerDetailsScreen, asftTravellerDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftTravellerDetailsScreen.S;
                        return (l) ((lti.s) asftTravellerDetailsScreen.Q.getValue()).f199954g.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: gvi.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftTravellerDetailsScreen f147179b;

            {
                this.f147179b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AsftTravellerDetailsScreen asftTravellerDetailsScreen = this.f147179b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftTravellerDetailsScreen.S;
                        AsftTravellerDetailsScreen asftTravellerDetailsScreen2 = this.f147179b;
                        return dli.f.a(asftTravellerDetailsScreen2, asftTravellerDetailsScreen2.R2(), v.k(new ListSubheaderDelegate(), (InputTextDelegate) asftTravellerDetailsScreen2.N.getValue(), (FullScreenStateDelegate) asftTravellerDetailsScreen2.O.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftTravellerDetailsScreen.S;
                        qji.b bVarU2 = asftTravellerDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.di.AsftTravellerDetailsScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        lti.g gVar = kVar.f199922a;
                        lti.k kVar2 = kVar.f199923b;
                        AsftTravellerDetailsScreenContract$InputData asftTravellerDetailsScreenContract$InputData = asftTravellerDetailsScreen.K;
                        asftTravellerDetailsScreenContract$InputData.getClass();
                        return new lti.s(gVar, kVar2, asftTravellerDetailsScreen, asftTravellerDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftTravellerDetailsScreen.S;
                        return (l) ((lti.s) asftTravellerDetailsScreen.Q.getValue()).f199954g.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: gvi.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftTravellerDetailsScreen f147179b;

            {
                this.f147179b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AsftTravellerDetailsScreen asftTravellerDetailsScreen = this.f147179b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftTravellerDetailsScreen.S;
                        AsftTravellerDetailsScreen asftTravellerDetailsScreen2 = this.f147179b;
                        return dli.f.a(asftTravellerDetailsScreen2, asftTravellerDetailsScreen2.R2(), v.k(new ListSubheaderDelegate(), (InputTextDelegate) asftTravellerDetailsScreen2.N.getValue(), (FullScreenStateDelegate) asftTravellerDetailsScreen2.O.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftTravellerDetailsScreen.S;
                        qji.b bVarU2 = asftTravellerDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.di.AsftTravellerDetailsScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        lti.g gVar = kVar.f199922a;
                        lti.k kVar2 = kVar.f199923b;
                        AsftTravellerDetailsScreenContract$InputData asftTravellerDetailsScreenContract$InputData = asftTravellerDetailsScreen.K;
                        asftTravellerDetailsScreenContract$InputData.getClass();
                        return new lti.s(gVar, kVar2, asftTravellerDetailsScreen, asftTravellerDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftTravellerDetailsScreen.S;
                        return (l) ((lti.s) asftTravellerDetailsScreen.Q.getValue()).f199954g.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton largeActionButton = d3().f174557b;
        boolean z = uiState.f147189b;
        boolean z3 = uiState.d;
        largeActionButton.setEnabled(z && !z3);
        largeActionButton.setText(uiState.f147190c);
        largeActionButton.L(z3);
        d3().f174558c.setTextClause(uiState.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (lti.s) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.asft_traveller_details_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.asft_traveller_details_description, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new gvi.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new gvi.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174558c.f58608l), new n(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) this.N.getValue()).e.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), new g(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}

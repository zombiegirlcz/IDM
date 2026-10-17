package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ExtraLargeListingCardDelegate;
import com.revolut.core.ui_kit.delegates.ExtraLargeListingCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.AsftTerminalSelectionScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.AsftTerminalSelectionScreenContract$InputData;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lti.p;
import sq5.j;
import sui.f;
import sui.g;
import sui.k;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/terminal_selection/AsftTerminalSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/terminal_selection/a;", "Ldli/a;", "Lsui/k;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsftTerminalSelectionScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AsftTerminalSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final AsftTerminalSelectionScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public AsftTerminalSelectionScreen(AsftTerminalSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, sui.b.f);
        this.N = w.y0(new j(10));
        this.O = w.y0(new j(11));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: sui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftTerminalSelectionScreen f265773b;

            {
                this.f265773b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AsftTerminalSelectionScreen asftTerminalSelectionScreen = this.f265773b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AsftTerminalSelectionScreen.S;
                        AsftTerminalSelectionScreen asftTerminalSelectionScreen2 = this.f265773b;
                        return dli.f.a(asftTerminalSelectionScreen2, asftTerminalSelectionScreen2.R2(), v.k((FullScreenStateDelegate) asftTerminalSelectionScreen2.N.getValue(), (ExtraLargeListingCardDelegate) asftTerminalSelectionScreen2.O.getValue(), new ExtraLargeListingCardLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftTerminalSelectionScreen.S;
                        qji.b bVarU2 = asftTerminalSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.di.AsftTerminalSelectionScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        lti.g gVar = kVar.f199922a;
                        lti.k kVar2 = kVar.f199923b;
                        AsftTerminalSelectionScreenContract$InputData asftTerminalSelectionScreenContract$InputData = asftTerminalSelectionScreen.K;
                        asftTerminalSelectionScreenContract$InputData.getClass();
                        return new p(gVar, kVar2, asftTerminalSelectionScreen, asftTerminalSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftTerminalSelectionScreen.S;
                        return (j) ((p) asftTerminalSelectionScreen.Q.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: sui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftTerminalSelectionScreen f265773b;

            {
                this.f265773b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AsftTerminalSelectionScreen asftTerminalSelectionScreen = this.f265773b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftTerminalSelectionScreen.S;
                        AsftTerminalSelectionScreen asftTerminalSelectionScreen2 = this.f265773b;
                        return dli.f.a(asftTerminalSelectionScreen2, asftTerminalSelectionScreen2.R2(), v.k((FullScreenStateDelegate) asftTerminalSelectionScreen2.N.getValue(), (ExtraLargeListingCardDelegate) asftTerminalSelectionScreen2.O.getValue(), new ExtraLargeListingCardLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftTerminalSelectionScreen.S;
                        qji.b bVarU2 = asftTerminalSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.di.AsftTerminalSelectionScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        lti.g gVar = kVar.f199922a;
                        lti.k kVar2 = kVar.f199923b;
                        AsftTerminalSelectionScreenContract$InputData asftTerminalSelectionScreenContract$InputData = asftTerminalSelectionScreen.K;
                        asftTerminalSelectionScreenContract$InputData.getClass();
                        return new p(gVar, kVar2, asftTerminalSelectionScreen, asftTerminalSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftTerminalSelectionScreen.S;
                        return (j) ((p) asftTerminalSelectionScreen.Q.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: sui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftTerminalSelectionScreen f265773b;

            {
                this.f265773b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AsftTerminalSelectionScreen asftTerminalSelectionScreen = this.f265773b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftTerminalSelectionScreen.S;
                        AsftTerminalSelectionScreen asftTerminalSelectionScreen2 = this.f265773b;
                        return dli.f.a(asftTerminalSelectionScreen2, asftTerminalSelectionScreen2.R2(), v.k((FullScreenStateDelegate) asftTerminalSelectionScreen2.N.getValue(), (ExtraLargeListingCardDelegate) asftTerminalSelectionScreen2.O.getValue(), new ExtraLargeListingCardLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftTerminalSelectionScreen.S;
                        qji.b bVarU2 = asftTerminalSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.di.AsftTerminalSelectionScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        lti.g gVar = kVar.f199922a;
                        lti.k kVar2 = kVar.f199923b;
                        AsftTerminalSelectionScreenContract$InputData asftTerminalSelectionScreenContract$InputData = asftTerminalSelectionScreen.K;
                        asftTerminalSelectionScreenContract$InputData.getClass();
                        return new p(gVar, kVar2, asftTerminalSelectionScreen, asftTerminalSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftTerminalSelectionScreen.S;
                        return (j) ((p) asftTerminalSelectionScreen.Q.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174539b.setMenuItems(v.l(uiState.f265783b));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.asft_terminals_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.asft_terminals_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new sui.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.o.f57403b), null, new sui.e(this, null, 1), 3);
        ?? r62 = this.O;
        ViewController.P2(this, new ryj.w(rd0.e.b(((ExtraLargeListingCardDelegate) r62.getValue()).f52266c), 26), new f(this, continuation, 0), 3);
        ViewController.P2(this, new ryj.w(rd0.e.b(((ExtraLargeListingCardDelegate) r62.getValue()).d.f121375b), 27), new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), new g(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final sui.j R2() {
        return (sui.j) this.R.getValue();
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

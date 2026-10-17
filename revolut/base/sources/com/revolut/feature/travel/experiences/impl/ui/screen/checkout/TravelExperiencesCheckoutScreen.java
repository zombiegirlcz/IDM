package com.revolut.feature.travel.experiences.impl.ui.screen.checkout;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.feature.travel.experiences.impl.ui.screen.checkout.TravelExperiencesCheckoutScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.checkout.TravelExperiencesCheckoutScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import grl.k9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import x1e.g;
import x1g.b;
import x1g.c;
import x1g.d;
import x1g.f;
import x1g.l;
import x1g.n;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/checkout/TravelExperiencesCheckoutScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lx1g/l;", "Ldli/a;", "Lx1g/n;", "Lno/m;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesCheckoutScreen extends ViewController<l> implements a, m {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(TravelExperiencesCheckoutScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenExperiencesCheckoutBinding;", 0))};
    public final TravelExperiencesCheckoutScreenContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final int M;
    public final boolean N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f93046a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f93047b0;

    public TravelExperiencesCheckoutScreen(TravelExperiencesCheckoutScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137510y;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.M = R$layout.screen_experiences_checkout;
        this.N = true;
        this.O = s.t(this, b.f);
        this.P = w.y0(new g(4));
        this.Q = w.y0(new g(7));
        this.R = w.y0(new g(8));
        this.S = w.y0(new g(9));
        this.T = w.y0(new g(10));
        this.U = w.y0(new g(11));
        this.V = w.y0(new g(12));
        this.W = w.y0(new g(5));
        this.X = w.y0(new g(6));
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: x1g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesCheckoutScreen f302402b;

            {
                this.f302402b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelExperiencesCheckoutScreen travelExperiencesCheckoutScreen = this.f302402b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesCheckoutScreen.c0;
                        return new ScrollerDelegate(zhm.u.c((AttributeSelectorSmallDelegate) travelExperiencesCheckoutScreen.X.getValue()), false);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelExperiencesCheckoutScreen.c0;
                        qji.b bVarU2 = travelExperiencesCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.checkout.di.TravelExperiencesCheckoutScreenInjector");
                        z0g.f fVar = (z0g.f) bVarU2;
                        z0g.b bVar = fVar.f318359b;
                        z0g.f fVar2 = fVar.f318360c;
                        TravelExperiencesCheckoutScreenContract$InputData travelExperiencesCheckoutScreenContract$InputData = travelExperiencesCheckoutScreen.K;
                        travelExperiencesCheckoutScreenContract$InputData.getClass();
                        return new z0g.g(bVar, fVar2, travelExperiencesCheckoutScreen, travelExperiencesCheckoutScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = TravelExperiencesCheckoutScreen.c0;
                        return (m) ((z0g.g) travelExperiencesCheckoutScreen.Z.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr4 = TravelExperiencesCheckoutScreen.c0;
                        TravelExperiencesCheckoutScreen travelExperiencesCheckoutScreen2 = this.f302402b;
                        return dli.f.a(travelExperiencesCheckoutScreen2, travelExperiencesCheckoutScreen2.R2(), zhm.v.k(new FooterTextDelegate(), (RowDelegate) travelExperiencesCheckoutScreen2.P.getValue(), (RowLoadingDelegate) travelExperiencesCheckoutScreen2.Q.getValue(), (ListSubheaderDelegate) travelExperiencesCheckoutScreen2.R.getValue(), (RoomPreviewCardDelegate) travelExperiencesCheckoutScreen2.S.getValue(), (CellDetailsDelegate) travelExperiencesCheckoutScreen2.T.getValue(), (CellDetailsPriceDelegate) travelExperiencesCheckoutScreen2.U.getValue(), (CellDetailsBadgeDelegate) travelExperiencesCheckoutScreen2.V.getValue(), (TextDelegate) travelExperiencesCheckoutScreen2.W.getValue(), (ScrollerDelegate) travelExperiencesCheckoutScreen2.Y.getValue()), R$id.experiencesCheckout_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: x1g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesCheckoutScreen f302402b;

            {
                this.f302402b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelExperiencesCheckoutScreen travelExperiencesCheckoutScreen = this.f302402b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesCheckoutScreen.c0;
                        return new ScrollerDelegate(zhm.u.c((AttributeSelectorSmallDelegate) travelExperiencesCheckoutScreen.X.getValue()), false);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelExperiencesCheckoutScreen.c0;
                        qji.b bVarU2 = travelExperiencesCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.checkout.di.TravelExperiencesCheckoutScreenInjector");
                        z0g.f fVar = (z0g.f) bVarU2;
                        z0g.b bVar = fVar.f318359b;
                        z0g.f fVar2 = fVar.f318360c;
                        TravelExperiencesCheckoutScreenContract$InputData travelExperiencesCheckoutScreenContract$InputData = travelExperiencesCheckoutScreen.K;
                        travelExperiencesCheckoutScreenContract$InputData.getClass();
                        return new z0g.g(bVar, fVar2, travelExperiencesCheckoutScreen, travelExperiencesCheckoutScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = TravelExperiencesCheckoutScreen.c0;
                        return (m) ((z0g.g) travelExperiencesCheckoutScreen.Z.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr4 = TravelExperiencesCheckoutScreen.c0;
                        TravelExperiencesCheckoutScreen travelExperiencesCheckoutScreen2 = this.f302402b;
                        return dli.f.a(travelExperiencesCheckoutScreen2, travelExperiencesCheckoutScreen2.R2(), zhm.v.k(new FooterTextDelegate(), (RowDelegate) travelExperiencesCheckoutScreen2.P.getValue(), (RowLoadingDelegate) travelExperiencesCheckoutScreen2.Q.getValue(), (ListSubheaderDelegate) travelExperiencesCheckoutScreen2.R.getValue(), (RoomPreviewCardDelegate) travelExperiencesCheckoutScreen2.S.getValue(), (CellDetailsDelegate) travelExperiencesCheckoutScreen2.T.getValue(), (CellDetailsPriceDelegate) travelExperiencesCheckoutScreen2.U.getValue(), (CellDetailsBadgeDelegate) travelExperiencesCheckoutScreen2.V.getValue(), (TextDelegate) travelExperiencesCheckoutScreen2.W.getValue(), (ScrollerDelegate) travelExperiencesCheckoutScreen2.Y.getValue()), R$id.experiencesCheckout_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.f93046a0 = w.y0(new Function0(this) { // from class: x1g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesCheckoutScreen f302402b;

            {
                this.f302402b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelExperiencesCheckoutScreen travelExperiencesCheckoutScreen = this.f302402b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesCheckoutScreen.c0;
                        return new ScrollerDelegate(zhm.u.c((AttributeSelectorSmallDelegate) travelExperiencesCheckoutScreen.X.getValue()), false);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelExperiencesCheckoutScreen.c0;
                        qji.b bVarU2 = travelExperiencesCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.checkout.di.TravelExperiencesCheckoutScreenInjector");
                        z0g.f fVar = (z0g.f) bVarU2;
                        z0g.b bVar = fVar.f318359b;
                        z0g.f fVar2 = fVar.f318360c;
                        TravelExperiencesCheckoutScreenContract$InputData travelExperiencesCheckoutScreenContract$InputData = travelExperiencesCheckoutScreen.K;
                        travelExperiencesCheckoutScreenContract$InputData.getClass();
                        return new z0g.g(bVar, fVar2, travelExperiencesCheckoutScreen, travelExperiencesCheckoutScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = TravelExperiencesCheckoutScreen.c0;
                        return (m) ((z0g.g) travelExperiencesCheckoutScreen.Z.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr4 = TravelExperiencesCheckoutScreen.c0;
                        TravelExperiencesCheckoutScreen travelExperiencesCheckoutScreen2 = this.f302402b;
                        return dli.f.a(travelExperiencesCheckoutScreen2, travelExperiencesCheckoutScreen2.R2(), zhm.v.k(new FooterTextDelegate(), (RowDelegate) travelExperiencesCheckoutScreen2.P.getValue(), (RowLoadingDelegate) travelExperiencesCheckoutScreen2.Q.getValue(), (ListSubheaderDelegate) travelExperiencesCheckoutScreen2.R.getValue(), (RoomPreviewCardDelegate) travelExperiencesCheckoutScreen2.S.getValue(), (CellDetailsDelegate) travelExperiencesCheckoutScreen2.T.getValue(), (CellDetailsPriceDelegate) travelExperiencesCheckoutScreen2.U.getValue(), (CellDetailsBadgeDelegate) travelExperiencesCheckoutScreen2.V.getValue(), (TextDelegate) travelExperiencesCheckoutScreen2.W.getValue(), (ScrollerDelegate) travelExperiencesCheckoutScreen2.Y.getValue()), R$id.experiencesCheckout_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.f93047b0 = w.y0(new Function0(this) { // from class: x1g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesCheckoutScreen f302402b;

            {
                this.f302402b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TravelExperiencesCheckoutScreen travelExperiencesCheckoutScreen = this.f302402b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesCheckoutScreen.c0;
                        return new ScrollerDelegate(zhm.u.c((AttributeSelectorSmallDelegate) travelExperiencesCheckoutScreen.X.getValue()), false);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelExperiencesCheckoutScreen.c0;
                        qji.b bVarU2 = travelExperiencesCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.checkout.di.TravelExperiencesCheckoutScreenInjector");
                        z0g.f fVar = (z0g.f) bVarU2;
                        z0g.b bVar = fVar.f318359b;
                        z0g.f fVar2 = fVar.f318360c;
                        TravelExperiencesCheckoutScreenContract$InputData travelExperiencesCheckoutScreenContract$InputData = travelExperiencesCheckoutScreen.K;
                        travelExperiencesCheckoutScreenContract$InputData.getClass();
                        return new z0g.g(bVar, fVar2, travelExperiencesCheckoutScreen, travelExperiencesCheckoutScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = TravelExperiencesCheckoutScreen.c0;
                        return (m) ((z0g.g) travelExperiencesCheckoutScreen.Z.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr4 = TravelExperiencesCheckoutScreen.c0;
                        TravelExperiencesCheckoutScreen travelExperiencesCheckoutScreen2 = this.f302402b;
                        return dli.f.a(travelExperiencesCheckoutScreen2, travelExperiencesCheckoutScreen2.R2(), zhm.v.k(new FooterTextDelegate(), (RowDelegate) travelExperiencesCheckoutScreen2.P.getValue(), (RowLoadingDelegate) travelExperiencesCheckoutScreen2.Q.getValue(), (ListSubheaderDelegate) travelExperiencesCheckoutScreen2.R.getValue(), (RoomPreviewCardDelegate) travelExperiencesCheckoutScreen2.S.getValue(), (CellDetailsDelegate) travelExperiencesCheckoutScreen2.T.getValue(), (CellDetailsPriceDelegate) travelExperiencesCheckoutScreen2.U.getValue(), (CellDetailsBadgeDelegate) travelExperiencesCheckoutScreen2.V.getValue(), (TextDelegate) travelExperiencesCheckoutScreen2.W.getValue(), (ScrollerDelegate) travelExperiencesCheckoutScreen2.Y.getValue()), R$id.experiencesCheckout_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LargeActionButton largeActionButton = d3().f293700c;
        largeActionButton.setText(uiState.f302430b);
        largeActionButton.setEnabled(uiState.f302431c);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z0g.g) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f293699b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
        NavBarWithToolbar experiencesCheckoutNavBarWithToolbar = d3().f293699b;
        Intrinsics.checkNotNullExpressionValue(experiencesCheckoutNavBarWithToolbar, "experiencesCheckoutNavBarWithToolbar");
        experiencesCheckoutNavBarWithToolbar.setTitle(new TextLocalisedClause(R$string.experiences_checkout_title, null, null, 14), null);
        d3().f293699b.setToolbarTitle(new TextLocalisedClause(R$string.experiences_checkout_title, null, null, 14));
        d3().f293700c.o(LargeActionButton.ButtonStyle.f58725a);
        ((j60.a) ((z0g.g) this.Z.getValue()).e.get()).d(v.k((RowDelegate) this.P.getValue(), (CellDetailsPriceDelegate) this.U.getValue()));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f293699b.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f293700c.o), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((TextDelegate) this.W.getValue()).d), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((ListSubheaderDelegate) this.R.getValue()).f52707c), new x1g.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((AttributeSelectorSmallDelegate) this.X.getValue()).p()), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsPriceDelegate) this.U.getValue()).f51887c), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), new x1g.g(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsDelegate) this.T.getValue()).d), new x1g.h(this, null), 3);
    }

    public final w0g.e d3() {
        ViewBinding value = this.O.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w0g.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final x1g.m R2() {
        return (x1g.m) this.f93046a0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f93047b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}

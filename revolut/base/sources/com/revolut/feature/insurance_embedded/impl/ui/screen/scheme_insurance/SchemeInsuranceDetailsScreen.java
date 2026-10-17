package com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.f2;
import au0.m0;
import au0.s0;
import au0.u0;
import au0.v0;
import aw0.s8;
import cli.o;
import co7.c;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_embedded.impl.R$id;
import com.revolut.feature.insurance_embedded.impl.R$layout;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.SchemeInsuranceDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import cvi.j;
import cw7.b;
import cw7.d;
import cw7.g;
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
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/scheme_insurance/SchemeInsuranceDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lcw7/h;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SchemeInsuranceDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SchemeInsuranceDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_embedded/impl/databinding/ScreenEmbeddedInsurancePolicyBinding;", 0))};
    public final int K;
    public final RowDelegate L;
    public final LargeActionButtonDelegate M;
    public final PlainTextWarningDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public SchemeInsuranceDetailsScreen(SchemeInsuranceDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_embedded_insurance_policy;
        this.L = new RowDelegate(null, null, 7);
        this.M = new LargeActionButtonDelegate();
        this.N = new PlainTextWarningDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: cw7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SchemeInsuranceDetailsScreen f109560b;

            {
                this.f109560b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = SchemeInsuranceDetailsScreen.S;
                        SchemeInsuranceDetailsScreen schemeInsuranceDetailsScreen = this.f109560b;
                        return dli.f.a(schemeInsuranceDetailsScreen, schemeInsuranceDetailsScreen.d(), v.k(schemeInsuranceDetailsScreen.L, schemeInsuranceDetailsScreen.M, schemeInsuranceDetailsScreen.N, new RowLoadingDelegate(), new FullScreenStateDelegate(), new ListSubheaderDelegate()), R$id.screenEmbeddedInsurancePolicy_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = SchemeInsuranceDetailsScreen.S;
                        return (g) ((lu7.w) this.f109560b.Q.getValue()).f200187g.get();
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = w.y0(new cvi.b(this, inputData, 1));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: cw7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SchemeInsuranceDetailsScreen f109560b;

            {
                this.f109560b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SchemeInsuranceDetailsScreen.S;
                        SchemeInsuranceDetailsScreen schemeInsuranceDetailsScreen = this.f109560b;
                        return dli.f.a(schemeInsuranceDetailsScreen, schemeInsuranceDetailsScreen.d(), v.k(schemeInsuranceDetailsScreen.L, schemeInsuranceDetailsScreen.M, schemeInsuranceDetailsScreen.N, new RowLoadingDelegate(), new FullScreenStateDelegate(), new ListSubheaderDelegate()), R$id.screenEmbeddedInsurancePolicy_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = SchemeInsuranceDetailsScreen.S;
                        return (g) ((lu7.w) this.f109560b.Q.getValue()).f200187g.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        cw7.h uiState = (cw7.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithBigTile navBarWithBigTile = d3().f168537b;
        Image image = uiState.f109562a;
        Clause clause = uiState.f109563b;
        navBarWithBigTile.setPages(u.c(new u0(new NavBarWithContainerBackground.ImageBackground(image, (s8) null, (Color.SolidRes) null, 14), null, null, null)), f2.LINE_INDICATOR, v0.NONE);
        navBarWithBigTile.setTitle(clause);
        navBarWithBigTile.setToolbarTitle(clause);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (lu7.w) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f168537b;
        navBarWithBigTile.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.FULL_GRADIENT);
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f168537b.f59357t), null, new c(this, continuation, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53218h), null, new cw7.c(this, null), 3);
        ?? r62 = this.Q;
        j60.a aVar = (j60.a) ((lu7.w) r62.getValue()).d.get();
        LargeActionButtonDelegate largeActionButtonDelegate = this.M;
        aVar.d(u.c(largeActionButtonDelegate));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((j60.a) ((lu7.w) r62.getValue()).d.get()).C()), null, new j(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(largeActionButtonDelegate.d.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.d.f121375b), null, new cw7.e(this, null), 3);
    }

    public final iu7.e d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (iu7.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.R.getValue();
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
}

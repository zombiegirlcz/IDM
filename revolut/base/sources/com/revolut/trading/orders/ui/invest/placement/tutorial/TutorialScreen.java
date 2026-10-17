package com.revolut.trading.orders.ui.invest.placement.tutorial;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.trading.orders.ui.invest.placement.tutorial.TutorialScreen;
import com.revolut.trading.orders.ui.invest.placement.tutorial.TutorialScreenContract$InputData;
import dli.a;
import idf.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sq5.j;
import sul.c;
import sul.g;
import sul.i;
import te0.w;
import vc.s;
import xki.e;
import xsl.p;
import xsl.r;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/tutorial/TutorialScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lidf/b;", "", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TutorialScreen extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TutorialScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final TutorialScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public TutorialScreen(TutorialScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, sul.b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: sul.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TutorialScreen f265791b;

            {
                this.f265791b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TutorialScreen tutorialScreen = this.f265791b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TutorialScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(tutorialScreen.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).O;
                        TutorialScreenContract$InputData tutorialScreenContract$InputData = tutorialScreen.K;
                        tutorialScreenContract$InputData.getClass();
                        return new r(pVar, tutorialScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TutorialScreen.S;
                        return (i) ((r) tutorialScreen.N.getValue()).d.get();
                    case 2:
                        return u.c((TrendViewDelegate) tutorialScreen.P.getValue());
                    default:
                        KProperty[] kPropertyArr3 = TutorialScreen.S;
                        TutorialScreen tutorialScreen2 = this.f265791b;
                        i iVar = (i) tutorialScreen2.O.getValue();
                        List list = (List) tutorialScreen2.Q.getValue();
                        ScreenContentRecyclerView screenRecyclerNavbarFooterNextbuttonRecyclerView = tutorialScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonRecyclerView, "screenRecyclerNavbarFooterNextbuttonRecyclerView");
                        return dli.f.a(tutorialScreen2, iVar, list, screenRecyclerNavbarFooterNextbuttonRecyclerView.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: sul.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TutorialScreen f265791b;

            {
                this.f265791b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TutorialScreen tutorialScreen = this.f265791b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TutorialScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(tutorialScreen.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).O;
                        TutorialScreenContract$InputData tutorialScreenContract$InputData = tutorialScreen.K;
                        tutorialScreenContract$InputData.getClass();
                        return new r(pVar, tutorialScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TutorialScreen.S;
                        return (i) ((r) tutorialScreen.N.getValue()).d.get();
                    case 2:
                        return u.c((TrendViewDelegate) tutorialScreen.P.getValue());
                    default:
                        KProperty[] kPropertyArr3 = TutorialScreen.S;
                        TutorialScreen tutorialScreen2 = this.f265791b;
                        i iVar = (i) tutorialScreen2.O.getValue();
                        List list = (List) tutorialScreen2.Q.getValue();
                        ScreenContentRecyclerView screenRecyclerNavbarFooterNextbuttonRecyclerView = tutorialScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonRecyclerView, "screenRecyclerNavbarFooterNextbuttonRecyclerView");
                        return dli.f.a(tutorialScreen2, iVar, list, screenRecyclerNavbarFooterNextbuttonRecyclerView.getId(), null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new j(13));
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: sul.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TutorialScreen f265791b;

            {
                this.f265791b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TutorialScreen tutorialScreen = this.f265791b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TutorialScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(tutorialScreen.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).O;
                        TutorialScreenContract$InputData tutorialScreenContract$InputData = tutorialScreen.K;
                        tutorialScreenContract$InputData.getClass();
                        return new r(pVar, tutorialScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TutorialScreen.S;
                        return (i) ((r) tutorialScreen.N.getValue()).d.get();
                    case 2:
                        return u.c((TrendViewDelegate) tutorialScreen.P.getValue());
                    default:
                        KProperty[] kPropertyArr3 = TutorialScreen.S;
                        TutorialScreen tutorialScreen2 = this.f265791b;
                        i iVar = (i) tutorialScreen2.O.getValue();
                        List list = (List) tutorialScreen2.Q.getValue();
                        ScreenContentRecyclerView screenRecyclerNavbarFooterNextbuttonRecyclerView = tutorialScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonRecyclerView, "screenRecyclerNavbarFooterNextbuttonRecyclerView");
                        return dli.f.a(tutorialScreen2, iVar, list, screenRecyclerNavbarFooterNextbuttonRecyclerView.getId(), null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: sul.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TutorialScreen f265791b;

            {
                this.f265791b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TutorialScreen tutorialScreen = this.f265791b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TutorialScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(tutorialScreen.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).O;
                        TutorialScreenContract$InputData tutorialScreenContract$InputData = tutorialScreen.K;
                        tutorialScreenContract$InputData.getClass();
                        return new r(pVar, tutorialScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TutorialScreen.S;
                        return (i) ((r) tutorialScreen.N.getValue()).d.get();
                    case 2:
                        return u.c((TrendViewDelegate) tutorialScreen.P.getValue());
                    default:
                        KProperty[] kPropertyArr3 = TutorialScreen.S;
                        TutorialScreen tutorialScreen2 = this.f265791b;
                        i iVar = (i) tutorialScreen2.O.getValue();
                        List list = (List) tutorialScreen2.Q.getValue();
                        ScreenContentRecyclerView screenRecyclerNavbarFooterNextbuttonRecyclerView = tutorialScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonRecyclerView, "screenRecyclerNavbarFooterNextbuttonRecyclerView");
                        return dli.f.a(tutorialScreen2, iVar, list, screenRecyclerNavbarFooterNextbuttonRecyclerView.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        sul.h uiState = (sul.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        g gVar = uiState.f265799a;
        Clause clause = gVar.f265797a;
        screenRecyclerNavbarFooterNextbuttonToolbar.setTitle(clause, null);
        screenRecyclerNavbarFooterNextbuttonToolbar.setToolbarTitle(clause);
        screenRecyclerNavbarFooterNextbuttonToolbar.setSecondDescriptionText(gVar.f265798b);
        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = d3().f174557b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
        screenRecyclerNavbarFooterNextbuttonButton.setText(uiState.f265801c.f265796a);
        FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView = d3().f174558c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView, "screenRecyclerNavbarFooterNextbuttonFooterView");
        screenRecyclerNavbarFooterNextbuttonFooterView.setTextClause(uiState.d.f265795a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        screenRecyclerNavbarFooterNextbuttonToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        screenRecyclerNavbarFooterNextbuttonToolbar.setDescriptionVisible(false);
        screenRecyclerNavbarFooterNextbuttonToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        ViewController.P2(this, rd0.e.b(screenRecyclerNavbarFooterNextbuttonToolbar.f59410q), new c(this, null, 0), 3);
        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = d3().f174557b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
        ViewController.P2(this, rd0.e.b(screenRecyclerNavbarFooterNextbuttonButton.o), new c(this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF0() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}

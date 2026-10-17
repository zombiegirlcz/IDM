package com.revolut.feature.credit.card.impl.ui.instalment.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.ui.instalment.confirmation.InstalmentConfirmationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ep4.b;
import jii.u;
import jm4.j3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import rr0.f;
import te0.w;
import tr4.c;
import tr4.j;
import tr4.l;
import tr4.n;
import tr4.p;
import tx0.j0;
import vc.s;
import w01.k;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/confirmation/InstalmentConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltr4/j;", "Ldli/a;", "Ltr4/q;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstalmentConfirmationScreen extends ViewController<j> implements dli.a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(InstalmentConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final int L;
    public final h M;
    public f N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public InstalmentConfirmationScreen(InstalmentConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, c.f);
        this.O = w.y0(new tml.a(this, inputData, 9));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: tr4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstalmentConfirmationScreen f273727b;

            {
                this.f273727b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = InstalmentConfirmationScreen.U;
                        return (k) ((j3) this.f273727b.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = InstalmentConfirmationScreen.U;
                        InstalmentConfirmationScreen instalmentConfirmationScreen = this.f273727b;
                        k kVar = (k) instalmentConfirmationScreen.P.getValue();
                        CellDetailsDelegate cellDetailsDelegate = (CellDetailsDelegate) instalmentConfirmationScreen.Q.getValue();
                        ?? r3 = instalmentConfirmationScreen.S;
                        return dli.f.a(instalmentConfirmationScreen, kVar, v.k(cellDetailsDelegate, (RowDelegate) r3.getValue(), new ProgressStepVerticalV2Delegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new SwipeToActionDelegate((RowDelegate) r3.getValue(), false), new ProgressStepVerticalLoadingDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new tl7.a(14));
        this.R = w.y0(new tl7.a(15));
        this.S = w.y0(new tl7.a(16));
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: tr4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstalmentConfirmationScreen f273727b;

            {
                this.f273727b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InstalmentConfirmationScreen.U;
                        return (k) ((j3) this.f273727b.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = InstalmentConfirmationScreen.U;
                        InstalmentConfirmationScreen instalmentConfirmationScreen = this.f273727b;
                        k kVar = (k) instalmentConfirmationScreen.P.getValue();
                        CellDetailsDelegate cellDetailsDelegate = (CellDetailsDelegate) instalmentConfirmationScreen.Q.getValue();
                        ?? r3 = instalmentConfirmationScreen.S;
                        return dli.f.a(instalmentConfirmationScreen, kVar, v.k(cellDetailsDelegate, (RowDelegate) r3.getValue(), new ProgressStepVerticalV2Delegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new SwipeToActionDelegate((RowDelegate) r3.getValue(), false), new ProgressStepVerticalLoadingDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        tr4.q uiState = (tr4.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        p pVar = uiState.f273742a;
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(pVar.f273740a, null);
        navBarWithToolbar.setToolbarTitle(pVar.f273740a);
        navBarWithToolbar.setNavigationButtonImage(pVar.f273741b);
        tr4.o oVar2 = uiState.f273744c;
        if (oVar2 instanceof l) {
            LargeActionButton largeActionButton = d3().f174564b;
            largeActionButton.setText(((l) oVar2).f273737a);
            k.d(largeActionButton);
            f fVar = this.N;
            if (fVar != null) {
                fVar.b(false);
                return;
            } else {
                Intrinsics.r("goToButtonLoadingController");
                throw null;
            }
        }
        if (oVar2 instanceof tr4.m) {
            LargeActionButton goToButton = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
            k.a(goToButton);
            f fVar2 = this.N;
            if (fVar2 != null) {
                fVar2.b(false);
                return;
            } else {
                Intrinsics.r("goToButtonLoadingController");
                throw null;
            }
        }
        if (!(oVar2 instanceof n)) {
            throw new NoWhenBranchMatchedException();
        }
        LargeActionButton goToButton2 = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton2, "goToButton");
        k.d(goToButton2);
        f fVar3 = this.N;
        if (fVar3 != null) {
            fVar3.b(true);
        } else {
            Intrinsics.r("goToButtonLoadingController");
            throw null;
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j3) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (tr4.k) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.N = d3().f174564b.A.V();
        d3().f174565c.setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(((RowDelegate) this.S.getValue()).f53218h), rd0.e.b(d3().f174565c.o.f57403b), rd0.e.b(d3().f174565c.s0()), rd0.e.b(d3().f174565c.x0()), rd0.e.b(((LargeActionButtonDelegate) this.R.getValue()).d.f121375b), rd0.e.b(((CellDetailsDelegate) this.Q.getValue()).d), new t9l.f(rd0.e.b(d3().f174564b.o), 19), new t9l.f(rd0.e.b(d3().f174565c.f59410q), 20)), null, new tna.p(this, null, 5), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}

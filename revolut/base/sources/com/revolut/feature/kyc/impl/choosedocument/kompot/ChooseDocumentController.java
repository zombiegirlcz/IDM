package com.revolut.feature.kyc.impl.choosedocument.kompot;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.kyc.impl.choosedocument.kompot.ChooseDocumentController;
import com.revolut.feature.kyc.impl.choosedocument.kompot.ChooseDocumentScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import jh.d;
import kji.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kr.h2;
import ku8.b;
import ku8.n;
import no.m;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;
import zu8.c;
import zu8.c0;
import zu8.d0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/kyc/impl/choosedocument/kompot/ChooseDocumentController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lku8/n;", "Ldli/a;", "Lku8/q;", "Lno/m;", "Lkji/f;", "Companion", "a", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChooseDocumentController extends ViewController<n> implements dli.a, m, f {
    public final ChooseDocumentScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final AnalyticsProduct T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ChooseDocumentController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinVerticalButtonsBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public ChooseDocumentController(ChooseDocumentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_twin_vertical_buttons;
        this.M = s.t(this, b.f);
        this.N = w.y0(new h2(19));
        this.O = w.y0(new h2(20));
        this.P = w.y0(new h2(21));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: ku8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooseDocumentController f189733b;

            {
                this.f189733b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ChooseDocumentController chooseDocumentController = this.f189733b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChooseDocumentController.U;
                        qji.b bVarU2 = chooseDocumentController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.choosedocument.kompot.di.ChooseDocumentControllerInjector");
                        d0 d0Var = (d0) bVarU2;
                        c0 c0Var = d0Var.f325260c;
                        d0 d0Var2 = d0Var.d;
                        ChooseDocumentScreenContract$InputData chooseDocumentScreenContract$InputData = chooseDocumentController.K;
                        chooseDocumentScreenContract$InputData.getClass();
                        return new zu8.c(c0Var, d0Var2, chooseDocumentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ChooseDocumentController.U;
                        return (o) ((zu8.c) chooseDocumentController.Q.getValue()).f325236c.get();
                    default:
                        KProperty[] kPropertyArr3 = ChooseDocumentController.U;
                        ChooseDocumentController chooseDocumentController2 = this.f189733b;
                        return dli.f.a(chooseDocumentController2, chooseDocumentController2.d(), zhm.v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) chooseDocumentController2.P.getValue(), (SelectableDelegate) chooseDocumentController2.N.getValue(), (SelectableDelegate) chooseDocumentController2.O.getValue()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: ku8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooseDocumentController f189733b;

            {
                this.f189733b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ChooseDocumentController chooseDocumentController = this.f189733b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChooseDocumentController.U;
                        qji.b bVarU2 = chooseDocumentController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.choosedocument.kompot.di.ChooseDocumentControllerInjector");
                        d0 d0Var = (d0) bVarU2;
                        c0 c0Var = d0Var.f325260c;
                        d0 d0Var2 = d0Var.d;
                        ChooseDocumentScreenContract$InputData chooseDocumentScreenContract$InputData = chooseDocumentController.K;
                        chooseDocumentScreenContract$InputData.getClass();
                        return new zu8.c(c0Var, d0Var2, chooseDocumentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ChooseDocumentController.U;
                        return (o) ((zu8.c) chooseDocumentController.Q.getValue()).f325236c.get();
                    default:
                        KProperty[] kPropertyArr3 = ChooseDocumentController.U;
                        ChooseDocumentController chooseDocumentController2 = this.f189733b;
                        return dli.f.a(chooseDocumentController2, chooseDocumentController2.d(), zhm.v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) chooseDocumentController2.P.getValue(), (SelectableDelegate) chooseDocumentController2.N.getValue(), (SelectableDelegate) chooseDocumentController2.O.getValue()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: ku8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooseDocumentController f189733b;

            {
                this.f189733b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ChooseDocumentController chooseDocumentController = this.f189733b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChooseDocumentController.U;
                        qji.b bVarU2 = chooseDocumentController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.choosedocument.kompot.di.ChooseDocumentControllerInjector");
                        d0 d0Var = (d0) bVarU2;
                        c0 c0Var = d0Var.f325260c;
                        d0 d0Var2 = d0Var.d;
                        ChooseDocumentScreenContract$InputData chooseDocumentScreenContract$InputData = chooseDocumentController.K;
                        chooseDocumentScreenContract$InputData.getClass();
                        return new zu8.c(c0Var, d0Var2, chooseDocumentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ChooseDocumentController.U;
                        return (o) ((zu8.c) chooseDocumentController.Q.getValue()).f325236c.get();
                    default:
                        KProperty[] kPropertyArr3 = ChooseDocumentController.U;
                        ChooseDocumentController chooseDocumentController2 = this.f189733b;
                        return dli.f.a(chooseDocumentController2, chooseDocumentController2.d(), zhm.v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) chooseDocumentController2.P.getValue(), (SelectableDelegate) chooseDocumentController2.N.getValue(), (SelectableDelegate) chooseDocumentController2.O.getValue()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.T = inputData.i;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ku8.q uiState = (ku8.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174570b;
        TextLocalisedClause textLocalisedClause = uiState.f189747b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(uiState.f189748c);
        TwinVerticalButton twinVerticalButton = d3().d;
        twinVerticalButton.setMainButtonText(uiState.d);
        twinVerticalButton.setMainButtonEnabled(uiState.e);
        twinVerticalButton.setSecondaryButtonText(uiState.f);
        twinVerticalButton.setSecondaryButtonVisible(uiState.f189749g);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getT() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174570b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        Integer numValueOf = Integer.valueOf(ofm.q.k(q2()));
        ChooseDocumentScreenContract$InputData chooseDocumentScreenContract$InputData = this.K;
        if (!chooseDocumentScreenContract$InputData.k) {
            numValueOf = null;
        }
        navBarWithToolbar.setNavigationButtonIcon(numValueOf);
        if (chooseDocumentScreenContract$InputData.f77596j != null) {
            navBarWithToolbar.setMenuItems(u.c(new TextNavBarMenuItem("HELP_MENU_ITEM_ID", new TextLocalisedClause(R$string.common_action_help, null, null, 14), null, null, 12)));
        }
        TwinVerticalButton twinVerticalButton = d3().d;
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        Intrinsics.checkNotNullExpressionValue(twinVerticalButton.getContext(), "getContext(...)");
        twinVerticalButton.setGradientBackgroundEnabled(!d.g(r0));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((SelectableDelegate) this.N.getValue()).r()), new ku8.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(((SelectableDelegate) this.O.getValue()).r()), new ku8.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b), new ku8.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().d.o0()), new ku8.f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().d.p0()), new ku8.f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174570b.f59410q), new ku8.f(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f174570b.o.f57403b), new ku8.f(this, continuation, 3), 3);
    }

    public final jii.w d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.w) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ku8.o d() {
        return (ku8.o) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}

package com.revolut.feature.credit.autopay.ui.screen.confirm_autopay;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dw3.k9;
import dw3.l9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mc9.n;
import nfj.l;
import nk4.d;
import nk4.f;
import nk4.i;
import nk4.j;
import nk4.m;
import no.k;
import te0.w;
import vc.s;
import xki.e;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/ConfirmAutopayScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/credit/autopay/ui/screen/confirm_autopay/a;", "Ldli/a;", "Lnk4/c;", "Lno/k;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConfirmAutopayScreen extends ViewController<a> implements dli.a, k {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(ConfirmAutopayScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinVerticalButtonsBinding;", 0))};
    public final ConfirmAutopayContract$InputData K;
    public AnalyticsContext L;
    public final h M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public ConfirmAutopayScreen(ConfirmAutopayContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = inputData.getF68626b();
        this.M = s.t(this, f.f);
        this.N = R$layout.screen_recycler_navbar_twin_vertical_buttons;
        this.O = w.y0(new d(0));
        this.P = w.y0(new d(1));
        this.Q = w.y0(new d(2));
        this.R = w.y0(new d(3));
        this.S = w.y0(new d(4));
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: nk4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmAutopayScreen f216649b;

            {
                this.f216649b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConfirmAutopayScreen confirmAutopayScreen = this.f216649b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ConfirmAutopayScreen.W;
                        ConfirmAutopayScreen confirmAutopayScreen2 = this.f216649b;
                        return dli.f.a(confirmAutopayScreen2, confirmAutopayScreen2.d(), v.k((CellDetailsDelegate) confirmAutopayScreen2.O.getValue(), (CellDetailsActionDelegate) confirmAutopayScreen2.P.getValue(), (InputChecklistDelegate) confirmAutopayScreen2.R.getValue(), (RowDelegate) confirmAutopayScreen2.S.getValue(), (FullScreenStateDelegate) confirmAutopayScreen2.Q.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new CellDetailsActionableIconDelegate(), new FooterTextDelegate()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ConfirmAutopayScreen.W;
                        qji.b bVarU2 = confirmAutopayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.di.ConfirmAutopayScreenInjector");
                        k9 k9Var = (k9) ((ok4.a) bVarU2).s().mo3808a(confirmAutopayScreen);
                        ConfirmAutopayContract$InputData confirmAutopayContract$InputData = confirmAutopayScreen.K;
                        switch (k9Var.f119141a) {
                            case 0:
                                confirmAutopayContract$InputData.getClass();
                                k9Var.d = confirmAutopayContract$InputData;
                                break;
                            case 1:
                                confirmAutopayContract$InputData.getClass();
                                k9Var.d = confirmAutopayContract$InputData;
                                break;
                            case 2:
                                confirmAutopayContract$InputData.getClass();
                                k9Var.d = confirmAutopayContract$InputData;
                                break;
                            case 3:
                                confirmAutopayContract$InputData.getClass();
                                k9Var.d = confirmAutopayContract$InputData;
                                break;
                            default:
                                confirmAutopayContract$InputData.getClass();
                                k9Var.d = confirmAutopayContract$InputData;
                                break;
                        }
                        return (l9) k9Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = ConfirmAutopayScreen.W;
                        l9 l9Var = (l9) confirmAutopayScreen.U.getValue();
                        switch (l9Var.f119224a) {
                            case 0:
                                return (b) l9Var.d.get();
                            case 1:
                                return (b) l9Var.d.get();
                            case 2:
                                return (b) l9Var.d.get();
                            case 3:
                                return (b) l9Var.d.get();
                            default:
                                return (b) l9Var.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: nk4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmAutopayScreen f216649b;

            {
                this.f216649b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConfirmAutopayScreen confirmAutopayScreen = this.f216649b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConfirmAutopayScreen.W;
                        ConfirmAutopayScreen confirmAutopayScreen2 = this.f216649b;
                        return dli.f.a(confirmAutopayScreen2, confirmAutopayScreen2.d(), v.k((CellDetailsDelegate) confirmAutopayScreen2.O.getValue(), (CellDetailsActionDelegate) confirmAutopayScreen2.P.getValue(), (InputChecklistDelegate) confirmAutopayScreen2.R.getValue(), (RowDelegate) confirmAutopayScreen2.S.getValue(), (FullScreenStateDelegate) confirmAutopayScreen2.Q.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new CellDetailsActionableIconDelegate(), new FooterTextDelegate()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ConfirmAutopayScreen.W;
                        qji.b bVarU2 = confirmAutopayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.di.ConfirmAutopayScreenInjector");
                        k9 k9Var = (k9) ((ok4.a) bVarU2).s().mo3808a(confirmAutopayScreen);
                        ConfirmAutopayContract$InputData confirmAutopayContract$InputData = confirmAutopayScreen.K;
                        switch (k9Var.f119141a) {
                            case 0:
                                confirmAutopayContract$InputData.getClass();
                                k9Var.d = confirmAutopayContract$InputData;
                                break;
                            case 1:
                                confirmAutopayContract$InputData.getClass();
                                k9Var.d = confirmAutopayContract$InputData;
                                break;
                            case 2:
                                confirmAutopayContract$InputData.getClass();
                                k9Var.d = confirmAutopayContract$InputData;
                                break;
                            case 3:
                                confirmAutopayContract$InputData.getClass();
                                k9Var.d = confirmAutopayContract$InputData;
                                break;
                            default:
                                confirmAutopayContract$InputData.getClass();
                                k9Var.d = confirmAutopayContract$InputData;
                                break;
                        }
                        return (l9) k9Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = ConfirmAutopayScreen.W;
                        l9 l9Var = (l9) confirmAutopayScreen.U.getValue();
                        switch (l9Var.f119224a) {
                            case 0:
                                return (b) l9Var.d.get();
                            case 1:
                                return (b) l9Var.d.get();
                            case 2:
                                return (b) l9Var.d.get();
                            case 3:
                                return (b) l9Var.d.get();
                            default:
                                return (b) l9Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: nk4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmAutopayScreen f216649b;

            {
                this.f216649b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ConfirmAutopayScreen confirmAutopayScreen = this.f216649b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConfirmAutopayScreen.W;
                        ConfirmAutopayScreen confirmAutopayScreen2 = this.f216649b;
                        return dli.f.a(confirmAutopayScreen2, confirmAutopayScreen2.d(), v.k((CellDetailsDelegate) confirmAutopayScreen2.O.getValue(), (CellDetailsActionDelegate) confirmAutopayScreen2.P.getValue(), (InputChecklistDelegate) confirmAutopayScreen2.R.getValue(), (RowDelegate) confirmAutopayScreen2.S.getValue(), (FullScreenStateDelegate) confirmAutopayScreen2.Q.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new CellDetailsActionableIconDelegate(), new FooterTextDelegate()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ConfirmAutopayScreen.W;
                        qji.b bVarU2 = confirmAutopayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.di.ConfirmAutopayScreenInjector");
                        k9 k9Var = (k9) ((ok4.a) bVarU2).s().mo3808a(confirmAutopayScreen);
                        ConfirmAutopayContract$InputData confirmAutopayContract$InputData = confirmAutopayScreen.K;
                        switch (k9Var.f119141a) {
                            case 0:
                                confirmAutopayContract$InputData.getClass();
                                k9Var.d = confirmAutopayContract$InputData;
                                break;
                            case 1:
                                confirmAutopayContract$InputData.getClass();
                                k9Var.d = confirmAutopayContract$InputData;
                                break;
                            case 2:
                                confirmAutopayContract$InputData.getClass();
                                k9Var.d = confirmAutopayContract$InputData;
                                break;
                            case 3:
                                confirmAutopayContract$InputData.getClass();
                                k9Var.d = confirmAutopayContract$InputData;
                                break;
                            default:
                                confirmAutopayContract$InputData.getClass();
                                k9Var.d = confirmAutopayContract$InputData;
                                break;
                        }
                        return (l9) k9Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = ConfirmAutopayScreen.W;
                        l9 l9Var = (l9) confirmAutopayScreen.U.getValue();
                        switch (l9Var.f119224a) {
                            case 0:
                                return (b) l9Var.d.get();
                            case 1:
                                return (b) l9Var.d.get();
                            case 2:
                                return (b) l9Var.d.get();
                            case 3:
                                return (b) l9Var.d.get();
                            default:
                                return (b) l9Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        nk4.c uiState = (nk4.c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        Clause clause = uiState.d;
        Clause clause2 = uiState.f216645b;
        int i = clause != null ? 0 : 4;
        NavBarWithToolbar navBarWithToolbar = d3().f174570b;
        navBarWithToolbar.setTitle(clause2, null);
        navBarWithToolbar.setToolbarTitle(clause2);
        navBarWithToolbar.setSecondDescriptionText(uiState.f216646c);
        TwinVerticalButton twinVerticalButton = d3().d;
        twinVerticalButton.setMainButtonEnabled(uiState.e);
        TwinVerticalButton.setDescription$default(twinVerticalButton, uiState.d, null, null, 6, null);
        twinVerticalButton.setDescriptionVisibility(i);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.L = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l9) this.U.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getF94047h0() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView screenRecyclerNavbarTwinVerticalButtonRecyclerView = d3().f174571c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwinVerticalButtonRecyclerView, "screenRecyclerNavbarTwinVerticalButtonRecyclerView");
        y.b(screenRecyclerNavbarTwinVerticalButtonRecyclerView, new l(this, 21));
        NavBarWithToolbar navBarWithToolbar = d3().f174570b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        TwinVerticalButton twinVerticalButton = d3().d;
        twinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        twinVerticalButton.setMainButtonEnabled(false);
        twinVerticalButton.setMainButtonVisible(true);
        twinVerticalButton.setSecondaryButtonVisible(false);
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(R$string.credit_common_confirm, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) this.O.getValue()).d), null, new i(this, null), 3);
        ?? r142 = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) r142.getValue()).d), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new b75.d(rd0.e.b(((CellDetailsActionDelegate) r142.getValue()).f51780c), yx4.b.Companion, 12), null, new n(2, d(), nk4.b.class, "handleTitleEndImageClicks", "handleTitleEndImageClicks(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.Q.getValue()).f52371h.f121375b), null, new nk4.k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.S.getValue()).f53218h), null, new nk4.l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputChecklistDelegate) this.R.getValue()).f52518c), null, new m(this, null), 3);
        jii.w wVarD3 = d3();
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(wVarD3.d.m0()), null, new nk4.n(wVarD3, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o0()), null, new nk4.h(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174570b.f59410q), null, new nk4.h(this, null, 0), 3);
    }

    public final jii.w d3() {
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.w) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final nk4.b R2() {
        return (nk4.b) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}

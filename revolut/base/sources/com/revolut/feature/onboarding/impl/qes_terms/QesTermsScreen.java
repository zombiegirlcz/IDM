package com.revolut.feature.onboarding.impl.qes_terms;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.onboarding.impl.R$id;
import com.revolut.feature.onboarding.impl.R$layout;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsScreen;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import oc9.o;
import oc9.p;
import oc9.r;
import oc9.t;
import oc9.u;
import oc9.w;
import oc9.x;
import oc9.y;
import org.jetbrains.annotations.NotNull;
import tx0.j0;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/onboarding/impl/qes_terms/QesTermsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Loc9/w;", "Ldli/a;", "Loc9/y;", "Lno/m;", "Lkji/f;", "Companion", "a", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QesTermsScreen extends ViewController<w> implements dli.a, m, kji.f {
    public final QesTermsScreenContract$InputData K;
    public final int L;
    public final AnalyticsProduct.Retail M;
    public final Object N;
    public final Object O;
    public final boolean P;
    public final ao.h Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(QesTermsScreen.class, "binding", "getBinding()Lcom/revolut/feature/onboarding/impl/databinding/ScreenQesTermsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.onboarding.impl.qes_terms.QesTermsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public QesTermsScreen(QesTermsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_qes_terms;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        this.M = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: oc9.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QesTermsScreen f224156b;

            {
                this.f224156b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                QesTermsScreen qesTermsScreen = this.f224156b;
                switch (i2) {
                    case 0:
                        QesTermsScreen.Companion companion2 = QesTermsScreen.INSTANCE;
                        qji.b bVarU2 = qesTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.qes_terms.di.QesTermsScreenInjector");
                        dd9.c cVarJ = ((qc9.p) bVarU2).j();
                        QesTermsScreenContract$InputData qesTermsScreenContract$InputData = qesTermsScreen.K;
                        switch (cVarJ.f113124a) {
                            case 0:
                                qesTermsScreenContract$InputData.getClass();
                                cVarJ.f113126c = qesTermsScreenContract$InputData;
                                break;
                            default:
                                qesTermsScreenContract$InputData.getClass();
                                cVarJ.f113126c = qesTermsScreenContract$InputData;
                                break;
                        }
                        return (qc9.o) ((dd9.c) cVarJ.mo3808a(qesTermsScreen)).mo3783build();
                    case 1:
                        QesTermsScreen.Companion companion3 = QesTermsScreen.INSTANCE;
                        return ((qc9.o) qesTermsScreen.N.getValue()).a();
                    case 2:
                        QesTermsScreen.Companion companion4 = QesTermsScreen.INSTANCE;
                        return new SelectableDelegate((RowDelegate) qesTermsScreen.S.getValue());
                    default:
                        QesTermsScreen.Companion companion5 = QesTermsScreen.INSTANCE;
                        QesTermsScreen qesTermsScreen2 = this.f224156b;
                        return dli.f.a(qesTermsScreen2, qesTermsScreen2.d(), zhm.v.k((ListCellDelegate) qesTermsScreen2.R.getValue(), new ListSubheaderDelegate(), (RowDelegate) qesTermsScreen2.S.getValue(), (FullScreenStateDelegate) qesTermsScreen2.T.getValue(), (RowLoadingDelegate) qesTermsScreen2.U.getValue(), (InputChecklistDelegate) qesTermsScreen2.V.getValue(), (SelectableDelegate) qesTermsScreen2.W.getValue()), R$id.qesTerms_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: oc9.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QesTermsScreen f224156b;

            {
                this.f224156b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                QesTermsScreen qesTermsScreen = this.f224156b;
                switch (i22) {
                    case 0:
                        QesTermsScreen.Companion companion2 = QesTermsScreen.INSTANCE;
                        qji.b bVarU2 = qesTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.qes_terms.di.QesTermsScreenInjector");
                        dd9.c cVarJ = ((qc9.p) bVarU2).j();
                        QesTermsScreenContract$InputData qesTermsScreenContract$InputData = qesTermsScreen.K;
                        switch (cVarJ.f113124a) {
                            case 0:
                                qesTermsScreenContract$InputData.getClass();
                                cVarJ.f113126c = qesTermsScreenContract$InputData;
                                break;
                            default:
                                qesTermsScreenContract$InputData.getClass();
                                cVarJ.f113126c = qesTermsScreenContract$InputData;
                                break;
                        }
                        return (qc9.o) ((dd9.c) cVarJ.mo3808a(qesTermsScreen)).mo3783build();
                    case 1:
                        QesTermsScreen.Companion companion3 = QesTermsScreen.INSTANCE;
                        return ((qc9.o) qesTermsScreen.N.getValue()).a();
                    case 2:
                        QesTermsScreen.Companion companion4 = QesTermsScreen.INSTANCE;
                        return new SelectableDelegate((RowDelegate) qesTermsScreen.S.getValue());
                    default:
                        QesTermsScreen.Companion companion5 = QesTermsScreen.INSTANCE;
                        QesTermsScreen qesTermsScreen2 = this.f224156b;
                        return dli.f.a(qesTermsScreen2, qesTermsScreen2.d(), zhm.v.k((ListCellDelegate) qesTermsScreen2.R.getValue(), new ListSubheaderDelegate(), (RowDelegate) qesTermsScreen2.S.getValue(), (FullScreenStateDelegate) qesTermsScreen2.T.getValue(), (RowLoadingDelegate) qesTermsScreen2.U.getValue(), (InputChecklistDelegate) qesTermsScreen2.V.getValue(), (SelectableDelegate) qesTermsScreen2.W.getValue()), R$id.qesTerms_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = true;
        this.Q = s.t(this, o.f);
        this.R = te0.w.y0(new ob1.e(4));
        this.S = te0.w.y0(new ob1.e(5));
        this.T = te0.w.y0(new ob1.e(6));
        this.U = te0.w.y0(new ob1.e(7));
        this.V = te0.w.y0(new ob1.e(8));
        final int i3 = 2;
        this.W = te0.w.y0(new Function0(this) { // from class: oc9.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QesTermsScreen f224156b;

            {
                this.f224156b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                QesTermsScreen qesTermsScreen = this.f224156b;
                switch (i22) {
                    case 0:
                        QesTermsScreen.Companion companion2 = QesTermsScreen.INSTANCE;
                        qji.b bVarU2 = qesTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.qes_terms.di.QesTermsScreenInjector");
                        dd9.c cVarJ = ((qc9.p) bVarU2).j();
                        QesTermsScreenContract$InputData qesTermsScreenContract$InputData = qesTermsScreen.K;
                        switch (cVarJ.f113124a) {
                            case 0:
                                qesTermsScreenContract$InputData.getClass();
                                cVarJ.f113126c = qesTermsScreenContract$InputData;
                                break;
                            default:
                                qesTermsScreenContract$InputData.getClass();
                                cVarJ.f113126c = qesTermsScreenContract$InputData;
                                break;
                        }
                        return (qc9.o) ((dd9.c) cVarJ.mo3808a(qesTermsScreen)).mo3783build();
                    case 1:
                        QesTermsScreen.Companion companion3 = QesTermsScreen.INSTANCE;
                        return ((qc9.o) qesTermsScreen.N.getValue()).a();
                    case 2:
                        QesTermsScreen.Companion companion4 = QesTermsScreen.INSTANCE;
                        return new SelectableDelegate((RowDelegate) qesTermsScreen.S.getValue());
                    default:
                        QesTermsScreen.Companion companion5 = QesTermsScreen.INSTANCE;
                        QesTermsScreen qesTermsScreen2 = this.f224156b;
                        return dli.f.a(qesTermsScreen2, qesTermsScreen2.d(), zhm.v.k((ListCellDelegate) qesTermsScreen2.R.getValue(), new ListSubheaderDelegate(), (RowDelegate) qesTermsScreen2.S.getValue(), (FullScreenStateDelegate) qesTermsScreen2.T.getValue(), (RowLoadingDelegate) qesTermsScreen2.U.getValue(), (InputChecklistDelegate) qesTermsScreen2.V.getValue(), (SelectableDelegate) qesTermsScreen2.W.getValue()), R$id.qesTerms_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.X = te0.w.y0(new Function0(this) { // from class: oc9.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QesTermsScreen f224156b;

            {
                this.f224156b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                QesTermsScreen qesTermsScreen = this.f224156b;
                switch (i22) {
                    case 0:
                        QesTermsScreen.Companion companion2 = QesTermsScreen.INSTANCE;
                        qji.b bVarU2 = qesTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.qes_terms.di.QesTermsScreenInjector");
                        dd9.c cVarJ = ((qc9.p) bVarU2).j();
                        QesTermsScreenContract$InputData qesTermsScreenContract$InputData = qesTermsScreen.K;
                        switch (cVarJ.f113124a) {
                            case 0:
                                qesTermsScreenContract$InputData.getClass();
                                cVarJ.f113126c = qesTermsScreenContract$InputData;
                                break;
                            default:
                                qesTermsScreenContract$InputData.getClass();
                                cVarJ.f113126c = qesTermsScreenContract$InputData;
                                break;
                        }
                        return (qc9.o) ((dd9.c) cVarJ.mo3808a(qesTermsScreen)).mo3783build();
                    case 1:
                        QesTermsScreen.Companion companion3 = QesTermsScreen.INSTANCE;
                        return ((qc9.o) qesTermsScreen.N.getValue()).a();
                    case 2:
                        QesTermsScreen.Companion companion4 = QesTermsScreen.INSTANCE;
                        return new SelectableDelegate((RowDelegate) qesTermsScreen.S.getValue());
                    default:
                        QesTermsScreen.Companion companion5 = QesTermsScreen.INSTANCE;
                        QesTermsScreen qesTermsScreen2 = this.f224156b;
                        return dli.f.a(qesTermsScreen2, qesTermsScreen2.d(), zhm.v.k((ListCellDelegate) qesTermsScreen2.R.getValue(), new ListSubheaderDelegate(), (RowDelegate) qesTermsScreen2.S.getValue(), (FullScreenStateDelegate) qesTermsScreen2.T.getValue(), (RowLoadingDelegate) qesTermsScreen2.U.getValue(), (InputChecklistDelegate) qesTermsScreen2.V.getValue(), (SelectableDelegate) qesTermsScreen2.W.getValue()), R$id.qesTerms_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        y uiState = (y) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f213610c.setCollapsible(uiState.f224165g);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f213609b;
        Clause clause = uiState.f224162a;
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setTitle(clause, null);
        Clause clause2 = uiState.f224163b;
        navBarWithToolbar.setSecondDescriptionText(clause2);
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        TwinVerticalButton twinVerticalButton = d3().f213610c;
        twinVerticalButton.setMainButtonEnabled(uiState.f224164c);
        twinVerticalButton.setMainButtonText(uiState.d);
        TwinVerticalButton.setDescription$default(twinVerticalButton, uiState.e, null, null, 6, null);
        f3(twinVerticalButton.A());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        return false;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getT() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (qc9.o) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((dli.c) this.X.getValue()).h().setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
        NavBarWithToolbar navBarWithToolbar = d3().f213609b;
        navBarWithToolbar.setNavigationButtonImage(this.K.d);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        TwinVerticalButton twinVerticalButton = d3().f213610c;
        twinVerticalButton.setCollapsed(true, false);
        twinVerticalButton.setCollapsible(false);
        twinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        twinVerticalButton.setSecondaryButtonVisible(false);
        twinVerticalButton.setFabEnabled(true);
        twinVerticalButton.setMainButtonEnabled(true);
        twinVerticalButton.setFabAbsoluteRotation(90.0f, true);
    }

    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v37, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        if (this.K.f78549a.f78161m != null) {
            ViewController.P2(this, rd0.e.b(d3().f213610c.n0()), new oc9.q(this, continuation, 0), 3);
        }
        ViewController.P2(this, rd0.e.b(d3().f213609b.f59410q), new r(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f213610c.o0()), new r(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f213610c.m0()), new r(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.S.getValue()).f53218h), new oc9.s(this, null), 3);
        ViewController.P2(this, rd0.e.b(((ListCellDelegate) this.R.getValue()).d), new oc9.q(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.T.getValue()).f52371h.f121375b), new t(2, 4, x.class, d(), "onRetryClick", "onRetryClick(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;)V"), 3);
        ?? r112 = this.V;
        ViewController.P2(this, rd0.e.b(((InputChecklistDelegate) r112.getValue()).f52518c), new u(2, 4, x.class, d(), "onInputCheckListItemClick", "onInputCheckListItemClick(Lcom/revolut/core/ui_kit/delegates/InputChecklistDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(((InputChecklistDelegate) r112.getValue()).p()), new nt.e(2, d(), x.class, "onInputCheckListClauseClick", "onInputCheckListClauseClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 14), 3);
        ViewController.P2(this, rd0.e.b(((SelectableDelegate) this.W.getValue()).r()), new p(this, null), 3);
    }

    public final n99.b d3() {
        ViewBinding value = this.Q.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n99.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final x d() {
        return (x) this.O.getValue();
    }

    public final void f3(boolean z) {
        if (z) {
            d3().f213610c.setDescriptionVisibility(4);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            d3().f213610c.setDescriptionVisibility(0);
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}

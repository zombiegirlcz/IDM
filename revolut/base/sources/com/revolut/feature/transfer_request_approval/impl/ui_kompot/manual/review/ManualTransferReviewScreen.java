package com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transfer_request_approval.impl.R$id;
import com.revolut.feature.transfer_request_approval.impl.R$layout;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.ManualTransferReviewScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.retail.feature.payments.core.R$string;
import efm.r;
import ip0.md;
import iuf.f;
import iuf.g;
import iuf.i;
import iuf.j;
import iuf.k;
import iuf.n;
import iuf.q;
import iuf.t;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mga.i0;
import n5k.b;
import n5k.p;
import te0.w;
import vc.s;
import xki.e;
import ytf.c;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/review/ManualTransferReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liuf/q;", "Ldli/a;", "Liuf/t;", "Lmga/i0;", "feature_transfer_request_approval_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManualTransferReviewScreen extends ViewController<q> implements dli.a, i0 {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f92480e0 = {o0.f186429a.j(new h0(ManualTransferReviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/transfer_request_approval/impl/databinding/ScreenManualTransferRequestReviewBinding;", 0))};
    public final int K;
    public final h L;
    public final boolean M;
    public b N;
    public final Object O;
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
    public final Object f92481a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f92482b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f92483d0;

    public ManualTransferReviewScreen(ManualTransferReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_manual_transfer_request_review;
        this.L = s.t(this, f.f);
        this.M = true;
        this.O = w.y0(new is7.b(14));
        this.P = w.y0(new is7.b(24));
        this.Q = w.y0(new is7.b(25));
        this.R = w.y0(new is7.b(26));
        this.S = w.y0(new is7.b(15));
        this.T = w.y0(new is7.b(16));
        this.U = w.y0(new is7.b(17));
        this.V = w.y0(new is7.b(18));
        this.W = w.y0(new is7.b(19));
        this.X = w.y0(new is7.b(20));
        this.Y = w.y0(new is7.b(21));
        this.Z = w.y0(new is7.b(22));
        this.f92481a0 = w.y0(new is7.b(23));
        final int i = 0;
        this.f92482b0 = w.y0(new Function0(this) { // from class: iuf.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManualTransferReviewScreen f168565b;

            {
                this.f168565b = this;
            }

            /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ManualTransferReviewScreen.f92480e0;
                        ManualTransferReviewScreen manualTransferReviewScreen = this.f168565b;
                        return dli.f.a(manualTransferReviewScreen, manualTransferReviewScreen.d(), zhm.v.k((CellDetailsDelegate) manualTransferReviewScreen.O.getValue(), (CellDetailsActionDelegate) manualTransferReviewScreen.P.getValue(), (CellDetailsNoteDelegate) manualTransferReviewScreen.Q.getValue(), (CellDetailsSwitcherDelegate) manualTransferReviewScreen.R.getValue(), new PlainTextWarningDelegate(), (RowDelegate) manualTransferReviewScreen.S.getValue(), (HighlightTileDelegate) manualTransferReviewScreen.T.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new TextDelegate(), new CounterTextDelegate()), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ManualTransferReviewScreen.f92480e0;
                        return (s) ((ytf.c) this.f168565b.c0.getValue()).E.get();
                }
            }
        });
        this.c0 = w.y0(new md(this, inputData, 16));
        final int i2 = 1;
        this.f92483d0 = w.y0(new Function0(this) { // from class: iuf.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManualTransferReviewScreen f168565b;

            {
                this.f168565b = this;
            }

            /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ManualTransferReviewScreen.f92480e0;
                        ManualTransferReviewScreen manualTransferReviewScreen = this.f168565b;
                        return dli.f.a(manualTransferReviewScreen, manualTransferReviewScreen.d(), zhm.v.k((CellDetailsDelegate) manualTransferReviewScreen.O.getValue(), (CellDetailsActionDelegate) manualTransferReviewScreen.P.getValue(), (CellDetailsNoteDelegate) manualTransferReviewScreen.Q.getValue(), (CellDetailsSwitcherDelegate) manualTransferReviewScreen.R.getValue(), new PlainTextWarningDelegate(), (RowDelegate) manualTransferReviewScreen.S.getValue(), (HighlightTileDelegate) manualTransferReviewScreen.T.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new TextDelegate(), new CounterTextDelegate()), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ManualTransferReviewScreen.f92480e0;
                        return (s) ((ytf.c) this.f168565b.c0.getValue()).E.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        t uiState = (t) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        k kVar = uiState.f168578b;
        if (kVar != null) {
            LargeActionButton largeActionButton = d3().f299938c;
            largeActionButton.setEnabled(true);
            largeActionButton.setText(kVar.f168566a);
            largeActionButton.setLoadingButtonTag("MONEY_REQUEST_REVIEW_PROCEED_CTA_BUTTON_TAG");
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        a aVar = (a) d();
        aVar.C2(new n(aVar.I2()));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r N0() {
        r rVarMergeWith = ((HighlightTileDelegate) this.T.getValue()).f52437c.mergeWith(((HighlightTileDelegate) this.Z.getValue()).f52437c);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        return rVarMergeWith;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r110 = this.c0;
        this.N = (b) ((c) r110.getValue()).f316746t.get();
        j60.a aVar = (j60.a) ((c) r110.getValue()).f316736g.get();
        ?? r2 = this.X;
        LargeActionButtonDelegate largeActionButtonDelegate = (LargeActionButtonDelegate) r2.getValue();
        ?? r4 = this.U;
        CellDetailsDelegate cellDetailsDelegate = (CellDetailsDelegate) r4.getValue();
        ?? r62 = this.V;
        CellDetailsActionDelegate cellDetailsActionDelegate = (CellDetailsActionDelegate) r62.getValue();
        ?? r87 = this.W;
        CellDetailsNoteDelegate cellDetailsNoteDelegate = (CellDetailsNoteDelegate) r87.getValue();
        ?? r102 = this.Y;
        RowDelegate rowDelegate = (RowDelegate) r102.getValue();
        ?? r122 = this.Z;
        HighlightTileDelegate highlightTileDelegate = (HighlightTileDelegate) r122.getValue();
        ?? r142 = this.f92481a0;
        aVar.d(v.k(largeActionButtonDelegate, cellDetailsDelegate, cellDetailsActionDelegate, cellDetailsNoteDelegate, rowDelegate, highlightTileDelegate, (TextDelegate) r142.getValue()));
        b bVar = this.N;
        if (bVar == null) {
            Intrinsics.r("paymentFeesDialogExtension");
            throw null;
        }
        ((p) bVar).Z2((CellDetailsDelegate) this.O.getValue(), (CellDetailsActionDelegate) this.P.getValue(), (CellDetailsNoteDelegate) this.Q.getValue(), null, (TextDelegate) r142.getValue(), null, null);
        b bVar2 = this.N;
        if (bVar2 == null) {
            Intrinsics.r("paymentFeesDialogExtension");
            throw null;
        }
        ((p) bVar2).Z2((CellDetailsDelegate) r4.getValue(), (CellDetailsActionDelegate) r62.getValue(), (CellDetailsNoteDelegate) r87.getValue(), (LargeActionButtonDelegate) r2.getValue(), (TextDelegate) r142.getValue(), (RowDelegate) r102.getValue(), (HighlightTileDelegate) r122.getValue());
        NavBarWithToolbar navBarWithToolbar = d3().f299937b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.payments_bank_transfer_review_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.payments_bank_transfer_review_title, null, null, 14));
        navBarWithToolbar.j0(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r a2() {
        r rVarMergeWith = ((RowDelegate) this.S.getValue()).f53218h.mergeWith(((RowDelegate) this.Y.getValue()).f53218h);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        return rVarMergeWith;
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f299937b.f59410q), new g(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f299937b.f59409p.f57336l), new g(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f299938c.o), new g(this, continuation, 2), 3);
        ?? r56 = this.R;
        ViewController.P2(this, rd0.e.b(((CellDetailsSwitcherDelegate) r56.getValue()).f51912c), new iuf.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsSwitcherDelegate) r56.getValue()).d), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.S.getValue()).k), new j(this, null), 3);
    }

    public final wtf.a d3() {
        ViewBinding value = this.L.getValue(this, f92480e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wtf.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final iuf.s R2() {
        return (iuf.s) this.f92483d0.getValue();
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f299936a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return controllerContainerCoordinatorLayout;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f92482b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}

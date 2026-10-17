package com.revolut.feature.push_to_card.impl.ui.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
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
import com.revolut.feature.push_to_card.impl.R$id;
import com.revolut.feature.push_to_card.impl.R$layout;
import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreen;
import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.retail.feature.payments.core.R$string;
import cqa.e;
import dli.a;
import efm.r;
import jqa.i;
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
import qsa.c;
import qsa.d;
import qsa.f;
import qsa.g;
import qsa.k;
import qsa.l;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/ui/review/PushToCardTransferReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcqa/e;", "Ldli/a;", "Lqsa/l;", "Lmga/i0;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PushToCardTransferReviewScreen extends ViewController<e> implements a, i0 {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f81615h0 = {o0.f186429a.j(new h0(PushToCardTransferReviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/push_to_card/impl/databinding/ScreenTransferCardReviewBinding;", 0))};
    public final PushToCardTransferReviewScreenContract$InputData K;
    public final int L;
    public final h M;
    public final boolean N;
    public b O;
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
    public final Object f81616a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f81617b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f81618d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f81619e0;
    public final Object f0;
    public final Object g0;

    public PushToCardTransferReviewScreen(PushToCardTransferReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transfer_card_review;
        this.M = s.t(this, c.f);
        this.N = true;
        this.P = w.y0(new qni.a(16));
        this.Q = w.y0(new qni.a(21));
        this.R = w.y0(new qni.a(22));
        this.S = w.y0(new qni.a(23));
        this.T = w.y0(new qni.a(24));
        this.U = w.y0(new qni.a(25));
        this.V = w.y0(new qni.a(26));
        this.W = w.y0(new qni.a(27));
        this.X = w.y0(new qni.a(28));
        this.Y = w.y0(new qni.a(29));
        this.Z = w.y0(new qni.a(17));
        this.f81616a0 = w.y0(new qni.a(18));
        this.f81617b0 = w.y0(new qni.a(19));
        this.c0 = w.y0(new qni.a(20));
        final int i = 0;
        this.f81618d0 = w.y0(new Function0(this) { // from class: qsa.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushToCardTransferReviewScreen f248766b;

            {
                this.f248766b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PushToCardTransferReviewScreen pushToCardTransferReviewScreen = this.f248766b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PushToCardTransferReviewScreen.f81615h0;
                        phm.a aVar = (phm.a) ue0.e.j(pushToCardTransferReviewScreen.m2()).a().get(vpa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vpa.a.class, " is not found"));
                        }
                        jqa.e eVar = ((jqa.e) ((jqa.s) aVar2.b())).O;
                        PushToCardTransferReviewScreenContract$InputData pushToCardTransferReviewScreenContract$InputData = pushToCardTransferReviewScreen.K;
                        pushToCardTransferReviewScreenContract$InputData.getClass();
                        return new jqa.i(eVar, pushToCardTransferReviewScreen, pushToCardTransferReviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PushToCardTransferReviewScreen.f81615h0;
                        return (k) ((jqa.i) pushToCardTransferReviewScreen.f81618d0.getValue()).N.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PushToCardTransferReviewScreen.f81615h0;
                        aqf.b bVar = (aqf.b) ((jqa.i) pushToCardTransferReviewScreen.f81618d0.getValue()).f177582c.B.i.get();
                        vc.s.j(bVar);
                        return bVar;
                    default:
                        KProperty[] kPropertyArr4 = PushToCardTransferReviewScreen.f81615h0;
                        PushToCardTransferReviewScreen pushToCardTransferReviewScreen2 = this.f248766b;
                        return dli.f.a(pushToCardTransferReviewScreen2, pushToCardTransferReviewScreen2.d(), v.k((CellDetailsDelegate) pushToCardTransferReviewScreen2.P.getValue(), (CellDetailsActionDelegate) pushToCardTransferReviewScreen2.Q.getValue(), (CellDetailsNoteDelegate) pushToCardTransferReviewScreen2.R.getValue(), (CellDetailsSwitcherDelegate) pushToCardTransferReviewScreen2.S.getValue(), new PlainTextWarningDelegate(), (RowDelegate) pushToCardTransferReviewScreen2.T.getValue(), new RowLoadingDelegate(), (HighlightTileDelegate) pushToCardTransferReviewScreen2.U.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (CounterTextDelegate) pushToCardTransferReviewScreen2.c0.getValue(), new TextDelegate()), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.f81619e0 = w.y0(new Function0(this) { // from class: qsa.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushToCardTransferReviewScreen f248766b;

            {
                this.f248766b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PushToCardTransferReviewScreen pushToCardTransferReviewScreen = this.f248766b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PushToCardTransferReviewScreen.f81615h0;
                        phm.a aVar = (phm.a) ue0.e.j(pushToCardTransferReviewScreen.m2()).a().get(vpa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vpa.a.class, " is not found"));
                        }
                        jqa.e eVar = ((jqa.e) ((jqa.s) aVar2.b())).O;
                        PushToCardTransferReviewScreenContract$InputData pushToCardTransferReviewScreenContract$InputData = pushToCardTransferReviewScreen.K;
                        pushToCardTransferReviewScreenContract$InputData.getClass();
                        return new jqa.i(eVar, pushToCardTransferReviewScreen, pushToCardTransferReviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PushToCardTransferReviewScreen.f81615h0;
                        return (k) ((jqa.i) pushToCardTransferReviewScreen.f81618d0.getValue()).N.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PushToCardTransferReviewScreen.f81615h0;
                        aqf.b bVar = (aqf.b) ((jqa.i) pushToCardTransferReviewScreen.f81618d0.getValue()).f177582c.B.i.get();
                        vc.s.j(bVar);
                        return bVar;
                    default:
                        KProperty[] kPropertyArr4 = PushToCardTransferReviewScreen.f81615h0;
                        PushToCardTransferReviewScreen pushToCardTransferReviewScreen2 = this.f248766b;
                        return dli.f.a(pushToCardTransferReviewScreen2, pushToCardTransferReviewScreen2.d(), v.k((CellDetailsDelegate) pushToCardTransferReviewScreen2.P.getValue(), (CellDetailsActionDelegate) pushToCardTransferReviewScreen2.Q.getValue(), (CellDetailsNoteDelegate) pushToCardTransferReviewScreen2.R.getValue(), (CellDetailsSwitcherDelegate) pushToCardTransferReviewScreen2.S.getValue(), new PlainTextWarningDelegate(), (RowDelegate) pushToCardTransferReviewScreen2.T.getValue(), new RowLoadingDelegate(), (HighlightTileDelegate) pushToCardTransferReviewScreen2.U.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (CounterTextDelegate) pushToCardTransferReviewScreen2.c0.getValue(), new TextDelegate()), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.f0 = w.y0(new Function0(this) { // from class: qsa.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushToCardTransferReviewScreen f248766b;

            {
                this.f248766b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PushToCardTransferReviewScreen pushToCardTransferReviewScreen = this.f248766b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PushToCardTransferReviewScreen.f81615h0;
                        phm.a aVar = (phm.a) ue0.e.j(pushToCardTransferReviewScreen.m2()).a().get(vpa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vpa.a.class, " is not found"));
                        }
                        jqa.e eVar = ((jqa.e) ((jqa.s) aVar2.b())).O;
                        PushToCardTransferReviewScreenContract$InputData pushToCardTransferReviewScreenContract$InputData = pushToCardTransferReviewScreen.K;
                        pushToCardTransferReviewScreenContract$InputData.getClass();
                        return new jqa.i(eVar, pushToCardTransferReviewScreen, pushToCardTransferReviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PushToCardTransferReviewScreen.f81615h0;
                        return (k) ((jqa.i) pushToCardTransferReviewScreen.f81618d0.getValue()).N.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PushToCardTransferReviewScreen.f81615h0;
                        aqf.b bVar = (aqf.b) ((jqa.i) pushToCardTransferReviewScreen.f81618d0.getValue()).f177582c.B.i.get();
                        vc.s.j(bVar);
                        return bVar;
                    default:
                        KProperty[] kPropertyArr4 = PushToCardTransferReviewScreen.f81615h0;
                        PushToCardTransferReviewScreen pushToCardTransferReviewScreen2 = this.f248766b;
                        return dli.f.a(pushToCardTransferReviewScreen2, pushToCardTransferReviewScreen2.d(), v.k((CellDetailsDelegate) pushToCardTransferReviewScreen2.P.getValue(), (CellDetailsActionDelegate) pushToCardTransferReviewScreen2.Q.getValue(), (CellDetailsNoteDelegate) pushToCardTransferReviewScreen2.R.getValue(), (CellDetailsSwitcherDelegate) pushToCardTransferReviewScreen2.S.getValue(), new PlainTextWarningDelegate(), (RowDelegate) pushToCardTransferReviewScreen2.T.getValue(), new RowLoadingDelegate(), (HighlightTileDelegate) pushToCardTransferReviewScreen2.U.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (CounterTextDelegate) pushToCardTransferReviewScreen2.c0.getValue(), new TextDelegate()), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.g0 = w.y0(new Function0(this) { // from class: qsa.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushToCardTransferReviewScreen f248766b;

            {
                this.f248766b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PushToCardTransferReviewScreen pushToCardTransferReviewScreen = this.f248766b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PushToCardTransferReviewScreen.f81615h0;
                        phm.a aVar = (phm.a) ue0.e.j(pushToCardTransferReviewScreen.m2()).a().get(vpa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vpa.a.class, " is not found"));
                        }
                        jqa.e eVar = ((jqa.e) ((jqa.s) aVar2.b())).O;
                        PushToCardTransferReviewScreenContract$InputData pushToCardTransferReviewScreenContract$InputData = pushToCardTransferReviewScreen.K;
                        pushToCardTransferReviewScreenContract$InputData.getClass();
                        return new jqa.i(eVar, pushToCardTransferReviewScreen, pushToCardTransferReviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PushToCardTransferReviewScreen.f81615h0;
                        return (k) ((jqa.i) pushToCardTransferReviewScreen.f81618d0.getValue()).N.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PushToCardTransferReviewScreen.f81615h0;
                        aqf.b bVar = (aqf.b) ((jqa.i) pushToCardTransferReviewScreen.f81618d0.getValue()).f177582c.B.i.get();
                        vc.s.j(bVar);
                        return bVar;
                    default:
                        KProperty[] kPropertyArr4 = PushToCardTransferReviewScreen.f81615h0;
                        PushToCardTransferReviewScreen pushToCardTransferReviewScreen2 = this.f248766b;
                        return dli.f.a(pushToCardTransferReviewScreen2, pushToCardTransferReviewScreen2.d(), v.k((CellDetailsDelegate) pushToCardTransferReviewScreen2.P.getValue(), (CellDetailsActionDelegate) pushToCardTransferReviewScreen2.Q.getValue(), (CellDetailsNoteDelegate) pushToCardTransferReviewScreen2.R.getValue(), (CellDetailsSwitcherDelegate) pushToCardTransferReviewScreen2.S.getValue(), new PlainTextWarningDelegate(), (RowDelegate) pushToCardTransferReviewScreen2.T.getValue(), new RowLoadingDelegate(), (HighlightTileDelegate) pushToCardTransferReviewScreen2.U.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (CounterTextDelegate) pushToCardTransferReviewScreen2.c0.getValue(), new TextDelegate()), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        qsa.h hVar = uiState.f248775b;
        if (hVar != null) {
            LargeActionButton largeActionButton = d3().f167815c;
            largeActionButton.setEnabled(true);
            largeActionButton.setText(hVar.f248768a);
            largeActionButton.setLoadingButtonTag("PUSH_TO_CARD_REVIEW_CTA_BUTTON_TAG");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r N0() {
        r rVarMergeWith = ((HighlightTileDelegate) this.U.getValue()).f52437c.mergeWith(((HighlightTileDelegate) this.f81616a0.getValue()).f52437c);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        return rVarMergeWith;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.f81618d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r2 = this.f81618d0;
        this.O = (b) ((i) r2.getValue()).E.get();
        pd.b.p(view, new TextLocalisedClause(R$string.payments_descriptor_transfer_p2c_review_title, null, null, 14));
        j60.a aVar = (j60.a) ((i) r2.getValue()).f177584h.get();
        ?? r23 = this.Y;
        LargeActionButtonDelegate largeActionButtonDelegate = (LargeActionButtonDelegate) r23.getValue();
        ?? r4 = this.V;
        CellDetailsDelegate cellDetailsDelegate = (CellDetailsDelegate) r4.getValue();
        ?? r87 = this.W;
        CellDetailsActionDelegate cellDetailsActionDelegate = (CellDetailsActionDelegate) r87.getValue();
        ?? r102 = this.X;
        CellDetailsNoteDelegate cellDetailsNoteDelegate = (CellDetailsNoteDelegate) r102.getValue();
        ?? r122 = this.Z;
        RowDelegate rowDelegate = (RowDelegate) r122.getValue();
        ?? r142 = this.f81616a0;
        HighlightTileDelegate highlightTileDelegate = (HighlightTileDelegate) r142.getValue();
        ?? r56 = this.f81617b0;
        aVar.d(v.k(largeActionButtonDelegate, cellDetailsDelegate, cellDetailsActionDelegate, cellDetailsNoteDelegate, rowDelegate, highlightTileDelegate, (TextDelegate) r56.getValue()));
        b bVar = this.O;
        if (bVar == null) {
            Intrinsics.r("paymentFeesDialogExtension");
            throw null;
        }
        ((p) bVar).Z2((CellDetailsDelegate) this.P.getValue(), (CellDetailsActionDelegate) this.Q.getValue(), (CellDetailsNoteDelegate) this.R.getValue(), null, (TextDelegate) r56.getValue(), null, null);
        b bVar2 = this.O;
        if (bVar2 == null) {
            Intrinsics.r("paymentFeesDialogExtension");
            throw null;
        }
        ((p) bVar2).Z2((CellDetailsDelegate) r4.getValue(), (CellDetailsActionDelegate) r87.getValue(), (CellDetailsNoteDelegate) r102.getValue(), (LargeActionButtonDelegate) r23.getValue(), (TextDelegate) r56.getValue(), (RowDelegate) r122.getValue(), (HighlightTileDelegate) r142.getValue());
        NavBarWithToolbar navBarWithToolbar = d3().f167814b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(com.revolut.feature.push_to_card.impl.R$string.push2card_review_header_text, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(com.revolut.feature.push_to_card.impl.R$string.push2card_review_header_text, null, null, 14));
        navBarWithToolbar.j0(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r a2() {
        r rVarMergeWith = ((RowDelegate) this.T.getValue()).f53218h.mergeWith(((RowDelegate) this.Z.getValue()).f53218h);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        return rVarMergeWith;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f167814b.f59410q), new g(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f167814b.f59409p.f57336l), new g(this, continuation, 1), 3);
        int i = 2;
        ViewController.P2(this, rd0.e.b(d3().f167815c.o), new g(this, continuation, i), 3);
        ViewController.P2(this, ((aqf.b) this.f0.getValue()).f8427b, new d(this, continuation, i), 3);
        r map = ((CellDetailsDelegate) this.P.getValue()).d.map(new qsa.a(2, new qpb.i(23)));
        r map2 = ((CellDetailsActionDelegate) this.Q.getValue()).d.map(new qsa.a(3, new qpb.i(26)));
        ?? r3 = this.R;
        r rVarFilter = r.merge(v.k(map, map2, ((CellDetailsNoteDelegate) r3.getValue()).d.map(new qsa.a(4, new qpb.i(27))), ((CellDetailsNoteDelegate) r3.getValue()).e.map(new qsa.a(5, new qpb.i(28))), ((RowDelegate) this.T.getValue()).f53218h.map(new qsa.a(0, new qpb.i(24))))).filter(new qsa.a(1, new qpb.i(25)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new d(this, continuation, 0), 3);
        ?? r102 = this.S;
        ViewController.P2(this, rd0.e.b(((CellDetailsSwitcherDelegate) r102.getValue()).f51912c), new qsa.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsSwitcherDelegate) r102.getValue()).d), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CounterTextDelegate) this.c0.getValue()).e), new d(this, continuation, 1), 3);
    }

    public final iqa.b d3() {
        ViewBinding value = this.M.getValue(this, f81615h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (iqa.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.f81619e0.getValue();
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f167813a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return controllerContainerCoordinatorLayout;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.g0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}

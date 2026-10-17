package com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review;

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
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerReviewScreenInputData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.R$id;
import com.revolut.retail.feature.payments.peer_to_peer.impl.R$layout;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.PeerToPeerReviewScreen;
import efm.r;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l9j.k;
import l9k.c;
import l9k.g;
import l9k.l;
import mga.i0;
import n5k.b;
import n5k.p;
import s8k.d;
import te0.w;
import v8k.f;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/review/PeerToPeerReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ls8k/d;", "Ldli/a;", "Ll9k/l;", "Lmga/i0;", "feature_payments_peer_to_peer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PeerToPeerReviewScreen extends ViewController<d> implements dli.a, i0 {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f102358h0 = {o0.f186429a.j(new h0(PeerToPeerReviewScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/payments/peer_to_peer/impl/databinding/ScreenTransferPeerToPeerReviewBinding;", 0))};
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
    public final Object f102359a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f102360b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f102361d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f102362e0;
    public final Object f0;
    public final Object g0;

    public PeerToPeerReviewScreen(PeerToPeerReviewScreenInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transfer_peer_to_peer_review;
        this.L = s.t(this, l9k.b.f);
        this.M = true;
        this.O = w.y0(new l92.h(3));
        this.P = w.y0(new l92.h(4));
        this.Q = w.y0(new l92.h(5));
        this.R = w.y0(new l92.h(6));
        this.S = w.y0(new l92.h(7));
        this.T = w.y0(new l92.h(8));
        this.U = w.y0(new l92.h(9));
        this.V = w.y0(new l92.h(10));
        this.W = w.y0(new l92.h(11));
        this.X = w.y0(new l92.h(12));
        this.Y = w.y0(new l92.h(13));
        this.Z = w.y0(new l92.h(14));
        this.f102359a0 = w.y0(new l92.h(15));
        this.f102360b0 = w.y0(new l92.h(16));
        this.c0 = w.y0(new l92.h(17));
        final int i = 0;
        this.f102361d0 = w.y0(new Function0(this) { // from class: l9k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerReviewScreen f193272b;

            {
                this.f193272b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PeerToPeerReviewScreen peerToPeerReviewScreen = this.f193272b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PeerToPeerReviewScreen.f102358h0;
                        PeerToPeerReviewScreen peerToPeerReviewScreen2 = this.f193272b;
                        return dli.f.a(peerToPeerReviewScreen2, peerToPeerReviewScreen2.R2(), zhm.v.k((CellDetailsDelegate) peerToPeerReviewScreen2.O.getValue(), (CellDetailsActionDelegate) peerToPeerReviewScreen2.P.getValue(), (CellDetailsNoteDelegate) peerToPeerReviewScreen2.Q.getValue(), (CellDetailsSwitcherDelegate) peerToPeerReviewScreen2.R.getValue(), (SuggestionsBarDelegate) peerToPeerReviewScreen2.f102360b0.getValue(), (CounterTextDelegate) peerToPeerReviewScreen2.c0.getValue(), new PlainTextWarningDelegate(), (RowDelegate) peerToPeerReviewScreen2.S.getValue(), (HighlightTileDelegate) peerToPeerReviewScreen2.T.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new TextDelegate()), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PeerToPeerReviewScreen.f102358h0;
                        return (k) ((v8k.f) peerToPeerReviewScreen.f102362e0.getValue()).G.get();
                    default:
                        KProperty[] kPropertyArr3 = PeerToPeerReviewScreen.f102358h0;
                        aqf.b bVar = (aqf.b) ((v8k.f) peerToPeerReviewScreen.f102362e0.getValue()).f286837c.d.i.get();
                        vc.s.j(bVar);
                        return bVar;
                }
            }
        });
        this.f102362e0 = w.y0(new kpl.b(this, inputData, 22));
        final int i2 = 1;
        this.f0 = w.y0(new Function0(this) { // from class: l9k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerReviewScreen f193272b;

            {
                this.f193272b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PeerToPeerReviewScreen peerToPeerReviewScreen = this.f193272b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PeerToPeerReviewScreen.f102358h0;
                        PeerToPeerReviewScreen peerToPeerReviewScreen2 = this.f193272b;
                        return dli.f.a(peerToPeerReviewScreen2, peerToPeerReviewScreen2.R2(), zhm.v.k((CellDetailsDelegate) peerToPeerReviewScreen2.O.getValue(), (CellDetailsActionDelegate) peerToPeerReviewScreen2.P.getValue(), (CellDetailsNoteDelegate) peerToPeerReviewScreen2.Q.getValue(), (CellDetailsSwitcherDelegate) peerToPeerReviewScreen2.R.getValue(), (SuggestionsBarDelegate) peerToPeerReviewScreen2.f102360b0.getValue(), (CounterTextDelegate) peerToPeerReviewScreen2.c0.getValue(), new PlainTextWarningDelegate(), (RowDelegate) peerToPeerReviewScreen2.S.getValue(), (HighlightTileDelegate) peerToPeerReviewScreen2.T.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new TextDelegate()), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PeerToPeerReviewScreen.f102358h0;
                        return (k) ((v8k.f) peerToPeerReviewScreen.f102362e0.getValue()).G.get();
                    default:
                        KProperty[] kPropertyArr3 = PeerToPeerReviewScreen.f102358h0;
                        aqf.b bVar = (aqf.b) ((v8k.f) peerToPeerReviewScreen.f102362e0.getValue()).f286837c.d.i.get();
                        vc.s.j(bVar);
                        return bVar;
                }
            }
        });
        final int i3 = 2;
        this.g0 = w.y0(new Function0(this) { // from class: l9k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerReviewScreen f193272b;

            {
                this.f193272b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PeerToPeerReviewScreen peerToPeerReviewScreen = this.f193272b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PeerToPeerReviewScreen.f102358h0;
                        PeerToPeerReviewScreen peerToPeerReviewScreen2 = this.f193272b;
                        return dli.f.a(peerToPeerReviewScreen2, peerToPeerReviewScreen2.R2(), zhm.v.k((CellDetailsDelegate) peerToPeerReviewScreen2.O.getValue(), (CellDetailsActionDelegate) peerToPeerReviewScreen2.P.getValue(), (CellDetailsNoteDelegate) peerToPeerReviewScreen2.Q.getValue(), (CellDetailsSwitcherDelegate) peerToPeerReviewScreen2.R.getValue(), (SuggestionsBarDelegate) peerToPeerReviewScreen2.f102360b0.getValue(), (CounterTextDelegate) peerToPeerReviewScreen2.c0.getValue(), new PlainTextWarningDelegate(), (RowDelegate) peerToPeerReviewScreen2.S.getValue(), (HighlightTileDelegate) peerToPeerReviewScreen2.T.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new TextDelegate()), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PeerToPeerReviewScreen.f102358h0;
                        return (k) ((v8k.f) peerToPeerReviewScreen.f102362e0.getValue()).G.get();
                    default:
                        KProperty[] kPropertyArr3 = PeerToPeerReviewScreen.f102358h0;
                        aqf.b bVar = (aqf.b) ((v8k.f) peerToPeerReviewScreen.f102362e0.getValue()).f286837c.d.i.get();
                        vc.s.j(bVar);
                        return bVar;
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        l9k.h hVar = uiState.f193282b;
        if (hVar != null) {
            Clause clause = hVar.f193275b;
            LargeActionButton largeActionButton = d3().d;
            largeActionButton.setEnabled(true);
            largeActionButton.setText(hVar.f193274a);
            largeActionButton.setLoadingButtonTag("PEER_TO_PEER_REVIEW_PROCEED_CTA_BUTTON_TAG");
            FooterTextView footerTextView = d3().f278255b;
            footerTextView.setVisibility(clause != null ? 0 : 8);
            footerTextView.setTextClause(clause);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        a aVar = (a) R2();
        PeerToPeerReviewScreenInputData peerToPeerReviewScreenInputData = aVar.o;
        aVar.C2(new s8k.a(peerToPeerReviewScreenInputData.f102272a, peerToPeerReviewScreenInputData.f102273b, peerToPeerReviewScreenInputData.f102274c));
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
        return (f) this.f102362e0.getValue();
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
        ?? r2 = this.f102362e0;
        this.N = (b) ((f) r2.getValue()).f286850x.get();
        pd.b.p(view, new TextLocalisedClause(R$string.payments_descriptor_transfer_p2p_review_title, null, null, 14));
        j60.a aVar = (j60.a) ((f) r2.getValue()).f.get();
        ?? r23 = this.X;
        LargeActionButtonDelegate largeActionButtonDelegate = (LargeActionButtonDelegate) r23.getValue();
        ?? r4 = this.U;
        CellDetailsDelegate cellDetailsDelegate = (CellDetailsDelegate) r4.getValue();
        ?? r87 = this.V;
        CellDetailsActionDelegate cellDetailsActionDelegate = (CellDetailsActionDelegate) r87.getValue();
        ?? r102 = this.W;
        CellDetailsNoteDelegate cellDetailsNoteDelegate = (CellDetailsNoteDelegate) r102.getValue();
        ?? r122 = this.Y;
        RowDelegate rowDelegate = (RowDelegate) r122.getValue();
        ?? r142 = this.Z;
        HighlightTileDelegate highlightTileDelegate = (HighlightTileDelegate) r142.getValue();
        ?? r56 = this.f102359a0;
        aVar.d(v.k(largeActionButtonDelegate, cellDetailsDelegate, cellDetailsActionDelegate, cellDetailsNoteDelegate, rowDelegate, highlightTileDelegate, (TextDelegate) r56.getValue()));
        b bVar = this.N;
        if (bVar == null) {
            Intrinsics.r("paymentFeesDialogExtension");
            throw null;
        }
        ((p) bVar).Z2((CellDetailsDelegate) this.O.getValue(), (CellDetailsActionDelegate) this.P.getValue(), (CellDetailsNoteDelegate) this.Q.getValue(), null, (TextDelegate) r56.getValue(), null, null);
        b bVar2 = this.N;
        if (bVar2 == null) {
            Intrinsics.r("paymentFeesDialogExtension");
            throw null;
        }
        ((p) bVar2).Z2((CellDetailsDelegate) r4.getValue(), (CellDetailsActionDelegate) r87.getValue(), (CellDetailsNoteDelegate) r102.getValue(), (LargeActionButtonDelegate) r23.getValue(), (TextDelegate) r56.getValue(), (RowDelegate) r122.getValue(), (HighlightTileDelegate) r142.getValue());
        NavBarWithToolbar navBarWithToolbar = d3().f278256c;
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

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f278256c.f59410q), new g(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f278256c.f59409p.f57336l), new g(this, continuation, 1), 3);
        int i = 2;
        ViewController.P2(this, rd0.e.b(d3().d.o), new g(this, continuation, i), 3);
        ViewController.P2(this, ((aqf.b) this.g0.getValue()).f8427b, new c(this, continuation, i), 3);
        r map = d3().f278255b.f58608l.map(new l5i.b(22, new k(3)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewController.P2(this, rd0.e.b(map), new c(this, continuation, 3), 3);
        r map2 = ((CellDetailsDelegate) this.O.getValue()).d.map(new l5i.b(23, new k(6)));
        r map3 = ((CellDetailsActionDelegate) this.P.getValue()).d.map(new l5i.b(24, new k(7)));
        ?? r3 = this.Q;
        r rVarFilter = r.merge(v.k(map2, map3, ((CellDetailsNoteDelegate) r3.getValue()).d.map(new l5i.b(25, new k(8))), ((CellDetailsNoteDelegate) r3.getValue()).e.map(new l5i.b(26, new k(9))), ((RowDelegate) this.S.getValue()).f53218h.map(new l5i.b(20, new k(4))))).filter(new l5i.b(21, new k(5)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new c(this, continuation, 0), 3);
        ?? r102 = this.R;
        ViewController.P2(this, rd0.e.b(((CellDetailsSwitcherDelegate) r102.getValue()).f51912c), new l9k.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsSwitcherDelegate) r102.getValue()).d), new l9k.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((SuggestionsBarDelegate) this.f102360b0.getValue()).p().d), new l9k.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CounterTextDelegate) this.c0.getValue()).e), new c(this, continuation, 1), 3);
    }

    public final u8k.b d3() {
        ViewBinding value = this.L.getValue(this, f102358h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u8k.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l9k.k R2() {
        return (l9k.k) this.f0.getValue();
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f278254a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return controllerContainerCoordinatorLayout;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f102361d0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}

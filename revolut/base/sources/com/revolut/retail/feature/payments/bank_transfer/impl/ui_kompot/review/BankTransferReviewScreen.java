package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsAttachmentDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
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
import com.revolut.retail.feature.payments.bank_transfer.impl.R$id;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$layout;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.BankTransferReviewScreen;
import com.revolut.retail.feature.payments.core.R$string;
import efm.r;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mga.i0;
import mkd.g;
import n5k.b;
import qz8.f;
import r40.y0;
import r4k.c;
import r4k.d;
import r4k.i;
import r4k.k;
import r4k.n;
import r4k.q;
import te0.w;
import vc.s;
import vkm.j2;
import w4k.l;
import w4k.p;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/review/BankTransferReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lr4k/q;", "Ldli/a;", "Lr4k/s;", "Lmga/i0;", "Lmkd/g;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankTransferReviewScreen extends ViewController<q> implements dli.a, i0, g {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f102115n0 = {o0.f186429a.j(new h0(BankTransferReviewScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/payments/bank_transfer/impl/databinding/ScreenTransferBankReviewBinding;", 0))};
    public final int K;
    public final h L;
    public final boolean M;
    public b N;
    public l O;
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
    public final Object f102116a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f102117b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f102118d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f102119e0;
    public final Object f0;
    public final CellDetailsAttachmentDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final ActionWidgetDelegate f102120h0;
    public final ScrollerDelegate i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f102121k0;
    public final Object l0;
    public final Object m0;

    public BankTransferReviewScreen(BankTransferReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transfer_bank_review;
        this.L = s.t(this, c.f);
        final int i = 1;
        this.M = true;
        this.P = w.y0(new f(23));
        this.Q = w.y0(new r4k.a(1));
        final int i2 = 2;
        this.R = w.y0(new r4k.a(2));
        this.S = w.y0(new r4k.a(3));
        this.T = w.y0(new r4k.a(4));
        this.U = w.y0(new r4k.a(5));
        this.V = w.y0(new r4k.a(6));
        this.W = w.y0(new r4k.a(7));
        this.X = w.y0(new r4k.a(8));
        this.Y = w.y0(new r4k.a(9));
        this.Z = w.y0(new f(24));
        this.f102116a0 = w.y0(new f(25));
        this.f102117b0 = w.y0(new f(26));
        this.c0 = w.y0(new f(27));
        this.f102118d0 = w.y0(new f(28));
        this.f102119e0 = w.y0(new f(29));
        final int i3 = 0;
        this.f0 = w.y0(new r4k.a(0));
        this.g0 = new CellDetailsAttachmentDelegate();
        HeroBannerDelegate heroBannerDelegate = new HeroBannerDelegate(0);
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.f102120h0 = actionWidgetDelegate;
        this.i0 = new ScrollerDelegate(v.k(heroBannerDelegate, new ActionWidgetLoadingDelegate(), actionWidgetDelegate), false);
        this.j0 = w.y0(new qvf.a(this, inputData, 15));
        this.f102121k0 = w.y0(new Function0(this) { // from class: r4k.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankTransferReviewScreen f251473b;

            {
                this.f251473b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                BankTransferReviewScreen bankTransferReviewScreen = this.f251473b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = BankTransferReviewScreen.f102115n0;
                        return (r) ((p2k.k) bankTransferReviewScreen.j0.getValue()).K.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BankTransferReviewScreen.f102115n0;
                        aqf.b bVar = (aqf.b) ((p2k.k) bankTransferReviewScreen.j0.getValue()).d.k.i.get();
                        vc.s.j(bVar);
                        return bVar;
                    default:
                        KProperty[] kPropertyArr3 = BankTransferReviewScreen.f102115n0;
                        BankTransferReviewScreen bankTransferReviewScreen2 = this.f251473b;
                        return dli.f.a(bankTransferReviewScreen2, bankTransferReviewScreen2.R2(), zhm.v.k((CellDetailsDelegate) bankTransferReviewScreen2.P.getValue(), (CellDetailsActionDelegate) bankTransferReviewScreen2.Q.getValue(), (CellDetailsNoteDelegate) bankTransferReviewScreen2.R.getValue(), (CellDetailsSwitcherDelegate) bankTransferReviewScreen2.S.getValue(), (CellDetailsStandaloneNoteDelegate) bankTransferReviewScreen2.T.getValue(), new PlainTextWarningDelegate(), (RowDelegate) bankTransferReviewScreen2.U.getValue(), new RowLoadingDelegate(), (HighlightTileDelegate) bankTransferReviewScreen2.V.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (TextDelegate) bankTransferReviewScreen2.f0.getValue(), bankTransferReviewScreen2.i0, bankTransferReviewScreen2.f102120h0, new ActionWidgetLoadingDelegate(), new CellDetailsActionableIconDelegate(), (CounterTextDelegate) bankTransferReviewScreen2.X.getValue(), (SuggestionsBarDelegate) bankTransferReviewScreen2.W.getValue(), bankTransferReviewScreen2.g0), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                }
            }
        });
        this.l0 = w.y0(new Function0(this) { // from class: r4k.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankTransferReviewScreen f251473b;

            {
                this.f251473b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                BankTransferReviewScreen bankTransferReviewScreen = this.f251473b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = BankTransferReviewScreen.f102115n0;
                        return (r) ((p2k.k) bankTransferReviewScreen.j0.getValue()).K.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BankTransferReviewScreen.f102115n0;
                        aqf.b bVar = (aqf.b) ((p2k.k) bankTransferReviewScreen.j0.getValue()).d.k.i.get();
                        vc.s.j(bVar);
                        return bVar;
                    default:
                        KProperty[] kPropertyArr3 = BankTransferReviewScreen.f102115n0;
                        BankTransferReviewScreen bankTransferReviewScreen2 = this.f251473b;
                        return dli.f.a(bankTransferReviewScreen2, bankTransferReviewScreen2.R2(), zhm.v.k((CellDetailsDelegate) bankTransferReviewScreen2.P.getValue(), (CellDetailsActionDelegate) bankTransferReviewScreen2.Q.getValue(), (CellDetailsNoteDelegate) bankTransferReviewScreen2.R.getValue(), (CellDetailsSwitcherDelegate) bankTransferReviewScreen2.S.getValue(), (CellDetailsStandaloneNoteDelegate) bankTransferReviewScreen2.T.getValue(), new PlainTextWarningDelegate(), (RowDelegate) bankTransferReviewScreen2.U.getValue(), new RowLoadingDelegate(), (HighlightTileDelegate) bankTransferReviewScreen2.V.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (TextDelegate) bankTransferReviewScreen2.f0.getValue(), bankTransferReviewScreen2.i0, bankTransferReviewScreen2.f102120h0, new ActionWidgetLoadingDelegate(), new CellDetailsActionableIconDelegate(), (CounterTextDelegate) bankTransferReviewScreen2.X.getValue(), (SuggestionsBarDelegate) bankTransferReviewScreen2.W.getValue(), bankTransferReviewScreen2.g0), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                }
            }
        });
        this.m0 = w.y0(new Function0(this) { // from class: r4k.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankTransferReviewScreen f251473b;

            {
                this.f251473b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                BankTransferReviewScreen bankTransferReviewScreen = this.f251473b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = BankTransferReviewScreen.f102115n0;
                        return (r) ((p2k.k) bankTransferReviewScreen.j0.getValue()).K.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BankTransferReviewScreen.f102115n0;
                        aqf.b bVar = (aqf.b) ((p2k.k) bankTransferReviewScreen.j0.getValue()).d.k.i.get();
                        vc.s.j(bVar);
                        return bVar;
                    default:
                        KProperty[] kPropertyArr3 = BankTransferReviewScreen.f102115n0;
                        BankTransferReviewScreen bankTransferReviewScreen2 = this.f251473b;
                        return dli.f.a(bankTransferReviewScreen2, bankTransferReviewScreen2.R2(), zhm.v.k((CellDetailsDelegate) bankTransferReviewScreen2.P.getValue(), (CellDetailsActionDelegate) bankTransferReviewScreen2.Q.getValue(), (CellDetailsNoteDelegate) bankTransferReviewScreen2.R.getValue(), (CellDetailsSwitcherDelegate) bankTransferReviewScreen2.S.getValue(), (CellDetailsStandaloneNoteDelegate) bankTransferReviewScreen2.T.getValue(), new PlainTextWarningDelegate(), (RowDelegate) bankTransferReviewScreen2.U.getValue(), new RowLoadingDelegate(), (HighlightTileDelegate) bankTransferReviewScreen2.V.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (TextDelegate) bankTransferReviewScreen2.f0.getValue(), bankTransferReviewScreen2.i0, bankTransferReviewScreen2.f102120h0, new ActionWidgetLoadingDelegate(), new CellDetailsActionableIconDelegate(), (CounterTextDelegate) bankTransferReviewScreen2.X.getValue(), (SuggestionsBarDelegate) bankTransferReviewScreen2.W.getValue(), bankTransferReviewScreen2.g0), R$id.transferScreenReview_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        r4k.s uiState = (r4k.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        k kVar = uiState.f251497b;
        if (kVar != null) {
            Clause clause = kVar.f251477b;
            LargeActionButton largeActionButton = d3().d;
            largeActionButton.setEnabled(true);
            largeActionButton.setText(kVar.f251476a);
            largeActionButton.setLoadingButtonTag("BANK_TRANSFER_REVIEW_CTA_BUTTON_TAG");
            FooterTextView footerTextView = d3().f221659b;
            footerTextView.setVisibility(clause != null ? 0 : 8);
            footerTextView.setTextClause(clause);
        }
        d3().f221660c.setHeaderDisclaimerSticky(uiState.f251498c);
    }

    @Override // mkd.g
    public final r F1() {
        return this.i0.i;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        a aVar = (a) R2();
        j60.a aVar2 = aVar.u;
        if (aVar2.j()) {
            j60.a.v(aVar2, false, null, 3);
            return true;
        }
        aVar.C2(new n(((r4k.l) ((j2) aVar.H.f22677a).getValue()).f251480c));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r N0() {
        r rVarMergeWith = ((HighlightTileDelegate) this.V.getValue()).f52437c.mergeWith(((HighlightTileDelegate) this.f102118d0.getValue()).f52437c);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        return rVarMergeWith;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p2k.k) this.j0.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r2 = this.j0;
        p2k.k kVar = (p2k.k) r2.getValue();
        this.N = (b) kVar.f232390y.get();
        this.O = (l) kVar.f232386s.get();
        pd.b.p(view, new TextLocalisedClause(R$string.payments_descriptor_transfer_bank_review_title, null, null, 14));
        j60.a aVar = (j60.a) ((p2k.k) r2.getValue()).f232378h.get();
        ?? r23 = this.f102117b0;
        LargeActionButtonDelegate largeActionButtonDelegate = (LargeActionButtonDelegate) r23.getValue();
        ?? r4 = this.Y;
        CellDetailsDelegate cellDetailsDelegate = (CellDetailsDelegate) r4.getValue();
        ?? r87 = this.Z;
        CellDetailsActionDelegate cellDetailsActionDelegate = (CellDetailsActionDelegate) r87.getValue();
        ?? r102 = this.f102116a0;
        CellDetailsNoteDelegate cellDetailsNoteDelegate = (CellDetailsNoteDelegate) r102.getValue();
        ?? r122 = this.c0;
        RowDelegate rowDelegate = (RowDelegate) r122.getValue();
        ?? r142 = this.f102118d0;
        HighlightTileDelegate highlightTileDelegate = (HighlightTileDelegate) r142.getValue();
        ?? r62 = this.f102119e0;
        aVar.d(v.k(largeActionButtonDelegate, cellDetailsDelegate, cellDetailsActionDelegate, cellDetailsNoteDelegate, rowDelegate, highlightTileDelegate, (TextDelegate) r62.getValue(), new PlainTextDelegate()));
        l lVar = this.O;
        if (lVar == null) {
            Intrinsics.r("etaDialogExtension");
            throw null;
        }
        ?? r56 = this.R;
        CellDetailsNoteDelegate cellDetailsNoteDelegate2 = (CellDetailsNoteDelegate) r56.getValue();
        LargeActionButtonDelegate largeActionButtonDelegate2 = (LargeActionButtonDelegate) r23.getValue();
        p pVar = (p) lVar;
        Intrinsics.checkNotNullParameter(cellDetailsNoteDelegate2, "cellDetailsNoteDelegate");
        Intrinsics.checkNotNullParameter(largeActionButtonDelegate2, "largeActionButtonDelegate");
        r rVarFilter = cellDetailsNoteDelegate2.d.filter(new vz4.c(new w29.a(24), 27));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        yji.n.j2(pVar, rd0.e.b(rVarFilter), null, new w4k.n(pVar, null), 3);
        yji.n.j2(pVar, rd0.e.b(largeActionButtonDelegate2.d.f121375b), null, new w4k.o(pVar, null), 3);
        b bVar = this.N;
        if (bVar == null) {
            Intrinsics.r("paymentFeesDialogExtension");
            throw null;
        }
        ((n5k.p) bVar).Z2((CellDetailsDelegate) this.P.getValue(), (CellDetailsActionDelegate) this.Q.getValue(), (CellDetailsNoteDelegate) r56.getValue(), null, null, null, null);
        b bVar2 = this.N;
        if (bVar2 == null) {
            Intrinsics.r("paymentFeesDialogExtension");
            throw null;
        }
        ((n5k.p) bVar2).Z2((CellDetailsDelegate) r4.getValue(), (CellDetailsActionDelegate) r87.getValue(), (CellDetailsNoteDelegate) r102.getValue(), (LargeActionButtonDelegate) r23.getValue(), (TextDelegate) r62.getValue(), (RowDelegate) r122.getValue(), (HighlightTileDelegate) r142.getValue());
        NavBarWithToolbar navBarWithToolbar = d3().f221660c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.payments_bank_transfer_review_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.payments_bank_transfer_review_title, null, null, 14));
        navBarWithToolbar.j0(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r a2() {
        r rVarMergeWith = ((RowDelegate) this.U.getValue()).f53218h.mergeWith(((RowDelegate) this.c0.getValue()).f53218h);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        return rVarMergeWith;
    }

    /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v73, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v79, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f221660c.f59410q), new r4k.g(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f221660c.f59409p.f57336l), new r4k.g(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b((ihm.f) d3().f221660c.f59406n.f258290b), new d(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(d3().d.o), new r4k.g(this, continuation, 2), 3);
        ViewController.P2(this, ((aqf.b) this.l0.getValue()).f8427b, new d(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(d3().f221659b.f58608l), new d(this, continuation, 5), 3);
        r map = ((CellDetailsDelegate) this.Y.getValue()).d.map(new r4j.b(new y0(4), 2));
        r map2 = ((CellDetailsDelegate) this.P.getValue()).d.map(new r4j.b(new y0(5), 3));
        r map3 = ((CellDetailsActionDelegate) this.Q.getValue()).d.map(new r4j.b(new y0(6), 4));
        ?? r152 = this.R;
        r map4 = ((CellDetailsNoteDelegate) r152.getValue()).d.map(new r4j.b(new y0(7), 5));
        r map5 = ((CellDetailsNoteDelegate) r152.getValue()).e.map(new r4j.b(new y0(8), 6));
        r map6 = ((CellDetailsStandaloneNoteDelegate) this.T.getValue()).d.map(new r4j.b(new y0(9), 7));
        ?? r153 = this.U;
        r rVarFilter = r.merge(v.k(map, map2, map3, map4, map5, map6, ((RowDelegate) r153.getValue()).k.map(new r4j.b(new y0(10), 8)), ((RowDelegate) r153.getValue()).f53218h.map(new r4j.b(new y0(11), 9)), ((TextDelegate) this.f0.getValue()).d.map(new r4j.b(new y0(12), 10)))).filter(new r4j.b(new y0(13), 1));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new d(this, continuation, 0), 3);
        ?? r154 = this.S;
        ViewController.P2(this, rd0.e.b(((CellDetailsSwitcherDelegate) r154.getValue()).f51912c), new r4k.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsSwitcherDelegate) r154.getValue()).d), new r4k.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((LargeActionButtonDelegate) this.f102117b0.getValue()).d.f121375b), new r4k.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(((SuggestionsBarDelegate) this.W.getValue()).p().d), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CounterTextDelegate) this.X.getValue()).e), new d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.g0.f51808c), new d(this, continuation, 2), 3);
    }

    public final o2k.d d3() {
        ViewBinding value = this.L.getValue(this, f102115n0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o2k.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r4k.r R2() {
        return (r4k.r) this.f102121k0.getValue();
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f221658a;
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
        return (dli.c) this.m0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        return ((dli.c) this.m0.getValue()).w().f;
    }
}

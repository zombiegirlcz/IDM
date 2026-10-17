package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.TransferOutReviewScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.TransferOutReviewScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ebf.d;
import ebf.f;
import ebf.g;
import ebf.l;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l9f.p;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import xki.e;
import z0h.s1;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/screens/review/TransferOutReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lebf/l;", "Lz0h/s1;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferOutReviewScreen extends ViewController<q> implements c, s1 {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TransferOutReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final TransferOutReviewScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final CellDetailsActionDelegate P;
    public final CellDetailsChevronDelegate Q;
    public final Object R;

    public TransferOutReviewScreen(TransferOutReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, d.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ebf.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOutReviewScreen f124321b;

            {
                this.f124321b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransferOutReviewScreen transferOutReviewScreen = this.f124321b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransferOutReviewScreen.S;
                        qji.b bVarU2 = transferOutReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.di.TransferOutReviewScreenInjector");
                        l9f.o oVar = (l9f.o) bVarU2;
                        l9f.k kVar = oVar.f193206b;
                        l9f.o oVar2 = oVar.f193207c;
                        TransferOutReviewScreenContract$InputData transferOutReviewScreenContract$InputData = transferOutReviewScreen.K;
                        transferOutReviewScreenContract$InputData.getClass();
                        return new l9f.p(kVar, oVar2, transferOutReviewScreenContract$InputData, transferOutReviewScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferOutReviewScreen.S;
                        return (k) ((l9f.p) transferOutReviewScreen.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = TransferOutReviewScreen.S;
                        TransferOutReviewScreen transferOutReviewScreen2 = this.f124321b;
                        return tki.g.a(transferOutReviewScreen2, transferOutReviewScreen2.d(), v.k(new RowDelegate(null, null, 7), new CellDetailsLoadingDelegate(), new CellDetailsDelegate(), transferOutReviewScreen2.P, transferOutReviewScreen2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ebf.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOutReviewScreen f124321b;

            {
                this.f124321b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransferOutReviewScreen transferOutReviewScreen = this.f124321b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferOutReviewScreen.S;
                        qji.b bVarU2 = transferOutReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.di.TransferOutReviewScreenInjector");
                        l9f.o oVar = (l9f.o) bVarU2;
                        l9f.k kVar = oVar.f193206b;
                        l9f.o oVar2 = oVar.f193207c;
                        TransferOutReviewScreenContract$InputData transferOutReviewScreenContract$InputData = transferOutReviewScreen.K;
                        transferOutReviewScreenContract$InputData.getClass();
                        return new l9f.p(kVar, oVar2, transferOutReviewScreenContract$InputData, transferOutReviewScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferOutReviewScreen.S;
                        return (k) ((l9f.p) transferOutReviewScreen.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = TransferOutReviewScreen.S;
                        TransferOutReviewScreen transferOutReviewScreen2 = this.f124321b;
                        return tki.g.a(transferOutReviewScreen2, transferOutReviewScreen2.d(), v.k(new RowDelegate(null, null, 7), new CellDetailsLoadingDelegate(), new CellDetailsDelegate(), transferOutReviewScreen2.P, transferOutReviewScreen2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new CellDetailsActionDelegate();
        this.Q = new CellDetailsChevronDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ebf.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOutReviewScreen f124321b;

            {
                this.f124321b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransferOutReviewScreen transferOutReviewScreen = this.f124321b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferOutReviewScreen.S;
                        qji.b bVarU2 = transferOutReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.di.TransferOutReviewScreenInjector");
                        l9f.o oVar = (l9f.o) bVarU2;
                        l9f.k kVar = oVar.f193206b;
                        l9f.o oVar2 = oVar.f193207c;
                        TransferOutReviewScreenContract$InputData transferOutReviewScreenContract$InputData = transferOutReviewScreen.K;
                        transferOutReviewScreenContract$InputData.getClass();
                        return new l9f.p(kVar, oVar2, transferOutReviewScreenContract$InputData, transferOutReviewScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferOutReviewScreen.S;
                        return (k) ((l9f.p) transferOutReviewScreen.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = TransferOutReviewScreen.S;
                        TransferOutReviewScreen transferOutReviewScreen2 = this.f124321b;
                        return tki.g.a(transferOutReviewScreen2, transferOutReviewScreen2.d(), v.k(new RowDelegate(null, null, 7), new CellDetailsLoadingDelegate(), new CellDetailsDelegate(), transferOutReviewScreen2.P, transferOutReviewScreen2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        k kVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = kVarD3.f174534c;
        TextLocalisedClause textLocalisedClause = uiState.f124327a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionText(uiState.f124328b);
        kVarD3.f174533b.setModel(uiState.f124329c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        screenRecyclerNavbarActionFooterNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        screenRecyclerNavbarActionFooterNavBar.setHeaderTitleMode(j0.MULTILINE);
        screenRecyclerNavbarActionFooterNavBar.setDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        k kVarD3 = d3();
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(kVarD3.f174534c.f59410q), new ebf.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(kVarD3.f174533b.f), new ebf.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.d), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f51821c), new g(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ebf.k d() {
        return (ebf.k) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.R.getValue();
    }

    @Override // z0h.s1
    public final vkm.d r() {
        return rd0.e.b(d3().f174533b.e);
    }
}

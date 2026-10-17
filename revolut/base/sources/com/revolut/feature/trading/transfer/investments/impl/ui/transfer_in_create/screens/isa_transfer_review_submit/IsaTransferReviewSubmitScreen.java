package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.isa_transfer_review_submit;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.isa_transfer_review_submit.IsaTransferReviewSubmitScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import gaf.b;
import gaf.f;
import gaf.g;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l9f.c;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/screens/isa_transfer_review_submit/IsaTransferReviewSubmitScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgaf/f;", "Ldli/a;", "Lgaf/h;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IsaTransferReviewSubmitScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(IsaTransferReviewSubmitScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final h K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public IsaTransferReviewSubmitScreen(IsaTransferReviewSubmitScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = R$layout.screen_recycler_navbar_action_footer;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: gaf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IsaTransferReviewSubmitScreen f142156b;

            {
                this.f142156b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = IsaTransferReviewSubmitScreen.P;
                        IsaTransferReviewSubmitScreen isaTransferReviewSubmitScreen = this.f142156b;
                        return dli.f.a(isaTransferReviewSubmitScreen, (g) isaTransferReviewSubmitScreen.O.getValue(), v.k(new CellDetailsNoteDelegate(), new CellDetailsDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = IsaTransferReviewSubmitScreen.P;
                        return (g) ((l9f.c) this.f142156b.N.getValue()).f193160c.get();
                }
            }
        });
        this.N = w.y0(new fx5.a(this, inputData, 18));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: gaf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IsaTransferReviewSubmitScreen f142156b;

            {
                this.f142156b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IsaTransferReviewSubmitScreen.P;
                        IsaTransferReviewSubmitScreen isaTransferReviewSubmitScreen = this.f142156b;
                        return dli.f.a(isaTransferReviewSubmitScreen, (g) isaTransferReviewSubmitScreen.O.getValue(), v.k(new CellDetailsNoteDelegate(), new CellDetailsDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = IsaTransferReviewSubmitScreen.P;
                        return (g) ((l9f.c) this.f142156b.N.getValue()).f193160c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        gaf.h uiState = (gaf.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        TextLocalisedClause textLocalisedClause = uiState.f142163a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
        i iVar = uiState.f142164b;
        screenRecyclerNavbarActionFooterActionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            d3().f174533b.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new gaf.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new gaf.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.e), new gaa.g(this, null, 2), 3);
    }

    public final k d3() {
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}

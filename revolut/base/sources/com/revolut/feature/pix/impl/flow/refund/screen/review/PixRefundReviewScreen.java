package com.revolut.feature.pix.impl.flow.refund.screen.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.refund.screen.review.PixRefundReviewScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ica.b;
import ica.c;
import ica.d;
import ica.f;
import ica.h;
import ica.i;
import ica.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import org.jetbrains.annotations.NotNull;
import p8a.s0;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/refund/screen/review/PixRefundReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lica/h;", "Ldli/a;", "Lica/j;", "Lno/d1;", "Companion", "a", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixRefundReviewScreen extends ViewController<h> implements a, d1 {
    public final boolean K;
    public final int L;
    public final Object M;
    public final ao.h N;
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
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(PixRefundReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.pix.impl.flow.refund.screen.review.PixRefundReviewScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public PixRefundReviewScreen(PixRefundReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = true;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ica.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixRefundReviewScreen f160223b;

            {
                this.f160223b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PixRefundReviewScreen.Companion companion = PixRefundReviewScreen.INSTANCE;
                        return (i) ((s0) this.f160223b.Y.getValue()).f234084g.get();
                    default:
                        PixRefundReviewScreen.Companion companion2 = PixRefundReviewScreen.INSTANCE;
                        PixRefundReviewScreen pixRefundReviewScreen = this.f160223b;
                        return dli.f.a(pixRefundReviewScreen, pixRefundReviewScreen.d(), v.k((CellDetailsDelegate) pixRefundReviewScreen.P.getValue(), (CellDetailsActionDelegate) pixRefundReviewScreen.Q.getValue(), (CellDetailsAccountDelegate) pixRefundReviewScreen.R.getValue(), (CellDetailsNoteDelegate) pixRefundReviewScreen.S.getValue(), (CellDetailsSwitcherDelegate) pixRefundReviewScreen.T.getValue(), (InputTextDelegate) pixRefundReviewScreen.U.getValue(), (ListSubheaderDelegate) pixRefundReviewScreen.V.getValue(), (LargeActionButtonDelegate) pixRefundReviewScreen.X.getValue(), (RowDelegate) pixRefundReviewScreen.W.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ica.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixRefundReviewScreen f160223b;

            {
                this.f160223b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PixRefundReviewScreen.Companion companion = PixRefundReviewScreen.INSTANCE;
                        return (i) ((s0) this.f160223b.Y.getValue()).f234084g.get();
                    default:
                        PixRefundReviewScreen.Companion companion2 = PixRefundReviewScreen.INSTANCE;
                        PixRefundReviewScreen pixRefundReviewScreen = this.f160223b;
                        return dli.f.a(pixRefundReviewScreen, pixRefundReviewScreen.d(), v.k((CellDetailsDelegate) pixRefundReviewScreen.P.getValue(), (CellDetailsActionDelegate) pixRefundReviewScreen.Q.getValue(), (CellDetailsAccountDelegate) pixRefundReviewScreen.R.getValue(), (CellDetailsNoteDelegate) pixRefundReviewScreen.S.getValue(), (CellDetailsSwitcherDelegate) pixRefundReviewScreen.T.getValue(), (InputTextDelegate) pixRefundReviewScreen.U.getValue(), (ListSubheaderDelegate) pixRefundReviewScreen.V.getValue(), (LargeActionButtonDelegate) pixRefundReviewScreen.X.getValue(), (RowDelegate) pixRefundReviewScreen.W.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new i83.b(12));
        this.Q = w.y0(new i83.b(13));
        this.R = w.y0(new i83.b(14));
        this.S = w.y0(new i83.b(15));
        this.T = w.y0(new i83.b(16));
        this.U = w.y0(new i83.b(17));
        this.V = w.y0(new i83.b(9));
        this.W = w.y0(new i83.b(10));
        this.X = w.y0(new i83.b(11));
        this.Y = w.y0(new i1d.b(this, inputData, 15));
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (s0) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((s0) this.Y.getValue()).d.get()).d(u.c((LargeActionButtonDelegate) this.X.getValue()));
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174564b.setLoadingButtonTag("SUBMIT_BUTTON_TAG");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsNoteDelegate) this.S.getValue()).d), null, new ica.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsAccountDelegate) this.R.getValue()).e), null, new d(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.X.getValue()).d.f121375b), null, new f(this, null), 3);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pix_refund_review_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.pix_refund_review_title, null, null, 14));
        d3().f174564b.setText(new TextLocalisedClause(R$string.pix_refund_review_cta_button, null, null, 14));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.W.getValue()).f53218h), null, new c(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}

package com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$id;
import com.revolut.feature.pix.impl.R$layout;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.review.PixQrCodeTransactionReviewScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import org.jetbrains.annotations.NotNull;
import p8a.l0;
import te0.w;
import vc.s;
import wal.f;
import wba.b;
import wba.c;
import wba.d;
import wba.g;
import wba.i;
import wba.r;
import wba.t;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/screen/review/PixQrCodeTransactionReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwba/r;", "Ldli/a;", "Lwba/t;", "Lno/d1;", "Companion", "a", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixQrCodeTransactionReviewScreen extends ViewController<r> implements a, d1 {
    public final boolean K;
    public final int L;
    public final Object M;
    public final h N;
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
    public static final /* synthetic */ KProperty[] f80709a0 = {o0.f186429a.j(new h0(PixQrCodeTransactionReviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/pix/impl/databinding/ScreenPixQrCodeTransactionReviewBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.review.PixQrCodeTransactionReviewScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public PixQrCodeTransactionReviewScreen(i inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = true;
        this.L = R$layout.screen_pix_qr_code_transaction_review;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: wba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeTransactionReviewScreen f296061b;

            {
                this.f296061b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
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
                        PixQrCodeTransactionReviewScreen.Companion companion = PixQrCodeTransactionReviewScreen.INSTANCE;
                        return (s) ((l0) this.f296061b.Z.getValue()).f234017h.get();
                    default:
                        PixQrCodeTransactionReviewScreen.Companion companion2 = PixQrCodeTransactionReviewScreen.INSTANCE;
                        PixQrCodeTransactionReviewScreen pixQrCodeTransactionReviewScreen = this.f296061b;
                        return dli.f.a(pixQrCodeTransactionReviewScreen, pixQrCodeTransactionReviewScreen.R2(), zhm.v.k((CellDetailsDelegate) pixQrCodeTransactionReviewScreen.P.getValue(), (CellDetailsActionDelegate) pixQrCodeTransactionReviewScreen.Q.getValue(), (CellDetailsAccountDelegate) pixQrCodeTransactionReviewScreen.R.getValue(), (CellDetailsNoteDelegate) pixQrCodeTransactionReviewScreen.S.getValue(), (CellDetailsSwitcherDelegate) pixQrCodeTransactionReviewScreen.T.getValue(), (CounterTextDelegate) pixQrCodeTransactionReviewScreen.U.getValue(), (InputTextDelegate) pixQrCodeTransactionReviewScreen.V.getValue(), (ListSubheaderDelegate) pixQrCodeTransactionReviewScreen.W.getValue(), (LargeActionButtonDelegate) pixQrCodeTransactionReviewScreen.Y.getValue(), (RowDelegate) pixQrCodeTransactionReviewScreen.X.getValue()), R$id.pixQrCodeTransactionReviewScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: wba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeTransactionReviewScreen f296061b;

            {
                this.f296061b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
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
                        PixQrCodeTransactionReviewScreen.Companion companion = PixQrCodeTransactionReviewScreen.INSTANCE;
                        return (s) ((l0) this.f296061b.Z.getValue()).f234017h.get();
                    default:
                        PixQrCodeTransactionReviewScreen.Companion companion2 = PixQrCodeTransactionReviewScreen.INSTANCE;
                        PixQrCodeTransactionReviewScreen pixQrCodeTransactionReviewScreen = this.f296061b;
                        return dli.f.a(pixQrCodeTransactionReviewScreen, pixQrCodeTransactionReviewScreen.R2(), zhm.v.k((CellDetailsDelegate) pixQrCodeTransactionReviewScreen.P.getValue(), (CellDetailsActionDelegate) pixQrCodeTransactionReviewScreen.Q.getValue(), (CellDetailsAccountDelegate) pixQrCodeTransactionReviewScreen.R.getValue(), (CellDetailsNoteDelegate) pixQrCodeTransactionReviewScreen.S.getValue(), (CellDetailsSwitcherDelegate) pixQrCodeTransactionReviewScreen.T.getValue(), (CounterTextDelegate) pixQrCodeTransactionReviewScreen.U.getValue(), (InputTextDelegate) pixQrCodeTransactionReviewScreen.V.getValue(), (ListSubheaderDelegate) pixQrCodeTransactionReviewScreen.W.getValue(), (LargeActionButtonDelegate) pixQrCodeTransactionReviewScreen.Y.getValue(), (RowDelegate) pixQrCodeTransactionReviewScreen.X.getValue()), R$id.pixQrCodeTransactionReviewScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new f(9));
        this.Q = w.y0(new f(10));
        this.R = w.y0(new f(11));
        this.S = w.y0(new f(12));
        this.T = w.y0(new f(13));
        this.U = w.y0(new f(4));
        this.V = w.y0(new f(5));
        this.W = w.y0(new f(6));
        this.X = w.y0(new f(7));
        this.Y = w.y0(new f(8));
        this.Z = w.y0(new w83.a(this, inputData, 7));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        t uiState = (t) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton pixQrCodeTransactionReviewScreenScheduleButton = d3().f222977c;
        Intrinsics.checkNotNullExpressionValue(pixQrCodeTransactionReviewScreenScheduleButton, "pixQrCodeTransactionReviewScreenScheduleButton");
        pixQrCodeTransactionReviewScreenScheduleButton.setVisibility(uiState.f296090b ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l0) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((l0) this.Z.getValue()).e.get()).d(u.c((LargeActionButtonDelegate) this.Y.getValue()));
    }

    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f222976b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().d.setLoadingButtonTag("SUBMIT_BUTTON_TAG");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f222976b.f59410q), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o), null, new c(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.Y.getValue()).d.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsNoteDelegate) this.S.getValue()).d), null, new wba.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) this.P.getValue()).f), null, new wba.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.Q.getValue()).d), null, new g(this, null), 3);
        NavBarWithToolbar navBarWithToolbar = d3().f222976b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pix_transaction_review_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.pix_transaction_review_title, null, null, 14));
        d3().f222977c.setIcon(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        d3().d.setText(new TextLocalisedClause(R$string.pix_transaction_review_cta_button, null, null, 14));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f222977c.o), null, new c(this, null, 0), 3);
    }

    public final o8a.e d3() {
        ViewBinding value = this.N.getValue(this, f80709a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o8a.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final wba.s d() {
        return (wba.s) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
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

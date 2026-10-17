package com.revolut.feature.apm.upi.impl.flow.screen.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.upi.impl.flow.screen.review.UpiTransferReviewScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import e58.d;
import eg2.c;
import eg2.f;
import eg2.k;
import eg2.p;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/screen/review/UpiTransferReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Leg2/k;", "Ldli/a;", "Leg2/p;", "Lno/d1;", "Companion", "a", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpiTransferReviewScreen extends ViewController<k> implements a, d1 {
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
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(UpiTransferReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.apm.upi.impl.flow.screen.review.UpiTransferReviewScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public UpiTransferReviewScreen(UpiTransferReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = true;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: eg2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiTransferReviewScreen f125525b;

            {
                this.f125525b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        UpiTransferReviewScreen.Companion companion = UpiTransferReviewScreen.INSTANCE;
                        return (l) ((if2.p) this.f125525b.T.getValue()).f160902h.get();
                    default:
                        UpiTransferReviewScreen.Companion companion2 = UpiTransferReviewScreen.INSTANCE;
                        UpiTransferReviewScreen upiTransferReviewScreen = this.f125525b;
                        return dli.f.a(upiTransferReviewScreen, upiTransferReviewScreen.R2(), v.k((CellDetailsDelegate) upiTransferReviewScreen.Q.getValue(), (CellDetailsNoteDelegate) upiTransferReviewScreen.R.getValue(), (CellDetailsActionDelegate) upiTransferReviewScreen.P.getValue(), (LargeActionButtonDelegate) upiTransferReviewScreen.S.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new PlainTextWarningDelegate(), new IconDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = s.t(this, c.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: eg2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiTransferReviewScreen f125525b;

            {
                this.f125525b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        UpiTransferReviewScreen.Companion companion = UpiTransferReviewScreen.INSTANCE;
                        return (l) ((if2.p) this.f125525b.T.getValue()).f160902h.get();
                    default:
                        UpiTransferReviewScreen.Companion companion2 = UpiTransferReviewScreen.INSTANCE;
                        UpiTransferReviewScreen upiTransferReviewScreen = this.f125525b;
                        return dli.f.a(upiTransferReviewScreen, upiTransferReviewScreen.R2(), v.k((CellDetailsDelegate) upiTransferReviewScreen.Q.getValue(), (CellDetailsNoteDelegate) upiTransferReviewScreen.R.getValue(), (CellDetailsActionDelegate) upiTransferReviewScreen.P.getValue(), (LargeActionButtonDelegate) upiTransferReviewScreen.S.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new PlainTextWarningDelegate(), new IconDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new ebl.a(20));
        this.Q = w.y0(new ebl.a(21));
        this.R = w.y0(new ebl.a(22));
        this.S = w.y0(new ebl.a(23));
        this.T = w.y0(new d(this, inputData, 16));
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((p) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (if2.p) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((if2.p) this.T.getValue()).e.get()).d(u.c((LargeActionButtonDelegate) this.S.getValue()));
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.apm_transfer_review_title_outgoing, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.apm_transfer_review_title_outgoing, null, null, 14));
        LargeActionButton largeActionButton = d3().f174564b;
        l.A(R.string.common_action_send, null, null, 14, largeActionButton);
        largeActionButton.setLoadingButtonTag("SUBMIT_BUTTON_TAG");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new eg2.d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new eg2.d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.S.getValue()).d.f121375b), null, new eg2.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) this.Q.getValue()).f), null, new f(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final eg2.l R2() {
        return (eg2.l) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
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

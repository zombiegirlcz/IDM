package com.revolut.retail.feature.payments.payment_links.impl.ui.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPhotoDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.payment_links.impl.R$id;
import com.revolut.retail.feature.payments.payment_links.impl.R$layout;
import com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkDetailsScreen;
import efm.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u1.g;
import u7k.c;
import u7k.d;
import u7k.e;
import u7k.f;
import u7k.t;
import u7k.u;
import u7k.v;
import vc.s;
import yy0.l;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui/details/PaymentLinkDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lu7k/h;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentLinkDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PaymentLinkDetailsScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/payments/payment_links/impl/databinding/ScreenPaymentLinkDetailsBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final ActionsDelegate O;
    public final FullScreenStateDelegate P;
    public final CellDetailsChevronDelegate Q;
    public final Object R;

    public PaymentLinkDetailsScreen(PaymentLinkDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_payment_link_details;
        this.L = s.t(this, u7k.s.f);
        this.M = w.y0(new g(this, inputData, 17));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: u7k.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinkDetailsScreen f277972b;

            {
                this.f277972b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentLinkDetailsScreen.S;
                        return (g) ((q7k.a) this.f277972b.M.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr2 = PaymentLinkDetailsScreen.S;
                        PaymentLinkDetailsScreen paymentLinkDetailsScreen = this.f277972b;
                        return dli.f.a(paymentLinkDetailsScreen, paymentLinkDetailsScreen.R2(), zhm.v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsNoteDelegate(), new CellDetailsPhotoDelegate(), new PlainTextWarningDelegate(), new ProgressStepVerticalDelegate(), new ListCellDelegate(), new RowLoadingDelegate(), paymentLinkDetailsScreen.O, paymentLinkDetailsScreen.P, new TextDelegate(), paymentLinkDetailsScreen.Q), R$id.plDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = new ActionsDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = new CellDetailsChevronDelegate();
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: u7k.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinkDetailsScreen f277972b;

            {
                this.f277972b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentLinkDetailsScreen.S;
                        return (g) ((q7k.a) this.f277972b.M.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr2 = PaymentLinkDetailsScreen.S;
                        PaymentLinkDetailsScreen paymentLinkDetailsScreen = this.f277972b;
                        return dli.f.a(paymentLinkDetailsScreen, paymentLinkDetailsScreen.R2(), zhm.v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsNoteDelegate(), new CellDetailsPhotoDelegate(), new PlainTextWarningDelegate(), new ProgressStepVerticalDelegate(), new ListCellDelegate(), new RowLoadingDelegate(), paymentLinkDetailsScreen.O, paymentLinkDetailsScreen.P, new TextDelegate(), paymentLinkDetailsScreen.Q), R$id.plDetails_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        u7k.h uiState = (u7k.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar ptDetailsNavBarWithToolbar = d3().f222888b;
        Intrinsics.checkNotNullExpressionValue(ptDetailsNavBarWithToolbar, "ptDetailsNavBarWithToolbar");
        f fVar = uiState.f277959b;
        if (fVar instanceof e) {
            ptDetailsNavBarWithToolbar.setLoadingVisible(true);
            return;
        }
        if (fVar instanceof d) {
            ptDetailsNavBarWithToolbar.setLoadingVisible(false);
            ptDetailsNavBarWithToolbar.setTitle(null, null);
            ptDetailsNavBarWithToolbar.setDescriptionVisible(false);
            ptDetailsNavBarWithToolbar.setSecondDescriptionVisible(false);
            ptDetailsNavBarWithToolbar.setEndImage((l) null);
            ptDetailsNavBarWithToolbar.setEndIconBadge(null);
            return;
        }
        if (!(fVar instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        ptDetailsNavBarWithToolbar.setLoadingVisible(false);
        c cVar = (c) fVar;
        TextLocalisedClause textLocalisedClause = cVar.f277950b;
        MoneyClause moneyClause = cVar.f277949a;
        ptDetailsNavBarWithToolbar.setTitle(moneyClause, null);
        ptDetailsNavBarWithToolbar.setToolbarTitle(moneyClause);
        ptDetailsNavBarWithToolbar.setSecondDescriptionText(cVar.f277951c);
        ptDetailsNavBarWithToolbar.setSecondDescriptionVisible(true);
        ptDetailsNavBarWithToolbar.setDescriptionVisible(true);
        ptDetailsNavBarWithToolbar.setDescriptionColor(R$attr.uikit_colorForeground);
        ptDetailsNavBarWithToolbar.setDescriptionText(textLocalisedClause);
        ptDetailsNavBarWithToolbar.setDescriptionClickable(cVar.f);
        ptDetailsNavBarWithToolbar.setEndImage(cVar.d);
        ptDetailsNavBarWithToolbar.setEndIconBadge(cVar.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (q7k.a) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f222888b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f222888b;
        r rVarMerge = r.merge(navBarWithToolbar.r0(), navBarWithToolbar.q0());
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(rVarMerge), new t(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new t(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.O.f51611c.f121375b), new tz6.e(this, continuation, 29), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new u(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f51821c), new v(this, null), 3);
    }

    public final o7k.a d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o7k.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final u7k.g R2() {
        return (u7k.g) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}

package com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.request;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.payments.payment_links.impl.R$id;
import com.revolut.retail.feature.payments.payment_links.impl.R$layout;
import com.revolut.retail.feature.payments.payment_links.impl.R$string;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.request.PaymentLinksRequestSelectionScreen;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kw4.b;
import l8k.f;
import l8k.i;
import o7k.c;
import q7k.j;
import q7k.l;
import rd0.e;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/request/PaymentLinksRequestSelectionScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ll8k/f;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentLinksRequestSelectionScreen extends BaseRecyclerViewScreen<f, IOData$EmptyInput, q> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f102232b0 = {o0.f186429a.j(new h0(PaymentLinksRequestSelectionScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/payments/payment_links/impl/databinding/ScreenTransferPaymentLinksRequestSelectionBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f102233a0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/payments/payment_links/impl/databinding/ScreenTransferPaymentLinksRequestSelectionBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.plRequestSelection_navigationBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.plRequestSelection_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    i = R$id.plRequestSelection_twinButton;
                    TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(p0, i);
                    if (twinVerticalButton != null) {
                        return new c(twinVerticalButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public PaymentLinksRequestSelectionScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$id.plRequestSelection_recyclerView;
        this.V = R$layout.screen_transfer_payment_links_request_selection;
        this.W = s.t(this, a.f);
        this.X = true;
        this.Y = w.y0(new b(27));
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: l8k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinksRequestSelectionScreen f193001b;

            {
                this.f193001b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PaymentLinksRequestSelectionScreen paymentLinksRequestSelectionScreen = this.f193001b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentLinksRequestSelectionScreen.f102232b0;
                        phm.a aVar = (phm.a) ue0.e.j(paymentLinksRequestSelectionScreen.m2()).a().get(f7k.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new l(((j) aVar2.b()).G, paymentLinksRequestSelectionScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", f7k.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr2 = PaymentLinksRequestSelectionScreen.f102232b0;
                        return (i) ((l) paymentLinksRequestSelectionScreen.Z.getValue()).i.get();
                }
            }
        });
        final int i2 = 1;
        this.f102233a0 = w.y0(new Function0(this) { // from class: l8k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinksRequestSelectionScreen f193001b;

            {
                this.f193001b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PaymentLinksRequestSelectionScreen paymentLinksRequestSelectionScreen = this.f193001b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentLinksRequestSelectionScreen.f102232b0;
                        phm.a aVar = (phm.a) ue0.e.j(paymentLinksRequestSelectionScreen.m2()).a().get(f7k.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new l(((j) aVar2.b()).G, paymentLinksRequestSelectionScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", f7k.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr2 = PaymentLinksRequestSelectionScreen.f102232b0;
                        return (i) ((l) paymentLinksRequestSelectionScreen.Z.getValue()).i.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (l) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.f102233a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, h30.l.y(h3().f222893b.f59410q, h3().f222893b.f59409p.f57336l, "merge(...)"), null, new l8k.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f222894c.o0()), null, new l8k.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f222894c.p0()), null, new l8k.b(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FullScreenStateDelegate) this.Y.getValue()).f52371h.f121375b), null, new l8k.c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((l) this.Z.getValue()).getClass();
        NavBarWithToolbar navBarWithToolbar = h3().f222893b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.payments_payment_link_request_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.payments_payment_link_request_title, null, null, 14));
        TwinVerticalButton twinVerticalButton = h3().f222894c;
        twinVerticalButton.setMainButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(R$string.payments_payment_link_request_action_share, null, null, 14));
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.payments_payment_link_request_action_specific_amount, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF93134e0() {
        return u.c((FullScreenStateDelegate) this.Y.getValue());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(f uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        TwinVerticalButton twinVerticalButton = h3().f222894c;
        boolean z = uiState.f193006b;
        twinVerticalButton.setMainButtonEnabled(z);
        h3().f222894c.setSecondaryButtonEnabled(z);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.V;
    }

    public final c h3() {
        ViewBinding value = this.W.getValue(this, f102232b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}

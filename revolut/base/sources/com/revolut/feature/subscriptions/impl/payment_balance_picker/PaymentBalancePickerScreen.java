package com.revolut.feature.subscriptions.impl.payment_balance_picker;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreen;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import i9e.p;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sae.c;
import sae.d;
import sae.f;
import sae.g;
import sae.j;
import sae.k;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/payment_balance_picker/PaymentBalancePickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lsae/k;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentBalancePickerScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PaymentBalancePickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final int K;
    public final FullScreenStateDelegate L;
    public final RowDelegate M;
    public boolean N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public PaymentBalancePickerScreen(PaymentBalancePickerInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_action_footer;
        this.L = new FullScreenStateDelegate();
        this.M = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: sae.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentBalancePickerScreen f261382b;

            {
                this.f261382b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentBalancePickerScreen.S;
                        PaymentBalancePickerScreen paymentBalancePickerScreen = this.f261382b;
                        return dli.f.a(paymentBalancePickerScreen, (j) paymentBalancePickerScreen.R.getValue(), v.k(new RowLoadingDelegate(), paymentBalancePickerScreen.L, paymentBalancePickerScreen.M, new ListSubheaderDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PaymentBalancePickerScreen.S;
                        return (j) ((p) this.f261382b.Q.getValue()).f159721c.get();
                }
            }
        });
        this.P = s.t(this, c.f);
        this.Q = w.y0(new s86.a(this, inputData, 2));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: sae.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentBalancePickerScreen f261382b;

            {
                this.f261382b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentBalancePickerScreen.S;
                        PaymentBalancePickerScreen paymentBalancePickerScreen = this.f261382b;
                        return dli.f.a(paymentBalancePickerScreen, (j) paymentBalancePickerScreen.R.getValue(), v.k(new RowLoadingDelegate(), paymentBalancePickerScreen.L, paymentBalancePickerScreen.M, new ListSubheaderDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PaymentBalancePickerScreen.S;
                        return (j) ((p) this.f261382b.Q.getValue()).f159721c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        Integer num;
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        if (!this.N && (num = uiState.f261393c) != null) {
            int iIntValue = num.intValue();
            ScreenContentRecyclerView screenRecyclerNavbarActionFooterRecyclerView = d3().d;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterRecyclerView, "screenRecyclerNavbarActionFooterRecyclerView");
            screenRecyclerNavbarActionFooterRecyclerView.addOnLayoutChangeListener(new g(this, screenRecyclerNavbarActionFooterRecyclerView, iIntValue));
        }
        d3().f174533b.setModel(uiState.f261392b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_payment_balance_picker_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.subscriptions_payment_balance_picker_subtitle, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), false, false, 254), 10));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new sae.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new f(this, null), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}

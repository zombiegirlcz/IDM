package com.revolut.feature.card_management.impl.ui.limit.transaction_limit;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.card_management.impl.ui.limit.transaction_limit.TransactionLimitController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tz2.r;
import v03.b;
import v03.c;
import v03.d;
import v03.f;
import v03.g;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/limit/transaction_limit/TransactionLimitController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lv03/f;", "Ldli/a;", "Lv03/h;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionLimitController extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TransactionLimitController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final h K;
    public final CenteredAmountDelegate L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public TransactionLimitController(TransactionLimitControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = new CenteredAmountDelegate(null);
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: v03.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionLimitController f284714b;

            {
                this.f284714b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionLimitController.Q;
                        TransactionLimitController transactionLimitController = this.f284714b;
                        return dli.f.a(transactionLimitController, (d) transactionLimitController.P.getValue(), u.c(transactionLimitController.L), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = TransactionLimitController.Q;
                        return (d) ((r) this.f284714b.O.getValue()).f.get();
                }
            }
        });
        this.O = w.y0(new uj7.a(this, inputData, 29));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: v03.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionLimitController f284714b;

            {
                this.f284714b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionLimitController.Q;
                        TransactionLimitController transactionLimitController = this.f284714b;
                        return dli.f.a(transactionLimitController, (d) transactionLimitController.P.getValue(), u.c(transactionLimitController.L), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = TransactionLimitController.Q;
                        return (d) ((r) this.f284714b.O.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        v03.h uiState = (v03.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        TextLocalisedClause textLocalisedClause = uiState.f284722a;
        g gVar = qVar instanceof g ? (g) qVar : null;
        if (pd.b.k(gVar != null ? Boolean.valueOf(gVar.f284719a) : null)) {
            NavBarWithToolbar navBarWithToolbar = d3().f174565c;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            d3().f174565c.setToolbarTitle(textLocalisedClause);
        }
        if (pd.b.k(gVar != null ? Boolean.valueOf(gVar.f284720b) : null)) {
            d3().f174564b.setEnabled(uiState.f284724c);
        }
        if (pd.b.k(gVar != null ? Boolean.valueOf(gVar.f284721c) : null)) {
            d3().f174565c.setMenuItems(uiState.d);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.j0(false);
        LargeActionButton largeActionButton = d3().f174564b;
        l.A(R.string.card_change_limits_action_set, null, null, 14, largeActionButton);
        largeActionButton.setLoadingButtonTag("SET_LIMIT_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.d.f121375b), null, new up2.q(this, null, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.o.f57403b), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 2), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}

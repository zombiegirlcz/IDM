package com.revolut.feature_exchange.impl.ui.takeprofit_stoploss.amount_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_exchange.impl.R$layout;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.feature_exchange.impl.ui.takeprofit_stoploss.amount_picker.TPSLAmountController;
import com.revolut.feature_exchange.impl.ui.takeprofit_stoploss.amount_picker.TPSLAmountControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dt4.p;
import e18.i;
import e3i.b;
import e3i.c;
import e3i.g;
import e3i.m;
import ihm.f;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import v0i.d;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/takeprofit_stoploss/amount_picker/TPSLAmountController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Le3i/m;", "Ldli/a;", "Le3i/o;", "Companion", "a", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TPSLAmountController extends ViewController<m> implements a {
    public final TPSLAmountControllerContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final h O;
    public final f P;
    public final CenteredAmountDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(TPSLAmountController.class, "binding", "getBinding()Lcom/revolut/feature_exchange/impl/databinding/ScreenTpslAmountPickerBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature_exchange.impl.ui.takeprofit_stoploss.amount_picker.TPSLAmountController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public TPSLAmountController(TPSLAmountControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_tpsl_amount_picker;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: e3i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TPSLAmountController f122296b;

            {
                this.f122296b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TPSLAmountController tPSLAmountController = this.f122296b;
                switch (i2) {
                    case 0:
                        TPSLAmountController.Companion companion = TPSLAmountController.INSTANCE;
                        return (i) ((v0i.d) tPSLAmountController.V.getValue()).f284881l.get();
                    case 1:
                        TPSLAmountController.Companion companion2 = TPSLAmountController.INSTANCE;
                        return (j60.a) ((v0i.d) tPSLAmountController.V.getValue()).f284878g.get();
                    case 2:
                        TPSLAmountController.Companion companion3 = TPSLAmountController.INSTANCE;
                        TPSLAmountController tPSLAmountController2 = this.f122296b;
                        return dli.f.a(tPSLAmountController2, tPSLAmountController2.k3(), zhm.v.k((RowDelegate) tPSLAmountController2.R.getValue(), tPSLAmountController2.Q, (InputTextDelegate) tPSLAmountController2.S.getValue()), 0, null, null, null, 60);
                    default:
                        TPSLAmountController.Companion companion4 = TPSLAmountController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(tPSLAmountController.m2()).a().get(v0i.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v0i.b.class, " is not found"));
                        }
                        v0i.b bVar = ((v0i.b) aVar2.b()).f284870t;
                        TPSLAmountControllerContract$InputData tPSLAmountControllerContract$InputData = tPSLAmountController.K;
                        tPSLAmountControllerContract$InputData.getClass();
                        return new v0i.d(bVar, tPSLAmountController, tPSLAmountControllerContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: e3i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TPSLAmountController f122296b;

            {
                this.f122296b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TPSLAmountController tPSLAmountController = this.f122296b;
                switch (i22) {
                    case 0:
                        TPSLAmountController.Companion companion = TPSLAmountController.INSTANCE;
                        return (i) ((v0i.d) tPSLAmountController.V.getValue()).f284881l.get();
                    case 1:
                        TPSLAmountController.Companion companion2 = TPSLAmountController.INSTANCE;
                        return (j60.a) ((v0i.d) tPSLAmountController.V.getValue()).f284878g.get();
                    case 2:
                        TPSLAmountController.Companion companion3 = TPSLAmountController.INSTANCE;
                        TPSLAmountController tPSLAmountController2 = this.f122296b;
                        return dli.f.a(tPSLAmountController2, tPSLAmountController2.k3(), zhm.v.k((RowDelegate) tPSLAmountController2.R.getValue(), tPSLAmountController2.Q, (InputTextDelegate) tPSLAmountController2.S.getValue()), 0, null, null, null, 60);
                    default:
                        TPSLAmountController.Companion companion4 = TPSLAmountController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(tPSLAmountController.m2()).a().get(v0i.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v0i.b.class, " is not found"));
                        }
                        v0i.b bVar = ((v0i.b) aVar2.b()).f284870t;
                        TPSLAmountControllerContract$InputData tPSLAmountControllerContract$InputData = tPSLAmountController.K;
                        tPSLAmountControllerContract$InputData.getClass();
                        return new v0i.d(bVar, tPSLAmountController, tPSLAmountControllerContract$InputData);
                }
            }
        });
        this.O = s.t(this, c.f);
        this.P = v0.a.d("create(...)");
        this.Q = new CenteredAmountDelegate(new p(this, 27));
        this.R = w.y0(new i(5));
        this.S = w.y0(new i(6));
        this.T = w.y0(new i(7));
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: e3i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TPSLAmountController f122296b;

            {
                this.f122296b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TPSLAmountController tPSLAmountController = this.f122296b;
                switch (i22) {
                    case 0:
                        TPSLAmountController.Companion companion = TPSLAmountController.INSTANCE;
                        return (i) ((v0i.d) tPSLAmountController.V.getValue()).f284881l.get();
                    case 1:
                        TPSLAmountController.Companion companion2 = TPSLAmountController.INSTANCE;
                        return (j60.a) ((v0i.d) tPSLAmountController.V.getValue()).f284878g.get();
                    case 2:
                        TPSLAmountController.Companion companion3 = TPSLAmountController.INSTANCE;
                        TPSLAmountController tPSLAmountController2 = this.f122296b;
                        return dli.f.a(tPSLAmountController2, tPSLAmountController2.k3(), zhm.v.k((RowDelegate) tPSLAmountController2.R.getValue(), tPSLAmountController2.Q, (InputTextDelegate) tPSLAmountController2.S.getValue()), 0, null, null, null, 60);
                    default:
                        TPSLAmountController.Companion companion4 = TPSLAmountController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(tPSLAmountController.m2()).a().get(v0i.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v0i.b.class, " is not found"));
                        }
                        v0i.b bVar = ((v0i.b) aVar2.b()).f284870t;
                        TPSLAmountControllerContract$InputData tPSLAmountControllerContract$InputData = tPSLAmountController.K;
                        tPSLAmountControllerContract$InputData.getClass();
                        return new v0i.d(bVar, tPSLAmountController, tPSLAmountControllerContract$InputData);
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: e3i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TPSLAmountController f122296b;

            {
                this.f122296b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TPSLAmountController tPSLAmountController = this.f122296b;
                switch (i22) {
                    case 0:
                        TPSLAmountController.Companion companion = TPSLAmountController.INSTANCE;
                        return (i) ((v0i.d) tPSLAmountController.V.getValue()).f284881l.get();
                    case 1:
                        TPSLAmountController.Companion companion2 = TPSLAmountController.INSTANCE;
                        return (j60.a) ((v0i.d) tPSLAmountController.V.getValue()).f284878g.get();
                    case 2:
                        TPSLAmountController.Companion companion3 = TPSLAmountController.INSTANCE;
                        TPSLAmountController tPSLAmountController2 = this.f122296b;
                        return dli.f.a(tPSLAmountController2, tPSLAmountController2.k3(), zhm.v.k((RowDelegate) tPSLAmountController2.R.getValue(), tPSLAmountController2.Q, (InputTextDelegate) tPSLAmountController2.S.getValue()), 0, null, null, null, 60);
                    default:
                        TPSLAmountController.Companion companion4 = TPSLAmountController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(tPSLAmountController.m2()).a().get(v0i.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v0i.b.class, " is not found"));
                        }
                        v0i.b bVar = ((v0i.b) aVar2.b()).f284870t;
                        TPSLAmountControllerContract$InputData tPSLAmountControllerContract$InputData = tPSLAmountController.K;
                        tPSLAmountControllerContract$InputData.getClass();
                        return new v0i.d(bVar, tPSLAmountController, tPSLAmountControllerContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e3i.o uiState = (e3i.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f267039c.setEnabled(uiState.f122308b);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithAvatar navBarWithAvatar = d3().f267038b;
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        TPSLAmountControllerContract$InputData tPSLAmountControllerContract$InputData = this.K;
        int i2 = b.f122297a[tPSLAmountControllerContract$InputData.i.ordinal()];
        if (i2 == 1) {
            i = tPSLAmountControllerContract$InputData.f96977a == g3i.a.TAKE_PROFIT ? R$string.fx_orders_take_profit_stop_loss_title_take_profit : R$string.fx_orders_take_profit_stop_loss_title_stop_loss;
        } else if (i2 == 2) {
            i = R$string.fx_orders_settings_limit_price;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.fx_orders_settings_stop_price;
        }
        navBarWithAvatar.setToolbarTitle(new TextLocalisedClause(i, null, null, 14));
        int i3 = R$string.fx_orders_take_profit_stop_loss_current_price_subtitle;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(tPSLAmountControllerContract$InputData.f96979c);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        navBarWithAvatar.setToolbarDescription(new TextLocalisedClause(i3, u.c(new RateClause(new BigDecimal(bigIntegerValueOf, tPSLAmountControllerContract$InputData.e), tPSLAmountControllerContract$InputData.d, new RateClause.Format.Default(tPSLAmountControllerContract$InputData.f96981h, true), null)), null, 12));
        d3().f267039c.setText(new TextLocalisedClause(R$string.fx_orders_take_profit_stop_loss_done, null, null, 14));
        d3().f267039c.setTag("TPSLAmountController_nextButton");
        d3().d.setTag("TPSLAmountController_recyclerView");
        ((j60.a) this.N.getValue()).d(u.c((LargeActionButtonDelegate) this.T.getValue()));
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P), null, new e0b.c(this, continuation, 9), 3);
        CenteredAmountDelegate centeredAmountDelegate = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(centeredAmountDelegate.f51965h.f121375b), null, new e3i.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(centeredAmountDelegate.i.f121375b), null, new e3i.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.f.f121375b), new e3i.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f267038b.f59338a), null, new g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f267039c.o), null, new g(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.T.getValue()).d.f121375b), null, new e3i.h(this, null), 3);
    }

    public final t0i.a d3() {
        ViewBinding value = this.O.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (t0i.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final e3i.i d() {
        return (e3i.i) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}

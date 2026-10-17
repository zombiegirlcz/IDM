package com.revolut.feature.pay_later.impl.ui.purchasecalculator;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.api.R$string;
import com.revolut.feature.pay_later.impl.R$id;
import com.revolut.feature.pay_later.impl.R$layout;
import com.revolut.feature.pay_later.impl.ui.purchasecalculator.PurchaseCalculatorController;
import com.revolut.feature.pay_later.impl.ui.purchasecalculator.PurchaseCalculatorControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import exe.k;
import hk9.d;
import hk9.g;
import hk9.i;
import hk9.l;
import ij9.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import oi9.v;
import rr0.f;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/purchasecalculator/PurchaseCalculatorController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lhk9/l;", "Lno/m;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PurchaseCalculatorController extends ViewController<q> implements a, m {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(PurchaseCalculatorController.class, "binding", "getBinding()Lcom/revolut/feature/pay_later/impl/databinding/ScreenPurchaseCalculatorBinding;", 0))};
    public final /* synthetic */ b K;
    public final PurchaseCalculatorControllerContract$InputData L;
    public final boolean M;
    public final boolean N;
    public final h O;
    public f P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final LargeActionButtonDelegate T;
    public final int U;
    public final Object V;

    public PurchaseCalculatorController(PurchaseCalculatorControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f161739a;
        this.L = inputData;
        this.M = true;
        this.N = true;
        this.O = s.t(this, hk9.b.f);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: hk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PurchaseCalculatorController f152868b;

            {
                this.f152868b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PurchaseCalculatorController purchaseCalculatorController = this.f152868b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PurchaseCalculatorController.W;
                        oi9.f fVar = kotlin.jvm.internal.s.n(purchaseCalculatorController.m2()).v;
                        PurchaseCalculatorControllerContract$InputData purchaseCalculatorControllerContract$InputData = purchaseCalculatorController.L;
                        purchaseCalculatorControllerContract$InputData.getClass();
                        return new oi9.v(fVar, purchaseCalculatorController, purchaseCalculatorControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PurchaseCalculatorController.W;
                        return (k) ((oi9.v) purchaseCalculatorController.Q.getValue()).f225577m.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PurchaseCalculatorController.W;
                        return new CenteredAmountDelegate(new hfb.d(purchaseCalculatorController, 9));
                    default:
                        KProperty[] kPropertyArr4 = PurchaseCalculatorController.W;
                        PurchaseCalculatorController purchaseCalculatorController2 = this.f152868b;
                        return dli.f.a(purchaseCalculatorController2, purchaseCalculatorController2.R2(), zhm.v.k((CenteredAmountDelegate) purchaseCalculatorController2.S.getValue(), new ProgressStepsDelegate()), R$id.purchaseCalculatorScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: hk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PurchaseCalculatorController f152868b;

            {
                this.f152868b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PurchaseCalculatorController purchaseCalculatorController = this.f152868b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PurchaseCalculatorController.W;
                        oi9.f fVar = kotlin.jvm.internal.s.n(purchaseCalculatorController.m2()).v;
                        PurchaseCalculatorControllerContract$InputData purchaseCalculatorControllerContract$InputData = purchaseCalculatorController.L;
                        purchaseCalculatorControllerContract$InputData.getClass();
                        return new oi9.v(fVar, purchaseCalculatorController, purchaseCalculatorControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PurchaseCalculatorController.W;
                        return (k) ((oi9.v) purchaseCalculatorController.Q.getValue()).f225577m.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PurchaseCalculatorController.W;
                        return new CenteredAmountDelegate(new hfb.d(purchaseCalculatorController, 9));
                    default:
                        KProperty[] kPropertyArr4 = PurchaseCalculatorController.W;
                        PurchaseCalculatorController purchaseCalculatorController2 = this.f152868b;
                        return dli.f.a(purchaseCalculatorController2, purchaseCalculatorController2.R2(), zhm.v.k((CenteredAmountDelegate) purchaseCalculatorController2.S.getValue(), new ProgressStepsDelegate()), R$id.purchaseCalculatorScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: hk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PurchaseCalculatorController f152868b;

            {
                this.f152868b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PurchaseCalculatorController purchaseCalculatorController = this.f152868b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PurchaseCalculatorController.W;
                        oi9.f fVar = kotlin.jvm.internal.s.n(purchaseCalculatorController.m2()).v;
                        PurchaseCalculatorControllerContract$InputData purchaseCalculatorControllerContract$InputData = purchaseCalculatorController.L;
                        purchaseCalculatorControllerContract$InputData.getClass();
                        return new oi9.v(fVar, purchaseCalculatorController, purchaseCalculatorControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PurchaseCalculatorController.W;
                        return (k) ((oi9.v) purchaseCalculatorController.Q.getValue()).f225577m.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PurchaseCalculatorController.W;
                        return new CenteredAmountDelegate(new hfb.d(purchaseCalculatorController, 9));
                    default:
                        KProperty[] kPropertyArr4 = PurchaseCalculatorController.W;
                        PurchaseCalculatorController purchaseCalculatorController2 = this.f152868b;
                        return dli.f.a(purchaseCalculatorController2, purchaseCalculatorController2.R2(), zhm.v.k((CenteredAmountDelegate) purchaseCalculatorController2.S.getValue(), new ProgressStepsDelegate()), R$id.purchaseCalculatorScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.T = new LargeActionButtonDelegate();
        this.U = R$layout.screen_purchase_calculator;
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: hk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PurchaseCalculatorController f152868b;

            {
                this.f152868b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PurchaseCalculatorController purchaseCalculatorController = this.f152868b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PurchaseCalculatorController.W;
                        oi9.f fVar = kotlin.jvm.internal.s.n(purchaseCalculatorController.m2()).v;
                        PurchaseCalculatorControllerContract$InputData purchaseCalculatorControllerContract$InputData = purchaseCalculatorController.L;
                        purchaseCalculatorControllerContract$InputData.getClass();
                        return new oi9.v(fVar, purchaseCalculatorController, purchaseCalculatorControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PurchaseCalculatorController.W;
                        return (k) ((oi9.v) purchaseCalculatorController.Q.getValue()).f225577m.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PurchaseCalculatorController.W;
                        return new CenteredAmountDelegate(new hfb.d(purchaseCalculatorController, 9));
                    default:
                        KProperty[] kPropertyArr4 = PurchaseCalculatorController.W;
                        PurchaseCalculatorController purchaseCalculatorController2 = this.f152868b;
                        return dli.f.a(purchaseCalculatorController2, purchaseCalculatorController2.R2(), zhm.v.k((CenteredAmountDelegate) purchaseCalculatorController2.S.getValue(), new ProgressStepsDelegate()), R$id.purchaseCalculatorScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        i iVar = uiState.f152880b;
        LargeActionButton largeActionButton = d3().f205623c;
        if (iVar instanceof hk9.f) {
            largeActionButton.setVisibility(0);
            f fVar = this.P;
            if (fVar == null) {
                Intrinsics.r("nextButtonLoadingController");
                throw null;
            }
            fVar.b(false);
            hk9.f fVar2 = (hk9.f) iVar;
            largeActionButton.setText(fVar2.f152872a);
            largeActionButton.setEnabled(fVar2.f152873b);
            return;
        }
        if (iVar instanceof hk9.h) {
            largeActionButton.setVisibility(0);
            f fVar3 = this.P;
            if (fVar3 != null) {
                fVar3.b(true);
                return;
            } else {
                Intrinsics.r("nextButtonLoadingController");
                throw null;
            }
        }
        if (!(iVar instanceof g)) {
            throw new NoWhenBranchMatchedException();
        }
        f fVar4 = this.P;
        if (fVar4 == null) {
            Intrinsics.r("nextButtonLoadingController");
            throw null;
        }
        fVar4.b(false);
        largeActionButton.setVisibility(8);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        this.K.getClass();
        return b.f161740b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: T2 */
    public final Boolean getG() {
        return Boolean.valueOf(this.N);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((v) this.Q.getValue()).e.get()).d(u.c(this.T));
        BasicNavBar basicNavBar = d3().f205622b;
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        basicNavBar.setTitle(new TextLocalisedClause(R$string.pay_later_instalment_calculator_title, null, null, 14));
        this.P = d3().f205623c.A.V();
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f205622b.f59211b), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new h23.b(rd0.e.b(((CenteredAmountDelegate) this.S.getValue()).f.f121375b), 24), null, new k(2, R2(), hk9.k.class, "onHintClicked", "onHintClicked(Lcom/revolut/core/ui_kit/models/amount/HintModel;)V", 4, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f205623c.o), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.d.f121375b), null, new hk9.e(2, 4, hk9.k.class, R2(), "onBottomDialogLargeActionButtonClicked", "onBottomDialogLargeActionButtonClicked(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
    }

    public final mi9.a d3() {
        ViewBinding value = this.O.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (mi9.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final hk9.k R2() {
        return (hk9.k) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}

package com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.j8;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.R$id;
import com.revolut.feature.pay_bills_taxes.impl.R$layout;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.c;
import efb.i;
import egb.m0;
import eh9.g;
import eh9.m;
import eh9.n;
import h30.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lf9.p;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui_payment/amount/PaymentAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Leh9/g;", "Ldli/a;", "Leh9/h;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentAmountScreen extends ViewController<g> implements dli.a {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f78771b0 = {o0.f186429a.j(new h0(PaymentAmountScreen.class, "binding", "getBinding()Lcom/revolut/feature/pay_bills_taxes/impl/databinding/ScreenApmBillsTransferAmountBinding;", 0))};
    public final PaymentAmountContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public qd0.b O;
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
    public final Object f78772a0;

    public PaymentAmountScreen(PaymentAmountContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_apm_bills_transfer_amount;
        this.M = true;
        this.N = s.t(this, m.f);
        final int i = 2;
        this.P = w.y0(new Function0(this) { // from class: eh9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentAmountScreen f125789b;

            {
                this.f125789b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 2;
                PaymentAmountScreen paymentAmountScreen = this.f125789b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentAmountScreen.f78771b0;
                        return new SelectableDelegate((RowDelegate) paymentAmountScreen.V.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentAmountScreen.f78771b0;
                        PaymentAmountScreen paymentAmountScreen2 = this.f125789b;
                        return dli.f.a(paymentAmountScreen2, paymentAmountScreen2.d(), zhm.v.k((CenteredAmountDelegate) paymentAmountScreen2.Q.getValue(), new RowLoadingDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PaymentAmountScreen.f78771b0;
                        qd0.b bVar = paymentAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 3:
                        KProperty[] kPropertyArr4 = PaymentAmountScreen.f78771b0;
                        qji.b bVarU2 = paymentAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.di.PaymentAmountScreenInjector");
                        lf9.q qVar = (lf9.q) bVarU2;
                        lf9.m mVar = qVar.f194779b;
                        lf9.q qVar2 = qVar.f194780c;
                        PaymentAmountContract$InputData paymentAmountContract$InputData = paymentAmountScreen.K;
                        paymentAmountContract$InputData.getClass();
                        return new lf9.p(mVar, qVar2, paymentAmountScreen, paymentAmountContract$InputData);
                    case 4:
                        KProperty[] kPropertyArr5 = PaymentAmountScreen.f78771b0;
                        return (i) ((lf9.p) paymentAmountScreen.Z.getValue()).u.get();
                    default:
                        KProperty[] kPropertyArr6 = PaymentAmountScreen.f78771b0;
                        return new CenteredAmountDelegate(new eh3.s(paymentAmountScreen, i3));
                }
            }
        });
        final int i2 = 5;
        this.Q = w.y0(new Function0(this) { // from class: eh9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentAmountScreen f125789b;

            {
                this.f125789b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 2;
                PaymentAmountScreen paymentAmountScreen = this.f125789b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentAmountScreen.f78771b0;
                        return new SelectableDelegate((RowDelegate) paymentAmountScreen.V.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentAmountScreen.f78771b0;
                        PaymentAmountScreen paymentAmountScreen2 = this.f125789b;
                        return dli.f.a(paymentAmountScreen2, paymentAmountScreen2.d(), zhm.v.k((CenteredAmountDelegate) paymentAmountScreen2.Q.getValue(), new RowLoadingDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PaymentAmountScreen.f78771b0;
                        qd0.b bVar = paymentAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 3:
                        KProperty[] kPropertyArr4 = PaymentAmountScreen.f78771b0;
                        qji.b bVarU2 = paymentAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.di.PaymentAmountScreenInjector");
                        lf9.q qVar = (lf9.q) bVarU2;
                        lf9.m mVar = qVar.f194779b;
                        lf9.q qVar2 = qVar.f194780c;
                        PaymentAmountContract$InputData paymentAmountContract$InputData = paymentAmountScreen.K;
                        paymentAmountContract$InputData.getClass();
                        return new lf9.p(mVar, qVar2, paymentAmountScreen, paymentAmountContract$InputData);
                    case 4:
                        KProperty[] kPropertyArr5 = PaymentAmountScreen.f78771b0;
                        return (i) ((lf9.p) paymentAmountScreen.Z.getValue()).u.get();
                    default:
                        KProperty[] kPropertyArr6 = PaymentAmountScreen.f78771b0;
                        return new CenteredAmountDelegate(new eh3.s(paymentAmountScreen, i3));
                }
            }
        });
        this.R = w.y0(new m0(3));
        this.S = w.y0(new m0(4));
        this.T = w.y0(new m0(5));
        this.U = w.y0(new m0(6));
        this.V = w.y0(new m0(7));
        final int i3 = 0;
        this.W = w.y0(new Function0(this) { // from class: eh9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentAmountScreen f125789b;

            {
                this.f125789b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 2;
                PaymentAmountScreen paymentAmountScreen = this.f125789b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentAmountScreen.f78771b0;
                        return new SelectableDelegate((RowDelegate) paymentAmountScreen.V.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentAmountScreen.f78771b0;
                        PaymentAmountScreen paymentAmountScreen2 = this.f125789b;
                        return dli.f.a(paymentAmountScreen2, paymentAmountScreen2.d(), zhm.v.k((CenteredAmountDelegate) paymentAmountScreen2.Q.getValue(), new RowLoadingDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PaymentAmountScreen.f78771b0;
                        qd0.b bVar = paymentAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 3:
                        KProperty[] kPropertyArr4 = PaymentAmountScreen.f78771b0;
                        qji.b bVarU2 = paymentAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.di.PaymentAmountScreenInjector");
                        lf9.q qVar = (lf9.q) bVarU2;
                        lf9.m mVar = qVar.f194779b;
                        lf9.q qVar2 = qVar.f194780c;
                        PaymentAmountContract$InputData paymentAmountContract$InputData = paymentAmountScreen.K;
                        paymentAmountContract$InputData.getClass();
                        return new lf9.p(mVar, qVar2, paymentAmountScreen, paymentAmountContract$InputData);
                    case 4:
                        KProperty[] kPropertyArr5 = PaymentAmountScreen.f78771b0;
                        return (i) ((lf9.p) paymentAmountScreen.Z.getValue()).u.get();
                    default:
                        KProperty[] kPropertyArr6 = PaymentAmountScreen.f78771b0;
                        return new CenteredAmountDelegate(new eh3.s(paymentAmountScreen, i32));
                }
            }
        });
        this.X = w.y0(new m0(2));
        final int i5 = 1;
        this.Y = w.y0(new Function0(this) { // from class: eh9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentAmountScreen f125789b;

            {
                this.f125789b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                int i32 = 2;
                PaymentAmountScreen paymentAmountScreen = this.f125789b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentAmountScreen.f78771b0;
                        return new SelectableDelegate((RowDelegate) paymentAmountScreen.V.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentAmountScreen.f78771b0;
                        PaymentAmountScreen paymentAmountScreen2 = this.f125789b;
                        return dli.f.a(paymentAmountScreen2, paymentAmountScreen2.d(), zhm.v.k((CenteredAmountDelegate) paymentAmountScreen2.Q.getValue(), new RowLoadingDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PaymentAmountScreen.f78771b0;
                        qd0.b bVar = paymentAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 3:
                        KProperty[] kPropertyArr4 = PaymentAmountScreen.f78771b0;
                        qji.b bVarU2 = paymentAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.di.PaymentAmountScreenInjector");
                        lf9.q qVar = (lf9.q) bVarU2;
                        lf9.m mVar = qVar.f194779b;
                        lf9.q qVar2 = qVar.f194780c;
                        PaymentAmountContract$InputData paymentAmountContract$InputData = paymentAmountScreen.K;
                        paymentAmountContract$InputData.getClass();
                        return new lf9.p(mVar, qVar2, paymentAmountScreen, paymentAmountContract$InputData);
                    case 4:
                        KProperty[] kPropertyArr5 = PaymentAmountScreen.f78771b0;
                        return (i) ((lf9.p) paymentAmountScreen.Z.getValue()).u.get();
                    default:
                        KProperty[] kPropertyArr6 = PaymentAmountScreen.f78771b0;
                        return new CenteredAmountDelegate(new eh3.s(paymentAmountScreen, i32));
                }
            }
        });
        final int i6 = 3;
        this.Z = w.y0(new Function0(this) { // from class: eh9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentAmountScreen f125789b;

            {
                this.f125789b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                int i32 = 2;
                PaymentAmountScreen paymentAmountScreen = this.f125789b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentAmountScreen.f78771b0;
                        return new SelectableDelegate((RowDelegate) paymentAmountScreen.V.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentAmountScreen.f78771b0;
                        PaymentAmountScreen paymentAmountScreen2 = this.f125789b;
                        return dli.f.a(paymentAmountScreen2, paymentAmountScreen2.d(), zhm.v.k((CenteredAmountDelegate) paymentAmountScreen2.Q.getValue(), new RowLoadingDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PaymentAmountScreen.f78771b0;
                        qd0.b bVar = paymentAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 3:
                        KProperty[] kPropertyArr4 = PaymentAmountScreen.f78771b0;
                        qji.b bVarU2 = paymentAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.di.PaymentAmountScreenInjector");
                        lf9.q qVar = (lf9.q) bVarU2;
                        lf9.m mVar = qVar.f194779b;
                        lf9.q qVar2 = qVar.f194780c;
                        PaymentAmountContract$InputData paymentAmountContract$InputData = paymentAmountScreen.K;
                        paymentAmountContract$InputData.getClass();
                        return new lf9.p(mVar, qVar2, paymentAmountScreen, paymentAmountContract$InputData);
                    case 4:
                        KProperty[] kPropertyArr5 = PaymentAmountScreen.f78771b0;
                        return (i) ((lf9.p) paymentAmountScreen.Z.getValue()).u.get();
                    default:
                        KProperty[] kPropertyArr6 = PaymentAmountScreen.f78771b0;
                        return new CenteredAmountDelegate(new eh3.s(paymentAmountScreen, i32));
                }
            }
        });
        final int i21 = 4;
        this.f78772a0 = w.y0(new Function0(this) { // from class: eh9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentAmountScreen f125789b;

            {
                this.f125789b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                int i32 = 2;
                PaymentAmountScreen paymentAmountScreen = this.f125789b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentAmountScreen.f78771b0;
                        return new SelectableDelegate((RowDelegate) paymentAmountScreen.V.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentAmountScreen.f78771b0;
                        PaymentAmountScreen paymentAmountScreen2 = this.f125789b;
                        return dli.f.a(paymentAmountScreen2, paymentAmountScreen2.d(), zhm.v.k((CenteredAmountDelegate) paymentAmountScreen2.Q.getValue(), new RowLoadingDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PaymentAmountScreen.f78771b0;
                        qd0.b bVar = paymentAmountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 3:
                        KProperty[] kPropertyArr4 = PaymentAmountScreen.f78771b0;
                        qji.b bVarU2 = paymentAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.di.PaymentAmountScreenInjector");
                        lf9.q qVar = (lf9.q) bVarU2;
                        lf9.m mVar = qVar.f194779b;
                        lf9.q qVar2 = qVar.f194780c;
                        PaymentAmountContract$InputData paymentAmountContract$InputData = paymentAmountScreen.K;
                        paymentAmountContract$InputData.getClass();
                        return new lf9.p(mVar, qVar2, paymentAmountScreen, paymentAmountContract$InputData);
                    case 4:
                        KProperty[] kPropertyArr5 = PaymentAmountScreen.f78771b0;
                        return (i) ((lf9.p) paymentAmountScreen.Z.getValue()).u.get();
                    default:
                        KProperty[] kPropertyArr6 = PaymentAmountScreen.f78771b0;
                        return new CenteredAmountDelegate(new eh3.s(paymentAmountScreen, i32));
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        eh9.h uiState = (eh9.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        if9.a aVarD3 = d3();
        LargeActionButton largeActionButton = aVarD3.d;
        LargeActionButton transferScreenAmountScheduleButton = aVarD3.f160968c;
        boolean z = uiState.f125783c;
        largeActionButton.setEnabled(z);
        aVarD3.d.setText(uiState.e);
        j8 j8Var = uiState.f125782b;
        if (j8Var != null) {
            aVarD3.f160967b.setModel(j8Var);
        }
        Intrinsics.checkNotNullExpressionValue(transferScreenAmountScheduleButton, "transferScreenAmountScheduleButton");
        transferScreenAmountScheduleButton.setVisibility(uiState.d ? 0 : 8);
        transferScreenAmountScheduleButton.setEnabled(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r06 = this.Z;
        qd0.b bVarN = ((p) r06.getValue()).f194765b.f194734b.n();
        s.j(bVarN);
        this.O = bVarN;
        pd.b.p(view, this.K.getD());
        ((j60.a) ((p) r06.getValue()).f194769j.get()).d(v.k((LargeActionButtonDelegate) this.R.getValue(), (CellDetailsDelegate) this.S.getValue(), (CellDetailsActionDelegate) this.T.getValue(), (CellDetailsNoteDelegate) this.U.getValue(), (RowDelegate) this.V.getValue(), (TextDelegate) this.X.getValue(), (SelectableDelegate) this.W.getValue()));
        NavBarWithAvatar navBarWithAvatar = d3().f160967b;
        navBarWithAvatar.setToolbarTitle(new TextLocalisedClause(R$string.pay_bills_taxes_payment_amount_title, null, null, 14));
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton largeActionButton = d3().d;
        largeActionButton.setLoadingButtonTag("APM_BILLS_TRANSFER_AMOUNT_CTA_BUTTON_TAG");
        largeActionButton.setVisibility(0);
        largeActionButton.setEnabled(false);
        LargeActionButton largeActionButton2 = d3().f160968c;
        largeActionButton2.setIcon(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        pd.b.p(largeActionButton2, new TextLocalisedClause(R.string.common_action_schedule, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o), null, new n(this, continuation, 0), 3);
        ?? r62 = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) r62.getValue()).d.f121375b), null, new eh9.o(this, continuation, 0), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((CenteredAmountDelegate) r62.getValue()).f.f121375b, new i(16))), null, new eh9.o(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f160968c.o), null, new n(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f160967b.f59338a), null, new n(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, l.y(((CenteredAmountDelegate) r62.getValue()).e.f121375b, ((CenteredAmountDelegate) r62.getValue()).f51966j.f121375b, "merge(...)"), null, new eh9.p(this, null), 3);
    }

    public final if9.a d3() {
        ViewBinding value = this.N.getValue(this, f78771b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (if9.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final eh9.i d() {
        return (eh9.i) this.f78772a0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}

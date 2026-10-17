package com.revolut.feature.payments.profile.impl.ui_kompot.flow;

import aii.q;
import ali.g;
import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.feature.payments.profile.impl.R$id;
import com.revolut.feature.payments.profile.impl.R$layout;
import com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlow;
import com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import jh.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.d0;
import vc.s;
import vge.z1;
import vq5.x;
import vw9.j;
import xki.e;
import yy0.f;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/profile/impl/ui_kompot/flow/PaymentProfileFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lali/g;", "Lvw9/j;", "Lcom/revolut/feature/payments/profile/impl/ui_kompot/flow/PaymentProfileFlowContract$Step;", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentProfileFlow extends ViewController<q> implements g {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(PaymentProfileFlow.class, "binding", "getBinding()Lcom/revolut/feature/payments/profile/impl/databinding/PaymentsProfileFlowBinding;", 0))};
    public final PaymentProfileFlowContract$InputData K;
    public final h L;
    public final int M;
    public final int N;
    public final boolean O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public PaymentProfileFlow(PaymentProfileFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, vw9.c.f);
        this.M = R$layout.payments_profile_flow;
        this.N = R$style.UiKitTheme_Mono;
        this.O = true;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: vw9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentProfileFlow f292659b;

            {
                this.f292659b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PaymentProfileFlow paymentProfileFlow = this.f292659b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentProfileFlow.U;
                        return mif.a.a(paymentProfileFlow, 0, R$id.paymentProfile_pager, paymentProfileFlow.R2(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentProfileFlow.U;
                        phm.a aVar = (phm.a) ue0.e.j(paymentProfileFlow.m2()).a().get(ow9.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ow9.l.class, " is not found"));
                        }
                        ow9.e eVar = ((ow9.e) aVar2.b()).z;
                        PaymentProfileFlowContract$InputData paymentProfileFlowContract$InputData = paymentProfileFlow.K;
                        paymentProfileFlowContract$InputData.getClass();
                        return new ow9.f(eVar, paymentProfileFlow, paymentProfileFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PaymentProfileFlow.U;
                        return (g) ((ow9.f) paymentProfileFlow.Q.getValue()).u.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: vw9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentProfileFlow f292659b;

            {
                this.f292659b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PaymentProfileFlow paymentProfileFlow = this.f292659b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentProfileFlow.U;
                        return mif.a.a(paymentProfileFlow, 0, R$id.paymentProfile_pager, paymentProfileFlow.R2(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentProfileFlow.U;
                        phm.a aVar = (phm.a) ue0.e.j(paymentProfileFlow.m2()).a().get(ow9.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ow9.l.class, " is not found"));
                        }
                        ow9.e eVar = ((ow9.e) aVar2.b()).z;
                        PaymentProfileFlowContract$InputData paymentProfileFlowContract$InputData = paymentProfileFlow.K;
                        paymentProfileFlowContract$InputData.getClass();
                        return new ow9.f(eVar, paymentProfileFlow, paymentProfileFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PaymentProfileFlow.U;
                        return (g) ((ow9.f) paymentProfileFlow.Q.getValue()).u.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: vw9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentProfileFlow f292659b;

            {
                this.f292659b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PaymentProfileFlow paymentProfileFlow = this.f292659b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentProfileFlow.U;
                        return mif.a.a(paymentProfileFlow, 0, R$id.paymentProfile_pager, paymentProfileFlow.R2(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentProfileFlow.U;
                        phm.a aVar = (phm.a) ue0.e.j(paymentProfileFlow.m2()).a().get(ow9.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ow9.l.class, " is not found"));
                        }
                        ow9.e eVar = ((ow9.e) aVar2.b()).z;
                        PaymentProfileFlowContract$InputData paymentProfileFlowContract$InputData = paymentProfileFlow.K;
                        paymentProfileFlowContract$InputData.getClass();
                        return new ow9.f(eVar, paymentProfileFlow, paymentProfileFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PaymentProfileFlow.U;
                        return (g) ((ow9.f) paymentProfileFlow.Q.getValue()).u.get();
                }
            }
        });
        this.S = w.y0(new vo8.b(12));
        this.T = w.y0(new vo8.b(13));
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getS() {
        return Integer.valueOf(this.N);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f209410c.setMenuItems(uiState.f292662a.f292661b);
        d3().f209410c.setHeaderContent(uiState.f292662a.f292660a);
        CutoutImageView cutoutImageView = d3().f209409b;
        if (uiState.f292663b == null) {
            cutoutImageView.setVisibility(8);
            return;
        }
        Context context = cutoutImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        f.e(d.f(context).Q(), uiState.f292663b, cutoutImageView, null, null, 12);
        cutoutImageView.setVisibility(0);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        PaymentProfileFlowContract$Step step = (PaymentProfileFlowContract$Step) pagerItem;
        Intrinsics.checkNotNullParameter(step, "pagerItem");
        b bVar = (b) R2();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(step, "step");
        bVar.H2(bVar.f79642w, new x(step, 24));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ow9.f) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (ow9.f) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((ow9.f) this.Q.getValue()).f230361g.get()).d(v.k((RowDelegate) this.S.getValue(), (LargeActionButtonDelegate) this.T.getValue()));
        d3().f209410c.setBackground(d0.TRANSPARENT);
        d3().f209410c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f209410c.o), null, new vw9.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f209410c.f59211b), null, new z1(this, continuation, 20), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f209410c.f59210a.f57403b), null, new vrl.d(this, continuation, 11), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.S.getValue()).f53218h), null, new vw9.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.T.getValue()).d.f121375b), null, new vw9.f(this, null), 3);
    }

    public final mw9.a d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (mw9.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final vw9.g R2() {
        return (vw9.g) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}

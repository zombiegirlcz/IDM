package com.revolut.feature.revolutpay.impl.external.ui.flow.root;

import a07.b;
import a8c.d;
import a8c.g;
import a8c.h;
import a8c.i;
import android.app.Activity;
import android.content.Intent;
import com.revolut.feature.revolutpay.impl.external.ui.flow.root.RevolutPayRootFlow;
import com.revolut.feature.revolutpay.impl.ui.flow.summary.SummaryFlowContract$PaymentResult;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.root.RootFlow;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import dki.s;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.t0;
import p7c.t;
import te0.w;
import tji.f;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/external/ui/flow/root/RevolutPayRootFlow;", "Lcom/revolut/kompot/navigable/root/RootFlow;", "Lcom/revolut/feature/revolutpay/impl/external/ui/flow/root/RevolutPayRootFlowContract$Step;", "Lcom/revolut/feature/revolutpay/impl/external/ui/flow/root/RevolutPayRootFlowContract$InputData;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutPayRootFlow extends RootFlow<RevolutPayRootFlowContract$Step, RevolutPayRootFlowContract$InputData> {
    public final Object U;
    public final String V;
    public final Object W;
    public final Object X;
    public final Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevolutPayRootFlow(RevolutPayRootFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: a8c.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutPayRootFlow f2159b;

            {
                this.f2159b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        RevolutPayRootFlow revolutPayRootFlow = this.f2159b;
                        Activity activityM2 = revolutPayRootFlow.m2();
                        return new tji.f(new tji.d(activityM2, new tji.e(activityM2, 0)), d0.F0(new t0(revolutPayRootFlow.m2()), kii.g.a(revolutPayRootFlow.m2())));
                    case 1:
                        return (d) ((t) this.f2159b.W.getValue()).e.get();
                    default:
                        return (ControllerContainerFrameLayout) this.f2159b.D2().findViewById(R$id.container);
                }
            }
        });
        this.V = "RevolutPay flow";
        this.W = w.y0(new b(this, inputData, 16));
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: a8c.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutPayRootFlow f2159b;

            {
                this.f2159b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        RevolutPayRootFlow revolutPayRootFlow = this.f2159b;
                        Activity activityM2 = revolutPayRootFlow.m2();
                        return new tji.f(new tji.d(activityM2, new tji.e(activityM2, 0)), d0.F0(new t0(revolutPayRootFlow.m2()), kii.g.a(revolutPayRootFlow.m2())));
                    case 1:
                        return (d) ((t) this.f2159b.W.getValue()).e.get();
                    default:
                        return (ControllerContainerFrameLayout) this.f2159b.D2().findViewById(R$id.container);
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: a8c.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutPayRootFlow f2159b;

            {
                this.f2159b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        RevolutPayRootFlow revolutPayRootFlow = this.f2159b;
                        Activity activityM2 = revolutPayRootFlow.m2();
                        return new tji.f(new tji.d(activityM2, new tji.e(activityM2, 0)), d0.F0(new t0(revolutPayRootFlow.m2()), kii.g.a(revolutPayRootFlow.m2())));
                    case 1:
                        return (d) ((t) this.f2159b.W.getValue()).e.get();
                    default:
                        return (ControllerContainerFrameLayout) this.f2159b.D2().findViewById(R$id.container);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (t) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (t) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (d) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void X2(int i, int i2, Intent intent) throws Throwable {
        if (i == 12321) {
            SummaryFlowContract$PaymentResult summaryFlowContract$PaymentResult = intent != null ? (SummaryFlowContract$PaymentResult) intent.getParcelableExtra("PAYMENT_RESULT_EXTRA_KEY") : null;
            a aVar = (a) ((d) this.X.getValue());
            a8c.b bVar = aVar.A;
            if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.Successful) {
                bVar.a(new i(((RevolutPayRootFlowContract$State) aVar.A2().f98429a).f84469b, ((SummaryFlowContract$PaymentResult.Successful) summaryFlowContract$PaymentResult).f84486a));
                return;
            }
            if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.DropOff) {
                bVar.a(new g(((RevolutPayRootFlowContract$State) aVar.A2().f98429a).f84469b));
                return;
            }
            if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.Failure) {
                bVar.a(new h(((RevolutPayRootFlowContract$State) aVar.A2().f98429a).f84469b, ((SummaryFlowContract$PaymentResult.Failure) summaryFlowContract$PaymentResult).f84483a));
                return;
            }
            if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.TerminalPayment) {
                throw new Throwable("TerminalPayment result cannot be handled in the root flow");
            }
            if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.OAuthSuccessful) {
                throw new Throwable("OAuthSuccessful result cannot be handled in the root flow");
            }
            if (summaryFlowContract$PaymentResult instanceof SummaryFlowContract$PaymentResult.OAuthSetupFailed) {
                throw new Throwable("OAuthSetupFailed result cannot be handled in the root flow");
            }
            if (summaryFlowContract$PaymentResult != null) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.a(new g(((RevolutPayRootFlowContract$State) aVar.A2().f98429a).f84469b));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.root.RootFlow
    public final ControllerContainerFrameLayout h3() {
        Object value = this.Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ControllerContainerFrameLayout) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.root.RootFlow
    public final f i3() {
        return (f) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: p2, reason: from getter */
    public final String getV() {
        return this.V;
    }
}

package com.revolut.feature.credit.application.plugins.impl.ui.confirmation;

import a0.d;
import com.revolut.feature.credit.application.plugins.impl.ui.confirmation.ConfirmationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.confirmation.ConfirmationRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import dw3.c1;
import dw3.l0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import yki.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/confirmation/ConfirmationRootFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConfirmationRootFlow extends PluginFlowControllerV2 {
    public final ConfirmationFlowContract$InputData L;
    public final Object M;
    public final Object N;
    public final Object O;

    public ConfirmationRootFlow(ConfirmationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: v64.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmationRootFlow f286323b;

            {
                this.f286323b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ConfirmationRootFlow confirmationRootFlow = this.f286323b;
                        phm.a aVar = (phm.a) e.j(confirmationRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        ConfirmationFlowContract$InputData confirmationFlowContract$InputData = confirmationRootFlow.L;
                        confirmationFlowContract$InputData.getClass();
                        return new l0(c1Var, new iq3.a(), confirmationRootFlow, confirmationFlowContract$InputData);
                    case 1:
                        return (a) ((l0) this.f286323b.M.getValue()).u.get();
                    default:
                        ConfirmationRootFlow confirmationRootFlow2 = this.f286323b;
                        return czi.c.d(0, 6, null, confirmationRootFlow2, (a) confirmationRootFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: v64.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmationRootFlow f286323b;

            {
                this.f286323b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ConfirmationRootFlow confirmationRootFlow = this.f286323b;
                        phm.a aVar = (phm.a) e.j(confirmationRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        ConfirmationFlowContract$InputData confirmationFlowContract$InputData = confirmationRootFlow.L;
                        confirmationFlowContract$InputData.getClass();
                        return new l0(c1Var, new iq3.a(), confirmationRootFlow, confirmationFlowContract$InputData);
                    case 1:
                        return (a) ((l0) this.f286323b.M.getValue()).u.get();
                    default:
                        ConfirmationRootFlow confirmationRootFlow2 = this.f286323b;
                        return czi.c.d(0, 6, null, confirmationRootFlow2, (a) confirmationRootFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: v64.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmationRootFlow f286323b;

            {
                this.f286323b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ConfirmationRootFlow confirmationRootFlow = this.f286323b;
                        phm.a aVar = (phm.a) e.j(confirmationRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        ConfirmationFlowContract$InputData confirmationFlowContract$InputData = confirmationRootFlow.L;
                        confirmationFlowContract$InputData.getClass();
                        return new l0(c1Var, new iq3.a(), confirmationRootFlow, confirmationFlowContract$InputData);
                    case 1:
                        return (a) ((l0) this.f286323b.M.getValue()).u.get();
                    default:
                        ConfirmationRootFlow confirmationRootFlow2 = this.f286323b;
                        return czi.c.d(0, 6, null, confirmationRootFlow2, (a) confirmationRootFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (l0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (v64.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}

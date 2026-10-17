package com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow;

import com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.AutopayFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.AutopayRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import dw3.c1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/autopay/loan/flow/AutopayRootFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AutopayRootFlow extends PluginFlowControllerV2 {
    public final AutopayFlowContract$InputData L;
    public final Object M;
    public final Object N;
    public final Object O;

    public AutopayRootFlow(AutopayFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: n54.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutopayRootFlow f212548b;

            {
                this.f212548b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AutopayRootFlow autopayRootFlow = this.f212548b;
                        phm.a aVar = (phm.a) ue0.e.j(autopayRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        AutopayFlowContract$InputData autopayFlowContract$InputData = autopayRootFlow.L;
                        autopayFlowContract$InputData.getClass();
                        return new dw3.w(c1Var, new iq3.a(), autopayRootFlow, autopayFlowContract$InputData);
                    case 1:
                        return (a) ((dw3.w) this.f212548b.M.getValue()).u.get();
                    default:
                        AutopayRootFlow autopayRootFlow2 = this.f212548b;
                        return czi.c.d(0, 6, null, autopayRootFlow2, (a) autopayRootFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: n54.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutopayRootFlow f212548b;

            {
                this.f212548b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AutopayRootFlow autopayRootFlow = this.f212548b;
                        phm.a aVar = (phm.a) ue0.e.j(autopayRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        AutopayFlowContract$InputData autopayFlowContract$InputData = autopayRootFlow.L;
                        autopayFlowContract$InputData.getClass();
                        return new dw3.w(c1Var, new iq3.a(), autopayRootFlow, autopayFlowContract$InputData);
                    case 1:
                        return (a) ((dw3.w) this.f212548b.M.getValue()).u.get();
                    default:
                        AutopayRootFlow autopayRootFlow2 = this.f212548b;
                        return czi.c.d(0, 6, null, autopayRootFlow2, (a) autopayRootFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: n54.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutopayRootFlow f212548b;

            {
                this.f212548b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AutopayRootFlow autopayRootFlow = this.f212548b;
                        phm.a aVar = (phm.a) ue0.e.j(autopayRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        AutopayFlowContract$InputData autopayFlowContract$InputData = autopayRootFlow.L;
                        autopayFlowContract$InputData.getClass();
                        return new dw3.w(c1Var, new iq3.a(), autopayRootFlow, autopayFlowContract$InputData);
                    case 1:
                        return (a) ((dw3.w) this.f212548b.M.getValue()).u.get();
                    default:
                        AutopayRootFlow autopayRootFlow2 = this.f212548b;
                        return czi.c.d(0, 6, null, autopayRootFlow2, (a) autopayRootFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (dw3.w) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (dw3.w) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (n54.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}

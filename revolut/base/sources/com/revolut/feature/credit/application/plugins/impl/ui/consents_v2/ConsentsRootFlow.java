package com.revolut.feature.credit.application.plugins.impl.ui.consents_v2;

import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.ConsentsFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.ConsentsRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import dw3.c1;
import dw3.o0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/consents_v2/ConsentsRootFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsentsRootFlow extends PluginFlowControllerV2 {
    public final ConsentsFlowContract$InputData L;
    public final Object M;
    public final Object N;
    public final Object O;

    public ConsentsRootFlow(ConsentsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: g74.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentsRootFlow f141108b;

            {
                this.f141108b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ConsentsRootFlow consentsRootFlow = this.f141108b;
                        phm.a aVar = (phm.a) ue0.e.j(consentsRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        ConsentsFlowContract$InputData consentsFlowContract$InputData = consentsRootFlow.L;
                        consentsFlowContract$InputData.getClass();
                        return new o0(c1Var, new iq3.a(), consentsRootFlow, consentsFlowContract$InputData);
                    case 1:
                        return (a) ((o0) this.f141108b.M.getValue()).u.get();
                    default:
                        ConsentsRootFlow consentsRootFlow2 = this.f141108b;
                        return czi.c.d(0, 6, null, consentsRootFlow2, (a) consentsRootFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: g74.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentsRootFlow f141108b;

            {
                this.f141108b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ConsentsRootFlow consentsRootFlow = this.f141108b;
                        phm.a aVar = (phm.a) ue0.e.j(consentsRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        ConsentsFlowContract$InputData consentsFlowContract$InputData = consentsRootFlow.L;
                        consentsFlowContract$InputData.getClass();
                        return new o0(c1Var, new iq3.a(), consentsRootFlow, consentsFlowContract$InputData);
                    case 1:
                        return (a) ((o0) this.f141108b.M.getValue()).u.get();
                    default:
                        ConsentsRootFlow consentsRootFlow2 = this.f141108b;
                        return czi.c.d(0, 6, null, consentsRootFlow2, (a) consentsRootFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: g74.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentsRootFlow f141108b;

            {
                this.f141108b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ConsentsRootFlow consentsRootFlow = this.f141108b;
                        phm.a aVar = (phm.a) ue0.e.j(consentsRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        ConsentsFlowContract$InputData consentsFlowContract$InputData = consentsRootFlow.L;
                        consentsFlowContract$InputData.getClass();
                        return new o0(c1Var, new iq3.a(), consentsRootFlow, consentsFlowContract$InputData);
                    case 1:
                        return (a) ((o0) this.f141108b.M.getValue()).u.get();
                    default:
                        ConsentsRootFlow consentsRootFlow2 = this.f141108b;
                        return czi.c.d(0, 6, null, consentsRootFlow2, (a) consentsRootFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (o0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g74.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}

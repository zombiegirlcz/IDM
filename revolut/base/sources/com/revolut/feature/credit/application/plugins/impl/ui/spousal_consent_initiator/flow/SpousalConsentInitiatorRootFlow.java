package com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow;

import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorRootFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dw3.c1;
import dw3.u6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import uki.c;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorRootFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "Luki/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SpousalConsentInitiatorRootFlow extends PluginFlowControllerV2 implements c {
    public final SpousalConsentInitiatorFlowContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public SpousalConsentInitiatorRootFlow(SpousalConsentInitiatorFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: mi4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpousalConsentInitiatorRootFlow f205617b;

            {
                this.f205617b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SpousalConsentInitiatorRootFlow spousalConsentInitiatorRootFlow = this.f205617b;
                        phm.a aVar = (phm.a) ue0.e.j(spousalConsentInitiatorRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        SpousalConsentInitiatorFlowContract$InputData spousalConsentInitiatorFlowContract$InputData = spousalConsentInitiatorRootFlow.L;
                        spousalConsentInitiatorFlowContract$InputData.getClass();
                        return new u6(c1Var, new iq3.a(), spousalConsentInitiatorRootFlow, spousalConsentInitiatorFlowContract$InputData);
                    case 1:
                        return (a) ((u6) this.f205617b.N.getValue()).u.get();
                    default:
                        SpousalConsentInitiatorRootFlow spousalConsentInitiatorRootFlow2 = this.f205617b;
                        return czi.c.a(R$id.screen_transparent_container, (a) spousalConsentInitiatorRootFlow2.O.getValue(), spousalConsentInitiatorRootFlow2);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: mi4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpousalConsentInitiatorRootFlow f205617b;

            {
                this.f205617b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SpousalConsentInitiatorRootFlow spousalConsentInitiatorRootFlow = this.f205617b;
                        phm.a aVar = (phm.a) ue0.e.j(spousalConsentInitiatorRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        SpousalConsentInitiatorFlowContract$InputData spousalConsentInitiatorFlowContract$InputData = spousalConsentInitiatorRootFlow.L;
                        spousalConsentInitiatorFlowContract$InputData.getClass();
                        return new u6(c1Var, new iq3.a(), spousalConsentInitiatorRootFlow, spousalConsentInitiatorFlowContract$InputData);
                    case 1:
                        return (a) ((u6) this.f205617b.N.getValue()).u.get();
                    default:
                        SpousalConsentInitiatorRootFlow spousalConsentInitiatorRootFlow2 = this.f205617b;
                        return czi.c.a(R$id.screen_transparent_container, (a) spousalConsentInitiatorRootFlow2.O.getValue(), spousalConsentInitiatorRootFlow2);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: mi4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpousalConsentInitiatorRootFlow f205617b;

            {
                this.f205617b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        SpousalConsentInitiatorRootFlow spousalConsentInitiatorRootFlow = this.f205617b;
                        phm.a aVar = (phm.a) ue0.e.j(spousalConsentInitiatorRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        SpousalConsentInitiatorFlowContract$InputData spousalConsentInitiatorFlowContract$InputData = spousalConsentInitiatorRootFlow.L;
                        spousalConsentInitiatorFlowContract$InputData.getClass();
                        return new u6(c1Var, new iq3.a(), spousalConsentInitiatorRootFlow, spousalConsentInitiatorFlowContract$InputData);
                    case 1:
                        return (a) ((u6) this.f205617b.N.getValue()).u.get();
                    default:
                        SpousalConsentInitiatorRootFlow spousalConsentInitiatorRootFlow2 = this.f205617b;
                        return czi.c.a(R$id.screen_transparent_container, (a) spousalConsentInitiatorRootFlow2.O.getValue(), spousalConsentInitiatorRootFlow2);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u6) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (u6) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (mi4.a) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final pki.a k() {
        return (uki.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final yki.c k() {
        return (uki.a) this.P.getValue();
    }
}

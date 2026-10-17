package com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow;

import a0.d;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow.CoBorrowerConsentInitiatorFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow.CoBorrowerConsentInitiatorFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import dw3.c1;
import dw3.h0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import yki.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/co_borrower/consent/initiator/flow/CoBorrowerConsentInitiatorFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "Lyki/f;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CoBorrowerConsentInitiatorFlow extends PluginFlowControllerV2 {
    public final CoBorrowerConsentInitiatorFlowContract$InputData L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CoBorrowerConsentInitiatorFlow(CoBorrowerConsentInitiatorFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: l64.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoBorrowerConsentInitiatorFlow f192353b;

            {
                this.f192353b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CoBorrowerConsentInitiatorFlow coBorrowerConsentInitiatorFlow = this.f192353b;
                        phm.a aVar = (phm.a) e.j(coBorrowerConsentInitiatorFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CoBorrowerConsentInitiatorFlowContract$InputData coBorrowerConsentInitiatorFlowContract$InputData = coBorrowerConsentInitiatorFlow.L;
                        coBorrowerConsentInitiatorFlowContract$InputData.getClass();
                        return new h0(c1Var, new iq3.a(), coBorrowerConsentInitiatorFlow, coBorrowerConsentInitiatorFlowContract$InputData);
                    case 1:
                        return (b) ((h0) this.f192353b.M.getValue()).u.get();
                    default:
                        CoBorrowerConsentInitiatorFlow coBorrowerConsentInitiatorFlow2 = this.f192353b;
                        return czi.c.d(0, 6, null, coBorrowerConsentInitiatorFlow2, (b) coBorrowerConsentInitiatorFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: l64.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoBorrowerConsentInitiatorFlow f192353b;

            {
                this.f192353b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CoBorrowerConsentInitiatorFlow coBorrowerConsentInitiatorFlow = this.f192353b;
                        phm.a aVar = (phm.a) e.j(coBorrowerConsentInitiatorFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CoBorrowerConsentInitiatorFlowContract$InputData coBorrowerConsentInitiatorFlowContract$InputData = coBorrowerConsentInitiatorFlow.L;
                        coBorrowerConsentInitiatorFlowContract$InputData.getClass();
                        return new h0(c1Var, new iq3.a(), coBorrowerConsentInitiatorFlow, coBorrowerConsentInitiatorFlowContract$InputData);
                    case 1:
                        return (b) ((h0) this.f192353b.M.getValue()).u.get();
                    default:
                        CoBorrowerConsentInitiatorFlow coBorrowerConsentInitiatorFlow2 = this.f192353b;
                        return czi.c.d(0, 6, null, coBorrowerConsentInitiatorFlow2, (b) coBorrowerConsentInitiatorFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: l64.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoBorrowerConsentInitiatorFlow f192353b;

            {
                this.f192353b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CoBorrowerConsentInitiatorFlow coBorrowerConsentInitiatorFlow = this.f192353b;
                        phm.a aVar = (phm.a) e.j(coBorrowerConsentInitiatorFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CoBorrowerConsentInitiatorFlowContract$InputData coBorrowerConsentInitiatorFlowContract$InputData = coBorrowerConsentInitiatorFlow.L;
                        coBorrowerConsentInitiatorFlowContract$InputData.getClass();
                        return new h0(c1Var, new iq3.a(), coBorrowerConsentInitiatorFlow, coBorrowerConsentInitiatorFlowContract$InputData);
                    case 1:
                        return (b) ((h0) this.f192353b.M.getValue()).u.get();
                    default:
                        CoBorrowerConsentInitiatorFlow coBorrowerConsentInitiatorFlow2 = this.f192353b;
                        return czi.c.d(0, 6, null, coBorrowerConsentInitiatorFlow2, (b) coBorrowerConsentInitiatorFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (h0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (h0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (l64.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}

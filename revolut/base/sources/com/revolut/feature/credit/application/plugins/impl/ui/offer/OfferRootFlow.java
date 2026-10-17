package com.revolut.feature.credit.application.plugins.impl.ui.offer;

import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferRootFlow;
import com.revolut.kompot.R$id;
import dw3.c1;
import dw3.n4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer/OfferRootFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "Luki/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OfferRootFlow extends PluginFlowControllerV2 implements uki.c {
    public final OfferFlowContract$InputData L;
    public final Object M;
    public final Object N;
    public final Object O;

    public OfferRootFlow(OfferFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: cf4.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfferRootFlow f23550b;

            {
                this.f23550b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        OfferRootFlow offerRootFlow = this.f23550b;
                        phm.a aVar = (phm.a) ue0.e.j(offerRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        OfferFlowContract$InputData offerFlowContract$InputData = offerRootFlow.L;
                        offerFlowContract$InputData.getClass();
                        return new n4(c1Var, new iq3.a(), offerRootFlow, offerFlowContract$InputData);
                    case 1:
                        return (a) ((n4) this.f23550b.M.getValue()).f119351w.get();
                    default:
                        OfferRootFlow offerRootFlow2 = this.f23550b;
                        return czi.c.a(R$id.container, (a) offerRootFlow2.N.getValue(), offerRootFlow2);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: cf4.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfferRootFlow f23550b;

            {
                this.f23550b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        OfferRootFlow offerRootFlow = this.f23550b;
                        phm.a aVar = (phm.a) ue0.e.j(offerRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        OfferFlowContract$InputData offerFlowContract$InputData = offerRootFlow.L;
                        offerFlowContract$InputData.getClass();
                        return new n4(c1Var, new iq3.a(), offerRootFlow, offerFlowContract$InputData);
                    case 1:
                        return (a) ((n4) this.f23550b.M.getValue()).f119351w.get();
                    default:
                        OfferRootFlow offerRootFlow2 = this.f23550b;
                        return czi.c.a(R$id.container, (a) offerRootFlow2.N.getValue(), offerRootFlow2);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: cf4.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfferRootFlow f23550b;

            {
                this.f23550b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        OfferRootFlow offerRootFlow = this.f23550b;
                        phm.a aVar = (phm.a) ue0.e.j(offerRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        OfferFlowContract$InputData offerFlowContract$InputData = offerRootFlow.L;
                        offerFlowContract$InputData.getClass();
                        return new n4(c1Var, new iq3.a(), offerRootFlow, offerFlowContract$InputData);
                    case 1:
                        return (a) ((n4) this.f23550b.M.getValue()).f119351w.get();
                    default:
                        OfferRootFlow offerRootFlow2 = this.f23550b;
                        return czi.c.a(R$id.container, (a) offerRootFlow2.N.getValue(), offerRootFlow2);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (n4) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (n4) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (cf4.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final pki.a k() {
        return (uki.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final yki.c k() {
        return (uki.a) this.O.getValue();
    }
}

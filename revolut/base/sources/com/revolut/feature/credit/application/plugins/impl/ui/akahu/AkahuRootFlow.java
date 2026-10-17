package com.revolut.feature.credit.application.plugins.impl.ui.akahu;

import com.revolut.feature.credit.application.plugins.impl.ui.akahu.AkahuFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.akahu.AkahuRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import dw3.c1;
import dw3.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/akahu/AkahuRootFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AkahuRootFlow extends PluginFlowControllerV2 {
    public final AkahuFlowContract$InputData L;
    public final Object M;
    public final Object N;
    public final Object O;

    public AkahuRootFlow(AkahuFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: b54.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AkahuRootFlow f12433b;

            {
                this.f12433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AkahuRootFlow akahuRootFlow = this.f12433b;
                        phm.a aVar = (phm.a) ue0.e.j(akahuRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        AkahuFlowContract$InputData akahuFlowContract$InputData = akahuRootFlow.L;
                        akahuFlowContract$InputData.getClass();
                        return new v(c1Var, new iq3.a(), akahuRootFlow, akahuFlowContract$InputData);
                    case 1:
                        return (a) ((v) this.f12433b.M.getValue()).u.get();
                    default:
                        AkahuRootFlow akahuRootFlow2 = this.f12433b;
                        return czi.c.d(0, 6, null, akahuRootFlow2, (a) akahuRootFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: b54.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AkahuRootFlow f12433b;

            {
                this.f12433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AkahuRootFlow akahuRootFlow = this.f12433b;
                        phm.a aVar = (phm.a) ue0.e.j(akahuRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        AkahuFlowContract$InputData akahuFlowContract$InputData = akahuRootFlow.L;
                        akahuFlowContract$InputData.getClass();
                        return new v(c1Var, new iq3.a(), akahuRootFlow, akahuFlowContract$InputData);
                    case 1:
                        return (a) ((v) this.f12433b.M.getValue()).u.get();
                    default:
                        AkahuRootFlow akahuRootFlow2 = this.f12433b;
                        return czi.c.d(0, 6, null, akahuRootFlow2, (a) akahuRootFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: b54.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AkahuRootFlow f12433b;

            {
                this.f12433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AkahuRootFlow akahuRootFlow = this.f12433b;
                        phm.a aVar = (phm.a) ue0.e.j(akahuRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        AkahuFlowContract$InputData akahuFlowContract$InputData = akahuRootFlow.L;
                        akahuFlowContract$InputData.getClass();
                        return new v(c1Var, new iq3.a(), akahuRootFlow, akahuFlowContract$InputData);
                    case 1:
                        return (a) ((v) this.f12433b.M.getValue()).u.get();
                    default:
                        AkahuRootFlow akahuRootFlow2 = this.f12433b;
                        return czi.c.d(0, 6, null, akahuRootFlow2, (a) akahuRootFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (v) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (b54.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}

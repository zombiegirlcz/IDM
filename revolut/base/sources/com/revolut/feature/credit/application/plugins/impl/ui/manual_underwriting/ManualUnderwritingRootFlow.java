package com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting;

import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingRootFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dw3.b4;
import dw3.c1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import uki.c;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingRootFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "Luki/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManualUnderwritingRootFlow extends PluginFlowControllerV2 implements c {
    public final ManualUnderwritingContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public ManualUnderwritingRootFlow(ManualUnderwritingContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: nd4.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManualUnderwritingRootFlow f214328b;

            {
                this.f214328b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ManualUnderwritingRootFlow manualUnderwritingRootFlow = this.f214328b;
                        phm.a aVar = (phm.a) ue0.e.j(manualUnderwritingRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        ManualUnderwritingContract$InputData manualUnderwritingContract$InputData = manualUnderwritingRootFlow.L;
                        manualUnderwritingContract$InputData.getClass();
                        return new b4(c1Var, new iq3.a(), manualUnderwritingRootFlow, manualUnderwritingContract$InputData);
                    case 1:
                        return (a) ((b4) this.f214328b.N.getValue()).f118358x.get();
                    default:
                        ManualUnderwritingRootFlow manualUnderwritingRootFlow2 = this.f214328b;
                        return czi.c.a(R$id.screen_transparent_container, (a) manualUnderwritingRootFlow2.O.getValue(), manualUnderwritingRootFlow2);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: nd4.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManualUnderwritingRootFlow f214328b;

            {
                this.f214328b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ManualUnderwritingRootFlow manualUnderwritingRootFlow = this.f214328b;
                        phm.a aVar = (phm.a) ue0.e.j(manualUnderwritingRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        ManualUnderwritingContract$InputData manualUnderwritingContract$InputData = manualUnderwritingRootFlow.L;
                        manualUnderwritingContract$InputData.getClass();
                        return new b4(c1Var, new iq3.a(), manualUnderwritingRootFlow, manualUnderwritingContract$InputData);
                    case 1:
                        return (a) ((b4) this.f214328b.N.getValue()).f118358x.get();
                    default:
                        ManualUnderwritingRootFlow manualUnderwritingRootFlow2 = this.f214328b;
                        return czi.c.a(R$id.screen_transparent_container, (a) manualUnderwritingRootFlow2.O.getValue(), manualUnderwritingRootFlow2);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: nd4.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManualUnderwritingRootFlow f214328b;

            {
                this.f214328b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ManualUnderwritingRootFlow manualUnderwritingRootFlow = this.f214328b;
                        phm.a aVar = (phm.a) ue0.e.j(manualUnderwritingRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        ManualUnderwritingContract$InputData manualUnderwritingContract$InputData = manualUnderwritingRootFlow.L;
                        manualUnderwritingContract$InputData.getClass();
                        return new b4(c1Var, new iq3.a(), manualUnderwritingRootFlow, manualUnderwritingContract$InputData);
                    case 1:
                        return (a) ((b4) this.f214328b.N.getValue()).f118358x.get();
                    default:
                        ManualUnderwritingRootFlow manualUnderwritingRootFlow2 = this.f214328b;
                        return czi.c.a(R$id.screen_transparent_container, (a) manualUnderwritingRootFlow2.O.getValue(), manualUnderwritingRootFlow2);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b4) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (b4) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (nd4.a) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF103912o0() {
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

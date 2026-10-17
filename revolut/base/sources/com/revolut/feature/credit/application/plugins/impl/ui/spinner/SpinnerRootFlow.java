package com.revolut.feature.credit.application.plugins.impl.ui.spinner;

import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerRootFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dw3.c1;
import dw3.s6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerRootFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "Lyki/f;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SpinnerRootFlow extends PluginFlowControllerV2 {
    public final SpinnerFlowContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public SpinnerRootFlow(SpinnerFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ii4.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpinnerRootFlow f161527b;

            {
                this.f161527b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SpinnerRootFlow spinnerRootFlow = this.f161527b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, spinnerRootFlow, (a) spinnerRootFlow.P.getValue());
                    case 1:
                        SpinnerRootFlow spinnerRootFlow2 = this.f161527b;
                        phm.a aVar = (phm.a) ue0.e.j(spinnerRootFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        SpinnerFlowContract$InputData spinnerFlowContract$InputData = spinnerRootFlow2.L;
                        spinnerFlowContract$InputData.getClass();
                        return new s6(c1Var, new iq3.a(), spinnerRootFlow2, spinnerFlowContract$InputData);
                    default:
                        return (a) ((s6) this.f161527b.O.getValue()).u.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ii4.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpinnerRootFlow f161527b;

            {
                this.f161527b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SpinnerRootFlow spinnerRootFlow = this.f161527b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, spinnerRootFlow, (a) spinnerRootFlow.P.getValue());
                    case 1:
                        SpinnerRootFlow spinnerRootFlow2 = this.f161527b;
                        phm.a aVar = (phm.a) ue0.e.j(spinnerRootFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        SpinnerFlowContract$InputData spinnerFlowContract$InputData = spinnerRootFlow2.L;
                        spinnerFlowContract$InputData.getClass();
                        return new s6(c1Var, new iq3.a(), spinnerRootFlow2, spinnerFlowContract$InputData);
                    default:
                        return (a) ((s6) this.f161527b.O.getValue()).u.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ii4.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpinnerRootFlow f161527b;

            {
                this.f161527b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        SpinnerRootFlow spinnerRootFlow = this.f161527b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, spinnerRootFlow, (a) spinnerRootFlow.P.getValue());
                    case 1:
                        SpinnerRootFlow spinnerRootFlow2 = this.f161527b;
                        phm.a aVar = (phm.a) ue0.e.j(spinnerRootFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        SpinnerFlowContract$InputData spinnerFlowContract$InputData = spinnerRootFlow2.L;
                        spinnerFlowContract$InputData.getClass();
                        return new s6(c1Var, new iq3.a(), spinnerRootFlow2, spinnerFlowContract$InputData);
                    default:
                        return (a) ((s6) this.f161527b.O.getValue()).u.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (s6) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (s6) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ii4.a) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}

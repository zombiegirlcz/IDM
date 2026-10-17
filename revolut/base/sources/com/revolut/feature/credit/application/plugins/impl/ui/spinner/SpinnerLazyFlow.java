package com.revolut.feature.credit.application.plugins.impl.ui.spinner;

import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerLazyFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerLazyFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dw3.c1;
import dw3.t6;
import ii4.b0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerLazyFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SpinnerLazyFlow extends PluginFlowControllerV2 {
    public final SpinnerLazyFlowContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public SpinnerLazyFlow(SpinnerLazyFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ii4.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpinnerLazyFlow f161510b;

            {
                this.f161510b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SpinnerLazyFlow spinnerLazyFlow = this.f161510b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, spinnerLazyFlow, (b0) spinnerLazyFlow.P.getValue());
                    case 1:
                        SpinnerLazyFlow spinnerLazyFlow2 = this.f161510b;
                        phm.a aVar = (phm.a) ue0.e.j(spinnerLazyFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        SpinnerLazyFlowContract$InputData spinnerLazyFlowContract$InputData = spinnerLazyFlow2.L;
                        spinnerLazyFlowContract$InputData.getClass();
                        return new t6(c1Var, new iq3.a(), spinnerLazyFlow2, spinnerLazyFlowContract$InputData);
                    default:
                        return (b0) ((t6) this.f161510b.O.getValue()).u.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ii4.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpinnerLazyFlow f161510b;

            {
                this.f161510b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SpinnerLazyFlow spinnerLazyFlow = this.f161510b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, spinnerLazyFlow, (b0) spinnerLazyFlow.P.getValue());
                    case 1:
                        SpinnerLazyFlow spinnerLazyFlow2 = this.f161510b;
                        phm.a aVar = (phm.a) ue0.e.j(spinnerLazyFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        SpinnerLazyFlowContract$InputData spinnerLazyFlowContract$InputData = spinnerLazyFlow2.L;
                        spinnerLazyFlowContract$InputData.getClass();
                        return new t6(c1Var, new iq3.a(), spinnerLazyFlow2, spinnerLazyFlowContract$InputData);
                    default:
                        return (b0) ((t6) this.f161510b.O.getValue()).u.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ii4.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpinnerLazyFlow f161510b;

            {
                this.f161510b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        SpinnerLazyFlow spinnerLazyFlow = this.f161510b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, spinnerLazyFlow, (b0) spinnerLazyFlow.P.getValue());
                    case 1:
                        SpinnerLazyFlow spinnerLazyFlow2 = this.f161510b;
                        phm.a aVar = (phm.a) ue0.e.j(spinnerLazyFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        SpinnerLazyFlowContract$InputData spinnerLazyFlowContract$InputData = spinnerLazyFlow2.L;
                        spinnerLazyFlowContract$InputData.getClass();
                        return new t6(c1Var, new iq3.a(), spinnerLazyFlow2, spinnerLazyFlowContract$InputData);
                    default:
                        return (b0) ((t6) this.f161510b.O.getValue()).u.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t6) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (t6) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (b0) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}

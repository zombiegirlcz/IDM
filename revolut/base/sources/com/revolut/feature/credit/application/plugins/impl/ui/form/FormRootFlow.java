package com.revolut.feature.credit.application.plugins.impl.ui.form;

import cc4.b;
import cc4.c;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.form.FormFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.form.FormRootFlow;
import dw3.c1;
import dw3.k3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/form/FormRootFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FormRootFlow extends PluginFlowControllerV2 {
    public final FormFlowContract$InputData L;
    public final Object M;
    public final Object N;
    public final Object O;

    public FormRootFlow(FormFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: cc4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormRootFlow f22940b;

            {
                this.f22940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        FormRootFlow formRootFlow = this.f22940b;
                        phm.a aVar = (phm.a) e.j(formRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        FormFlowContract$InputData formFlowContract$InputData = formRootFlow.L;
                        formFlowContract$InputData.getClass();
                        return new k3(c1Var, new iq3.a(), formRootFlow, formFlowContract$InputData);
                    case 1:
                        return (a) ((k3) this.f22940b.M.getValue()).u.get();
                    default:
                        FormRootFlow formRootFlow2 = this.f22940b;
                        return czi.c.d(0, 6, null, formRootFlow2, (a) formRootFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: cc4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormRootFlow f22940b;

            {
                this.f22940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        FormRootFlow formRootFlow = this.f22940b;
                        phm.a aVar = (phm.a) e.j(formRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        FormFlowContract$InputData formFlowContract$InputData = formRootFlow.L;
                        formFlowContract$InputData.getClass();
                        return new k3(c1Var, new iq3.a(), formRootFlow, formFlowContract$InputData);
                    case 1:
                        return (a) ((k3) this.f22940b.M.getValue()).u.get();
                    default:
                        FormRootFlow formRootFlow2 = this.f22940b;
                        return czi.c.d(0, 6, null, formRootFlow2, (a) formRootFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: cc4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormRootFlow f22940b;

            {
                this.f22940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        FormRootFlow formRootFlow = this.f22940b;
                        phm.a aVar = (phm.a) e.j(formRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        FormFlowContract$InputData formFlowContract$InputData = formRootFlow.L;
                        formFlowContract$InputData.getClass();
                        return new k3(c1Var, new iq3.a(), formRootFlow, formFlowContract$InputData);
                    case 1:
                        return (a) ((k3) this.f22940b.M.getValue()).u.get();
                    default:
                        FormRootFlow formRootFlow2 = this.f22940b;
                        return czi.c.d(0, 6, null, formRootFlow2, (a) formRootFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final boolean J2() {
        c cVar = (c) ((cc4.a) this.N.getValue());
        cVar.getClass();
        cVar.l2(new b(cVar, null, 1), new yi5.b(26));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k3) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (k3) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (cc4.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}

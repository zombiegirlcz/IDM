package com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling;

import a0.d;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.ConveyancingAppointmentSchedulingFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.ConveyancingAppointmentSchedulingFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import czi.c;
import dw3.c1;
import dw3.r0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/conveyancing_appointment/scheduling/ConveyancingAppointmentSchedulingFlowController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConveyancingAppointmentSchedulingFlowController extends PluginFlowControllerV2 {
    public final ConveyancingAppointmentSchedulingFlowContract$InputData L;
    public final Object M;
    public final Object N;
    public final Object O;

    public ConveyancingAppointmentSchedulingFlowController(ConveyancingAppointmentSchedulingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: l74.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConveyancingAppointmentSchedulingFlowController f192535b;

            {
                this.f192535b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ConveyancingAppointmentSchedulingFlowController conveyancingAppointmentSchedulingFlowController = this.f192535b;
                        phm.a aVar = (phm.a) e.j(conveyancingAppointmentSchedulingFlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        ConveyancingAppointmentSchedulingFlowContract$InputData conveyancingAppointmentSchedulingFlowContract$InputData = conveyancingAppointmentSchedulingFlowController.L;
                        conveyancingAppointmentSchedulingFlowContract$InputData.getClass();
                        return new r0(c1Var, new iq3.a(), conveyancingAppointmentSchedulingFlowController, conveyancingAppointmentSchedulingFlowContract$InputData);
                    case 1:
                        return (a) ((r0) this.f192535b.M.getValue()).u.get();
                    default:
                        ConveyancingAppointmentSchedulingFlowController conveyancingAppointmentSchedulingFlowController2 = this.f192535b;
                        return c.d(0, 6, null, conveyancingAppointmentSchedulingFlowController2, (a) conveyancingAppointmentSchedulingFlowController2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: l74.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConveyancingAppointmentSchedulingFlowController f192535b;

            {
                this.f192535b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ConveyancingAppointmentSchedulingFlowController conveyancingAppointmentSchedulingFlowController = this.f192535b;
                        phm.a aVar = (phm.a) e.j(conveyancingAppointmentSchedulingFlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        ConveyancingAppointmentSchedulingFlowContract$InputData conveyancingAppointmentSchedulingFlowContract$InputData = conveyancingAppointmentSchedulingFlowController.L;
                        conveyancingAppointmentSchedulingFlowContract$InputData.getClass();
                        return new r0(c1Var, new iq3.a(), conveyancingAppointmentSchedulingFlowController, conveyancingAppointmentSchedulingFlowContract$InputData);
                    case 1:
                        return (a) ((r0) this.f192535b.M.getValue()).u.get();
                    default:
                        ConveyancingAppointmentSchedulingFlowController conveyancingAppointmentSchedulingFlowController2 = this.f192535b;
                        return c.d(0, 6, null, conveyancingAppointmentSchedulingFlowController2, (a) conveyancingAppointmentSchedulingFlowController2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: l74.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConveyancingAppointmentSchedulingFlowController f192535b;

            {
                this.f192535b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ConveyancingAppointmentSchedulingFlowController conveyancingAppointmentSchedulingFlowController = this.f192535b;
                        phm.a aVar = (phm.a) e.j(conveyancingAppointmentSchedulingFlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        ConveyancingAppointmentSchedulingFlowContract$InputData conveyancingAppointmentSchedulingFlowContract$InputData = conveyancingAppointmentSchedulingFlowController.L;
                        conveyancingAppointmentSchedulingFlowContract$InputData.getClass();
                        return new r0(c1Var, new iq3.a(), conveyancingAppointmentSchedulingFlowController, conveyancingAppointmentSchedulingFlowContract$InputData);
                    case 1:
                        return (a) ((r0) this.f192535b.M.getValue()).u.get();
                    default:
                        ConveyancingAppointmentSchedulingFlowController conveyancingAppointmentSchedulingFlowController2 = this.f192535b;
                        return c.d(0, 6, null, conveyancingAppointmentSchedulingFlowController2, (a) conveyancingAppointmentSchedulingFlowController2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (r0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (l74.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}

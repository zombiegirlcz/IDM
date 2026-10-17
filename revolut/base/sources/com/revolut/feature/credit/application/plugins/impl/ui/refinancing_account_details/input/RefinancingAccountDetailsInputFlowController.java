package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input;

import aii.q;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginSubFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputFlowController;
import dw3.c1;
import dw3.m5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_account_details/input/RefinancingAccountDetailsInputFlowController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginSubFlowController;", "Laii/q;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RefinancingAccountDetailsInputFlowController extends PluginSubFlowController<q> {
    public final RefinancingAccountDetailsInputFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public RefinancingAccountDetailsInputFlowController(RefinancingAccountDetailsInputFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: fh4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RefinancingAccountDetailsInputFlowController f135128b;

            {
                this.f135128b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        RefinancingAccountDetailsInputFlowController refinancingAccountDetailsInputFlowController = this.f135128b;
                        phm.a aVar = (phm.a) ue0.e.j(refinancingAccountDetailsInputFlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        RefinancingAccountDetailsInputFlowContract$InputData refinancingAccountDetailsInputFlowContract$InputData = refinancingAccountDetailsInputFlowController.K;
                        refinancingAccountDetailsInputFlowContract$InputData.getClass();
                        return new m5(c1Var, new iq3.a(), refinancingAccountDetailsInputFlowController, refinancingAccountDetailsInputFlowContract$InputData);
                    case 1:
                        return (a) ((m5) this.f135128b.L.getValue()).u.get();
                    default:
                        RefinancingAccountDetailsInputFlowController refinancingAccountDetailsInputFlowController2 = this.f135128b;
                        return czi.c.d(0, 6, null, refinancingAccountDetailsInputFlowController2, (a) refinancingAccountDetailsInputFlowController2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: fh4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RefinancingAccountDetailsInputFlowController f135128b;

            {
                this.f135128b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        RefinancingAccountDetailsInputFlowController refinancingAccountDetailsInputFlowController = this.f135128b;
                        phm.a aVar = (phm.a) ue0.e.j(refinancingAccountDetailsInputFlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        RefinancingAccountDetailsInputFlowContract$InputData refinancingAccountDetailsInputFlowContract$InputData = refinancingAccountDetailsInputFlowController.K;
                        refinancingAccountDetailsInputFlowContract$InputData.getClass();
                        return new m5(c1Var, new iq3.a(), refinancingAccountDetailsInputFlowController, refinancingAccountDetailsInputFlowContract$InputData);
                    case 1:
                        return (a) ((m5) this.f135128b.L.getValue()).u.get();
                    default:
                        RefinancingAccountDetailsInputFlowController refinancingAccountDetailsInputFlowController2 = this.f135128b;
                        return czi.c.d(0, 6, null, refinancingAccountDetailsInputFlowController2, (a) refinancingAccountDetailsInputFlowController2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: fh4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RefinancingAccountDetailsInputFlowController f135128b;

            {
                this.f135128b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        RefinancingAccountDetailsInputFlowController refinancingAccountDetailsInputFlowController = this.f135128b;
                        phm.a aVar = (phm.a) ue0.e.j(refinancingAccountDetailsInputFlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        RefinancingAccountDetailsInputFlowContract$InputData refinancingAccountDetailsInputFlowContract$InputData = refinancingAccountDetailsInputFlowController.K;
                        refinancingAccountDetailsInputFlowContract$InputData.getClass();
                        return new m5(c1Var, new iq3.a(), refinancingAccountDetailsInputFlowController, refinancingAccountDetailsInputFlowContract$InputData);
                    case 1:
                        return (a) ((m5) this.f135128b.L.getValue()).u.get();
                    default:
                        RefinancingAccountDetailsInputFlowController refinancingAccountDetailsInputFlowController2 = this.f135128b;
                        return czi.c.d(0, 6, null, refinancingAccountDetailsInputFlowController2, (a) refinancingAccountDetailsInputFlowController2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m5) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (m5) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (fh4.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginSubFlowController, oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}

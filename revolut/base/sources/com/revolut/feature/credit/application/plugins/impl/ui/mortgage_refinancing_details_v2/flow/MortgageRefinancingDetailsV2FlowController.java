package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow;

import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.MortgageRefinancingDetailsV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.MortgageRefinancingDetailsV2FlowController;
import com.revolut.kompot.R$id;
import dw3.c1;
import dw3.g4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/flow/MortgageRefinancingDetailsV2FlowController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "Luki/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MortgageRefinancingDetailsV2FlowController extends PluginFlowControllerV2 implements uki.c {
    public final MortgageRefinancingDetailsV2FlowContract$InputData L;
    public final Object M;
    public final Object N;
    public final Object O;

    public MortgageRefinancingDetailsV2FlowController(MortgageRefinancingDetailsV2FlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: je4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MortgageRefinancingDetailsV2FlowController f173208b;

            {
                this.f173208b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MortgageRefinancingDetailsV2FlowController mortgageRefinancingDetailsV2FlowController = this.f173208b;
                        phm.a aVar = (phm.a) e.j(mortgageRefinancingDetailsV2FlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        MortgageRefinancingDetailsV2FlowContract$InputData mortgageRefinancingDetailsV2FlowContract$InputData = mortgageRefinancingDetailsV2FlowController.L;
                        mortgageRefinancingDetailsV2FlowContract$InputData.getClass();
                        return new g4(c1Var, new iq3.a(), mortgageRefinancingDetailsV2FlowController, mortgageRefinancingDetailsV2FlowContract$InputData);
                    case 1:
                        return (a) ((g4) this.f173208b.M.getValue()).u.get();
                    default:
                        MortgageRefinancingDetailsV2FlowController mortgageRefinancingDetailsV2FlowController2 = this.f173208b;
                        return czi.c.a(R$id.container, (a) mortgageRefinancingDetailsV2FlowController2.N.getValue(), mortgageRefinancingDetailsV2FlowController2);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: je4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MortgageRefinancingDetailsV2FlowController f173208b;

            {
                this.f173208b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        MortgageRefinancingDetailsV2FlowController mortgageRefinancingDetailsV2FlowController = this.f173208b;
                        phm.a aVar = (phm.a) e.j(mortgageRefinancingDetailsV2FlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        MortgageRefinancingDetailsV2FlowContract$InputData mortgageRefinancingDetailsV2FlowContract$InputData = mortgageRefinancingDetailsV2FlowController.L;
                        mortgageRefinancingDetailsV2FlowContract$InputData.getClass();
                        return new g4(c1Var, new iq3.a(), mortgageRefinancingDetailsV2FlowController, mortgageRefinancingDetailsV2FlowContract$InputData);
                    case 1:
                        return (a) ((g4) this.f173208b.M.getValue()).u.get();
                    default:
                        MortgageRefinancingDetailsV2FlowController mortgageRefinancingDetailsV2FlowController2 = this.f173208b;
                        return czi.c.a(R$id.container, (a) mortgageRefinancingDetailsV2FlowController2.N.getValue(), mortgageRefinancingDetailsV2FlowController2);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: je4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MortgageRefinancingDetailsV2FlowController f173208b;

            {
                this.f173208b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        MortgageRefinancingDetailsV2FlowController mortgageRefinancingDetailsV2FlowController = this.f173208b;
                        phm.a aVar = (phm.a) e.j(mortgageRefinancingDetailsV2FlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        MortgageRefinancingDetailsV2FlowContract$InputData mortgageRefinancingDetailsV2FlowContract$InputData = mortgageRefinancingDetailsV2FlowController.L;
                        mortgageRefinancingDetailsV2FlowContract$InputData.getClass();
                        return new g4(c1Var, new iq3.a(), mortgageRefinancingDetailsV2FlowController, mortgageRefinancingDetailsV2FlowContract$InputData);
                    case 1:
                        return (a) ((g4) this.f173208b.M.getValue()).u.get();
                    default:
                        MortgageRefinancingDetailsV2FlowController mortgageRefinancingDetailsV2FlowController2 = this.f173208b;
                        return czi.c.a(R$id.container, (a) mortgageRefinancingDetailsV2FlowController2.N.getValue(), mortgageRefinancingDetailsV2FlowController2);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g4) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (g4) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (je4.a) this.N.getValue();
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

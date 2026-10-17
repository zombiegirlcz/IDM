package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow;

import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.MortgageSignatureFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.MortgageSignatureFlowContract$InputData;
import dw3.c1;
import dw3.h4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/flow/MortgageSignatureFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MortgageSignatureFlow extends PluginFlowControllerV2 {
    public final MortgageSignatureFlowContract$InputData L;
    public final Object M;
    public final Object N;
    public final Object O;

    public MortgageSignatureFlow(MortgageSignatureFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: re4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MortgageSignatureFlow f253515b;

            {
                this.f253515b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MortgageSignatureFlow mortgageSignatureFlow = this.f253515b;
                        phm.a aVar = (phm.a) ue0.e.j(mortgageSignatureFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        MortgageSignatureFlowContract$InputData mortgageSignatureFlowContract$InputData = mortgageSignatureFlow.L;
                        mortgageSignatureFlowContract$InputData.getClass();
                        return new h4(c1Var, new iq3.a(), mortgageSignatureFlow, mortgageSignatureFlowContract$InputData);
                    case 1:
                        return (b) ((h4) this.f253515b.M.getValue()).v.get();
                    default:
                        MortgageSignatureFlow mortgageSignatureFlow2 = this.f253515b;
                        return czi.c.d(0, 6, null, mortgageSignatureFlow2, (b) mortgageSignatureFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: re4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MortgageSignatureFlow f253515b;

            {
                this.f253515b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        MortgageSignatureFlow mortgageSignatureFlow = this.f253515b;
                        phm.a aVar = (phm.a) ue0.e.j(mortgageSignatureFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        MortgageSignatureFlowContract$InputData mortgageSignatureFlowContract$InputData = mortgageSignatureFlow.L;
                        mortgageSignatureFlowContract$InputData.getClass();
                        return new h4(c1Var, new iq3.a(), mortgageSignatureFlow, mortgageSignatureFlowContract$InputData);
                    case 1:
                        return (b) ((h4) this.f253515b.M.getValue()).v.get();
                    default:
                        MortgageSignatureFlow mortgageSignatureFlow2 = this.f253515b;
                        return czi.c.d(0, 6, null, mortgageSignatureFlow2, (b) mortgageSignatureFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: re4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MortgageSignatureFlow f253515b;

            {
                this.f253515b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        MortgageSignatureFlow mortgageSignatureFlow = this.f253515b;
                        phm.a aVar = (phm.a) ue0.e.j(mortgageSignatureFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        MortgageSignatureFlowContract$InputData mortgageSignatureFlowContract$InputData = mortgageSignatureFlow.L;
                        mortgageSignatureFlowContract$InputData.getClass();
                        return new h4(c1Var, new iq3.a(), mortgageSignatureFlow, mortgageSignatureFlowContract$InputData);
                    case 1:
                        return (b) ((h4) this.f253515b.M.getValue()).v.get();
                    default:
                        MortgageSignatureFlow mortgageSignatureFlow2 = this.f253515b;
                        return czi.c.d(0, 6, null, mortgageSignatureFlow2, (b) mortgageSignatureFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h4) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (h4) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (re4.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}

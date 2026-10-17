package com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2;

import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.CreditLinkedAccountsV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.CreditLinkedAccountsV2RootFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dw3.c1;
import dw3.l1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2RootFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditLinkedAccountsV2RootFlow extends PluginFlowControllerV2 {
    public final CreditLinkedAccountsV2FlowContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public CreditLinkedAccountsV2RootFlow(CreditLinkedAccountsV2FlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ad4.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditLinkedAccountsV2RootFlow f3271b;

            {
                this.f3271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreditLinkedAccountsV2RootFlow creditLinkedAccountsV2RootFlow = this.f3271b;
                        phm.a aVar = (phm.a) ue0.e.j(creditLinkedAccountsV2RootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        CreditLinkedAccountsV2FlowContract$InputData creditLinkedAccountsV2FlowContract$InputData = creditLinkedAccountsV2RootFlow.L;
                        creditLinkedAccountsV2FlowContract$InputData.getClass();
                        return new l1(c1Var, new iq3.a(), creditLinkedAccountsV2RootFlow, creditLinkedAccountsV2FlowContract$InputData);
                    case 1:
                        return (a) ((l1) this.f3271b.N.getValue()).v.get();
                    default:
                        CreditLinkedAccountsV2RootFlow creditLinkedAccountsV2RootFlow2 = this.f3271b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditLinkedAccountsV2RootFlow2, (a) creditLinkedAccountsV2RootFlow2.O.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ad4.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditLinkedAccountsV2RootFlow f3271b;

            {
                this.f3271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreditLinkedAccountsV2RootFlow creditLinkedAccountsV2RootFlow = this.f3271b;
                        phm.a aVar = (phm.a) ue0.e.j(creditLinkedAccountsV2RootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        CreditLinkedAccountsV2FlowContract$InputData creditLinkedAccountsV2FlowContract$InputData = creditLinkedAccountsV2RootFlow.L;
                        creditLinkedAccountsV2FlowContract$InputData.getClass();
                        return new l1(c1Var, new iq3.a(), creditLinkedAccountsV2RootFlow, creditLinkedAccountsV2FlowContract$InputData);
                    case 1:
                        return (a) ((l1) this.f3271b.N.getValue()).v.get();
                    default:
                        CreditLinkedAccountsV2RootFlow creditLinkedAccountsV2RootFlow2 = this.f3271b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditLinkedAccountsV2RootFlow2, (a) creditLinkedAccountsV2RootFlow2.O.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ad4.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditLinkedAccountsV2RootFlow f3271b;

            {
                this.f3271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CreditLinkedAccountsV2RootFlow creditLinkedAccountsV2RootFlow = this.f3271b;
                        phm.a aVar = (phm.a) ue0.e.j(creditLinkedAccountsV2RootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        CreditLinkedAccountsV2FlowContract$InputData creditLinkedAccountsV2FlowContract$InputData = creditLinkedAccountsV2RootFlow.L;
                        creditLinkedAccountsV2FlowContract$InputData.getClass();
                        return new l1(c1Var, new iq3.a(), creditLinkedAccountsV2RootFlow, creditLinkedAccountsV2FlowContract$InputData);
                    case 1:
                        return (a) ((l1) this.f3271b.N.getValue()).v.get();
                    default:
                        CreditLinkedAccountsV2RootFlow creditLinkedAccountsV2RootFlow2 = this.f3271b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditLinkedAccountsV2RootFlow2, (a) creditLinkedAccountsV2RootFlow2.O.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (l1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ad4.a) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final yki.c k() {
        return (yki.c) this.P.getValue();
    }
}

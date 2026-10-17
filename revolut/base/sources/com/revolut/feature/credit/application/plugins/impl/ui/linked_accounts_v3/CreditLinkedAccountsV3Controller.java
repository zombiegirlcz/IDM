package com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3;

import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.CreditLinkedAccountsV3Controller;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.CreditLinkedAccountsV3FlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dw3.c1;
import dw3.m1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3Controller;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditLinkedAccountsV3Controller extends PluginFlowControllerV2 {
    public final CreditLinkedAccountsV3FlowContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public CreditLinkedAccountsV3Controller(CreditLinkedAccountsV3FlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: fd4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditLinkedAccountsV3Controller f133915b;

            {
                this.f133915b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreditLinkedAccountsV3Controller creditLinkedAccountsV3Controller = this.f133915b;
                        phm.a aVar = (phm.a) ue0.e.j(creditLinkedAccountsV3Controller.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        CreditLinkedAccountsV3FlowContract$InputData creditLinkedAccountsV3FlowContract$InputData = creditLinkedAccountsV3Controller.L;
                        creditLinkedAccountsV3FlowContract$InputData.getClass();
                        return new m1(c1Var, new iq3.a(), creditLinkedAccountsV3Controller, creditLinkedAccountsV3FlowContract$InputData);
                    case 1:
                        return (e) ((m1) this.f133915b.N.getValue()).v.get();
                    default:
                        CreditLinkedAccountsV3Controller creditLinkedAccountsV3Controller2 = this.f133915b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditLinkedAccountsV3Controller2, (e) creditLinkedAccountsV3Controller2.O.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: fd4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditLinkedAccountsV3Controller f133915b;

            {
                this.f133915b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreditLinkedAccountsV3Controller creditLinkedAccountsV3Controller = this.f133915b;
                        phm.a aVar = (phm.a) ue0.e.j(creditLinkedAccountsV3Controller.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        CreditLinkedAccountsV3FlowContract$InputData creditLinkedAccountsV3FlowContract$InputData = creditLinkedAccountsV3Controller.L;
                        creditLinkedAccountsV3FlowContract$InputData.getClass();
                        return new m1(c1Var, new iq3.a(), creditLinkedAccountsV3Controller, creditLinkedAccountsV3FlowContract$InputData);
                    case 1:
                        return (e) ((m1) this.f133915b.N.getValue()).v.get();
                    default:
                        CreditLinkedAccountsV3Controller creditLinkedAccountsV3Controller2 = this.f133915b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditLinkedAccountsV3Controller2, (e) creditLinkedAccountsV3Controller2.O.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: fd4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditLinkedAccountsV3Controller f133915b;

            {
                this.f133915b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CreditLinkedAccountsV3Controller creditLinkedAccountsV3Controller = this.f133915b;
                        phm.a aVar = (phm.a) ue0.e.j(creditLinkedAccountsV3Controller.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        CreditLinkedAccountsV3FlowContract$InputData creditLinkedAccountsV3FlowContract$InputData = creditLinkedAccountsV3Controller.L;
                        creditLinkedAccountsV3FlowContract$InputData.getClass();
                        return new m1(c1Var, new iq3.a(), creditLinkedAccountsV3Controller, creditLinkedAccountsV3FlowContract$InputData);
                    case 1:
                        return (e) ((m1) this.f133915b.N.getValue()).v.get();
                    default:
                        CreditLinkedAccountsV3Controller creditLinkedAccountsV3Controller2 = this.f133915b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditLinkedAccountsV3Controller2, (e) creditLinkedAccountsV3Controller2.O.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (m1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (fd4.e) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final yki.c k() {
        return (yki.c) this.P.getValue();
    }
}

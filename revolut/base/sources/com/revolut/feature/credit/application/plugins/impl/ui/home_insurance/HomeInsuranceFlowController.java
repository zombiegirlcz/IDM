package com.revolut.feature.credit.application.plugins.impl.ui.home_insurance;

import android.content.Intent;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.HomeInsuranceFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.HomeInsuranceFlowController;
import dw3.c1;
import dw3.l3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HomeInsuranceFlowController extends PluginFlowControllerV2 {
    public final HomeInsuranceFlowContract$InputData L;
    public final Object M;
    public final Object N;
    public final Object O;

    public HomeInsuranceFlowController(HomeInsuranceFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: dc4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeInsuranceFlowController f112787b;

            {
                this.f112787b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        HomeInsuranceFlowController homeInsuranceFlowController = this.f112787b;
                        phm.a aVar = (phm.a) ue0.e.j(homeInsuranceFlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        HomeInsuranceFlowContract$InputData homeInsuranceFlowContract$InputData = homeInsuranceFlowController.L;
                        homeInsuranceFlowContract$InputData.getClass();
                        return new l3(c1Var, new iq3.a(), homeInsuranceFlowController, homeInsuranceFlowContract$InputData);
                    case 1:
                        return (d) ((l3) this.f112787b.M.getValue()).u.get();
                    default:
                        HomeInsuranceFlowController homeInsuranceFlowController2 = this.f112787b;
                        return czi.c.d(0, 6, null, homeInsuranceFlowController2, (d) homeInsuranceFlowController2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: dc4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeInsuranceFlowController f112787b;

            {
                this.f112787b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        HomeInsuranceFlowController homeInsuranceFlowController = this.f112787b;
                        phm.a aVar = (phm.a) ue0.e.j(homeInsuranceFlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        HomeInsuranceFlowContract$InputData homeInsuranceFlowContract$InputData = homeInsuranceFlowController.L;
                        homeInsuranceFlowContract$InputData.getClass();
                        return new l3(c1Var, new iq3.a(), homeInsuranceFlowController, homeInsuranceFlowContract$InputData);
                    case 1:
                        return (d) ((l3) this.f112787b.M.getValue()).u.get();
                    default:
                        HomeInsuranceFlowController homeInsuranceFlowController2 = this.f112787b;
                        return czi.c.d(0, 6, null, homeInsuranceFlowController2, (d) homeInsuranceFlowController2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: dc4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeInsuranceFlowController f112787b;

            {
                this.f112787b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        HomeInsuranceFlowController homeInsuranceFlowController = this.f112787b;
                        phm.a aVar = (phm.a) ue0.e.j(homeInsuranceFlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        HomeInsuranceFlowContract$InputData homeInsuranceFlowContract$InputData = homeInsuranceFlowController.L;
                        homeInsuranceFlowContract$InputData.getClass();
                        return new l3(c1Var, new iq3.a(), homeInsuranceFlowController, homeInsuranceFlowContract$InputData);
                    case 1:
                        return (d) ((l3) this.f112787b.M.getValue()).u.get();
                    default:
                        HomeInsuranceFlowController homeInsuranceFlowController2 = this.f112787b;
                        return czi.c.d(0, 6, null, homeInsuranceFlowController2, (d) homeInsuranceFlowController2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l3) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (l3) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (dc4.d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        if (i == 10) {
            String stringExtra = intent != null ? intent.getStringExtra("EXTRAS_HOME_INSURANCE_STATUS") : null;
            ?? r06 = this.N;
            if (i2 == 100) {
                ((e) ((dc4.d) r06.getValue())).S2(new dc4.b(stringExtra));
            } else {
                if (i2 != 110) {
                    return;
                }
                ((e) ((dc4.d) r06.getValue())).S2(new dc4.a(stringExtra));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}

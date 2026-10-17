package com.revolut.feature.credit.application.plugins.impl.ui.credit_health.flow;

import com.revolut.feature.credit.application.plugins.impl.ui.credit_health.flow.CreditHealthFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_health.flow.CreditHealthFlowController;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.c1;
import dw3.j1;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l84.e;
import te0.w;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_health/flow/CreditHealthFlowController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ll84/e;", "Lyki/f;", "Lin0/g;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditHealthFlowController extends ViewController<e> implements f, g {
    public final CreditHealthFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CreditHealthFlowController(CreditHealthFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: l84.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditHealthFlowController f192781b;

            {
                this.f192781b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreditHealthFlowController creditHealthFlowController = this.f192781b;
                        return czi.c.d(0, 6, null, creditHealthFlowController, (a) creditHealthFlowController.N.getValue());
                    case 1:
                        CreditHealthFlowController creditHealthFlowController2 = this.f192781b;
                        phm.a aVar = (phm.a) ue0.e.j(creditHealthFlowController2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CreditHealthFlowContract$InputData creditHealthFlowContract$InputData = creditHealthFlowController2.K;
                        creditHealthFlowContract$InputData.getClass();
                        return new j1(c1Var, creditHealthFlowContract$InputData);
                    default:
                        return (a) ((j1) this.f192781b.M.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: l84.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditHealthFlowController f192781b;

            {
                this.f192781b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreditHealthFlowController creditHealthFlowController = this.f192781b;
                        return czi.c.d(0, 6, null, creditHealthFlowController, (a) creditHealthFlowController.N.getValue());
                    case 1:
                        CreditHealthFlowController creditHealthFlowController2 = this.f192781b;
                        phm.a aVar = (phm.a) ue0.e.j(creditHealthFlowController2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CreditHealthFlowContract$InputData creditHealthFlowContract$InputData = creditHealthFlowController2.K;
                        creditHealthFlowContract$InputData.getClass();
                        return new j1(c1Var, creditHealthFlowContract$InputData);
                    default:
                        return (a) ((j1) this.f192781b.M.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: l84.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditHealthFlowController f192781b;

            {
                this.f192781b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CreditHealthFlowController creditHealthFlowController = this.f192781b;
                        return czi.c.d(0, 6, null, creditHealthFlowController, (a) creditHealthFlowController.N.getValue());
                    case 1:
                        CreditHealthFlowController creditHealthFlowController2 = this.f192781b;
                        phm.a aVar = (phm.a) ue0.e.j(creditHealthFlowController2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CreditHealthFlowContract$InputData creditHealthFlowContract$InputData = creditHealthFlowController2.K;
                        creditHealthFlowContract$InputData.getClass();
                        return new j1(c1Var, creditHealthFlowContract$InputData);
                    default:
                        return (a) ((j1) this.f192781b.M.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j1) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (j1) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (l84.a) this.N.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.L.getValue();
    }
}

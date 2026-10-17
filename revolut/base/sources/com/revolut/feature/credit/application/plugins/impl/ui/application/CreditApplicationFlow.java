package com.revolut.feature.credit.application.plugins.impl.ui.application;

import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.b1;
import dw3.c1;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.f;
import yp3.k;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyp3/k;", "Lyki/f;", "Lin0/g;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditApplicationFlow extends ViewController<k> implements f, g {
    public final CreditApplicationFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CreditApplicationFlow(CreditApplicationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: h54.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditApplicationFlow f149451b;

            {
                this.f149451b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreditApplicationFlow creditApplicationFlow = this.f149451b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditApplicationFlow, (g) creditApplicationFlow.O.getValue());
                    case 1:
                        CreditApplicationFlow creditApplicationFlow2 = this.f149451b;
                        phm.a aVar = (phm.a) ue0.e.j(creditApplicationFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CreditApplicationFlowContract$InputData creditApplicationFlowContract$InputData = creditApplicationFlow2.K;
                        creditApplicationFlowContract$InputData.getClass();
                        return new b1(c1Var, creditApplicationFlowContract$InputData);
                    default:
                        return (g) ((b1) ((i54.a) this.f149451b.N.getValue())).o.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: h54.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditApplicationFlow f149451b;

            {
                this.f149451b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreditApplicationFlow creditApplicationFlow = this.f149451b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditApplicationFlow, (g) creditApplicationFlow.O.getValue());
                    case 1:
                        CreditApplicationFlow creditApplicationFlow2 = this.f149451b;
                        phm.a aVar = (phm.a) ue0.e.j(creditApplicationFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CreditApplicationFlowContract$InputData creditApplicationFlowContract$InputData = creditApplicationFlow2.K;
                        creditApplicationFlowContract$InputData.getClass();
                        return new b1(c1Var, creditApplicationFlowContract$InputData);
                    default:
                        return (g) ((b1) ((i54.a) this.f149451b.N.getValue())).o.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: h54.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditApplicationFlow f149451b;

            {
                this.f149451b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CreditApplicationFlow creditApplicationFlow = this.f149451b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditApplicationFlow, (g) creditApplicationFlow.O.getValue());
                    case 1:
                        CreditApplicationFlow creditApplicationFlow2 = this.f149451b;
                        phm.a aVar = (phm.a) ue0.e.j(creditApplicationFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CreditApplicationFlowContract$InputData creditApplicationFlowContract$InputData = creditApplicationFlow2.K;
                        creditApplicationFlowContract$InputData.getClass();
                        return new b1(c1Var, creditApplicationFlowContract$InputData);
                    default:
                        return (g) ((b1) ((i54.a) this.f149451b.N.getValue())).o.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i54.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (i54.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b h3() {
        return (h54.g) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}

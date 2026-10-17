package com.revolut.feature.credit.application.plugins.impl.ui.close.flow;

import com.revolut.feature.credit.application.plugins.impl.ui.close.flow.CreditApplicationCloseFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.close.flow.CreditApplicationCloseFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.a1;
import dw3.c1;
import h64.c;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import pv3.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/close/flow/CreditApplicationCloseFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpv3/b;", "Lyki/f;", "Lin0/g;", "Lno/d1;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditApplicationCloseFlow extends ViewController<b> implements f, g, d1 {
    public final CreditApplicationCloseFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CreditApplicationCloseFlow(CreditApplicationCloseFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: h64.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditApplicationCloseFlow f149588b;

            {
                this.f149588b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreditApplicationCloseFlow creditApplicationCloseFlow = this.f149588b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditApplicationCloseFlow, (c) creditApplicationCloseFlow.O.getValue());
                    case 1:
                        CreditApplicationCloseFlow creditApplicationCloseFlow2 = this.f149588b;
                        phm.a aVar = (phm.a) e.j(creditApplicationCloseFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CreditApplicationCloseFlowContract$InputData creditApplicationCloseFlowContract$InputData = creditApplicationCloseFlow2.K;
                        creditApplicationCloseFlowContract$InputData.getClass();
                        return new a1(c1Var, new iq3.a(), creditApplicationCloseFlow2, creditApplicationCloseFlowContract$InputData);
                    default:
                        return (c) ((a1) this.f149588b.N.getValue()).k.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: h64.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditApplicationCloseFlow f149588b;

            {
                this.f149588b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreditApplicationCloseFlow creditApplicationCloseFlow = this.f149588b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditApplicationCloseFlow, (c) creditApplicationCloseFlow.O.getValue());
                    case 1:
                        CreditApplicationCloseFlow creditApplicationCloseFlow2 = this.f149588b;
                        phm.a aVar = (phm.a) e.j(creditApplicationCloseFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CreditApplicationCloseFlowContract$InputData creditApplicationCloseFlowContract$InputData = creditApplicationCloseFlow2.K;
                        creditApplicationCloseFlowContract$InputData.getClass();
                        return new a1(c1Var, new iq3.a(), creditApplicationCloseFlow2, creditApplicationCloseFlowContract$InputData);
                    default:
                        return (c) ((a1) this.f149588b.N.getValue()).k.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: h64.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditApplicationCloseFlow f149588b;

            {
                this.f149588b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CreditApplicationCloseFlow creditApplicationCloseFlow = this.f149588b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditApplicationCloseFlow, (c) creditApplicationCloseFlow.O.getValue());
                    case 1:
                        CreditApplicationCloseFlow creditApplicationCloseFlow2 = this.f149588b;
                        phm.a aVar = (phm.a) e.j(creditApplicationCloseFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CreditApplicationCloseFlowContract$InputData creditApplicationCloseFlowContract$InputData = creditApplicationCloseFlow2.K;
                        creditApplicationCloseFlowContract$InputData.getClass();
                        return new a1(c1Var, new iq3.a(), creditApplicationCloseFlow2, creditApplicationCloseFlowContract$InputData);
                    default:
                        return (c) ((a1) this.f149588b.N.getValue()).k.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (a1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (a1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
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

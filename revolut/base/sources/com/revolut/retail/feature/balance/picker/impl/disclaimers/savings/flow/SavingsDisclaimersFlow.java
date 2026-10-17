package com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow;

import a0.d;
import aii.q;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.SavingsDisclaimersFlow;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.SavingsDisclaimersFlowContract$InputData;
import czi.c;
import g2j.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/impl/disclaimers/savings/flow/SavingsDisclaimersFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsDisclaimersFlow extends ViewController<q> implements f {
    public final SavingsDisclaimersFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public SavingsDisclaimersFlow(SavingsDisclaimersFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: b2j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsDisclaimersFlow f11958b;

            {
                this.f11958b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SavingsDisclaimersFlow savingsDisclaimersFlow = this.f11958b;
                        return c.d(R$id.screen_transparent_container, 4, null, savingsDisclaimersFlow, (b) savingsDisclaimersFlow.N.getValue());
                    case 1:
                        return (b) ((j) this.f11958b.O.getValue()).f140113b.get();
                    default:
                        SavingsDisclaimersFlow savingsDisclaimersFlow2 = this.f11958b;
                        phm.a aVar = (phm.a) e.j(savingsDisclaimersFlow2.m2()).a().get(g2j.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", g2j.f.class, " is not found"));
                        }
                        g2j.f fVar = ((g2j.f) aVar2.b()).J;
                        SavingsDisclaimersFlowContract$InputData savingsDisclaimersFlowContract$InputData = savingsDisclaimersFlow2.K;
                        savingsDisclaimersFlowContract$InputData.getClass();
                        return new j(fVar, savingsDisclaimersFlowContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: b2j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsDisclaimersFlow f11958b;

            {
                this.f11958b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SavingsDisclaimersFlow savingsDisclaimersFlow = this.f11958b;
                        return c.d(R$id.screen_transparent_container, 4, null, savingsDisclaimersFlow, (b) savingsDisclaimersFlow.N.getValue());
                    case 1:
                        return (b) ((j) this.f11958b.O.getValue()).f140113b.get();
                    default:
                        SavingsDisclaimersFlow savingsDisclaimersFlow2 = this.f11958b;
                        phm.a aVar = (phm.a) e.j(savingsDisclaimersFlow2.m2()).a().get(g2j.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", g2j.f.class, " is not found"));
                        }
                        g2j.f fVar = ((g2j.f) aVar2.b()).J;
                        SavingsDisclaimersFlowContract$InputData savingsDisclaimersFlowContract$InputData = savingsDisclaimersFlow2.K;
                        savingsDisclaimersFlowContract$InputData.getClass();
                        return new j(fVar, savingsDisclaimersFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: b2j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsDisclaimersFlow f11958b;

            {
                this.f11958b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        SavingsDisclaimersFlow savingsDisclaimersFlow = this.f11958b;
                        return c.d(R$id.screen_transparent_container, 4, null, savingsDisclaimersFlow, (b) savingsDisclaimersFlow.N.getValue());
                    case 1:
                        return (b) ((j) this.f11958b.O.getValue()).f140113b.get();
                    default:
                        SavingsDisclaimersFlow savingsDisclaimersFlow2 = this.f11958b;
                        phm.a aVar = (phm.a) e.j(savingsDisclaimersFlow2.m2()).a().get(g2j.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", g2j.f.class, " is not found"));
                        }
                        g2j.f fVar = ((g2j.f) aVar2.b()).J;
                        SavingsDisclaimersFlowContract$InputData savingsDisclaimersFlowContract$InputData = savingsDisclaimersFlow2.K;
                        savingsDisclaimersFlowContract$InputData.getClass();
                        return new j(fVar, savingsDisclaimersFlowContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (j) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (b2j.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}

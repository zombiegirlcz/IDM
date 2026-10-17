package com.revolut.feature.salary_switch.impl.ui.brazil.flow;

import aii.q;
import com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlow;
import com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.c;
import yki.f;
import zpc.k;
import zpc.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/brazil/flow/SalarySwitchBrFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SalarySwitchBrFlow extends ViewController<q> implements f {
    public final SalarySwitchBrFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public SalarySwitchBrFlow(SalarySwitchBrFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: oqc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalarySwitchBrFlow f227880b;

            {
                this.f227880b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SalarySwitchBrFlow salarySwitchBrFlow = this.f227880b;
                        phm.a aVar = (phm.a) ue0.e.j(salarySwitchBrFlow.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).u;
                        SalarySwitchBrFlowContract$InputData salarySwitchBrFlowContract$InputData = salarySwitchBrFlow.K;
                        salarySwitchBrFlowContract$InputData.getClass();
                        return new l(kVar, salarySwitchBrFlowContract$InputData);
                    case 1:
                        return (b) ((l) this.f227880b.M.getValue()).d.get();
                    default:
                        SalarySwitchBrFlow salarySwitchBrFlow2 = this.f227880b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, salarySwitchBrFlow2, (b) salarySwitchBrFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: oqc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalarySwitchBrFlow f227880b;

            {
                this.f227880b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SalarySwitchBrFlow salarySwitchBrFlow = this.f227880b;
                        phm.a aVar = (phm.a) ue0.e.j(salarySwitchBrFlow.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).u;
                        SalarySwitchBrFlowContract$InputData salarySwitchBrFlowContract$InputData = salarySwitchBrFlow.K;
                        salarySwitchBrFlowContract$InputData.getClass();
                        return new l(kVar, salarySwitchBrFlowContract$InputData);
                    case 1:
                        return (b) ((l) this.f227880b.M.getValue()).d.get();
                    default:
                        SalarySwitchBrFlow salarySwitchBrFlow2 = this.f227880b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, salarySwitchBrFlow2, (b) salarySwitchBrFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: oqc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalarySwitchBrFlow f227880b;

            {
                this.f227880b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        SalarySwitchBrFlow salarySwitchBrFlow = this.f227880b;
                        phm.a aVar = (phm.a) ue0.e.j(salarySwitchBrFlow.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).u;
                        SalarySwitchBrFlowContract$InputData salarySwitchBrFlowContract$InputData = salarySwitchBrFlow.K;
                        salarySwitchBrFlowContract$InputData.getClass();
                        return new l(kVar, salarySwitchBrFlowContract$InputData);
                    case 1:
                        return (b) ((l) this.f227880b.M.getValue()).d.get();
                    default:
                        SalarySwitchBrFlow salarySwitchBrFlow2 = this.f227880b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, salarySwitchBrFlow2, (b) salarySwitchBrFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (l) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (oqc.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}

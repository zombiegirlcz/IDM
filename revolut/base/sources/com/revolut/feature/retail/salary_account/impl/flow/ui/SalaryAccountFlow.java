package com.revolut.feature.retail.salary_account.impl.flow.ui;

import aii.q;
import com.revolut.feature.retail.salary_account.impl.flow.ui.SalaryAccountFlow;
import com.revolut.feature.retail.salary_account.impl.flow.ui.SalaryAccountFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import wfb.j;
import wfb.u;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/flow/ui/SalaryAccountFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SalaryAccountFlow extends ViewController<q> implements f {
    public final SalaryAccountFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public SalaryAccountFlow() {
        this(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (j) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (bgb.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    public SalaryAccountFlow(SalaryAccountFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: bgb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryAccountFlow f15159b;

            {
                this.f15159b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((wfb.j) this.f15159b.O.getValue()).d.get();
                    case 1:
                        SalaryAccountFlow salaryAccountFlow = this.f15159b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, salaryAccountFlow, (b) salaryAccountFlow.M.getValue());
                    default:
                        SalaryAccountFlow salaryAccountFlow2 = this.f15159b;
                        phm.a aVar = (phm.a) ue0.e.j(salaryAccountFlow2.m2()).a().get(u.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u.class, " is not found"));
                        }
                        wfb.i iVar = ((wfb.i) ((u) aVar2.b())).f297052t;
                        SalaryAccountFlowContract$InputData salaryAccountFlowContract$InputData = salaryAccountFlow2.K;
                        salaryAccountFlowContract$InputData.getClass();
                        return new wfb.j(iVar, salaryAccountFlowContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: bgb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryAccountFlow f15159b;

            {
                this.f15159b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((wfb.j) this.f15159b.O.getValue()).d.get();
                    case 1:
                        SalaryAccountFlow salaryAccountFlow = this.f15159b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, salaryAccountFlow, (b) salaryAccountFlow.M.getValue());
                    default:
                        SalaryAccountFlow salaryAccountFlow2 = this.f15159b;
                        phm.a aVar = (phm.a) ue0.e.j(salaryAccountFlow2.m2()).a().get(u.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u.class, " is not found"));
                        }
                        wfb.i iVar = ((wfb.i) ((u) aVar2.b())).f297052t;
                        SalaryAccountFlowContract$InputData salaryAccountFlowContract$InputData = salaryAccountFlow2.K;
                        salaryAccountFlowContract$InputData.getClass();
                        return new wfb.j(iVar, salaryAccountFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: bgb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryAccountFlow f15159b;

            {
                this.f15159b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((wfb.j) this.f15159b.O.getValue()).d.get();
                    case 1:
                        SalaryAccountFlow salaryAccountFlow = this.f15159b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, salaryAccountFlow, (b) salaryAccountFlow.M.getValue());
                    default:
                        SalaryAccountFlow salaryAccountFlow2 = this.f15159b;
                        phm.a aVar = (phm.a) ue0.e.j(salaryAccountFlow2.m2()).a().get(u.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u.class, " is not found"));
                        }
                        wfb.i iVar = ((wfb.i) ((u) aVar2.b())).f297052t;
                        SalaryAccountFlowContract$InputData salaryAccountFlowContract$InputData = salaryAccountFlow2.K;
                        salaryAccountFlowContract$InputData.getClass();
                        return new wfb.j(iVar, salaryAccountFlowContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }

    public /* synthetic */ SalaryAccountFlow(int i) {
        this(SalaryAccountFlowContract$InputData.SalaryHub.f82968a);
    }
}

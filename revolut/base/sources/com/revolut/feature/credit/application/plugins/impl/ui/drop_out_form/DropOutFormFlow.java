package com.revolut.feature.credit.application.plugins.impl.ui.drop_out_form;

import aii.q;
import com.revolut.feature.credit.application.plugins.impl.ui.drop_out_form.DropOutFormFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.drop_out_form.DropOutFormFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.c1;
import dw3.q2;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/drop_out_form/DropOutFormFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "Lin0/g;", "Lno/d1;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DropOutFormFlow extends ViewController<q> implements f, g, d1 {
    public final DropOutFormFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public DropOutFormFlow(DropOutFormFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: oa4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DropOutFormFlow f223515b;

            {
                this.f223515b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        DropOutFormFlow dropOutFormFlow = this.f223515b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, dropOutFormFlow, (b) dropOutFormFlow.O.getValue());
                    case 1:
                        DropOutFormFlow dropOutFormFlow2 = this.f223515b;
                        phm.a aVar = (phm.a) ue0.e.j(dropOutFormFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        DropOutFormFlowContract$InputData dropOutFormFlowContract$InputData = dropOutFormFlow2.K;
                        dropOutFormFlowContract$InputData.getClass();
                        return new q2(c1Var, dropOutFormFlowContract$InputData);
                    default:
                        return (b) ((q2) this.f223515b.N.getValue()).f119563b.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: oa4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DropOutFormFlow f223515b;

            {
                this.f223515b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        DropOutFormFlow dropOutFormFlow = this.f223515b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, dropOutFormFlow, (b) dropOutFormFlow.O.getValue());
                    case 1:
                        DropOutFormFlow dropOutFormFlow2 = this.f223515b;
                        phm.a aVar = (phm.a) ue0.e.j(dropOutFormFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        DropOutFormFlowContract$InputData dropOutFormFlowContract$InputData = dropOutFormFlow2.K;
                        dropOutFormFlowContract$InputData.getClass();
                        return new q2(c1Var, dropOutFormFlowContract$InputData);
                    default:
                        return (b) ((q2) this.f223515b.N.getValue()).f119563b.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: oa4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DropOutFormFlow f223515b;

            {
                this.f223515b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        DropOutFormFlow dropOutFormFlow = this.f223515b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, dropOutFormFlow, (b) dropOutFormFlow.O.getValue());
                    case 1:
                        DropOutFormFlow dropOutFormFlow2 = this.f223515b;
                        phm.a aVar = (phm.a) ue0.e.j(dropOutFormFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        DropOutFormFlowContract$InputData dropOutFormFlowContract$InputData = dropOutFormFlow2.K;
                        dropOutFormFlowContract$InputData.getClass();
                        return new q2(c1Var, dropOutFormFlowContract$InputData);
                    default:
                        return (b) ((q2) this.f223515b.N.getValue()).f119563b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q2) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (q2) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (oa4.b) this.O.getValue();
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
    public final c k() {
        return (c) this.M.getValue();
    }
}

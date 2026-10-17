package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management;

import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management.CatalogueManagementFlow;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ld1.d;
import ld1.l;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_management/CatalogueManagementFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_management/CatalogueManagementFlowContract$Step;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_management/a;", "<init>", "()V", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CatalogueManagementFlow extends BaseFlow<CatalogueManagementFlowContract$Step, IOData$EmptyInput, a> {
    public final Object P;
    public final Object Q;

    public CatalogueManagementFlow() {
        super(IOData$EmptyInput.f98299a);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: td1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CatalogueManagementFlow f269909b;

            {
                this.f269909b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f269909b.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ld1.d(((l) aVar2.b()).f);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                    default:
                        return (b) ((ld1.d) this.f269909b.P.getValue()).f193932c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: td1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CatalogueManagementFlow f269909b;

            {
                this.f269909b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f269909b.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ld1.d(((l) aVar2.b()).f);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                    default:
                        return (b) ((ld1.d) this.f269909b.P.getValue()).f193932c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (td1.b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        CatalogueManagementFlowContract$Step step = (CatalogueManagementFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

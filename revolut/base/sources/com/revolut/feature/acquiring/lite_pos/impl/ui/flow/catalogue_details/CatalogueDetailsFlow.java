package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_details;

import a0.d;
import aii.q;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_details.CatalogueDetailsFlow;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_details.CatalogueDetailsFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ld1.c;
import ld1.l;
import qji.b;
import te0.w;
import ue0.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$Step;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_details/CatalogueDetailsFlowContract$InputData;", "Laii/q;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CatalogueDetailsFlow extends BaseFlow<CatalogueDetailsFlowContract$Step, CatalogueDetailsFlowContract$InputData, q> {
    public final CatalogueDetailsFlowContract$InputData P;
    public final Object Q;
    public final Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueDetailsFlow(CatalogueDetailsFlowContract$InputData input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.P = input;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: sd1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CatalogueDetailsFlow f261800b;

            {
                this.f261800b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CatalogueDetailsFlow catalogueDetailsFlow = this.f261800b;
                        phm.a aVar = (phm.a) e.j(catalogueDetailsFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).f;
                        CatalogueDetailsFlowContract$InputData catalogueDetailsFlowContract$InputData = catalogueDetailsFlow.P;
                        catalogueDetailsFlowContract$InputData.getClass();
                        return new ld1.c(lVar, catalogueDetailsFlowContract$InputData);
                    default:
                        return (b) ((ld1.c) this.f261800b.Q.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: sd1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CatalogueDetailsFlow f261800b;

            {
                this.f261800b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CatalogueDetailsFlow catalogueDetailsFlow = this.f261800b;
                        phm.a aVar = (phm.a) e.j(catalogueDetailsFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).f;
                        CatalogueDetailsFlowContract$InputData catalogueDetailsFlowContract$InputData = catalogueDetailsFlow.P;
                        catalogueDetailsFlowContract$InputData.getClass();
                        return new ld1.c(lVar, catalogueDetailsFlowContract$InputData);
                    default:
                        return (b) ((ld1.c) this.f261800b.Q.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (sd1.b) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        CatalogueDetailsFlowContract$Step step = (CatalogueDetailsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

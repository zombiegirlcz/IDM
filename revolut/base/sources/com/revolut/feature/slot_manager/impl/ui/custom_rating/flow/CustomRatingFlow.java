package com.revolut.feature.slot_manager.impl.ui.custom_rating.flow;

import a0.d;
import aii.q;
import android.view.View;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.flow.CustomRatingFlow;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.flow.CustomRatingFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rkd.b;
import rkd.g;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/slot_manager/impl/ui/custom_rating/flow/CustomRatingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_slot_manager_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomRatingFlow extends ViewController<q> implements f {
    public final CustomRatingFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CustomRatingFlow(CustomRatingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: dld.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomRatingFlow f115730b;

            {
                this.f115730b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CustomRatingFlow customRatingFlow = this.f115730b;
                        phm.a aVar = (phm.a) e.j(customRatingFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).f254806l;
                        CustomRatingFlowContract$InputData customRatingFlowContract$InputData = customRatingFlow.K;
                        customRatingFlowContract$InputData.getClass();
                        return new rkd.b(customRatingFlowContract$InputData);
                    case 1:
                        return new com.revolut.feature.slot_manager.impl.ui.custom_rating.flow.a(((rkd.b) this.f115730b.L.getValue()).f254795a);
                    default:
                        CustomRatingFlow customRatingFlow2 = this.f115730b;
                        return czi.c.d(0, 6, null, customRatingFlow2, (b) customRatingFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: dld.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomRatingFlow f115730b;

            {
                this.f115730b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CustomRatingFlow customRatingFlow = this.f115730b;
                        phm.a aVar = (phm.a) e.j(customRatingFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).f254806l;
                        CustomRatingFlowContract$InputData customRatingFlowContract$InputData = customRatingFlow.K;
                        customRatingFlowContract$InputData.getClass();
                        return new rkd.b(customRatingFlowContract$InputData);
                    case 1:
                        return new com.revolut.feature.slot_manager.impl.ui.custom_rating.flow.a(((rkd.b) this.f115730b.L.getValue()).f254795a);
                    default:
                        CustomRatingFlow customRatingFlow2 = this.f115730b;
                        return czi.c.d(0, 6, null, customRatingFlow2, (b) customRatingFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: dld.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomRatingFlow f115730b;

            {
                this.f115730b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CustomRatingFlow customRatingFlow = this.f115730b;
                        phm.a aVar = (phm.a) e.j(customRatingFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).f254806l;
                        CustomRatingFlowContract$InputData customRatingFlowContract$InputData = customRatingFlow.K;
                        customRatingFlowContract$InputData.getClass();
                        return new rkd.b(customRatingFlowContract$InputData);
                    case 1:
                        return new com.revolut.feature.slot_manager.impl.ui.custom_rating.flow.a(((rkd.b) this.f115730b.L.getValue()).f254795a);
                    default:
                        CustomRatingFlow customRatingFlow2 = this.f115730b;
                        return czi.c.d(0, 6, null, customRatingFlow2, (b) customRatingFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (dld.b) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackground(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}

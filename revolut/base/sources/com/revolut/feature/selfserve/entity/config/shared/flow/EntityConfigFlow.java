package com.revolut.feature.selfserve.entity.config.shared.flow;

import aii.q;
import com.revolut.feature.selfserve.entity.config.shared.flow.EntityConfigFlow;
import com.revolut.feature.selfserve.entity.config.shared.flow.EntityConfigFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import vxc.d;
import yki.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/selfserve/entity/config/shared/flow/EntityConfigFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_selfserve_entity_config_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EntityConfigFlow extends ViewController<q> implements f {
    public final EntityConfigFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public EntityConfigFlow(EntityConfigFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: xxc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EntityConfigFlow f309506b;

            {
                this.f309506b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EntityConfigFlow entityConfigFlow = this.f309506b;
                        return c.d(0, 6, null, entityConfigFlow, (b) entityConfigFlow.N.getValue());
                    case 1:
                        EntityConfigFlow entityConfigFlow2 = this.f309506b;
                        phm.a aVar = (phm.a) e.j(entityConfigFlow2.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        d dVar = ((d) aVar2.b()).e;
                        EntityConfigFlowContract$InputData entityConfigFlowContract$InputData = entityConfigFlow2.K;
                        entityConfigFlowContract$InputData.getClass();
                        return new vxc.c(dVar, entityConfigFlowContract$InputData);
                    default:
                        return (b) ((vxc.c) this.f309506b.M.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: xxc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EntityConfigFlow f309506b;

            {
                this.f309506b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        EntityConfigFlow entityConfigFlow = this.f309506b;
                        return c.d(0, 6, null, entityConfigFlow, (b) entityConfigFlow.N.getValue());
                    case 1:
                        EntityConfigFlow entityConfigFlow2 = this.f309506b;
                        phm.a aVar = (phm.a) e.j(entityConfigFlow2.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        d dVar = ((d) aVar2.b()).e;
                        EntityConfigFlowContract$InputData entityConfigFlowContract$InputData = entityConfigFlow2.K;
                        entityConfigFlowContract$InputData.getClass();
                        return new vxc.c(dVar, entityConfigFlowContract$InputData);
                    default:
                        return (b) ((vxc.c) this.f309506b.M.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: xxc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EntityConfigFlow f309506b;

            {
                this.f309506b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        EntityConfigFlow entityConfigFlow = this.f309506b;
                        return c.d(0, 6, null, entityConfigFlow, (b) entityConfigFlow.N.getValue());
                    case 1:
                        EntityConfigFlow entityConfigFlow2 = this.f309506b;
                        phm.a aVar = (phm.a) e.j(entityConfigFlow2.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        d dVar = ((d) aVar2.b()).e;
                        EntityConfigFlowContract$InputData entityConfigFlowContract$InputData = entityConfigFlow2.K;
                        entityConfigFlowContract$InputData.getClass();
                        return new vxc.c(dVar, entityConfigFlowContract$InputData);
                    default:
                        return (b) ((vxc.c) this.f309506b.M.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (vxc.c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (vxc.c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (xxc.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}

package com.revolut.feature.payments.groups.impl.ui_new.flow.group_details;

import aii.q;
import com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.GroupDetailsFlow;
import com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.GroupDetailsFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kr9.g;
import kr9.l;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/flow/group_details/GroupDetailsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GroupDetailsFlow extends ViewController<q> implements yki.f {
    public final GroupDetailsFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public GroupDetailsFlow(GroupDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: mt9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupDetailsFlow f208766b;

            {
                this.f208766b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        GroupDetailsFlow groupDetailsFlow = this.f208766b;
                        phm.a aVar = (phm.a) ue0.e.j(groupDetailsFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).F;
                        GroupDetailsFlowContract$InputData groupDetailsFlowContract$InputData = groupDetailsFlow.K;
                        groupDetailsFlowContract$InputData.getClass();
                        return new g(lVar, groupDetailsFlowContract$InputData);
                    case 1:
                        return (b) ((g) this.f208766b.M.getValue()).d.get();
                    default:
                        int i2 = R$id.screen_transparent_container;
                        GroupDetailsFlow groupDetailsFlow2 = this.f208766b;
                        return czi.c.d(i2, 4, null, groupDetailsFlow2, (b) groupDetailsFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: mt9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupDetailsFlow f208766b;

            {
                this.f208766b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        GroupDetailsFlow groupDetailsFlow = this.f208766b;
                        phm.a aVar = (phm.a) ue0.e.j(groupDetailsFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).F;
                        GroupDetailsFlowContract$InputData groupDetailsFlowContract$InputData = groupDetailsFlow.K;
                        groupDetailsFlowContract$InputData.getClass();
                        return new g(lVar, groupDetailsFlowContract$InputData);
                    case 1:
                        return (b) ((g) this.f208766b.M.getValue()).d.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        GroupDetailsFlow groupDetailsFlow2 = this.f208766b;
                        return czi.c.d(i22, 4, null, groupDetailsFlow2, (b) groupDetailsFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: mt9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupDetailsFlow f208766b;

            {
                this.f208766b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        GroupDetailsFlow groupDetailsFlow = this.f208766b;
                        phm.a aVar = (phm.a) ue0.e.j(groupDetailsFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).F;
                        GroupDetailsFlowContract$InputData groupDetailsFlowContract$InputData = groupDetailsFlow.K;
                        groupDetailsFlowContract$InputData.getClass();
                        return new g(lVar, groupDetailsFlowContract$InputData);
                    case 1:
                        return (b) ((g) this.f208766b.M.getValue()).d.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        GroupDetailsFlow groupDetailsFlow2 = this.f208766b;
                        return czi.c.d(i22, 4, null, groupDetailsFlow2, (b) groupDetailsFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (mt9.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}

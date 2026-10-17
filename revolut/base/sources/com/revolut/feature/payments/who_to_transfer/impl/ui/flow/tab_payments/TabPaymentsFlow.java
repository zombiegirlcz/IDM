package com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments;

import a0.d;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.TabPaymentsFlow;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.TabPaymentsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import s3a.j;
import s3a.k;
import s3a.r;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lyki/f;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TabPaymentsFlow extends ViewController<Object> implements f {
    public final TabPaymentsFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public TabPaymentsFlow(TabPaymentsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: j5a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabPaymentsFlow f171612b;

            {
                this.f171612b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TabPaymentsFlow tabPaymentsFlow = this.f171612b;
                        phm.a aVar = (phm.a) e.j(tabPaymentsFlow.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", r.class, " is not found"));
                        }
                        k kVar = ((k) ((r) aVar2.b())).g0;
                        TabPaymentsFlowContract$InputData tabPaymentsFlowContract$InputData = tabPaymentsFlow.K;
                        tabPaymentsFlowContract$InputData.getClass();
                        return new j(kVar, tabPaymentsFlowContract$InputData);
                    case 1:
                        return (b) ((j) this.f171612b.L.getValue()).d.get();
                    default:
                        TabPaymentsFlow tabPaymentsFlow2 = this.f171612b;
                        return czi.c.d(0, 6, null, tabPaymentsFlow2, (b) tabPaymentsFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: j5a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabPaymentsFlow f171612b;

            {
                this.f171612b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TabPaymentsFlow tabPaymentsFlow = this.f171612b;
                        phm.a aVar = (phm.a) e.j(tabPaymentsFlow.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", r.class, " is not found"));
                        }
                        k kVar = ((k) ((r) aVar2.b())).g0;
                        TabPaymentsFlowContract$InputData tabPaymentsFlowContract$InputData = tabPaymentsFlow.K;
                        tabPaymentsFlowContract$InputData.getClass();
                        return new j(kVar, tabPaymentsFlowContract$InputData);
                    case 1:
                        return (b) ((j) this.f171612b.L.getValue()).d.get();
                    default:
                        TabPaymentsFlow tabPaymentsFlow2 = this.f171612b;
                        return czi.c.d(0, 6, null, tabPaymentsFlow2, (b) tabPaymentsFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: j5a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TabPaymentsFlow f171612b;

            {
                this.f171612b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TabPaymentsFlow tabPaymentsFlow = this.f171612b;
                        phm.a aVar = (phm.a) e.j(tabPaymentsFlow.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", r.class, " is not found"));
                        }
                        k kVar = ((k) ((r) aVar2.b())).g0;
                        TabPaymentsFlowContract$InputData tabPaymentsFlowContract$InputData = tabPaymentsFlow.K;
                        tabPaymentsFlowContract$InputData.getClass();
                        return new j(kVar, tabPaymentsFlowContract$InputData);
                    case 1:
                        return (b) ((j) this.f171612b.L.getValue()).d.get();
                    default:
                        TabPaymentsFlow tabPaymentsFlow2 = this.f171612b;
                        return czi.c.d(0, 6, null, tabPaymentsFlow2, (b) tabPaymentsFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (j) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j5a.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}

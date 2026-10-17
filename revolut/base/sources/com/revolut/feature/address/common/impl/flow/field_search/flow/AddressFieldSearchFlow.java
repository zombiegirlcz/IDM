package com.revolut.feature.address.common.impl.flow.field_search.flow;

import bi1.c;
import com.revolut.feature.address.common.impl.flow.field_search.flow.AddressFieldSearchFlow;
import com.revolut.feature.address.common.impl.flow.field_search.flow.AddressFieldSearchFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/field_search/flow/AddressFieldSearchFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbi1/c;", "Lyki/f;", "Lkji/f;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddressFieldSearchFlow extends ViewController<c> implements f, kji.f {
    public final AddressFieldSearchFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public AddressFieldSearchFlow(AddressFieldSearchFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: bi1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressFieldSearchFlow f15370b;

            {
                this.f15370b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AddressFieldSearchFlow addressFieldSearchFlow = this.f15370b;
                        phm.a aVar = (phm.a) e.j(addressFieldSearchFlow.m2()).a().get(oh1.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oh1.c.class, " is not found"));
                        }
                        yh1.e eVar = ((yh1.e) aVar2.b()).e;
                        AddressFieldSearchFlowContract$InputData addressFieldSearchFlowContract$InputData = addressFieldSearchFlow.K;
                        addressFieldSearchFlowContract$InputData.getClass();
                        return new yh1.c(eVar, addressFieldSearchFlowContract$InputData);
                    case 1:
                        return (b) ((yh1.c) this.f15370b.L.getValue()).d.get();
                    default:
                        AddressFieldSearchFlow addressFieldSearchFlow2 = this.f15370b;
                        return czi.c.d(0, 6, null, addressFieldSearchFlow2, (b) addressFieldSearchFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: bi1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressFieldSearchFlow f15370b;

            {
                this.f15370b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AddressFieldSearchFlow addressFieldSearchFlow = this.f15370b;
                        phm.a aVar = (phm.a) e.j(addressFieldSearchFlow.m2()).a().get(oh1.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oh1.c.class, " is not found"));
                        }
                        yh1.e eVar = ((yh1.e) aVar2.b()).e;
                        AddressFieldSearchFlowContract$InputData addressFieldSearchFlowContract$InputData = addressFieldSearchFlow.K;
                        addressFieldSearchFlowContract$InputData.getClass();
                        return new yh1.c(eVar, addressFieldSearchFlowContract$InputData);
                    case 1:
                        return (b) ((yh1.c) this.f15370b.L.getValue()).d.get();
                    default:
                        AddressFieldSearchFlow addressFieldSearchFlow2 = this.f15370b;
                        return czi.c.d(0, 6, null, addressFieldSearchFlow2, (b) addressFieldSearchFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: bi1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressFieldSearchFlow f15370b;

            {
                this.f15370b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AddressFieldSearchFlow addressFieldSearchFlow = this.f15370b;
                        phm.a aVar = (phm.a) e.j(addressFieldSearchFlow.m2()).a().get(oh1.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oh1.c.class, " is not found"));
                        }
                        yh1.e eVar = ((yh1.e) aVar2.b()).e;
                        AddressFieldSearchFlowContract$InputData addressFieldSearchFlowContract$InputData = addressFieldSearchFlow.K;
                        addressFieldSearchFlowContract$InputData.getClass();
                        return new yh1.c(eVar, addressFieldSearchFlowContract$InputData);
                    case 1:
                        return (b) ((yh1.c) this.f15370b.L.getValue()).d.get();
                    default:
                        AddressFieldSearchFlow addressFieldSearchFlow2 = this.f15370b;
                        return czi.c.d(0, 6, null, addressFieldSearchFlow2, (b) addressFieldSearchFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (yh1.c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (yh1.c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (bi1.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}

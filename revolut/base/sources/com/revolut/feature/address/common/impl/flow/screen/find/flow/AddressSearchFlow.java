package com.revolut.feature.address.common.impl.flow.screen.find.flow;

import com.revolut.feature.address.common.api.navigation.FindAddressControllerDescriptor$InputData;
import com.revolut.feature.address.common.impl.flow.screen.find.flow.AddressSearchFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oh1.c;
import qji.b;
import te0.w;
import th1.d;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/screen/find/flow/AddressSearchFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lth1/d;", "Lyki/f;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddressSearchFlow extends ViewController<d> implements f {
    public final FindAddressControllerDescriptor$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public AddressSearchFlow(FindAddressControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: li1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressSearchFlow f195401b;

            {
                this.f195401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AddressSearchFlow addressSearchFlow = this.f195401b;
                        phm.a aVar = (phm.a) e.j(addressSearchFlow.m2()).a().get(c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c.class, " is not found"));
                        }
                        yh1.e eVar = ((yh1.e) aVar2.b()).e;
                        FindAddressControllerDescriptor$InputData findAddressControllerDescriptor$InputData = addressSearchFlow.K;
                        findAddressControllerDescriptor$InputData.getClass();
                        return new yh1.f(eVar, findAddressControllerDescriptor$InputData);
                    case 1:
                        return (b) ((yh1.f) this.f195401b.L.getValue()).f.get();
                    default:
                        AddressSearchFlow addressSearchFlow2 = this.f195401b;
                        return czi.c.d(0, 6, null, addressSearchFlow2, (b) addressSearchFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: li1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressSearchFlow f195401b;

            {
                this.f195401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AddressSearchFlow addressSearchFlow = this.f195401b;
                        phm.a aVar = (phm.a) e.j(addressSearchFlow.m2()).a().get(c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c.class, " is not found"));
                        }
                        yh1.e eVar = ((yh1.e) aVar2.b()).e;
                        FindAddressControllerDescriptor$InputData findAddressControllerDescriptor$InputData = addressSearchFlow.K;
                        findAddressControllerDescriptor$InputData.getClass();
                        return new yh1.f(eVar, findAddressControllerDescriptor$InputData);
                    case 1:
                        return (b) ((yh1.f) this.f195401b.L.getValue()).f.get();
                    default:
                        AddressSearchFlow addressSearchFlow2 = this.f195401b;
                        return czi.c.d(0, 6, null, addressSearchFlow2, (b) addressSearchFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: li1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressSearchFlow f195401b;

            {
                this.f195401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AddressSearchFlow addressSearchFlow = this.f195401b;
                        phm.a aVar = (phm.a) e.j(addressSearchFlow.m2()).a().get(c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c.class, " is not found"));
                        }
                        yh1.e eVar = ((yh1.e) aVar2.b()).e;
                        FindAddressControllerDescriptor$InputData findAddressControllerDescriptor$InputData = addressSearchFlow.K;
                        findAddressControllerDescriptor$InputData.getClass();
                        return new yh1.f(eVar, findAddressControllerDescriptor$InputData);
                    case 1:
                        return (b) ((yh1.f) this.f195401b.L.getValue()).f.get();
                    default:
                        AddressSearchFlow addressSearchFlow2 = this.f195401b;
                        return czi.c.d(0, 6, null, addressSearchFlow2, (b) addressSearchFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (yh1.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (yh1.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (li1.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}

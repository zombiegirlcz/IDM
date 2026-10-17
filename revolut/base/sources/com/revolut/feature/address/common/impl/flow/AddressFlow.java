package com.revolut.feature.address.common.impl.flow;

import ai1.b;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.address.common.impl.flow.AddressFlow;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import qh1.a;
import te0.w;
import ue0.e;
import uki.c;
import vh1.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/AddressFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/address/common/api/flow/AddressFlowContract$OutputData;", "Luki/c;", "Lno/m;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddressFlow extends ViewController<AddressFlowContract$OutputData> implements c, m {
    public final AddressFlowContract$InputData K;
    public final d L;
    public final x7a.d M;
    public final boolean N;
    public final AnalyticsProduct O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public AddressFlow(AddressFlowContract$InputData inputData, d addressValidator, x7a.d countryPickerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(addressValidator, "addressValidator");
        Intrinsics.checkNotNullParameter(countryPickerInteractor, "countryPickerInteractor");
        this.K = inputData;
        this.L = addressValidator;
        this.M = countryPickerInteractor;
        this.N = inputData.e;
        this.O = inputData.f60935p;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: zh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressFlow f322211b;

            {
                this.f322211b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AddressFlow addressFlow = this.f322211b;
                        return czi.c.a(R$id.container, (qh1.a) addressFlow.R.getValue(), addressFlow);
                    case 1:
                        AddressFlow addressFlow2 = this.f322211b;
                        phm.a aVar = (phm.a) e.j(addressFlow2.m2()).a().get(oh1.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oh1.c.class, " is not found"));
                        }
                        yh1.e eVar = ((yh1.e) aVar2.b()).e;
                        AddressFlowContract$InputData addressFlowContract$InputData = addressFlow2.K;
                        addressFlowContract$InputData.getClass();
                        d dVar = addressFlow2.L;
                        dVar.getClass();
                        x7a.d dVar2 = addressFlow2.M;
                        dVar2.getClass();
                        return new yh1.d(eVar, addressFlowContract$InputData, dVar, dVar2);
                    default:
                        return (qh1.a) ((yh1.d) ((ai1.b) this.f322211b.Q.getValue())).f313705g.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: zh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressFlow f322211b;

            {
                this.f322211b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AddressFlow addressFlow = this.f322211b;
                        return czi.c.a(R$id.container, (qh1.a) addressFlow.R.getValue(), addressFlow);
                    case 1:
                        AddressFlow addressFlow2 = this.f322211b;
                        phm.a aVar = (phm.a) e.j(addressFlow2.m2()).a().get(oh1.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oh1.c.class, " is not found"));
                        }
                        yh1.e eVar = ((yh1.e) aVar2.b()).e;
                        AddressFlowContract$InputData addressFlowContract$InputData = addressFlow2.K;
                        addressFlowContract$InputData.getClass();
                        d dVar = addressFlow2.L;
                        dVar.getClass();
                        x7a.d dVar2 = addressFlow2.M;
                        dVar2.getClass();
                        return new yh1.d(eVar, addressFlowContract$InputData, dVar, dVar2);
                    default:
                        return (qh1.a) ((yh1.d) ((ai1.b) this.f322211b.Q.getValue())).f313705g.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: zh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressFlow f322211b;

            {
                this.f322211b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AddressFlow addressFlow = this.f322211b;
                        return czi.c.a(R$id.container, (qh1.a) addressFlow.R.getValue(), addressFlow);
                    case 1:
                        AddressFlow addressFlow2 = this.f322211b;
                        phm.a aVar = (phm.a) e.j(addressFlow2.m2()).a().get(oh1.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oh1.c.class, " is not found"));
                        }
                        yh1.e eVar = ((yh1.e) aVar2.b()).e;
                        AddressFlowContract$InputData addressFlowContract$InputData = addressFlow2.K;
                        addressFlowContract$InputData.getClass();
                        d dVar = addressFlow2.L;
                        dVar.getClass();
                        x7a.d dVar2 = addressFlow2.M;
                        dVar2.getClass();
                        return new yh1.d(eVar, addressFlowContract$InputData, dVar, dVar2);
                    default:
                        return (qh1.a) ((yh1.d) ((ai1.b) this.f322211b.Q.getValue())).f313705g.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (a) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.P.getValue();
    }
}

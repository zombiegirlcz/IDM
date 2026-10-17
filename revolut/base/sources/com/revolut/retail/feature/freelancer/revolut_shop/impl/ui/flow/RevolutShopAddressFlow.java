package com.revolut.retail.feature.freelancer.revolut_shop.impl.ui.flow;

import com.revolut.feature.revolut_shop.api.domain.provider.RevolutShopAddressFlowProvider$OutputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.freelancer.revolut_shop.impl.ui.flow.RevolutShopAddressFlow;
import com.revolut.retail.feature.freelancer.revolut_shop.impl.ui.flow.RevolutShopAddressFlowContract$InputData;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import vh1.d;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/freelancer/revolut_shop/impl/ui/flow/RevolutShopAddressFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/revolut_shop/api/domain/provider/RevolutShopAddressFlowProvider$OutputData;", "Lyki/f;", "feature_freelancer_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutShopAddressFlow extends ViewController<RevolutShopAddressFlowProvider$OutputData> implements f {
    public final RevolutShopAddressFlowContract$InputData K;
    public final d L;
    public final Object M;
    public final Object N;
    public final Object O;

    public RevolutShopAddressFlow(RevolutShopAddressFlowContract$InputData inputData, d addressValidator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(addressValidator, "addressValidator");
        this.K = inputData;
        this.L = addressValidator;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ppj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutShopAddressFlow f238614b;

            {
                this.f238614b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        RevolutShopAddressFlow revolutShopAddressFlow = this.f238614b;
                        return c.d(0, 6, null, revolutShopAddressFlow, (b) revolutShopAddressFlow.O.getValue());
                    case 1:
                        RevolutShopAddressFlow revolutShopAddressFlow2 = this.f238614b;
                        phm.a aVar = (phm.a) e.j(revolutShopAddressFlow2.m2()).a().get(jpj.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jpj.d.class, " is not found"));
                        }
                        jpj.d dVar = ((jpj.d) aVar2.b()).f177303g;
                        RevolutShopAddressFlowContract$InputData revolutShopAddressFlowContract$InputData = revolutShopAddressFlow2.K;
                        revolutShopAddressFlowContract$InputData.getClass();
                        d dVar2 = revolutShopAddressFlow2.L;
                        dVar2.getClass();
                        return new jpj.c(dVar, revolutShopAddressFlowContract$InputData, dVar2);
                    default:
                        return (b) ((jpj.c) this.f238614b.N.getValue()).f177299c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ppj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutShopAddressFlow f238614b;

            {
                this.f238614b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        RevolutShopAddressFlow revolutShopAddressFlow = this.f238614b;
                        return c.d(0, 6, null, revolutShopAddressFlow, (b) revolutShopAddressFlow.O.getValue());
                    case 1:
                        RevolutShopAddressFlow revolutShopAddressFlow2 = this.f238614b;
                        phm.a aVar = (phm.a) e.j(revolutShopAddressFlow2.m2()).a().get(jpj.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jpj.d.class, " is not found"));
                        }
                        jpj.d dVar = ((jpj.d) aVar2.b()).f177303g;
                        RevolutShopAddressFlowContract$InputData revolutShopAddressFlowContract$InputData = revolutShopAddressFlow2.K;
                        revolutShopAddressFlowContract$InputData.getClass();
                        d dVar2 = revolutShopAddressFlow2.L;
                        dVar2.getClass();
                        return new jpj.c(dVar, revolutShopAddressFlowContract$InputData, dVar2);
                    default:
                        return (b) ((jpj.c) this.f238614b.N.getValue()).f177299c.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: ppj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutShopAddressFlow f238614b;

            {
                this.f238614b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        RevolutShopAddressFlow revolutShopAddressFlow = this.f238614b;
                        return c.d(0, 6, null, revolutShopAddressFlow, (b) revolutShopAddressFlow.O.getValue());
                    case 1:
                        RevolutShopAddressFlow revolutShopAddressFlow2 = this.f238614b;
                        phm.a aVar = (phm.a) e.j(revolutShopAddressFlow2.m2()).a().get(jpj.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jpj.d.class, " is not found"));
                        }
                        jpj.d dVar = ((jpj.d) aVar2.b()).f177303g;
                        RevolutShopAddressFlowContract$InputData revolutShopAddressFlowContract$InputData = revolutShopAddressFlow2.K;
                        revolutShopAddressFlowContract$InputData.getClass();
                        d dVar2 = revolutShopAddressFlow2.L;
                        dVar2.getClass();
                        return new jpj.c(dVar, revolutShopAddressFlowContract$InputData, dVar2);
                    default:
                        return (b) ((jpj.c) this.f238614b.N.getValue()).f177299c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (jpj.c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (jpj.c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ppj.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}

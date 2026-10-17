package com.revolut.feature.apm.bills.tapi.impl.flow.transfer;

import aii.q;
import com.revolut.feature.apm.bills.tapi.impl.flow.transfer.TapiTransferFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import sr1.c;
import te0.w;
import ue0.e;
import yhm.d;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bills/tapi/impl/flow/transfer/TapiTransferFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_apm_bills_tapi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class TapiTransferFlow extends ViewController<q> implements f {
    public final c K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public TapiTransferFlow(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: sr1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TapiTransferFlow f265103b;

            {
                this.f265103b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TapiTransferFlow tapiTransferFlow = this.f265103b;
                        phm.a aVar = (phm.a) e.j(tapiTransferFlow.m2()).a().get(rr1.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rr1.a.class, " is not found"));
                        }
                        rr1.a aVar3 = ((rr1.a) aVar2.b()).f256638m;
                        c cVar = tapiTransferFlow.K;
                        cVar.getClass();
                        return new rr1.e(aVar3, cVar);
                    case 1:
                        return (b) ((rr1.e) this.f265103b.M.getValue()).d.get();
                    default:
                        int i2 = R$id.screen_transparent_container;
                        TapiTransferFlow tapiTransferFlow2 = this.f265103b;
                        return czi.c.d(i2, 4, null, tapiTransferFlow2, (b) tapiTransferFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: sr1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TapiTransferFlow f265103b;

            {
                this.f265103b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TapiTransferFlow tapiTransferFlow = this.f265103b;
                        phm.a aVar = (phm.a) e.j(tapiTransferFlow.m2()).a().get(rr1.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rr1.a.class, " is not found"));
                        }
                        rr1.a aVar3 = ((rr1.a) aVar2.b()).f256638m;
                        c cVar = tapiTransferFlow.K;
                        cVar.getClass();
                        return new rr1.e(aVar3, cVar);
                    case 1:
                        return (b) ((rr1.e) this.f265103b.M.getValue()).d.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        TapiTransferFlow tapiTransferFlow2 = this.f265103b;
                        return czi.c.d(i22, 4, null, tapiTransferFlow2, (b) tapiTransferFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: sr1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TapiTransferFlow f265103b;

            {
                this.f265103b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TapiTransferFlow tapiTransferFlow = this.f265103b;
                        phm.a aVar = (phm.a) e.j(tapiTransferFlow.m2()).a().get(rr1.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rr1.a.class, " is not found"));
                        }
                        rr1.a aVar3 = ((rr1.a) aVar2.b()).f256638m;
                        c cVar = tapiTransferFlow.K;
                        cVar.getClass();
                        return new rr1.e(aVar3, cVar);
                    case 1:
                        return (b) ((rr1.e) this.f265103b.M.getValue()).d.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        TapiTransferFlow tapiTransferFlow2 = this.f265103b;
                        return czi.c.d(i22, 4, null, tapiTransferFlow2, (b) tapiTransferFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (rr1.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (rr1.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (sr1.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}

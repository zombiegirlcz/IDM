package com.revolut.feature.revolutpay.promoted_merchants.impl.ui.flow.promotedmerchants;

import aii.q;
import com.revolut.feature.revolutpay.promoted_merchants.api.navigation.PromotedMerchantsDestination;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.flow.promotedmerchants.PromotedMerchantsFlow;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.flow.promotedmerchants.PromotedMerchantsFlowContract$Step;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/promoted_merchants/impl/ui/flow/promotedmerchants/PromotedMerchantsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_revolut_pay_promoted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PromotedMerchantsFlow extends ViewController<q> implements f {
    public final PromotedMerchantsDestination.InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;

    public PromotedMerchantsFlow(PromotedMerchantsDestination.InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: lcc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PromotedMerchantsFlow f193835b;

            {
                this.f193835b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PromotedMerchantsFlow promotedMerchantsFlow = this.f193835b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, promotedMerchantsFlow, (b) promotedMerchantsFlow.P.getValue());
                    case 1:
                        PromotedMerchantsFlow promotedMerchantsFlow2 = this.f193835b;
                        phm.a aVar = (phm.a) ue0.e.j(promotedMerchantsFlow2.m2()).a().get(jcc.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jcc.e.class, " is not found"));
                        }
                        jcc.e eVar = ((jcc.e) aVar2.b()).f172773j;
                        PromotedMerchantsDestination.InputData inputData2 = promotedMerchantsFlow2.K;
                        inputData2.getClass();
                        return new jcc.c(eVar, inputData2);
                    case 2:
                        return (b) ((jcc.c) ((mcc.a) this.f193835b.N.getValue())).f172764b.get();
                    default:
                        return (b) this.f193835b.O.getValue();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: lcc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PromotedMerchantsFlow f193835b;

            {
                this.f193835b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PromotedMerchantsFlow promotedMerchantsFlow = this.f193835b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, promotedMerchantsFlow, (b) promotedMerchantsFlow.P.getValue());
                    case 1:
                        PromotedMerchantsFlow promotedMerchantsFlow2 = this.f193835b;
                        phm.a aVar = (phm.a) ue0.e.j(promotedMerchantsFlow2.m2()).a().get(jcc.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jcc.e.class, " is not found"));
                        }
                        jcc.e eVar = ((jcc.e) aVar2.b()).f172773j;
                        PromotedMerchantsDestination.InputData inputData2 = promotedMerchantsFlow2.K;
                        inputData2.getClass();
                        return new jcc.c(eVar, inputData2);
                    case 2:
                        return (b) ((jcc.c) ((mcc.a) this.f193835b.N.getValue())).f172764b.get();
                    default:
                        return (b) this.f193835b.O.getValue();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: lcc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PromotedMerchantsFlow f193835b;

            {
                this.f193835b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PromotedMerchantsFlow promotedMerchantsFlow = this.f193835b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, promotedMerchantsFlow, (b) promotedMerchantsFlow.P.getValue());
                    case 1:
                        PromotedMerchantsFlow promotedMerchantsFlow2 = this.f193835b;
                        phm.a aVar = (phm.a) ue0.e.j(promotedMerchantsFlow2.m2()).a().get(jcc.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jcc.e.class, " is not found"));
                        }
                        jcc.e eVar = ((jcc.e) aVar2.b()).f172773j;
                        PromotedMerchantsDestination.InputData inputData2 = promotedMerchantsFlow2.K;
                        inputData2.getClass();
                        return new jcc.c(eVar, inputData2);
                    case 2:
                        return (b) ((jcc.c) ((mcc.a) this.f193835b.N.getValue())).f172764b.get();
                    default:
                        return (b) this.f193835b.O.getValue();
                }
            }
        });
        final int i5 = 3;
        this.P = w.y0(new Function0(this) { // from class: lcc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PromotedMerchantsFlow f193835b;

            {
                this.f193835b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        PromotedMerchantsFlow promotedMerchantsFlow = this.f193835b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, promotedMerchantsFlow, (b) promotedMerchantsFlow.P.getValue());
                    case 1:
                        PromotedMerchantsFlow promotedMerchantsFlow2 = this.f193835b;
                        phm.a aVar = (phm.a) ue0.e.j(promotedMerchantsFlow2.m2()).a().get(jcc.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jcc.e.class, " is not found"));
                        }
                        jcc.e eVar = ((jcc.e) aVar2.b()).f172773j;
                        PromotedMerchantsDestination.InputData inputData2 = promotedMerchantsFlow2.K;
                        inputData2.getClass();
                        return new jcc.c(eVar, inputData2);
                    case 2:
                        return (b) ((jcc.c) ((mcc.a) this.f193835b.N.getValue())).f172764b.get();
                    default:
                        return (b) this.f193835b.O.getValue();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        b bVar = (b) ((lcc.b) this.O.getValue());
        if (!Intrinsics.f(bVar.f84676q.d(), PromotedMerchantsFlowContract$Step.RevPointsOptIn.f84674a)) {
            return super.F2();
        }
        bVar.I2();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (mcc.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (mcc.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (lcc.b) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}

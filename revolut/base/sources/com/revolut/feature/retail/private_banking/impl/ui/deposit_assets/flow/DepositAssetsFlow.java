package com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow;

import aii.q;
import com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow.DepositAssetsFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import ycb.c;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/private_banking/impl/ui/deposit_assets/flow/DepositAssetsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_private_banking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DepositAssetsFlow extends ViewController<q> implements f {
    public final c K;
    public final Object L;
    public final Object M;
    public final Object N;

    public DepositAssetsFlow(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ycb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DepositAssetsFlow f312603b;

            {
                this.f312603b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        DepositAssetsFlow depositAssetsFlow = this.f312603b;
                        return czi.c.d(0, 6, null, depositAssetsFlow, (b) depositAssetsFlow.N.getValue());
                    case 1:
                        DepositAssetsFlow depositAssetsFlow2 = this.f312603b;
                        phm.a aVar = (phm.a) ue0.e.j(depositAssetsFlow2.m2()).a().get(wcb.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", wcb.c.class, " is not found"));
                        }
                        wcb.c cVar = ((wcb.c) aVar2.b()).d;
                        c cVar2 = depositAssetsFlow2.K;
                        cVar2.getClass();
                        return new wcb.a(cVar, cVar2);
                    default:
                        return (b) ((wcb.a) this.f312603b.M.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ycb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DepositAssetsFlow f312603b;

            {
                this.f312603b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        DepositAssetsFlow depositAssetsFlow = this.f312603b;
                        return czi.c.d(0, 6, null, depositAssetsFlow, (b) depositAssetsFlow.N.getValue());
                    case 1:
                        DepositAssetsFlow depositAssetsFlow2 = this.f312603b;
                        phm.a aVar = (phm.a) ue0.e.j(depositAssetsFlow2.m2()).a().get(wcb.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", wcb.c.class, " is not found"));
                        }
                        wcb.c cVar = ((wcb.c) aVar2.b()).d;
                        c cVar2 = depositAssetsFlow2.K;
                        cVar2.getClass();
                        return new wcb.a(cVar, cVar2);
                    default:
                        return (b) ((wcb.a) this.f312603b.M.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ycb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DepositAssetsFlow f312603b;

            {
                this.f312603b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        DepositAssetsFlow depositAssetsFlow = this.f312603b;
                        return czi.c.d(0, 6, null, depositAssetsFlow, (b) depositAssetsFlow.N.getValue());
                    case 1:
                        DepositAssetsFlow depositAssetsFlow2 = this.f312603b;
                        phm.a aVar = (phm.a) ue0.e.j(depositAssetsFlow2.m2()).a().get(wcb.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", wcb.c.class, " is not found"));
                        }
                        wcb.c cVar = ((wcb.c) aVar2.b()).d;
                        c cVar2 = depositAssetsFlow2.K;
                        cVar2.getClass();
                        return new wcb.a(cVar, cVar2);
                    default:
                        return (b) ((wcb.a) this.f312603b.M.getValue()).e.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (wcb.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (wcb.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ycb.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}

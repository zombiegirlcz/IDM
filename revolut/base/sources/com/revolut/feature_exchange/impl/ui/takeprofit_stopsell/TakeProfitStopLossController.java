package com.revolut.feature_exchange.impl.ui.takeprofit_stopsell;

import a0.d;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.TakeProfitStopLossController;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.TakeProfitStopLossControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import s0i.c;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/takeprofit_stopsell/TakeProfitStopLossController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ls0i/c;", "Lyki/f;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TakeProfitStopLossController extends ViewController<c> implements f {
    public final TakeProfitStopLossControllerContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public TakeProfitStopLossController(TakeProfitStopLossControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: i3i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TakeProfitStopLossController f158224b;

            {
                this.f158224b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TakeProfitStopLossController takeProfitStopLossController = this.f158224b;
                        phm.a aVar = (phm.a) e.j(takeProfitStopLossController.m2()).a().get(v0i.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", v0i.b.class, " is not found"));
                        }
                        v0i.b bVar = ((v0i.b) aVar2.b()).f284870t;
                        TakeProfitStopLossControllerContract$InputData takeProfitStopLossControllerContract$InputData = takeProfitStopLossController.K;
                        takeProfitStopLossControllerContract$InputData.getClass();
                        return new v0i.e(bVar, takeProfitStopLossControllerContract$InputData);
                    case 1:
                        return (b) ((v0i.e) this.f158224b.L.getValue()).f284883b.get();
                    default:
                        TakeProfitStopLossController takeProfitStopLossController2 = this.f158224b;
                        return czi.c.d(0, 6, null, takeProfitStopLossController2, (b) takeProfitStopLossController2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: i3i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TakeProfitStopLossController f158224b;

            {
                this.f158224b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TakeProfitStopLossController takeProfitStopLossController = this.f158224b;
                        phm.a aVar = (phm.a) e.j(takeProfitStopLossController.m2()).a().get(v0i.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", v0i.b.class, " is not found"));
                        }
                        v0i.b bVar = ((v0i.b) aVar2.b()).f284870t;
                        TakeProfitStopLossControllerContract$InputData takeProfitStopLossControllerContract$InputData = takeProfitStopLossController.K;
                        takeProfitStopLossControllerContract$InputData.getClass();
                        return new v0i.e(bVar, takeProfitStopLossControllerContract$InputData);
                    case 1:
                        return (b) ((v0i.e) this.f158224b.L.getValue()).f284883b.get();
                    default:
                        TakeProfitStopLossController takeProfitStopLossController2 = this.f158224b;
                        return czi.c.d(0, 6, null, takeProfitStopLossController2, (b) takeProfitStopLossController2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: i3i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TakeProfitStopLossController f158224b;

            {
                this.f158224b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TakeProfitStopLossController takeProfitStopLossController = this.f158224b;
                        phm.a aVar = (phm.a) e.j(takeProfitStopLossController.m2()).a().get(v0i.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", v0i.b.class, " is not found"));
                        }
                        v0i.b bVar = ((v0i.b) aVar2.b()).f284870t;
                        TakeProfitStopLossControllerContract$InputData takeProfitStopLossControllerContract$InputData = takeProfitStopLossController.K;
                        takeProfitStopLossControllerContract$InputData.getClass();
                        return new v0i.e(bVar, takeProfitStopLossControllerContract$InputData);
                    case 1:
                        return (b) ((v0i.e) this.f158224b.L.getValue()).f284883b.get();
                    default:
                        TakeProfitStopLossController takeProfitStopLossController2 = this.f158224b;
                        return czi.c.d(0, 6, null, takeProfitStopLossController2, (b) takeProfitStopLossController2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (v0i.e) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (v0i.e) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i3i.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}

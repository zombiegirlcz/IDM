package com.revolut.feature.cash_topup.impl.ui.flow.barcode;

import aii.q;
import com.revolut.feature.cash_topup.impl.ui.flow.barcode.CashTopUpBarcodeFlow;
import com.revolut.feature.cash_topup.impl.ui.flow.barcode.CashTopUpBarcodeFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mb3.k;
import mb3.p;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashTopUpBarcodeFlow extends ViewController<q> implements f {
    public final CashTopUpBarcodeFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CashTopUpBarcodeFlow(CashTopUpBarcodeFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: yb3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopUpBarcodeFlow f312176b;

            {
                this.f312176b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CashTopUpBarcodeFlow cashTopUpBarcodeFlow = this.f312176b;
                        phm.a aVar = (phm.a) ue0.e.j(cashTopUpBarcodeFlow.m2()).a().get(bb3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bb3.a.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).i;
                        CashTopUpBarcodeFlowContract$InputData cashTopUpBarcodeFlowContract$InputData = cashTopUpBarcodeFlow.K;
                        cashTopUpBarcodeFlowContract$InputData.getClass();
                        return new k(pVar, cashTopUpBarcodeFlow, cashTopUpBarcodeFlowContract$InputData);
                    case 1:
                        return (b) ((k) this.f312176b.M.getValue()).f204079h.get();
                    default:
                        CashTopUpBarcodeFlow cashTopUpBarcodeFlow2 = this.f312176b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cashTopUpBarcodeFlow2, (b) cashTopUpBarcodeFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: yb3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopUpBarcodeFlow f312176b;

            {
                this.f312176b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CashTopUpBarcodeFlow cashTopUpBarcodeFlow = this.f312176b;
                        phm.a aVar = (phm.a) ue0.e.j(cashTopUpBarcodeFlow.m2()).a().get(bb3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bb3.a.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).i;
                        CashTopUpBarcodeFlowContract$InputData cashTopUpBarcodeFlowContract$InputData = cashTopUpBarcodeFlow.K;
                        cashTopUpBarcodeFlowContract$InputData.getClass();
                        return new k(pVar, cashTopUpBarcodeFlow, cashTopUpBarcodeFlowContract$InputData);
                    case 1:
                        return (b) ((k) this.f312176b.M.getValue()).f204079h.get();
                    default:
                        CashTopUpBarcodeFlow cashTopUpBarcodeFlow2 = this.f312176b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cashTopUpBarcodeFlow2, (b) cashTopUpBarcodeFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: yb3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopUpBarcodeFlow f312176b;

            {
                this.f312176b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CashTopUpBarcodeFlow cashTopUpBarcodeFlow = this.f312176b;
                        phm.a aVar = (phm.a) ue0.e.j(cashTopUpBarcodeFlow.m2()).a().get(bb3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bb3.a.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).i;
                        CashTopUpBarcodeFlowContract$InputData cashTopUpBarcodeFlowContract$InputData = cashTopUpBarcodeFlow.K;
                        cashTopUpBarcodeFlowContract$InputData.getClass();
                        return new k(pVar, cashTopUpBarcodeFlow, cashTopUpBarcodeFlowContract$InputData);
                    case 1:
                        return (b) ((k) this.f312176b.M.getValue()).f204079h.get();
                    default:
                        CashTopUpBarcodeFlow cashTopUpBarcodeFlow2 = this.f312176b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cashTopUpBarcodeFlow2, (b) cashTopUpBarcodeFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (k) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (yb3.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}

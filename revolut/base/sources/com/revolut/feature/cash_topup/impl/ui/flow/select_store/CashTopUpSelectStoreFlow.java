package com.revolut.feature.cash_topup.impl.ui.flow.select_store;

import com.revolut.feature.cash_topup.impl.ui.flow.select_store.CashTopUpSelectStoreFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import i1d.b;
import ic3.c;
import ic3.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mb3.u;
import te0.w;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/select_store/CashTopUpSelectStoreFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lic3/e;", "Lyki/f;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashTopUpSelectStoreFlow extends ViewController<e> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CashTopUpSelectStoreFlow(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ic3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopUpSelectStoreFlow f160205b;

            {
                this.f160205b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((u) this.f160205b.N.getValue()).d.get();
                    default:
                        CashTopUpSelectStoreFlow cashTopUpSelectStoreFlow = this.f160205b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cashTopUpSelectStoreFlow, (b) cashTopUpSelectStoreFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ic3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopUpSelectStoreFlow f160205b;

            {
                this.f160205b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((u) this.f160205b.N.getValue()).d.get();
                    default:
                        CashTopUpSelectStoreFlow cashTopUpSelectStoreFlow = this.f160205b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cashTopUpSelectStoreFlow, (b) cashTopUpSelectStoreFlow.L.getValue());
                }
            }
        });
        this.N = w.y0(new b(this, inputData, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (u) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ic3.b) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}

package com.revolut.feature.cash_topup.impl.ui.flow.select;

import cb3.d;
import com.revolut.feature.cash_topup.impl.ui.flow.select.SelectCashTopUpFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import gc3.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mb3.p;
import mb3.z;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/select/SelectCashTopUpFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcb3/d;", "Lyki/f;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectCashTopUpFlow extends ViewController<d> implements f {
    public final c K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public SelectCashTopUpFlow(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: gc3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectCashTopUpFlow f142318b;

            {
                this.f142318b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((z) this.f142318b.O.getValue()).d.get();
                    case 1:
                        SelectCashTopUpFlow selectCashTopUpFlow = this.f142318b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, selectCashTopUpFlow, (b) selectCashTopUpFlow.M.getValue());
                    default:
                        SelectCashTopUpFlow selectCashTopUpFlow2 = this.f142318b;
                        phm.a aVar = (phm.a) e.j(selectCashTopUpFlow2.m2()).a().get(bb3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bb3.a.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).i;
                        c cVar = selectCashTopUpFlow2.K;
                        cVar.getClass();
                        return new z(pVar, cVar);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: gc3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectCashTopUpFlow f142318b;

            {
                this.f142318b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((z) this.f142318b.O.getValue()).d.get();
                    case 1:
                        SelectCashTopUpFlow selectCashTopUpFlow = this.f142318b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, selectCashTopUpFlow, (b) selectCashTopUpFlow.M.getValue());
                    default:
                        SelectCashTopUpFlow selectCashTopUpFlow2 = this.f142318b;
                        phm.a aVar = (phm.a) e.j(selectCashTopUpFlow2.m2()).a().get(bb3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bb3.a.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).i;
                        c cVar = selectCashTopUpFlow2.K;
                        cVar.getClass();
                        return new z(pVar, cVar);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: gc3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectCashTopUpFlow f142318b;

            {
                this.f142318b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((z) this.f142318b.O.getValue()).d.get();
                    case 1:
                        SelectCashTopUpFlow selectCashTopUpFlow = this.f142318b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, selectCashTopUpFlow, (b) selectCashTopUpFlow.M.getValue());
                    default:
                        SelectCashTopUpFlow selectCashTopUpFlow2 = this.f142318b;
                        phm.a aVar = (phm.a) e.j(selectCashTopUpFlow2.m2()).a().get(bb3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bb3.a.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).i;
                        c cVar = selectCashTopUpFlow2.K;
                        cVar.getClass();
                        return new z(pVar, cVar);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (z) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (z) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (gc3.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}

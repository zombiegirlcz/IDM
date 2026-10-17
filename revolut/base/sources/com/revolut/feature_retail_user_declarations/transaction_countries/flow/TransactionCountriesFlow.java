package com.revolut.feature_retail_user_declarations.transaction_countries.flow;

import com.revolut.feature_retail_user_declarations.transaction_countries.TransactionCountriesInputData;
import com.revolut.feature_retail_user_declarations.transaction_countries.flow.TransactionCountriesFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oai.g0;
import oai.i0;
import pci.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/transaction_countries/flow/TransactionCountriesFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpci/b;", "Lyki/f;", "Lkji/f;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionCountriesFlow extends ViewController<b> implements f, kji.f {
    public final TransactionCountriesInputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public TransactionCountriesFlow(TransactionCountriesInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: uci.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionCountriesFlow f279038b;

            {
                this.f279038b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TransactionCountriesFlow transactionCountriesFlow = this.f279038b;
                        phm.a aVar = (phm.a) e.j(transactionCountriesFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        TransactionCountriesInputData transactionCountriesInputData = transactionCountriesFlow.K;
                        transactionCountriesInputData.getClass();
                        return new g0(i0Var, transactionCountriesInputData);
                    case 1:
                        return (b) ((g0) this.f279038b.L.getValue()).d.get();
                    default:
                        TransactionCountriesFlow transactionCountriesFlow2 = this.f279038b;
                        return czi.c.d(0, 6, null, transactionCountriesFlow2, (b) transactionCountriesFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: uci.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionCountriesFlow f279038b;

            {
                this.f279038b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TransactionCountriesFlow transactionCountriesFlow = this.f279038b;
                        phm.a aVar = (phm.a) e.j(transactionCountriesFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        TransactionCountriesInputData transactionCountriesInputData = transactionCountriesFlow.K;
                        transactionCountriesInputData.getClass();
                        return new g0(i0Var, transactionCountriesInputData);
                    case 1:
                        return (b) ((g0) this.f279038b.L.getValue()).d.get();
                    default:
                        TransactionCountriesFlow transactionCountriesFlow2 = this.f279038b;
                        return czi.c.d(0, 6, null, transactionCountriesFlow2, (b) transactionCountriesFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: uci.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionCountriesFlow f279038b;

            {
                this.f279038b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TransactionCountriesFlow transactionCountriesFlow = this.f279038b;
                        phm.a aVar = (phm.a) e.j(transactionCountriesFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        TransactionCountriesInputData transactionCountriesInputData = transactionCountriesFlow.K;
                        transactionCountriesInputData.getClass();
                        return new g0(i0Var, transactionCountriesInputData);
                    case 1:
                        return (b) ((g0) this.f279038b.L.getValue()).d.get();
                    default:
                        TransactionCountriesFlow transactionCountriesFlow2 = this.f279038b;
                        return czi.c.d(0, 6, null, transactionCountriesFlow2, (b) transactionCountriesFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (g0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (uci.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}

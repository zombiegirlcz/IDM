package uyh;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.exchange.d f284392b;

    public /* synthetic */ q(com.revolut.feature_crypto_order_flow.impl.exchange.d dVar, int i) {
        this.f284391a = i;
        this.f284392b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        kyh.g gVar;
        switch (this.f284391a) {
            case 0:
                CryptoOrderDraft draft = (CryptoOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft, "draft");
                dj0.d dVar = new dj0.d(draft.f96694j, draft.f96689a.f96683a);
                com.revolut.feature_crypto_order_flow.impl.exchange.d dVar2 = this.f284392b;
                a1 a1Var = dVar2.f96748s;
                dVar2.u.getClass();
                return a1Var.n(draft, l4i.a.e(dVar));
            case 1:
                iua.b output = (iua.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                com.revolut.feature_crypto_order_flow.impl.exchange.d dVar3 = this.f284392b;
                dVar3.n2(new uvf.b(output, dVar3, null, 6), new whi.b(6));
                return Unit.f186387a;
            case 2:
                s0i.c output2 = (s0i.c) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                Continuation continuation = null;
                Double dValueOf = output2.f258959a != null ? Double.valueOf(r0.floatValue()) : null;
                Double dValueOf2 = output2.f258960b != null ? Double.valueOf(r8.floatValue()) : null;
                com.revolut.feature_crypto_order_flow.impl.exchange.d dVar4 = this.f284392b;
                dVar4.n2(new uvf.b(dVar4, dValueOf, dValueOf2, continuation, 7), new whi.b(6));
                return Unit.f186387a;
            case 3:
                h1j.b output3 = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                com.revolut.feature_crypto_order_flow.impl.exchange.d dVar5 = this.f284392b;
                dVar5.n2(new l0(dVar5, output3, null), new whi.b(6));
                return Unit.f186387a;
            case 4:
                h1j.b output4 = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                com.revolut.feature_crypto_order_flow.impl.exchange.d dVar6 = this.f284392b;
                dVar6.n2(new l0(dVar6, output4, null), new whi.b(6));
                return Unit.f186387a;
            case 5:
                CryptoOrderDraft cryptoOrderDraft = (CryptoOrderDraft) obj2;
                int i = m0.f284382a[cryptoOrderDraft.d.ordinal()];
                if (i == 1) {
                    gVar = kyh.g.BOTTOM;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar = kyh.g.TOP;
                }
                return this.f284392b.f96748s.l(cryptoOrderDraft, gVar, true);
            default:
                this.f284392b.C2(new m(new OrderSummaryScreenContract$InputData(com.revolut.feature_crypto_order_flow.impl.exchange.d.S2((CryptoOrderDraft) obj2))));
                return Unit.f186387a;
        }
    }
}

package x36;

import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiExchangeOrderDraft;
import d9.t0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f302671b;

    public /* synthetic */ m(y yVar, int i) {
        this.f302670a = i;
        this.f302671b = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f302670a) {
            case 0:
                a state = (a) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                DeFiExchangeOrderDraft deFiExchangeOrderDraft = state.f302659a;
                if (deFiExchangeOrderDraft != null) {
                    return this.f302671b.L2(deFiExchangeOrderDraft);
                }
                return null;
            case 1:
                DeFiExchangeOrderDraft deFiExchangeOrderDraft2 = (DeFiExchangeOrderDraft) obj2;
                b46.c cVar = this.f302671b.f302690r;
                kyh.g gVar = kyh.g.BOTTOM;
                cVar.getClass();
                return b46.c.e(b46.c.d(deFiExchangeOrderDraft2, gVar), t0.e(deFiExchangeOrderDraft2.f), true);
            default:
                DeFiExchangeOrderDraft deFiExchangeOrderDraft3 = (DeFiExchangeOrderDraft) obj2;
                b46.c cVar2 = this.f302671b.f302690r;
                kyh.g gVar2 = kyh.g.TOP;
                cVar2.getClass();
                return b46.c.f(b46.c.d(deFiExchangeOrderDraft3, gVar2), t0.e(deFiExchangeOrderDraft3.f), true);
        }
    }
}

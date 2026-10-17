package x36;

import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiExchangeOrderDraft;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiExchangeOrderDraft f302659a;

    public a() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f302659a, ((a) obj2).f302659a);
    }

    public final int hashCode() {
        DeFiExchangeOrderDraft deFiExchangeOrderDraft = this.f302659a;
        if (deFiExchangeOrderDraft == null) {
            return 0;
        }
        return deFiExchangeOrderDraft.hashCode();
    }

    public a(DeFiExchangeOrderDraft deFiExchangeOrderDraft) {
        this.f302659a = deFiExchangeOrderDraft;
    }
}

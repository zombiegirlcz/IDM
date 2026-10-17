package t73;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d1 extends com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tof.a3 f268438a;

    public d1(tof.a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f268438a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d1) && Intrinsics.f(this.f268438a, ((d1) obj2).f268438a);
    }

    public final int hashCode() {
        return this.f268438a.hashCode();
    }
}

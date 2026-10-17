package zbg;

import aii.r;
import com.revolut.feature.travel.hotels.impl.model.checkout.RevolutCardWithBalanceCheck;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutCardWithBalanceCheck f320885a;

    public c(RevolutCardWithBalanceCheck card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f320885a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f320885a, ((c) obj2).f320885a);
    }

    public final int hashCode() {
        return this.f320885a.hashCode();
    }
}

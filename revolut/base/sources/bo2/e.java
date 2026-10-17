package bo2;

import aii.r;
import com.revolut.feature.bank_account_switching.impl.domain.CardDigits;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardDigits f17275a;

    public e(CardDigits cardDigits) {
        this.f17275a = cardDigits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f17275a, ((e) obj2).f17275a);
    }

    public final int hashCode() {
        CardDigits cardDigits = this.f17275a;
        if (cardDigits == null) {
            return 0;
        }
        return cardDigits.hashCode();
    }
}

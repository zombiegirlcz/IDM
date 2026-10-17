package t36;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f267663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f267664b;

    public e(String currency, BigDecimal amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f267663a = amount;
        this.f267664b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f267663a, eVar.f267663a) && Intrinsics.f(this.f267664b, eVar.f267664b);
    }

    public final int hashCode() {
        return this.f267664b.hashCode() + (this.f267663a.hashCode() * 31);
    }
}

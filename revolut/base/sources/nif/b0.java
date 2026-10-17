package nif;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f215714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215715b;

    public b0(String currency, BigDecimal amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f215714a = amount;
        this.f215715b = currency;
    }

    public final BigDecimal a() {
        return this.f215714a;
    }

    public final String b() {
        return this.f215715b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f215714a, b0Var.f215714a) && Intrinsics.f(this.f215715b, b0Var.f215715b);
    }

    public final int hashCode() {
        return this.f215715b.hashCode() + (this.f215714a.hashCode() * 31);
    }
}

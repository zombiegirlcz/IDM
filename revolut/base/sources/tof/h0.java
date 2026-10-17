package tof;

import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f272777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272778b;

    public h0(String currency, BigDecimal amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f272777a = amount;
        this.f272778b = currency;
    }

    public static h0 a(h0 h0Var, BigDecimal amount) {
        String currency = h0Var.f272778b;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new h0(currency, amount);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f272777a, h0Var.f272777a) && Intrinsics.f(this.f272778b, h0Var.f272778b);
    }

    public final int hashCode() {
        return this.f272778b.hashCode() + (this.f272777a.hashCode() * 31);
    }
}

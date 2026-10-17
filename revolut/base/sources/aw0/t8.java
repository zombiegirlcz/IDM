package aw0;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f10545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10546b;

    public t8(String str, BigDecimal amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f10545a = amount;
        this.f10546b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj2;
        return Intrinsics.f(this.f10545a, t8Var.f10545a) && Intrinsics.f(this.f10546b, t8Var.f10546b);
    }

    public final int hashCode() {
        int iHashCode = this.f10545a.hashCode() * 31;
        String str = this.f10546b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

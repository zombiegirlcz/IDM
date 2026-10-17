package dfl;

import ip0.v7;
import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f114406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f114407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f114408c;

    public k0(dj0.d baseCurrencyValue, dj0.d instrumentCurrencyValue, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(baseCurrencyValue, "baseCurrencyValue");
        Intrinsics.checkNotNullParameter(instrumentCurrencyValue, "instrumentCurrencyValue");
        this.f114406a = baseCurrencyValue;
        this.f114407b = instrumentCurrencyValue;
        this.f114408c = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f114406a, k0Var.f114406a) && Intrinsics.f(this.f114407b, k0Var.f114407b) && Intrinsics.f(this.f114408c, k0Var.f114408c);
    }

    public final int hashCode() {
        int iC = v7.c(this.f114406a.hashCode() * 31, 31, this.f114407b);
        BigDecimal bigDecimal = this.f114408c;
        return iC + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }
}

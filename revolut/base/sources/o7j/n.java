package o7j;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f222869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f222870b;

    public n(List warnings, BigDecimal validatedValue) {
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        Intrinsics.checkNotNullParameter(validatedValue, "validatedValue");
        this.f222869a = warnings;
        this.f222870b = validatedValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f222869a, nVar.f222869a) && Intrinsics.f(this.f222870b, nVar.f222870b);
    }

    public final int hashCode() {
        return this.f222870b.hashCode() + (this.f222869a.hashCode() * 31);
    }
}

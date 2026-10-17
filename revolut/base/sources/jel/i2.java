package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f173477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f173478b;

    public i2(BigDecimal start, BigDecimal end2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.f173477a = start;
        this.f173478b = end2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj2;
        return Intrinsics.f(this.f173477a, i2Var.f173477a) && Intrinsics.f(this.f173478b, i2Var.f173478b);
    }

    public final int hashCode() {
        return this.f173478b.hashCode() + (this.f173477a.hashCode() * 31);
    }
}

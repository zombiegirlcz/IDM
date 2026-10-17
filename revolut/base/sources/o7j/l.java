package o7j;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f222867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f222868b;

    public l(List reasons, BigDecimal validatedValue) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(validatedValue, "validatedValue");
        this.f222867a = reasons;
        this.f222868b = validatedValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f222867a, lVar.f222867a) && Intrinsics.f(this.f222868b, lVar.f222868b);
    }

    public final int hashCode() {
        return this.f222868b.hashCode() + (this.f222867a.hashCode() * 31);
    }
}

package vel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f288360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f288361b;

    public j(dj0.d absolute, BigDecimal relativePercentage) {
        Intrinsics.checkNotNullParameter(absolute, "absolute");
        Intrinsics.checkNotNullParameter(relativePercentage, "relativePercentage");
        this.f288360a = absolute;
        this.f288361b = relativePercentage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f288360a, jVar.f288360a) && Intrinsics.f(this.f288361b, jVar.f288361b);
    }

    public final int hashCode() {
        return this.f288361b.hashCode() + (this.f288360a.hashCode() * 31);
    }
}

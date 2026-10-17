package i5i;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f158842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f158843b;

    public d(dj0.d dVar, BigDecimal lotQuantity) {
        Intrinsics.checkNotNullParameter(lotQuantity, "lotQuantity");
        this.f158842a = dVar;
        this.f158843b = lotQuantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f158842a, dVar.f158842a) && Intrinsics.f(this.f158843b, dVar.f158843b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f158842a;
        return this.f158843b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }
}

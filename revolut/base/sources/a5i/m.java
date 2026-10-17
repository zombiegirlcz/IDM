package a5i;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f1426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f1427b;

    public m(dj0.d dVar, BigDecimal lotQuantity) {
        Intrinsics.checkNotNullParameter(lotQuantity, "lotQuantity");
        this.f1426a = dVar;
        this.f1427b = lotQuantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f1426a, mVar.f1426a) && Intrinsics.f(this.f1427b, mVar.f1427b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f1426a;
        return this.f1427b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }
}

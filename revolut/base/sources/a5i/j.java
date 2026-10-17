package a5i;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f1422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f1423b;

    public j(dj0.d dVar, BigDecimal lotQuantity) {
        Intrinsics.checkNotNullParameter(lotQuantity, "lotQuantity");
        this.f1422a = dVar;
        this.f1423b = lotQuantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f1422a, jVar.f1422a) && Intrinsics.f(this.f1423b, jVar.f1423b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f1422a;
        return this.f1423b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }
}

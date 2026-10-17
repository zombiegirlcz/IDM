package cd3;

import cd3.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends b.AbstractC0145b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc3.d f23167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23168b;

    public d(uc3.d cashbackSourceType, String cashbackBoxId) {
        Intrinsics.checkNotNullParameter(cashbackSourceType, "cashbackSourceType");
        Intrinsics.checkNotNullParameter(cashbackBoxId, "cashbackBoxId");
        this.f23167a = cashbackSourceType;
        this.f23168b = cashbackBoxId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f23167a == dVar.f23167a && Intrinsics.f(this.f23168b, dVar.f23168b);
    }

    public final int hashCode() {
        return this.f23168b.hashCode() + (this.f23167a.hashCode() * 31);
    }
}

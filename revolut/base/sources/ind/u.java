package ind;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ejb.j f162828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fnd.a f162829c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ejb.j savingsOperationType, fnd.a aVar) {
        super(savingsOperationType.name());
        Intrinsics.checkNotNullParameter(savingsOperationType, "savingsOperationType");
        this.f162828b = savingsOperationType;
        this.f162829c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f162828b == uVar.f162828b && this.f162829c == uVar.f162829c;
    }

    public final int hashCode() {
        int iHashCode = this.f162828b.hashCode() * 31;
        fnd.a aVar = this.f162829c;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}

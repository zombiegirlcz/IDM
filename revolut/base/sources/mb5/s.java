package mb5;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f204155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f204156b;

    public s(u paymentType, r rVar) {
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        this.f204155a = paymentType;
        this.f204156b = rVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f204155a == sVar.f204155a && Intrinsics.f(this.f204156b, sVar.f204156b);
    }

    public final int hashCode() {
        int iHashCode = this.f204155a.hashCode() * 31;
        r rVar = this.f204156b;
        return iHashCode + (rVar == null ? 0 : rVar.hashCode());
    }
}

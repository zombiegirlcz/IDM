package sm6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f264370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f264371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ve6.a f264372c;

    public k(dj0.d amount, Boolean bool, ve6.a aVar) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f264370a = amount;
        this.f264371b = bool;
        this.f264372c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f264370a, kVar.f264370a) && Intrinsics.f(this.f264371b, kVar.f264371b) && Intrinsics.f(this.f264372c, kVar.f264372c);
    }

    public final int hashCode() {
        int iHashCode = this.f264370a.hashCode() * 31;
        Boolean bool = this.f264371b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ve6.a aVar = this.f264372c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}

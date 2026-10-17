package ap1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8055b;

    public a(String counterpartyId, String str) {
        Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
        this.f8054a = counterpartyId;
        this.f8055b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f8054a, aVar.f8054a) && Intrinsics.f(this.f8055b, aVar.f8055b);
    }

    public final int hashCode() {
        int iHashCode = this.f8054a.hashCode() * 31;
        String str = this.f8055b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

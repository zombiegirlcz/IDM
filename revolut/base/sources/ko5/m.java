package ko5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186244b;

    public m(String quoteToken, String counterpartyId) {
        Intrinsics.checkNotNullParameter(quoteToken, "quoteToken");
        Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
        this.f186243a = quoteToken;
        this.f186244b = counterpartyId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f186243a, mVar.f186243a) && Intrinsics.f(this.f186244b, mVar.f186244b);
    }

    public final int hashCode() {
        return this.f186244b.hashCode() + (this.f186243a.hashCode() * 31);
    }
}

package zc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p3 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f321106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f321107c;

    public p3(Long l2, String itemId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f321105a = itemId;
        this.f321106b = l2;
        this.f321107c = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj2;
        return Intrinsics.f(this.f321105a, p3Var.f321105a) && Intrinsics.f(this.f321106b, p3Var.f321106b) && Intrinsics.f(this.f321107c, p3Var.f321107c);
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321105a;
    }

    public final int hashCode() {
        int iHashCode = this.f321105a.hashCode() * 31;
        Long l2 = this.f321106b;
        return this.f321107c.hashCode() + ((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31);
    }
}

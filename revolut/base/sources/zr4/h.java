package zr4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f324566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f324567b;

    public h(dj0.d overdueAmount, String creditCardPocketId) {
        Intrinsics.checkNotNullParameter(overdueAmount, "overdueAmount");
        Intrinsics.checkNotNullParameter(creditCardPocketId, "creditCardPocketId");
        this.f324566a = overdueAmount;
        this.f324567b = creditCardPocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f324566a, hVar.f324566a) && Intrinsics.f(this.f324567b, hVar.f324567b);
    }

    public final int hashCode() {
        return this.f324567b.hashCode() + (this.f324566a.hashCode() * 31);
    }
}

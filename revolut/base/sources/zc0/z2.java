package zc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z2 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321181b;

    public z2(String itemId, String cardId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f321180a = itemId;
        this.f321181b = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj2;
        return Intrinsics.f(this.f321180a, z2Var.f321180a) && Intrinsics.f(this.f321181b, z2Var.f321181b);
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321180a;
    }

    public final int hashCode() {
        return this.f321181b.hashCode() + (this.f321180a.hashCode() * 31);
    }
}

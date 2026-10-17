package z8d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320072a;

    public d(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f320072a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f320072a, ((d) obj2).f320072a);
    }

    public final int hashCode() {
        return this.f320072a.hashCode();
    }
}

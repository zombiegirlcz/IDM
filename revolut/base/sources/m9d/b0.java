package m9d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203687a;

    public b0(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f203687a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f203687a, ((b0) obj2).f203687a);
    }

    public final int hashCode() {
        return this.f203687a.hashCode();
    }
}

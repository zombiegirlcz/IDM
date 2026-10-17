package q03;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241084a;

    public j0(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f241084a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j0) && Intrinsics.f(this.f241084a, ((j0) obj2).f241084a);
    }

    public final int hashCode() {
        return this.f241084a.hashCode();
    }
}

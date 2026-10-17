package rm4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255203a;

    public b(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f255203a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f255203a, ((b) obj2).f255203a);
    }

    public final int hashCode() {
        return this.f255203a.hashCode();
    }
}

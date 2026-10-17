package l43;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192051a;

    public d(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f192051a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f192051a, ((d) obj2).f192051a);
    }

    public final int hashCode() {
        return this.f192051a.hashCode();
    }
}

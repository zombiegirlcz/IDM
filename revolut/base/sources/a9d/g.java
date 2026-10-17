package a9d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2408a;

    public g(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f2408a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f2408a, ((g) obj2).f2408a);
    }

    public final int hashCode() {
        return this.f2408a.hashCode();
    }
}

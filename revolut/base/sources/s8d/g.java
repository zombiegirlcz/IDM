package s8d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260975a;

    public g(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f260975a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f260975a, ((g) obj2).f260975a);
    }

    public final int hashCode() {
        return this.f260975a.hashCode();
    }
}

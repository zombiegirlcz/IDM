package bi9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15446a;

    public a(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f15446a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f15446a, ((a) obj2).f15446a);
    }

    public final int hashCode() {
        return this.f15446a.hashCode();
    }
}

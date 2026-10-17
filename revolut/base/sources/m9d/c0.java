package m9d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203689a;

    public c0(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f203689a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && Intrinsics.f(this.f203689a, ((c0) obj2).f203689a);
    }

    public final int hashCode() {
        return this.f203689a.hashCode();
    }
}

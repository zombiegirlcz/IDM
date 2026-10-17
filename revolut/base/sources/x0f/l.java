package x0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301592a;

    public l(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f301592a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f301592a, ((l) obj2).f301592a);
    }

    public final int hashCode() {
        return this.f301592a.hashCode();
    }
}

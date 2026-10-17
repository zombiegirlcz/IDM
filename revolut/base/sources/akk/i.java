package akk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5977a;

    public i(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f5977a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f5977a, ((i) obj2).f5977a);
    }

    public final int hashCode() {
        return this.f5977a.hashCode();
    }
}

package mv2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f209096b;

    public d(String cardId, boolean z) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f209095a = cardId;
        this.f209096b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f209095a, dVar.f209095a) && this.f209096b == dVar.f209096b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f209096b) + (this.f209095a.hashCode() * 31);
    }
}

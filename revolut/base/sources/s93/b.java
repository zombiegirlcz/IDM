package s93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f261101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aa3.a f261102b;

    public b(String cardId, aa3.a contactlessCounter) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(contactlessCounter, "contactlessCounter");
        this.f261101a = cardId;
        this.f261102b = contactlessCounter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f261101a, bVar.f261101a) && Intrinsics.f(this.f261102b, bVar.f261102b);
    }

    public final int hashCode() {
        return this.f261102b.hashCode() + (this.f261101a.hashCode() * 31);
    }
}

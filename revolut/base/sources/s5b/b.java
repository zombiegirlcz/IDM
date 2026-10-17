package s5b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260055a;

    public b(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f260055a = cardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f260055a, ((b) obj2).f260055a);
    }

    public final int hashCode() {
        return this.f260055a.hashCode();
    }
}

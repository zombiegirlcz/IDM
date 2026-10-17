package w72;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f295458b;

    public d(String cardId, boolean z) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f295457a = cardId;
        this.f295458b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f295457a, dVar.f295457a) && this.f295458b == dVar.f295458b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f295458b) + (this.f295457a.hashCode() * 31);
    }
}

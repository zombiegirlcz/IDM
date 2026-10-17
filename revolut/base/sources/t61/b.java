package t61;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f268129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f268130b;

    public b(g card, c verificationResult) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(verificationResult, "verificationResult");
        this.f268129a = card;
        this.f268130b = verificationResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f268129a, bVar.f268129a) && Intrinsics.f(this.f268130b, bVar.f268130b);
    }

    public final int hashCode() {
        return this.f268130b.hashCode() + (this.f268129a.hashCode() * 31);
    }
}

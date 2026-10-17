package re7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f253535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f253536b;

    public g(j card, f status) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f253535a = card;
        this.f253536b = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f253535a, gVar.f253535a) && Intrinsics.f(this.f253536b, gVar.f253536b);
    }

    public final int hashCode() {
        return this.f253536b.hashCode() + (this.f253535a.hashCode() * 31);
    }
}

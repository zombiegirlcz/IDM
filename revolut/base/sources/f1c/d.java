package f1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f131237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f131238c;

    public d(String cardId, int i, boolean z) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f131236a = cardId;
        this.f131237b = i;
        this.f131238c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f131236a, dVar.f131236a) && this.f131237b == dVar.f131237b && this.f131238c == dVar.f131238c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131238c) + j6.a.b(this.f131237b, this.f131236a.hashCode() * 31, 31);
    }
}

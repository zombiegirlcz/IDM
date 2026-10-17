package n7g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f213091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f213092c;

    public d(String id10, String orderChangeReference, String language) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(orderChangeReference, "orderChangeReference");
        Intrinsics.checkNotNullParameter(language, "language");
        this.f213090a = id10;
        this.f213091b = orderChangeReference;
        this.f213092c = language;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f213090a, dVar.f213090a) && Intrinsics.f(this.f213091b, dVar.f213091b) && Intrinsics.f(this.f213092c, dVar.f213092c);
    }

    public final int hashCode() {
        return this.f213092c.hashCode() + p.a.c(this.f213090a.hashCode() * 31, 31, this.f213091b);
    }
}

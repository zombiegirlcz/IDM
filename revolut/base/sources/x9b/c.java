package x9b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f303651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f303652b;

    public c(String id10, String country) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f303651a = id10;
        this.f303652b = country;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f303651a, cVar.f303651a) && Intrinsics.f(this.f303652b, cVar.f303652b);
    }

    public final int hashCode() {
        return this.f303652b.hashCode() + (this.f303651a.hashCode() * 31);
    }
}

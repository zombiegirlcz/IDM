package u2f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f276636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276637c;

    public g(String id10, String description, j product) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f276635a = id10;
        this.f276636b = product;
        this.f276637c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f276635a, gVar.f276635a) && this.f276636b == gVar.f276636b && Intrinsics.f(this.f276637c, gVar.f276637c);
    }

    public final int hashCode() {
        return this.f276637c.hashCode() + ((this.f276636b.hashCode() + (this.f276635a.hashCode() * 31)) * 31);
    }
}

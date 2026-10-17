package y19;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f310343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f310344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f310345c;

    public g(i type, dj0.d dVar, List products) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(products, "products");
        this.f310343a = type;
        this.f310344b = dVar;
        this.f310345c = products;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f310343a == gVar.f310343a && Intrinsics.f(this.f310344b, gVar.f310344b) && Intrinsics.f(this.f310345c, gVar.f310345c);
    }

    public final int hashCode() {
        int iHashCode = this.f310343a.hashCode() * 31;
        dj0.d dVar = this.f310344b;
        return this.f310345c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }
}

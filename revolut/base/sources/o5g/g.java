package o5g;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f222432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f222433b;

    public g(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f222432a = items;
        this.f222433b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f222432a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f222432a, gVar.f222432a) && this.f222433b == gVar.f222433b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f222433b) + (this.f222432a.hashCode() * 31);
    }
}

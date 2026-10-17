package ci1;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24346b;

    public g(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f24345a = items;
        this.f24346b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f24345a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f24345a, gVar.f24345a) && this.f24346b == gVar.f24346b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24346b) + (this.f24345a.hashCode() * 31);
    }
}

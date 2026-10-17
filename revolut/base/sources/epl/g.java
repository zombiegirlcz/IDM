package epl;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f128209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f128210b;

    public g(f header, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f128209a = header;
        this.f128210b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f128210b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f128209a, gVar.f128209a) && Intrinsics.f(this.f128210b, gVar.f128210b);
    }

    public final int hashCode() {
        return this.f128210b.hashCode() + (this.f128209a.hashCode() * 31);
    }
}

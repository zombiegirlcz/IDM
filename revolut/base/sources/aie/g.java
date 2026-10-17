package aie;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f5240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5241b;

    public g(f scrollTarget, ArrayList items) {
        Intrinsics.checkNotNullParameter(scrollTarget, "scrollTarget");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f5240a = scrollTarget;
        this.f5241b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f5241b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f5240a.equals(gVar.f5240a) && this.f5241b.equals(gVar.f5241b);
    }

    public final int hashCode() {
        return this.f5241b.hashCode() + (this.f5240a.hashCode() * 31);
    }
}

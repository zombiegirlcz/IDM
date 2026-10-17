package y2e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f310641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f310642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f310643c;

    public h(List items, List quickFilters, v scrollToTarget) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(quickFilters, "quickFilters");
        Intrinsics.checkNotNullParameter(scrollToTarget, "scrollToTarget");
        this.f310641a = items;
        this.f310642b = quickFilters;
        this.f310643c = scrollToTarget;
    }

    @Override // cli.p
    public final List c() {
        return this.f310641a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f310641a, hVar.f310641a) && Intrinsics.f(this.f310642b, hVar.f310642b) && Intrinsics.f(this.f310643c, hVar.f310643c);
    }

    public final int hashCode() {
        return this.f310643c.hashCode() + p.a.d(this.f310641a.hashCode() * 31, 31, this.f310642b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h() {
        f0 f0Var = f0.f322471a;
        this(f0Var, f0Var, mx0.t.f210002a);
    }
}

package as6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f8797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8798b;

    public b(a groupType, List rules) {
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.f8797a = groupType;
        this.f8798b = rules;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f8797a == bVar.f8797a && Intrinsics.f(this.f8798b, bVar.f8798b);
    }

    public final int hashCode() {
        return this.f8798b.hashCode() + (this.f8797a.hashCode() * 31);
    }
}

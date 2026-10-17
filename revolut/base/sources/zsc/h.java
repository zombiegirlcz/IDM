package zsc;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f324874a;

    public h(List values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f324874a = values;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f324874a, ((h) obj2).f324874a);
    }

    public final int hashCode() {
        return this.f324874a.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Pair... rules) {
        this(kotlin.collections.d.v0(rules));
        Intrinsics.checkNotNullParameter(rules, "rules");
    }
}

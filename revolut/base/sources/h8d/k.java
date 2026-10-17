package h8d;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f149995a;

    public k(List results) {
        Intrinsics.checkNotNullParameter(results, "results");
        this.f149995a = results;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f149995a, ((k) obj2).f149995a);
    }

    public final int hashCode() {
        return this.f149995a.hashCode();
    }
}

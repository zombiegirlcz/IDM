package w85;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f295586a;

    public f(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f295586a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f295586a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f295586a, ((f) obj2).f295586a);
    }

    public final int hashCode() {
        return this.f295586a.hashCode();
    }
}

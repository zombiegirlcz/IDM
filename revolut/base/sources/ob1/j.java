package ob1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f223855a;

    public j(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f223855a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f223855a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f223855a, ((j) obj2).f223855a);
    }

    public final int hashCode() {
        return this.f223855a.hashCode();
    }
}

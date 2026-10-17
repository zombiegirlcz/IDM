package ob1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f223854a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f223854a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f223854a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f223854a, ((i) obj2).f223854a);
    }

    public final int hashCode() {
        return this.f223854a.hashCode();
    }
}

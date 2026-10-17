package q85;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f242987a;

    public e(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f242987a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f242987a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f242987a, ((e) obj2).f242987a);
    }

    public final int hashCode() {
        return this.f242987a.hashCode();
    }
}

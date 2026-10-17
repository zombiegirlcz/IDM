package k3g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f180725a;

    public m(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f180725a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f180725a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f180725a, ((m) obj2).f180725a);
    }

    public final int hashCode() {
        return this.f180725a.hashCode();
    }
}

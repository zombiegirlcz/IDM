package gc1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f142305a;

    public m(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f142305a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f142305a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f142305a, ((m) obj2).f142305a);
    }

    public final int hashCode() {
        return this.f142305a.hashCode();
    }
}

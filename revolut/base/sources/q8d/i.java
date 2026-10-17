package q8d;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f243059a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f243059a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f243059a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f243059a, ((i) obj2).f243059a);
    }

    public final int hashCode() {
        return this.f243059a.hashCode();
    }
}

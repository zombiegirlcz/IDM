package gs2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f146291a;

    public p(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f146291a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f146291a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f146291a, ((p) obj2).f146291a);
    }

    public final int hashCode() {
        return this.f146291a.hashCode();
    }
}

package vyi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f293339a;

    public l(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f293339a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f293339a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f293339a, ((l) obj2).f293339a);
    }

    public final int hashCode() {
        return this.f293339a.hashCode();
    }
}

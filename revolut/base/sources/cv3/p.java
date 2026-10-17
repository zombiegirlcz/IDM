package cv3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f109263a;

    public p(x topItem) {
        Intrinsics.checkNotNullParameter(topItem, "topItem");
        this.f109263a = topItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f109263a, ((p) obj2).f109263a);
    }

    public final int hashCode() {
        return this.f109263a.hashCode();
    }
}

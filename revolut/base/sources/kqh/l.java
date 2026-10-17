package kqh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.f f188415a;

    public l(zel.f group) {
        Intrinsics.checkNotNullParameter(group, "group");
        this.f188415a = group;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f188415a == ((l) obj2).f188415a;
    }

    public final int hashCode() {
        return this.f188415a.hashCode();
    }
}

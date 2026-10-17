package ry5;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f258230a;

    public j(Pair item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f258230a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f258230a, ((j) obj2).f258230a);
    }

    public final int hashCode() {
        return this.f258230a.hashCode();
    }
}

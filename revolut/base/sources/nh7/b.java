package nh7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f215378a;

    public b(List collectionKeys) {
        Intrinsics.checkNotNullParameter(collectionKeys, "collectionKeys");
        this.f215378a = collectionKeys;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f215378a, ((b) obj2).f215378a);
    }

    public final int hashCode() {
        return this.f215378a.hashCode();
    }
}

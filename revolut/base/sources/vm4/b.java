package vm4;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f290531a;

    public b(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f290531a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f290531a, ((b) obj2).f290531a);
    }

    public final int hashCode() {
        return this.f290531a.hashCode();
    }
}

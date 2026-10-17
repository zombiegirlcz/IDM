package bih;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15502a;

    public j(List allItems) {
        Intrinsics.checkNotNullParameter(allItems, "allItems");
        this.f15502a = allItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f15502a, ((j) obj2).f15502a);
    }

    public final int hashCode() {
        return this.f15502a.hashCode();
    }
}

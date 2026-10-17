package ds4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f117218a;

    public r(List menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f117218a = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f117218a, ((r) obj2).f117218a);
    }

    public final int hashCode() {
        return this.f117218a.hashCode();
    }
}

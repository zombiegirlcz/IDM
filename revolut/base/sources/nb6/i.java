package nb6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f213995a;

    public i(List menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f213995a = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f213995a, ((i) obj2).f213995a);
    }

    public final int hashCode() {
        return this.f213995a.hashCode();
    }
}

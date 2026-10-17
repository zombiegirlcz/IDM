package pwb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f240383a;

    public i(List menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f240383a = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f240383a, ((i) obj2).f240383a);
    }

    public final int hashCode() {
        return this.f240383a.hashCode();
    }
}

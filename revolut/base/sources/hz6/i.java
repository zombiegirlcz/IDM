package hz6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f157045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f157046b;

    public i(boolean z, List menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f157045a = z;
        this.f157046b = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f157045a == iVar.f157045a && Intrinsics.f(this.f157046b, iVar.f157046b);
    }

    public final int hashCode() {
        return this.f157046b.hashCode() + (Boolean.hashCode(this.f157045a) * 31);
    }
}

package i27;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f157877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f157878b;

    public h(List menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f157877a = menuItems;
        this.f157878b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f157877a, hVar.f157877a) && this.f157878b == hVar.f157878b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f157878b) + (this.f157877a.hashCode() * 31);
    }
}

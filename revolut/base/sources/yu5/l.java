package yu5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f316892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f316893b;

    public l(ArrayList items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f316892a = items;
        this.f316893b = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f316892a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f316892a.equals(lVar.f316892a) && Intrinsics.f(this.f316893b, lVar.f316893b);
    }

    public final int hashCode() {
        return this.f316893b.hashCode() + (this.f316892a.hashCode() * 31);
    }
}

package wn7;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f298719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f298720b;

    public j(List items, f0 menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f298719a = items;
        this.f298720b = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f298719a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f298719a, jVar.f298719a) && Intrinsics.f(this.f298720b, jVar.f298720b);
    }

    public final int hashCode() {
        return this.f298720b.hashCode() + (this.f298719a.hashCode() * 31);
    }
}

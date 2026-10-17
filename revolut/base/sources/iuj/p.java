package iuj;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tx0.b1;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f168639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f168640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f168641c;

    public p(ArrayList pages, b1 pageAutoScroll, List menuItems) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(pageAutoScroll, "pageAutoScroll");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f168639a = pages;
        this.f168640b = pageAutoScroll;
        this.f168641c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f168639a.equals(pVar.f168639a) && this.f168640b == pVar.f168640b && Intrinsics.f(this.f168641c, pVar.f168641c);
    }

    public final int hashCode() {
        return this.f168641c.hashCode() + ((this.f168640b.hashCode() + (this.f168639a.hashCode() * 31)) * 31);
    }
}

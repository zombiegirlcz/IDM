package zqc;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f324454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f324455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f324456c;

    public i(List items, List filters, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f324454a = items;
        this.f324455b = filters;
        this.f324456c = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f324454a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f324454a, iVar.f324454a) && Intrinsics.f(this.f324455b, iVar.f324455b) && Intrinsics.f(this.f324456c, iVar.f324456c);
    }

    public final int hashCode() {
        return this.f324456c.hashCode() + p.a.d(this.f324454a.hashCode() * 31, 31, this.f324455b);
    }
}

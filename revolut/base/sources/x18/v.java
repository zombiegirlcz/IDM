package x18;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f302345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f302346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f302347c;

    public v(ArrayList items, List menuItems, List filters) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f302345a = menuItems;
        this.f302346b = filters;
        this.f302347c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f302347c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f302345a, vVar.f302345a) && Intrinsics.f(this.f302346b, vVar.f302346b) && this.f302347c.equals(vVar.f302347c);
    }

    public final int hashCode() {
        return this.f302347c.hashCode() + p.a.d(this.f302345a.hashCode() * 31, 31, this.f302346b);
    }
}

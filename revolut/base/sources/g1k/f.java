package g1k;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f139692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f139693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f139694c;

    public f(ArrayList items, List menuItems, List filters) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f139692a = menuItems;
        this.f139693b = filters;
        this.f139694c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f139694c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f139692a, fVar.f139692a) && Intrinsics.f(this.f139693b, fVar.f139693b) && this.f139694c.equals(fVar.f139694c);
    }

    public final int hashCode() {
        return this.f139694c.hashCode() + p.a.d(this.f139692a.hashCode() * 31, 31, this.f139693b);
    }
}

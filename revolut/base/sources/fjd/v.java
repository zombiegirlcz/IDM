package fjd;

import com.revolut.feature.shops.api.model.ShopsCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f135595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f135596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f135597c;
    public final ShopsCategory d;

    public v(ArrayList items, List menuItems, List tabs, ShopsCategory shopsCategory) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f135595a = items;
        this.f135596b = menuItems;
        this.f135597c = tabs;
        this.d = shopsCategory;
    }

    @Override // cli.p
    public final List c() {
        return this.f135595a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f135595a.equals(vVar.f135595a) && Intrinsics.f(this.f135596b, vVar.f135596b) && Intrinsics.f(this.f135597c, vVar.f135597c) && Intrinsics.f(this.d, vVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(this.f135595a.hashCode() * 31, 31, this.f135596b), 31, this.f135597c);
        ShopsCategory shopsCategory = this.d;
        return iD + (shopsCategory == null ? 0 : shopsCategory.hashCode());
    }
}

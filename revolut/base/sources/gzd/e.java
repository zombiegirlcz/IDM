package gzd;

import cli.j;
import com.revolut.feature.statements.api.models.SelectableOption;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f148053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f148054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f148055c;

    public e(List categories, Set selectedCategories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        this.f148053a = categories;
        this.f148054b = selectedCategories;
        List list = categories;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (!this.f148054b.contains(((SelectableOption) it8.next()).getType())) {
                    z = false;
                    break;
                }
            }
        }
        this.f148055c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f148053a, eVar.f148053a) && Intrinsics.f(this.f148054b, eVar.f148054b);
    }

    public final int hashCode() {
        return this.f148054b.hashCode() + (this.f148053a.hashCode() * 31);
    }
}

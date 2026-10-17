package je1;

import aii.r;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CatalogueCategory f173175a;

    public g(CatalogueCategory category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f173175a = category;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f173175a, ((g) obj2).f173175a);
    }

    public final int hashCode() {
        return this.f173175a.hashCode();
    }
}

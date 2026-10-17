package td1;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CatalogueCategory f269911a;

    public d(CatalogueCategory category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f269911a = category;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f269911a, ((d) obj2).f269911a);
    }

    public final int hashCode() {
        return this.f269911a.hashCode();
    }
}
